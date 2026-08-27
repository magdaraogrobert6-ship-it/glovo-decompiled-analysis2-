package com.incognia.internal;

import android.media.MediaDrm;
import java.util.UUID;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class jwE {
    public static final UUID BGx = new UUID(-1301668207276963122L, -6645017420763422227L);

    public static String BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        MediaDrm mediaDrm;
        try {
            mediaDrm = new MediaDrm(BGx);
            try {
                String str = (String) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(mediaDrm);
                try {
                    if (XUh.BGx(XUh.BGx, 28, 0, 2)) {
                        mediaDrm.close();
                        return str;
                    }
                    mediaDrm.release();
                    return str;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                try {
                    if (XUh.BGx(XUh.BGx, 28, 0, 2)) {
                        if (mediaDrm != null) {
                            mediaDrm.close();
                        }
                    } else if (mediaDrm != null) {
                        mediaDrm.release();
                    }
                } catch (Throwable unused3) {
                }
                return null;
            }
        } catch (Throwable unused4) {
            mediaDrm = null;
        }
    }
}
