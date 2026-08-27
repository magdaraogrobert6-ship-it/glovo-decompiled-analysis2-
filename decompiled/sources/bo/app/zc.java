package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import o.SimpleItemTouchHelperCallback;
import o.accessgetInstancedelegatecp;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getWasCloseMessageCalled;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isVerticalSwipeInAllowedDirection;
import o.onClickedlambda0;
import o.onDismissed;
import o.onMove;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class zc {
    public final df a;
    public final com.braze.storage.l b;

    public final List a() {
        Map linkedHashMap;
        beforeOpened beforeopened;
        try {
            com.braze.storage.l lVar = this.b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object data = lVar.readData(dataStoreKey, "");
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
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) yc.a, 6, (Object) null);
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
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new xc((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            return arrayList;
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new v6$$ExternalSyntheticLambda7(20), 4, (Object) null);
            return instance_delegatelambda0.write;
        }
    }

    public zc(Context context, String str, String str2, z7 z7Var, df dfVar) {
        context.getClass();
        str.getClass();
        z7Var.getClass();
        dfVar.getClass();
        this.a = dfVar;
        this.b = new com.braze.storage.l(context, str2, str);
        z7Var.c(ad.class, new b2$$ExternalSyntheticLambda8(3, this));
        c();
    }

    public static final String b(String str, long j) {
        return "Adding push campaign to storage with uid " + str + " and time " + j;
    }

    public final void c() {
        String strRemoteActionCompatParcelizer;
        long jNowInSeconds = DateTimeUtils.nowInSeconds();
        List listA = a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((xc) obj).b >= jNowInSeconds - 3888000) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != listA.size()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda2(listA, 14, arrayList), 7, (Object) null);
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList, 10));
            if (iRemoteActionCompatParcelizer < 16) {
                iRemoteActionCompatParcelizer = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                xc xcVar = (xc) obj2;
                linkedHashMap.put(xcVar.a, Long.valueOf(xcVar.b));
            }
            boolean zIsEmpty = linkedHashMap.isEmpty();
            com.braze.storage.l lVar = this.b;
            if (zIsEmpty) {
                lVar.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                return;
            }
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
                return;
            }
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                    isverticalswipeinalloweddirection.getClass();
                    strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), linkedHashMap);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer = "{}";
                }
                lVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
    }

    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Adding push campaign to storage with uid ", str);
    }

    public static final String b() {
        return "Error reading push max campaign data from DataStore.";
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new w8$$ExternalSyntheticLambda1(str, 9), 7, (Object) null);
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return;
        }
        a(str, DateTimeUtils.nowInSeconds());
    }

    public static final String a(List list, List list2) {
        return d$$ExternalSyntheticOutline0.m(list.size() - list2.size(), "Pruning ", " expired campaigns");
    }

    public final void a(String str, long j) {
        String strRemoteActionCompatParcelizer;
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new zc$$ExternalSyntheticLambda0(str, j, 0), 7, (Object) null);
        List<xc> listA = a();
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(listA, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        for (xc xcVar : listA) {
            linkedHashMap.put(xcVar.a, Long.valueOf(xcVar.b));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(str, Long.valueOf(j));
        com.braze.storage.l lVar = this.b;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), linkedHashMap2);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = "{}";
            }
            lVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final void a(zc zcVar, ad adVar) {
        adVar.getClass();
        zcVar.b.writeData(DataStoreKey.PUSH_MAX_LAST_UPDATE, Long.valueOf(adVar.a));
    }
}
