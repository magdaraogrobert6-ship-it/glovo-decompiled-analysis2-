package com.incognia.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Hh {
    public final TU BGx;

    public Hh(TU tu) {
        this.BGx = tu;
    }

    public final boolean BGx(Jtm jtm) {
        if (jtm.mbG()) {
            NvL nvL = this.BGx.BGx;
            String str = TU.mbG;
            String str2 = XUh.fZl;
            if (((JSONObject) nvL.BGx.get()).optBoolean(str, str2 == null || !TU.HQ.contains(str2))) {
                return true;
            }
        }
        return false;
    }
}
