package o;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class getCyan0d7_KjU {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final boolean read(Bundle bundle) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 53;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bundle.isEmpty();
        }
        bundle.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Bundle serializer(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Bundle bundle2 = bundle.getBundle(str);
        int i4 = serializer + 65;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 85 / 0;
        }
        return bundle2;
    }

    public static final ArrayList RemoteActionCompatParcelizer(Bundle bundle) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            bundle.getStringArrayList("classes_to_restore");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("classes_to_restore");
        int i3 = serializer + 41;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return stringArrayList;
    }

    public static final boolean IconCompatParcelizer(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        str.getClass();
        boolean zContainsKey = bundle.containsKey(str);
        int i4 = serializer + 103;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return zContainsKey;
        }
        throw null;
    }

    public static final Bundle read(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            accessbootstrapIfNeeded.write(str);
            throw null;
        }
        int i4 = RemoteActionCompatParcelizer;
        int i5 = i4 + 41;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 89;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return bundle2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r4.get(r5) == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r4 = o.getCyan0d7_KjU.serializer + 85;
        r5 = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.getCyan0d7_KjU.RemoteActionCompatParcelizer = r5;
        r4 = r4 % 2;
        r5 = r5 + 75;
        o.getCyan0d7_KjU.serializer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (r4 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean RemoteActionCompatParcelizer(android.os.Bundle r4, java.lang.String r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r5.getClass()
            boolean r1 = r4.containsKey(r5)
            r2 = 0
            if (r1 == 0) goto L3a
            int r1 = o.getCyan0d7_KjU.serializer
            int r1 = r1 + 51
            int r3 = r1 % 128
            o.getCyan0d7_KjU.RemoteActionCompatParcelizer = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            java.lang.Object r4 = r4.get(r5)
            r5 = 31
            int r5 = r5 / r2
            if (r4 != 0) goto L3a
            goto L28
        L22:
            java.lang.Object r4 = r4.get(r5)
            if (r4 != 0) goto L3a
        L28:
            int r4 = o.getCyan0d7_KjU.serializer
            int r4 = r4 + 85
            int r5 = r4 % 128
            o.getCyan0d7_KjU.RemoteActionCompatParcelizer = r5
            int r4 = r4 % r0
            int r5 = r5 + 75
            int r4 = r5 % 128
            o.getCyan0d7_KjU.serializer = r4
            int r5 = r5 % r0
            r4 = 1
            return r4
        L3a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCyan0d7_KjU.RemoteActionCompatParcelizer(android.os.Bundle, java.lang.String):boolean");
    }

    public static final int write(Bundle bundle, String str) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            bundle.getInt(str, Integer.MIN_VALUE);
            throw null;
        }
        int i3 = bundle.getInt(str, Integer.MIN_VALUE);
        if (i3 == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            accessbootstrapIfNeeded.write(str);
            throw null;
        }
        int i4 = RemoteActionCompatParcelizer + 125;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return i3;
        }
        obj.hashCode();
        throw null;
    }

    public static final safeSetClipToOutline serializer(Bundle bundle) {
        int i = 2 % 2;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline(bundle.size());
        for (String str : bundle.keySet()) {
            int i2 = serializer + 87;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            str.getClass();
            safesetcliptooutline.put(str, bundle.get(str));
            int i4 = RemoteActionCompatParcelizer + 107;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        return safesetcliptooutline.IconCompatParcelizer();
    }

    public static final void IconCompatParcelizer(schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_release, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4 = 2 % 2;
        schedulepushdeliveryandroid_sdk_base_release.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-182916191);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(schedulepushdeliveryandroid_sdk_base_release) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i5 = RemoteActionCompatParcelizer + 13;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 15 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            int i6 = RemoteActionCompatParcelizer + 51;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 256 : androidx.compose.ui.graphics.Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1) ? 2048 : androidx.compose.ui.graphics.Fields.RotationZ;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            int i8 = serializer + 77;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = false;
        }
        if (!getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            getQueryContext getquerycontext = ((setRegistrationDataProviderandroid_sdk_base_release) schedulepushdeliveryandroid_sdk_base_release).read;
            boolean z4 = (i2 & 7168) == 2048;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(context);
            if ((i2 & 896) == 256) {
                int i10 = serializer + 45;
                RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i2 & 112) == 32) {
                int i12 = serializer + 87;
                RemoteActionCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!(!(z4 | zIconCompatParcelizer | z2 | z3)) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new NavControllerImpl$$ExternalSyntheticLambda0(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, context, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 19);
                getpostalcode.write(objComponentActivity);
            }
            androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdatwlPMTrSrus3A7UmaCID8_1F1M(schedulepushdeliveryandroid_sdk_base_release, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, i, 5);
        }
    }
}
