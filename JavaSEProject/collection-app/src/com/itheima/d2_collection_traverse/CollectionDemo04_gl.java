/*
 * @Description:完成电影信息的展示。
 * @Update:
 * @UpdateRemark:
 */
package com.itheima.d2_collection_traverse;

import com.itheima.d2_collection_traverse.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author GaoL
 * @version 1.0
 * @date 2024/01/03
 * @copyright Copyright (c) 2012 Company: AVICIT Co., Ltd
 */
public class CollectionDemo04_gl {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList<>();
        movies.add( new Movie("《肖生克的救赎》" , 9.7 ,  "罗宾斯"));
        movies.add( new Movie("《霸王别姬》" , 9.6 ,  "张国荣、张丰毅"));
        movies.add( new Movie("《阿甘正传》" , 9.5 ,  "汤姆.汉克斯"));
//        System.out.println(movies);

//        Iterator<Movie> iterator = movies.iterator();
//        while (iterator.hasNext()) {
//            Movie movie = iterator.next();
//            System.out.println(movie);
//        }

//        for (Movie movie : movies) {
//            System.out.println(movie);
//        }

//        movies.forEach(new Consumer<Movie>() {
//            @Override
//            public void accept(Movie movie) {
//                System.out.println(movie);
//            }
//        });

        movies.forEach(System.out::println);
    }
}
