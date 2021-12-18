package com.hfad.starbuzz1;

public class JawaTimur {
    private String name;
    private String description;
    private int imageResourceId;
    //drinks is an array of Drinks
    public static final JawaTimur[] jawaTimurs = {
            new JawaTimur("Gersik", "Nama Bupati : Fandi Akhmad Yani",
                    R.drawable.gersik),
            new JawaTimur("Banyuwangi", "Nama Bupati : Ipuk Fiestiandani",
                    R.drawable.banyuwangi),
            new JawaTimur("Bojonegoro", "Nama Bupati : Anna Mu'awanah",
                    R.drawable.bojonegoro)
    };
    //Each Drink has a name, description, and an image resource
    private JawaTimur(String name, String description, int imageResourceId) {
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
