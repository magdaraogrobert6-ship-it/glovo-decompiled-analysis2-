package com.braze.storage;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1;
import androidx.sqlite.SQLite;
import bo.app.ud;
import bo.app.vd;
import java.util.List;
import o.getQueryParameterslambda2;
import o.performCustomExitMxy_nc0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends DataStoreProvider {
    public static final ud a = new ud();

    @Override // com.braze.storage.DataStoreProvider
    public final performCustomExitMxy_nc0 getDataStore() {
        Object[] objArr = {new SharedPreferencesMigration(getContext(), "com.appboy.override.configuration.cache", (SharedPreferencesMigrationKt$getShouldRunMigration$1) null, new vd(), 12)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return createOrGetDataStore((List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return DataStoreProvider.RUNTIME_CONFIG_PREFIX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        context.getClass();
    }
}
