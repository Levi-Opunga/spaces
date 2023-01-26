package com.example.application.models;

import java.util.Date;

/**
 * @author Levi Opunga
 */
public class Note {
    private String content;
    private String title;

    private Date created;

    private Date updated;

    Priority priority;
        enum Priority{
        HIGH,
        MEDIUM,
        LOW;

        Priority() {
        }
    }
    /**
     * Constructor to update Note
     *
     * @param content
     * @param title
     * @param priority
     * @param updated
     */
    public Note(String content, String title,Priority priority, Date updated) {
        this.content = content;
        this.title = title;
        this.priority = priority;
        this.updated = updated;
    }

    public Note() {
    }

    /**
     * Constructor to create note
     *
     * @param content
     * @param title
     * @param created
     * @param updated
     * @param priority
     */
    public Note(String content, String title, Date created, Date updated, String priority) {
        this.content = content;
        this.title = title;
        this.created = created;
        this.updated = updated;
        this.priority = Priority.valueOf(priority);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
