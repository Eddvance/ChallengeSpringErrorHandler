package io.eddvance.practice.challenge.controller_spring_boot_2;

public class GenMessageErrorSpringBoot2 {

    private int errorCode;
    private String errorMessage;
    private String moreInfo;

    public GenMessageErrorSpringBoot2(int errorCode, String errorMessage, String moreInfo) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.moreInfo = moreInfo;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }
}