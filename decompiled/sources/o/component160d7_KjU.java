package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class component160d7_KjU {
    public final List IconCompatParcelizer;

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public component160d7_KjU(List list) {
        this.IconCompatParcelizer = list;
    }

    public final String toString() {
        return onContentCardDismissed.IconCompatParcelizer(this.IconCompatParcelizer, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !component160d7_KjU.class.equals(obj.getClass())) {
            return false;
        }
        return this.IconCompatParcelizer.equals(((component160d7_KjU) obj).IconCompatParcelizer);
    }
}
