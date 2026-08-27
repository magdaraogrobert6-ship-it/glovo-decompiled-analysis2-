package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonSelectcp extends accessgetCutcp {
    public final accessgetChannelUpcp RemoteActionCompatParcelizer;

    public accessgetButtonSelectcp(accessgetButtonR1cp accessgetbuttonr1cp) {
        this.RemoteActionCompatParcelizer = accessgetbuttonr1cp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetCutcp)) {
            return false;
        }
        accessgetChannelUpcp accessgetchannelupcp = this.RemoteActionCompatParcelizer;
        accessgetButtonSelectcp accessgetbuttonselectcp = (accessgetButtonSelectcp) ((accessgetCutcp) obj);
        if (accessgetchannelupcp == null) {
            return accessgetbuttonselectcp.RemoteActionCompatParcelizer == null;
        }
        return accessgetchannelupcp.equals(accessgetbuttonselectcp.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.RemoteActionCompatParcelizer + "}";
    }

    public final int hashCode() {
        accessgetChannelUpcp accessgetchannelupcp = this.RemoteActionCompatParcelizer;
        return (accessgetchannelupcp == null ? 0 : accessgetchannelupcp.hashCode()) ^ 1000003;
    }
}
