package o;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaFpFJ_R0gncOcexw0o8eIjv2ByS8 implements r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ String write;

    public /* synthetic */ r8lambdaFpFJ_R0gncOcexw0o8eIjv2ByS8(String str, int i) {
        this.IconCompatParcelizer = i;
        this.write = str;
    }

    @Override // o.r8lambdaUImhpfnOsq1UcjCBCD7BCDEtbLk
    public final Object serializer(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        int i = this.IconCompatParcelizer;
        String str = this.write;
        boolean z2 = false;
        if (i != 0) {
            int i2 = DustDataStoreProviderCompanion.serializer;
            WhereClause whereClauseWrite = WhereClause.serializer("quad_key").write(str);
            return Boolean.valueOf(sQLiteDatabase.delete("tile_info", whereClauseWrite.IconCompatParcelizer(), whereClauseWrite.RemoteActionCompatParcelizer()) >= 0);
        }
        int i3 = DustDataStoreProviderCompanion.serializer;
        WhereClause whereClauseWrite2 = WhereClause.serializer("quad_key").write(str);
        try {
            Cursor cursorQuery = sQLiteDatabase.query("tile_info", null, whereClauseWrite2.IconCompatParcelizer(), whereClauseWrite2.RemoteActionCompatParcelizer(), null, null, null, "1");
            z = cursorQuery.getCount() > 0;
            try {
                cursorQuery.close();
            } catch (Exception unused) {
                z2 = z;
                z = z2;
            }
        } catch (Exception unused2) {
        }
        return Boolean.valueOf(z);
    }
}
