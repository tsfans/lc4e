/**
 * Copyright (C) 2020 ~ 2022 Meituan. All Rights Reserved.
 */
package com.github.tsfans.lc4e.parts;

import java.math.BigDecimal;

/**
 * question info bo
 */
public class Question {

    private int id;

    private String title;

    private String description;

    private int difficulty;

    private int status;

    private BigDecimal acceptance;

    private BigDecimal frequency;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the difficulty
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the acceptance
     */
    public BigDecimal getAcceptance() {
        return acceptance;
    }

    /**
     * @param acceptance the acceptance to set
     */
    public void setAcceptance(BigDecimal acceptance) {
        this.acceptance = acceptance;
    }

    /**
     * @return the frequency
     */
    public BigDecimal getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(BigDecimal frequency) {
        this.frequency = frequency;
    }

}
