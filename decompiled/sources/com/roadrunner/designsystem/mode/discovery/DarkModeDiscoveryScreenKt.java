package com.roadrunner.designsystem.mode.discovery;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import coil3.ExtrasKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.huawei.hms.location.ActivityIdentificationData;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.ColorModel;
import o.StrokeJoinCompanion;
import o.UiMediaScopeImpl;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCmykxdoWZVw;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPostalCode;
import o.getPushDeliveryManagerandroid_sdk_base_release;
import o.getTopLeftannotations;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DarkModeDiscoveryScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer;
    public static final getTopLeftannotations write;

    static {
        float f = Dimensions.read;
        write = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.getAnimatedVisibility);
        int i = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void AppearanceSwitchAnimation(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2007165713);
        int i3 = i | 6;
        if (getpostalcode.write(i3 & 1, (i3 & 3) != 2)) {
            modifier = Modifier.Companion;
            ColorModel.read((StrokeJoinCompanion) RememberLottieCompositionKt.IconCompatParcelizer(new getCmykxdoWZVw(R.raw.rider_app_appearance_switch), getpostalcode).getValue(), SizeKt.m83size3ABfNKs(modifier, Dp.m3673constructorimpl(200.0f)), Integer.MAX_VALUE, false, null, null, getpostalcode, 1572864, 0, 0, 4194236);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i4 = read + 37;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 14);
            int i6 = read + 11;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    public static final void RemoteActionCompatParcelizer(String str, String str2, String str3, String str4, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(531117792);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(str3)) {
                int i6 = read + 33;
                int i7 = i6 % Fields.SpotShadowColor;
                serializer = i7;
                i4 = i6 % 2 != 0 ? 8439 : Fields.RotationX;
                int i8 = i7 + 77;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(str4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = serializer + 55;
                read = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? ActivityIdentificationData.RUNNING : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RenderEffect : 65536;
        }
        int i11 = i2 | 1572864;
        if (getpostalcode.write(i11 & 1, (599187 & i11) != 599186)) {
            Modifier.Companion companion = Modifier.Companion;
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(companion, 1.0f), write, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, Dimensions.getTabContainer, null, ExtrasKt.write(-1353118619, new getPushDeliveryManagerandroid_sdk_base_release(str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), getpostalcode, 12582960, 88);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(str, str2, str3, str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i, 9);
        }
    }
}
