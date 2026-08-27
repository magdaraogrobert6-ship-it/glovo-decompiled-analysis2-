package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RecyclerViewLayoutManager {
    private static int read = 0;
    private static int serializer = 1;

    public final boolean read() {
        int i = 2 % 2;
        if (this instanceof RecyclerViewRecycler) {
            ArrayList arrayList = ((RecyclerViewRecycler) this).serializer.RemoteActionCompatParcelizer;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int i2 = serializer + 41;
                    read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    if (((notifyItemChanged) it.next()) instanceof getItemCount) {
                        int i4 = serializer + 1;
                        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            int i5 = 1 / 0;
                        }
                        return true;
                    }
                }
            }
        } else if (!equals(offsetChildrenHorizontal.RemoteActionCompatParcelizer)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        return false;
    }
}
