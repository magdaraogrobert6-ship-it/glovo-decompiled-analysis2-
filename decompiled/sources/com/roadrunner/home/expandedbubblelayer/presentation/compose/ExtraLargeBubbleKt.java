package com.roadrunner.home.expandedbubblelayer.presentation.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
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
public abstract class ExtraLargeBubbleKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    public static final void ExtraLargeBubble(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 9;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1197017853);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i7 = IconCompatParcelizer + 11;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            int i8 = RemoteActionCompatParcelizer + 119;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = i;
        }
        int i10 = i2 | 48;
        if (getpostalcode.write(i10 & 1, (i10 & 19) != 18)) {
            modifier = Modifier.Companion;
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(SizeKt.serializer(modifier, (Alignment.Vertical) null, 3), 1.0f), null, 3);
            float f = Dimensions.getActionBarHideOffset;
            getCurrentSessionimpl.read(PaddingKt.write(modifierWrite, f), RoundedCornerShapeKt.IconCompatParcelizer(Dp.m3673constructorimpl(32.0f)), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), getpostalcode, 0), withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(f, 62), null, ExtrasKt.write(-264099503, new FragmentActivity(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 2), getpostalcode), getpostalcode, 196608, 16);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaOFEQQzam8OSGV6dVWUiP57Rv4yo(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier, i, 1);
        }
    }
}
