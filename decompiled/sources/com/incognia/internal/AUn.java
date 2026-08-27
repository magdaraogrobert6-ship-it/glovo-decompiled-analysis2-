package com.incognia.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AUn {
    public static final String BGx = (String) W4i.NaG.MediaSessionCompatResultReceiverWrapper();

    public static String BGx() {
        sSc ssc = Ay.N;
        String str = BGx;
        String strMbG = ssc.mbG(str);
        if (strMbG != null) {
            return strMbG;
        }
        String string = UUID.randomUUID().toString();
        ssc.BGx(str, string);
        return string;
    }
}
