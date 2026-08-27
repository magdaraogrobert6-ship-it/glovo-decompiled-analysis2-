package com.incognia.internal;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Ay {
    public static final mP BGx;
    public static final mP HQ;
    public static final sSc N;
    public static final mP mbG;

    static {
        Context context = uF.BGx;
        if (context != null) {
            ha haVar = new ha(context, (String) W4i.hH.MediaSessionCompatResultReceiverWrapper(), (String) W4i.JL.MediaSessionCompatResultReceiverWrapper());
            ST st = ST.BGx;
            BGx = new mP(haVar, new UsU(st, true), new CeJ());
            Context context2 = uF.BGx;
            if (context2 != null) {
                mbG = new mP(new FQv(context2, (String) W4i.l.MediaSessionCompatResultReceiverWrapper(), (String) W4i.K.MediaSessionCompatResultReceiverWrapper()), new UsU(st, true), new CeJ());
                Context context3 = uF.BGx;
                if (context3 != null) {
                    HQ = new mP(new FQv(context3, (String) W4i.O.MediaSessionCompatResultReceiverWrapper(), (String) W4i.Ec.MediaSessionCompatResultReceiverWrapper()), new UsU(st, true), new CeJ());
                    Context context4 = uF.BGx;
                    if (context4 != null) {
                        N = new sSc(context4, (String) W4i.kJB.MediaSessionCompatResultReceiverWrapper(), new CeJ());
                        return;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
                        return;
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
    }
}
