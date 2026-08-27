package com.google.android.gms.internal.mlkit_vision_face;

import androidx.compose.ui.graphics.Fields;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzna {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    public static final String serializer(String str) {
        Timber.Forest forest;
        String str2;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 43;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (str == null) {
            forest = Timber.RemoteActionCompatParcelizer;
            forest.getClass();
            if (Timber.read.length != 0) {
                int i5 = IconCompatParcelizer + 55;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                forest.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid confirmation status ", str), new Object[0]);
            }
            str2 = null;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -988476804) {
                if (iHashCode != -934396624) {
                    if (iHashCode != 1925735456) {
                        i = read + 123;
                        IconCompatParcelizer = i % Fields.SpotShadowColor;
                        int i7 = i % 2;
                        forest = Timber.RemoteActionCompatParcelizer;
                        forest.getClass();
                        if (Timber.read.length != 0) {
                            int i8 = IconCompatParcelizer + 55;
                            read = i8 % Fields.SpotShadowColor;
                            int i9 = i8 % 2;
                            forest.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid confirmation status ", str), new Object[0]);
                        }
                        str2 = null;
                    } else if (str.equals("dropoff")) {
                        str2 = "Deliveries Drop Off Confirm";
                    } else {
                        forest = Timber.RemoteActionCompatParcelizer;
                        forest.getClass();
                        if (Timber.read.length != 0) {
                            int i10 = IconCompatParcelizer + 55;
                            read = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            forest.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid confirmation status ", str), new Object[0]);
                        }
                        str2 = null;
                    }
                } else if (str.equals("return")) {
                    str2 = "Deliveries Return Confirm";
                } else {
                    forest = Timber.RemoteActionCompatParcelizer;
                    forest.getClass();
                    if (Timber.read.length != 0) {
                        int i12 = IconCompatParcelizer + 55;
                        read = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        forest.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid confirmation status ", str), new Object[0]);
                    }
                    str2 = null;
                }
            } else if (str.equals("pickup")) {
                str2 = "Deliveries Pick Up Confirm";
            } else {
                i = read + 105;
                IconCompatParcelizer = i % Fields.SpotShadowColor;
                int i14 = i % 2;
                forest = Timber.RemoteActionCompatParcelizer;
                forest.getClass();
                if (Timber.read.length != 0) {
                    int i15 = IconCompatParcelizer + 55;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    forest.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Invalid confirmation status ", str), new Object[0]);
                }
                str2 = null;
            }
        }
        return str2 == null ? "" : str2;
    }
}
