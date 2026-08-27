package o;

import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Util3 {
    private static int IconCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    public static final void serializer(configConnectionForGET configconnectionforget, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1348223116);
        if ((i & 6) == 0) {
            int i9 = write + 91;
            IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                int i10 = 90 / 0;
                if (getpostalcode.read(configconnectionforget)) {
                    i6 = write + 43;
                    IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        i7 = 3;
                    } else {
                        i7 = 4;
                    }
                } else {
                    i7 = 2;
                }
            } else if (getpostalcode.read(configconnectionforget)) {
                i6 = write + 43;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    i7 = 3;
                } else {
                    i7 = 4;
                }
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i11 = IconCompatParcelizer + 61;
                write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i11 % 2 != 0 ? 102 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i12 = write + 11;
                IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i12 % 2 == 0 ? 480 : androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i4 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i13 = write + 103;
            IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode.read(modifier);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.read(modifier)) {
                int i14 = write + 27;
                IconCompatParcelizer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i3 = androidx.compose.ui.graphics.Fields.CameraDistance;
            } else {
                int i16 = write + 37;
                IconCompatParcelizer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i3 = androidx.compose.ui.graphics.Fields.RotationZ;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            SliderButtonContainerKt.read(configconnectionforget, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, null, getpostalcode, i2 & 8190);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) configconnectionforget, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 21);
            int i18 = IconCompatParcelizer + 87;
            write = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i19 = i18 % 2;
        }
    }
}
