package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpl;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutNodeSubcompositionsStatecreateMeasurePolicy1 extends getOnGloballyPositioned {
    public final setForceReuse MediaSessionCompatResultReceiverWrapper;
    public final getCacheFileSuffixlambda0 PlaybackStateCompat;
    public static final String[] serializer = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] write = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] RemoteActionCompatParcelizer = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] read = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] IconCompatParcelizer = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] MediaMetadataCompat = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] MediaSessionCompatQueueItem = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] RatingCompat = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] MediaDescriptionCompat = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] MediaBrowserCompatMediaItem = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] ParcelableVolumeInfo = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    @Override // o.getOnGloballyPositioned
    public final void read() {
    }

    public static final void read(ContentValues contentValues, Object obj) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("value");
        accessgetSystemNavigationDowncp.IconCompatParcelizer(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0093 A[Catch: SQLiteException -> 0x00a9, all -> 0x00ac, TryCatch #0 {SQLiteException -> 0x00a9, blocks: (B:11:0x0072, B:13:0x0093, B:14:0x00a4), top: B:28:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x00a4 A[Catch: SQLiteException -> 0x00a9, all -> 0x00ac, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a9, blocks: (B:11:0x0072, B:13:0x0093, B:14:0x00a4), top: B:28:0x0072 }] */
    public final long IconCompatParcelizer(String str) {
        long j;
        ContentValues contentValues;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer("first_open_count");
        MediaSessionCompatToken();
        ComponentActivity();
        SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
        sQLiteDatabaseResultReceiver.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jWrite = write(sb.toString(), new String[]{str}, -1L);
                if (jWrite == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseResultReceiver.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.serializer.serializer("Failed to insert column (got -1). appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), "first_open_count");
                    } else {
                        jWrite = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jWrite));
                            if (sQLiteDatabaseResultReceiver.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.serializer.serializer("Failed to update column (got 0). appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), "first_open_count");
                            } else {
                                sQLiteDatabaseResultReceiver.setTransactionSuccessful();
                                j = jWrite;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jWrite;
                            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                            getlookaheaddelegate3.serializer.IconCompatParcelizer("Error inserting column. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jWrite));
                    if (sQLiteDatabaseResultReceiver.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                        getlookaheaddelegate4.serializer.serializer("Failed to update column (got 0). appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), "first_open_count");
                    } else {
                        sQLiteDatabaseResultReceiver.setTransactionSuccessful();
                        j = jWrite;
                    }
                }
            } finally {
                sQLiteDatabaseResultReceiver.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j;
    }

    public final void MediaDescriptionCompat(String str) {
        getPlaceablesCount getplaceablescountRemoteActionCompatParcelizer;
        write("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = ResultReceiver().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (getplaceablescountRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("events", str, string)) != null) {
                            write("events_snapshot", getplaceablescountRemoteActionCompatParcelizer);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer("Error creating snapshot. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    public final String MediaMetadataCompat() {
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        java.util.Locale locale = java.util.Locale.US;
        OnFirstVisibleModifierKt onFirstVisibleModifierKt = OnFirstVisibleModifierKt.GOOGLE_SIGNAL;
        int iZza = onFirstVisibleModifierKt.zza();
        Long l = (Long) premeasure0kLqBqw.ResultReceiver.IconCompatParcelizer(null);
        l.getClass();
        String str = "(upload_type = " + iZza + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != " + onFirstVisibleModifierKt.zza() + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) premeasure0kLqBqw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        c8$$ExternalSyntheticOutline0.m(sb, "(", str, " OR ", str2);
        sb.append(")");
        return sb.toString();
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0144  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0141: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:32:0x0141 */
    public final zzah RemoteActionCompatParcelizer(String str, String str2) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            try {
                cursorQuery = ResultReceiver().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        String str3 = string;
                        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cursorQuery, 1);
                        boolean z = cursorQuery.getInt(2) != 0;
                        String string2 = cursorQuery.getString(3);
                        long j = cursorQuery.getLong(4);
                        zzgz zzgzVar = this.MediaSessionCompatToken.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        zzpg.serializer(zzgzVar);
                        byte[] blob = cursorQuery.getBlob(5);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) zzgzVar.write(blob, creator);
                        long j2 = cursorQuery.getLong(6);
                        zzpg.serializer(zzgzVar);
                        zzbg zzbgVar2 = (zzbg) zzgzVar.write(cursorQuery.getBlob(7), creator);
                        long j3 = cursorQuery.getLong(8);
                        long j4 = cursorQuery.getLong(9);
                        zzpg.serializer(zzgzVar);
                        zzah zzahVar = new zzah(str, str3, new zzpl(j3, objRemoteActionCompatParcelizer, str2, str3), j2, z, string2, zzbgVar, j, zzbgVar2, j4, (zzbg) zzgzVar.write(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer("Got multiple records for conditional property, expected one", getLookaheadDelegate.RemoteActionCompatParcelizer(str), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(str2));
                        }
                        cursorQuery.close();
                        return zzahVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.IconCompatParcelizer("Error querying conditional property", getLookaheadDelegate.RemoteActionCompatParcelizer(str), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(str2), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    public final Object RemoteActionCompatParcelizer(Cursor cursor, int i) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int type = cursor.getType(i);
        if (type == 0) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
        getlookaheaddelegate3.serializer.RemoteActionCompatParcelizer("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final getPlaceablesCount RemoteActionCompatParcelizer(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
        MediaSessionCompatToken();
        ComponentActivity();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r4 = 0;
        try {
            try {
                cursorQuery = ResultReceiver().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        getPlaceablesCount getplaceablescount = new getPlaceablesCount(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return getplaceablescount;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.IconCompatParcelizer("Error querying events. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                r4 = arrayList;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void RemoteActionCompatParcelizer(Long l) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        if (MediaSessionCompatResultReceiverWrapper()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (write(sb.toString(), (String[]) null) > 0) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
                lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseResultReceiver.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "Error incrementing retry count. error");
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer(getThrottleMillis getthrottlemillis) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        String str = getthrottlemillis.RemoteActionCompatParcelizer;
        MediaSessionCompatToken();
        ComponentActivity();
        String str2 = getthrottlemillis.read;
        String str3 = getthrottlemillis.write;
        if (serializer(str2, str3) == null) {
            if (onLayoutRectChangeddefault.serializer(str3)) {
                if (write("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.serializer(str2, premeasure0kLqBqw.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jWrite = write("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                lookaheadScopeKtLookaheadScope221.getClass();
                if (jWrite >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(getthrottlemillis.serializer));
        read(contentValues, getthrottlemillis.IconCompatParcelizer);
        try {
            if (ResultReceiver().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Error storing user property. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), e);
            return true;
        }
    }

    public final void read(localLookaheadPositionOfauaQtcdefault locallookaheadpositionofauaqtcdefault, boolean z) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = locallookaheadpositionofauaqtcdefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        String strMediaBrowserCompatMediaItem = locallookaheadpositionofauaqtcdefault.MediaBrowserCompatMediaItem();
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) strMediaBrowserCompatMediaItem);
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, strMediaBrowserCompatMediaItem);
        zzpg zzpgVar = this.MediaSessionCompatToken;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (zzpgVar.serializer(strMediaBrowserCompatMediaItem).IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", locallookaheadpositionofauaqtcdefault.MediaMetadataCompat());
        }
        contentValues.put("gmp_app_id", locallookaheadpositionofauaqtcdefault.PlaybackStateCompat());
        if (zzpgVar.serializer(strMediaBrowserCompatMediaItem).IconCompatParcelizer(MeasureScope.AD_STORAGE)) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
            lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
            contentValues.put("resettable_device_id_hash", locallookaheadpositionofauaqtcdefault.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
        lookaheadScopeKtLookaheadScope5.MediaSessionCompatToken();
        contentValues.put("last_bundle_index", Long.valueOf(locallookaheadpositionofauaqtcdefault.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
        lookaheadScopeKtLookaheadScope6.MediaSessionCompatToken();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(locallookaheadpositionofauaqtcdefault.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope7 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope7);
        lookaheadScopeKtLookaheadScope7.MediaSessionCompatToken();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(locallookaheadpositionofauaqtcdefault.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs));
        contentValues.put("app_version", locallookaheadpositionofauaqtcdefault.PlaybackStateCompatCustomAction());
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope8 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope8);
        lookaheadScopeKtLookaheadScope8.MediaSessionCompatToken();
        contentValues.put("app_store", locallookaheadpositionofauaqtcdefault._init_lambda4);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope9 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope9);
        lookaheadScopeKtLookaheadScope9.MediaSessionCompatToken();
        contentValues.put("gmp_version", Long.valueOf(locallookaheadpositionofauaqtcdefault._init_lambda2));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope10 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope10);
        lookaheadScopeKtLookaheadScope10.MediaSessionCompatToken();
        contentValues.put("dev_cert_hash", Long.valueOf(locallookaheadpositionofauaqtcdefault._init_lambda3));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope11 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope11);
        lookaheadScopeKtLookaheadScope11.MediaSessionCompatToken();
        contentValues.put("measurement_enabled", Boolean.valueOf(locallookaheadpositionofauaqtcdefault.accessensureViewModelStore));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope12 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope13 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope12);
        lookaheadScopeKtLookaheadScope12.MediaSessionCompatToken();
        contentValues.put("day", Long.valueOf(locallookaheadpositionofauaqtcdefault.MediaBrowserCompatMediaItem));
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("daily_public_events_count", Long.valueOf(locallookaheadpositionofauaqtcdefault.MediaSessionCompatResultReceiverWrapper));
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("daily_events_count", Long.valueOf(locallookaheadpositionofauaqtcdefault.PlaybackStateCompat));
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("daily_conversions_count", Long.valueOf(locallookaheadpositionofauaqtcdefault.MediaSessionCompatToken));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope14 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope14);
        lookaheadScopeKtLookaheadScope14.MediaSessionCompatToken();
        contentValues.put("config_fetched_time", Long.valueOf(locallookaheadpositionofauaqtcdefault.ResultReceiver));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope15 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope15);
        lookaheadScopeKtLookaheadScope15.MediaSessionCompatToken();
        contentValues.put("failed_config_fetch_time", Long.valueOf(locallookaheadpositionofauaqtcdefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus));
        contentValues.put("app_version_int", Long.valueOf(locallookaheadpositionofauaqtcdefault.MediaSessionCompatToken()));
        contentValues.put("firebase_instance_id", locallookaheadpositionofauaqtcdefault.ParcelableVolumeInfo());
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("daily_error_events_count", Long.valueOf(locallookaheadpositionofauaqtcdefault.ParcelableVolumeInfo));
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("daily_realtime_events_count", Long.valueOf(locallookaheadpositionofauaqtcdefault.PlaybackStateCompatCustomAction));
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("health_monitor_sample", locallookaheadpositionofauaqtcdefault.ComponentActivity);
        contentValues.put("android_id", (Long) 0L);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope16 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope16);
        lookaheadScopeKtLookaheadScope16.MediaSessionCompatToken();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(locallookaheadpositionofauaqtcdefault._init_lambda1));
        contentValues.put("dynamite_version", Long.valueOf(locallookaheadpositionofauaqtcdefault.read()));
        if (zzpgVar.serializer(strMediaBrowserCompatMediaItem).IconCompatParcelizer(MeasureScope.ANALYTICS_STORAGE)) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope17 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope17);
            lookaheadScopeKtLookaheadScope17.MediaSessionCompatToken();
            contentValues.put("session_stitching_token", locallookaheadpositionofauaqtcdefault.addObserverForBackInvokerlambda0);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(locallookaheadpositionofauaqtcdefault.MediaSessionCompatQueueItem()));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope18 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope18);
        lookaheadScopeKtLookaheadScope18.MediaSessionCompatToken();
        contentValues.put("target_os_version", Long.valueOf(locallookaheadpositionofauaqtcdefault.fullyDrawnReporter_delegatelambda00));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope19 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope19);
        lookaheadScopeKtLookaheadScope19.MediaSessionCompatToken();
        contentValues.put("session_stitching_token_hash", Long.valueOf(locallookaheadpositionofauaqtcdefault.menuHostHelperlambda0));
        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
        setComposedWithReusableContentHost setcomposedwithreusablecontenthost = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        if (setcomposedwithreusablecontenthost.write(strMediaBrowserCompatMediaItem, premeasure0kLqBqw.getSavedStateRegistryControllerannotations)) {
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope20 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope20);
            lookaheadScopeKtLookaheadScope20.MediaSessionCompatToken();
            contentValues.put("ad_services_version", Integer.valueOf(locallookaheadpositionofauaqtcdefault.getSavedStateRegistryControllerannotations));
            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope21 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope21);
            lookaheadScopeKtLookaheadScope21.MediaSessionCompatToken();
            contentValues.put("attribution_eligibility_status", Long.valueOf(locallookaheadpositionofauaqtcdefault.IconCompatParcelizer));
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope22 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope22);
        lookaheadScopeKtLookaheadScope22.MediaSessionCompatToken();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(locallookaheadpositionofauaqtcdefault.fullyDrawnReporter_delegatelambda0));
        contentValues.put("npa_metadata_value", locallookaheadpositionofauaqtcdefault.RatingCompat());
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope23 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope23);
        lookaheadScopeKtLookaheadScope23.MediaSessionCompatToken();
        contentValues.put("bundle_delivery_index", Long.valueOf(locallookaheadpositionofauaqtcdefault.RatingCompat));
        contentValues.put("sgtm_preview_key", locallookaheadpositionofauaqtcdefault.MediaDescriptionCompat());
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("dma_consent_state", Integer.valueOf(locallookaheadpositionofauaqtcdefault.serializer));
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
        lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(locallookaheadpositionofauaqtcdefault.RemoteActionCompatParcelizer));
        contentValues.put("serialized_npa_metadata", locallookaheadpositionofauaqtcdefault.serializer());
        contentValues.put("client_upload_eligibility", Integer.valueOf(locallookaheadpositionofauaqtcdefault.write()));
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope24 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope24);
        lookaheadScopeKtLookaheadScope24.MediaSessionCompatToken();
        ArrayList arrayList = locallookaheadpositionofauaqtcdefault.createFullyDrawnExecutor;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(strMediaBrowserCompatMediaItem, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.addObserverForBackInvokerlambda0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope25 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope25);
        lookaheadScopeKtLookaheadScope25.MediaSessionCompatToken();
        contentValues.put("unmatched_pfo", locallookaheadpositionofauaqtcdefault.getOnBackPressedInput);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope26 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope26);
        lookaheadScopeKtLookaheadScope26.MediaSessionCompatToken();
        contentValues.put("unmatched_uwa", locallookaheadpositionofauaqtcdefault.read);
        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope27 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope27);
        lookaheadScopeKtLookaheadScope27.MediaSessionCompatToken();
        contentValues.put("ad_campaign_info", locallookaheadpositionofauaqtcdefault.MediaDescriptionCompat);
        try {
            SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
            if (sQLiteDatabaseResultReceiver.update("apps", contentValues, "app_id = ?", new String[]{strMediaBrowserCompatMediaItem}) == 0 && sQLiteDatabaseResultReceiver.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(strMediaBrowserCompatMediaItem), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer("Error storing app. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(strMediaBrowserCompatMediaItem), e);
        }
    }

    public final boolean read(String str) {
        OnFirstVisibleModifierKt[] onFirstVisibleModifierKtArr = {OnFirstVisibleModifierKt.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(onFirstVisibleModifierKtArr[0].zza()));
        String strSerializer = serializer((List) arrayList);
        String strMediaMetadataCompat = MediaMetadataCompat();
        return write(ff$$ExternalSyntheticOutline0.m(new StringBuilder((strSerializer.length() + 61) + strMediaMetadataCompat.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strSerializer, " AND NOT ", strMediaMetadataCompat), new String[]{str}) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x016d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v3 */
    public final List serializer(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        ?? arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
            int i = 0;
            String[] strArr2 = {HiAnalyticsConstant.BI_KEY_APP_ID, "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            lookaheadScopeKtLookaheadScope221.getClass();
            int i2 = 3;
            cursorQuery = sQLiteDatabaseResultReceiver.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer(1000, "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(i);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cursorQuery, i2);
                        ?? r22 = cursorQuery.getInt(4) != 0 ? 1 : i;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        zzgz zzgzVar = this.MediaSessionCompatToken.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        zzpg.serializer(zzgzVar);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbg> creator = zzbg.CREATOR;
                        zzbg zzbgVar = (zzbg) zzgzVar.write(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        zzpg.serializer(zzgzVar);
                        zzbg zzbgVar2 = (zzbg) zzgzVar.write(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        zzpg.serializer(zzgzVar);
                        arrayList.add(new zzah(string, string2, new zzpl(j3, objRemoteActionCompatParcelizer, string3, string2), j2, r22, string4, zzbgVar, j, zzbgVar2, j4, (zzbg) zzgzVar.write(cursorQuery.getBlob(12), creator)));
                        if (!cursorQuery.moveToNext()) {
                            break;
                        }
                        i2 = 3;
                        i = 0;
                    }
                }
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer(e, "Error querying conditional user property value");
                    arrayList = Collections.EMPTY_LIST;
                    cursorQuery = cursor;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    public final getMeasuredWidth serializer(String str) throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        getMeasuredWidth getmeasuredwidth;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        MediaSessionCompatToken();
        ComponentActivity();
        Cursor cursor = null;
        getmeasuredwidth = null;
        getmeasuredwidth = null;
        getMeasuredWidth getmeasuredwidth2 = null;
        try {
            cursorRawQuery = ResultReceiver().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
            try {
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        getMeasuredWidth getmeasuredwidthIconCompatParcelizer = getMeasuredWidth.IconCompatParcelizer(cursorRawQuery.getInt(1), cursorRawQuery.getString(0));
                        getmeasuredwidth2 = getmeasuredwidthIconCompatParcelizer;
                        lookaheadScopeKtLookaheadScope221 = getmeasuredwidthIconCompatParcelizer;
                    } else {
                        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("No data found");
                        lookaheadScopeKtLookaheadScope221 = lookaheadScopeKtLookaheadScope221;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer(e, "Error querying database.");
                    getmeasuredwidth = getmeasuredwidth2;
                    if (cursorRawQuery != null) {
                    }
                    if (getmeasuredwidth == null) {
                        return getMeasuredWidth.RemoteActionCompatParcelizer;
                    }
                    return getmeasuredwidth;
                }
            } catch (Throwable th) {
                cursor = cursorRawQuery;
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        cursorRawQuery.close();
        getmeasuredwidth = getmeasuredwidth2;
        if (getmeasuredwidth == null) {
            return getMeasuredWidth.RemoteActionCompatParcelizer;
        }
        return getmeasuredwidth;
    }

    public final boolean serializer(zzah zzahVar) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        String str = zzahVar.RemoteActionCompatParcelizer;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        if (serializer(str, zzahVar.serializer.write) == null) {
            long jWrite = write("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            lookaheadScopeKtLookaheadScope221.getClass();
            if (jWrite >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("origin", zzahVar.read);
        contentValues.put("name", zzahVar.serializer.write);
        Object objIconCompatParcelizer = zzahVar.serializer.IconCompatParcelizer();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(objIconCompatParcelizer);
        read(contentValues, objIconCompatParcelizer);
        contentValues.put("active", Boolean.valueOf(zzahVar.IconCompatParcelizer));
        contentValues.put("trigger_event_name", zzahVar.MediaDescriptionCompat);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.MediaBrowserCompatMediaItem));
        zzbg zzbgVar = zzahVar.MediaSessionCompatQueueItem;
        onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        contentValues.put("timed_out_event", onLayoutRectChangeddefault.IconCompatParcelizer((Parcelable) zzbgVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.write));
        LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
        contentValues.put("triggered_event", onLayoutRectChangeddefault.IconCompatParcelizer((Parcelable) zzahVar.MediaMetadataCompat));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.serializer.IconCompatParcelizer));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.RatingCompat));
        contentValues.put("expired_event", onLayoutRectChangeddefault.IconCompatParcelizer((Parcelable) zzahVar.MediaSessionCompatResultReceiverWrapper));
        try {
            if (ResultReceiver().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer("Error storing conditional user property", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
            return true;
        }
    }

    public final void write(ContentValues contentValues) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        try {
            SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
            String asString = contentValues.getAsString(HiAnalyticsConstant.BI_KEY_APP_ID);
            if (asString == null) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaDescriptionCompat.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(HiAnalyticsConstant.BI_KEY_APP_ID), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseResultReceiver.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseResultReceiver.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer("Failed to insert/update table (got -1). key", getLookaheadDelegate.RemoteActionCompatParcelizer("consent_settings"), getLookaheadDelegate.RemoteActionCompatParcelizer(HiAnalyticsConstant.BI_KEY_APP_ID));
            }
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.serializer.IconCompatParcelizer("Error storing into table. key", getLookaheadDelegate.RemoteActionCompatParcelizer("consent_settings"), getLookaheadDelegate.RemoteActionCompatParcelizer(HiAnalyticsConstant.BI_KEY_APP_ID), e);
        }
    }

    public final void write(Long l) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            if (ResultReceiver().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final void write(String str, getPlaceablesCount getplaceablescount) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getplaceablescount);
        MediaSessionCompatToken();
        ComponentActivity();
        ContentValues contentValues = new ContentValues();
        String str2 = getplaceablescount.RemoteActionCompatParcelizer;
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str2);
        contentValues.put("name", getplaceablescount.write);
        contentValues.put("lifetime_count", Long.valueOf(getplaceablescount.serializer));
        contentValues.put("current_bundle_count", Long.valueOf(getplaceablescount.read));
        contentValues.put("last_fire_timestamp", Long.valueOf(getplaceablescount.MediaMetadataCompat));
        contentValues.put("last_bundled_timestamp", Long.valueOf(getplaceablescount.MediaDescriptionCompat));
        contentValues.put("last_bundled_day", getplaceablescount.RatingCompat);
        contentValues.put("last_sampled_complex_event_id", getplaceablescount.MediaBrowserCompatMediaItem);
        contentValues.put("last_sampling_rate", getplaceablescount.MediaSessionCompatQueueItem);
        contentValues.put("current_session_count", Long.valueOf(getplaceablescount.IconCompatParcelizer));
        Boolean bool = getplaceablescount.MediaSessionCompatResultReceiverWrapper;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (ResultReceiver().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Error storing event aggregates. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), e);
        }
    }

    public final void write(ArrayList arrayList) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(arrayList);
        if (arrayList.size() == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Given Integer is zero");
            return;
        }
        if (MediaSessionCompatResultReceiverWrapper()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM = d$$ExternalSyntheticOutline0.m(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (write(d$$ExternalSyntheticOutline0.m(new StringBuilder(strM.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM, " AND retry_count =  2147483647 LIMIT 1"), (String[]) null) > 0) {
                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
                StringBuilder sb = new StringBuilder(strM.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseResultReceiver.execSQL(sb.toString());
            } catch (SQLiteException e) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0107  */
    public final List IconCompatParcelizer(String str, zzoo zzooVar, int i) {
        Cursor cursor;
        List list;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
            String[] strArr = {"rowId", HiAnalyticsConstant.BI_KEY_APP_ID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strSerializer = serializer(zzooVar.write);
            String strMediaMetadataCompat = MediaMetadataCompat();
            StringBuilder sb = new StringBuilder(strSerializer.length() + 17 + strMediaMetadataCompat.length());
            sb.append("app_id=?");
            sb.append(strSerializer);
            sb.append(" AND NOT ");
            sb.append(strMediaMetadataCompat);
            Cursor cursorQuery = sQLiteDatabaseResultReceiver.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            try {
                ArrayList arrayList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    OnLayoutRectChangedModifierKt onLayoutRectChangedModifierKtRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    if (onLayoutRectChangedModifierKtRemoteActionCompatParcelizer != null) {
                        arrayList.add(onLayoutRectChangedModifierKtRemoteActionCompatParcelizer);
                    }
                }
                cursor = cursorQuery;
                list = arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.serializer("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                    list = Collections.EMPTY_LIST;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final List IconCompatParcelizer(String str, String str2, String str3) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return serializer(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final void IconCompatParcelizer(String str, String str2) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            ResultReceiver().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.IconCompatParcelizer("Error deleting user property. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(str2), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    public final accessgetTvTeletextcp MediaBrowserCompatMediaItem(String str) throws Throwable {
        SQLiteException e;
        Cursor cursorQuery;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        Cursor cursor = null;
        try {
            cursorQuery = ResultReceiver().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp((Object) blob, string, (Comparable) string2, 17);
                            cursorQuery.close();
                            return accessgettvteletextcp;
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer("Error querying remote config. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void MediaBrowserCompatMediaItem(String str, String str2) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            ResultReceiver().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.IconCompatParcelizer("Error deleting conditional property", getLookaheadDelegate.RemoteActionCompatParcelizer(str), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(str2), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public final List MediaSessionCompatQueueItem(String str) throws Throwable {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursorQuery;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        ?? arrayList = new ArrayList();
        try {
            lookaheadScopeKtLookaheadScope221.getClass();
            cursorQuery = ResultReceiver().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str2 = string2;
                            long j = cursorQuery.getLong(2);
                            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cursorQuery, 3);
                            if (objRemoteActionCompatParcelizer == null) {
                                try {
                                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                    getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Read invalid user property value, ignoring it. appId");
                                } catch (SQLiteException e) {
                                    e = e;
                                    cursor = cursorQuery;
                                    try {
                                        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                        getlookaheaddelegate2.serializer.serializer("Error querying user properties. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                }
                            } else {
                                arrayList.add(new getThrottleMillis(str, str2, string, j, objRemoteActionCompatParcelizer));
                            }
                        } while (cursorQuery.moveToNext());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = cursorQuery;
                cursorQuery = cursor2;
                cursor = cursorQuery;
                getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.serializer.serializer("Error querying user properties. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                arrayList = Collections.EMPTY_LIST;
                cursorQuery = cursor;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor2 = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    public final void MediaSessionCompatQueueItem() {
        MediaSessionCompatToken();
        ComponentActivity();
        if (MediaSessionCompatResultReceiverWrapper()) {
            zzpg zzpgVar = this.MediaSessionCompatToken;
            long jRemoteActionCompatParcelizer = zzpgVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer.RemoteActionCompatParcelizer();
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jRemoteActionCompatParcelizer) > ((Long) premeasure0kLqBqw.ParcelableVolumeInfo.IconCompatParcelizer(null)).longValue()) {
                zzpgVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer.serializer(jElapsedRealtime);
                MediaSessionCompatToken();
                ComponentActivity();
                if (MediaSessionCompatResultReceiverWrapper()) {
                    SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
                    lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                    int iDelete = sQLiteDatabaseResultReceiver.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) premeasure0kLqBqw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(null)).longValue())});
                    if (iDelete > 0) {
                        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate.PlaybackStateCompat.serializer(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final long RemoteActionCompatParcelizer(String str) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        return write("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x016f  */
    public final setPausedComposition RemoteActionCompatParcelizer(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        String[] strArr = {str};
        setPausedComposition setpausedcomposition = new setPausedComposition();
        try {
            SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
            cursorQuery = sQLiteDatabaseResultReceiver.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        setpausedcomposition.write = cursorQuery.getLong(1);
                        setpausedcomposition.IconCompatParcelizer = cursorQuery.getLong(2);
                        setpausedcomposition.read = cursorQuery.getLong(3);
                        setpausedcomposition.RemoteActionCompatParcelizer = cursorQuery.getLong(4);
                        setpausedcomposition.serializer = cursorQuery.getLong(5);
                        setpausedcomposition.MediaDescriptionCompat = cursorQuery.getLong(6);
                        setpausedcomposition.MediaBrowserCompatMediaItem = cursorQuery.getLong(7);
                    }
                    if (z) {
                        setpausedcomposition.write += j2;
                    }
                    if (z2) {
                        setpausedcomposition.IconCompatParcelizer += j2;
                    }
                    if (z3) {
                        setpausedcomposition.read += j2;
                    }
                    if (z4) {
                        setpausedcomposition.RemoteActionCompatParcelizer += j2;
                    }
                    if (z5) {
                        setpausedcomposition.serializer += j2;
                    }
                    if (z6) {
                        setpausedcomposition.MediaDescriptionCompat += j2;
                    }
                    if (z7) {
                        setpausedcomposition.MediaBrowserCompatMediaItem += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(setpausedcomposition.IconCompatParcelizer));
                    contentValues.put("daily_events_count", Long.valueOf(setpausedcomposition.write));
                    contentValues.put("daily_conversions_count", Long.valueOf(setpausedcomposition.read));
                    contentValues.put("daily_error_events_count", Long.valueOf(setpausedcomposition.RemoteActionCompatParcelizer));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(setpausedcomposition.serializer));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(setpausedcomposition.MediaDescriptionCompat));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(setpausedcomposition.MediaBrowserCompatMediaItem));
                    sQLiteDatabaseResultReceiver.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer("Error updating daily counts. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                    cursorQuery = cursor;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return setpausedcomposition;
    }

    public final void RemoteActionCompatParcelizer(String str, getMeasuredWidth getmeasuredwidth) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        MediaSessionCompatToken();
        ComponentActivity();
        read(str, serializer(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("storage_consent_at_bundling", getmeasuredwidth.RemoteActionCompatParcelizer());
        write(contentValues);
    }

    public final SQLiteDatabase ResultReceiver() {
        MediaSessionCompatToken();
        try {
            return this.MediaSessionCompatResultReceiverWrapper.getWritableDatabase();
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer(e, "Error opening database");
            throw e;
        }
    }

    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        ComponentActivity();
        ResultReceiver().endTransaction();
    }

    public final void r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        ComponentActivity();
        ResultReceiver().beginTransaction();
    }

    public final void r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        ComponentActivity();
        ResultReceiver().setTransactionSuccessful();
    }

    public final void read(String str, getMeasuredWidth getmeasuredwidth) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getmeasuredwidth);
        MediaSessionCompatToken();
        ComponentActivity();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("consent_state", getmeasuredwidth.RemoteActionCompatParcelizer());
        contentValues.put("consent_source", Integer.valueOf(getmeasuredwidth.read));
        write(contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0097: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:26:0x0097 */
    public final getThrottleMillis serializer(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        MediaSessionCompatToken();
        ComponentActivity();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = ResultReceiver().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cursorQuery, 1);
                        if (objRemoteActionCompatParcelizer != null) {
                            getThrottleMillis getthrottlemillis = new getThrottleMillis(str, cursorQuery.getString(2), str2, j, objRemoteActionCompatParcelizer);
                            if (cursorQuery.moveToNext()) {
                                getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Got multiple records for user property, expected one. appId");
                            }
                            cursorQuery.close();
                            return getthrottlemillis;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.IconCompatParcelizer("Error querying user property. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer(str2), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public final void serializer(long j) {
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            if (ResultReceiver().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void serializer(String str, zzoh zzohVar) {
        MediaSessionCompatToken();
        ComponentActivity();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        accessgettvinputcomposite1cp.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.onBackPressed;
        long jLongValue = ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue();
        long j = zzohVar.write;
        if (j < jCurrentTimeMillis - jLongValue || j > ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue() + jCurrentTimeMillis) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.IconCompatParcelizer("Storing trigger URI outside of the max retention time span. appId, now, timestamp", getLookaheadDelegate.RemoteActionCompatParcelizer(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.RemoteActionCompatParcelizer("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("trigger_uri", zzohVar.serializer);
        contentValues.put("source", Integer.valueOf(zzohVar.RemoteActionCompatParcelizer));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (ResultReceiver().insert("trigger_uris", null, contentValues) == -1) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer("Error storing trigger URI. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
        }
    }

    public final void serializer(String str, Long l, long j, getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq) {
        MediaSessionCompatToken();
        ComponentActivity();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(gettvterrestrialdigitalek5ggoq);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        byte[] bArrRemoveOnUserLeaveHintListener = gettvterrestrialdigitalek5ggoq.removeOnUserLeaveHintListener();
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        getlookaheaddelegate.PlaybackStateCompat.serializer("Saving complex main event, appId, data size", lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(str), Integer.valueOf(bArrRemoveOnUserLeaveHintListener.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrRemoveOnUserLeaveHintListener);
        try {
            if (ResultReceiver().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Error storing complex main event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
        }
    }

    public final getMeasuredWidth write(String str) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) str);
        MediaSessionCompatToken();
        ComponentActivity();
        return getMeasuredWidth.IconCompatParcelizer(100, IconCompatParcelizer("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final void write(String str, String str2) {
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str2);
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            ResultReceiver().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer("Error deleting snapshot. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str2), e);
        }
    }

    public final void write(getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq, boolean z) {
        MediaSessionCompatToken();
        ComponentActivity();
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(gettvzoommodeek5ggoq.serializer());
        accessgetSystemNavigationDowncp.IconCompatParcelizer(gettvzoommodeek5ggoq.onRetainNonConfigurationInstance());
        MediaSessionCompatQueueItem();
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        accessgettvinputcomposite1cp.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jOnTrimMemory = gettvzoommodeek5ggoq.onTrimMemory();
        LayoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1 = premeasure0kLqBqw.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (jOnTrimMemory < jCurrentTimeMillis - ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue() || gettvzoommodeek5ggoq.onTrimMemory() > ((Long) layoutNodeSubcompositionsStatecreatePrecomposedSlotHandle1.IconCompatParcelizer(null)).longValue() + jCurrentTimeMillis) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.IconCompatParcelizer("Storing bundle outside of the max uploading time span. appId, now, timestamp", getLookaheadDelegate.RemoteActionCompatParcelizer(gettvzoommodeek5ggoq.serializer()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(gettvzoommodeek5ggoq.onTrimMemory()));
        }
        byte[] bArrRemoveOnUserLeaveHintListener = gettvzoommodeek5ggoq.removeOnUserLeaveHintListener();
        try {
            zzgz zzgzVar = this.MediaSessionCompatToken.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            zzpg.serializer(zzgzVar);
            byte[] bArrWrite = zzgzVar.write(bArrRemoveOnUserLeaveHintListener);
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.PlaybackStateCompat.serializer(Integer.valueOf(bArrWrite.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, gettvzoommodeek5ggoq.serializer());
            contentValues.put("bundle_end_timestamp", Long.valueOf(gettvzoommodeek5ggoq.onTrimMemory()));
            contentValues.put(RemoteMessageConst.DATA, bArrWrite);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (gettvzoommodeek5ggoq.addObserverForBackInvoker()) {
                contentValues.put("retry_count", Integer.valueOf(gettvzoommodeek5ggoq.createFullyDrawnExecutor()));
            }
            try {
                if (ResultReceiver().insert("queue", null, contentValues) == -1) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(gettvzoommodeek5ggoq.serializer()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer("Error storing bundle. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(gettvzoommodeek5ggoq.serializer()), e);
            }
        } catch (IOException e2) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.serializer("Data loss. Failed to serialize bundle. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(gettvzoommodeek5ggoq.serializer()), e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:134:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x04a4: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:126:0x04a3 */
    public final localLookaheadPositionOfauaQtcdefault MediaMetadataCompat(String str) throws Throwable {
        Throwable th;
        Cursor cursor;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Cursor cursor2;
        Boolean boolValueOf;
        String string;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        try {
            try {
                boolean z = true;
                cursorQuery = ResultReceiver().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        zzpg zzpgVar = this.MediaSessionCompatToken;
                        localLookaheadPositionOfauaQtcdefault locallookaheadpositionofauaqtcdefault = new localLookaheadPositionOfauaQtcdefault(zzpgVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, str);
                        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = locallookaheadpositionofauaqtcdefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        getMeasuredWidth getmeasuredwidthSerializer = zzpgVar.serializer(str);
                        MeasureScope measureScope = MeasureScope.ANALYTICS_STORAGE;
                        if (getmeasuredwidthSerializer.IconCompatParcelizer(measureScope)) {
                            locallookaheadpositionofauaqtcdefault.write(cursorQuery.getString(0));
                        }
                        locallookaheadpositionofauaqtcdefault.read(cursorQuery.getString(1));
                        if (zzpgVar.serializer(str).IconCompatParcelizer(MeasureScope.AD_STORAGE)) {
                            locallookaheadpositionofauaqtcdefault.serializer(cursorQuery.getString(2));
                        }
                        locallookaheadpositionofauaqtcdefault.serializer(cursorQuery.getLong(3));
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(cursorQuery.getLong(4));
                        locallookaheadpositionofauaqtcdefault.ComponentActivity(cursorQuery.getLong(5));
                        locallookaheadpositionofauaqtcdefault.RatingCompat(cursorQuery.getString(6));
                        locallookaheadpositionofauaqtcdefault.MediaBrowserCompatMediaItem(cursorQuery.getString(7));
                        locallookaheadpositionofauaqtcdefault.ResultReceiver(cursorQuery.getLong(8));
                        locallookaheadpositionofauaqtcdefault.RemoteActionCompatParcelizer(cursorQuery.getLong(9));
                        locallookaheadpositionofauaqtcdefault.RemoteActionCompatParcelizer(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        locallookaheadpositionofauaqtcdefault.MediaSessionCompatQueueItem(cursorQuery.getLong(11));
                        locallookaheadpositionofauaqtcdefault.MediaBrowserCompatMediaItem(cursorQuery.getLong(12));
                        locallookaheadpositionofauaqtcdefault.MediaMetadataCompat(cursorQuery.getLong(13));
                        locallookaheadpositionofauaqtcdefault.MediaDescriptionCompat(cursorQuery.getLong(14));
                        locallookaheadpositionofauaqtcdefault.IconCompatParcelizer(cursorQuery.getLong(15));
                        locallookaheadpositionofauaqtcdefault.read(cursorQuery.getLong(16));
                        locallookaheadpositionofauaqtcdefault.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        locallookaheadpositionofauaqtcdefault.RemoteActionCompatParcelizer(cursorQuery.getString(18));
                        locallookaheadpositionofauaqtcdefault.MediaSessionCompatToken(cursorQuery.getLong(19));
                        locallookaheadpositionofauaqtcdefault.PlaybackStateCompat(cursorQuery.getLong(20));
                        locallookaheadpositionofauaqtcdefault.IconCompatParcelizer(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope4 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope4);
                        lookaheadScopeKtLookaheadScope4.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= locallookaheadpositionofauaqtcdefault._init_lambda1 != z2;
                        locallookaheadpositionofauaqtcdefault._init_lambda1 = z2;
                        locallookaheadpositionofauaqtcdefault.write(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            locallookaheadpositionofauaqtcdefault.RemoteActionCompatParcelizer(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (zzpgVar.serializer(str).IconCompatParcelizer(measureScope)) {
                            String string2 = cursorQuery.getString(28);
                            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope5 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope5);
                            lookaheadScopeKtLookaheadScope5.MediaSessionCompatToken();
                            locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= !Objects.equals(locallookaheadpositionofauaqtcdefault.addObserverForBackInvokerlambda0, string2);
                            locallookaheadpositionofauaqtcdefault.addObserverForBackInvokerlambda0 = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope6 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope6);
                        lookaheadScopeKtLookaheadScope6.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= locallookaheadpositionofauaqtcdefault.addObserverForBackInvoker != z3;
                        locallookaheadpositionofauaqtcdefault.addObserverForBackInvoker = z3;
                        locallookaheadpositionofauaqtcdefault.ParcelableVolumeInfo(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope7 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope7);
                        lookaheadScopeKtLookaheadScope7.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= locallookaheadpositionofauaqtcdefault.write != string3;
                        locallookaheadpositionofauaqtcdefault.write = string3;
                        locallookaheadpositionofauaqtcdefault.PlaybackStateCompatCustomAction(cursorQuery.getLong(30));
                        locallookaheadpositionofauaqtcdefault.MediaSessionCompatResultReceiverWrapper(cursorQuery.getLong(31));
                        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
                        if (lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(str, premeasure0kLqBqw.getSavedStateRegistryControllerannotations)) {
                            int i = cursorQuery.getInt(32);
                            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope8 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope8);
                            lookaheadScopeKtLookaheadScope8.MediaSessionCompatToken();
                            locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= locallookaheadpositionofauaqtcdefault.getSavedStateRegistryControllerannotations != i;
                            locallookaheadpositionofauaqtcdefault.getSavedStateRegistryControllerannotations = i;
                            locallookaheadpositionofauaqtcdefault.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope9 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope9);
                        lookaheadScopeKtLookaheadScope9.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= locallookaheadpositionofauaqtcdefault.fullyDrawnReporter_delegatelambda0 != z4;
                        locallookaheadpositionofauaqtcdefault.fullyDrawnReporter_delegatelambda0 = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope10 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope10);
                        lookaheadScopeKtLookaheadScope10.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= !Objects.equals(locallookaheadpositionofauaqtcdefault.ensureViewModelStore, boolValueOf);
                        locallookaheadpositionofauaqtcdefault.ensureViewModelStore = boolValueOf;
                        locallookaheadpositionofauaqtcdefault.RemoteActionCompatParcelizer(cursorQuery.getInt(37));
                        locallookaheadpositionofauaqtcdefault.IconCompatParcelizer(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) string);
                        }
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope11 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope11);
                        lookaheadScopeKtLookaheadScope11.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= locallookaheadpositionofauaqtcdefault.MediaSessionCompatQueueItem != string;
                        locallookaheadpositionofauaqtcdefault.MediaSessionCompatQueueItem = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope12 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope12);
                            lookaheadScopeKtLookaheadScope12.MediaSessionCompatToken();
                            locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= !Objects.equals(locallookaheadpositionofauaqtcdefault.getOnBackPressedInput, lValueOf);
                            locallookaheadpositionofauaqtcdefault.getOnBackPressedInput = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope13 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope13);
                            lookaheadScopeKtLookaheadScope13.MediaSessionCompatToken();
                            locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= !Objects.equals(locallookaheadpositionofauaqtcdefault.read, lValueOf2);
                            locallookaheadpositionofauaqtcdefault.read = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope14 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope14);
                        lookaheadScopeKtLookaheadScope14.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys |= locallookaheadpositionofauaqtcdefault.MediaDescriptionCompat != blob;
                        locallookaheadpositionofauaqtcdefault.MediaDescriptionCompat = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope15 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                            LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope15);
                            lookaheadScopeKtLookaheadScope15.MediaSessionCompatToken();
                            boolean z5 = locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            if (locallookaheadpositionofauaqtcdefault.MediaMetadataCompat == i2) {
                                z = false;
                            }
                            locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = z5 | z;
                            locallookaheadpositionofauaqtcdefault.MediaMetadataCompat = i2;
                        }
                        LookaheadScopeKtLookaheadScope4 lookaheadScopeKtLookaheadScope16 = lookaheadScopeKtLookaheadScope222.MediaSessionCompatResultReceiverWrapper;
                        LookaheadScopeKtLookaheadScope221.write(lookaheadScopeKtLookaheadScope16);
                        lookaheadScopeKtLookaheadScope16.MediaSessionCompatToken();
                        locallookaheadpositionofauaqtcdefault.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = false;
                        if (cursorQuery.moveToNext()) {
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return locallookaheadpositionofauaqtcdefault;
                    }
                } catch (SQLiteException e) {
                    sQLiteException = e;
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.serializer.serializer("Error querying app. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), sQLiteException);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
                if (cursor != null) {
                    cursor.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            sQLiteException = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            if (cursor != null) {
                cursor.close();
                throw th;
            }
            throw th;
        }
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.close();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:164:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[LOOP:0: B:86:0x01de->B:171:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8 A[Catch: all -> 0x010b, SQLiteException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x010b, blocks: (B:41:0x00f8, B:52:0x012f, B:57:0x0151, B:68:0x0176, B:71:0x017e, B:62:0x0167, B:76:0x0197), top: B:154:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0115 A[Catch: all -> 0x0268, SQLiteException -> 0x026c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0268, blocks: (B:39:0x00f2, B:48:0x0115, B:49:0x0119, B:50:0x0129, B:53:0x013f, B:81:0x01b3, B:78:0x01aa), top: B:150:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012f A[Catch: all -> 0x010b, SQLiteException -> 0x010f, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x010b, blocks: (B:41:0x00f8, B:52:0x012f, B:57:0x0151, B:68:0x0176, B:71:0x017e, B:62:0x0167, B:76:0x0197), top: B:154:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167 A[Catch: all -> 0x010b, SQLiteException -> 0x018d, TryCatch #7 {all -> 0x010b, blocks: (B:41:0x00f8, B:52:0x012f, B:57:0x0151, B:68:0x0176, B:71:0x017e, B:62:0x0167, B:76:0x0197), top: B:154:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0197 A[Catch: all -> 0x010b, SQLiteException -> 0x018d, TRY_LEAVE, TryCatch #7 {all -> 0x010b, blocks: (B:41:0x00f8, B:52:0x012f, B:57:0x0151, B:68:0x0176, B:71:0x017e, B:62:0x0167, B:76:0x0197), top: B:154:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01de A[Catch: SQLiteException -> 0x024a, all -> 0x02a1, LOOP:0: B:86:0x01de->B:171:?, LOOP_START, TRY_LEAVE, TryCatch #0 {all -> 0x02a1, blocks: (B:84:0x01d8, B:86:0x01de, B:87:0x01e7, B:89:0x01f2, B:94:0x0230, B:93:0x021e, B:97:0x0238, B:135:0x028b), top: B:145:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0230 A[Catch: SQLiteException -> 0x024a, all -> 0x02a1, TryCatch #0 {all -> 0x02a1, blocks: (B:84:0x01d8, B:86:0x01de, B:87:0x01e7, B:89:0x01f2, B:94:0x0230, B:93:0x021e, B:97:0x0238, B:135:0x028b), top: B:145:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0238 A[Catch: SQLiteException -> 0x024a, all -> 0x02a1, TRY_LEAVE, TryCatch #0 {all -> 0x02a1, blocks: (B:84:0x01d8, B:86:0x01de, B:87:0x01e7, B:89:0x01f2, B:94:0x0230, B:93:0x021e, B:97:0x0238, B:135:0x028b), top: B:145:0x0010 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x02a2: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:140:0x02a2 */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v44, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v60, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final void serializer(String str, long j, long j2, OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls) throws Throwable {
        ?? IsEmpty;
        Object obj;
        ?? Query;
        ?? r5;
        String[] strArr;
        Cursor cursorRawQuery;
        String string;
        String str2;
        ?? r16;
        ?? r14;
        String str3;
        Cursor cursorQuery;
        boolean zWrite;
        String[] strArr2;
        ?? r4;
        ?? r9;
        String str4;
        long j3;
        getTvSatelliteBsEK5gGoQ gettvsatellitebsek5ggoq;
        ?? r7;
        ?? r6;
        String str5;
        long jWrite;
        long j4;
        String[] strArr3;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        Object obj2 = null;
        ?? r8 = 0;
        Cursor cursor = null;
        try {
            try {
                ?? ResultReceiver = ResultReceiver();
                IsEmpty = TextUtils.isEmpty(str);
                String str6 = "";
                try {
                    if (IsEmpty != 0) {
                        if (j2 != -1) {
                            strArr3 = new String[]{String.valueOf(j2), String.valueOf(j)};
                        } else {
                            strArr3 = new String[]{String.valueOf(j)};
                        }
                        if (j2 != -1) {
                            str6 = "rowid <= ? and ";
                        }
                        StringBuilder sb = new StringBuilder(str6.length() + 148);
                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb.append(str6);
                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        Query = ResultReceiver.rawQuery(sb.toString(), strArr3);
                        try {
                            if (Query.moveToFirst()) {
                                String string2 = Query.getString(0);
                                try {
                                    string = Query.getString(1);
                                    Query.close();
                                    r16 = Query;
                                    str2 = string2;
                                    IsEmpty = Query;
                                    String str7 = string;
                                    try {
                                        try {
                                            r14 = str7;
                                            str3 = str2;
                                            try {
                                                cursorQuery = ResultReceiver.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str7}, null, null, "rowid", "2");
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (!cursorQuery.moveToFirst()) {
                                                                    getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                                                                    getlookaheaddelegate.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str3), "Raw event metadata record is missing. appId");
                                                                } else {
                                                                    try {
                                                                        try {
                                                                            getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq = (getTvZoomModeEK5gGoQ) ((getTwoEK5gGoQ) zzgz.write(getTvZoomModeEK5gGoQ.IconCompatParcelizer(), cursorQuery.getBlob(0))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                                            if (cursorQuery.moveToNext()) {
                                                                                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                                                                getlookaheaddelegate2.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str3), "Get multiple raw event metadata records, expected one. appId");
                                                                            }
                                                                            cursorQuery.close();
                                                                            onGloballyPositionedModifierDefaultImpls.read = gettvzoommodeek5ggoq;
                                                                            zWrite = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.onUserLeaveHint);
                                                                            try {
                                                                                if (zWrite) {
                                                                                    str5 = str3;
                                                                                    jWrite = write("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str5, r14}, -1L);
                                                                                    if (j2 == -1) {
                                                                                        j4 = j2;
                                                                                    } else if (jWrite != -1) {
                                                                                        j4 = -1;
                                                                                    } else {
                                                                                        strArr2 = new String[]{str5, r14};
                                                                                        r4 = str5;
                                                                                        r9 = strArr2;
                                                                                        str4 = "app_id = ? and metadata_fingerprint = ?";
                                                                                        r8 = r4;
                                                                                    }
                                                                                    if (j4 == -1 && jWrite != -1) {
                                                                                        jWrite = Math.min(j4, jWrite);
                                                                                    } else if (j4 != -1) {
                                                                                        jWrite = j4;
                                                                                    }
                                                                                    ?? r10 = {str5, r14, String.valueOf(jWrite)};
                                                                                    r6 = str5;
                                                                                    r7 = r10;
                                                                                    str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                                                    r9 = r7;
                                                                                    r8 = r6;
                                                                                } else {
                                                                                    r8 = str3;
                                                                                    if (j2 != -1) {
                                                                                        ?? r11 = {r8, r14, String.valueOf(j2)};
                                                                                        r6 = r8;
                                                                                        r7 = r11;
                                                                                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                                                                        r9 = r7;
                                                                                        r8 = r6;
                                                                                    } else {
                                                                                        try {
                                                                                            strArr2 = new String[]{r8, r14};
                                                                                            r4 = r8;
                                                                                            r9 = strArr2;
                                                                                            str4 = "app_id = ? and metadata_fingerprint = ?";
                                                                                            r8 = r4;
                                                                                        } catch (SQLiteException e) {
                                                                                            e = e;
                                                                                            r14 = cursorQuery;
                                                                                            Query = r14;
                                                                                        }
                                                                                    }
                                                                                    e = e;
                                                                                    r14 = cursorQuery;
                                                                                    Query = r14;
                                                                                    getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                                                                    getlookaheaddelegate3.serializer.serializer("Data loss. Error selecting raw event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer((String) r8), e);
                                                                                    r5 = Query;
                                                                                }
                                                                                Query = ResultReceiver.query("raw_events", new String[]{"rowid", "name", "timestamp", RemoteMessageConst.DATA}, str4, r9, null, null, "rowid", null);
                                                                                try {
                                                                                    if (Query.moveToFirst()) {
                                                                                        while (true) {
                                                                                            j3 = Query.getLong(0);
                                                                                            try {
                                                                                                gettvsatellitebsek5ggoq = (getTvSatelliteBsEK5gGoQ) zzgz.write(getTvTerrestrialDigitalEK5gGoQ.read(), Query.getBlob(3));
                                                                                                String string3 = Query.getString(1);
                                                                                                gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
                                                                                                ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).IconCompatParcelizer(string3);
                                                                                                long j5 = Query.getLong(2);
                                                                                                gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
                                                                                                ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).IconCompatParcelizer(j5);
                                                                                                if (!onGloballyPositionedModifierDefaultImpls.serializer(j3, (getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys())) {
                                                                                                    r5 = Query;
                                                                                                    break;
                                                                                                } else if (!Query.moveToNext()) {
                                                                                                    r5 = Query;
                                                                                                    break;
                                                                                                }
                                                                                            } catch (IOException e2) {
                                                                                                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                                                                                getlookaheaddelegate4.serializer.serializer("Data loss. Failed to merge raw event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer((String) r8), e2);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                                                                        getlookaheaddelegate5.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer((String) r8), "Raw event data disappeared while in transaction. appId");
                                                                                    }
                                                                                } catch (SQLiteException e3) {
                                                                                    e = e3;
                                                                                    getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                                                                                    getlookaheaddelegate6.serializer.serializer("Data loss. Error selecting raw event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer((String) r8), e);
                                                                                    r5 = Query;
                                                                                }
                                                                            } catch (SQLiteException e4) {
                                                                                e = e4;
                                                                                r8 = zWrite;
                                                                                Query = cursorQuery;
                                                                            }
                                                                        } catch (IOException e5) {
                                                                            getLookaheadDelegate getlookaheaddelegate7 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                                                                            getlookaheaddelegate7.serializer.serializer("Data loss. Failed to merge raw event metadata. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str3), e5);
                                                                            r5 = cursorQuery;
                                                                        }
                                                                    } catch (SQLiteException e6) {
                                                                        e = e6;
                                                                        Query = r14;
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        IsEmpty = r14;
                                                                        if (IsEmpty != 0) {
                                                                            IsEmpty.close();
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                r5 = cursorQuery;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                IsEmpty = cursorQuery;
                                                                if (IsEmpty != 0) {
                                                                    IsEmpty.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e7) {
                                                            e = e7;
                                                            r8 = str3;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        r14 = cursorQuery;
                                                    }
                                                } catch (SQLiteException e8) {
                                                    e = e8;
                                                    r8 = str3;
                                                }
                                            } catch (SQLiteException e9) {
                                                e = e9;
                                                r8 = str3;
                                                Query = r16;
                                            }
                                        } catch (SQLiteException e10) {
                                            e = e10;
                                            r8 = str2;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        IsEmpty = r16;
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    r8 = string2;
                                }
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            r8 = str;
                        }
                    } else {
                        if (j2 != -1) {
                            strArr = new String[]{str, String.valueOf(j2)};
                        } else {
                            strArr = new String[]{str};
                        }
                        if (j2 != -1) {
                            str6 = " and rowid <= ?";
                        }
                        StringBuilder sb2 = new StringBuilder(str6.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str6);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = ResultReceiver.rawQuery(sb2.toString(), strArr);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                string = cursorRawQuery.getString(0);
                                cursorRawQuery.close();
                                str2 = str;
                                r16 = cursorRawQuery;
                                IsEmpty = cursorRawQuery;
                                String str8 = string;
                                r14 = str8;
                                str3 = str2;
                                cursorQuery = ResultReceiver.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str2, str8}, null, null, "rowid", "2");
                                if (!cursorQuery.moveToFirst()) {
                                    getLookaheadDelegate getlookaheaddelegate8 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate8);
                                    getlookaheaddelegate8.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str3), "Raw event metadata record is missing. appId");
                                } else {
                                    getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq2 = (getTvZoomModeEK5gGoQ) ((getTwoEK5gGoQ) zzgz.write(getTvZoomModeEK5gGoQ.IconCompatParcelizer(), cursorQuery.getBlob(0))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                    if (cursorQuery.moveToNext()) {
                                        getLookaheadDelegate getlookaheaddelegate9 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate9);
                                        getlookaheaddelegate9.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str3), "Get multiple raw event metadata records, expected one. appId");
                                    }
                                    cursorQuery.close();
                                    onGloballyPositionedModifierDefaultImpls.read = gettvzoommodeek5ggoq2;
                                    zWrite = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.write(null, premeasure0kLqBqw.onUserLeaveHint);
                                    if (zWrite) {
                                        str5 = str3;
                                        jWrite = write("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str5, r14}, -1L);
                                        if (j2 == -1) {
                                            j4 = j2;
                                        } else if (jWrite != -1) {
                                            j4 = -1;
                                        } else {
                                            strArr2 = new String[]{str5, r14};
                                            r4 = str5;
                                            r9 = strArr2;
                                            str4 = "app_id = ? and metadata_fingerprint = ?";
                                            r8 = r4;
                                        }
                                        if (j4 == -1) {
                                            if (j4 != -1) {
                                                jWrite = j4;
                                            }
                                        } else if (j4 != -1) {
                                            jWrite = j4;
                                        }
                                        ?? r12 = {str5, r14, String.valueOf(jWrite)};
                                        r6 = str5;
                                        r7 = r12;
                                        str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        r9 = r7;
                                        r8 = r6;
                                    } else {
                                        r8 = str3;
                                        if (j2 != -1) {
                                            ?? r13 = {r8, r14, String.valueOf(j2)};
                                            r6 = r8;
                                            r7 = r13;
                                            str4 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                            r9 = r7;
                                            r8 = r6;
                                        } else {
                                            strArr2 = new String[]{r8, r14};
                                            r4 = r8;
                                            r9 = strArr2;
                                            str4 = "app_id = ? and metadata_fingerprint = ?";
                                            r8 = r4;
                                        }
                                        e = e;
                                        r14 = cursorQuery;
                                        Query = r14;
                                        getLookaheadDelegate getlookaheaddelegate10 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate10);
                                        getlookaheaddelegate10.serializer.serializer("Data loss. Error selecting raw event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer((String) r8), e);
                                        r5 = Query;
                                    }
                                    Query = ResultReceiver.query("raw_events", new String[]{"rowid", "name", "timestamp", RemoteMessageConst.DATA}, str4, r9, null, null, "rowid", null);
                                    if (Query.moveToFirst()) {
                                        while (true) {
                                            j3 = Query.getLong(0);
                                            gettvsatellitebsek5ggoq = (getTvSatelliteBsEK5gGoQ) zzgz.write(getTvTerrestrialDigitalEK5gGoQ.read(), Query.getBlob(3));
                                            String string4 = Query.getString(1);
                                            gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
                                            ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).IconCompatParcelizer(string4);
                                            long j6 = Query.getLong(2);
                                            gettvsatellitebsek5ggoq.ParcelableVolumeInfo();
                                            ((getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.IconCompatParcelizer).IconCompatParcelizer(j6);
                                            if (!onGloballyPositionedModifierDefaultImpls.serializer(j3, (getTvTerrestrialDigitalEK5gGoQ) gettvsatellitebsek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys())) {
                                                r5 = Query;
                                                break;
                                            } else if (!Query.moveToNext()) {
                                                r5 = Query;
                                                break;
                                            }
                                        }
                                    } else {
                                        getLookaheadDelegate getlookaheaddelegate11 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate11);
                                        getlookaheaddelegate11.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer((String) r8), "Raw event data disappeared while in transaction. appId");
                                    }
                                }
                                r5 = cursorQuery;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            cursor = cursorRawQuery;
                            Query = cursor;
                            r8 = str;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                obj2 = obj;
                IsEmpty = obj2;
                if (IsEmpty != 0) {
                    IsEmpty.close();
                }
                throw th;
            }
        } catch (SQLiteException e14) {
            e = e14;
        } catch (Throwable th7) {
            th = th7;
            IsEmpty = obj2;
            if (IsEmpty != 0) {
                IsEmpty.close();
            }
            throw th;
        }
        if (r5 == 0) {
            r5 = cursorRawQuery;
            r5 = Query;
            r5 = Query;
            return;
        } else {
            r5 = cursorRawQuery;
            r5 = Query;
            r5 = Query;
            r5.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[LOOP:2: B:45:0x00fd->B:122:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    public final void serializer(String str, Long l, String str2, Bundle bundle) {
        LayoutNodeSubcompositionsStateScope layoutNodeSubcompositionsStateScope;
        getLookaheadDelegate getlookaheaddelegate;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        getLookaheadDelegate getlookaheaddelegate2;
        getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq;
        Cursor cursorQuery;
        Iterator it;
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = this;
        String str4 = str;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(bundle);
        MediaSessionCompatToken();
        ComponentActivity();
        if (l != null) {
            layoutNodeSubcompositionsStateScope = new LayoutNodeSubcompositionsStateScope(layoutNodeSubcompositionsStatecreateMeasurePolicy1, str4, l.longValue());
        } else {
            layoutNodeSubcompositionsStateScope = new LayoutNodeSubcompositionsStateScope(layoutNodeSubcompositionsStatecreateMeasurePolicy1, str4);
        }
        LayoutNodeSubcompositionsStateScope layoutNodeSubcompositionsStateScope2 = layoutNodeSubcompositionsStateScope;
        List<setSlotId> listPlaybackStateCompat = layoutNodeSubcompositionsStateScope2.PlaybackStateCompat();
        while (!listPlaybackStateCompat.isEmpty()) {
            for (setSlotId setslotid : listPlaybackStateCompat) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq2 = null;
                        getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq3 = null;
                        try {
                            try {
                                cursorQuery = ResultReceiver().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(setslotid.read)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (!cursorQuery.moveToFirst()) {
                                            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                            getlookaheaddelegate3.serializer.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Raw event metadata record is missing. appId");
                                        } else {
                                            try {
                                                getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq4 = (getTvZoomModeEK5gGoQ) ((getTwoEK5gGoQ) zzgz.write(getTvZoomModeEK5gGoQ.IconCompatParcelizer(), cursorQuery.getBlob(0))).r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                                        getlookaheaddelegate4.MediaSessionCompatQueueItem.serializer(getLookaheadDelegate.RemoteActionCompatParcelizer(str), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                    gettvzoommodeek5ggoq2 = gettvzoommodeek5ggoq4;
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    gettvzoommodeek5ggoq3 = gettvzoommodeek5ggoq4;
                                                    getTvZoomModeEK5gGoQ gettvzoommodeek5ggoq5 = gettvzoommodeek5ggoq3;
                                                    cursor = cursorQuery;
                                                    gettvzoommodeek5ggoq = gettvzoommodeek5ggoq5;
                                                    getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                                                    getlookaheaddelegate5.serializer.serializer("Data loss. Error selecting raw event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    gettvzoommodeek5ggoq2 = gettvzoommodeek5ggoq;
                                                }
                                            } catch (IOException e2) {
                                                getLookaheadDelegate getlookaheaddelegate6 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate6);
                                                getlookaheaddelegate6.serializer.serializer("Data loss. Failed to merge raw event metadata. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e2);
                                                cursorQuery.close();
                                            }
                                            if (gettvzoommodeek5ggoq2 != null) {
                                                it = gettvzoommodeek5ggoq2.onPictureInPictureUiStateChanged().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((getYEK5gGoQ) it.next()).IconCompatParcelizer().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursorQuery = null;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            gettvzoommodeek5ggoq = null;
                        }
                        if (gettvzoommodeek5ggoq2 != null) {
                            it = gettvzoommodeek5ggoq2.onPictureInPictureUiStateChanged().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((getYEK5gGoQ) it.next()).IconCompatParcelizer().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = ResultReceiver().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                        getlookaheaddelegate2 = getlookaheaddelegate;
                        try {
                            getlookaheaddelegate2.serializer.serializer("Failed to update raw event. appId, updatedRows", getLookaheadDelegate.RemoteActionCompatParcelizer(str3), Long.valueOf(jUpdate));
                        } catch (SQLiteException e5) {
                            e = e5;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                            getlookaheaddelegate2.serializer.serializer("Error updating raw event. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str3), e);
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    getlookaheaddelegate2 = getlookaheaddelegate;
                }
                zzpg zzpgVar = layoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatToken;
                zzgz zzgzVar = zzpgVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                zzpg.serializer(zzgzVar);
                getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq = setslotid.write;
                Bundle bundle3 = new Bundle();
                for (getTvSatelliteServiceEK5gGoQ gettvsatelliteserviceek5ggoq : gettvterrestrialdigitalek5ggoq.serializer()) {
                    if (gettvsatelliteserviceek5ggoq.MediaSessionCompatQueueItem()) {
                        bundle3.putDouble(gettvsatelliteserviceek5ggoq.read(), gettvsatelliteserviceek5ggoq.PlaybackStateCompatCustomAction());
                    } else if (gettvsatelliteserviceek5ggoq.RatingCompat()) {
                        bundle3.putFloat(gettvsatelliteserviceek5ggoq.read(), gettvsatelliteserviceek5ggoq.MediaMetadataCompat());
                    } else if (gettvsatelliteserviceek5ggoq.MediaBrowserCompatMediaItem()) {
                        bundle3.putLong(gettvsatelliteserviceek5ggoq.read(), gettvsatelliteserviceek5ggoq.MediaDescriptionCompat());
                    } else if (gettvsatelliteserviceek5ggoq.RemoteActionCompatParcelizer()) {
                        bundle3.putString(gettvsatelliteserviceek5ggoq.read(), gettvsatelliteserviceek5ggoq.serializer());
                    } else if (!gettvsatelliteserviceek5ggoq.MediaSessionCompatResultReceiverWrapper().isEmpty()) {
                        bundle3.putParcelableArray(gettvsatelliteserviceek5ggoq.read(), zzgz.IconCompatParcelizer((onPostFlingRZ2iAVYsuspendImpl) gettvsatelliteserviceek5ggoq.MediaSessionCompatResultReceiverWrapper()));
                    } else {
                        getLookaheadDelegate getlookaheaddelegate7 = ((LookaheadScopeKtLookaheadScope221) zzgzVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate7);
                        getlookaheaddelegate7.serializer.serializer(gettvsatelliteserviceek5ggoq, "Unexpected parameter type for parameter");
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strIconCompatParcelizer = gettvterrestrialdigitalek5ggoq.IconCompatParcelizer();
                if (string == null) {
                    string = "";
                }
                onLayoutRectChangeddefault onlayoutrectchangeddefault = lookaheadScopeKtLookaheadScope221.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(onlayoutrectchangeddefault);
                if (strIconCompatParcelizer.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    Iterator<String> it2 = bundle.keySet().iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        Iterator<String> it3 = it2;
                        if (next.startsWith("gad_")) {
                            bundle2.remove(next);
                        }
                        it2 = it3;
                    }
                } else {
                    bundle2 = bundle;
                }
                onlayoutrectchangeddefault.RemoteActionCompatParcelizer(bundle3, bundle2);
                LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2 layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2 = new LayoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2(lookaheadScopeKtLookaheadScope221, string, str, gettvterrestrialdigitalek5ggoq.IconCompatParcelizer(), gettvterrestrialdigitalek5ggoq.MediaMetadataCompat(), gettvterrestrialdigitalek5ggoq.MediaDescriptionCompat(), bundle3);
                j = setslotid.serializer;
                long j2 = setslotid.read;
                boolean z = setslotid.IconCompatParcelizer;
                MediaSessionCompatToken();
                ComponentActivity();
                str3 = layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2.IconCompatParcelizer;
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str3);
                zzgz zzgzVar2 = zzpgVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                zzpg.serializer(zzgzVar2);
                byte[] bArrRemoveOnUserLeaveHintListener = zzgzVar2.RemoteActionCompatParcelizer(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2).removeOnUserLeaveHintListener();
                contentValues = new ContentValues();
                contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str3);
                contentValues.put("name", layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2.serializer);
                contentValues.put("timestamp", Long.valueOf(layoutNodeSubcompositionsStatecreateMeasurePolicy1measure3p2s80sinlinedcreateMeasureResult2.RemoteActionCompatParcelizer));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put(RemoteMessageConst.DATA, bArrRemoveOnUserLeaveHintListener);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                layoutNodeSubcompositionsStatecreateMeasurePolicy1 = this;
                str4 = str;
            }
            listPlaybackStateCompat = layoutNodeSubcompositionsStateScope2.PlaybackStateCompat();
            layoutNodeSubcompositionsStatecreateMeasurePolicy1 = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013d A[DONT_GENERATE] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    public final List write(String str, String str2, String str3) {
        String str4;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                int i = 3;
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.IconCompatParcelizer("(2)Error querying user properties", getLookaheadDelegate.RemoteActionCompatParcelizer(str), str4, e);
                            arrayList = Collections.EMPTY_LIST;
                            return arrayList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                        sb2.append(str3);
                        sb2.append("*");
                        arrayList2.add(sb2.toString());
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    int i2 = 0;
                    int i3 = 2;
                    String string = sb.toString();
                    lookaheadScopeKtLookaheadScope221.getClass();
                    getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    cursorQuery = ResultReceiver().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            if (arrayList.size() >= 1000) {
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                getlookaheaddelegate2.serializer.serializer(1000, "Read more than the max allowed user properties, ignoring excess");
                                break;
                            }
                            String string2 = cursorQuery.getString(i2);
                            long j = cursorQuery.getLong(1);
                            Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cursorQuery, i3);
                            String string3 = cursorQuery.getString(i);
                            if (objRemoteActionCompatParcelizer == null) {
                                try {
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                                    getlookaheaddelegate2.serializer.IconCompatParcelizer("(2)Read invalid user property value, ignoring it", getLookaheadDelegate.RemoteActionCompatParcelizer(str), string3, str3);
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    string3 = string3;
                                    str4 = string3;
                                    getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                                    getlookaheaddelegate3.serializer.IconCompatParcelizer("(2)Error querying user properties", getLookaheadDelegate.RemoteActionCompatParcelizer(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    return arrayList;
                                }
                            } else {
                                arrayList.add(new getThrottleMillis(str, string3, string2, j, objRemoteActionCompatParcelizer));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                i2 = i2;
                                str4 = string3;
                                getlookaheaddelegate2 = getlookaheaddelegate2;
                                i3 = i3;
                                i = 3;
                            } catch (SQLiteException e3) {
                                e = e3;
                                str4 = string3;
                                getLookaheadDelegate getlookaheaddelegate4 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate4);
                                getlookaheaddelegate4.serializer.IconCompatParcelizer("(2)Error querying user properties", getLookaheadDelegate.RemoteActionCompatParcelizer(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    str4 = str2;
                    getLookaheadDelegate getlookaheaddelegate5 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate5);
                    getlookaheaddelegate5.serializer.IconCompatParcelizer("(2)Error querying user properties", getLookaheadDelegate.RemoteActionCompatParcelizer(str), str4, e);
                    arrayList = Collections.EMPTY_LIST;
                    return arrayList;
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e5) {
            e = e5;
        }
        return arrayList;
    }

    public final getPlaceablesCount write(String str, getTvTerrestrialDigitalEK5gGoQ gettvterrestrialdigitalek5ggoq, String str2) throws Throwable {
        getPlaceablesCount getplaceablescountRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("events", str, gettvterrestrialdigitalek5ggoq.IconCompatParcelizer());
        if (getplaceablescountRemoteActionCompatParcelizer == null) {
            LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatQueueItem.serializer("Event aggregate wasn't created during raw event logging. appId, event", getLookaheadDelegate.RemoteActionCompatParcelizer(str), lookaheadScopeKtLookaheadScope221.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(str2));
            return new getPlaceablesCount(str, gettvterrestrialdigitalek5ggoq.IconCompatParcelizer(), 1L, 1L, 1L, gettvterrestrialdigitalek5ggoq.MediaMetadataCompat(), 0L, null, null, null, null);
        }
        long j = getplaceablescountRemoteActionCompatParcelizer.IconCompatParcelizer;
        long j2 = getplaceablescountRemoteActionCompatParcelizer.read;
        return new getPlaceablesCount(getplaceablescountRemoteActionCompatParcelizer.RemoteActionCompatParcelizer, getplaceablescountRemoteActionCompatParcelizer.write, getplaceablescountRemoteActionCompatParcelizer.serializer + 1, j2 + 1, 1 + j, getplaceablescountRemoteActionCompatParcelizer.MediaMetadataCompat, getplaceablescountRemoteActionCompatParcelizer.MediaDescriptionCompat, getplaceablescountRemoteActionCompatParcelizer.RatingCompat, getplaceablescountRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem, getplaceablescountRemoteActionCompatParcelizer.MediaSessionCompatQueueItem, getplaceablescountRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper);
    }

    public LayoutNodeSubcompositionsStatecreateMeasurePolicy1(zzpg zzpgVar) {
        super(zzpgVar);
        this.PlaybackStateCompat = new getCacheFileSuffixlambda0(((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).getClass();
        this.MediaSessionCompatResultReceiverWrapper = new setForceReuse(this, ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).MediaDescriptionCompat);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    public final String IconCompatParcelizer(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = ResultReceiver().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    public final long write(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = ResultReceiver().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long write(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = ResultReceiver().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                getlookaheaddelegate.serializer.serializer("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final long IconCompatParcelizer(String str, getUEK5gGoQ getuek5ggoq, String str2, Map map, OnFirstVisibleModifierKt onFirstVisibleModifierKt, Long l) {
        int iDelete;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        MediaSessionCompatToken();
        ComponentActivity();
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getuek5ggoq);
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
        MediaSessionCompatToken();
        ComponentActivity();
        if (MediaSessionCompatResultReceiverWrapper()) {
            zzpg zzpgVar = this.MediaSessionCompatToken;
            long jRemoteActionCompatParcelizer = zzpgVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write.RemoteActionCompatParcelizer();
            accessgetTvInputComposite1cp accessgettvinputcomposite1cp = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            accessgettvinputcomposite1cp.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jRemoteActionCompatParcelizer) > ((Long) premeasure0kLqBqw.ParcelableVolumeInfo.IconCompatParcelizer(null)).longValue()) {
                zzpgVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write.serializer(jElapsedRealtime);
                MediaSessionCompatToken();
                ComponentActivity();
                if (MediaSessionCompatResultReceiverWrapper() && (iDelete = ResultReceiver().delete("upload_queue", MediaMetadataCompat(), new String[0])) > 0) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.PlaybackStateCompat.serializer(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(str);
                MediaSessionCompatToken();
                ComponentActivity();
                try {
                    int iSerializer = lookaheadScopeKtLookaheadScope221.PlaybackStateCompat.serializer(str, premeasure0kLqBqw.invoke);
                    if (iSerializer > 0) {
                        ResultReceiver().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iSerializer)});
                    }
                } catch (SQLiteException e) {
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.serializer("Error deleting over the limit queued batches. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrRemoveOnUserLeaveHintListener = getuek5ggoq.removeOnUserLeaveHintListener();
        ContentValues contentValues = new ContentValues();
        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str);
        contentValues.put("measurement_batch", bArrRemoveOnUserLeaveHintListener);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(onFirstVisibleModifierKt.zza()));
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp2 = lookaheadScopeKtLookaheadScope221.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        accessgettvinputcomposite1cp2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = ResultReceiver().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
            getlookaheaddelegate2.serializer.serializer("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    public final OnLayoutRectChangedModifierKt RemoteActionCompatParcelizer(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (TextUtils.isEmpty(str2)) {
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.MediaSessionCompatToken.RemoteActionCompatParcelizer("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            getVEK5gGoQ getvek5ggoq = (getVEK5gGoQ) zzgz.write(getUEK5gGoQ.serializer(), bArr);
            OnFirstVisibleModifierKt onFirstVisibleModifierKtZzb = OnFirstVisibleModifierKt.zzb(i);
            if (onFirstVisibleModifierKtZzb != OnFirstVisibleModifierKt.GOOGLE_SIGNAL && onFirstVisibleModifierKtZzb != OnFirstVisibleModifierKt.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).read()).iterator();
                while (it.hasNext()) {
                    getTwoEK5gGoQ gettwoek5ggoq = (getTwoEK5gGoQ) ((getTvZoomModeEK5gGoQ) it.next()).getOnBackPressedDispatcherannotations();
                    gettwoek5ggoq.ParcelableVolumeInfo();
                    ((getTvZoomModeEK5gGoQ) gettwoek5ggoq.IconCompatParcelizer).IconCompatParcelizer(i2);
                    arrayList.add((getTvZoomModeEK5gGoQ) gettwoek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                }
                getvek5ggoq.ParcelableVolumeInfo();
                ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).MediaSessionCompatQueueItem();
                getvek5ggoq.ParcelableVolumeInfo();
                ((getUEK5gGoQ) getvek5ggoq.IconCompatParcelizer).IconCompatParcelizer(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                    if (strArrSplit.length != 2) {
                        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
                        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                        getlookaheaddelegate2.serializer.serializer(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            return new OnLayoutRectChangedModifierKt(j, (getUEK5gGoQ) getvek5ggoq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), str2, map, onFirstVisibleModifierKtZzb, j2, j3, j4, i2);
        } catch (IOException e) {
            getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
            getlookaheaddelegate3.serializer.serializer("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final boolean read(String str, String str2) {
        return write("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String serializer() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseResultReceiver = ResultReceiver();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseResultReceiver.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                    getlookaheaddelegate.serializer.serializer(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                r1 = sQLiteDatabaseResultReceiver;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public static final String serializer(List list) {
        return list.isEmpty() ? "" : ff$$ExternalSyntheticOutline0.m(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6 A[ADDED_TO_REGION] */
    public final void RatingCompat(String str) throws Throwable {
        boolean z;
        boolean z2;
        getPlaceablesCount getplaceablescountRemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        getPlaceablesCount getplaceablescountRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer("events", str, "_f");
        getPlaceablesCount getplaceablescountRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer("events", str, "_v");
        write("events", str);
        Cursor cursorQuery = null;
        boolean z3 = false;
        try {
            cursorQuery = ResultReceiver().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                z2 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z2 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (getplaceablescountRemoteActionCompatParcelizer = RemoteActionCompatParcelizer("events_snapshot", str, string)) != null) {
                            write("events", getplaceablescountRemoteActionCompatParcelizer);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z3 = z;
                        try {
                            getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
                            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
                            getlookaheaddelegate.serializer.serializer("Error querying snapshot. appId", getLookaheadDelegate.RemoteActionCompatParcelizer(str), e);
                            z = z3;
                        } catch (Throwable th) {
                            th = th;
                            z = z3;
                            z3 = z2;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z3 && getplaceablescountRemoteActionCompatParcelizer2 != null) {
                                write("events", getplaceablescountRemoteActionCompatParcelizer2);
                            } else if (!z && getplaceablescountRemoteActionCompatParcelizer3 != null) {
                                write("events", getplaceablescountRemoteActionCompatParcelizer3);
                            }
                            write("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = z2;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z3) {
                            if (!z) {
                                write("events", getplaceablescountRemoteActionCompatParcelizer3);
                            }
                        } else if (!z) {
                            write("events", getplaceablescountRemoteActionCompatParcelizer3);
                        }
                        write("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z2 && getplaceablescountRemoteActionCompatParcelizer2 != null) {
                    write("events", getplaceablescountRemoteActionCompatParcelizer2);
                } else if (!z && getplaceablescountRemoteActionCompatParcelizer3 != null) {
                    write("events", getplaceablescountRemoteActionCompatParcelizer3);
                }
            } else {
                cursorQuery.close();
                if (getplaceablescountRemoteActionCompatParcelizer2 != null) {
                    write("events", getplaceablescountRemoteActionCompatParcelizer2);
                } else if (getplaceablescountRemoteActionCompatParcelizer3 != null) {
                    write("events", getplaceablescountRemoteActionCompatParcelizer3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z2 = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (z3) {
                if (!z) {
                    write("events", getplaceablescountRemoteActionCompatParcelizer3);
                }
            } else if (!z) {
                write("events", getplaceablescountRemoteActionCompatParcelizer3);
            }
            write("events_snapshot", str);
            throw th;
        }
        write("events_snapshot", str);
    }

    public final setPausedComposition write(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return RemoteActionCompatParcelizer(j, str, 1L, false, false, z, false, z2, z3, z4);
    }
}
