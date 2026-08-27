package o;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class isImportantForBounds {
    public Set IconCompatParcelizer;
    public SparseArray RemoteActionCompatParcelizer;
    public int read;

    public final BlockGraphicsLayerModifiermeasure1 write(int i) {
        SparseArray sparseArray = this.RemoteActionCompatParcelizer;
        BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure1 = (BlockGraphicsLayerModifiermeasure1) sparseArray.get(i);
        if (blockGraphicsLayerModifiermeasure1 != null) {
            return blockGraphicsLayerModifiermeasure1;
        }
        BlockGraphicsLayerModifiermeasure1 blockGraphicsLayerModifiermeasure2 = new BlockGraphicsLayerModifiermeasure1();
        sparseArray.put(i, blockGraphicsLayerModifiermeasure2);
        return blockGraphicsLayerModifiermeasure2;
    }
}
