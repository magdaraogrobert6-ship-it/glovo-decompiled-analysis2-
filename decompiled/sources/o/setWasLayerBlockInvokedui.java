package o;

import android.database.Cursor;
import android.util.SparseArray;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class setWasLayerBlockInvokedui implements onPostAttach {
    public final /* synthetic */ Cloneable IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ setWasLayerBlockInvokedui(Object obj, Cloneable cloneable, Object obj2, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = cloneable;
        this.read = obj2;
    }

    @Override // o.onPostAttach
    public final void IconCompatParcelizer(Object obj) {
        int i = this.serializer;
        Object obj2 = this.read;
        Cloneable cloneable = this.IconCompatParcelizer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            androidx.recyclerview.widget.ChildHelper childHelper = (androidx.recyclerview.widget.ChildHelper) obj3;
            HashSet hashSet = (HashSet) cloneable;
            ArrayList arrayList = (ArrayList) obj2;
            Cursor cursor = (Cursor) obj;
            int i2 = cursor.getInt(0);
            if (hashSet.contains(Integer.valueOf(i2))) {
                return;
            }
            hashSet.add(Integer.valueOf(i2));
            arrayList.add(childHelper.RemoteActionCompatParcelizer(i2, cursor.getBlob(1)));
            return;
        }
        SQLiteTargetCache sQLiteTargetCache = (SQLiteTargetCache) obj3;
        int[] iArr = (int[]) obj2;
        sQLiteTargetCache.getClass();
        int i3 = ((Cursor) obj).getInt(0);
        if (((SparseArray) cloneable).get(i3) == null) {
            headH91voCI headh91voci = sQLiteTargetCache.write;
            headh91voci.IconCompatParcelizer("DELETE FROM target_documents WHERE target_id = ?", Integer.valueOf(i3));
            headh91voci.IconCompatParcelizer("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i3));
            sQLiteTargetCache.MediaMetadataCompat--;
            iArr[0] = iArr[0] + 1;
        }
    }
}
