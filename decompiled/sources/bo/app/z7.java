package bo.app;

import androidx.sqlite.SQLite;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.BuildersKt;
import o.getQueryParameterslambda2;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class z7 implements u9 {
    public static final x7 j = new x7();
    public final qe a;
    public final a5 b;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap d;
    public final ConcurrentHashMap e;
    public final ReentrantLock f;
    public final ReentrantLock g;
    public final ReentrantLock h;
    public boolean i;

    public z7(qe qeVar, a5 a5Var, boolean z) {
        qeVar.getClass();
        a5Var.getClass();
        this.a = qeVar;
        this.b = a5Var;
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        this.f = new ReentrantLock();
        this.g = new ReentrantLock();
        this.h = new ReentrantLock();
        this.i = !z;
    }

    public final void b(final Object obj, final Class cls) {
        boolean z;
        l9 l9Var;
        cls.getClass();
        final int i = 0;
        final int i2 = 1;
        if ((obj instanceof ke) || (obj instanceof oe)) {
            z = true;
        } else {
            if ((obj instanceof u5) && (l9Var = ((u5) obj).d) != null) {
                ((l2) l9Var).e();
            }
            if (obj instanceof jd) {
                ((jd) obj).a.e();
            }
            if (obj instanceof id) {
                ((id) obj).a.e();
            }
            if (obj instanceof y5) {
                ((l2) ((y5) obj).a).e();
            }
            z = false;
        }
        if (this.a.a() || this.b.c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new bb$$ExternalSyntheticLambda0(this, cls, obj, 4), 3, (Object) null);
            return;
        }
        if (obj == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new z7$$ExternalSyntheticLambda0(cls, 2), 3, (Object) null);
            return;
        }
        if (!this.i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.z7$$ExternalSyntheticLambda4
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i;
                    Object obj2 = obj;
                    Class cls2 = cls;
                    return i3 != 0 ? z7.b(cls2, obj2) : z7.a(cls2, obj2);
                }
            }, 3, (Object) null);
            a(obj, cls);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, z, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.z7$$ExternalSyntheticLambda4
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = i2;
                Object obj2 = obj;
                Class cls2 = cls;
                return i3 != 0 ? z7.b(cls2, obj2) : z7.a(cls2, obj2);
            }
        }, 3, (Object) null);
        x7 x7Var = j;
        HashSet hashSetA = x7.a(this.c, cls, this.f);
        Iterator it = ((HashSet) x7Var.a(cls, hashSetA)).iterator();
        while (it.hasNext()) {
            BuildersKt.RemoteActionCompatParcelizer(BrazeCoroutineScope.INSTANCE, null, null, new y7((IEventSubscriber) it.next(), obj, null), 3);
        }
        x7 x7Var2 = j;
        HashSet hashSetA2 = x7.a(this.d, cls, this.g);
        Iterator it2 = ((HashSet) x7Var2.a(cls, hashSetA2)).iterator();
        while (it2.hasNext()) {
            ((IEventSubscriber) it2.next()).trigger(obj);
        }
        if (hashSetA2.isEmpty() && hashSetA.isEmpty()) {
            if (cls.equals(NoMatchingTriggerEvent.class)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.z7$$ExternalSyntheticLambda6
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i3 = i;
                        z7 z7Var = this;
                        Class cls2 = cls;
                        return i3 != 0 ? z7.b(cls2, z7Var) : z7.a(cls2, z7Var);
                    }
                }, 2, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, z, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.z7$$ExternalSyntheticLambda6
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i3 = i2;
                        z7 z7Var = this;
                        Class cls2 = cls;
                        return i3 != 0 ? z7.b(cls2, z7Var) : z7.a(cls2, z7Var);
                    }
                }, 2, (Object) null);
                a(obj, cls);
            }
        }
    }

    public final boolean c(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.d;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            boolean zAdd = copyOnWriteArraySet.add(iEventSubscriber);
            a(cls);
            return zAdd;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = this.c;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet();
                CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) concurrentHashMap.putIfAbsent(cls, copyOnWriteArraySet);
                if (copyOnWriteArraySet2 != null) {
                    copyOnWriteArraySet = copyOnWriteArraySet2;
                }
            }
            copyOnWriteArraySet.add(iEventSubscriber);
            a(cls);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(Class cls) {
        if (!this.i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new z7$$ExternalSyntheticLambda0(cls, 0), 7, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.e.containsKey(cls)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new z7$$ExternalSyntheticLambda0(cls, 1), 6, (Object) null);
                Object objRemove = this.e.remove(cls);
                objRemove.getClass();
                Iterator it = ((List) objRemove).iterator();
                while (it.hasNext()) {
                    b(it.next(), cls);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String d(Class cls) {
        return "Not publishing null message to event class ".concat(cls.getName());
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            this.c.clear();
            reentrantLock.unlock();
            ReentrantLock reentrantLock2 = this.g;
            reentrantLock2.lock();
            try {
                this.d.clear();
            } finally {
                reentrantLock2.unlock();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String c(Class cls) {
        return c8$$ExternalSyntheticOutline0.m(cls, "Publishing cached event for class: ");
    }

    public final boolean a(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(iEventSubscriber);
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(z7 z7Var, Class cls, Object obj) {
        return "SDK delayed initialization mode: " + z7Var.b.c() + " and GDPR disabled mode: " + z7Var.a.a() + ". Not publishing event class: " + cls.getName() + " and message: " + obj;
    }

    public static final String a(Class cls, Object obj) {
        return "Not publishing event class: " + cls.getName() + " and message: " + obj + " because events are not allowed to send yet. Adding to replay cache.";
    }

    public static final String a(Class cls, z7 z7Var) {
        return "Event was published, but no subscribers were found. But not saving event for publishing later. Event class: " + cls + " " + z7Var;
    }

    public final void a(Object obj, Class cls) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        if (obj == null) {
            reentrantLock.unlock();
            return;
        }
        try {
            boolean zContainsKey = this.e.containsKey(cls);
            ConcurrentHashMap concurrentHashMap = this.e;
            if (zContainsKey) {
                List list = (List) concurrentHashMap.get(cls);
                if (list != null) {
                    list.add(obj);
                } else {
                    ConcurrentHashMap concurrentHashMap2 = this.e;
                    int iSerializer = getQueryParameterslambda2.serializer();
                    int iSerializer2 = getQueryParameterslambda2.serializer();
                    concurrentHashMap2.put(cls, (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -866125098, new Object[]{new Object[]{obj}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer));
                }
            } else {
                int iSerializer3 = getQueryParameterslambda2.serializer();
                int iSerializer4 = getQueryParameterslambda2.serializer();
                concurrentHashMap.put(cls, (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), iSerializer4, -866125098, new Object[]{new Object[]{obj}}, getQueryParameterslambda2.serializer(), 866125100, iSerializer3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(19), 7, (Object) null);
        this.i = true;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            for (Class cls : this.e.keySet()) {
                cls.getClass();
                a(cls);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean b(Class cls, IEventSubscriber iEventSubscriber) {
        cls.getClass();
        iEventSubscriber.getClass();
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.d.get(cls);
            if (copyOnWriteArraySet != null) {
                return copyOnWriteArraySet.remove(iEventSubscriber);
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b() {
        return "Now allowing events to send";
    }

    public static final String b(Class cls, Object obj) {
        return cls.getName() + " fired:\n" + obj;
    }

    public static final String b(Class cls, z7 z7Var) {
        return "Event was published, but no subscribers were found. Saving event for later publishing to a matching subscriber. Event class: " + cls + " this " + z7Var;
    }

    public static final String b(Class cls) {
        return d$$ExternalSyntheticOutline0.m(cls, "Not publishing cached event for class: ", " because events are not allowed to send yet.");
    }
}
