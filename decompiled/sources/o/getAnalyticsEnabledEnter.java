package o;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getAnalyticsEnabledEnter implements migrateBlocklistedListslambda1 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ migrateBlocklistedListslambda3 serializer;

    public /* synthetic */ getAnalyticsEnabledEnter(migrateBlocklistedListslambda3 migrateblocklistedlistslambda3, Object obj, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = migrateblocklistedlistslambda3;
        this.read = obj;
    }

    @Override // o.migrateBlocklistedListslambda1
    public final void serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        migrateBlocklistedListslambda3 migrateblocklistedlistslambda3 = this.serializer;
        if (i == 0) {
            getCooldownEnterSeconds.serializer((getCooldownEnterSeconds) migrateblocklistedlistslambda3, (HashMap) obj, sQLiteDatabase);
        } else if (i != 1) {
            wakeScreenIfAppropriatelambda3.read((wakeScreenIfAppropriatelambda3) migrateblocklistedlistslambda3, (ArrayList) obj, sQLiteDatabase);
        } else {
            setHeaderTextColor.IconCompatParcelizer((setHeaderTextColor) migrateblocklistedlistslambda3, (List) obj, sQLiteDatabase);
        }
    }
}
