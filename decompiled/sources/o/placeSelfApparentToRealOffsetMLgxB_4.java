package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.re2j.Parser;

/* JADX INFO: loaded from: classes2.dex */
public final class placeSelfApparentToRealOffsetMLgxB_4 extends SQLiteOpenHelper {
    public boolean IconCompatParcelizer;
    public final getForceMeasureWithLookaheadConstraintsui serializer;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.IconCompatParcelizer = true;
        sQLiteDatabase.rawQuery("PRAGMA locking_mode = EXCLUSIVE", new String[0]).close();
    }

    public placeSelfApparentToRealOffsetMLgxB_4(Context context, getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 18);
        this.serializer = getforcemeasurewithlookaheadconstraintsui;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.IconCompatParcelizer) {
            onConfigure(sQLiteDatabase);
        }
        new Parser.Pair(sQLiteDatabase, 1, this.serializer).serializer(0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (this.IconCompatParcelizer) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.IconCompatParcelizer) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.IconCompatParcelizer) {
            onConfigure(sQLiteDatabase);
        }
        new Parser.Pair(sQLiteDatabase, 1, this.serializer).serializer(i);
    }
}
