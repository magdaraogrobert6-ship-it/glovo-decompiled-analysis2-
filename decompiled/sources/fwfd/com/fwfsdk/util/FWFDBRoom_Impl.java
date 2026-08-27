package fwfd.com.fwfsdk.util;

import android.content.Context;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper$Delegate;
import com.braze.models.FeatureFlag;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.common.HttpHeaders;
import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.model.dao.FWFDBDAO;
import fwfd.com.fwfsdk.model.dao.FWFDBDAO_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.C0172getimpl;
import o.MediaSessionCompatQueueItem;
import o.UncheckedColor;
import o.compositeComponent;
import o.createCache;
import o.getBlack0d7_KjU;
import o.getUnspecified0d7_KjUannotations;
import o.getUnspecifiedColorannotations;
import o.lerpNullableFloatList;
import o.rotateRaddefault;
import o.skewRad;
import o.withSaveLayer;

/* JADX INFO: loaded from: classes5.dex */
public final class FWFDBRoom_Impl extends FWFDBRoom {
    private volatile FWFDBDAO _fWFDBDAO;

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(FWFDBDAO.class, FWFDBDAO_Impl.getRequiredConverters());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "FWFFlagKey", "FWFSDKInfo", "FWFFeature");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        UncheckedColor uncheckedColorIconCompatParcelizer = super.getOpenHelper().IconCompatParcelizer();
        try {
            super.beginTransaction();
            uncheckedColorIconCompatParcelizer.RemoteActionCompatParcelizer("DELETE FROM `FWFFlagKey`");
            uncheckedColorIconCompatParcelizer.RemoteActionCompatParcelizer("DELETE FROM `FWFSDKInfo`");
            uncheckedColorIconCompatParcelizer.RemoteActionCompatParcelizer("DELETE FROM `FWFFeature`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            uncheckedColorIconCompatParcelizer.serializer("PRAGMA wal_checkpoint(FULL)").close();
            if (!uncheckedColorIconCompatParcelizer.MediaDescriptionCompat()) {
                uncheckedColorIconCompatParcelizer.RemoteActionCompatParcelizer("VACUUM");
            }
        }
    }

    @Override // fwfd.com.fwfsdk.util.FWFDBRoom
    public FWFDBDAO dao() {
        FWFDBDAO fwfdbdao;
        if (this._fWFDBDAO != null) {
            return this._fWFDBDAO;
        }
        synchronized (this) {
            if (this._fWFDBDAO == null) {
                this._fWFDBDAO = new FWFDBDAO_Impl(this);
            }
            fwfdbdao = this._fWFDBDAO;
        }
        return fwfdbdao;
    }

    @Override // androidx.room.RoomDatabase
    public compositeComponent createOpenHelper(lerpNullableFloatList lerpnullablefloatlist) {
        withSaveLayer withsavelayer = new withSaveLayer(lerpnullablefloatlist, new RoomOpenHelper$Delegate(12) { // from class: fwfd.com.fwfsdk.util.FWFDBRoom_Impl.1
            @Override // androidx.room.RoomOpenHelper$Delegate
            public void onPostMigrate(UncheckedColor uncheckedColor) {
            }

            @Override // androidx.room.RoomOpenHelper$Delegate
            public void createAllTables(UncheckedColor uncheckedColor) {
                uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS `FWFFlagKey` (`key` TEXT NOT NULL, `token` TEXT NOT NULL, `kind` TEXT, `enabled` INTEGER, `date` INTEGER, PRIMARY KEY(`key`, `token`))");
                uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS `FWFSDKInfo` (`sdkVersion` TEXT NOT NULL, `versionNumber` INTEGER, PRIMARY KEY(`sdkVersion`))");
                uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS `FWFFeature` (`key` TEXT NOT NULL, `variation` BLOB, `abTest` INTEGER NOT NULL, `accessToken` TEXT NOT NULL, `date` INTEGER NOT NULL, `relevantContext` TEXT, `subscribe` INTEGER NOT NULL, `holdoutsEvaluations` TEXT, `kind` TEXT, `from` TEXT, `ruleIndex` TEXT, `evaluatedAttributes` TEXT, `evaluatedFlags` TEXT, `error` TEXT, `variationName` BLOB, `flagType` TEXT, `flagEnabled` INTEGER, `trackerServices` TEXT, PRIMARY KEY(`key`, `accessToken`))");
                uncheckedColor.RemoteActionCompatParcelizer("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                uncheckedColor.RemoteActionCompatParcelizer("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '94743e275c3fcfce8bc483b591df18c0')");
            }

            @Override // androidx.room.RoomOpenHelper$Delegate
            public void dropAllTables(UncheckedColor uncheckedColor) {
                uncheckedColor.RemoteActionCompatParcelizer("DROP TABLE IF EXISTS `FWFFlagKey`");
                uncheckedColor.RemoteActionCompatParcelizer("DROP TABLE IF EXISTS `FWFSDKInfo`");
                uncheckedColor.RemoteActionCompatParcelizer("DROP TABLE IF EXISTS `FWFFeature`");
                if (FWFDBRoom_Impl.this.IconCompatParcelizer != null) {
                    int size = FWFDBRoom_Impl.this.IconCompatParcelizer.size();
                    for (int i = 0; i < size; i++) {
                        ((skewRad) FWFDBRoom_Impl.this.IconCompatParcelizer.get(i)).getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper$Delegate
            public void onCreate(UncheckedColor uncheckedColor) {
                if (FWFDBRoom_Impl.this.IconCompatParcelizer != null) {
                    int size = FWFDBRoom_Impl.this.IconCompatParcelizer.size();
                    for (int i = 0; i < size; i++) {
                        ((skewRad) FWFDBRoom_Impl.this.IconCompatParcelizer.get(i)).getClass();
                        uncheckedColor.getClass();
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper$Delegate
            public void onOpen(UncheckedColor uncheckedColor) {
                FWFDBRoom_Impl.this.serializer = uncheckedColor;
                FWFDBRoom_Impl.this.internalInitInvalidationTracker(uncheckedColor);
                if (FWFDBRoom_Impl.this.IconCompatParcelizer != null) {
                    int size = FWFDBRoom_Impl.this.IconCompatParcelizer.size();
                    for (int i = 0; i < size; i++) {
                        ((skewRad) FWFDBRoom_Impl.this.IconCompatParcelizer.get(i)).read(uncheckedColor);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper$Delegate
            public void onPreMigrate(UncheckedColor uncheckedColor) {
                uncheckedColor.getClass();
                createCache.RemoteActionCompatParcelizer(new C0172getimpl(uncheckedColor));
            }

            @Override // androidx.room.RoomOpenHelper$Delegate
            public rotateRaddefault onValidateSchema(UncheckedColor uncheckedColor) {
                HashMap map = new HashMap(5);
                map.put("key", new getBlack0d7_KjU("key", "TEXT", true, 1, null, 1));
                map.put("token", new getBlack0d7_KjU("token", "TEXT", true, 2, null, 1));
                map.put(FWFConstants.EXPLANATION_TYPE_KIND, new getBlack0d7_KjU(FWFConstants.EXPLANATION_TYPE_KIND, "TEXT", false, 0, null, 1));
                map.put(FeatureFlag.ENABLED, new getBlack0d7_KjU(FeatureFlag.ENABLED, "INTEGER", false, 0, null, 1));
                map.put(HttpHeaders.DATE, new getBlack0d7_KjU(HttpHeaders.DATE, "INTEGER", false, 0, null, 1));
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations = new getUnspecified0d7_KjUannotations("FWFFlagKey", map, new HashSet(0), new HashSet(0));
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsSerializer = getUnspecified0d7_KjUannotations.serializer(uncheckedColor, "FWFFlagKey");
                if (!getunspecified0d7_kjuannotations.equals(getunspecified0d7_kjuannotationsSerializer)) {
                    return new rotateRaddefault(false, MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("FWFFlagKey(fwfd.com.fwfsdk.model.db.FWFFlagKey).\n Expected:\n", getunspecified0d7_kjuannotations, "\n Found:\n", getunspecified0d7_kjuannotationsSerializer));
                }
                HashMap map2 = new HashMap(2);
                map2.put("sdkVersion", new getBlack0d7_KjU("sdkVersion", "TEXT", true, 1, null, 1));
                map2.put("versionNumber", new getBlack0d7_KjU("versionNumber", "INTEGER", false, 0, null, 1));
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations2 = new getUnspecified0d7_KjUannotations("FWFSDKInfo", map2, new HashSet(0), new HashSet(0));
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsSerializer2 = getUnspecified0d7_KjUannotations.serializer(uncheckedColor, "FWFSDKInfo");
                if (!getunspecified0d7_kjuannotations2.equals(getunspecified0d7_kjuannotationsSerializer2)) {
                    return new rotateRaddefault(false, MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("FWFSDKInfo(fwfd.com.fwfsdk.model.db.FWFSDKInfo).\n Expected:\n", getunspecified0d7_kjuannotations2, "\n Found:\n", getunspecified0d7_kjuannotationsSerializer2));
                }
                HashMap map3 = new HashMap(18);
                map3.put("key", new getBlack0d7_KjU("key", "TEXT", true, 1, null, 1));
                map3.put("variation", new getBlack0d7_KjU("variation", "BLOB", false, 0, null, 1));
                map3.put("abTest", new getBlack0d7_KjU("abTest", "INTEGER", true, 0, null, 1));
                map3.put("accessToken", new getBlack0d7_KjU("accessToken", "TEXT", true, 2, null, 1));
                map3.put(HttpHeaders.DATE, new getBlack0d7_KjU(HttpHeaders.DATE, "INTEGER", true, 0, null, 1));
                map3.put("relevantContext", new getBlack0d7_KjU("relevantContext", "TEXT", false, 0, null, 1));
                map3.put("subscribe", new getBlack0d7_KjU("subscribe", "INTEGER", true, 0, null, 1));
                map3.put("holdoutsEvaluations", new getBlack0d7_KjU("holdoutsEvaluations", "TEXT", false, 0, null, 1));
                map3.put(FWFConstants.EXPLANATION_TYPE_KIND, new getBlack0d7_KjU(FWFConstants.EXPLANATION_TYPE_KIND, "TEXT", false, 0, null, 1));
                map3.put(RemoteMessageConst.FROM, new getBlack0d7_KjU(RemoteMessageConst.FROM, "TEXT", false, 0, null, 1));
                map3.put("ruleIndex", new getBlack0d7_KjU("ruleIndex", "TEXT", false, 0, null, 1));
                map3.put("evaluatedAttributes", new getBlack0d7_KjU("evaluatedAttributes", "TEXT", false, 0, null, 1));
                map3.put("evaluatedFlags", new getBlack0d7_KjU("evaluatedFlags", "TEXT", false, 0, null, 1));
                map3.put(FWFConstants.EXPLANATION_TYPE_ERROR, new getBlack0d7_KjU(FWFConstants.EXPLANATION_TYPE_ERROR, "TEXT", false, 0, null, 1));
                map3.put("variationName", new getBlack0d7_KjU("variationName", "BLOB", false, 0, null, 1));
                map3.put("flagType", new getBlack0d7_KjU("flagType", "TEXT", false, 0, null, 1));
                map3.put("flagEnabled", new getBlack0d7_KjU("flagEnabled", "INTEGER", false, 0, null, 1));
                map3.put("trackerServices", new getBlack0d7_KjU("trackerServices", "TEXT", false, 0, null, 1));
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotations3 = new getUnspecified0d7_KjUannotations("FWFFeature", map3, new HashSet(0), new HashSet(0));
                getUnspecified0d7_KjUannotations getunspecified0d7_kjuannotationsSerializer3 = getUnspecified0d7_KjUannotations.serializer(uncheckedColor, "FWFFeature");
                if (!getunspecified0d7_kjuannotations3.equals(getunspecified0d7_kjuannotationsSerializer3)) {
                    return new rotateRaddefault(false, MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("FWFFeature(fwfd.com.fwfsdk.model.db.FWFFeature).\n Expected:\n", getunspecified0d7_kjuannotations3, "\n Found:\n", getunspecified0d7_kjuannotationsSerializer3));
                }
                return new rotateRaddefault(true, null);
            }
        });
        Context context = lerpnullablefloatlist.MediaBrowserCompatMediaItem;
        context.getClass();
        return lerpnullablefloatlist.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(new getUnspecifiedColorannotations(context, lerpnullablefloatlist.MediaSessionCompatResultReceiverWrapper, withsavelayer, false, false));
    }
}
