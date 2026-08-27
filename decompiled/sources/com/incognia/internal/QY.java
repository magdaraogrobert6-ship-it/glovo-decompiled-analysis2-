package com.incognia.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class QY implements MtT {
    public static final String HQ = (String) W4i.jQ.MediaSessionCompatResultReceiverWrapper();
    public final ZE BGx;
    public final AtomicBoolean mbG = new AtomicBoolean(false);

    @Override // com.incognia.internal.MtT
    public final void BGx(NvL nvL) {
        this.mbG.set(((JSONObject) nvL.BGx.get()).optBoolean(HQ, false));
    }

    public QY(ZE ze) {
        this.BGx = ze;
    }
}
