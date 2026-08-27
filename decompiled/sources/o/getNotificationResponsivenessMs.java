package o;

import android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getNotificationResponsivenessMs implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public final /* synthetic */ migrateBlocklistedListslambda3 serializer;

    public /* synthetic */ getNotificationResponsivenessMs(setHeaderTextColor setheadertextcolor, long j, isPushPrimer ispushprimer) {
        this.IconCompatParcelizer = 1;
        this.serializer = setheadertextcolor;
        this.read = j;
        this.RemoteActionCompatParcelizer = ispushprimer;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.IconCompatParcelizer;
        long j = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        migrateBlocklistedListslambda3 migrateblocklistedlistslambda3 = this.serializer;
        if (i != 0) {
            return i != 1 ? DustDataStoreProviderCompanion.RemoteActionCompatParcelizer((DustDataStoreProviderCompanion) migrateblocklistedlistslambda3, (String) obj, j, sQLiteDatabase) : setHeaderTextColor.IconCompatParcelizer((setHeaderTextColor) migrateblocklistedlistslambda3, j, (isPushPrimer) obj, sQLiteDatabase);
        }
        return getCooldownEnterSeconds.serializer((getCooldownEnterSeconds) migrateblocklistedlistslambda3, (ArrayList) obj, j, sQLiteDatabase);
    }

    public /* synthetic */ getNotificationResponsivenessMs(migrateBlocklistedListslambda3 migrateblocklistedlistslambda3, Serializable serializable, long j, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = migrateblocklistedlistslambda3;
        this.RemoteActionCompatParcelizer = serializable;
        this.read = j;
    }
}
