package com.incognia.internal;

import androidx.sqlite.SQLite;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t0 {
    public static final String BGx = (String) W4i.ze.MediaSessionCompatResultReceiverWrapper();
    public static final String mbG = (String) W4i.a.MediaSessionCompatResultReceiverWrapper();
    public static final String HQ = (String) W4i.r.MediaSessionCompatResultReceiverWrapper();

    public static final List BGx(String str) {
        StringBuilder sb = new StringBuilder();
        String str2 = BGx;
        sb.append(str2);
        sb.append('.');
        sb.append(str);
        sb.append('.');
        sb.append(mbG);
        return SQLite.read(sb.toString(), str2 + '.' + str + '.' + HQ);
    }
}
