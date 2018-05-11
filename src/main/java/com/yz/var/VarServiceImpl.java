package com.yz.var;

public class VarServiceImpl implements VarService {

    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void init() {
        System.out.println(url);
    }
}
