package com.incognia.internal;

import android.content.Context;
import androidx.sqlite.SQLite;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public final class oM1 implements Xeg {
    public static final String BGx;
    public static final String HQ;
    public static final String N;
    public static final String mbG;

    @Override // com.incognia.internal.Xeg
    public final int BGx() {
        return 7;
    }

    @Override // com.incognia.internal.Xeg
    public final boolean mbG() {
        return false;
    }

    static {
        BGx = (String) W4i.i.MediaSessionCompatResultReceiverWrapper();
        mbG = (String) W4i.PZt.MediaSessionCompatResultReceiverWrapper();
        HQ = (String) W4i.bV.MediaSessionCompatResultReceiverWrapper();
        N = (String) W4i.DS.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.incognia.internal.Xeg
    public final void BGx(Context context) {
        Ay.BGx.BGx(onContentCardDismissed.IconCompatParcelizer(t0.BGx(N), onContentCardDismissed.IconCompatParcelizer(t0.BGx(mbG), SQLite.read(BGx, HQ))));
    }
}
