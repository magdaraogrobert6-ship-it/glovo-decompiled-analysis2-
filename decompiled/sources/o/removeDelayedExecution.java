package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class removeDelayedExecution {
    public final String IconCompatParcelizer;
    public final String serializer;

    public final int hashCode() {
        return ((this.serializer.hashCode() ^ 1000003) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public removeDelayedExecution(String str, String str2) {
        this.serializer = str;
        if (str2 != null) {
            this.IconCompatParcelizer = str2;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof removeDelayedExecution)) {
            return false;
        }
        removeDelayedExecution removedelayedexecution = (removeDelayedExecution) obj;
        return this.serializer.equals(removedelayedexecution.serializer) && this.IconCompatParcelizer.equals(removedelayedexecution.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.serializer);
        sb.append(", version=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, "}");
    }
}
