package org.example.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Object {
    private long id;

    private String content;

    public Object() {
        // Jackson deserialization
    }

    public Object(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}