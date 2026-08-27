package o;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class scroll {
    private static int serializer = 1;
    private static int write;

    public static Object[] serializer(int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = serializer + 77;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        int i5 = i3 % 2;
        if (objArr.length < i) {
            int i6 = i4 + 71;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            int i8 = i4 + 23;
            int i9 = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            serializer = i9;
            if (i8 % 2 == 0) {
                objArr[i] = null;
                int i10 = 82 / 0;
            } else {
                objArr[i] = null;
            }
            int i11 = i9 + 89;
            write = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        return objArr;
    }

    public static final void serializer(WrapPreviewlambda0 wrapPreviewlambda0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        wrapPreviewlambda0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1535220924);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(wrapPreviewlambda0);
            } else {
                int i4 = write + 39;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    zIconCompatParcelizer = getpostalcode2.read(wrapPreviewlambda0);
                    int i5 = 39 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode2.read(wrapPreviewlambda0);
                }
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            int i6 = serializer + 103;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = i;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 3) != 2)) {
            String str = wrapPreviewlambda0.serializer;
            if (str == null) {
                getpostalcode2.serializer(1340261970);
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(1340261971);
                androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(wrapPreviewlambda0, i, 21);
        }
    }
}
