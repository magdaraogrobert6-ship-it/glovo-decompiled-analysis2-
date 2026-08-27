package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import o.accessgetInstancedelegatecp;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageEventSubscriber;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isCurrentlyDisplayingInAppMessage;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;
import o.setWasCloseMessageCalled;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vg {
    public static final sg p = new sg();
    public static final long q = 30000;
    public final Context a;
    public final h2 b;
    public final z7 c;
    public final u9 d;
    public final long e;
    public final com.braze.storage.t f;
    public final ig g;
    public final zg h;
    public final ArrayDeque i;
    public final LinkedHashMap j;
    public long k;
    public volatile long l;
    public final ReentrantLock m;
    public final ReentrantLock n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qd f26o;

    public static final String i() {
        return "Trigger request is in-flight. Not processing trigger event.";
    }

    public static final String k() {
        return "No triggered actions found in DataStore";
    }

    public static final String l() {
        return "Skipping blank triggered action string from DataStore";
    }

    public static final String m() {
        return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
    }

    public static final String n() {
        return "Triggered action has no fallback action to perform. Doing nothing.";
    }

    public static final String p() {
        return "Subscribing to trigger dispatch events.";
    }

    public static final String q() {
        return "Executing pending events after trigger dispatch completed.";
    }

    public final void b() {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (a()) {
                reentrantLock.unlock();
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(27), 7, (Object) null);
            while (!this.i.isEmpty()) {
                da daVar = (da) this.i.poll();
                if (daVar != null) {
                    a(daVar);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ga d(da daVar) {
        daVar.getClass();
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.j.values().iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                ah ahVar = (ah) ((ga) it.next());
                if (ahVar.b(daVar) && this.h.a(ahVar) && p.a(daVar, ahVar, this.l, this.e)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(24, ahVar), 7, (Object) null);
                    int i2 = ahVar.b.c;
                    if (i2 > i) {
                        createinappmessageeventsubscriber.IconCompatParcelizer = ahVar;
                        i = i2;
                    }
                    arrayList.add(ahVar);
                }
            }
            Object obj = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new vg$$ExternalSyntheticLambda7(daVar, 0), 7, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((ah) ((ga) createinappmessageeventsubscriber.IconCompatParcelizer)).d = new wg(arrayList);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(daVar, 15, createinappmessageeventsubscriber), 7, (Object) null);
            ga gaVar = (ga) createinappmessageeventsubscriber.IconCompatParcelizer;
            reentrantLock.unlock();
            return gaVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final fh f() {
        fh fhVarA = fh.f.a(h().readString(DataStoreKey.TRIGGERS_CHECKSUM, null));
        if (fhVarA == null) {
            return null;
        }
        Map map = fhVarA.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.j.containsKey((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(fhVarA, 14, linkedHashMap), 6, (Object) null);
        if (!linkedHashMap.isEmpty()) {
            return new fh(fhVarA.a, fhVarA.b, linkedHashMap);
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(3), 6, (Object) null);
        return null;
    }

    public final LinkedHashMap j() {
        ArrayList<String> arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.braze.storage.t tVarH = h();
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object data = tVarH.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    List list = instance_delegatelambda0.write;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                                isverticalswipeinalloweddirection.getClass();
                                list = (List) isverticalswipeinalloweddirection.serializer(str, new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0));
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.a(str), 4, (Object) null);
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
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(2), 7, (Object) null);
            return linkedHashMap;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g0$$ExternalSyntheticLambda8(2, arrayList), 7, (Object) null);
        for (String str2 : arrayList) {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(3), 7, (Object) null);
            } else {
                try {
                    try {
                        ch chVarB = xg.a.b(new JSONObject(str2), this.b);
                        if (chVarB != null) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(26, chVarB), 7, (Object) null);
                            linkedHashMap.put(chVarB.a, chVarB);
                        }
                    } catch (Exception e3) {
                        e = e3;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str2, 13), 4, (Object) null);
                    }
                } catch (Exception e4) {
                    e = e4;
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda0(27, linkedHashMap), 7, (Object) null);
        return linkedHashMap;
    }

    public final void o() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(1), 6, (Object) null);
        this.c.c(mg.class, new b2$$ExternalSyntheticLambda8(1, this));
    }

    public vg(Context context, h2 h2Var, z7 z7Var, u9 u9Var, BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, qd qdVar) {
        context.getClass();
        h2Var.getClass();
        z7Var.getClass();
        u9Var.getClass();
        brazeConfigurationProvider.getClass();
        str2.getClass();
        qdVar.getClass();
        this.m = new ReentrantLock();
        this.n = new ReentrantLock();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = h2Var;
        this.c = z7Var;
        this.d = u9Var;
        this.e = brazeConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        this.f = new com.braze.storage.t(context, str, str2);
        this.g = new ig(context, str2);
        this.h = new zg(h());
        this.j = j();
        this.i = new ArrayDeque();
        this.f26o = qdVar;
        o();
    }

    public final void c(ga gaVar) {
        gaVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar, 6), 7, (Object) null);
        b(this.k);
        this.k = 0L;
        this.h.e(gaVar);
    }

    public final void a(List list, fh fhVar) {
        String strRemoteActionCompatParcelizer;
        this.j.clear();
        h().clearData(DataStoreKey.TRIGGERED_ACTIONS);
        if (fhVar == null) {
            h().clearData(DataStoreKey.TRIGGERS_CHECKSUM);
        } else {
            com.braze.storage.t tVarH = h();
            DataStoreKey dataStoreKey = DataStoreKey.TRIGGERS_CHECKSUM;
            String string = fhVar.a().toString();
            string.getClass();
            tVarH.writeData(dataStoreKey, string);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d0$$ExternalSyntheticLambda0(list, 4), 7, (Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ga gaVar = (ga) it.next();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar, 4), 7, (Object) null);
            this.j.put(((ah) gaVar).a, gaVar);
        }
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((ga) it2.next()).forJsonPut()));
        }
        com.braze.storage.t tVarH2 = h();
        DataStoreKey dataStoreKey2 = DataStoreKey.TRIGGERED_ACTIONS;
        if (dataStoreKey2.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.o(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), arrayList);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    if (arrayList instanceof Map) {
                        strRemoteActionCompatParcelizer = "{}";
                    } else {
                        strRemoteActionCompatParcelizer = "[]";
                    }
                }
                tVarH2.writeData(dataStoreKey2, strRemoteActionCompatParcelizer);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.p(dataStoreKey2), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d0$$ExternalSyntheticLambda0(list, 5), 7, (Object) null);
    }

    public static final String e(List list) {
        return "Clearing stored triggers checksum and re-requesting triggers because " + list.size() + " reuse-by-id reference(s) are missing locally: " + list;
    }

    public static final String g(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Retrieved ", " triggered actions from DataStore");
    }

    public final com.braze.storage.t h() {
        com.braze.storage.t tVar = this.f;
        if (tVar != null) {
            return tVar;
        }
        removeNodeAtDepth.serializer("triggerDataStoreProvider");
        throw null;
    }

    public static final String g() {
        return "Filtered triggers checksum map is empty. Returning null.";
    }

    public static final String g(ga gaVar) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Fallback trigger has expired. Trigger id: ", ((ah) gaVar).a);
    }

    public static final String e() {
        return "No test triggered actions found.";
    }

    public static final String e(da daVar) {
        return ff$$ExternalSyntheticOutline0.m("Failed to match triggered action for incoming <", daVar.a(), ">.");
    }

    public static final String e(ga gaVar) {
        return ff$$ExternalSyntheticOutline0.m("Retrieving templated triggered action id ", ((ah) gaVar).a, " from DataStore.");
    }

    public static final String c(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Successfully saved ", " triggered actions to DataStore");
    }

    public static final String c(da daVar) {
        return ff$$ExternalSyntheticOutline0.m("No action found for ", daVar.a(), " event, publishing NoMatchingTriggerEvent");
    }

    public static final String c() {
        return "In flight trigger requests is empty. Executing any pending trigger events.";
    }

    public static final String b(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Registering ", " triggered actions.");
    }

    public static final String b(ga gaVar) {
        return ff$$ExternalSyntheticOutline0.m("Registering triggered action id ", ((ah) gaVar).a, " ");
    }

    public static final String b(da daVar) {
        return ff$$ExternalSyntheticOutline0.m("New incoming <", daVar.a(), ">. Searching for matching triggers.");
    }

    public final void b(long j) {
        this.k = this.l;
        this.l = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(j, 9), 7, (Object) null);
    }

    public static final String b(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to parse triggered action JSON:'", str, "' from DataStore.");
    }

    public final List f(List list) {
        if (list.isEmpty()) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ga gaVar = (ga) this.j.get(str);
            if (gaVar == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 29), 6, (Object) null);
                return null;
            }
            arrayList.add(gaVar);
        }
        return arrayList;
    }

    public static final String f(ga gaVar) {
        return ff$$ExternalSyntheticOutline0.m("Trigger manager received failed triggered action with id: <", ((ah) gaVar).a, ">. Will attempt to perform fallback triggered actions, if present.");
    }

    public static final String d(ga gaVar) {
        return ff$$ExternalSyntheticOutline0.m("Trigger manager received reenqueue with action with id: <", ((ah) gaVar).a, ">.");
    }

    public static final String d() {
        return "Test triggered actions found, triggering test event.";
    }

    public final void d(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.j.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda4(3, arrayList), 6, (Object) null);
        h().clearData(DataStoreKey.TRIGGERS_CHECKSUM);
        h2 h2Var = this.b;
        sb sbVar = new sb();
        sbVar.b = Boolean.TRUE;
        h2Var.a(sbVar);
    }

    public static final String a(long j) {
        return af$$ExternalSyntheticOutline0.m(j, "TriggerManager lastDisplayTimeSeconds updated to ");
    }

    public final void a(List list, fh fhVar, List list2) {
        list.getClass();
        list2.getClass();
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            List listF = f(list2);
            if (listF == null) {
                d(list2);
                reentrantLock.unlock();
                return;
            }
            List listA = a(list, listF);
            a(listA, fhVar);
            reentrantLock.unlock();
            zg zgVar = this.h;
            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
            zgVar.a(listA, null, instance_delegatelambda0Var);
            this.g.a(listA, null, instance_delegatelambda0Var);
            a(listA);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a(String str) {
        return ff$$ExternalSyntheticOutline0.m("Server referenced reuse-by-id trigger '", str, "' that is missing from local storage.");
    }

    public static List a(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer(list, list2);
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayListIconCompatParcelizer, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (Object obj : arrayListIconCompatParcelizer) {
            linkedHashMap.put(((ah) ((ga) obj)).a, obj);
        }
        return onContentCardDismissed.PlaybackStateCompat(linkedHashMap.values());
    }

    public static final String a(fh fhVar, Map map) {
        return "stored checksum of '" + fhVar.c + "' was filtered to " + map;
    }

    public final void a(List list) {
        dg dgVar = new dg();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ah) ((ga) it.next())).b(dgVar)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(29), 6, (Object) null);
                    a((pg) dgVar);
                    return;
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(1), 7, (Object) null);
    }

    public final void a(pg pgVar) {
        pgVar.getClass();
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            this.i.add(pgVar);
            if (!a()) {
                b();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w$$ExternalSyntheticLambda0(2), 7, (Object) null);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(da daVar, ga gaVar) {
        daVar.getClass();
        gaVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar, 3), 7, (Object) null);
        wg wgVar = ((ah) gaVar).d;
        if (wgVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(25), 7, (Object) null);
            return;
        }
        ga gaVar2 = (ga) wgVar.a.poll();
        if (gaVar2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(26), 7, (Object) null);
            return;
        }
        ah ahVar = (ah) gaVar2;
        ahVar.d = wgVar;
        Map mapA = this.g.a(gaVar2);
        mapA.getClass();
        ((ch) gaVar2).f = new HashMap(mapA);
        long j = ((pg) daVar).b;
        wd wdVar = ahVar.b;
        long j2 = wdVar.e;
        long millis = TimeUnit.SECONDS.toMillis(wdVar.d);
        long j3 = j2 != -1 ? j2 + j : j + millis + q;
        if (j3 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new hg$$ExternalSyntheticLambda6(gaVar2, 5), 7, (Object) null);
            a(daVar, gaVar2);
        } else {
            long jMax = Math.max(0L, (millis + j) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new zg$$ExternalSyntheticLambda3(gaVar2, jMax, 1), 7, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(jMax), null, new ug(gaVar2, this, daVar, j3, null), 2, null);
        }
    }

    public static final String a(ga gaVar, long j) {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Performing fallback triggered action with id: <", ((ah) gaVar).a, j, "> with a delay: ");
        sbM.append(" ms");
        return sbM.toString();
    }

    public static final void a(vg vgVar, mg mgVar) {
        mgVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) vgVar, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(28), 6, (Object) null);
        vgVar.b();
    }

    public final void a(da daVar) {
        daVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new vg$$ExternalSyntheticLambda7(daVar, 1), 7, (Object) null);
        ga gaVarD = d(daVar);
        if (gaVarD != null) {
            Map mapA = this.g.a(gaVarD);
            mapA.getClass();
            ((ch) gaVarD).f = new HashMap(mapA);
            wd wdVar = ((ah) gaVarD).b;
            int i = wdVar.e;
            long j = i != -1 ? ((pg) daVar).b + ((long) i) : -1L;
            long millis = TimeUnit.SECONDS.toMillis(wdVar.d);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new tg(this, gaVarD, daVar, j, millis, null), 2, null);
            return;
        }
        String strA = daVar.a();
        int iHashCode = strA.hashCode();
        if (iHashCode != 3417674) {
            if (iHashCode != 717572172) {
                if (iHashCode != 1743324417 || !strA.equals("purchase")) {
                    return;
                }
            } else if (!strA.equals("custom_event")) {
                return;
            }
        } else if (!strA.equals("open")) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new vg$$ExternalSyntheticLambda7(daVar, 2), 7, (Object) null);
        u9 u9Var = this.d;
        if (u9Var != null) {
            String strA2 = daVar.a();
            strA2.getClass();
            ((z7) u9Var).b(new NoMatchingTriggerEvent(strA2), NoMatchingTriggerEvent.class);
            return;
        }
        removeNodeAtDepth.serializer("externalEventMessenger");
        throw null;
    }

    public static final String a(ga gaVar) {
        return ff$$ExternalSyntheticOutline0.m("Found potential triggered action for incoming trigger event. Action id ", ((ah) gaVar).a, ".");
    }

    public static final String a(da daVar, createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        String prettyPrintedString;
        g9 g9Var = ((pg) daVar).c;
        if (g9Var != null) {
            prettyPrintedString = JsonUtils.getPrettyPrintedString(((n1) g9Var).forJsonPut());
        } else {
            prettyPrintedString = "";
        }
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("\n                Found best triggered action for incoming trigger event " + prettyPrintedString + ".\n                Matched Action id: " + ((ah) ((ga) createinappmessageeventsubscriber.IconCompatParcelizer)).a + ".\n                ");
    }

    public static final String a(Map map) {
        return d$$ExternalSyntheticOutline0.m(map.size(), "Successfully loaded ", " triggered actions from DataStore");
    }

    public final boolean a() {
        k7 k7Var = (k7) this.f26o.e.get(k9.V3_DATA);
        if (!(k7Var instanceof l4)) {
            return false;
        }
        ArrayList arrayList = ((l4) k7Var).e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rd rdVar = (rd) obj;
            l9 l9Var = rdVar.a;
            if ((l9Var instanceof r4) && ((r4) l9Var).l.b() && rdVar.d == sd.IN_FLIGHT) {
                return true;
            }
        }
        return false;
    }
}
