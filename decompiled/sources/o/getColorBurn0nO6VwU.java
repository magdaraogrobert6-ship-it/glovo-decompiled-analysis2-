package o;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class getColorBurn0nO6VwU implements Comparator {
    public final /* synthetic */ int serializer;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.serializer == 0) {
            return ((getColor0nO6VwU) obj).serializer - ((getColor0nO6VwU) obj2).serializer;
        }
        getDstOver0nO6VwU getdstover0no6vwu = (getDstOver0nO6VwU) obj;
        getDstOver0nO6VwU getdstover0no6vwu2 = (getDstOver0nO6VwU) obj2;
        androidx.recyclerview.widget.RecyclerView recyclerView = getdstover0no6vwu.IconCompatParcelizer;
        if ((recyclerView == null) == (getdstover0no6vwu2.IconCompatParcelizer == null)) {
            boolean z = getdstover0no6vwu.serializer;
            if (z == getdstover0no6vwu2.serializer) {
                int i = getdstover0no6vwu2.read - getdstover0no6vwu.read;
                if (i != 0) {
                    return i;
                }
                int i2 = getdstover0no6vwu.write - getdstover0no6vwu2.write;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
            if (!z) {
                return 1;
            }
        } else if (recyclerView == null) {
            return 1;
        }
        return -1;
    }
}
