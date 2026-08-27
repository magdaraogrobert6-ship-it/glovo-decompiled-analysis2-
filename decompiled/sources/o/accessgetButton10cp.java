package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButton10cp {
    public final String serializer;

    public final int hashCode() {
        return this.serializer.hashCode() ^ 1000003;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetButton10cp)) {
            return false;
        }
        return this.serializer.equals(((accessgetButton10cp) obj).serializer);
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Encoding{name=\""), this.serializer, "\"}");
    }

    public accessgetButton10cp(String str) {
        if (str != null) {
            this.serializer = str;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("name is null");
            throw null;
        }
    }
}
