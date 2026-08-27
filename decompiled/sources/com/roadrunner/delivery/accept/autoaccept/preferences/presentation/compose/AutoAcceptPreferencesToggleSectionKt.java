package com.roadrunner.delivery.accept.autoaccept.preferences.presentation.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.SessionMutex;
import o.SpanStyle;
import o.accessgetReusableRectp;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.performMeasureDjhGOtQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AutoAcceptPreferencesToggleSectionKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 0;
    public static final float read = Dp.m3673constructorimpl(100.0f);
    private static int serializer = 1;
    private static int write = 1;

    static {
        int i = write + 97;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
    }

    public static final void write(SpanStyle spanStyle, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(935193090);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(spanStyle);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(spanStyle);
            }
            i2 = i | (zIconCompatParcelizer ? 4 : 2);
        } else {
            int i5 = RemoteActionCompatParcelizer + 91;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i7 = RemoteActionCompatParcelizer + 21;
                serializer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 29 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i8 = i2 | 384;
        if ((i8 & 147) != 146) {
            int i9 = serializer + 11;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i8 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setChecked);
            SessionMutex sessionMutexSerializer = withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer(), getpostalcode, 0);
            Modifier modifierIconCompatParcelizer = SizeKt.IconCompatParcelizer(SizeKt.write(companion, 1.0f), null, 3);
            float f = Dimensions.setTabContainer;
            getCurrentSessionimpl.read(PaddingKt.m74paddingqDBjuR0$default(PaddingKt.m73paddingVpY3zN4$default(modifierIconCompatParcelizer, f, 0.0f, 2), 0.0f, Dimensions.getAnimatedVisibility, 0.0f, f, 5), gettopleftannotationsIconCompatParcelizer, sessionMutexSerializer, null, null, ExtrasKt.write(-1399553840, new PagerDefaults$$ExternalSyntheticLambda0(spanStyle, 5, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode), getpostalcode, 196608, 24);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 17, modifier2, (Object) spanStyle, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }
}
