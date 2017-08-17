package io.github.thaikotlindev.taskuniverse.data.model;

import java.util.List;

public class Task {

    private String id;
    private String title;
    private String description;
    private String imageUrl;

    private List<String> actionItems;

    public Task(String id, String title, String description, String imageUrl, List<String> actionItems) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.actionItems = actionItems;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getActionItems() {
        return actionItems;
    }

    public void setActionItems(List<String> actionItems) {
        this.actionItems = actionItems;
    }
}
