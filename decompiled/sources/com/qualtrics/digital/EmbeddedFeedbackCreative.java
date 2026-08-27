package com.qualtrics.digital;

import android.content.Context;
import android.content.Intent;
import com.google.gson.Gson;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class EmbeddedFeedbackCreative extends Creative {
    EmbeddedFeedbackCreativeDefinition CreativeDefinition;

    @Override // com.qualtrics.digital.Creative
    public CreativeType getCreativeType() {
        return CreativeType.MobileEmbeddedFeedback;
    }

    @Override // com.qualtrics.digital.Creative
    public boolean display(Context context, String str, String str2, String str3, String str4, int i, String str5, String str6, Map<String, String> map, boolean z) {
        Intent intent = new Intent(context, (Class<?>) QualtricsEmbeddedFeedbackActivity.class);
        intent.putExtra("CREATIVE", new Gson().toJson(this));
        intent.putExtra("SURVEY_ID", str5);
        intent.putExtra("INTERCEPT_ID", str2);
        intent.putExtra("ACTION_SET_ID", str4);
        intent.putExtra("CREATIVE_ID", str3);
        intent.putExtra("BASE_URL", str6);
        intent.putExtra("EMBEDDED_DATA", (Serializable) map);
        context.startActivity(intent);
        return true;
    }
}
