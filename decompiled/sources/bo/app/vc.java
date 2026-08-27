package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import o.SimpleItemTouchHelperCallback;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.getWasCloseMessageCalled;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isVerticalSwipeInAllowedDirection;
import o.onClickedlambda0;
import o.onDismissed;
import o.onMove;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class vc {
    public static final long b = 3888000;
    public final com.braze.storage.k a;

    public static final String c() {
        return "Push dedupe id is blank. Returning true.";
    }

    public final Map a() {
        beforeOpened beforeopened;
        com.braze.storage.k kVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object data = kVar.readData(dataStoreKey, "");
            data.getClass();
            String str = (String) data;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                return new LinkedHashMap();
            }
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
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) uc.a, 6, (Object) null);
                        }
                        Object objSerializer = resetTransientState.read.serializer(str, beforeopened);
                        objSerializer.getClass();
                        map = (Map) objSerializer;
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreUtils.b(str), 4, (Object) null);
                    }
                }
            }
            return pauseWebviewIfNecessarylambda10.serializer(new LinkedHashMap(map));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }

    public vc(Context context, String str, String str2) {
        context.getClass();
        this.a = new com.braze.storage.k(context, str2, str);
        b();
    }

    public final void b() {
        String strRemoteActionCompatParcelizer;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() - b;
        LinkedHashMap linkedHashMapWrite = onMove.write(a());
        Iterator it = linkedHashMapWrite.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).longValue() < jNowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new vc$$ExternalSyntheticLambda2(jNowInSeconds, 0, entry), 6, (Object) null);
                it.remove();
            }
        }
        com.braze.storage.k kVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), linkedHashMapWrite);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = "{}";
            }
            kVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String b(String str) {
        return ff$$ExternalSyntheticOutline0.m("Push dedupe id ", str, " has already been seen. Returning false.");
    }

    public static final String a(Map.Entry entry, long j) {
        return "Evicting push id key " + entry.getKey() + " based on cutoff: " + j;
    }

    public final boolean a(String str) {
        String strRemoteActionCompatParcelizer;
        str.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new s8$$ExternalSyntheticLambda0(24), 7, (Object) null);
            return true;
        }
        if (a().containsKey(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 28), 7, (Object) null);
            return false;
        }
        b();
        LinkedHashMap linkedHashMapWrite = onMove.write(a());
        linkedHashMapWrite.put(str, Long.valueOf(DateTimeUtils.nowInSeconds()));
        com.braze.storage.k kVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return true;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), linkedHashMapWrite);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = "{}";
            }
            kVar.writeData(dataStoreKey, strRemoteActionCompatParcelizer);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.Companion.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
        return true;
    }
}
