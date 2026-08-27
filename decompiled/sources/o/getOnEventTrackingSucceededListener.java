package o;

import com.roadrunner.rrds.compose.component.screenstate.EmptyScreenKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getOnEventTrackingSucceededListener {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final void serializer(int i, int i2, getBirthDateFull getbirthdatefull, androidx.compose.ui.Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        str.getClass();
        str2.getClass();
        str3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2146572836);
        if ((i2 & 6) == 0) {
            int i7 = read + 61;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i3 = (getpostalcode.read(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (getpostalcode.read(str2)) {
                i5 = 32;
            } else {
                int i9 = RemoteActionCompatParcelizer + 65;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 16;
            }
            i3 |= i5;
            int i11 = RemoteActionCompatParcelizer + 111;
            read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i2 & 384) == 0) {
            i3 |= getpostalcode.read(str3) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i13 = RemoteActionCompatParcelizer + 123;
                read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i3 |= i4;
        }
        if ((i2 & 24576) == 0) {
            i3 |= getpostalcode.read(i) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
            int i15 = RemoteActionCompatParcelizer + 3;
            read = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                int i16 = 5 % 3;
            }
        }
        int i17 = i3 | 196608;
        boolean z = false;
        if ((74899 & i17) != 74898) {
            int i18 = RemoteActionCompatParcelizer + 67;
            read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                z = true;
            }
        }
        if (getpostalcode.write(i17 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            EmptyScreenKt.EmptyScreen(new execSessionFailureCallbackCommand(str, str2, new execSessionSuccessCallbackCommand(str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), Integer.valueOf(i)), companion, getpostalcode, (i17 >> 12) & 112);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i19 = RemoteActionCompatParcelizer + 1;
        read = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i19 % 2 != 0) {
            getpostalcode.MediaDescriptionCompat();
            throw null;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaZeww41FyAYboAqgx1AJ5KYAyU(str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, modifier2, i2);
        }
    }
}
