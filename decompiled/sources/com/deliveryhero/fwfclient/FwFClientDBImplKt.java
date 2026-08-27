package com.deliveryhero.fwfclient;

import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import com.deliveryhero.FwFClientDB;
import o.createFromParcel;
import o.getUnregisteredInAppMessageannotations;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFClientDBImplKt {
    public static final SqlSchema<QueryResult.Value<createFromParcel>> getSchema(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations) {
        getunregisteredinappmessageannotations.getClass();
        return FwFClientDBImpl.Schema.INSTANCE;
    }

    public static final FwFClientDB newInstance(getUnregisteredInAppMessageannotations getunregisteredinappmessageannotations, SqlDriver sqlDriver) {
        getunregisteredinappmessageannotations.getClass();
        sqlDriver.getClass();
        return new FwFClientDBImpl(sqlDriver);
    }
}
