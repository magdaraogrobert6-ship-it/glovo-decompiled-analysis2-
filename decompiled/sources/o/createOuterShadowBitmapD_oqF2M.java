package o;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class createOuterShadowBitmapD_oqF2M {
    public final boolean IconCompatParcelizer;
    public final List read;

    public final int hashCode() {
        return Boolean.hashCode(false) + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.IconCompatParcelizer), 31, false);
    }

    public createOuterShadowBitmapD_oqF2M(List list, boolean z) {
        this.read = list;
        this.IconCompatParcelizer = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createOuterShadowBitmapD_oqF2M)) {
            return false;
        }
        createOuterShadowBitmapD_oqF2M createoutershadowbitmapd_oqf2m = (createOuterShadowBitmapD_oqF2M) obj;
        return this.read.equals(createoutershadowbitmapd_oqf2m.read) && this.IconCompatParcelizer == createoutershadowbitmapd_oqf2m.IconCompatParcelizer;
    }

    public final String toString() {
        return "TrackingOption(trackingEvents=" + this.read + ", shouldTrackSM=" + this.IconCompatParcelizer + ", shouldTrackRCLT=false, shouldTrackSMU=false)";
    }
}
