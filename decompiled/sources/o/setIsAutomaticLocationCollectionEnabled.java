package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlinx.serialization.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class setIsAutomaticLocationCollectionEnabled {
    public static final setIsInAppMessageAccessibilityExclusiveModeEnabled Companion = new setIsInAppMessageAccessibilityExclusiveModeEnabled();
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;

    public final int hashCode() {
        return Double.hashCode(this.d) + r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.c, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.b, Double.hashCode(this.a) * 31, 31), 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIsAutomaticLocationCollectionEnabled)) {
            return false;
        }
        setIsAutomaticLocationCollectionEnabled setisautomaticlocationcollectionenabled = (setIsAutomaticLocationCollectionEnabled) obj;
        return Double.compare(this.a, setisautomaticlocationcollectionenabled.a) == 0 && Double.compare(this.b, setisautomaticlocationcollectionenabled.b) == 0 && Double.compare(this.c, setisautomaticlocationcollectionenabled.c) == 0 && Double.compare(this.d, setisautomaticlocationcollectionenabled.d) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoundingBox(minLat=");
        sb.append(this.a);
        sb.append(", minLon=");
        sb.append(this.b);
        sb.append(", maxLat=");
        sb.append(this.c);
        sb.append(", maxLon=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.d, ')');
    }

    public setIsAutomaticLocationCollectionEnabled(int i, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (15 == (i & 15)) {
            double d9 = d;
            this.a = d9;
            this.b = d2;
            this.c = d3;
            this.d = d4;
            if ((i & 16) == 0) {
                this.e = d2;
            } else {
                this.e = d5;
            }
            this.f = (i & 32) != 0 ? d6 : d9;
            if ((i & 64) == 0) {
                this.g = d4;
            } else {
                this.g = d7;
            }
            if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
                this.h = d3;
                return;
            } else {
                this.h = d8;
                return;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 15, setInAppMessageWebViewClientMaxOnPageFinishedWaitMsandroid_sdk_base_release.RemoteActionCompatParcelizer);
        throw null;
    }

    public setIsAutomaticLocationCollectionEnabled(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d2;
        this.f = d;
        this.g = d4;
        this.h = d3;
    }
}
