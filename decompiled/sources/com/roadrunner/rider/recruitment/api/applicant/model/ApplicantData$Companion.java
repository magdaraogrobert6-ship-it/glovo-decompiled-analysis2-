package com.roadrunner.rider.recruitment.api.applicant.model;

import androidx.compose.ui.graphics.Fields;
import o.ActivityHandler51;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicantData$Companion {
    private static int read = 1;
    private static int write;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = read + 117;
        write = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ActivityHandler51 activityHandler51 = ActivityHandler51.serializer;
            obj.hashCode();
            throw null;
        }
        ActivityHandler51 activityHandler52 = ActivityHandler51.serializer;
        int i3 = read + 63;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return activityHandler52;
        }
        obj.hashCode();
        throw null;
    }
}
