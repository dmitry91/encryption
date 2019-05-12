package com.encryption.encryption.entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {

    private String text;

    public Data() {
    }

    public Data(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Data{" +
                "text='" + text + '\'' +
                '}';
    }
}
