package com.refresh.oop.solidprinciples.singleresp.adhering;

/**
 * Created by emmanuel on 10/27/23
 *
 * @author: emmanuel
 * @date: 10/27/23
 * @project: IntelliJ IDEA
 */
public class Investment {
    private String name;
    private String Category;

    public Investment(String name, String category) {
        this.name = name;
        Category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return Category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
