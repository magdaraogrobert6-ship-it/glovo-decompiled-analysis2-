package o;

import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class getPrettyPrintedStringlambda0 {
    public static final getPrettyPrintedStringlambda0 serializer = new getPrettyPrintedStringlambda0(new IdentityHashMap());
    public final IdentityHashMap read;

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.read.entrySet()) {
            iHashCode += Arrays.hashCode(new Object[]{entry.getKey(), entry.getValue()});
        }
        return iHashCode;
    }

    public final String toString() {
        return this.read.toString();
    }

    public getPrettyPrintedStringlambda0(IdentityHashMap identityHashMap) {
        this.read = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getPrettyPrintedStringlambda0.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap identityHashMap = ((getPrettyPrintedStringlambda0) obj).read;
        IdentityHashMap identityHashMap2 = this.read;
        if (identityHashMap2.size() != identityHashMap.size()) {
            return false;
        }
        for (Map.Entry entry : identityHashMap2.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey()) || !TuplesKt.RemoteActionCompatParcelizer(entry.getValue(), identityHashMap.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
