package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class LookaheadDelegateKt {
    public final File IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final ensureSubtreeLookaheadReplaced write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ this.RemoteActionCompatParcelizer.hashCode()) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public LookaheadDelegateKt(ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced, String str, File file) {
        this.write = ensuresubtreelookaheadreplaced;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sessionId");
            throw null;
        }
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LookaheadDelegateKt)) {
            return false;
        }
        LookaheadDelegateKt lookaheadDelegateKt = (LookaheadDelegateKt) obj;
        return this.write.equals(lookaheadDelegateKt.write) && this.RemoteActionCompatParcelizer.equals(lookaheadDelegateKt.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(lookaheadDelegateKt.IconCompatParcelizer);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.write + ", sessionId=" + this.RemoteActionCompatParcelizer + ", reportFile=" + this.IconCompatParcelizer + "}";
    }
}
