package org.joda.time;

import bo.app.ff$$ExternalSyntheticOutline0;
import org.joda.time.format.DateTimeFormat;

/* JADX INFO: loaded from: classes4.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    private static String createMessage(long j, String str) {
        String strM;
        String strPrint = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j));
        if (str != null) {
            strM = ff$$ExternalSyntheticOutline0.m(" (", str, ")");
        } else {
            strM = "";
        }
        return ff$$ExternalSyntheticOutline0.m("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", strPrint, strM);
    }

    public IllegalInstantException(long j, String str) {
        super(createMessage(j, str));
    }

    public static boolean isIllegalInstant(Throwable th) {
        if (th instanceof IllegalInstantException) {
            return true;
        }
        if (th.getCause() == null || th.getCause() == th) {
            return false;
        }
        return isIllegalInstant(th.getCause());
    }

    public IllegalInstantException(String str) {
        super(str);
    }
}
