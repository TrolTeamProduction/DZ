package com.trolteamproduction.funnyjeka.dz;


public class Shpora {
    private String subject;
    private String data;
    private String topic;
    private String descriptions;
    private String price;
    private String count;
    private String hash_key;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Shpora(String subject, String data, String topic, String descriptions, String status, String price, String count, String hash_key) {
        this.subject = subject;
        this.data = data;
        this.topic = topic;
        this.descriptions = descriptions;
        this.price = price;
        this.count = count;
        this.hash_key = hash_key;
        this.status = status;
    }

    public Shpora() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getHash_key() {
        return hash_key;
    }

    public void setHash_key(String hash_key) {
        this.hash_key = hash_key;
    }

}
