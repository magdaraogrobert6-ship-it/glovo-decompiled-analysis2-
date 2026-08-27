package com.incognia.internal;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import o.ensureSubscribedToInAppMessageEvents;
import o.getCieXyz;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class P {
    public final Context BGx;
    public static final String mbG = (String) W4i.Ml.MediaSessionCompatResultReceiverWrapper();
    public static final String HQ = (String) W4i.mQG.MediaSessionCompatResultReceiverWrapper();
    public static final String N = (String) W4i.FV.MediaSessionCompatResultReceiverWrapper();
    public static final String x = (String) W4i.GW6.MediaSessionCompatResultReceiverWrapper();
    public static final String hIl = (String) W4i.Rhp.MediaSessionCompatResultReceiverWrapper();
    public static final String hs = (String) W4i.goT.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.MA.MediaSessionCompatResultReceiverWrapper();

    public P(Context context) {
        this.BGx = context;
    }

    public final File BGx(CaO caO) {
        File noBackupFilesDir;
        String str;
        if (!XUh.BGx(XUh.BGx, 21, 0, 2) || (noBackupFilesDir = this.BGx.getNoBackupFilesDir()) == null) {
            return null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caO, H67.mbG}, getCieXyz.write())).booleanValue()) {
            str = hs;
        } else {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caO, k1.mbG}, getCieXyz.write())).booleanValue()) {
                str = hIl;
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caO, Sth.mbG}, getCieXyz.write())).booleanValue()) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                str = VV3;
            }
        }
        File file = new File(noBackupFilesDir, str);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    public final void BGx(long j) {
        try {
            File fileBGx = BGx(Sth.mbG);
            if (fileBGx == null) {
                return;
            }
            r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(new File(fileBGx, mbG), String.valueOf(j), ensureSubscribedToInAppMessageEvents.write);
        } catch (Throwable unused) {
        }
    }

    public final CaO BGx() {
        return new GUp(new a9(this.BGx, N), new a9(this.BGx, x), new a9(this.BGx, HQ)).BGx();
    }
}
