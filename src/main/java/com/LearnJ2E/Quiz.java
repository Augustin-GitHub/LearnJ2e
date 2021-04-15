package com.LearnJ2E;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Quiz {
    private long id;
    private String langue;
    private String categorie;
    private String theme;
    private String difficulte;
    private String question;
    private String reponseCorrecte;
    private List<OtherChoice> otherChoices;
    private String anecdote;
    private String wikipedia;

    @JsonProperty("id")
    public long getID() { return id; }
    @JsonProperty("id")
    public void setID(long value) { this.id = value; }

    @JsonProperty("langue")
    public String getLangue() { return langue; }
    @JsonProperty("langue")
    public void setLangue(String value) { this.langue = value; }

    @JsonProperty("categorie")
    public String getCategorie() { return categorie; }
    @JsonProperty("categorie")
    public void setCategorie(String value) { this.categorie = value; }

    @JsonProperty("theme")
    public String getTheme() { return theme; }
    @JsonProperty("theme")
    public void setTheme(String value) { this.theme = value; }

    @JsonProperty("difficulte")
    public String getDifficulte() { return difficulte; }
    @JsonProperty("difficulte")
    public void setDifficulte(String value) { this.difficulte = value; }

    @JsonProperty("question")
    public String getQuestion() { return question; }
    @JsonProperty("question")
    public void setQuestion(String value) { this.question = value; }

    @JsonProperty("reponse_correcte")
    public String getReponseCorrecte() { return reponseCorrecte; }
    @JsonProperty("reponse_correcte")
    public void setReponseCorrecte(String value) { this.reponseCorrecte = value; }

    @JsonProperty("other_choices")
    public List<OtherChoice> getOtherChoices() { return otherChoices; }
    @JsonProperty("other_choices")
    public void setOtherChoices(List<OtherChoice> value) { this.otherChoices = value; }

    @JsonProperty("anecdote")
    public String getAnecdote() { return anecdote; }
    @JsonProperty("anecdote")
    public void setAnecdote(String value) { this.anecdote = value; }

    @JsonProperty("wikipedia")
    public String getWikipedia() { return wikipedia; }
    @JsonProperty("wikipedia")
    public void setWikipedia(String value) { this.wikipedia = value; }
}