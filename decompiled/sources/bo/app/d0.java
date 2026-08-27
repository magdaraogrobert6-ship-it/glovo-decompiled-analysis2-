package bo.app;

import android.graphics.Rect;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static void b() {
        ReentrantLock reentrantLock = g0.l;
        reentrantLock.lock();
        try {
            ArrayList arrayList = g0.m;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a0 a0Var = (a0) obj;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0.i, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c0$$ExternalSyntheticLambda0(a0Var, 3), 6, (Object) null);
                a0Var.c = false;
            }
            reentrantLock.unlock();
            if (g0.k != null) {
                return;
            }
            g0.k = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new c0(null), 2, null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static void c() {
        g0.j.clear();
        ReentrantLock reentrantLock = g0.l;
        reentrantLock.lock();
        try {
            g0.m.clear();
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = g0.n;
            reentrantLock2.lock();
            try {
                g0.f17o.clear();
                reentrantLock2.unlock();
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = g0.k;
                if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                    setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                }
                g0.k = null;
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static void a(String str, View view, boolean z) {
        str.getClass();
        view.getClass();
        ReentrantLock reentrantLock = g0.l;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0.i, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ah$$ExternalSyntheticLambda0(str, 26, view), 7, (Object) null);
            Iterator it = g0.m.iterator();
            while (it.hasNext()) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                d0 d0Var = g0.i;
                BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                BrazeLogger.brazelog$default(brazeLogger, (Object) d0Var, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(29), 6, (Object) null);
                a0 a0Var = (a0) it.next();
                Object[] objArr = {a0Var.b.get(), view};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) d0Var, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ah$$ExternalSyntheticLambda0(a0Var, 27, str), 6, (Object) null);
                    it.remove();
                }
            }
            g0.m.add(new a0(str, new WeakReference(view), z));
            if (g0.k == null) {
                g0.k = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new c0(null), 2, null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String c(a0 a0Var) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Resetting impression for ", a0Var.a);
    }

    public static void b(String str) {
        str.getClass();
        ReentrantLock reentrantLock = g0.l;
        reentrantLock.lock();
        try {
            onContentCardDismissed.write((List) g0.m, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new d0$$ExternalSyntheticLambda4(str, 0));
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b(a0 a0Var) {
        return ff$$ExternalSyntheticOutline0.m("Banner is not shown ", a0Var.a, " because view is null");
    }

    public static final String b(List list) {
        return c8$$ExternalSyntheticOutline0.m("Setting banner placement list to ", list);
    }

    public static final String a(a0 a0Var, String str) {
        return af$$ExternalSyntheticOutline0.m("Removing banner from monitor list ", a0Var.a, " because view is now used by ", str);
    }

    public static final boolean a(String str, a0 a0Var) {
        a0Var.getClass();
        Object[] objArr = {a0Var.a, str};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public final boolean a(a0 a0Var) {
        View view = (View) a0Var.b.get();
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c0$$ExternalSyntheticLambda0(a0Var, 2), 7, (Object) null);
            return true;
        }
        String str = a0Var.a;
        if (!view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect) || rect.width() == 0 || rect.height() == 0) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 8), 7, (Object) null);
        BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new b0(view, str, a0Var, null), 3);
        return false;
    }

    public final void a(List list) {
        list.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d0$$ExternalSyntheticLambda0(list, 0), 7, (Object) null);
        ReentrantLock reentrantLock = g0.n;
        reentrantLock.lock();
        try {
            ArrayList arrayList = g0.f17o;
            arrayList.clear();
            arrayList.addAll(list);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(String str, View view) {
        return "Adding monitor for " + str + " for BannerView " + view;
    }

    public static final String a() {
        return "Checking existing monitor list for view reuse.";
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Banner is shown ", str, ".");
    }
}
