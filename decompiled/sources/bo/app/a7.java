package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.onDismissed;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class a7 {
    public static final String b(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Migrated last request timestamp key: ", str);
    }

    public static final String c() {
        return "Failed to migrate endpoint metadata to DataStore.";
    }

    public static final String b() {
        return "Starting migration for endpoint metadata";
    }

    public static backwardFocusSearch a(getNoActiveChildannotations getnoactivechildannotations, isRoot isroot, isRoot isroot2, Map map, Map map2) {
        String strRemoteActionCompatParcelizer;
        backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
        isroot.getClass();
        LinkedHashMap linkedHashMap = ((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer2 = "{}";
        if (!linkedHashMap.containsKey(isroot)) {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), map);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (map == null && (map instanceof List)) ? "[]" : "{}";
            }
            backwardfocussearchIconCompatParcelizer.serializer(isroot, strRemoteActionCompatParcelizer);
        }
        isroot2.getClass();
        if (!linkedHashMap.containsKey(isroot2)) {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                isverticalswipeinalloweddirection2.getClass();
                strRemoteActionCompatParcelizer2 = isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), map2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                if (map2 == null && (map2 instanceof List)) {
                    strRemoteActionCompatParcelizer2 = "[]";
                }
            }
            backwardfocussearchIconCompatParcelizer.serializer(isroot2, strRemoteActionCompatParcelizer2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(8), 7, (Object) null);
        return backwardfocussearchIconCompatParcelizer;
    }

    public static onViewAttachedToWindowlambda0 a(getSystemDefinedLCbbffg getsystemdefinedlcbbffg) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = getsystemdefinedlcbbffg.RemoteActionCompatParcelizer();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapRemoteActionCompatParcelizer.entrySet()) {
            if (entry.getValue() instanceof Long) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            a7 a7Var = com.braze.storage.e.b;
            value.getClass();
            a7Var.a(str, ((Long) value).longValue(), linkedHashMap, linkedHashMap2);
        }
        return new onViewAttachedToWindowlambda0(linkedHashMap, linkedHashMap2);
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Migrated attempt count key: ", str);
    }

    public final getNoActiveChildannotations a(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(6), 7, (Object) null);
        Object[] objArr = {DataStoreKey.ENDPOINT_LAST_REQUEST_MAP.getKey()};
        int iWrite = BackspaceCommand.write();
        isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite);
        Object[] objArr2 = {DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP.getKey()};
        int iWrite2 = BackspaceCommand.write();
        isRoot isroot2 = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -220732894, iWrite2);
        LinkedHashMap linkedHashMap = ((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer;
        if (linkedHashMap.containsKey(isroot) && linkedHashMap.containsKey(isroot2)) {
            return getnoactivechildannotations;
        }
        try {
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0A = a(getsystemdefinedlcbbffg);
            return a(getnoactivechildannotations, isroot, isroot2, (Map) onviewattachedtowindowlambda0A.serializer, (Map) onviewattachedtowindowlambda0A.write);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda3(7), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public static final String a() {
        return "Endpoint metadata migration completed successfully";
    }

    public final void a(String str, long j, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "uri-at-", false)) {
            linkedHashMap2.put(str, Long.valueOf(j));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 0), 7, (Object) null);
        } else if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "uri-", false)) {
            linkedHashMap.put(str, Long.valueOf(j));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a7$$ExternalSyntheticLambda3(str, 2), 7, (Object) null);
        }
    }
}
