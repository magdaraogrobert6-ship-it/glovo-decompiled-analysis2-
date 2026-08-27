package bo.app;

import com.braze.models.Banner;
import com.braze.models.BannerPendingDismissal;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o.BrazeContentCardsManagerCompanion;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final com.braze.storage.a a;
    public final df b;
    public final ReentrantLock c;

    public n(com.braze.storage.a aVar, df dfVar) {
        aVar.getClass();
        dfVar.getClass();
        this.a = aVar;
        this.b = dfVar;
        this.c = new ReentrantLock();
    }

    public final void a(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            arrayList.add(new onViewAttachedToWindowlambda0(dVar.a, Long.valueOf(dVar.b)));
        }
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            List listB = this.a.b();
            int i = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, 0, listB), 6, (Object) null);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listB) {
                BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj;
                if (!setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(new onViewAttachedToWindowlambda0(bannerPendingDismissal.getBannerId(), Long.valueOf(bannerPendingDismissal.getDismissalTimeMs())))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() == listB.size()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda3(list, listB, setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, i), 6, (Object) null);
            } else {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda4(0, arrayList2), 6, (Object) null);
                this.a.a(arrayList2);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(listB, arrayList2, 9), 7, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String b(List list) {
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) it.next();
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("(id=", bannerPendingDismissal.getBannerId(), bannerPendingDismissal.getDismissalTimeMs(), ", timeMs=");
            sbM.append(")");
            arrayList.add(sbM.toString());
        }
        return "Writing remaining pending dismissals: " + arrayList;
    }

    public static final String a(Banner banner) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Recording dismissal for banner ", banner.getPlacementId(), " (trackingId=", banner.getTrackingId(), ")");
    }

    public final void a(Banner banner, h2 h2Var) {
        banner.getClass();
        h2Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda6(banner, 0), 6, (Object) null);
        g9 g9VarA = n1.g.a(banner.getTrackingId());
        if (g9VarA != null) {
            h2Var.a(g9VarA);
        }
        BannerPendingDismissal bannerPendingDismissal = new BannerPendingDismissal(banner.getTrackingId(), banner.getStableKey(), DateTimeUtils.nowInMilliseconds());
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            List listB = this.a.b();
            listB.add(bannerPendingDismissal);
            a(listB, this.b.m());
            this.a.a(listB);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(List list, List list2, Set set) {
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) it.next();
            arrayList.add("(id=" + onviewattachedtowindowlambda0.serializer + ", timeMs=" + onviewattachedtowindowlambda0.write + ")");
        }
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(size, size2, "Banner dismiss sync: server acknowledged ", " dismissal(s) but none matched the pending cache. pendingCount=", " acknowledged=");
        sbM.append(arrayList);
        return sbM.toString();
    }

    public static final String a(List list, List list2) {
        return af$$ExternalSyntheticOutline0.m(list.size() - list2.size(), list2.size(), "Removed ", " acknowledged dismissals from pending cache. ", " pending dismissals remain.");
    }

    public final void a(List list, int i) {
        if (i <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 0), 6, (Object) null);
            if (list.isEmpty()) {
                return;
            }
            list.clear();
            return;
        }
        if (list.size() <= i) {
            return;
        }
        int size = list.size();
        if (list.size() > 1) {
            BrazeContentCardsManagerCompanion.write(list, new m());
        }
        List listIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(i, list);
        list.clear();
        list.addAll(listIconCompatParcelizer);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda1(size, i, 0), 6, (Object) null);
    }

    public static final String a(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "maxSize (", ") is non-positive; clearing all pending dismissals");
    }

    public static final String a(int i, int i2) {
        return af$$ExternalSyntheticOutline0.m(i - i2, "Evicted ", i2, " oldest pending dismissals to fit cache size of ");
    }

    public static final String a(Set set, List list) {
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) it.next();
            arrayList.add("(id=" + onviewattachedtowindowlambda0.serializer + ", timeMs=" + onviewattachedtowindowlambda0.write + ")");
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) it2.next();
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("(id=", bannerPendingDismissal.getBannerId(), bannerPendingDismissal.getDismissalTimeMs(), ", timeMs=");
            sbM.append(")");
            arrayList2.add(sbM.toString());
        }
        return "Processing acknowledged dismissals. acknowledged=" + arrayList + ", pending=" + arrayList2;
    }
}
