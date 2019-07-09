package com.atguigu.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.movie.MovieService;
import com.atguigu.gmall.user.Movie;



@Service
public class MovieServiceImp implements MovieService {

    @Override
    public Movie getMovie(String id) {
        Movie move1 = new Movie("1", "西游记1");
        Movie move2 = new Movie("2", "西游记2");
        Movie move3 = new Movie("3", "西游记3");
        Movie move4 = new Movie("4", "西游记4");
        if(id.equals("1")){
            return move1;
        }else if(id.equals("2")){
            return move2;
        }else if(id.equals("3")){
            return move3;
        }else if(id.equals("4")){
            return move4;
        }else {
            return null;
        }

    }
}
