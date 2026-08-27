package com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer;

import androidx.compose.ui.graphics.Fields;
import o.ActivityHandler1;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpVerificationTimerEntity$Companion {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public final setGraphicModalMaxWidthDp serializer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ActivityHandler1 activityHandler1 = ActivityHandler1.write;
        int i4 = read + 99;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return activityHandler1;
    }
}
