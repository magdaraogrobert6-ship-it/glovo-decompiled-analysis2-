package com.braze.storage;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
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
import o.getWasCloseMessageCalled;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final class BannersDataStoreProvider$Companion {
    public /* synthetic */ BannersDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.BANNERS_IMPRESSION_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$2$0() {
        return "Migration for Banners impression map completed successfully.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$3() {
        return "Failed to migrate banner impression map to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.BANNERS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Added banner from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$3() {
        return "Failed to migrate banner storage to DataStore.";
    }

    public final getNoActiveChildannotations migrateBannerImpressionMapToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(5), 7, (Object) null);
        Object[] objArr = {DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()};
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
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6((Boolean) value, str, 0), 7, (Object) null);
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
            Object[] objArr2 = {DataStoreKey.BANNERS_IMPRESSION_MAP.getKey()};
            int iWrite2 = BackspaceCommand.write();
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -220732894, iWrite2), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(6), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(7), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public final getNoActiveChildannotations migrateBannerStorageToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        int i;
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(3), 7, (Object) null);
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.BANNERS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()))) {
            return getnoactivechildannotations;
        }
        int i2 = 4;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, i2), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2(i, value), 7, (Object) null);
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
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.BANNERS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(i, arrayList), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(i2), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    private BannersDataStoreProvider$Companion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerImpressionMapToJson$lambda$1$0(Object obj, String str) {
        return "Added impression:" + obj + " for banner:" + str + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$1$1(Object obj) {
        return af$$ExternalSyntheticOutline0.m(obj, "Banner value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBannerStorageToJson$lambda$2$0(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Migration for banners completed successfully. Migrated ", " banners.");
    }
}
