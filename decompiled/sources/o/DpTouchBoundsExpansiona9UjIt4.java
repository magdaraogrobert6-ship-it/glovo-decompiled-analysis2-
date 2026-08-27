package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class DpTouchBoundsExpansiona9UjIt4 {
    public final AccessibilityIterators IconCompatParcelizer;
    public final String read;

    public final int hashCode() {
        return ((this.read.hashCode() ^ 1000003) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DpTouchBoundsExpansiona9UjIt4)) {
            return false;
        }
        DpTouchBoundsExpansiona9UjIt4 dpTouchBoundsExpansiona9UjIt4 = (DpTouchBoundsExpansiona9UjIt4) obj;
        return this.read.equals(dpTouchBoundsExpansiona9UjIt4.read) && this.IconCompatParcelizer.equals(dpTouchBoundsExpansiona9UjIt4.IconCompatParcelizer);
    }

    public final String toString() {
        return "InstallationIdResult{installationId=" + this.read + ", installationTokenResult=" + this.IconCompatParcelizer + "}";
    }

    public DpTouchBoundsExpansiona9UjIt4(String str, AccessibilityIterators accessibilityIterators) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null installationId");
            throw null;
        }
        this.read = str;
        if (accessibilityIterators != null) {
            this.IconCompatParcelizer = accessibilityIterators;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null installationTokenResult");
            throw null;
        }
    }
}
