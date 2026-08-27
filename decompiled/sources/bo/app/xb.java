package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.afterClosed;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.resetTransientState;

/* JADX INFO: loaded from: classes.dex */
public final class xb {
    public static final String b() {
        return "Failed to migrate permission request counts to DataStore.";
    }

    public final getNoActiveChildannotations a(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        Object[] objArr = {DataStoreKey.PERMISSION_REQUEST_COUNTS.getKey()};
        int iWrite = BackspaceCommand.write();
        isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite);
        if (!((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey(isroot)) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = getsystemdefinedlcbbffg.RemoteActionCompatParcelizer();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMapRemoteActionCompatParcelizer.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    value.getClass();
                    linkedHashMap.put(str, (Integer) value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) com.braze.storage.i.b, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ih$$ExternalSyntheticLambda9(2, str, value), 7, (Object) null);
                }
                if (!linkedHashMap.isEmpty()) {
                    backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                        isverticalswipeinalloweddirection.getClass();
                        strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, afterClosed.IconCompatParcelizer), linkedHashMap);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                        strRemoteActionCompatParcelizer = "{}";
                    }
                    backwardfocussearchIconCompatParcelizer.serializer(isroot, strRemoteActionCompatParcelizer);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(5), 7, (Object) null);
                    return backwardfocussearchIconCompatParcelizer;
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new wa$$ExternalSyntheticLambda3(6), 4, (Object) null);
                return getnoactivechildannotations;
            }
        }
        return getnoactivechildannotations;
    }

    public static final String a(String str, Object obj) {
        return "Migrated permission count: " + str + " = " + obj;
    }

    public static final String a() {
        return "Permission request counts migration completed";
    }
}
