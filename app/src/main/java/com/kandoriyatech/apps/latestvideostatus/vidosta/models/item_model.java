package com.kandoriyatech.apps.latestvideostatus.vidosta.models;

public class item_model {


    private String head, desc, image_url;


    public item_model(String head, String desc, String image_url) {
        this.head = head;
        this.desc = desc;
        this.image_url = image_url;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }

    public String getImage_url() {
        return image_url;
    }
}

