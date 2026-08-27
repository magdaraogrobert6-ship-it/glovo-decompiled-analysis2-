package com.braze.storage;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setWasCloseMessageCalled;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class ServerConfigDataStoreProvider$Companion {
    public /* synthetic */ ServerConfigDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void migrateBlocklistedList(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, backwardFocusSearch backwardfocussearch, final DataStoreKey dataStoreKey) {
        String strRemoteActionCompatParcelizer;
        try {
            String strWrite = getsystemdefinedlcbbffg.write(dataStoreKey.getKey(), null);
            final int i = 0;
            if (strWrite != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strWrite)) {
                JSONArray jSONArray = new JSONArray(strWrite);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String string = jSONArray.getString(i2);
                    string.getClass();
                    arrayList.add(string);
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
                isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write());
                backwardfocussearch.getClass();
                backwardfocussearch.serializer(isroot, strRemoteActionCompatParcelizer);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda6(dataStoreKey, arrayList, 2), 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i3 = i;
                    DataStoreKey dataStoreKey2 = dataStoreKey;
                    return i3 != 0 ? ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$2(dataStoreKey2) : ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$1(dataStoreKey2);
                }
            }, 7, (Object) null);
        } catch (Exception e2) {
            final int i3 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    int i4 = i3;
                    DataStoreKey dataStoreKey2 = dataStoreKey;
                    return i4 != 0 ? ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$2(dataStoreKey2) : ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$1(dataStoreKey2);
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$0() {
        return "Starting migration for blocklisted lists";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$1() {
        return "Blocklisted lists already migrated, skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$2() {
        return "Migration for blocklisted lists completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$3() {
        return "Failed to migrate blocklisted lists to DataStore";
    }

    public final getNoActiveChildannotations migrateBlocklistedLists(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(29), 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.BLOCKLISTED_EVENTS;
        Object[] objArr = {dataStoreKey.getKey()};
        int iWrite = BackspaceCommand.write();
        isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -220732894, iWrite);
        LinkedHashMap linkedHashMap = ((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer;
        if (!linkedHashMap.containsKey(isroot)) {
            DataStoreKey dataStoreKey2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES;
            Object[] objArr2 = {dataStoreKey2.getKey()};
            int iWrite2 = BackspaceCommand.write();
            if (!linkedHashMap.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr2, BackspaceCommand.write(), -220732894, iWrite2))) {
                DataStoreKey dataStoreKey3 = DataStoreKey.BLOCKLISTED_PURCHASES;
                Object[] objArr3 = {dataStoreKey3.getKey()};
                int iWrite3 = BackspaceCommand.write();
                if (!linkedHashMap.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), objArr3, BackspaceCommand.write(), -220732894, iWrite3))) {
                    try {
                        backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
                        migrateBlocklistedList(getsystemdefinedlcbbffg, backwardfocussearchIconCompatParcelizer, dataStoreKey);
                        migrateBlocklistedList(getsystemdefinedlcbbffg, backwardfocussearchIconCompatParcelizer, dataStoreKey2);
                        migrateBlocklistedList(getsystemdefinedlcbbffg, backwardfocussearchIconCompatParcelizer, dataStoreKey3);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(1), 7, (Object) null);
                        return backwardfocussearchIconCompatParcelizer;
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(2), 4, (Object) null);
                        return getnoactivechildannotations;
                    }
                }
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(3), 7, (Object) null);
        return getnoactivechildannotations;
    }

    private ServerConfigDataStoreProvider$Companion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$0(DataStoreKey dataStoreKey, List list) {
        return "Migrated " + dataStoreKey.getKey() + " with " + list.size() + " items.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$2(DataStoreKey dataStoreKey) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to migrate ", dataStoreKey.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$1(DataStoreKey dataStoreKey) {
        return ff$$ExternalSyntheticOutline0.m("No data found for ", dataStoreKey.getKey(), ", skipping");
    }
}
