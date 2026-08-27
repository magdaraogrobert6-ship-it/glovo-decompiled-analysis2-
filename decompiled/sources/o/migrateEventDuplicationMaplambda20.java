package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class migrateEventDuplicationMaplambda20 implements r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ migrateBlocklistedListslambda3 serializer;

    public /* synthetic */ migrateEventDuplicationMaplambda20(migrateBlocklistedListslambda3 migrateblocklistedlistslambda3, String str, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = migrateblocklistedlistslambda3;
        this.IconCompatParcelizer = str;
    }

    @Override // o.r8lambdanXvk8hfSNmJvZNCNqAfYGXsOyk
    public final Object write(SQLiteDatabase sQLiteDatabase) {
        int i = this.RemoteActionCompatParcelizer;
        String str = this.IconCompatParcelizer;
        migrateBlocklistedListslambda3 migrateblocklistedlistslambda3 = this.serializer;
        return i != 0 ? setHeaderTextColor.RemoteActionCompatParcelizer((setHeaderTextColor) migrateblocklistedlistslambda3, str, sQLiteDatabase) : DustDataStoreProviderCompanion.RemoteActionCompatParcelizer((DustDataStoreProviderCompanion) migrateblocklistedlistslambda3, str, sQLiteDatabase);
    }
}
