package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetCalculatorcp extends accessgetDirectionDownRightcp {
    public final accessgetDirectionDowncp IconCompatParcelizer;
    public final accessgetDeletecp read;

    public final int hashCode() {
        accessgetDeletecp accessgetdeletecp = this.read;
        int iHashCode = accessgetdeletecp == null ? 0 : accessgetdeletecp.hashCode();
        accessgetDirectionDowncp accessgetdirectiondowncp = this.IconCompatParcelizer;
        return ((iHashCode ^ 1000003) * 1000003) ^ (accessgetdirectiondowncp != null ? accessgetdirectiondowncp.hashCode() : 0);
    }

    public accessgetCalculatorcp(accessgetDeletecp accessgetdeletecp, accessgetDirectionDowncp accessgetdirectiondowncp) {
        this.read = accessgetdeletecp;
        this.IconCompatParcelizer = accessgetdirectiondowncp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetDirectionDownRightcp)) {
            return false;
        }
        accessgetDirectionDownRightcp accessgetdirectiondownrightcp = (accessgetDirectionDownRightcp) obj;
        accessgetDeletecp accessgetdeletecp = this.read;
        if (accessgetdeletecp == null) {
            if (((accessgetCalculatorcp) accessgetdirectiondownrightcp).read != null) {
                return false;
            }
        } else if (!accessgetdeletecp.equals(((accessgetCalculatorcp) accessgetdirectiondownrightcp).read)) {
            return false;
        }
        accessgetDirectionDowncp accessgetdirectiondowncp = this.IconCompatParcelizer;
        if (accessgetdirectiondowncp == null) {
            if (((accessgetCalculatorcp) accessgetdirectiondownrightcp).IconCompatParcelizer != null) {
                return false;
            }
        } else if (!accessgetdirectiondowncp.equals(((accessgetCalculatorcp) accessgetdirectiondownrightcp).IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.read + ", mobileSubtype=" + this.IconCompatParcelizer + "}";
    }
}
