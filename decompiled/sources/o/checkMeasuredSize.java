package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class checkMeasuredSize {
    public final String IconCompatParcelizer;
    public final String read;
    public final String write;

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        String str = this.IconCompatParcelizer;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        return ((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof checkMeasuredSize)) {
            return false;
        }
        checkMeasuredSize checkmeasuredsize = (checkMeasuredSize) obj;
        if (!this.write.equals(checkmeasuredsize.write)) {
            return false;
        }
        String str = checkmeasuredsize.IconCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = checkmeasuredsize.read;
        String str4 = this.read;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.write);
        sb.append(", firebaseInstallationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", firebaseAuthenticationToken=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, "}");
    }

    public checkMeasuredSize(String str, String str2, String str3) {
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null crashlyticsInstallId");
            throw null;
        }
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }
}
