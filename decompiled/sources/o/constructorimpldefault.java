package o;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class constructorimpldefault implements getComponents8_81llA {
    public final SQLiteProgram RemoteActionCompatParcelizer;

    @Override // o.getComponents8_81llA
    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.clearBindings();
    }

    @Override // o.getComponents8_81llA
    public final void IconCompatParcelizer(int i, long j) {
        this.RemoteActionCompatParcelizer.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.RemoteActionCompatParcelizer.close();
    }

    @Override // o.getComponents8_81llA
    public final void serializer(int i) {
        this.RemoteActionCompatParcelizer.bindNull(i);
    }

    @Override // o.getComponents8_81llA
    public final void write(double d, int i) {
        this.RemoteActionCompatParcelizer.bindDouble(i, d);
    }

    public constructorimpldefault(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.RemoteActionCompatParcelizer = sQLiteProgram;
    }

    @Override // o.getComponents8_81llA
    public final void IconCompatParcelizer(int i, byte[] bArr) {
        bArr.getClass();
        this.RemoteActionCompatParcelizer.bindBlob(i, bArr);
    }

    @Override // o.getComponents8_81llA
    public final void serializer(int i, String str) {
        str.getClass();
        this.RemoteActionCompatParcelizer.bindString(i, str);
    }
}
