package com.qualtrics.digital;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
abstract class Creative {
    String surveyUrl;

    public abstract boolean display(Context context, String str, String str2, String str3, String str4, int i, String str5, String str6, Map<String, String> map, boolean z);

    public abstract CreativeType getCreativeType();

    public String getSurveyUrl() {
        return this.surveyUrl;
    }

    public void setSurveyUrl(String str) {
        this.surveyUrl = str;
    }
}
