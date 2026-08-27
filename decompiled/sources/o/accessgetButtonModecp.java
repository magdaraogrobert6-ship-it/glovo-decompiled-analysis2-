package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonModecp extends accessgetCallcp {
    public final accessgetContactscp IconCompatParcelizer;
    public final accessgetCutcp RemoteActionCompatParcelizer;

    public final int hashCode() {
        accessgetCutcp accessgetcutcp = this.RemoteActionCompatParcelizer;
        int iHashCode = accessgetcutcp == null ? 0 : accessgetcutcp.hashCode();
        accessgetContactscp accessgetcontactscp = this.IconCompatParcelizer;
        return ((iHashCode ^ 1000003) * 1000003) ^ (accessgetcontactscp != null ? accessgetcontactscp.hashCode() : 0);
    }

    public accessgetButtonModecp(accessgetButtonSelectcp accessgetbuttonselectcp, accessgetContactscp accessgetcontactscp) {
        this.RemoteActionCompatParcelizer = accessgetbuttonselectcp;
        this.IconCompatParcelizer = accessgetcontactscp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetCallcp)) {
            return false;
        }
        accessgetCallcp accessgetcallcp = (accessgetCallcp) obj;
        accessgetCutcp accessgetcutcp = this.RemoteActionCompatParcelizer;
        if (accessgetcutcp == null) {
            if (((accessgetButtonModecp) accessgetcallcp).RemoteActionCompatParcelizer != null) {
                return false;
            }
        } else if (!accessgetcutcp.equals(((accessgetButtonModecp) accessgetcallcp).RemoteActionCompatParcelizer)) {
            return false;
        }
        accessgetContactscp accessgetcontactscp = this.IconCompatParcelizer;
        if (accessgetcontactscp == null) {
            if (((accessgetButtonModecp) accessgetcallcp).IconCompatParcelizer != null) {
                return false;
            }
        } else if (!accessgetcontactscp.equals(((accessgetButtonModecp) accessgetcallcp).IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.RemoteActionCompatParcelizer + ", productIdOrigin=" + this.IconCompatParcelizer + "}";
    }
}
