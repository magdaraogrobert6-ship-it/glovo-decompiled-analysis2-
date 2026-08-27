package app.cash.sqldelight.db;

import app.cash.sqldelight.db.QueryResult;
import o.createFromParcel;

/* JADX INFO: loaded from: classes.dex */
public interface SqlSchema<T extends QueryResult<createFromParcel>> {
    T create(SqlDriver sqlDriver);

    long getVersion();

    T migrate(SqlDriver sqlDriver, long j, long j2, AfterVersion... afterVersionArr);
}
