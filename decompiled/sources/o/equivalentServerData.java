package o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class equivalentServerData implements migrateBlocklistedListslambda1 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ equivalentServerData(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    @Override // o.migrateBlocklistedListslambda1
    public final void serializer(SQLiteDatabase sQLiteDatabase) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            getCooldownEnterSeconds.write((getCooldownEnterSeconds) obj, sQLiteDatabase);
            return;
        }
        if (i != 1) {
            if (i != 2) {
                wakeScreenIfAppropriatelambda3.read((wakeScreenIfAppropriatelambda3) obj, sQLiteDatabase);
                return;
            }
            List list = (List) obj;
            int i2 = r8lambda43c3j9_07_y35Qq6GrmdmAdkBhI.RemoteActionCompatParcelizer;
            list.getClass();
            Iterator it = onContentCardDismissed.IconCompatParcelizer(list, 50).iterator();
            while (it.hasNext()) {
                WhereClause whereClause = WhereClause.serializer("uuid").read((List) it.next());
                sQLiteDatabase.delete("data_sync_payloads", whereClause.IconCompatParcelizer(), whereClause.RemoteActionCompatParcelizer());
            }
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int i3 = getCooldownEnterSeconds.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList2.add(Long.valueOf(((getCooldownEnterSeconds.read) arrayList.get(i4)).IconCompatParcelizer()));
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_submitted", (Integer) 1);
        Iterator it2 = migrateBlocklistedListlambda2.serializer(arrayList2).iterator();
        while (it2.hasNext()) {
            WhereClause whereClause2 = WhereClause.serializer("id").read((List) it2.next());
            sQLiteDatabase.update("event_metadata", contentValues, whereClause2.IconCompatParcelizer(), whereClause2.RemoteActionCompatParcelizer());
        }
    }
}
