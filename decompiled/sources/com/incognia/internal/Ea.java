package com.incognia.internal;

import com.incognia.CardInfo;
import java.util.regex.Pattern;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Ea {
    public static final String BGx;
    public static final String HQ;
    public static final String N;
    public static final String mbG;

    static {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = W4i.e7;
        BGx = (String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        mbG = (String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        HQ = (String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        N = (String) W4i.TG.MediaSessionCompatResultReceiverWrapper();
    }

    public static boolean BGx(CardInfo cardInfo) {
        if (cardInfo == null) {
            return true;
        }
        String bin = cardInfo.getBin();
        if (bin.length() > 6) {
            return false;
        }
        String str = BGx;
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        if (!patternCompile.matcher(bin).matches()) {
            return false;
        }
        String lastFourDigits = cardInfo.getLastFourDigits();
        if (lastFourDigits.length() != 4) {
            return false;
        }
        String str2 = mbG;
        str2.getClass();
        Pattern patternCompile2 = Pattern.compile(str2);
        patternCompile2.getClass();
        if (!patternCompile2.matcher(lastFourDigits).matches()) {
            return false;
        }
        String expiryYear = cardInfo.getExpiryYear();
        if (expiryYear != null) {
            if (expiryYear.length() != 4) {
                return false;
            }
            String str3 = HQ;
            str3.getClass();
            Pattern patternCompile3 = Pattern.compile(str3);
            patternCompile3.getClass();
            if (!patternCompile3.matcher(expiryYear).matches()) {
                return false;
            }
        }
        String expiryMonth = cardInfo.getExpiryMonth();
        if (expiryMonth == null) {
            return true;
        }
        if (expiryMonth.length() != 2) {
            return false;
        }
        String str4 = N;
        str4.getClass();
        Pattern patternCompile4 = Pattern.compile(str4);
        patternCompile4.getClass();
        return patternCompile4.matcher(expiryMonth).matches();
    }
}
