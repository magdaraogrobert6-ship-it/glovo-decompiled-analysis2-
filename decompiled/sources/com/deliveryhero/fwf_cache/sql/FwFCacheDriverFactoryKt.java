package com.deliveryhero.fwf_cache.sql;

import app.cash.sqldelight.db.SqlDriver;
import com.deliveryhero.FwFClientDB;
import com.deliveryhero.fwfclient.FwFClientDBImplKt;
import o.displayInAppMessagelambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFCacheDriverFactoryKt {
    public static final String FWF_CLIENT_DB_NAME = "FwFClientDB";

    public static final FwFClientDB createDatabase(CacheDriverFactory cacheDriverFactory) {
        cacheDriverFactory.getClass();
        SqlDriver sqlDriverCreateDriver$fwf_client_release = cacheDriverFactory.createDriver$fwf_client_release(FWF_CLIENT_DB_NAME);
        FwFClientDB.Companion.getClass();
        sqlDriverCreateDriver$fwf_client_release.getClass();
        return FwFClientDBImplKt.newInstance(displayInAppMessagelambda1.serializer(FwFClientDB.class), sqlDriverCreateDriver$fwf_client_release);
    }
}
