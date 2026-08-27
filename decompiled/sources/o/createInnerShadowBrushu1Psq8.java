package o;

import bo.app.af$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class createInnerShadowBrushu1Psq8 implements DropShadowRendererProvider {
    public final LinkedHashMap IconCompatParcelizer;
    public final String serializer = "appLog";

    @Override // o.DropShadowRendererProvider
    public final Map read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createInnerShadowBrushu1Psq8)) {
            return false;
        }
        createInnerShadowBrushu1Psq8 createinnershadowbrushu1psq8 = (createInnerShadowBrushu1Psq8) obj;
        return this.serializer.equals(createinnershadowbrushu1psq8.serializer) && this.IconCompatParcelizer.equals(createinnershadowbrushu1psq8.IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + af$$ExternalSyntheticOutline0.m(-335477945, 31, this.serializer);
    }

    public final String toString() {
        return "ScreenEvent(name=screen_metrics.triggered, perseusDataSource=" + this.serializer + ", params=" + this.IconCompatParcelizer + ")";
    }

    public createInnerShadowBrushu1Psq8(LinkedHashMap linkedHashMap) {
        this.IconCompatParcelizer = linkedHashMap;
    }
}
