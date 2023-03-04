package sn.grimykl.invoise.entity;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int totalNumber;
    private String type;
    private String mainActor;
    private final List<String> otherActors = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public List<String> getOtherActors() {
        return otherActors;
    }

    public Movie(String title, int totalNumber, String type, String mainActor) {
        this.title = title;
        this.totalNumber = totalNumber;
        this.type = type;
        this.mainActor = mainActor;
    }
}
