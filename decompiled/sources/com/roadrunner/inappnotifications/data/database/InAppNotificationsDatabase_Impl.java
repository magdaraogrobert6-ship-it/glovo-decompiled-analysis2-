package com.roadrunner.inappnotifications.data.database;

import androidx.compose.ui.graphics.Fields;
import androidx.room.InvalidationTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.displayInAppMessagelambda1;
import o.getAndroidCanvasannotations;
import o.getBlack0d7_KjUannotations;
import o.getF16_sVssgQ;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.rotateRad;
import o.smoothScrollToPosition;
import o.startNestedScroll;
import o.tintxETnrds;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppNotificationsDatabase_Impl extends InAppNotificationsDatabase {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    private final onViewDetachedFromWindowlambda1 read = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(1, this));

    public static final /* synthetic */ void IconCompatParcelizer(InAppNotificationsDatabase_Impl inAppNotificationsDatabase_Impl, tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            inAppNotificationsDatabase_Impl.internalInitInvalidationTracker(tintxetnrds);
            throw null;
        }
        inAppNotificationsDatabase_Impl.internalInitInvalidationTracker(tintxetnrds);
        int i3 = RemoteActionCompatParcelizer + 51;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ smoothScrollToPosition serializer(InAppNotificationsDatabase_Impl inAppNotificationsDatabase_Impl) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 75;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        smoothScrollToPosition smoothscrolltopositionRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(inAppNotificationsDatabase_Impl);
        int i4 = RemoteActionCompatParcelizer + 59;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return smoothscrolltopositionRemoteActionCompatParcelizer;
    }

    private static final smoothScrollToPosition RemoteActionCompatParcelizer(InAppNotificationsDatabase_Impl inAppNotificationsDatabase_Impl) {
        int i = 2 % 2;
        smoothScrollToPosition smoothscrolltoposition = new smoothScrollToPosition(inAppNotificationsDatabase_Impl);
        int i2 = MediaSessionCompatQueueItem + 53;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return smoothscrolltoposition;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getAndroidCanvasannotations RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        getF16_sVssgQ getf16_svssgq = new getF16_sVssgQ(this);
        int i2 = RemoteActionCompatParcelizer + 67;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getf16_svssgq;
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = MediaSessionCompatQueueItem + 3;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return linkedHashSet;
    }

    @Override // androidx.room.RoomDatabase
    public /* synthetic */ rotateRad createOpenDelegate() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return RemoteActionCompatParcelizer();
        }
        RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        int i = 2 % 2;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = MediaSessionCompatQueueItem + 41;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrayList;
    }

    @Override // com.roadrunner.inappnotifications.data.database.InAppNotificationsDatabase
    public startNestedScroll write() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 75;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        startNestedScroll startnestedscroll = (startNestedScroll) this.read.MediaSessionCompatResultReceiverWrapper();
        int i4 = RemoteActionCompatParcelizer + 9;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
        return startnestedscroll;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 121;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        performClear(false, "in_app_message");
        int i4 = MediaSessionCompatQueueItem + 85;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(displayInAppMessagelambda1.serializer(startNestedScroll.class), instance_delegatelambda0.write);
        int i2 = RemoteActionCompatParcelizer + 95;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        int i = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "in_app_message");
        int i2 = RemoteActionCompatParcelizer + 9;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 40 / 0;
        }
        return invalidationTracker;
    }
}
