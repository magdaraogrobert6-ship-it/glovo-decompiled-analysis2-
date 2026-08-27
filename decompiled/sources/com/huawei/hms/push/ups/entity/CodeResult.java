package com.huawei.hms.push.ups.entity;

/* JADX INFO: loaded from: classes4.dex */
public class CodeResult {
    private int a;
    private String b;

    public String getReason() {
        return this.b;
    }

    public int getReturnCode() {
        return this.a;
    }

    public void setReason(String str) {
        this.b = str;
    }

    public void setReturnCode(int i) {
        this.a = i;
    }

    public CodeResult(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public CodeResult(int i) {
        this.a = i;
    }

    public CodeResult() {
    }
}
