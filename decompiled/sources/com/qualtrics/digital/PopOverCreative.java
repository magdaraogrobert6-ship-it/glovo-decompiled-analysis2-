package com.qualtrics.digital;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class PopOverCreative extends Creative {
    PopOverCreativeDefinition CreativeDefinition;

    @Override // com.qualtrics.digital.Creative
    public CreativeType getCreativeType() {
        return CreativeType.MobilePopOver;
    }

    @Override // com.qualtrics.digital.Creative
    public boolean display(Context context, String str, String str2, String str3, String str4, int i, String str5, String str6, Map<String, String> map, boolean z) {
        if (context == null) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) QualtricsPopOverActivity.class);
        intent.putExtra("creative", new Gson().toJson(this));
        intent.putExtra("url", str);
        intent.putExtra("interceptID", str2);
        intent.putExtra("creativeID", str3);
        intent.putExtra("actionSetID", str4);
        intent.putExtra("layoutFlags", i);
        intent.putExtra("autoCloseAtEndOfSurvey", z);
        if (context instanceof Application) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
        return true;
    }
}
