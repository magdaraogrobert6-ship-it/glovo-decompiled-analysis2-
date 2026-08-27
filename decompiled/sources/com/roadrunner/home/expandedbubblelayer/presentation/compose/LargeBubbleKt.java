package com.roadrunner.home.expandedbubblelayer.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.FragmentActivity;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LargeBubbleKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[PHI: r3
  0x004a: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r3
  0x0032: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void LargeBubble(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        boolean z;
        Modifier modifier2;
        int i5 = 2 % 2;
        int i6 = serializer + 83;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1033769177);
            if ((i & 118) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                    i3 = 4;
                } else {
                    i2 = serializer + 97;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i7 = 5 / 3;
                    }
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1033769177);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                    i3 = 4;
                } else {
                    i2 = serializer + 97;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i8 = 5 / 3;
                    }
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        int i9 = i4 | 48;
        if ((i9 & 19) != 18) {
            int i10 = serializer + 69;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            modifier2 = Modifier.Companion;
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(SizeKt.m75height3ABfNKs(modifier2, Dp.m3673constructorimpl(86.0f)), 1.0f), null, 3);
            float f = Dimensions.getActionBarHideOffset;
            getCurrentSessionimpl.read(PaddingKt.write(modifierWrite, f), RoundedCornerShapeKt.IconCompatParcelizer(Dp.m3673constructorimpl(32.0f)), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), getpostalcode, 0), withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(f, 62), null, ExtrasKt.write(-1487819097, new FragmentActivity(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 0), getpostalcode), getpostalcode, 196608, 16);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier2, i, 0);
        }
    }
}
