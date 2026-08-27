package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class nowInSecondsPrecise {
    public final ArrayList IconCompatParcelizer;

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public nowInSecondsPrecise(ArrayList arrayList) {
        this.IconCompatParcelizer = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nowInSecondsPrecise) && this.IconCompatParcelizer.equals(((nowInSecondsPrecise) obj).IconCompatParcelizer);
    }

    public final String toString() {
        return "SummationViewEntity(summationItemViewEntities=" + this.IconCompatParcelizer + ", shouldShowHorizontalTileList=true)";
    }
}
