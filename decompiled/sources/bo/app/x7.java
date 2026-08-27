package bo.app;

import com.braze.events.IFireOnceEventSubscriber;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class x7 {
    public static final HashSet a(ConcurrentHashMap concurrentHashMap, Class cls, ReentrantLock reentrantLock) {
        reentrantLock.lock();
        try {
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(cls);
            if (copyOnWriteArraySet == null) {
                HashSet hashSet = new HashSet();
                reentrantLock.unlock();
                return hashSet;
            }
            HashSet hashSet2 = new HashSet(copyOnWriteArraySet);
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArraySet) {
                if (obj instanceof IFireOnceEventSubscriber) {
                    arrayList.add(obj);
                }
            }
            copyOnWriteArraySet.removeAll(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList));
            concurrentHashMap.put(cls, copyOnWriteArraySet);
            reentrantLock.unlock();
            return hashSet2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(Class cls, Set set) {
        return "Triggering " + cls.getName() + " on " + set.size() + " subscribers.";
    }

    public final Set a(Class cls, HashSet hashSet) {
        hashSet.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda2(cls, 13, hashSet), 3, (Object) null);
        return hashSet;
    }
}
