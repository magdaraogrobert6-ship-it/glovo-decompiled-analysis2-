package com.braze.storage;

import com.braze.enums.DataStoreKey;
import com.braze.models.FeatureFlag;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.getWasCloseMessageCalled;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setWasCloseMessageCalled;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class FeatureFlagsDataStoreProvider$Companion {
    public /* synthetic */ FeatureFlagsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$2$0() {
        return "Migration for Feature Flags impression map completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$3() {
        return "Failed to migrate Feature Flags impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.FEATURE_FLAGS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Added feature flag from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$0(FeatureFlag featureFlag) {
        return String.valueOf(featureFlag != null ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Successfully decoded feature flag: ", featureFlag.getId()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$2$1(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse FeatureFlag from JSON: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$3$0() {
        return "Migration for feature flags completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagStorageToJson$lambda$4() {
        return "Failed to migrate feature flags storage to DataStore.";
    }

    public final getNoActiveChildannotations migrateFeatureFlagImpressionMapToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(19), 7, (Object) null);
        Object[] objArr = {DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()};
        int iWrite = BackspaceCommand.write();
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite))) {
            return getnoactivechildannotations;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    linkedHashMap.put(str, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6((Boolean) value, str, 1), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, getWasCloseMessageCalled.write), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = "{}";
            }
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            Object[] objArr2 = {DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP.getKey()};
            int iWrite2 = BackspaceCommand.write();
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -220732894, iWrite2), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(20), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(21), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public final getNoActiveChildannotations migrateFeatureFlagStorageToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        FeatureFlag featureFlagA;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(16), 7, (Object) null);
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.FEATURE_FLAGS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()))) {
            return getnoactivechildannotations;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, 6), 7, (Object) null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str2 = (String) arrayList.get(i);
                try {
                    featureFlagA = com.braze.support.e.a.a(new JSONObject(str2));
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$c$$ExternalSyntheticLambda0(2, featureFlagA), 7, (Object) null);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h.d, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 7), 4, (Object) null);
                    featureFlagA = null;
                }
                if (featureFlagA != null) {
                    arrayList2.add(featureFlagA);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(FeatureFlag.Companion.serializer(), 0), arrayList2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = arrayList2 instanceof Map ? "{}" : "[]";
            }
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.FEATURE_FLAGS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(17), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(18), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    private FeatureFlagsDataStoreProvider$Companion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateFeatureFlagImpressionMapToJson$lambda$1$0(Object obj, String str) {
        return "Added impression:" + obj + " for feature flag:" + str + " from SharedPreferences";
    }
}
