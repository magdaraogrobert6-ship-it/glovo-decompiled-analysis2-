package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getExitEvents implements r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ migrateBlocklistedListslambda3 write;

    public /* synthetic */ getExitEvents(migrateBlocklistedListslambda3 migrateblocklistedlistslambda3, int i) {
        this.IconCompatParcelizer = i;
        this.write = migrateblocklistedlistslambda3;
    }

    @Override // o.r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk
    public final Object write(SQLiteDatabase sQLiteDatabase) {
        int i = this.IconCompatParcelizer;
        migrateBlocklistedListslambda3 migrateblocklistedlistslambda3 = this.write;
        return i != 0 ? setHeaderTextColor.IconCompatParcelizer((setHeaderTextColor) migrateblocklistedlistslambda3, sQLiteDatabase) : getCooldownEnterSeconds.IconCompatParcelizer((getCooldownEnterSeconds) migrateblocklistedlistslambda3, sQLiteDatabase);
    }
}
