package o;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class toArgb8_81llA extends constructorimpldefault implements luminance8_81llA {
    public final SQLiteStatement IconCompatParcelizer;

    @Override // o.luminance8_81llA
    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.executeUpdateDelete();
    }

    @Override // o.luminance8_81llA
    public final void serializer() {
        this.IconCompatParcelizer.execute();
    }

    @Override // o.luminance8_81llA
    public final long write() {
        return this.IconCompatParcelizer.executeInsert();
    }

    public toArgb8_81llA(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.IconCompatParcelizer = sQLiteStatement;
    }
}
