package com.braze.storage;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.Constants;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ItemTouchHelperAdapter;
import o.backwardFocusSearch;
import o.beforeInAppMessageViewClosed;
import o.getNoActiveChildannotations;
import o.getSystemDefinedLCbbffg;
import o.isRoot;
import o.isVerticalSwipeInAllowedDirection;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.resetTransientState;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes.dex */
public final class ContentCardsDataStoreProvider$Companion {
    public /* synthetic */ ContentCardsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$0() {
        return "Starting migration for Content Cards metadata keys.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$1() {
        return "Metadata migration completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$2() {
        return "Failed to migrate content cards metadata to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$0() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Starting migration for key: ", DataStoreKey.CONTENT_CARDS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$1$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Added content card from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3() {
        return "Failed to migrate content cards storage to DataStore.";
    }

    public final getNoActiveChildannotations migrateContentCardsMetadataToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        String strRemoteActionCompatParcelizer;
        String strRemoteActionCompatParcelizer2;
        String strRemoteActionCompatParcelizer3 = "[]";
        String str = Constants.BRAZE_SDK_VERSION;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(10), 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()))) {
            return getnoactivechildannotations;
        }
        try {
            backwardFocusSearch backwardfocussearchIconCompatParcelizer = getnoactivechildannotations.IconCompatParcelizer();
            Set setWrite = getsystemdefinedlcbbffg.write(dataStoreKey.getKey());
            Set set = ItemTouchHelperAdapter.serializer;
            if (setWrite == null) {
                setWrite = set;
            }
            List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(setWrite);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                isverticalswipeinalloweddirection.getClass();
                strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                strRemoteActionCompatParcelizer = (!(listPlaybackStateCompat instanceof Map) && (listPlaybackStateCompat instanceof List)) ? "[]" : "{}";
            }
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.DISMISSED_CARDS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), strRemoteActionCompatParcelizer);
            Set setWrite2 = getsystemdefinedlcbbffg.write(DataStoreKey.EXPIRED_CARDS.getKey());
            if (setWrite2 == null) {
                setWrite2 = set;
            }
            List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(setWrite2);
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection2 = resetTransientState.read;
                isverticalswipeinalloweddirection2.getClass();
                try {
                    strRemoteActionCompatParcelizer2 = isverticalswipeinalloweddirection2.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat2);
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                    strRemoteActionCompatParcelizer2 = (!(listPlaybackStateCompat2 instanceof Map) && (listPlaybackStateCompat2 instanceof List)) ? "[]" : "{}";
                }
            } catch (Exception e3) {
                e = e3;
            }
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.EXPIRED_CARDS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), strRemoteActionCompatParcelizer2);
            Set setWrite3 = getsystemdefinedlcbbffg.write(DataStoreKey.TEST_CARDS.getKey());
            if (setWrite3 != null) {
                set = setWrite3;
            }
            List listPlaybackStateCompat3 = onContentCardDismissed.PlaybackStateCompat(set);
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection3 = resetTransientState.read;
                isverticalswipeinalloweddirection3.getClass();
                strRemoteActionCompatParcelizer3 = isverticalswipeinalloweddirection3.RemoteActionCompatParcelizer(new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0), listPlaybackStateCompat3);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e4, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) DataStoreUtils.e.a, 4, (Object) null);
                if ((listPlaybackStateCompat3 instanceof Map) || !(listPlaybackStateCompat3 instanceof List)) {
                    strRemoteActionCompatParcelizer3 = "{}";
                }
            }
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.TEST_CARDS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), strRemoteActionCompatParcelizer3);
            DataStoreKey dataStoreKey2 = DataStoreKey.LAST_CARD_UPDATED_AT;
            long j = getsystemdefinedlcbbffg.read(dataStoreKey2.getKey());
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey2.getKey()}, BackspaceCommand.write(), 1579077836, BackspaceCommand.write()), Long.valueOf(j));
            DataStoreKey dataStoreKey3 = DataStoreKey.LAST_FULL_CARD_SYNC_AT;
            long j2 = getsystemdefinedlcbbffg.read(dataStoreKey3.getKey());
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey3.getKey()}, BackspaceCommand.write(), 1579077836, BackspaceCommand.write()), Long.valueOf(j2));
            DataStoreKey dataStoreKey4 = DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
            long j3 = getsystemdefinedlcbbffg.read(dataStoreKey4.getKey());
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(-1579077835, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey4.getKey()}, BackspaceCommand.write(), 1579077836, BackspaceCommand.write()), Long.valueOf(j3));
            DataStoreKey dataStoreKey5 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
            String strWrite = getsystemdefinedlcbbffg.write(dataStoreKey5.getKey(), Constants.BRAZE_SDK_VERSION);
            if (strWrite != null) {
                str = strWrite;
            }
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{dataStoreKey5.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(11), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(12), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    public final getNoActiveChildannotations migrateContentCardsStorageToJson(getSystemDefinedLCbbffg getsystemdefinedlcbbffg, getNoActiveChildannotations getnoactivechildannotations) {
        int i;
        String strRemoteActionCompatParcelizer;
        getsystemdefinedlcbbffg.getClass();
        getnoactivechildannotations.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(8), 7, (Object) null);
        if (((backwardFocusSearch) getnoactivechildannotations).RemoteActionCompatParcelizer.containsKey((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.CONTENT_CARDS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()))) {
            return getnoactivechildannotations;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = getsystemdefinedlcbbffg.RemoteActionCompatParcelizer().entrySet().iterator();
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda9(str, 5), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.d, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2(i, value), 7, (Object) null);
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
            backwardfocussearchIconCompatParcelizer.serializer((isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{DataStoreKey.CONTENT_CARDS.getKey()}, BackspaceCommand.write(), -220732894, BackspaceCommand.write()), strRemoteActionCompatParcelizer);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) backwardfocussearchIconCompatParcelizer, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(i, arrayList), 7, (Object) null);
            return backwardfocussearchIconCompatParcelizer;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new DataStoreProvider$$ExternalSyntheticLambda7(9), 4, (Object) null);
            return getnoactivechildannotations;
        }
    }

    private ContentCardsDataStoreProvider$Companion() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$1$1(Object obj) {
        return af$$ExternalSyntheticOutline0.m(obj, "Content card value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$2$0(List list) {
        return d$$ExternalSyntheticOutline0.m(list.size(), "Migration for content cards completed successfully. Migrated ", " cards.");
    }
}
