package com.incognia.internal;

import android.os.SystemClock;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E79 {
    public static final UsU BGx = new UsU(Al.BGx, true);
    public static final lFz mbG = new lFz();
    public static final KWh HQ = new KWh();
    public static final LinkedHashMap N = new LinkedHashMap();
    public static final AtomicInteger x = new AtomicInteger(0);

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        try {
            Collection collectionValues = N.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (((EA5) obj).HQ != null) {
                    arrayList.add(obj);
                }
            }
            List<EA5> listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(arrayList);
            if (listPlaybackStateCompat.isEmpty()) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(instance_delegatelambda0.write));
                return;
            }
            Set setEntrySet = N.entrySet();
            JQs jQs = JQs.BGx;
            setEntrySet.getClass();
            jQs.getClass();
            onContentCardDismissed.serializer((Iterable) setEntrySet, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) jQs, true);
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listPlaybackStateCompat, 10));
            for (EA5 ea5 : listPlaybackStateCompat) {
                String str = ea5.BGx;
                long j = ea5.mbG;
                arrayList2.add(new qVf(str, Long.valueOf(j), ea5.HQ, ea5.N, ea5.hIl));
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new onItemDismiss(onContentCardDismissed.serializer(arrayList2, new dS1())));
        } catch (Throwable th) {
            mbG.BGx(th);
            af$$ExternalSyntheticOutline0.m(new isItemDismissable(th), r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    public static void HQ(final int i) {
        try {
            HQ.getClass();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final long jUptimeMillis = SystemClock.uptimeMillis();
            BGx.BGx(new y9X() { // from class: com.incognia.internal.E79$$ExternalSyntheticLambda0
                @Override // com.incognia.internal.y9X
                public final void run() {
                    E79.BGx(i, jUptimeMillis, jCurrentTimeMillis, null);
                }
            });
        } catch (Throwable th) {
            mbG.BGx(th);
        }
    }

    public static final void mbG(int i) {
        try {
            N.remove(Integer.valueOf(i));
        } catch (Throwable th) {
            mbG.BGx(th);
        }
    }

    public static final void BGx(int i, String str, long j, BYo bYo, Map map) {
        N.put(Integer.valueOf(i), new EA5(str, j, bYo, map));
    }

    public static final void BGx(int i, long j, long j2, Map map) {
        EA5 ea5 = (EA5) N.get(Integer.valueOf(i));
        if (ea5 != null) {
            ea5.N = Long.valueOf(j - ea5.x.BGx);
            ea5.HQ = Long.valueOf(j2);
            if (map != null) {
                Map map2 = ea5.hIl;
                if (map2 == null) {
                    map2 = SimpleItemTouchHelperCallback.serializer;
                }
                ea5.hIl = onMove.RemoteActionCompatParcelizer(map2, map);
            }
        }
    }

    public static void BGx(final int i) {
        BGx.BGx(new y9X() { // from class: com.incognia.internal.E79$$ExternalSyntheticLambda2
            @Override // com.incognia.internal.y9X
            public final void run() {
                E79.mbG(i);
            }
        });
    }

    public static void BGx(D3 d3) {
        BGx.BGx(new E79$$ExternalSyntheticLambda3(d3, 0));
    }

    public static int BGx(final String str, final LinkedHashMap linkedHashMap) {
        final int iIncrementAndGet = x.incrementAndGet();
        try {
            KWh kWh = HQ;
            kWh.getClass();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final BYo bYo = new BYo(kWh);
            BGx.BGx(new y9X() { // from class: com.incognia.internal.E79$$ExternalSyntheticLambda1
                @Override // com.incognia.internal.y9X
                public final void run() {
                    E79.BGx(iIncrementAndGet, str, jCurrentTimeMillis, bYo, linkedHashMap);
                }
            });
            return iIncrementAndGet;
        } catch (Throwable th) {
            mbG.BGx(th);
            return iIncrementAndGet;
        }
    }
}
