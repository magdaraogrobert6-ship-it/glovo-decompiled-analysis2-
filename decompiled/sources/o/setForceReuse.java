package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class setForceReuse extends getPlusEK5gGoQ {
    public final /* synthetic */ LayoutNodeSubcompositionsStatecreateMeasurePolicy1 serializer;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1 = this.serializer;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope222 = (LookaheadScopeKtLookaheadScope221) layoutNodeSubcompositionsStatecreateMeasurePolicy1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        lookaheadScopeKtLookaheadScope221.getClass();
        getCacheFileSuffixlambda0 getcachefilesuffixlambda0 = layoutNodeSubcompositionsStatecreateMeasurePolicy1.PlaybackStateCompat;
        if (getcachefilesuffixlambda0.read != 0 && ((accessgetTvInputComposite2cp) getcachefilesuffixlambda0.serializer).IconCompatParcelizer() - getcachefilesuffixlambda0.read < 3600000) {
            throw new SQLiteException("Database open failed");
        }
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            getcachefilesuffixlambda0.read = ((accessgetTvInputComposite2cp) getcachefilesuffixlambda0.serializer).IconCompatParcelizer();
            getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
            LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
            getlookaheaddelegate.serializer.RemoteActionCompatParcelizer("Opening the database failed, dropping and recreating it");
            if (!lookaheadScopeKtLookaheadScope222.MediaDescriptionCompat.getDatabasePath("google_app_measurement.db").delete()) {
                getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                getlookaheaddelegate2.serializer.serializer("google_app_measurement.db", "Failed to delete corrupted db file");
            }
            try {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                getcachefilesuffixlambda0.read = 0L;
                return writableDatabase;
            } catch (SQLiteException e) {
                getLookaheadDelegate getlookaheaddelegate3 = lookaheadScopeKtLookaheadScope222.ParcelableVolumeInfo;
                LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate3);
                getlookaheaddelegate3.serializer.serializer(e, "Failed to open freshly created database");
                throw e;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        getLookaheadDelegate getlookaheaddelegate = ((LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        RangesKt.serializer(getlookaheaddelegate, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        LookaheadScopeKtLookaheadScope221 lookaheadScopeKtLookaheadScope221 = (LookaheadScopeKtLookaheadScope221) this.serializer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getLookaheadDelegate getlookaheaddelegate = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.serializer);
        getLookaheadDelegate getlookaheaddelegate2 = lookaheadScopeKtLookaheadScope221.ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", (String[]) null);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", (String[]) null);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.RemoteActionCompatParcelizer);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.read);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaMetadataCompat);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", (String[]) null);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.IconCompatParcelizer);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaSessionCompatQueueItem);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.RatingCompat);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", (String[]) null);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaDescriptionCompat);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", (String[]) null);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", (String[]) null);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.MediaBrowserCompatMediaItem);
        accessgetExtendedTouchPaddingNHjbRcjd.IconCompatParcelizer();
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.ParcelableVolumeInfo);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", LayoutNodeSubcompositionsStatecreateMeasurePolicy1.write);
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
        RangesKt.RemoteActionCompatParcelizer(getlookaheaddelegate2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", (String[]) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setForceReuse(LayoutNodeSubcompositionsStatecreateMeasurePolicy1 layoutNodeSubcompositionsStatecreateMeasurePolicy1, Context context) {
        super(context, "google_app_measurement.db");
        this.serializer = layoutNodeSubcompositionsStatecreateMeasurePolicy1;
    }
}
