package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class toCancelMotionEventScoped4ec7I {
    public final String RemoteActionCompatParcelizer;
    public final int write;

    public final int hashCode() {
        return ((((this.RemoteActionCompatParcelizer.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.write;
    }

    public toCancelMotionEventScoped4ec7I(String str, int i) {
        this.RemoteActionCompatParcelizer = str;
        this.write = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof toCancelMotionEventScoped4ec7I)) {
            return false;
        }
        toCancelMotionEventScoped4ec7I tocancelmotioneventscoped4ec7i = (toCancelMotionEventScoped4ec7I) obj;
        return this.RemoteActionCompatParcelizer.equals(tocancelmotioneventscoped4ec7i.RemoteActionCompatParcelizer) && this.write == tocancelmotioneventscoped4ec7i.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", enableFirelog=true, firelogEventType=");
        return af$$ExternalSyntheticOutline0.m(this.write, "}", sb);
    }
}
