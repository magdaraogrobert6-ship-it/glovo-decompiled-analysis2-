package o;

import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.compose.CustomerUnavailableStepComposableKt;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransitionComposeAnimation_androidKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    public static final void read(r8lambdakX1auGmjk4nKnxFqVYyTYqzkc r8lambdakx1augmjk4nknxfqvyytyqzkc, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, androidx.compose.ui.Modifier modifier, Integer num, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        androidx.compose.ui.Modifier modifier2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambdakx1augmjk4nknxfqvyytyqzkc.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-211710060);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(r8lambdakx1augmjk4nknxfqvyytyqzkc) : getpostalcode2.IconCompatParcelizer(r8lambdakx1augmjk4nknxfqvyytyqzkc) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.write(z)) {
                int i7 = IconCompatParcelizer + 83;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i7 % 2 == 0 ? 54 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            int i8 = IconCompatParcelizer + 79;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.write(z2) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = RemoteActionCompatParcelizer + 91;
            IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i & 3072) == 0) {
            int i12 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i14 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i4 = androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i16 = RemoteActionCompatParcelizer + 91;
            IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i17 = IconCompatParcelizer + 95;
            RemoteActionCompatParcelizer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                int i18 = 25 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = androidx.compose.ui.graphics.Fields.RenderEffect;
                } else {
                    i3 = 65536;
                }
            } else if (!getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i3 = 65536;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.RenderEffect;
            }
            i2 |= i3;
        }
        int i19 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            int i20 = IconCompatParcelizer + 51;
            RemoteActionCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i20 % 2 == 0) {
                getpostalcode2.read(num);
                obj.hashCode();
                throw null;
            }
            i19 |= getpostalcode2.read(num) ? 8388608 : 4194304;
        }
        int i21 = i19;
        if (getpostalcode2.write(i21 & 1, (4793491 & i21) != 4793490)) {
            modifier2 = androidx.compose.ui.Modifier.Companion;
            fieldToDouble fieldtodouble = (z && z2) ? fieldToDouble.Complete : fieldToDouble.Active;
            int i22 = RemoteActionCompatParcelizer + 61;
            IconCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i23 = i22 % 2;
            getpostalcode = getpostalcode2;
            CustomerUnavailableStepComposableKt.CustomerUnavailableStepComposable(fieldtodouble, coil3.ExtrasKt.write(70828467, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0((Object) r8lambdakx1augmjk4nknxfqvyytyqzkc, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 7), getpostalcode2), modifier2, r8lambdakx1augmjk4nknxfqvyytyqzkc.customerTitle, null, num, false, getpostalcode, ((i21 >> 12) & 896) | 48 | (458752 & (i21 >> 6)), 80);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isEqualHuaweiReferrerAppGalleryDetails(r8lambdakx1augmjk4nknxfqvyytyqzkc, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, num, i);
        }
    }
}
