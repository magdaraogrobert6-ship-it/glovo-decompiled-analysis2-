package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
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
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class o7 {
    public static final String b() {
        return "Failed to migrate event storage to DataStore.";
    }

    public final getNoActiveChildannotations a(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(11), 7, (Object) null);
        Object[] objArr = {DataStoreKey.EVENT_STORAGE_MAP.getKey()};
        int iWrite = BackspaceCommand.write();
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite))) {
            return getnoactivechildannotations;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.storage.f.b, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda2(str, 17), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.storage.f.b, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o7$$ExternalSyntheticLambda2(0, value), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = "{}";
            }
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            Object[] objArr2 = {DataStoreKey.EVENT_STORAGE_MAP.getKey()};
            int iWrite2 = BackspaceCommand.write();
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -220732894, iWrite2), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o7$$ExternalSyntheticLambda3(linkedHashMap, 0), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(12), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public static final String a() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.EVENT_STORAGE_MAP.getKey());
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Added event from SharedPreferences key: ", str);
    }

    public static final String a(Object obj) {
        return af$$ExternalSyntheticOutline0.m(obj, "Event value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.");
    }

    public static final String a(Map map) {
        return d$$ExternalSyntheticOutline0.m(map.size(), "Migration for events completed successfully. Migrated ", " events.");
    }
}
