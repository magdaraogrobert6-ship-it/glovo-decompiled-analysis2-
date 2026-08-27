package o;

import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getDp {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static final void RemoteActionCompatParcelizer(String str, ComposeAnimationState composeAnimationState, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        boolean z;
        androidx.compose.ui.Modifier modifier2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        androidx.compose.ui.Modifier modifier3;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        composeAnimationState.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-795182269);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                zIconCompatParcelizer = getpostalcode.read(composeAnimationState);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(composeAnimationState);
                int i6 = read + 53;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            if (zIconCompatParcelizer) {
                int i8 = read + 19;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 102 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i9 = read + 69;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ^ true) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        }
        int i11 = i2 | 3072;
        if ((i & 24576) == 0) {
            i11 = i2 | 11264;
        }
        if ((i11 & 9363) != 9362) {
            int i12 = IconCompatParcelizer + 45;
            read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            int i14 = IconCompatParcelizer + 125;
            read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                modifier3 = androidx.compose.ui.Modifier.Companion;
                i3 = (-57345) & i11;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                i3 = i11 & (-57345);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, new androidx.compose.ui.window.DialogProperties(true, true, false), coil3.ExtrasKt.write(294185036, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0((Object) modifier3, (Object) str, (Object) composeAnimationState, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, 8), getpostalcode), getpostalcode, ((i3 >> 6) & 14) | 432, 0);
            modifier2 = modifier3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(i, 22, modifier2, str, composeAnimationState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
        }
    }
}
