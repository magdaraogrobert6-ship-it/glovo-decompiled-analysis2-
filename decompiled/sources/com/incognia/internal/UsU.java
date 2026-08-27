package com.incognia.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicInteger;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class UsU {
    public final boolean BGx;
    public final lFz HQ;
    public final Handler mbG;

    public UsU(zgU zgu, boolean z) {
        Handler handler;
        Handler handler2;
        this.BGx = z;
        Object[] objArr = {zgu, U2.BGx};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            handler2 = (Handler) xr.A1.get(xr.BGx.getAndIncrement() % 2);
        } else {
            Object[] objArr2 = {zgu, Al.BGx};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                AtomicInteger atomicInteger = xr.BGx;
                AtomicInteger atomicInteger2 = hB0.BGx;
                HandlerThread handlerThreadBGx = hB0.BGx(xr.HQ);
                xr.hIl.add(handlerThreadBGx);
                handler = new Handler(handlerThreadBGx.getLooper());
            } else {
                Object[] objArr3 = {zgu, G7.BGx};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    handler2 = xr.hs;
                } else {
                    Object[] objArr4 = {zgu, ST.BGx};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                        handler2 = xr.VV3;
                    } else {
                        Object[] objArr5 = {zgu, weG.BGx};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            throw null;
                        }
                        AtomicInteger atomicInteger3 = xr.BGx;
                        handler = new Handler(Looper.getMainLooper());
                    }
                }
            }
            handler2 = handler;
        }
        this.mbG = handler2;
        this.HQ = new lFz();
    }

    public static final void BGx(y9X y9x, UsU usU) {
        try {
            y9x.run();
        } catch (Throwable th) {
            if (usU.BGx) {
                usU.HQ.BGx(th);
            }
        }
    }

    public static final void mbG(y9X y9x, UsU usU) {
        try {
            y9x.run();
        } catch (Throwable th) {
            if (usU.BGx) {
                usU.HQ.BGx(th);
            }
        }
    }

    public final void BGx(long j, y9X y9x) {
        this.mbG.postDelayed(new UsU$$ExternalSyntheticLambda0(y9x, this, 0), j);
    }

    public final void BGx(y9X y9x) {
        this.mbG.post(new UsU$$ExternalSyntheticLambda0(y9x, this, 1));
    }
}
