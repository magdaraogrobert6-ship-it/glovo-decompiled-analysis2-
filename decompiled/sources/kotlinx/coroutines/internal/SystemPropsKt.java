package kotlinx.coroutines.internal;

import bo.app.d$$ExternalSyntheticOutline0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class SystemPropsKt {
    public static final int serializer() {
        return SystemPropsKt__SystemPropsKt.write;
    }

    public static final long write(String str, long j, long j2, long j3) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
        if (strRemoteActionCompatParcelizer == null) {
            return j;
        }
        Long lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(strRemoteActionCompatParcelizer);
        if (lParcelableVolumeInfo == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strRemoteActionCompatParcelizer + '\'').toString());
        }
        long jLongValue = lParcelableVolumeInfo.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("System property '", str, j2, "' should be in range ");
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, "..", j3, ", but is '");
        sbM.append(jLongValue);
        sbM.append('\'');
        throw new IllegalStateException(sbM.toString().toString());
    }

    public static int IconCompatParcelizer(int i, int i2, String str) {
        return (int) write(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final String RemoteActionCompatParcelizer(String str) {
        int i = SystemPropsKt__SystemPropsKt.write;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
