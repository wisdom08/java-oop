package com.wisdom.domain;

public enum STATUS {
    ON("운행중"), OFF("차고지행"), BASIC("일반"), NoOperation("운행불가");

    private final String status;
    STATUS(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
