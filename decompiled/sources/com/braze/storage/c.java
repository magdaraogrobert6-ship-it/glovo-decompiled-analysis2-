package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.j5;
import bo.app.k5;
import com.braze.support.StringUtils;
import o.forEachItemAfter;
import o.performCustomExitMxy_nc0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class c extends DataStoreProvider {
    public static final j5 b = new j5();
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        return createOrGetDataStore(SQLite.read(forEachItemAfter.IconCompatParcelizer(getContext(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.device_id", StringUtils.getCacheFileSuffix(getContext(), null, this.a)), forEachItemAfter.IconCompatParcelizer), new SharedPreferencesMigration(getContext(), "com.appboy.device", (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new k5(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("com.braze.device_id", StringUtils.getCacheFileSuffix(getContext(), null, this.a));
    }
}
