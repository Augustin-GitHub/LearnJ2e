package com.LearnJ2E;

import com.fasterxml.jackson.annotation.*;

public class OtherChoice {
    private String name;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }
}
