package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class deactivateOutOfFrame {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public static final toAndroidCapBeK7IIE read(clearDexDir cleardexdir) {
        String str;
        int i = 2 % 2;
        String str2 = cleardexdir.name;
        String upperCase = cleardexdir.type.toUpperCase(java.util.Locale.ROOT);
        upperCase.getClass();
        DrawStyleSpan_androidKt drawStyleSpan_androidKtValueOf = DrawStyleSpan_androidKt.valueOf(upperCase);
        String strM = cleardexdir.reference;
        String str3 = cleardexdir.shortCode;
        if (strM != null) {
            int i2 = IconCompatParcelizer + 25;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (str3 != null) {
                strM = af$$ExternalSyntheticOutline0.m(strM, " • ", str3);
            } else if (strM == null) {
                int i3 = IconCompatParcelizer + 5;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                str = str3;
            }
            str = strM;
        } else if (strM == null) {
            int i5 = IconCompatParcelizer + 5;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str = str3;
        } else {
            str = strM;
        }
        return new toAndroidCapBeK7IIE(str2, drawStyleSpan_androidKtValueOf, str, cleardexdir.address, cleardexdir.time, cleardexdir.payTag, cleardexdir.actions, cleardexdir.trackingParams);
    }
}
