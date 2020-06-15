package com.github.blog.post.comment.dto.command;

import javax.validation.constraints.NotBlank;

public class CommentUpdateCommand {
    public String getText() {
        return text;
    }

    public CommentUpdateCommand setText(String text) {
        this.text = text;
        return this;
    }

    @NotBlank
    private String text;
}
