package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.bf;
import com.braze.enums.DataStoreKey;
import o.forEachItemAfter;
import o.onContentCardClicked;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class p extends DataStoreProvider {
    public static final ServerConfigDataStoreProvider$Companion b = new ServerConfigDataStoreProvider$Companion(null);
    public final String a;

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        return createOrGetDataStore(SQLite.read(forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.storage.server_config.", this.a), onContentCardClicked.MediaSessionCompatQueueItem(new String[]{DataStoreKey.LAST_ACCESSED_SDK_VERSION.getKey(), DataStoreKey.CONFIG_TIME.getKey(), DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), DataStoreKey.GEOFENCES_ENABLED.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), DataStoreKey.DUST_ENABLED.getKey(), DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), DataStoreKey.PUSH_MAX_ENABLED.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), DataStoreKey.BANNERS_ENABLED.getKey(), DataStoreKey.MAX_BANNER_PLACEMENTS.getKey()})), new SharedPreferencesMigration(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.storage.server_config.", this.a), (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new bf(b), 12)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.serverconfig.", this.a);
    }
}
