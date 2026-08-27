package com.incognia.internal;

import java.util.List;
import java.util.regex.Pattern;
import o.onContentCardDismissed;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OI {
    public final NvL BGx;
    public static final String mbG = (String) W4i.IUR.MediaSessionCompatResultReceiverWrapper();
    public static final String HQ = (String) W4i.LpT.MediaSessionCompatResultReceiverWrapper();

    public static String mbG(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String str2 = Uo7.BGx;
        str2.getClass();
        Pattern patternCompile = Pattern.compile(str2);
        patternCompile.getClass();
        if (patternCompile.matcher(str).matches()) {
            return str;
        }
        return null;
    }

    public final List BGx(List list, List list2) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        int iOptInt = ((JSONObject) this.BGx.BGx.get()).optInt(HQ, 3);
        if (list.size() <= iOptInt) {
            return list;
        }
        return list2.isEmpty() ? onContentCardDismissed.read(list, iOptInt) : onContentCardDismissed.read(onContentCardDismissed.read(list, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(list2)), iOptInt);
    }

    public OI(NvL nvL) {
        this.BGx = nvL;
    }

    public final String BGx(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        NvL nvL = this.BGx;
        int iOptInt = ((JSONObject) nvL.BGx.get()).optInt(mbG, 250);
        String str2 = Uo7.BGx;
        int length = str.length();
        if (length < 0 || length > iOptInt) {
            return null;
        }
        return str;
    }
}
