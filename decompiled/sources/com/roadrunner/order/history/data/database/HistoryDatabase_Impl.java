package com.roadrunner.order.history.data.database;

import androidx.compose.ui.graphics.Fields;
import androidx.room.InvalidationTracker;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import o.y3;
import o.y6;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryDatabase_Impl extends HistoryDatabase {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    private final onViewDetachedFromWindowlambda1 RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(17, this));

    public static final /* synthetic */ void RemoteActionCompatParcelizer(HistoryDatabase_Impl historyDatabase_Impl, tintxETnrds tintxetnrds) {
        int i = 2 % 2;
        int i2 = read + 5;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        historyDatabase_Impl.internalInitInvalidationTracker(tintxetnrds);
        int i4 = MediaBrowserCompatMediaItem + 19;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ y3 RemoteActionCompatParcelizer(HistoryDatabase_Impl historyDatabase_Impl) {
        int i = 2 % 2;
        int i2 = read + 61;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            serializer(historyDatabase_Impl);
            throw null;
        }
        y3 y3VarSerializer = serializer(historyDatabase_Impl);
        int i3 = read + 57;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
        return y3VarSerializer;
    }

    private static final y3 serializer(HistoryDatabase_Impl historyDatabase_Impl) {
        int i = 2 % 2;
        y3 y3Var = new y3(historyDatabase_Impl);
        int i2 = read + 23;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return y3Var;
    }

    @Override // androidx.room.RoomDatabase
    public Set<getUnregisteredInAppMessageannotations> getRequiredAutoMigrationSpecClasses() {
        int i = 2 % 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = MediaBrowserCompatMediaItem + 101;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return linkedHashSet;
    }

    public getAndroidCanvasannotations write() {
        int i = 2 % 2;
        xgExternalSyntheticLambda9 xgexternalsyntheticlambda9 = new xgExternalSyntheticLambda9(this);
        int i2 = read + 21;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return xgexternalsyntheticlambda9;
    }

    @Override // androidx.room.RoomDatabase
    public /* synthetic */ rotateRad createOpenDelegate() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 101;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getAndroidCanvasannotations getandroidcanvasannotationsWrite = write();
        int i4 = read + 33;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return getandroidcanvasannotationsWrite;
        }
        throw null;
    }

    @Override // com.roadrunner.order.history.data.database.HistoryDatabase
    public y6 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 91;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (y6) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        }
        int i3 = 6 / 0;
        return (y6) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // androidx.room.RoomDatabase
    public List<getBlack0d7_KjUannotations> createAutoMigrations(Map<getUnregisteredInAppMessageannotations, Object> map) {
        int i = 2 % 2;
        map.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = MediaBrowserCompatMediaItem + 21;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String[] strArr = new String[1];
            strArr[1] = "history";
            performClear(false, strArr);
        } else {
            performClear(false, "history");
        }
        int i3 = MediaBrowserCompatMediaItem + 19;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    @Override // androidx.room.RoomDatabase
    public Map<getUnregisteredInAppMessageannotations, List<getUnregisteredInAppMessageannotations>> getRequiredTypeConverterClasses() {
        int i = 2 % 2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(displayInAppMessagelambda1.serializer(y6.class), instance_delegatelambda0.write);
        int i2 = MediaBrowserCompatMediaItem + 75;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return linkedHashMap;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        int i = 2 % 2;
        InvalidationTracker invalidationTracker = new InvalidationTracker(this, new LinkedHashMap(), new LinkedHashMap(), "history");
        int i2 = read + 65;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return invalidationTracker;
    }
}
