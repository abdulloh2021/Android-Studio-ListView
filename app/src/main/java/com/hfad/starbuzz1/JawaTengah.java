package com.hfad.starbuzz1;

public class JawaTengah {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final JawaTengah[] jawaTengahs = {
            new JawaTengah("Klaten", "Nama Bupati : Sri Mulyani",
                    R.drawable.klaten),
            new JawaTengah("Pekalongan", "Nama Bupati : Fadia Arafiq",
                    R.drawable.pekalongan),
            new JawaTengah("Wonogiri", "Nama Bupati : Joko Sutopo",
                    R.drawable.wonogiri)
    };
    //Each Drink has a name, description, and an image resource
    private JawaTengah(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
    public String toString() {
        return this.name;
    }
}
