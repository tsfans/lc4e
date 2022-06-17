/**
 * Copyright (C) 2020 ~ 2022 Meituan. All Rights Reserved.
 */
package com.github.tsfans.lc4e.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.github.tsfans.lc4e.parts.Question;

/**
 * query dropdown menu
 */
public class DataFetcher {

    public static List<String> categoryMenu() {
        List<String> category = new ArrayList<>();
        category.add("Algorithms");
        category.add("Database");
        category.add("Shell");
        category.add("Concurrency");
        return category;
    }

    public static List<String> listsMenu() {
        List<String> lists = new ArrayList<>();
        lists.add("TOP Liked Questions");
        lists.add("TOP Interview Questions");
        return lists;
    }

    public static List<String> difficultyMenu() {
        List<String> difficulty = new ArrayList<>();
        difficulty.add("Easy");
        difficulty.add("Medium");
        difficulty.add("Hard");
        return difficulty;
    }

    public static List<String> statusMenu() {
        List<String> status = new ArrayList<>();
        status.add("Todo");
        status.add("Solved");
        status.add("Attempted");
        return status;
    }

    public static List<String> tagsMenu() {
        List<String> tags = new ArrayList<>();
        tags.add("Array");
        tags.add("Linked List");
        tags.add("Hash Table");
        tags.add("Two Pointer");
        tags.add("BFS");
        tags.add("DFS");
        tags.add("Graph");
        return tags;
    }

    public static List<String> columnHeaders() {
        List<String> headers = new ArrayList<>();
        headers.add("Status");
        headers.add("Title");
        headers.add("Acceptance");
        headers.add("Difficulty");
        headers.add("Frequency");
        return headers;
    }

    public static List<Question> questions() {
        List<Question> questions = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Question q = new Question();
            q.setId(i);
            q.setTitle("Question-" + i);
            q.setDescription("this is question " + i);
            q.setStatus(i % 3);
            q.setDifficulty((i + 1) % 3);
            q.setAcceptance(new BigDecimal(i));
            q.setFrequency(new BigDecimal(i));
            questions.add(q);
        }
        return questions;
    }

}
