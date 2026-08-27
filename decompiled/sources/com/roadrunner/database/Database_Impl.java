package com.roadrunner.database;

import androidx.compose.ui.graphics.Fields;
import androidx.room.InvalidationTracker;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.accessgetBottomcp;
import o.copyK8Q__8;
import o.displayInAppMessagelambda1;
import o.getAndroidCanvasannotations;
import o.getBlack0d7_KjUannotations;
import o.getF16_sVssgQ;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.rotateRad;
import o.tintxETnrds;

/* JADX INFO: loaded from: classes3.dex */
public final class Database_Impl extends Database {
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer;
    private final onViewDetachedFromWindowlambda1 read = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(15, this));

    public static final /* synthetic */ void serializer(Database_Impl database_Impl, tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        database_Impl.internalInitInvalidationTracker(tintxetnrds);
        int i4 = RemoteActionCompatParcelizer + 103;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ accessgetBottomcp serializer(Database_Impl database_Impl) {
        accessgetBottomcp accessgetbottomcpIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            accessgetbottomcpIconCompatParcelizer = IconCompatParcelizer(database_Impl);
            int i3 = 35 / 0;
        } else {
            accessgetbottomcpIconCompatParcelizer = IconCompatParcelizer(database_Impl);
        }
        int i4 = MediaDescriptionCompat + 13;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return accessgetbottomcpIconCompatParcelizer;
    }

    private static final accessgetBottomcp IconCompatParcelizer(Database_Impl database_Impl) {
        int i = 2 % 2;
        accessgetBottomcp accessgetbottomcp = new accessgetBottomcp(database_Impl);
        int i2 = RemoteActionCompatParcelizer + 91;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return accessgetbottomcp;
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = RemoteActionCompatParcelizer + 67;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return linkedHashSet;
    }

    public getAndroidCanvasannotations read() {
        int i = 2 % 2;
        getF16_sVssgQ getf16_svssgq = new getF16_sVssgQ(this);
        int i2 = MediaDescriptionCompat + 55;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getf16_svssgq;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public /* synthetic */ rotateRad createOpenDelegate() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAndroidCanvasannotations getandroidcanvasannotations = read();
        int i4 = RemoteActionCompatParcelizer + 107;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return getandroidcanvasannotations;
    }

    @Override // com.roadrunner.database.Database
    public copyK8Q__8 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (copyK8Q__8) this.read.MediaSessionCompatResultReceiverWrapper();
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        int i = 2 % 2;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = MediaDescriptionCompat + 29;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        performClear(false, "session", "couriers", "courier_start_zones");
        int i4 = MediaDescriptionCompat + 29;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(displayInAppMessagelambda1.serializer(copyK8Q__8.class), instance_delegatelambda0.write);
        int i2 = MediaDescriptionCompat + 87;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        int i = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "session", "couriers", "courier_start_zones");
        int i2 = RemoteActionCompatParcelizer + 1;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return invalidationTracker;
    }
}
