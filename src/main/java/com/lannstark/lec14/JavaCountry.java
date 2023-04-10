package com.lannstark.lec14;

public enum JavaCountry {

    KOREA("KO"),
    AMERICA("US"),
    ;

    private final String code;

    JavaCountry(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    private static void handleCountry(JavaCountry country) {
        if (country == JavaCountry.KOREA) {
            System.out.println("한국");
        }
        if(country == JavaCountry.AMERICA){
            System.out.println("미국");
        }
    
    }
}


