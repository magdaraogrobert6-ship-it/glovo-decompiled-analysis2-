package com.incognia.internal;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.sqlite.SQLite;
import io.sentry.Sentry$$ExternalSyntheticLambda5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.accessgetInstancedelegatecp;
import o.cancelPendingWebViewPause;
import o.createInAppMessageEventSubscriber;
import o.instance_delegatelambda0;
import o.markOnScreenCardsAsReadlambda1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pNP {
    public static final Dop BGx;
    public static final QB HQ;
    public static final AtomicReference N;
    public static final KWh mbG;

    public static final void BGx(Thread thread, Throwable th) {
    }

    static {
        try {
            Dop dop = new Dop();
            BGx = dop;
            KWh kWh = new KWh();
            mbG = kWh;
            Context context = uF.BGx;
            if (context == null) {
                throw new NullPointerException("Using SDK context before initialization");
            }
            HQ = new QB(new CA(context, kWh, aJf.mbG, SQLite.IconCompatParcelizer(aJf.BGx), dop));
            N = new AtomicReference();
        } catch (Throwable unused) {
        }
    }

    public static Handler HQ() {
        AtomicReference atomicReference = N;
        HandlerThread handlerThread = (HandlerThread) atomicReference.get();
        if (handlerThread == null) {
            HandlerThread handlerThreadBGx = hB0.BGx(new xr$$ExternalSyntheticLambda0(1));
            while (!atomicReference.compareAndSet(null, handlerThreadBGx) && atomicReference.get() == null) {
            }
            handlerThread = (HandlerThread) atomicReference.get();
        }
        return new Handler(handlerThread.getLooper());
    }

    public static final void BGx(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ZBu zBu = (ZBu) it.next();
            QB qb = HQ;
            if (qb == null) {
                qb = null;
            }
            iR9 ir9 = new iR9(zBu.BGx, zBu);
            qb.getClass();
            cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
            qb.BGx.BGx(new jS(cancelpendingwebviewpause, qb));
            if (cancelpendingwebviewpause.IconCompatParcelizer) {
                cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
                qb.BGx.BGx(new jS(cancelpendingwebviewpause2, qb));
                if (cancelpendingwebviewpause2.IconCompatParcelizer) {
                    qb.BGx.mbG(new lx(qb));
                    qb.BGx.BGx(QTL.BGx);
                }
            }
            qb.HQ.BGx(new JAK(ir9, qb));
        }
    }

    public static final void mbG(Throwable th, boolean z) {
        KWh kWh = mbG;
        (kWh != null ? kWh : null).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (kWh == null) {
            kWh = null;
        }
        kWh.getClass();
        String id = TimeZone.getDefault().getID();
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        String strRemoteActionCompatParcelizer = markOnScreenCardsAsReadlambda1.RemoteActionCompatParcelizer(th);
        CWL cwl = CWL.BGx;
        ZBu zBu = new ZBu(jCurrentTimeMillis, id, message, strRemoteActionCompatParcelizer, z, false, null, null, null, null, null, null, null, null, null, (String) W4i.dnx.MediaSessionCompatResultReceiverWrapper(), 327552);
        QB qb = HQ;
        QB qb2 = qb != null ? qb : null;
        iR9 ir9 = new iR9(jCurrentTimeMillis, zBu);
        qb2.getClass();
        cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        qb2.BGx.BGx(new jS(cancelpendingwebviewpause, qb2));
        if (cancelpendingwebviewpause.IconCompatParcelizer) {
            cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
            qb2.BGx.BGx(new jS(cancelpendingwebviewpause2, qb2));
            if (cancelpendingwebviewpause2.IconCompatParcelizer) {
                qb2.BGx.mbG(new lx(qb2));
                qb2.BGx.BGx(QTL.BGx);
            }
        }
        qb2.HQ.BGx(new JAK(ir9, qb2));
    }

    public static void BGx(Throwable th, boolean z) {
        HQ().post(new pNP$$ExternalSyntheticLambda5(th, z, 0));
    }

    public static void BGx(ZBu zBu) {
        HQ().post(new ZM$$ExternalSyntheticLambda2(5, zBu));
    }

    public static void BGx(ArrayList arrayList) {
        HQ().post(new ZM$$ExternalSyntheticLambda2(4, arrayList));
    }

    public static void BGx(whJ whj) {
        HQ().post(new Sentry$$ExternalSyntheticLambda5(10, whj));
    }

    public static void BGx() {
        HQ().post(new pNP$$ExternalSyntheticLambda0(0));
    }

    public static final void mbG() {
        QB qb = HQ;
        if (qb == null) {
            qb = null;
        }
        qb.BGx.BGx(new kw(qb));
    }

    public static final void mbG(whJ whj) {
        List list = instance_delegatelambda0.write;
        try {
            QB qb = HQ;
            if (qb == null) {
                qb = null;
            }
            qb.getClass();
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            qb.HQ.mbG(new X0p(qb, createinappmessageeventsubscriber));
            List list2 = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
            if (list2 == null) {
                list2 = list;
            }
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((iR9) it.next()).N);
            }
            whj.BGx(arrayList);
        } catch (Throwable unused) {
            QB qb2 = HQ;
            QB qb3 = qb2 != null ? qb2 : null;
            qb3.BGx.BGx(new kw(qb3));
            whj.BGx(list);
        }
    }

    public static final void mbG(ZBu zBu) {
        QB qb = HQ;
        if (qb == null) {
            qb = null;
        }
        iR9 ir9 = new iR9(zBu.BGx, zBu);
        qb.getClass();
        cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        qb.BGx.BGx(new jS(cancelpendingwebviewpause, qb));
        if (cancelpendingwebviewpause.IconCompatParcelizer) {
            cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
            qb.BGx.BGx(new jS(cancelpendingwebviewpause2, qb));
            if (cancelpendingwebviewpause2.IconCompatParcelizer) {
                qb.BGx.mbG(new lx(qb));
                qb.BGx.BGx(QTL.BGx);
            }
        }
        qb.HQ.BGx(new JAK(ir9, qb));
    }
}
