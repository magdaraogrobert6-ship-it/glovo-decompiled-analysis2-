package com.qualtrics.digital;

/* JADX INFO: loaded from: classes4.dex */
class ActionOptions {
    private String actionSetSampleRate;

    public Double getActionSetSampleRate() {
        String str = this.actionSetSampleRate;
        return str == null ? Double.valueOf(0.0d) : Double.valueOf(Double.parseDouble(str));
    }
}
