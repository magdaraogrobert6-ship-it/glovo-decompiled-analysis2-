package bo.app;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import o.beforeInAppMessageViewClosed;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final class w5 {
    public static final v5 d = new v5();
    public final lh a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;

    public final o1 e() {
        o1 o1Var;
        synchronized (this) {
            Collection collectionValues = this.b.values();
            collectionValues.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : collectionValues) {
                obj.getClass();
                g9 g9Var = (g9) obj;
                linkedHashSet.add(g9Var);
                collectionValues.remove(g9Var);
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda4(g9Var, 8), 7, (Object) null);
                if (linkedHashSet.size() >= 32) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(4), 6, (Object) null);
                    break;
                }
            }
            o1Var = new o1(linkedHashSet);
        }
        return o1Var;
    }

    public static final String b() {
        return "Push permissions were granted, setting user push notifications to opt-in";
    }

    public static final String c() {
        return "Push permissions were granted, but blocking automatic opt-in";
    }

    public static final String d() {
        return "Flushing pending events to dispatcher map";
    }

    public w5(lh lhVar) {
        lhVar.getClass();
        this.a = lhVar;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        lhVar.i.c(u5.class, new b2$$ExternalSyntheticLambda8(2, this));
    }

    public final void a(r4 r4Var) {
        ArrayList arrayList;
        List list;
        String strForJsonPut;
        r4Var.getClass();
        lh lhVar = this.a;
        r4Var.q = ((i5) lhVar.d).c;
        r4Var.m = lhVar.b.getSdkFlavor();
        r4Var.r = ((i5) this.a.d).c();
        lh lhVar2 = this.a;
        o9 o9Var = lhVar2.d;
        f5 f5Var = lhVar2.h;
        if (f5Var != null) {
            i5 i5Var = (i5) o9Var;
            i5Var.getClass();
            f5Var.d = i5Var.b();
            d5 d5Var = (d5) f5Var.a();
            r4Var.j = d5Var;
            if (d5Var != null && d5Var.l) {
                if (this.a.b.getShouldOptInWhenPushAuthorized()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(6), 6, (Object) null);
                    ih ihVarA = this.a.a();
                    NotificationSubscriptionType notificationSubscriptionType = NotificationSubscriptionType.OPTED_IN;
                    synchronized (ihVarA) {
                        if (notificationSubscriptionType != null) {
                            try {
                                strForJsonPut = notificationSubscriptionType.forJsonPut();
                            } catch (Throwable th) {
                                throw th;
                            }
                        } else {
                            strForJsonPut = null;
                        }
                        ihVarA.c("push_subscribe", strForJsonPut);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(7), 6, (Object) null);
                }
            }
            if (d5Var != null && d5Var.forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
                this.a.a().j();
            }
            r4Var.n = (ub) this.a.a().a();
            o1 o1VarE = e();
            r4Var.f22o = o1VarE;
            LinkedHashSet linkedHashSet = o1VarE.a;
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (((n1) ((g9) it.next())).a == e8.SESSION_START) {
                        lh lhVar3 = this.a;
                        re reVar = lhVar3.s;
                        EnumSet<BrazeSdkMetadata> sdkMetadata = lhVar3.b.getSdkMetadata();
                        reVar.getClass();
                        sdkMetadata.getClass();
                        com.braze.storage.o oVar = reVar.a;
                        DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
                            arrayList = new ArrayList();
                        } else {
                            try {
                                Object data = oVar.readData(dataStoreKey, "");
                                data.getClass();
                                String str = (String) data;
                                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                                    arrayList = new ArrayList();
                                } else {
                                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                                    if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                                        list = instance_delegatelambda0.write;
                                    } else {
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"}, getCieXyz.write())).booleanValue()) {
                                            list = instance_delegatelambda0.write;
                                        } else {
                                            try {
                                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                                isverticalswipeinalloweddirection.getClass();
                                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                                            } catch (Exception e) {
                                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
                                                list = instance_delegatelambda0.write;
                                            }
                                        }
                                    }
                                    arrayList = onContentCardDismissed.IconCompatParcelizer((Collection) list);
                                }
                            } catch (Exception e2) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                                arrayList = new ArrayList();
                            }
                        }
                        r4Var.p = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{com.braze.support.d.a(sdkMetadata), onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList)}, getCieXyz.write())).booleanValue() ? null : sdkMetadata;
                        break;
                    }
                }
            }
            if (r4Var.l.b()) {
                r4Var.s = this.a.B.f();
                return;
            }
            return;
        }
        removeNodeAtDepth.serializer("deviceCache");
        throw null;
    }

    public static final void a(w5 w5Var, u5 u5Var) {
        u5Var.getClass();
        t5 t5Var = u5Var.a;
        List<g9> list = u5Var.b;
        hf hfVar = u5Var.c;
        int iOrdinal = t5Var.ordinal();
        if (iOrdinal == 0) {
            w5Var.getClass();
            list.getClass();
            for (g9 g9Var : list) {
                w5Var.c.putIfAbsent(((n1) g9Var).d, g9Var);
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                return;
            }
            w5Var.a(hfVar);
        } else {
            w5Var.getClass();
            list.getClass();
            for (g9 g9Var2 : list) {
                w5Var.b.putIfAbsent(((n1) g9Var2).d, g9Var2);
            }
        }
    }

    public static final String a(g9 g9Var) {
        n1 n1Var = (n1) g9Var;
        return "Event dispatched: " + n1Var.forJsonPut() + " with uid: " + n1Var.d;
    }

    public static final String a() {
        return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
    }

    public final void a(hf hfVar) {
        if (hfVar == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(5), 7, (Object) null);
        Collection collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((n1) ((g9) it.next())).a(hfVar);
        }
        this.b.putAll(concurrentHashMap);
        Set setKeySet = concurrentHashMap.keySet();
        setKeySet.getClass();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            this.c.remove((String) it2.next());
        }
    }

    public final l9 a(l9 l9Var) {
        l9Var.getClass();
        v5 v5Var = d;
        lh lhVar = this.a;
        v5Var.a(lhVar.b, lhVar.q, l9Var, ((l5) lhVar.c).a());
        if (l9Var instanceof r4) {
            a((r4) l9Var);
            return l9Var;
        }
        if (l9Var instanceof rc) {
            ((rc) l9Var).j = ((i5) this.a.d).b();
            return l9Var;
        }
        if (l9Var instanceof e4) {
            d4 d4Var = this.a.y;
            e4 e4Var = (e4) l9Var;
            e4Var.l = d4Var.d;
            e4Var.m = d4Var.e;
        }
        return l9Var;
    }
}
