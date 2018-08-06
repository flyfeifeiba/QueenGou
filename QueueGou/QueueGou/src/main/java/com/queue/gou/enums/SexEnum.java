package com.queue.gou.enums;

public enum SexEnum {
    SEX_MALE(0, "男性"),
    SEX_FEMALE(1, "女性"),
    SEX_MIDDLE(2, "中性");

    private int code;
    private String name;

    SexEnum(int code, String desc) {
        this.code = code;
        this.name = desc;
    }

    public static SexEnum parse(int code) {
        for (SexEnum resultCode : SexEnum.values()) {
            if (resultCode.getCode() == code) {
                return resultCode;
            }
        }
        return null;
    }

    public boolean isThis(int code) {
        return getCode() == code;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

}
