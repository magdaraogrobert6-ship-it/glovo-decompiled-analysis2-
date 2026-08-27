package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class migrateEventDuplicationMap implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ migrateBlocklistedListslambda3 IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ long write;

    public /* synthetic */ migrateEventDuplicationMap(migrateBlocklistedListslambda3 migrateblocklistedlistslambda3, long j, int i) {
        this.read = i;
        this.IconCompatParcelizer = migrateblocklistedlistslambda3;
        this.write = j;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.read;
        long j = this.write;
        migrateBlocklistedListslambda3 migrateblocklistedlistslambda3 = this.IconCompatParcelizer;
        if (i != 0) {
            return i != 1 ? setHeaderTextColor.serializer((setHeaderTextColor) migrateblocklistedlistslambda3, j, sQLiteDatabase) : setHeaderTextColor.IconCompatParcelizer((setHeaderTextColor) migrateblocklistedlistslambda3, j, sQLiteDatabase);
        }
        return DustDataStoreProviderCompanion.write((DustDataStoreProviderCompanion) migrateblocklistedlistslambda3, j, sQLiteDatabase);
    }
}
