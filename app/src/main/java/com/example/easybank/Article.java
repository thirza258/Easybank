package com.example.easybank;

public class Article {
    private int ImageView;
    private String author;
    private int headline;
    private int desc;

    public Article(int imageView, String author, int headline, int desc) {
        ImageView = imageView;
        this.author = author;
        this.headline = headline;
        this.desc = desc;
    }

    public int getImageView() {
        return ImageView;
    }

    public void setImageView(int imageView) {
        ImageView = imageView;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getHeadline() {
        return headline;
    }

    public void setHeadline(int headline) {
        this.headline = headline;
    }

    public int getDesc() {
        return desc;
    }

    public void setDesc(int desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ImageView=" + ImageView +
                ", author='" + author + '\'' +
                ", headline='" + headline + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

}
