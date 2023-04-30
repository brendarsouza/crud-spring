package com.brenda.enums;

public enum Category {
    BACKEND("BackEnd"), FRONTEND("FrontEnd");
    private String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
