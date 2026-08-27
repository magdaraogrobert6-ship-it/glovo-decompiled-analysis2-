package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getZSortedChildrenannotations {
    public static final getZSortedChildrenannotations read = new getZSortedChildrenannotations(Collections.unmodifiableMap(new HashMap()));
    public final Map serializer;

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public final String toString() {
        return this.serializer.toString();
    }

    public getZSortedChildrenannotations(Map map) {
        this.serializer = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getZSortedChildrenannotations) {
            return this.serializer.equals(((getZSortedChildrenannotations) obj).serializer);
        }
        return false;
    }
}
