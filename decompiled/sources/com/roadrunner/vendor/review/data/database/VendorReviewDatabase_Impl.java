package com.roadrunner.vendor.review.data.database;

import androidx.compose.ui.graphics.Fields;
import androidx.room.InvalidationTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.changeUser;
import o.deserializeContentCard;
import o.displayInAppMessagelambda1;
import o.getAndroidCanvasannotations;
import o.getBlack0d7_KjUannotations;
import o.getUnregisteredInAppMessageannotations;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;
import o.rotateRad;
import o.tintxETnrds;
import o.xgExternalSyntheticLambda9;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class VendorReviewDatabase_Impl extends VendorReviewDatabase {
    private static int MediaMetadataCompat = 1;
    private static int read;
    private final onViewDetachedFromWindowlambda1 RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new RealWebSocket$$ExternalSyntheticLambda0(14, this));

    public static final /* synthetic */ void RemoteActionCompatParcelizer(VendorReviewDatabase_Impl vendorReviewDatabase_Impl, tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 109;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        vendorReviewDatabase_Impl.internalInitInvalidationTracker(tintxetnrds);
        int i4 = MediaMetadataCompat + 105;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ deserializeContentCard RemoteActionCompatParcelizer(VendorReviewDatabase_Impl vendorReviewDatabase_Impl) {
        int i = 2 % 2;
        int i2 = read + 25;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        deserializeContentCard deserializecontentcardSerializer = serializer(vendorReviewDatabase_Impl);
        int i4 = MediaMetadataCompat + 1;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return deserializecontentcardSerializer;
    }

    private static final deserializeContentCard serializer(VendorReviewDatabase_Impl vendorReviewDatabase_Impl) {
        int i = 2 % 2;
        deserializeContentCard deserializecontentcard = new deserializeContentCard(vendorReviewDatabase_Impl);
        int i2 = read + 39;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return deserializecontentcard;
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = read + 73;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 18 / 0;
        }
        return linkedHashSet;
    }

    public getAndroidCanvasannotations write() {
        int i = 2 % 2;
        xgExternalSyntheticLambda9 xgexternalsyntheticlambda9 = new xgExternalSyntheticLambda9(this);
        int i2 = read + 15;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return xgexternalsyntheticlambda9;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public /* synthetic */ rotateRad createOpenDelegate() {
        int i = 2 % 2;
        int i2 = read + 13;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            write();
            throw null;
        }
        getAndroidCanvasannotations getandroidcanvasannotationsWrite = write();
        int i3 = MediaMetadataCompat + 103;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return getandroidcanvasannotationsWrite;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        int i = 2 % 2;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = MediaMetadataCompat + 29;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // com.roadrunner.vendor.review.data.database.VendorReviewDatabase
    public changeUser serializer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 87;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        changeUser changeuser = (changeUser) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        int i4 = read + 7;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return changeuser;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 57;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        performClear(false, "vendor_review_state");
        int i4 = MediaMetadataCompat + 79;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(displayInAppMessagelambda1.serializer(changeUser.class), instance_delegatelambda0.write);
        int i2 = MediaMetadataCompat + 109;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        int i = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "vendor_review_state");
        int i2 = read + 43;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return invalidationTracker;
        }
        throw null;
    }
}
