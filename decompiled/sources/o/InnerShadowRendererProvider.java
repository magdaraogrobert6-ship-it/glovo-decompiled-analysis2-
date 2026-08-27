package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerShadowRendererProvider implements DropShadowRendererProvider {
    public final LinkedHashMap IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String write = "appLog";

    @Override // o.DropShadowRendererProvider
    public final Map read() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer.hashCode() * 31, 31, this.write);
    }

    public InnerShadowRendererProvider(String str, LinkedHashMap linkedHashMap) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerShadowRendererProvider)) {
            return false;
        }
        InnerShadowRendererProvider innerShadowRendererProvider = (InnerShadowRendererProvider) obj;
        return this.RemoteActionCompatParcelizer.equals(innerShadowRendererProvider.RemoteActionCompatParcelizer) && this.write.equals(innerShadowRendererProvider.write) && this.IconCompatParcelizer.equals(innerShadowRendererProvider.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("AppStartToInteractiveEvent(name=", this.RemoteActionCompatParcelizer, ", perseusDataSource=", this.write, ", params=");
        sbM.append(this.IconCompatParcelizer);
        sbM.append(")");
        return sbM.toString();
    }
}
