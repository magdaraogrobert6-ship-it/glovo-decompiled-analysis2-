package app.cash.sqldelight.driver.android;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlCursor;

/* JADX INFO: loaded from: classes.dex */
final class AndroidCursor implements SqlCursor {
    private final Cursor cursor;

    @Override // app.cash.sqldelight.db.SqlCursor
    public Boolean getBoolean(int i) {
        if (this.cursor.isNull(i)) {
            return null;
        }
        return Boolean.valueOf(this.cursor.getLong(i) == 1);
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public byte[] getBytes(int i) {
        if (this.cursor.isNull(i)) {
            return null;
        }
        return this.cursor.getBlob(i);
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public Double getDouble(int i) {
        if (this.cursor.isNull(i)) {
            return null;
        }
        return Double.valueOf(this.cursor.getDouble(i));
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public Long getLong(int i) {
        if (this.cursor.isNull(i)) {
            return null;
        }
        return Long.valueOf(this.cursor.getLong(i));
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public String getString(int i) {
        if (this.cursor.isNull(i)) {
            return null;
        }
        return this.cursor.getString(i);
    }

    /* JADX INFO: renamed from: next-mlR-ZEE, reason: not valid java name */
    public Object m3972nextmlRZEE() {
        return QueryResult.Value.m3966constructorimpl(Boolean.valueOf(this.cursor.moveToNext()));
    }

    public AndroidCursor(Cursor cursor, Long l) {
        cursor.getClass();
        this.cursor = cursor;
        if (l == null || !(cursor instanceof AbstractWindowedCursor)) {
            return;
        }
        Api28Impl.setWindowSize((AbstractWindowedCursor) cursor, l.longValue());
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public /* synthetic */ QueryResult next() {
        return QueryResult.Value.m3965boximpl(m3972nextmlRZEE());
    }
}
