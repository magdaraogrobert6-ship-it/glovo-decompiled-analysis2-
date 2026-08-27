package com.incognia.internal;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cY {
    public static final String mbG = (String) W4i.K4u.MediaSessionCompatResultReceiverWrapper();
    public final NvL BGx;

    public final boolean BGx() {
        NvL nvL = this.BGx;
        return ((JSONObject) nvL.BGx.get()).optBoolean(mbG, true);
    }

    public cY(NvL nvL) {
        this.BGx = nvL;
    }
}
