package com.incognia.internal;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class T1 {
    public static final long BGx = 180000;
    public static Zs mbG;

    public static Zs BGx() {
        Zs zs = mbG;
        if (zs != null) {
            return zs;
        }
        Context context = uF.BGx;
        RU ru = null;
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
            return null;
        }
        tVM tvm = new tVM(context, new UsU(ST.BGx, true));
        mP mPVar = Ay.BGx;
        String str = tVM.HQ;
        RU ru2 = (RU) mPVar.BGx(Kje.BGx, str);
        if (ru2 != null) {
            ru = ru2;
        } else {
            RU ruBGx = tvm.BGx();
            if (ruBGx != null) {
                mPVar.BGx(str, ruBGx, lIW.BGx);
                ru = ruBGx;
            }
        }
        int i = ru != null ? ru.mbG : 0;
        yH yHVar = yH.BGx;
        return new Zs((Long) null, (Long) null, (Long) null, i, (String) W4i.IN.MediaSessionCompatResultReceiverWrapper(), (List) null, 79);
    }
}
