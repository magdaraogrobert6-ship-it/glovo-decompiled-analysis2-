package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hF {
    public static final String BGx = (String) W4i.FD.MediaSessionCompatResultReceiverWrapper();

    public static String BGx(int i, String str) {
        int i2 = 0;
        for (char c : str.toCharArray()) {
            i2 += (c - '0') * i;
            i--;
            if (i < 2) {
                i = 9;
            }
        }
        int i3 = i2 % 11;
        return i3 < 2 ? "0" : String.valueOf(11 - i3);
    }
}
