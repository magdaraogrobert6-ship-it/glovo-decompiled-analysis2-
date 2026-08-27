package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FwFDataQueriesdeleteItem1 {
    public static CustomerChatModulestartChat2 read(int i, getNetworkModule getnetworkmodule) {
        CustomerChatModulestartChat2 getfinancial;
        if (getnetworkmodule.write(TranslationsENABLEDCompanion.read)) {
            getfinancial = new Contact();
        } else {
            if (!getnetworkmodule.write(TranslationsENABLEDCompanion.MediaSessionCompatQueueItem)) {
                Gson$$ExternalSyntheticBUOutline0.m(getnetworkmodule, "unrecognized digest OID: ");
                return null;
            }
            getfinancial = new getFinancial(androidx.compose.ui.graphics.Fields.RotationX);
        }
        return (TranslationsENABLEDCompanion.MediaSessionCompatQueueItem.write(getnetworkmodule) || getfinancial.RemoteActionCompatParcelizer() != i) ? new getHoldouts(i, getfinancial) : getfinancial;
    }

    public static int IconCompatParcelizer(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static void write(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int write(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2 = ApproachMeasureScope.read(obj);
        int i3 = i2 & i;
        int iIconCompatParcelizer = IconCompatParcelizer(i3, obj3);
        if (iIconCompatParcelizer != 0) {
            int i4 = ~i;
            int i5 = -1;
            while (true) {
                int i6 = iIconCompatParcelizer - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i4) != (i2 & i4) || !FeatureFlagProvider.write(obj, objArr[i6]) || (objArr2 != null && !FeatureFlagProvider.write(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iIconCompatParcelizer = i8;
                } else {
                    if (i5 == -1) {
                        write(i3, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = (iArr[i5] & i4) | (i8 & i);
                    return i6;
                }
            }
        }
        return -1;
    }

    public static Object IconCompatParcelizer(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        if (i <= 65536) {
            return new short[i];
        }
        return new int[i];
    }
}
