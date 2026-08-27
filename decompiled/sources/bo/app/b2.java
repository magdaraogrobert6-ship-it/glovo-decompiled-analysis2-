package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt__LazyJVMKt;
import o.SimpleItemTouchHelperCallback;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getInAppMessageEventMap;
import o.getWasCloseMessageCalled;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isVerticalSwipeInAllowedDirection;
import o.onClickedlambda0;
import o.onDismissed;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class b2 {
    public final GeofenceDataStoreProvider a;
    public final ConcurrentHashMap b;
    public final AtomicBoolean c;
    public long d;
    public long e;
    public int f;
    public int g;

    public static final String b(long j, int i, String str, GeofenceTransitionType geofenceTransitionType) {
        return j + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public b2(df dfVar, u9 u9Var, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        dfVar.getClass();
        u9Var.getClass();
        geofenceDataStoreProvider.getClass();
        this.a = geofenceDataStoreProvider;
        ((z7) u9Var).c(gf.class, new b2$$ExternalSyntheticLambda8(0, this));
        this.b = a();
        this.c = new AtomicBoolean(false);
        Object data = geofenceDataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REQUEST, 0L);
        data.getClass();
        this.d = ((Long) data).longValue();
        Object data2 = geofenceDataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REPORT, 0L);
        data2.getClass();
        this.e = ((Long) data2).longValue();
        this.f = dfVar.u();
        this.g = dfVar.t();
    }

    public static final String c(String str) {
        return ff$$ExternalSyntheticOutline0.m("Deleting outdated id ", str, " from re-eligibility list.");
    }

    public static final String d(String str) {
        return ff$$ExternalSyntheticOutline0.m("Retaining id ", str, " in re-eligibility list.");
    }

    public final boolean a(long j, BrazeGeofence brazeGeofence, final GeofenceTransitionType geofenceTransitionType) {
        int cooldownExitSeconds;
        Map linkedHashMap;
        beforeOpened beforeopened;
        String strRemoteActionCompatParcelizer;
        brazeGeofence.getClass();
        geofenceTransitionType.getClass();
        final String id = brazeGeofence.getId();
        final long j2 = j - this.e;
        if (this.g > j2) {
            final int i = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.b2$$ExternalSyntheticLambda12
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    String str = id;
                    b2 b2Var = this;
                    long j3 = j2;
                    return i2 != 0 ? b2.b(j3, b2Var, str) : b2.a(j3, b2Var, str);
                }
            }, 7, (Object) null);
            return false;
        }
        String strA = a(id, geofenceTransitionType);
        if (geofenceTransitionType == GeofenceTransitionType.ENTER) {
            cooldownExitSeconds = brazeGeofence.getCooldownEnterSeconds();
        } else {
            cooldownExitSeconds = brazeGeofence.getCooldownExitSeconds();
        }
        final int i2 = cooldownExitSeconds;
        if (this.b.containsKey(strA)) {
            Long l = (Long) this.b.get(strA);
            if (l != null) {
                final long jLongValue = j - l.longValue();
                if (i2 > jLongValue) {
                    final int i3 = 0;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.b2$$ExternalSyntheticLambda13
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i4 = i3;
                            GeofenceTransitionType geofenceTransitionType2 = geofenceTransitionType;
                            String str = id;
                            int i5 = i2;
                            long j3 = jLongValue;
                            return i4 != 0 ? b2.b(j3, i5, str, geofenceTransitionType2) : b2.a(j3, i5, str, geofenceTransitionType2);
                        }
                    }, 7, (Object) null);
                    return false;
                }
                final int i4 = 1;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.b2$$ExternalSyntheticLambda13
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i5 = i4;
                        GeofenceTransitionType geofenceTransitionType2 = geofenceTransitionType;
                        String str = id;
                        int i6 = i2;
                        long j3 = jLongValue;
                        return i5 != 0 ? b2.b(j3, i6, str, geofenceTransitionType2) : b2.a(j3, i6, str, geofenceTransitionType2);
                    }
                }, 7, (Object) null);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda15(id, geofenceTransitionType, 0), 7, (Object) null);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        final int i5 = 1;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.b2$$ExternalSyntheticLambda12
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i6 = i5;
                String str = id;
                b2 b2Var = this;
                long j3 = j2;
                return i6 != 0 ? b2.b(j3, b2Var, str) : b2.a(j3, b2Var, str);
            }
        }, 7, (Object) null);
        this.b.put(strA, Long.valueOf(j));
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    Map map = SimpleItemTouchHelperCallback.serializer;
                    if (!zSerializer) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"}, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Long.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer});
                                } else {
                                    BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) z1.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str), 4, (Object) null);
                            }
                        }
                    }
                    linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        linkedHashMap.put(strA, Long.valueOf(j));
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), linkedHashMap);
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer = "{}";
                }
                geofenceDataStoreProvider2.writeData(dataStoreKey2, strRemoteActionCompatParcelizer);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
            }
        }
        this.e = j;
        this.a.writeData(DataStoreKey.GLOBAL_LAST_REPORT, Long.valueOf(j));
        return true;
    }

    public static final String c() {
        return "Geofences have already been requested for the current session. Geofence request not eligible.";
    }

    public static final String c(long j) {
        return af$$ExternalSyntheticOutline0.m(j, "Updating the last successful location request time to: ");
    }

    public static final String b(String str, GeofenceTransitionType geofenceTransitionType) {
        return "Geofence report eligible since this geofence/transition combination has never been reported.id:" + str + " transition:" + geofenceTransitionType;
    }

    public static final String b(long j, b2 b2Var, String str) {
        int i = b2Var.g;
        StringBuilder sb = new StringBuilder("Geofence report eligible since ");
        sb.append(j);
        sb.append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
        sb.append(i);
        return ff$$ExternalSyntheticOutline0.m(sb, "). id:", str);
    }

    public static final String b(long j, b2 b2Var) {
        return j + " seconds have passed since the last time geofences were requested (minimum interval: " + b2Var.f + ").";
    }

    public static final String b() {
        return "Geofences have not been requested for the current session yet. Request is eligible.";
    }

    public final void b(long j) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(j, 1), 7, (Object) null);
        this.d = j;
        this.a.writeData(DataStoreKey.GLOBAL_LAST_REQUEST, Long.valueOf(j));
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Exception trying to parse re-eligibility id: ", str);
    }

    public static final String b(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Min time since last geofence report reset via server configuration: ", ".");
    }

    public static final void a(b2 b2Var, gf gfVar) {
        gfVar.getClass();
        b2Var.c.set(false);
    }

    public final void a(List list) {
        Map linkedHashMap;
        beforeOpened beforeopened;
        String strRemoteActionCompatParcelizer;
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.b.keySet());
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    Map map = SimpleItemTouchHelperCallback.serializer;
                    if (!zSerializer) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"}, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Long.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE))) {
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer});
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) a2.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str), 4, (Object) null);
                            }
                        }
                    }
                    linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map map2 = linkedHashMap;
        Iterator it2 = hashSet.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            str2.getClass();
            if (!linkedHashSet.contains(a(str2))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str2, 4), 7, (Object) null);
                this.b.remove(str2);
                map2.remove(str2);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str2, 5), 7, (Object) null);
            }
        }
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), map2);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (map2 == null && (map2 instanceof List)) ? "[]" : "{}";
            }
            geofenceDataStoreProvider2.writeData(dataStoreKey2, strRemoteActionCompatParcelizer);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    public final void a(af afVar) {
        afVar.getClass();
        int i = afVar.e;
        if (i >= 0) {
            this.f = i;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i, 3), 6, (Object) null);
        }
        int i2 = afVar.f;
        if (i2 >= 0) {
            this.g = i2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda0(i2, 2), 6, (Object) null);
        }
    }

    public static final String a(long j, b2 b2Var, String str) {
        int i = b2Var.g;
        StringBuilder sb = new StringBuilder("Geofence report suppressed since only ");
        sb.append(j);
        sb.append(" seconds have passed since the last time geofences were reported globally (minimum interval: ");
        sb.append(i);
        return ff$$ExternalSyntheticOutline0.m(sb, "). id:", str);
    }

    public static final String a(long j, int i, String str, GeofenceTransitionType geofenceTransitionType) {
        return "Geofence report suppressed since only " + j + " seconds have passed since the last time this geofence/transition combination was reported (minimum interval: " + i + "). id:" + str + " transition:" + geofenceTransitionType;
    }

    public final boolean a(boolean z, long j) {
        final long j2 = j - this.d;
        final int i = 0;
        if (!z && this.f > j2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.b2$$ExternalSyntheticLambda2
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i2 = i;
                    b2 b2Var = this;
                    long j3 = j2;
                    return i2 != 0 ? b2.b(j3, b2Var) : b2.a(j3, b2Var);
                }
            }, 7, (Object) null);
            return false;
        }
        final int i2 = 1;
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b2$$ExternalSyntheticLambda3(j2, 0), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.b2$$ExternalSyntheticLambda2
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i2;
                    b2 b2Var = this;
                    long j3 = j2;
                    return i3 != 0 ? b2.b(j3, b2Var) : b2.a(j3, b2Var);
                }
            }, 7, (Object) null);
        }
        if (this.c.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(19), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(20), 7, (Object) null);
        return false;
    }

    public static final String a(long j, b2 b2Var) {
        return "Geofence request suppressed since only " + j + " seconds have passed since the last time geofences were requested (minimum interval: " + b2Var.f + ").";
    }

    public static final String a(long j) {
        return af$$ExternalSyntheticOutline0.m(j, "Ignoring rate limit for this geofence request. Elapsed time since last request:");
    }

    public final String a(String str) {
        str.getClass();
        try {
            return (String) new getInAppMessageEventMap(BundleUtil.UNDERLINE_TAG).write(2, (CharSequence) str).get(1);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 6), 4, (Object) null);
            return null;
        }
    }

    public static String a(String str, GeofenceTransitionType geofenceTransitionType) {
        str.getClass();
        geofenceTransitionType.getClass();
        String string = geofenceTransitionType.toString();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        return af$$ExternalSyntheticOutline0.m(lowerCase, BundleUtil.UNDERLINE_TAG, str);
    }

    public static final String a(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Min time since last geofence request reset via server configuration: ", ".");
    }

    public final ConcurrentHashMap a() {
        Map linkedHashMap;
        beforeOpened beforeopened;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object data = geofenceDataStoreProvider.readData(dataStoreKey, "");
                data.getClass();
                String str = (String) data;
                if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
                    Map map = SimpleItemTouchHelperCallback.serializer;
                    if (!zSerializer) {
                        Object[] objArr = {hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString(), "null"};
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                            try {
                                r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(Long.class);
                                if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(String.class))) {
                                    beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                                    int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), new Object[]{beforeinappmessageviewclosed, beforeinappmessageviewclosed});
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Long.TYPE))) {
                                    Object[] objArr2 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr2);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Boolean.TYPE))) {
                                    Object[] objArr3 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr3);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Integer.TYPE))) {
                                    Object[] objArr4 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr4);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Double.TYPE))) {
                                    Object[] objArr5 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr5);
                                } else if (r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer.equals(displayInAppMessagelambda1.serializer(Float.TYPE))) {
                                    Object[] objArr6 = {beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onClickedlambda0.serializer};
                                    beforeopened = (beforeOpened) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -2117095876, 2117095882, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr6);
                                } else {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) y1.a, 6, (Object) null);
                                }
                                Object objSerializer = resetTransientState.read.serializer(str, beforeopened);
                                objSerializer.getClass();
                                map = (Map) objSerializer;
                            } catch (Exception e) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str), 4, (Object) null);
                            }
                        }
                    }
                    linkedHashMap = pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda2(this, 7, str2), 7, (Object) null);
            concurrentHashMap.put(str2, Long.valueOf(jLongValue));
        }
        return concurrentHashMap;
    }

    public static final String a(b2 b2Var, String str) {
        return ff$$ExternalSyntheticOutline0.m("Retrieving geofence id ", b2Var.a(str), " eligibility information from local storage.");
    }
}
