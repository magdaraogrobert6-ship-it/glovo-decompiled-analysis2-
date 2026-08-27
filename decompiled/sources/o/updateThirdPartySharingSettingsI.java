package o;

/* JADX INFO: loaded from: classes3.dex */
public final class updateThirdPartySharingSettingsI {
    private static int read = 0;
    private static int write = 1;

    public static verifyPlayStorePurchaseI write(String str) {
        verifyPlayStorePurchaseI[] verifyplaystorepurchaseiArrValues;
        int length;
        Object obj;
        verifyPlayStorePurchaseI verifyplaystorepurchasei;
        int i = 2 % 2;
        int i2 = read + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = 0;
        if (i2 % 2 == 0) {
            verifyplaystorepurchaseiArrValues = verifyPlayStorePurchaseI.values();
            length = verifyplaystorepurchaseiArrValues.length;
        } else {
            verifyplaystorepurchaseiArrValues = verifyPlayStorePurchaseI.values();
            length = verifyplaystorepurchaseiArrValues.length;
        }
        while (true) {
            obj = null;
            if (i3 >= length) {
                verifyplaystorepurchasei = null;
                break;
            }
            verifyplaystorepurchasei = verifyplaystorepurchaseiArrValues[i3];
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{verifyplaystorepurchasei.getValue(), str}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i3++;
        }
        if (verifyplaystorepurchasei != null) {
            return verifyplaystorepurchasei;
        }
        int i4 = write + 61;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return verifyPlayStorePurchaseI.EMAIL;
        }
        verifyPlayStorePurchaseI verifyplaystorepurchasei2 = verifyPlayStorePurchaseI.EMAIL;
        obj.hashCode();
        throw null;
    }
}
