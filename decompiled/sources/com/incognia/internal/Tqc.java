package com.incognia.internal;

import android.content.Context;
import java.util.Locale;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class Tqc implements Xeg {
    public static final String BGx;
    public static final String mbG;

    @Override // com.incognia.internal.Xeg
    public final int BGx() {
        return 2;
    }

    @Override // com.incognia.internal.Xeg
    public final boolean mbG() {
        return true;
    }

    static {
        BGx = (String) W4i.NaG.MediaSessionCompatResultReceiverWrapper();
        mbG = (String) W4i.jG.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.incognia.internal.Xeg
    public final void BGx(Context context) {
        sSc ssc = Ay.N;
        String str = BGx;
        String strMbG = ssc.mbG(str);
        if (strMbG != null) {
            String str2 = mbG;
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(strMbG, str2, false)) {
                ssc.BGx(str, setCarryoverInAppMessage.write(strMbG, str2, "").toLowerCase(Locale.getDefault()));
            }
        }
    }
}
