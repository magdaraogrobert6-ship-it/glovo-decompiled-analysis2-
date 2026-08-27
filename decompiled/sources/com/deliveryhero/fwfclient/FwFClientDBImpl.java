package com.deliveryhero.fwfclient;

import app.cash.sqldelight.TransacterImpl;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import com.deliveryhero.FwFClientDB;
import com.deliveryhero.database.FwFDataQueries;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
final class FwFClientDBImpl extends TransacterImpl implements FwFClientDB {
    private final FwFDataQueries fwFDataQueries;

    @Override // com.deliveryhero.FwFClientDB
    public FwFDataQueries getFwFDataQueries() {
        return this.fwFDataQueries;
    }

    public static final class Schema implements SqlSchema<QueryResult.Value<createFromParcel>> {
        public static final Schema INSTANCE = new Schema();

        private Schema() {
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public long getVersion() {
            return 1L;
        }

        /* JADX INFO: renamed from: migrate-zeHU3Mk, reason: not valid java name */
        public Object m4471migratezeHU3Mk(SqlDriver sqlDriver, long j, long j2, AfterVersion... afterVersionArr) {
            sqlDriver.getClass();
            afterVersionArr.getClass();
            return QueryResult.Companion.m3963getUnitmlRZEE();
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public /* synthetic */ QueryResult create(SqlDriver sqlDriver) {
            return QueryResult.Value.m3965boximpl(m4470create0iQ1z0(sqlDriver));
        }

        @Override // app.cash.sqldelight.db.SqlSchema
        public /* synthetic */ QueryResult migrate(SqlDriver sqlDriver, long j, long j2, AfterVersion[] afterVersionArr) {
            return QueryResult.Value.m3965boximpl(m4471migratezeHU3Mk(sqlDriver, j, j2, afterVersionArr));
        }

        /* JADX INFO: renamed from: create-0iQ1-z0, reason: not valid java name */
        public Object m4470create0iQ1z0(SqlDriver sqlDriver) {
            sqlDriver.getClass();
            SqlDriver.DefaultImpls.execute$default(sqlDriver, null, "CREATE TABLE FwFCacheItem (\n    key TEXT PRIMARY KEY NOT NULL,\n    structure BLOB\n)", 0, null, 8, null);
            return QueryResult.Companion.m3963getUnitmlRZEE();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FwFClientDBImpl(SqlDriver sqlDriver) {
        super(sqlDriver);
        sqlDriver.getClass();
        this.fwFDataQueries = new FwFDataQueries(sqlDriver);
    }
}
