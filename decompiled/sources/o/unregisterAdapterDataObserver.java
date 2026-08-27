package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class unregisterAdapterDataObserver {
    private static int read = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e A[PHI: r2
  0x004e: PHI (r2v22 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v24 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002d A[PHI: r2
  0x002d: PHI (r2v6 o.getPostalCode) = (r2v5 o.getPostalCode), (r2v24 o.getPostalCode) binds: [B:8:0x002b, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(getItemId getitemid, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        int i4;
        getPostalCode getpostalcode2;
        int i5;
        int i6 = 2 % 2;
        int i7 = read + 101;
        write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-548373939);
            if ((i & 60) == 0) {
                i2 = read + 27;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i8 = 84 / 0;
                    if (getpostalcode.read(getitemid)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                } else if (getpostalcode.read(getitemid)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-548373939);
            if ((i & 6) == 0) {
                i2 = read + 27;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i9 = 84 / 0;
                    if (getpostalcode.read(getitemid)) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                } else if (getpostalcode.read(getitemid)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i10 = read + 119;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        int i12 = i4;
        if (getpostalcode2.write(i12 & 1, (i12 & 19) != 18)) {
            setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode2.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
            settransformq8lpups.IconCompatParcelizer = getitemid.RemoteActionCompatParcelizer;
            LinearGradientShaderVjE6UOUdefault.write(settransformq8lpups);
            androidx.compose.foundation.ImageKt.Image(computeDirection.RemoteActionCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), null, null, getpostalcode2, 0, 30), null, modifier, androidx.compose.ui.Alignment.Companion.getCenter(), getitemid.serializer, 0.0f, null, getpostalcode2, ((i12 << 3) & 896) | 3120, 96);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 12, getitemid, modifier);
        }
    }
}
