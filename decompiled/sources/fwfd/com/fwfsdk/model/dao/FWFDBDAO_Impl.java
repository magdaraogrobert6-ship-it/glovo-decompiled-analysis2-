package fwfd.com.fwfsdk.model.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.models.FeatureFlag;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.common.HttpHeaders;
import fwfd.com.fwfsdk.constant.FWFConstants;
import fwfd.com.fwfsdk.model.api.FWFExplanation;
import fwfd.com.fwfsdk.model.api.FWFTrackInfo;
import fwfd.com.fwfsdk.model.db.FWFFeature;
import fwfd.com.fwfsdk.model.db.FWFFlagId;
import fwfd.com.fwfsdk.model.db.FWFFlagKey;
import fwfd.com.fwfsdk.model.db.FWFSDKInfo;
import fwfd.com.fwfsdk.util.FWFAnyConverter;
import fwfd.com.fwfsdk.util.FWFMapConverter;
import fwfd.com.fwfsdk.util.FWFStringListConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.TuplesKt;
import o.CanvasUtils;
import o.getLightGray0d7_KjUannotations;
import o.getTransparent0d7_KjUannotations;
import o.luminance8_81llA;

/* JADX INFO: loaded from: classes5.dex */
public final class FWFDBDAO_Impl extends FWFDBDAO {
    private final RoomDatabase __db;
    private final FWFAnyConverter __fWFAnyConverter = new FWFAnyConverter();
    private final EntityInsertionAdapter __insertionAdapterOfFWFFeature;
    private final EntityInsertionAdapter __insertionAdapterOfFWFFlagKey;
    private final EntityInsertionAdapter __insertionAdapterOfFWFSDKInfo;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllFlagKeys;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllFlagRecords;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAllFlagsFromEnvironment;

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void deleteAllFlagKeys(String str) {
        this.__db.assertNotSuspendingTransaction();
        luminance8_81llA luminance8_81llaAcquire = this.__preparedStmtOfDeleteAllFlagKeys.acquire();
        if (str == null) {
            luminance8_81llaAcquire.serializer(1);
        } else {
            luminance8_81llaAcquire.serializer(1, str);
        }
        this.__db.beginTransaction();
        try {
            luminance8_81llaAcquire.RemoteActionCompatParcelizer();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllFlagKeys.release(luminance8_81llaAcquire);
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void deleteAllFlagRecords() {
        this.__db.assertNotSuspendingTransaction();
        luminance8_81llA luminance8_81llaAcquire = this.__preparedStmtOfDeleteAllFlagRecords.acquire();
        this.__db.beginTransaction();
        try {
            luminance8_81llaAcquire.RemoteActionCompatParcelizer();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllFlagRecords.release(luminance8_81llaAcquire);
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void deleteAllFlagsFromEnvironment(String str) {
        this.__db.assertNotSuspendingTransaction();
        luminance8_81llA luminance8_81llaAcquire = this.__preparedStmtOfDeleteAllFlagsFromEnvironment.acquire();
        if (str == null) {
            luminance8_81llaAcquire.serializer(1);
        } else {
            luminance8_81llaAcquire.serializer(1, str);
        }
        this.__db.beginTransaction();
        try {
            luminance8_81llaAcquire.RemoteActionCompatParcelizer();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllFlagsFromEnvironment.release(luminance8_81llaAcquire);
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void deleteAndInsertNewFlagKeys(List<FWFFlagKey> list, String str) {
        this.__db.beginTransaction();
        try {
            super.deleteAndInsertNewFlagKeys(list, str);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void insertFlag(FWFFeature fWFFeature) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfFWFFeature.insert(fWFFeature);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void insertFlagKeys(List<FWFFlagKey> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfFWFFlagKey.insert((Iterable<Object>) list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void insertFlags(List<FWFFeature> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfFWFFeature.insert((Iterable<Object>) list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public void insertSDKInfo(FWFSDKInfo fWFSDKInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfFWFSDKInfo.insert(fWFSDKInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public List<FWFFlagId> getAllFlagKeysByRelevantContext(String str) {
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(1, "SELECT `key`, accessToken, date FROM FWFFeature WHERE relevantContext LIKE ? AND subscribe = 1");
        if (str == null) {
            canvasUtilsIconCompatParcelizer.serializer(1);
        } else {
            canvasUtilsIconCompatParcelizer.serializer(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            ArrayList arrayList = new ArrayList(cursorIconCompatParcelizer.getCount());
            while (cursorIconCompatParcelizer.moveToNext()) {
                Long lValueOf = null;
                String string = cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer);
                String string2 = cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getString(iSerializer2);
                if (!cursorIconCompatParcelizer.isNull(iSerializer3)) {
                    lValueOf = Long.valueOf(cursorIconCompatParcelizer.getLong(iSerializer3));
                }
                arrayList.add(new FWFFlagId(string, string2, lValueOf));
            }
            return arrayList;
        } finally {
            cursorIconCompatParcelizer.close();
            canvasUtilsIconCompatParcelizer.serializer();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public FWFSDKInfo getLastSDKInfo() {
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(0, "SELECT * FROM FWFSDKInfo ORDER BY versionNumber DESC LIMIT 1");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "sdkVersion");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "versionNumber");
            FWFSDKInfo fWFSDKInfo = null;
            Integer numValueOf = null;
            if (cursorIconCompatParcelizer.moveToFirst()) {
                String string = cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer);
                if (!cursorIconCompatParcelizer.isNull(iSerializer2)) {
                    numValueOf = Integer.valueOf(cursorIconCompatParcelizer.getInt(iSerializer2));
                }
                fWFSDKInfo = new FWFSDKInfo(string, numValueOf);
            }
            return fWFSDKInfo;
        } finally {
            cursorIconCompatParcelizer.close();
            canvasUtilsIconCompatParcelizer.serializer();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public FWFFlagId getOldestUpdatedFlagFromEnvironment(String str) {
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(1, "SELECT `key`, accessToken, date FROM FWFFeature WHERE accessToken = ? ORDER BY date DESC LIMIT 1");
        if (str == null) {
            canvasUtilsIconCompatParcelizer.serializer(1);
        } else {
            canvasUtilsIconCompatParcelizer.serializer(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            FWFFlagId fWFFlagId = null;
            Long lValueOf = null;
            if (cursorIconCompatParcelizer.moveToFirst()) {
                String string = cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer);
                String string2 = cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getString(iSerializer2);
                if (!cursorIconCompatParcelizer.isNull(iSerializer3)) {
                    lValueOf = Long.valueOf(cursorIconCompatParcelizer.getLong(iSerializer3));
                }
                fWFFlagId = new FWFFlagId(string, string2, lValueOf);
            }
            return fWFFlagId;
        } finally {
            cursorIconCompatParcelizer.close();
            canvasUtilsIconCompatParcelizer.serializer();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public List<FWFFlagId> getSubscribedFlagIds() {
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(0, "SELECT `key`, accessToken, date FROM FWFFeature WHERE subscribe = 1");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            ArrayList arrayList = new ArrayList(cursorIconCompatParcelizer.getCount());
            while (cursorIconCompatParcelizer.moveToNext()) {
                Long lValueOf = null;
                String string = cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer);
                String string2 = cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getString(iSerializer2);
                if (!cursorIconCompatParcelizer.isNull(iSerializer3)) {
                    lValueOf = Long.valueOf(cursorIconCompatParcelizer.getLong(iSerializer3));
                }
                arrayList.add(new FWFFlagId(string, string2, lValueOf));
            }
            return arrayList;
        } finally {
            cursorIconCompatParcelizer.close();
            canvasUtilsIconCompatParcelizer.serializer();
        }
    }

    public FWFDBDAO_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfFWFFeature = new EntityInsertionAdapter(roomDatabase) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBDAO_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `FWFFeature` (`key`,`variation`,`abTest`,`accessToken`,`date`,`relevantContext`,`subscribe`,`holdoutsEvaluations`,`kind`,`from`,`ruleIndex`,`evaluatedAttributes`,`evaluatedFlags`,`error`,`variationName`,`flagType`,`flagEnabled`,`trackerServices`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(luminance8_81llA luminance8_81lla, FWFFeature fWFFeature) {
                if (fWFFeature.getKey() == null) {
                    luminance8_81lla.serializer(1);
                } else {
                    luminance8_81lla.serializer(1, fWFFeature.getKey());
                }
                byte[] string = FWFDBDAO_Impl.this.__fWFAnyConverter.toString(fWFFeature.getVariation());
                if (string == null) {
                    luminance8_81lla.serializer(2);
                } else {
                    luminance8_81lla.IconCompatParcelizer(2, string);
                }
                luminance8_81lla.IconCompatParcelizer(3, fWFFeature.getAbTest() ? 1L : 0L);
                if (fWFFeature.getAccessToken() == null) {
                    luminance8_81lla.serializer(4);
                } else {
                    luminance8_81lla.serializer(4, fWFFeature.getAccessToken());
                }
                luminance8_81lla.IconCompatParcelizer(5, fWFFeature.getDate());
                if (fWFFeature.getRelevantContext() == null) {
                    luminance8_81lla.serializer(6);
                } else {
                    luminance8_81lla.serializer(6, fWFFeature.getRelevantContext());
                }
                luminance8_81lla.IconCompatParcelizer(7, fWFFeature.getSubscribe());
                String strFromMap = FWFMapConverter.fromMap(fWFFeature.getHoldoutsEvaluations());
                if (strFromMap == null) {
                    luminance8_81lla.serializer(8);
                } else {
                    luminance8_81lla.serializer(8, strFromMap);
                }
                FWFExplanation explanation = fWFFeature.getExplanation();
                if (explanation != null) {
                    if (explanation.getKind() == null) {
                        luminance8_81lla.serializer(9);
                    } else {
                        luminance8_81lla.serializer(9, explanation.getKind());
                    }
                    if (explanation.getFrom() == null) {
                        luminance8_81lla.serializer(10);
                    } else {
                        luminance8_81lla.serializer(10, explanation.getFrom());
                    }
                    if (explanation.getRuleIndex() == null) {
                        luminance8_81lla.serializer(11);
                    } else {
                        luminance8_81lla.serializer(11, explanation.getRuleIndex());
                    }
                    String strFromArrayList = FWFStringListConverter.fromArrayList(explanation.getEvaluatedAttributes());
                    if (strFromArrayList == null) {
                        luminance8_81lla.serializer(12);
                    } else {
                        luminance8_81lla.serializer(12, strFromArrayList);
                    }
                    String strFromArrayList2 = FWFStringListConverter.fromArrayList(explanation.getEvaluatedFlags());
                    if (strFromArrayList2 == null) {
                        luminance8_81lla.serializer(13);
                    } else {
                        luminance8_81lla.serializer(13, strFromArrayList2);
                    }
                    if (explanation.getError() == null) {
                        luminance8_81lla.serializer(14);
                    } else {
                        luminance8_81lla.serializer(14, explanation.getError());
                    }
                } else {
                    luminance8_81lla.serializer(9);
                    luminance8_81lla.serializer(10);
                    luminance8_81lla.serializer(11);
                    luminance8_81lla.serializer(12);
                    luminance8_81lla.serializer(13);
                    luminance8_81lla.serializer(14);
                }
                FWFTrackInfo trackInfo = fWFFeature.getTrackInfo();
                if (trackInfo == null) {
                    luminance8_81lla.serializer(15);
                    luminance8_81lla.serializer(16);
                    luminance8_81lla.serializer(17);
                    luminance8_81lla.serializer(18);
                    return;
                }
                byte[] string2 = FWFDBDAO_Impl.this.__fWFAnyConverter.toString(trackInfo.getVariationName());
                if (string2 == null) {
                    luminance8_81lla.serializer(15);
                } else {
                    luminance8_81lla.IconCompatParcelizer(15, string2);
                }
                if (trackInfo.getFlagType() == null) {
                    luminance8_81lla.serializer(16);
                } else {
                    luminance8_81lla.serializer(16, trackInfo.getFlagType());
                }
                Integer numValueOf = trackInfo.getFlagEnabled() == null ? null : Integer.valueOf(trackInfo.getFlagEnabled().booleanValue() ? 1 : 0);
                if (numValueOf == null) {
                    luminance8_81lla.serializer(17);
                } else {
                    luminance8_81lla.IconCompatParcelizer(17, numValueOf.intValue());
                }
                String strFromArrayList3 = FWFStringListConverter.fromArrayList(trackInfo.getTrackerServices());
                if (strFromArrayList3 == null) {
                    luminance8_81lla.serializer(18);
                } else {
                    luminance8_81lla.serializer(18, strFromArrayList3);
                }
            }
        };
        this.__insertionAdapterOfFWFFlagKey = new EntityInsertionAdapter(roomDatabase) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBDAO_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `FWFFlagKey` (`key`,`token`,`kind`,`enabled`,`date`) VALUES (?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(luminance8_81llA luminance8_81lla, FWFFlagKey fWFFlagKey) {
                if (fWFFlagKey.getKey() == null) {
                    luminance8_81lla.serializer(1);
                } else {
                    luminance8_81lla.serializer(1, fWFFlagKey.getKey());
                }
                if (fWFFlagKey.getToken() == null) {
                    luminance8_81lla.serializer(2);
                } else {
                    luminance8_81lla.serializer(2, fWFFlagKey.getToken());
                }
                if (fWFFlagKey.getKind() == null) {
                    luminance8_81lla.serializer(3);
                } else {
                    luminance8_81lla.serializer(3, fWFFlagKey.getKind());
                }
                Integer numValueOf = fWFFlagKey.getEnabled() == null ? null : Integer.valueOf(fWFFlagKey.getEnabled().booleanValue() ? 1 : 0);
                if (numValueOf == null) {
                    luminance8_81lla.serializer(4);
                } else {
                    luminance8_81lla.IconCompatParcelizer(4, numValueOf.intValue());
                }
                if (fWFFlagKey.getDate() == null) {
                    luminance8_81lla.serializer(5);
                } else {
                    luminance8_81lla.IconCompatParcelizer(5, fWFFlagKey.getDate().longValue());
                }
            }
        };
        this.__insertionAdapterOfFWFSDKInfo = new EntityInsertionAdapter(roomDatabase) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBDAO_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `FWFSDKInfo` (`sdkVersion`,`versionNumber`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(luminance8_81llA luminance8_81lla, FWFSDKInfo fWFSDKInfo) {
                if (fWFSDKInfo.getSdkVersion() == null) {
                    luminance8_81lla.serializer(1);
                } else {
                    luminance8_81lla.serializer(1, fWFSDKInfo.getSdkVersion());
                }
                if (fWFSDKInfo.getVersionNumber() == null) {
                    luminance8_81lla.serializer(2);
                } else {
                    luminance8_81lla.IconCompatParcelizer(2, fWFSDKInfo.getVersionNumber().intValue());
                }
            }
        };
        this.__preparedStmtOfDeleteAllFlagRecords = new SharedSQLiteStatement(roomDatabase) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBDAO_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM FWFFeature";
            }
        };
        this.__preparedStmtOfDeleteAllFlagsFromEnvironment = new SharedSQLiteStatement(roomDatabase) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBDAO_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM FWFFeature WHERE accessToken = ?";
            }
        };
        this.__preparedStmtOfDeleteAllFlagKeys = new SharedSQLiteStatement(roomDatabase) { // from class: fwfd.com.fwfsdk.model.dao.FWFDBDAO_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM FWFFlagKey WHERE token = ?";
            }
        };
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public List<FWFFeature> getAllExperiments() throws Throwable {
        CanvasUtils canvasUtils;
        FWFExplanation fWFExplanation;
        FWFTrackInfo fWFTrackInfo;
        Boolean boolValueOf;
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(0, "SELECT * FROM FWFFeature WHERE abTest = 1");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variation");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "abTest");
            int iSerializer4 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer5 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            int iSerializer6 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "relevantContext");
            int iSerializer7 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "subscribe");
            int iSerializer8 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "holdoutsEvaluations");
            int iSerializer9 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_KIND);
            int iSerializer10 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, RemoteMessageConst.FROM);
            int iSerializer11 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "ruleIndex");
            int iSerializer12 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedAttributes");
            int iSerializer13 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedFlags");
            int iSerializer14 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_ERROR);
            canvasUtils = canvasUtilsIconCompatParcelizer;
            try {
                int iSerializer15 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variationName");
                int i = iSerializer8;
                int iSerializer16 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagType");
                int i2 = iSerializer7;
                int iSerializer17 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagEnabled");
                int i3 = iSerializer6;
                int iSerializer18 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "trackerServices");
                int i4 = iSerializer5;
                int i5 = iSerializer4;
                ArrayList arrayList = new ArrayList(cursorIconCompatParcelizer.getCount());
                while (cursorIconCompatParcelizer.moveToNext()) {
                    if (cursorIconCompatParcelizer.isNull(iSerializer9) && cursorIconCompatParcelizer.isNull(iSerializer10) && cursorIconCompatParcelizer.isNull(iSerializer11) && cursorIconCompatParcelizer.isNull(iSerializer12) && cursorIconCompatParcelizer.isNull(iSerializer13) && cursorIconCompatParcelizer.isNull(iSerializer14)) {
                        iSerializer9 = iSerializer9;
                        fWFExplanation = null;
                    } else {
                        fWFExplanation = new FWFExplanation();
                        fWFExplanation.setKind(cursorIconCompatParcelizer.isNull(iSerializer9) ? null : cursorIconCompatParcelizer.getString(iSerializer9));
                        fWFExplanation.setFrom(cursorIconCompatParcelizer.isNull(iSerializer10) ? null : cursorIconCompatParcelizer.getString(iSerializer10));
                        fWFExplanation.setRuleIndex(cursorIconCompatParcelizer.isNull(iSerializer11) ? null : cursorIconCompatParcelizer.getString(iSerializer11));
                        fWFExplanation.setEvaluatedAttributes(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer12) ? null : cursorIconCompatParcelizer.getString(iSerializer12)));
                        fWFExplanation.setEvaluatedFlags(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer13) ? null : cursorIconCompatParcelizer.getString(iSerializer13)));
                        fWFExplanation.setError(cursorIconCompatParcelizer.isNull(iSerializer14) ? null : cursorIconCompatParcelizer.getString(iSerializer14));
                    }
                    if (cursorIconCompatParcelizer.isNull(iSerializer15) && cursorIconCompatParcelizer.isNull(iSerializer16) && cursorIconCompatParcelizer.isNull(iSerializer17) && cursorIconCompatParcelizer.isNull(iSerializer18)) {
                        iSerializer14 = iSerializer14;
                        fWFTrackInfo = null;
                    } else {
                        fWFTrackInfo = new FWFTrackInfo();
                        fWFTrackInfo.setVariationName(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer15) ? null : cursorIconCompatParcelizer.getBlob(iSerializer15)));
                        fWFTrackInfo.setFlagType(cursorIconCompatParcelizer.isNull(iSerializer16) ? null : cursorIconCompatParcelizer.getString(iSerializer16));
                        Integer numValueOf = cursorIconCompatParcelizer.isNull(iSerializer17) ? null : Integer.valueOf(cursorIconCompatParcelizer.getInt(iSerializer17));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        fWFTrackInfo.setFlagEnabled(boolValueOf);
                        fWFTrackInfo.setTrackerServices(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer18) ? null : cursorIconCompatParcelizer.getString(iSerializer18)));
                    }
                    FWFFeature fWFFeature = new FWFFeature();
                    fWFFeature.setKey(cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer));
                    fWFFeature.setVariation(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getBlob(iSerializer2)));
                    fWFFeature.setAbTest(cursorIconCompatParcelizer.getInt(iSerializer3) != 0);
                    int i6 = i5;
                    fWFFeature.setAccessToken(cursorIconCompatParcelizer.isNull(i6) ? null : cursorIconCompatParcelizer.getString(i6));
                    int i7 = iSerializer15;
                    int i8 = i4;
                    int i9 = iSerializer13;
                    fWFFeature.setDate(cursorIconCompatParcelizer.getLong(i8));
                    int i10 = i3;
                    fWFFeature.setRelevantContext(cursorIconCompatParcelizer.isNull(i10) ? null : cursorIconCompatParcelizer.getString(i10));
                    int i11 = i2;
                    fWFFeature.setSubscribe(cursorIconCompatParcelizer.getInt(i11));
                    int i12 = i;
                    i = i12;
                    fWFFeature.setHoldoutsEvaluations(FWFMapConverter.fromString(cursorIconCompatParcelizer.isNull(i12) ? null : cursorIconCompatParcelizer.getString(i12)));
                    fWFFeature.setExplanation(fWFExplanation);
                    fWFFeature.setTrackInfo(fWFTrackInfo);
                    arrayList.add(fWFFeature);
                    i3 = i10;
                    iSerializer13 = i9;
                    iSerializer9 = iSerializer9;
                    iSerializer14 = iSerializer14;
                    iSerializer = iSerializer;
                    i4 = i8;
                    i2 = i11;
                    iSerializer15 = i7;
                    i5 = i6;
                }
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            canvasUtils = canvasUtilsIconCompatParcelizer;
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public List<FWFFeature> getAllFlags() throws Throwable {
        CanvasUtils canvasUtils;
        FWFExplanation fWFExplanation;
        FWFTrackInfo fWFTrackInfo;
        Boolean boolValueOf;
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(0, "SELECT * FROM FWFFeature");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variation");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "abTest");
            int iSerializer4 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer5 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            int iSerializer6 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "relevantContext");
            int iSerializer7 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "subscribe");
            int iSerializer8 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "holdoutsEvaluations");
            int iSerializer9 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_KIND);
            int iSerializer10 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, RemoteMessageConst.FROM);
            int iSerializer11 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "ruleIndex");
            int iSerializer12 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedAttributes");
            int iSerializer13 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedFlags");
            int iSerializer14 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_ERROR);
            canvasUtils = canvasUtilsIconCompatParcelizer;
            try {
                int iSerializer15 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variationName");
                int i = iSerializer8;
                int iSerializer16 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagType");
                int i2 = iSerializer7;
                int iSerializer17 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagEnabled");
                int i3 = iSerializer6;
                int iSerializer18 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "trackerServices");
                int i4 = iSerializer5;
                int i5 = iSerializer4;
                ArrayList arrayList = new ArrayList(cursorIconCompatParcelizer.getCount());
                while (cursorIconCompatParcelizer.moveToNext()) {
                    if (cursorIconCompatParcelizer.isNull(iSerializer9) && cursorIconCompatParcelizer.isNull(iSerializer10) && cursorIconCompatParcelizer.isNull(iSerializer11) && cursorIconCompatParcelizer.isNull(iSerializer12) && cursorIconCompatParcelizer.isNull(iSerializer13) && cursorIconCompatParcelizer.isNull(iSerializer14)) {
                        iSerializer9 = iSerializer9;
                        fWFExplanation = null;
                    } else {
                        fWFExplanation = new FWFExplanation();
                        fWFExplanation.setKind(cursorIconCompatParcelizer.isNull(iSerializer9) ? null : cursorIconCompatParcelizer.getString(iSerializer9));
                        fWFExplanation.setFrom(cursorIconCompatParcelizer.isNull(iSerializer10) ? null : cursorIconCompatParcelizer.getString(iSerializer10));
                        fWFExplanation.setRuleIndex(cursorIconCompatParcelizer.isNull(iSerializer11) ? null : cursorIconCompatParcelizer.getString(iSerializer11));
                        fWFExplanation.setEvaluatedAttributes(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer12) ? null : cursorIconCompatParcelizer.getString(iSerializer12)));
                        fWFExplanation.setEvaluatedFlags(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer13) ? null : cursorIconCompatParcelizer.getString(iSerializer13)));
                        fWFExplanation.setError(cursorIconCompatParcelizer.isNull(iSerializer14) ? null : cursorIconCompatParcelizer.getString(iSerializer14));
                    }
                    if (cursorIconCompatParcelizer.isNull(iSerializer15) && cursorIconCompatParcelizer.isNull(iSerializer16) && cursorIconCompatParcelizer.isNull(iSerializer17) && cursorIconCompatParcelizer.isNull(iSerializer18)) {
                        iSerializer14 = iSerializer14;
                        fWFTrackInfo = null;
                    } else {
                        fWFTrackInfo = new FWFTrackInfo();
                        fWFTrackInfo.setVariationName(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer15) ? null : cursorIconCompatParcelizer.getBlob(iSerializer15)));
                        fWFTrackInfo.setFlagType(cursorIconCompatParcelizer.isNull(iSerializer16) ? null : cursorIconCompatParcelizer.getString(iSerializer16));
                        Integer numValueOf = cursorIconCompatParcelizer.isNull(iSerializer17) ? null : Integer.valueOf(cursorIconCompatParcelizer.getInt(iSerializer17));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        fWFTrackInfo.setFlagEnabled(boolValueOf);
                        fWFTrackInfo.setTrackerServices(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer18) ? null : cursorIconCompatParcelizer.getString(iSerializer18)));
                    }
                    FWFFeature fWFFeature = new FWFFeature();
                    fWFFeature.setKey(cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer));
                    fWFFeature.setVariation(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getBlob(iSerializer2)));
                    fWFFeature.setAbTest(cursorIconCompatParcelizer.getInt(iSerializer3) != 0);
                    int i6 = i5;
                    fWFFeature.setAccessToken(cursorIconCompatParcelizer.isNull(i6) ? null : cursorIconCompatParcelizer.getString(i6));
                    int i7 = iSerializer15;
                    int i8 = i4;
                    int i9 = iSerializer13;
                    fWFFeature.setDate(cursorIconCompatParcelizer.getLong(i8));
                    int i10 = i3;
                    fWFFeature.setRelevantContext(cursorIconCompatParcelizer.isNull(i10) ? null : cursorIconCompatParcelizer.getString(i10));
                    int i11 = i2;
                    fWFFeature.setSubscribe(cursorIconCompatParcelizer.getInt(i11));
                    int i12 = i;
                    i = i12;
                    fWFFeature.setHoldoutsEvaluations(FWFMapConverter.fromString(cursorIconCompatParcelizer.isNull(i12) ? null : cursorIconCompatParcelizer.getString(i12)));
                    fWFFeature.setExplanation(fWFExplanation);
                    fWFFeature.setTrackInfo(fWFTrackInfo);
                    arrayList.add(fWFFeature);
                    i3 = i10;
                    iSerializer13 = i9;
                    iSerializer9 = iSerializer9;
                    iSerializer14 = iSerializer14;
                    iSerializer = iSerializer;
                    i4 = i8;
                    i2 = i11;
                    iSerializer15 = i7;
                    i5 = i6;
                }
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            canvasUtils = canvasUtilsIconCompatParcelizer;
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public List<FWFFeature> getFlagsById(List<String> list, String str) throws Throwable {
        CanvasUtils canvasUtils;
        FWFExplanation fWFExplanation;
        FWFTrackInfo fWFTrackInfo;
        Boolean boolValueOf;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("SELECT * FROM FWFFeature WHERE `key` IN (");
        int size = list.size();
        getTransparent0d7_KjUannotations.RemoteActionCompatParcelizer(size, sbM);
        sbM.append(") AND accessToken = ");
        sbM.append("?");
        int i = size + 1;
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(i, sbM.toString());
        int i2 = 1;
        for (String str2 : list) {
            if (str2 == null) {
                canvasUtilsIconCompatParcelizer.serializer(i2);
            } else {
                canvasUtilsIconCompatParcelizer.serializer(i2, str2);
            }
            i2++;
        }
        if (str == null) {
            canvasUtilsIconCompatParcelizer.serializer(i);
        } else {
            canvasUtilsIconCompatParcelizer.serializer(i, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variation");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "abTest");
            int iSerializer4 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer5 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            int iSerializer6 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "relevantContext");
            int iSerializer7 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "subscribe");
            int iSerializer8 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "holdoutsEvaluations");
            int iSerializer9 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_KIND);
            int iSerializer10 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, RemoteMessageConst.FROM);
            int iSerializer11 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "ruleIndex");
            int iSerializer12 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedAttributes");
            int iSerializer13 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedFlags");
            int iSerializer14 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_ERROR);
            canvasUtils = canvasUtilsIconCompatParcelizer;
            try {
                int iSerializer15 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variationName");
                int i3 = iSerializer8;
                int iSerializer16 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagType");
                int i4 = iSerializer7;
                int iSerializer17 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagEnabled");
                int i5 = iSerializer6;
                int iSerializer18 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "trackerServices");
                int i6 = iSerializer5;
                int i7 = iSerializer4;
                ArrayList arrayList = new ArrayList(cursorIconCompatParcelizer.getCount());
                while (cursorIconCompatParcelizer.moveToNext()) {
                    if (cursorIconCompatParcelizer.isNull(iSerializer9) && cursorIconCompatParcelizer.isNull(iSerializer10) && cursorIconCompatParcelizer.isNull(iSerializer11) && cursorIconCompatParcelizer.isNull(iSerializer12) && cursorIconCompatParcelizer.isNull(iSerializer13) && cursorIconCompatParcelizer.isNull(iSerializer14)) {
                        iSerializer9 = iSerializer9;
                        fWFExplanation = null;
                    } else {
                        fWFExplanation = new FWFExplanation();
                        fWFExplanation.setKind(cursorIconCompatParcelizer.isNull(iSerializer9) ? null : cursorIconCompatParcelizer.getString(iSerializer9));
                        fWFExplanation.setFrom(cursorIconCompatParcelizer.isNull(iSerializer10) ? null : cursorIconCompatParcelizer.getString(iSerializer10));
                        fWFExplanation.setRuleIndex(cursorIconCompatParcelizer.isNull(iSerializer11) ? null : cursorIconCompatParcelizer.getString(iSerializer11));
                        fWFExplanation.setEvaluatedAttributes(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer12) ? null : cursorIconCompatParcelizer.getString(iSerializer12)));
                        fWFExplanation.setEvaluatedFlags(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer13) ? null : cursorIconCompatParcelizer.getString(iSerializer13)));
                        fWFExplanation.setError(cursorIconCompatParcelizer.isNull(iSerializer14) ? null : cursorIconCompatParcelizer.getString(iSerializer14));
                    }
                    if (cursorIconCompatParcelizer.isNull(iSerializer15) && cursorIconCompatParcelizer.isNull(iSerializer16) && cursorIconCompatParcelizer.isNull(iSerializer17) && cursorIconCompatParcelizer.isNull(iSerializer18)) {
                        iSerializer14 = iSerializer14;
                        fWFTrackInfo = null;
                    } else {
                        fWFTrackInfo = new FWFTrackInfo();
                        fWFTrackInfo.setVariationName(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer15) ? null : cursorIconCompatParcelizer.getBlob(iSerializer15)));
                        fWFTrackInfo.setFlagType(cursorIconCompatParcelizer.isNull(iSerializer16) ? null : cursorIconCompatParcelizer.getString(iSerializer16));
                        Integer numValueOf = cursorIconCompatParcelizer.isNull(iSerializer17) ? null : Integer.valueOf(cursorIconCompatParcelizer.getInt(iSerializer17));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        fWFTrackInfo.setFlagEnabled(boolValueOf);
                        fWFTrackInfo.setTrackerServices(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer18) ? null : cursorIconCompatParcelizer.getString(iSerializer18)));
                    }
                    FWFFeature fWFFeature = new FWFFeature();
                    fWFFeature.setKey(cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer));
                    fWFFeature.setVariation(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getBlob(iSerializer2)));
                    fWFFeature.setAbTest(cursorIconCompatParcelizer.getInt(iSerializer3) != 0);
                    int i8 = i7;
                    fWFFeature.setAccessToken(cursorIconCompatParcelizer.isNull(i8) ? null : cursorIconCompatParcelizer.getString(i8));
                    int i9 = iSerializer13;
                    int i10 = i6;
                    int i11 = iSerializer2;
                    fWFFeature.setDate(cursorIconCompatParcelizer.getLong(i10));
                    int i12 = i5;
                    fWFFeature.setRelevantContext(cursorIconCompatParcelizer.isNull(i12) ? null : cursorIconCompatParcelizer.getString(i12));
                    int i13 = i4;
                    fWFFeature.setSubscribe(cursorIconCompatParcelizer.getInt(i13));
                    int i14 = i3;
                    i3 = i14;
                    fWFFeature.setHoldoutsEvaluations(FWFMapConverter.fromString(cursorIconCompatParcelizer.isNull(i14) ? null : cursorIconCompatParcelizer.getString(i14)));
                    fWFFeature.setExplanation(fWFExplanation);
                    fWFFeature.setTrackInfo(fWFTrackInfo);
                    arrayList.add(fWFFeature);
                    i4 = i13;
                    iSerializer2 = i11;
                    iSerializer9 = iSerializer9;
                    iSerializer14 = iSerializer14;
                    iSerializer = iSerializer;
                    i6 = i10;
                    i5 = i12;
                    iSerializer13 = i9;
                    i7 = i8;
                }
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            canvasUtils = canvasUtilsIconCompatParcelizer;
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public List<FWFFeature> getAllFlagsFromEnvironment(String str) throws Throwable {
        CanvasUtils canvasUtils;
        FWFExplanation fWFExplanation;
        FWFTrackInfo fWFTrackInfo;
        Boolean boolValueOf;
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(1, "SELECT * FROM FWFFeature WHERE accessToken = ?");
        if (str == null) {
            canvasUtilsIconCompatParcelizer.serializer(1);
        } else {
            canvasUtilsIconCompatParcelizer.serializer(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variation");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "abTest");
            int iSerializer4 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer5 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            int iSerializer6 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "relevantContext");
            int iSerializer7 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "subscribe");
            int iSerializer8 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "holdoutsEvaluations");
            int iSerializer9 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_KIND);
            int iSerializer10 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, RemoteMessageConst.FROM);
            int iSerializer11 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "ruleIndex");
            int iSerializer12 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedAttributes");
            int iSerializer13 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedFlags");
            int iSerializer14 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_ERROR);
            canvasUtils = canvasUtilsIconCompatParcelizer;
            try {
                int iSerializer15 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variationName");
                int i = iSerializer8;
                int iSerializer16 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagType");
                int i2 = iSerializer7;
                int iSerializer17 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagEnabled");
                int i3 = iSerializer6;
                int iSerializer18 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "trackerServices");
                int i4 = iSerializer5;
                int i5 = iSerializer4;
                ArrayList arrayList = new ArrayList(cursorIconCompatParcelizer.getCount());
                while (cursorIconCompatParcelizer.moveToNext()) {
                    if (cursorIconCompatParcelizer.isNull(iSerializer9) && cursorIconCompatParcelizer.isNull(iSerializer10) && cursorIconCompatParcelizer.isNull(iSerializer11) && cursorIconCompatParcelizer.isNull(iSerializer12) && cursorIconCompatParcelizer.isNull(iSerializer13) && cursorIconCompatParcelizer.isNull(iSerializer14)) {
                        iSerializer9 = iSerializer9;
                        fWFExplanation = null;
                    } else {
                        fWFExplanation = new FWFExplanation();
                        fWFExplanation.setKind(cursorIconCompatParcelizer.isNull(iSerializer9) ? null : cursorIconCompatParcelizer.getString(iSerializer9));
                        fWFExplanation.setFrom(cursorIconCompatParcelizer.isNull(iSerializer10) ? null : cursorIconCompatParcelizer.getString(iSerializer10));
                        fWFExplanation.setRuleIndex(cursorIconCompatParcelizer.isNull(iSerializer11) ? null : cursorIconCompatParcelizer.getString(iSerializer11));
                        fWFExplanation.setEvaluatedAttributes(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer12) ? null : cursorIconCompatParcelizer.getString(iSerializer12)));
                        fWFExplanation.setEvaluatedFlags(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer13) ? null : cursorIconCompatParcelizer.getString(iSerializer13)));
                        fWFExplanation.setError(cursorIconCompatParcelizer.isNull(iSerializer14) ? null : cursorIconCompatParcelizer.getString(iSerializer14));
                    }
                    if (cursorIconCompatParcelizer.isNull(iSerializer15) && cursorIconCompatParcelizer.isNull(iSerializer16) && cursorIconCompatParcelizer.isNull(iSerializer17) && cursorIconCompatParcelizer.isNull(iSerializer18)) {
                        iSerializer14 = iSerializer14;
                        fWFTrackInfo = null;
                    } else {
                        fWFTrackInfo = new FWFTrackInfo();
                        fWFTrackInfo.setVariationName(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer15) ? null : cursorIconCompatParcelizer.getBlob(iSerializer15)));
                        fWFTrackInfo.setFlagType(cursorIconCompatParcelizer.isNull(iSerializer16) ? null : cursorIconCompatParcelizer.getString(iSerializer16));
                        Integer numValueOf = cursorIconCompatParcelizer.isNull(iSerializer17) ? null : Integer.valueOf(cursorIconCompatParcelizer.getInt(iSerializer17));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        fWFTrackInfo.setFlagEnabled(boolValueOf);
                        fWFTrackInfo.setTrackerServices(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer18) ? null : cursorIconCompatParcelizer.getString(iSerializer18)));
                    }
                    FWFFeature fWFFeature = new FWFFeature();
                    fWFFeature.setKey(cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer));
                    fWFFeature.setVariation(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getBlob(iSerializer2)));
                    fWFFeature.setAbTest(cursorIconCompatParcelizer.getInt(iSerializer3) != 0);
                    int i6 = i5;
                    fWFFeature.setAccessToken(cursorIconCompatParcelizer.isNull(i6) ? null : cursorIconCompatParcelizer.getString(i6));
                    int i7 = iSerializer15;
                    int i8 = i4;
                    int i9 = iSerializer13;
                    fWFFeature.setDate(cursorIconCompatParcelizer.getLong(i8));
                    int i10 = i3;
                    fWFFeature.setRelevantContext(cursorIconCompatParcelizer.isNull(i10) ? null : cursorIconCompatParcelizer.getString(i10));
                    int i11 = i2;
                    fWFFeature.setSubscribe(cursorIconCompatParcelizer.getInt(i11));
                    int i12 = i;
                    i = i12;
                    fWFFeature.setHoldoutsEvaluations(FWFMapConverter.fromString(cursorIconCompatParcelizer.isNull(i12) ? null : cursorIconCompatParcelizer.getString(i12)));
                    fWFFeature.setExplanation(fWFExplanation);
                    fWFFeature.setTrackInfo(fWFTrackInfo);
                    arrayList.add(fWFFeature);
                    i3 = i10;
                    iSerializer15 = i7;
                    i5 = i6;
                    iSerializer9 = iSerializer9;
                    iSerializer14 = iSerializer14;
                    iSerializer = iSerializer;
                    i2 = i11;
                    iSerializer13 = i9;
                    i4 = i8;
                }
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            canvasUtils = canvasUtilsIconCompatParcelizer;
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public List<FWFFlagKey> getFlagKeys(String str) {
        Boolean boolValueOf;
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(1, "SELECT * FROM FWFFlagKey WHERE token = ?");
        if (str == null) {
            canvasUtilsIconCompatParcelizer.serializer(1);
        } else {
            canvasUtilsIconCompatParcelizer.serializer(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "token");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_KIND);
            int iSerializer4 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FeatureFlag.ENABLED);
            int iSerializer5 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            ArrayList arrayList = new ArrayList(cursorIconCompatParcelizer.getCount());
            while (cursorIconCompatParcelizer.moveToNext()) {
                String string = cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer);
                String string2 = cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getString(iSerializer2);
                String string3 = cursorIconCompatParcelizer.isNull(iSerializer3) ? null : cursorIconCompatParcelizer.getString(iSerializer3);
                Integer numValueOf = cursorIconCompatParcelizer.isNull(iSerializer4) ? null : Integer.valueOf(cursorIconCompatParcelizer.getInt(iSerializer4));
                if (numValueOf == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                arrayList.add(new FWFFlagKey(string, string2, string3, boolValueOf, cursorIconCompatParcelizer.isNull(iSerializer5) ? null : Long.valueOf(cursorIconCompatParcelizer.getLong(iSerializer5))));
            }
            return arrayList;
        } finally {
            cursorIconCompatParcelizer.close();
            canvasUtilsIconCompatParcelizer.serializer();
        }
    }

    @Override // fwfd.com.fwfsdk.model.dao.FWFDBDAO
    public FWFFeature getFlagById(String str, String str2) throws Throwable {
        CanvasUtils canvasUtils;
        FWFExplanation fWFExplanation;
        FWFTrackInfo fWFTrackInfo;
        Boolean boolValueOf;
        CanvasUtils canvasUtilsIconCompatParcelizer = CanvasUtils.IconCompatParcelizer(2, "SELECT * FROM FWFFeature WHERE `key` = ? AND accessToken = ? LIMIT 1");
        if (str == null) {
            canvasUtilsIconCompatParcelizer.serializer(1);
        } else {
            canvasUtilsIconCompatParcelizer.serializer(1, str);
        }
        if (str2 == null) {
            canvasUtilsIconCompatParcelizer.serializer(2);
        } else {
            canvasUtilsIconCompatParcelizer.serializer(2, str2);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor cursorIconCompatParcelizer = TuplesKt.IconCompatParcelizer(this.__db, canvasUtilsIconCompatParcelizer);
        try {
            int iSerializer = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "key");
            int iSerializer2 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variation");
            int iSerializer3 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "abTest");
            int iSerializer4 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "accessToken");
            int iSerializer5 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, HttpHeaders.DATE);
            int iSerializer6 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "relevantContext");
            int iSerializer7 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "subscribe");
            int iSerializer8 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "holdoutsEvaluations");
            int iSerializer9 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_KIND);
            int iSerializer10 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, RemoteMessageConst.FROM);
            int iSerializer11 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "ruleIndex");
            int iSerializer12 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedAttributes");
            int iSerializer13 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "evaluatedFlags");
            int iSerializer14 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, FWFConstants.EXPLANATION_TYPE_ERROR);
            canvasUtils = canvasUtilsIconCompatParcelizer;
            try {
                int iSerializer15 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "variationName");
                int iSerializer16 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagType");
                int iSerializer17 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "flagEnabled");
                int iSerializer18 = getLightGray0d7_KjUannotations.serializer(cursorIconCompatParcelizer, "trackerServices");
                FWFFeature fWFFeature = null;
                String string = null;
                if (cursorIconCompatParcelizer.moveToFirst()) {
                    if (cursorIconCompatParcelizer.isNull(iSerializer9) && cursorIconCompatParcelizer.isNull(iSerializer10) && cursorIconCompatParcelizer.isNull(iSerializer11) && cursorIconCompatParcelizer.isNull(iSerializer12) && cursorIconCompatParcelizer.isNull(iSerializer13) && cursorIconCompatParcelizer.isNull(iSerializer14)) {
                        fWFExplanation = null;
                    } else {
                        fWFExplanation = new FWFExplanation();
                        fWFExplanation.setKind(cursorIconCompatParcelizer.isNull(iSerializer9) ? null : cursorIconCompatParcelizer.getString(iSerializer9));
                        fWFExplanation.setFrom(cursorIconCompatParcelizer.isNull(iSerializer10) ? null : cursorIconCompatParcelizer.getString(iSerializer10));
                        fWFExplanation.setRuleIndex(cursorIconCompatParcelizer.isNull(iSerializer11) ? null : cursorIconCompatParcelizer.getString(iSerializer11));
                        fWFExplanation.setEvaluatedAttributes(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer12) ? null : cursorIconCompatParcelizer.getString(iSerializer12)));
                        fWFExplanation.setEvaluatedFlags(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer13) ? null : cursorIconCompatParcelizer.getString(iSerializer13)));
                        fWFExplanation.setError(cursorIconCompatParcelizer.isNull(iSerializer14) ? null : cursorIconCompatParcelizer.getString(iSerializer14));
                    }
                    if (cursorIconCompatParcelizer.isNull(iSerializer15) && cursorIconCompatParcelizer.isNull(iSerializer16) && cursorIconCompatParcelizer.isNull(iSerializer17) && cursorIconCompatParcelizer.isNull(iSerializer18)) {
                        fWFTrackInfo = null;
                    } else {
                        fWFTrackInfo = new FWFTrackInfo();
                        fWFTrackInfo.setVariationName(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer15) ? null : cursorIconCompatParcelizer.getBlob(iSerializer15)));
                        fWFTrackInfo.setFlagType(cursorIconCompatParcelizer.isNull(iSerializer16) ? null : cursorIconCompatParcelizer.getString(iSerializer16));
                        Integer numValueOf = cursorIconCompatParcelizer.isNull(iSerializer17) ? null : Integer.valueOf(cursorIconCompatParcelizer.getInt(iSerializer17));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        fWFTrackInfo.setFlagEnabled(boolValueOf);
                        fWFTrackInfo.setTrackerServices(FWFStringListConverter.fromString(cursorIconCompatParcelizer.isNull(iSerializer18) ? null : cursorIconCompatParcelizer.getString(iSerializer18)));
                    }
                    FWFFeature fWFFeature2 = new FWFFeature();
                    fWFFeature2.setKey(cursorIconCompatParcelizer.isNull(iSerializer) ? null : cursorIconCompatParcelizer.getString(iSerializer));
                    fWFFeature2.setVariation(FWFAnyConverter.toObject(cursorIconCompatParcelizer.isNull(iSerializer2) ? null : cursorIconCompatParcelizer.getBlob(iSerializer2)));
                    fWFFeature2.setAbTest(cursorIconCompatParcelizer.getInt(iSerializer3) != 0);
                    fWFFeature2.setAccessToken(cursorIconCompatParcelizer.isNull(iSerializer4) ? null : cursorIconCompatParcelizer.getString(iSerializer4));
                    fWFFeature2.setDate(cursorIconCompatParcelizer.getLong(iSerializer5));
                    fWFFeature2.setRelevantContext(cursorIconCompatParcelizer.isNull(iSerializer6) ? null : cursorIconCompatParcelizer.getString(iSerializer6));
                    fWFFeature2.setSubscribe(cursorIconCompatParcelizer.getInt(iSerializer7));
                    if (!cursorIconCompatParcelizer.isNull(iSerializer8)) {
                        string = cursorIconCompatParcelizer.getString(iSerializer8);
                    }
                    fWFFeature2.setHoldoutsEvaluations(FWFMapConverter.fromString(string));
                    fWFFeature2.setExplanation(fWFExplanation);
                    fWFFeature2.setTrackInfo(fWFTrackInfo);
                    fWFFeature = fWFFeature2;
                }
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                return fWFFeature;
            } catch (Throwable th) {
                th = th;
                cursorIconCompatParcelizer.close();
                canvasUtils.serializer();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            canvasUtils = canvasUtilsIconCompatParcelizer;
        }
    }
}
