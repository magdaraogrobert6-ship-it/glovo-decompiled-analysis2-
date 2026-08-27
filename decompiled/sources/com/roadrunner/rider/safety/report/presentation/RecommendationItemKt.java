package com.roadrunner.rider.safety.report.presentation;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import o.buildMapping;
import o.disableAppSetIdReading;
import o.getBirthDateFull;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.p2;
import o.performMeasureDjhGOtQ;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RecommendationItemKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    public static final void RecommendationItem(disableAppSetIdReading disableappsetidreading, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        disableappsetidreading.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1195354169);
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 113;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 8 / 0;
                if (!(!getpostalcode.read(disableappsetidreading))) {
                    i3 = 4;
                }
            } else if (getpostalcode.read(disableappsetidreading)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode.write(i9 & 1, (i9 & 19) != 18)) {
            modifier = Modifier.Companion;
            getCurrentSessionimpl.read(modifier, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.accessensureViewModelStore), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer(), getpostalcode, 0), withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(Dimensions.generateLayoutParams, 62), null, ExtrasKt.write(310577799, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(4, disableappsetidreading), getpostalcode), getpostalcode, ((i9 >> 3) & 14) | 196608, 16);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 26, disableappsetidreading, modifier);
        }
    }
}
