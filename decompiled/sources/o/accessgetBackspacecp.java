package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetBackspacecp {
    public final accessgetBrowsercp IconCompatParcelizer;
    public final accessgetButton1cp read;
    public final Object serializer;

    public static accessgetBackspacecp RemoteActionCompatParcelizer(Object obj) {
        return new accessgetBackspacecp(obj, accessgetBrowsercp.DEFAULT, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetBackspacecp)) {
            return false;
        }
        accessgetBackspacecp accessgetbackspacecp = (accessgetBackspacecp) obj;
        if (!this.serializer.equals(accessgetbackspacecp.serializer) || !this.IconCompatParcelizer.equals(accessgetbackspacecp.IconCompatParcelizer)) {
            return false;
        }
        accessgetButton1cp accessgetbutton1cp = accessgetbackspacecp.read;
        accessgetButton1cp accessgetbutton1cp2 = this.read;
        if (accessgetbutton1cp2 == null) {
            if (accessgetbutton1cp != null) {
                return false;
            }
        } else if (!accessgetbutton1cp2.equals(accessgetbutton1cp)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.serializer + ", priority=" + this.IconCompatParcelizer + ", productData=" + this.read + ", eventContext=null}";
    }

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        accessgetButton1cp accessgetbutton1cp = this.read;
        return (((((iHashCode ^ (-721379959)) * 1000003) ^ iHashCode2) * 1000003) ^ (accessgetbutton1cp == null ? 0 : accessgetbutton1cp.hashCode())) * 1000003;
    }

    public accessgetBackspacecp(Object obj, accessgetBrowsercp accessgetbrowsercp, accessgetBrightnessUpcp accessgetbrightnessupcp) {
        if (obj == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null payload");
            throw null;
        }
        this.serializer = obj;
        if (accessgetbrowsercp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null priority");
            throw null;
        }
        this.IconCompatParcelizer = accessgetbrowsercp;
        this.read = accessgetbrightnessupcp;
    }
}
