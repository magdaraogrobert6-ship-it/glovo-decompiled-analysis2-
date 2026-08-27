package app.cash.sqldelight.db;

/* JADX INFO: loaded from: classes.dex */
public interface SqlCursor {
    Boolean getBoolean(int i);

    byte[] getBytes(int i);

    Double getDouble(int i);

    Long getLong(int i);

    String getString(int i);

    QueryResult<Boolean> next();
}
