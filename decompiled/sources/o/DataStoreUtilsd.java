package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class DataStoreUtilsd {
    public final ArrayList write;

    public final int hashCode() {
        return this.write.hashCode();
    }

    public DataStoreUtilsd(ArrayList arrayList) {
        this.write = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataStoreUtilsd) && this.write.equals(((DataStoreUtilsd) obj).write);
    }

    public final String toString() {
        return "Week(days=" + this.write + ")";
    }
}
