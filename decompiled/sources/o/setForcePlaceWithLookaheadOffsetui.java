package o;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setForcePlaceWithLookaheadOffsetui implements onPostAttach {
    public final /* synthetic */ int read;
    public final /* synthetic */ Object write;

    public /* synthetic */ setForcePlaceWithLookaheadOffsetui(int i, Object obj) {
        this.read = i;
        this.write = obj;
    }

    @Override // o.onPostAttach
    public final void IconCompatParcelizer(Object obj) {
        int i = this.read;
        Object obj2 = this.write;
        if (i == 0) {
            SQLiteTargetCache sQLiteTargetCache = (SQLiteTargetCache) obj2;
            Cursor cursor = (Cursor) obj;
            sQLiteTargetCache.getClass();
            sQLiteTargetCache.read = cursor.getInt(0);
            sQLiteTargetCache.IconCompatParcelizer = cursor.getInt(1);
            sQLiteTargetCache.RemoteActionCompatParcelizer = new SnapshotVersion(new Timestamp(cursor.getLong(2), cursor.getInt(3)));
            sQLiteTargetCache.MediaMetadataCompat = cursor.getLong(4);
            return;
        }
        if (i == 1) {
            Cursor cursor2 = (Cursor) obj;
            ((HashMap) obj2).put(Integer.valueOf(cursor2.getInt(0)), new touchBoundsInRoot(cursor2.getLong(1), new setWrappedui(new SnapshotVersion(new Timestamp(cursor2.getLong(2), cursor2.getInt(3))), new visitNodes(updateLayerParameters.RemoteActionCompatParcelizer(cursor2.getString(4))), cursor2.getInt(5))));
            return;
        }
        Boolean[] boolArr = (Boolean[]) obj2;
        try {
            if ("BUILD_OVERLAYS".equals(((Cursor) obj).getString(0))) {
                boolArr[0] = Boolean.TRUE;
            }
        } catch (IllegalArgumentException e) {
            getRectManager.write("SQLitePersistence.DataMigration failed to parse: %s", e);
            throw null;
        }
    }
}
