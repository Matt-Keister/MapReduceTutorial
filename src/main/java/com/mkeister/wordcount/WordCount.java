package com.mkeister.wordcount;

import org.apache.hadoop.mapred.*;
import org.apache.hadoop.fs.Path;

public class WordCount {
    public static void main(String[] args) {
        JobConf conf = new JobConf(WordCount.class);
        
        System.out.println("hello");
    }
}