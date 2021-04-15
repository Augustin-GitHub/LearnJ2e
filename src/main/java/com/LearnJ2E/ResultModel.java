package com.LearnJ2E;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class ResultModel {
    private long totalQuestions;
    private long statusCode;
    private long numberPage;
    private long page;
    private String user;
    private List<Quiz> quiz;

    @JsonProperty("total_questions")
    public long getTotalQuestions() { return totalQuestions; }
    @JsonProperty("total_questions")
    public void setTotalQuestions(long value) { this.totalQuestions = value; }

    @JsonProperty("status_code")
    public long getStatusCode() { return statusCode; }
    @JsonProperty("status_code")
    public void setStatusCode(long value) { this.statusCode = value; }

    @JsonProperty("number_page")
    public long getNumberPage() { return numberPage; }
    @JsonProperty("number_page")
    public void setNumberPage(long value) { this.numberPage = value; }

    @JsonProperty("page")
    public long getPage() { return page; }
    @JsonProperty("page")
    public void setPage(long value) { this.page = value; }

    @JsonProperty("user")
    public String getUser() { return user; }
    @JsonProperty("user")
    public void setUser(String value) { this.user = value; }

    @JsonProperty("quiz")
    public List<Quiz> getQuiz() { return quiz; }
    @JsonProperty("quiz")
    public void setQuiz(List<Quiz> value) { this.quiz = value; }
}