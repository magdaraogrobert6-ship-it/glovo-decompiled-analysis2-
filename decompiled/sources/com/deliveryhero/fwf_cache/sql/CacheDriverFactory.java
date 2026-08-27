package com.deliveryhero.fwf_cache.sql;

import android.content.Context;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.deliveryhero.FwFClientDB;
import com.deliveryhero.fwfclient.FwFClientDBImplKt;
import o.displayInAppMessagelambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheDriverFactory {
    private final Context context;

    public CacheDriverFactory(Context context) {
        context.getClass();
        this.context = context;
    }

    public final SqlDriver createDriver$fwf_client_release(String str) {
        str.getClass();
        FwFClientDB.Companion.getClass();
        return new AndroidSqliteDriver(FwFClientDBImplKt.getSchema(displayInAppMessagelambda1.serializer(FwFClientDB.class)), this.context, str, null, null, 0, false, null, 248, null);
    }
}
