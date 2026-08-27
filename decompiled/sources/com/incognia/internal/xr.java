package com.incognia.internal;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.accessgetInstancedelegatecp;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public final class xr {
    public static final ArrayList A1;
    public static final Thread.UncaughtExceptionHandler HQ;
    public static final HandlerThread N;
    public static final Handler VV3;
    public static final ArrayList hIl;
    public static final Handler hs;
    public static final HandlerThread x;
    public static final AtomicInteger BGx = new AtomicInteger(0);
    public static final lFz mbG = new lFz();

    static {
        xr$$ExternalSyntheticLambda0 xr__externalsyntheticlambda0 = new xr$$ExternalSyntheticLambda0(0);
        HQ = xr__externalsyntheticlambda0;
        N = hB0.BGx(xr__externalsyntheticlambda0);
        x = hB0.BGx(xr__externalsyntheticlambda0);
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{0, 2}, BackspaceCommand.write(), -281231677, BackspaceCommand.write()));
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listPlaybackStateCompat, 10));
        Iterator it = listPlaybackStateCompat.iterator();
        while (it.hasNext()) {
            ((Number) it.next()).intValue();
            AtomicInteger atomicInteger = hB0.BGx;
            arrayList.add(hB0.BGx(HQ));
        }
        hIl = new ArrayList();
        hs = new Handler(N.getLooper());
        VV3 = new Handler(x.getLooper());
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new Handler(((HandlerThread) obj).getLooper()));
        }
        A1 = arrayList2;
        VV3.post(new xr$$ExternalSyntheticLambda1(0));
    }

    public static final void BGx() {
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
        } catch (Throwable unused) {
        }
    }

    public static final void BGx(Thread thread, Throwable th) {
        try {
            mbG.BGx(th);
        } catch (Throwable unused) {
        }
    }
}
