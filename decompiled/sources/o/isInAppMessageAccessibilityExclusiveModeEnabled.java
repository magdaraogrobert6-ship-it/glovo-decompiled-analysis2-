package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class isInAppMessageAccessibilityExclusiveModeEnabled {
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(com.adjust.sdk.Constants.ENCODING);

    public static int write(int i) {
        return ((i & 65280) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    public static void IconCompatParcelizer(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "size=", " offset=");
            sbM.append(j2);
            sbM.append(" byteCount=");
            sbM.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM.toString());
        }
    }
}
