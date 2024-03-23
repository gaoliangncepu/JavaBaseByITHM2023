/*
 * @Description:模拟斗地主建牌、洗牌、发牌
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d3_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/14
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class Room_gl {
    private List<Card> cards = null;

    public Room_gl() {
        cards = build();
    }

    /**
     * 开一个房间，新建一副牌
     */
    private static List<Card> build() {
        //1.建出54张牌，存入List
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠", "♥", "♣", "♦"};
        List<Card> allCards = new ArrayList<>();
        int size = 0;//同一花色大小一样

        for (int i = 0; i < numbers.length; i++) {
            // numbers[i] = 3  4  5  6 ... A 2
            String number = numbers[i];
            size++;

            for (int j = 0; j < colors.length; j++) {
                String color = colors[j];
                Card card = new Card(number, color, size);
                allCards.add(card);
            }
        }

        // 单独存入大小王
        Card card1 = new Card("", "🃏", ++size);
        Card card2 = new Card("", "👲", ++size);
        Collections.addAll(allCards, card1, card2);
        System.out.println("一副新牌：" + allCards);

        return allCards;
    }

    /**
     * 开始一局游戏
     */
    public void start() {
        // 洗牌
        Collections.shuffle(cards);
        System.out.println("洗牌后：" + cards);

        // 创建3个用户玩家，向玩家发牌
        List<Card> zsCards = new ArrayList<>();
        List<Card> lsCards = new ArrayList<>();
        List<Card> wwCards = new ArrayList<>();

        // 发牌：按顺序依次将洗好的牌发给3位玩家
        // 注意集合并发修改异常
        for (int i = cards.size()-3-1; i >= 0 ; i--) {
            //i = 0 1 2 3 4 ... 51
            switch (i % 3) {
            case 0:
                zsCards.add(cards.remove(i));
            	break;
            case 1:
                lsCards.add(cards.remove(i));
                break;
            case 2:
                wwCards.add(cards.remove(i));
                break;
            }
        }

        // 玩家自己整理牌
        sortCards(zsCards);
        sortCards(lsCards);
        sortCards(wwCards);

        // 看牌
        System.out.println("张三：" + zsCards);
        System.out.println("李四：" + lsCards);
        System.out.println("王五：" + wwCards);
        System.out.println("底牌：" + cards);
        wwCards.addAll(cards);
        System.out.println("王五抢得地主后：" + wwCards);
    }

    private void sortCards(List<Card> lsCards) {
        Collections.sort(lsCards, (s1, s2) -> s1.getSize() - s2.getSize());
    }
}
