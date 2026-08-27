package com.deliveryhero.perseus.data.local.db;

import androidx.room.InvalidationTracker;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
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
import o.lineToRelative;
import o.moveToRelative;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackingDatabase_Impl extends TrackingDatabase {
    private final onViewDetachedFromWindowlambda1 read = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(5, this));

    /* JADX INFO: Access modifiers changed from: private */
    public static final lineToRelative RemoteActionCompatParcelizer(TrackingDatabase_Impl trackingDatabase_Impl) {
        return new lineToRelative(trackingDatabase_Impl);
    }

    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getAndroidCanvasannotations createOpenDelegate() {
        return new getF16_sVssgQ(this);
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "tracking_perseus_events", "HitEventValues");
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        return new LinkedHashSet();
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(displayInAppMessagelambda1.serializer(moveToRelative.class), instance_delegatelambda0.write);
        return linkedHashMap;
    }

    @Override // com.deliveryhero.perseus.data.local.db.TrackingDatabase
    public moveToRelative serializer() {
        return (moveToRelative) this.read.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        performClear(false, "tracking_perseus_events", "HitEventValues");
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        map.getClass();
        return new ArrayList();
    }
}
