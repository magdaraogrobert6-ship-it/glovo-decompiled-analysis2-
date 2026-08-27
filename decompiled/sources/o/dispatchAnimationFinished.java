package o;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dispatchAnimationFinished {
    private static int serializer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x0046  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[PHI: r2
  0x0057: PHI (r2v9 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r2
  0x0040: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v11 o.getPostalCode) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(getItemCount getitemcount, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 7;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1536871684);
            if ((i & 67) == 0) {
                if (getpostalcode.IconCompatParcelizer(getitemcount)) {
                    i4 = write + 25;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1536871684);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(getitemcount)) {
                    i4 = write + 25;
                    serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        i2 = 2;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = write + 23;
                serializer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i5 = i8 % 2 == 0 ? 64 : 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        boolean z = true;
        if ((i & 384) == 0) {
            i3 |= !(getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ^ true) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= !getpostalcode.read(modifier) ? 8192 : androidx.compose.ui.graphics.Fields.Clip;
        }
        if ((i3 & 9363) != 9362) {
            int i9 = serializer + 117;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            String str = getitemcount.write;
            str.getClass();
            accessgetXyzcp accessgetxyzcpIconCompatParcelizer = com.airbnb.lottie.compose.RememberLottieCompositionKt.IconCompatParcelizer(new getLabxdoWZVw(str), getpostalcode);
            if (((Boolean) accessgetxyzcpIconCompatParcelizer.read.getValue()).booleanValue()) {
                getpostalcode.serializer(-592483701);
                getpostalcode.IconCompatParcelizer(false);
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke((Throwable) ((onShowTranslationui) accessgetxyzcpIconCompatParcelizer.serializer).getValue(), getitemcount);
            } else {
                getpostalcode.serializer(-592381928);
                if (((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue()) != null) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1.invoke();
                }
                ColorModel.read((StrokeJoinCompanion) accessgetxyzcpIconCompatParcelizer.getValue(), modifier, 0, false, androidx.compose.ui.layout.ContentScale.Companion.getCrop(), (Map) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke(), getpostalcode, (i3 >> 9) & 112, 1572864, 0, 3604476);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(getitemcount, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 2);
        }
    }
}
