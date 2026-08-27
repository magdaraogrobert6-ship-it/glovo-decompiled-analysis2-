package o;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class removeConnectionToComposeViewContext {
    public final HashSet serializer;

    public final Set IconCompatParcelizer() {
        return this.serializer;
    }

    public final int hashCode() {
        return this.serializer.hashCode() ^ 1000003;
    }

    public removeConnectionToComposeViewContext(HashSet hashSet) {
        this.serializer = hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof removeConnectionToComposeViewContext) {
            return this.serializer.equals(((removeConnectionToComposeViewContext) obj).serializer);
        }
        return false;
    }

    public final String toString() {
        return "ConfigUpdate{updatedKeys=" + this.serializer + "}";
    }
}
