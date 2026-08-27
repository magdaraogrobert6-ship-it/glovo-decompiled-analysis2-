package app.cash.sqldelight.db;

/* JADX INFO: loaded from: classes.dex */
public interface SqlPreparedStatement {
    void bindBoolean(int i, Boolean bool);

    void bindBytes(int i, byte[] bArr);

    void bindDouble(int i, Double d);

    void bindLong(int i, Long l);

    void bindString(int i, String str);
}
