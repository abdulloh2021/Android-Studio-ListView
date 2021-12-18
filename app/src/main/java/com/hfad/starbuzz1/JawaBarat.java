package com.hfad.starbuzz1;

public class JawaBarat {

    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final JawaBarat[] jawaBarats = {
            new JawaBarat("Kota Bandung", "Nama Walikota : Yana Mulyana",
                    R.drawable.bandung),
            new JawaBarat("Kota Bekasi", "Nama Walikota : Rahmat Efendi",
                    R.drawable.bekasi),
            new JawaBarat("Kota Bogor", "Nama Walikota : Bima Arya Sugiarto",
                    R.drawable.bogor)
    };
    //Each Drink has a name, description, and an image resource
    private JawaBarat(String name, String description, int imageResourceId) {
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
