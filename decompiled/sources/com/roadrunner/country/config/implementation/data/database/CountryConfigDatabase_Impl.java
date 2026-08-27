package com.roadrunner.country.config.implementation.data.database;

import androidx.compose.ui.graphics.Fields;
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
import o.metaWithLastChildOffset;
import o.metaWithParentId;
import o.onViewDetachedFromWindowlambda1;
import o.rotateRad;
import o.tintxETnrds;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryConfigDatabase_Impl extends CountryConfigDatabase {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    private final onViewDetachedFromWindowlambda1 read = new isAdapterPositionOnScreen(new ImageLoader$Builder$$ExternalSyntheticLambda1(10, this));

    public static final /* synthetic */ void IconCompatParcelizer(CountryConfigDatabase_Impl countryConfigDatabase_Impl, tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            countryConfigDatabase_Impl.internalInitInvalidationTracker(tintxetnrds);
        } else {
            countryConfigDatabase_Impl.internalInitInvalidationTracker(tintxetnrds);
            throw null;
        }
    }

    public static /* synthetic */ metaWithLastChildOffset write(CountryConfigDatabase_Impl countryConfigDatabase_Impl) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return RemoteActionCompatParcelizer(countryConfigDatabase_Impl);
        }
        RemoteActionCompatParcelizer(countryConfigDatabase_Impl);
        throw null;
    }

    private static final metaWithLastChildOffset RemoteActionCompatParcelizer(CountryConfigDatabase_Impl countryConfigDatabase_Impl) {
        int i = 2 % 2;
        metaWithLastChildOffset metawithlastchildoffset = new metaWithLastChildOffset(countryConfigDatabase_Impl);
        int i2 = MediaMetadataCompat + 55;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
        return metawithlastchildoffset;
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = RemoteActionCompatParcelizer + 27;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return linkedHashSet;
    }

    public getAndroidCanvasannotations serializer() {
        int i = 2 % 2;
        getF16_sVssgQ getf16_svssgq = new getF16_sVssgQ(this);
        int i2 = MediaMetadataCompat + 97;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getf16_svssgq;
    }

    @Override // androidx.room.RoomDatabase
    public /* synthetic */ rotateRad createOpenDelegate() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 61;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAndroidCanvasannotations getandroidcanvasannotationsSerializer = serializer();
        int i4 = RemoteActionCompatParcelizer + 9;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return getandroidcanvasannotationsSerializer;
    }

    @Override // com.roadrunner.country.config.implementation.data.database.CountryConfigDatabase
    public metaWithParentId RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        metaWithParentId metawithparentid = (metaWithParentId) this.read.MediaSessionCompatResultReceiverWrapper();
        int i4 = RemoteActionCompatParcelizer + 79;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return metawithparentid;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        int i = 2 % 2;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = RemoteActionCompatParcelizer + 123;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 89;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            performClear(false, "country_config");
            return;
        }
        String[] strArr = new String[0];
        strArr[1] = "country_config";
        performClear(false, strArr);
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(displayInAppMessagelambda1.serializer(metaWithParentId.class), instance_delegatelambda0.write);
        int i2 = MediaMetadataCompat + 55;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        int i = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "country_config");
        int i2 = RemoteActionCompatParcelizer + 105;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return invalidationTracker;
        }
        throw null;
    }
}
