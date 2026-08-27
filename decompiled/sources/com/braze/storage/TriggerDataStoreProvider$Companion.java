package com.braze.storage;

import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.onDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final class TriggerDataStoreProvider$Companion {
    public /* synthetic */ TriggerDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$1() {
        return "Migration already completed for triggered actions impression maps. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$3$0() {
        return ff$$ExternalSyntheticOutline0.m("Migration for ", DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey(), " completed successfully");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$4() {
        return "Failed to migrate triggers reeligibility map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.TRIGGERED_ACTIONS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$1() {
        return "Migration already completed for triggered actions. Skipping.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$2$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Added triggered action from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$4() {
        return "Failed to migrate triggered actions to DataStore.";
    }

    public final getNoActiveChildannotations migrateTriggersReeligibilityToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(0), 7, (Object) null);
        Object[] objArr = {DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()};
        int iWrite = BackspaceCommand.write();
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(7), 7, (Object) null);
            return getnoactivechildannotations;
        }
        int i = 9;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, i), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, onDismissed.write), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = "{}";
            }
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            Object[] objArr2 = {DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP.getKey()};
            int iWrite2 = BackspaceCommand.write();
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -220732894, iWrite2), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(8), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(i), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public final getNoActiveChildannotations migrateTriggersStorageToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        int i;
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        int i2 = 10;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(i2), 7, (Object) null);
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.TRIGGERED_ACTIONS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(11), 7, (Object) null);
            return getnoactivechildannotations;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet().iterator();
            while (true) {
                i = 2;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof String) || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) value)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$b$a$$ExternalSyntheticLambda1(i, str, value), 7, (Object) null);
                } else {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) t.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, i2), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), arrayList);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = arrayList instanceof Map ? "{}" : "[]";
            }
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.TRIGGERED_ACTIONS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(i, arrayList), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(6), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    private TriggerDataStoreProvider$Companion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersReeligibilityToJson$lambda$2$0(String str) {
        return ff$$ExternalSyntheticOutline0.m("Added timestamp for trigger:", str, " from SharedPreferences");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$2$1(String str, Object obj) {
        return "Triggered action with key:" + str + " and value:" + obj + " from SharedPreferences has an invalid value and will not be migrated to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateTriggersStorageToJson$lambda$3$0(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Migration for triggered actions completed successfully. Migrated ", " actions.");
    }
}
