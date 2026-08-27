package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetDummyViewConfigurationcp extends exceptionMessageForParentingOrOwnership {
    public final int IconCompatParcelizer;
    public final calculateSemanticsConfiguration RemoteActionCompatParcelizer;
    public final calculateSemanticsConfiguration serializer;
    public final int write;

    public final int RatingCompat() {
        calculateSemanticsConfiguration calculatesemanticsconfiguration = calculateSemanticsConfiguration.read;
        int i = this.write;
        calculateSemanticsConfiguration calculatesemanticsconfiguration2 = this.serializer;
        if (calculatesemanticsconfiguration2 == calculatesemanticsconfiguration) {
            return i;
        }
        if (calculatesemanticsconfiguration2 != calculateSemanticsConfiguration.MediaSessionCompatResultReceiverWrapper && calculatesemanticsconfiguration2 != calculateSemanticsConfiguration.IconCompatParcelizer && calculatesemanticsconfiguration2 != calculateSemanticsConfiguration.RemoteActionCompatParcelizer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public accessgetDummyViewConfigurationcp(int i, int i2, calculateSemanticsConfiguration calculatesemanticsconfiguration, calculateSemanticsConfiguration calculatesemanticsconfiguration2) {
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.serializer = calculatesemanticsconfiguration;
        this.RemoteActionCompatParcelizer = calculatesemanticsconfiguration2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.serializer);
        sb.append(", hashType: ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", ");
        sb.append(this.write);
        sb.append("-byte tags, and ");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "-byte key)", sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof accessgetDummyViewConfigurationcp)) {
            return false;
        }
        accessgetDummyViewConfigurationcp accessgetdummyviewconfigurationcp = (accessgetDummyViewConfigurationcp) obj;
        return accessgetdummyviewconfigurationcp.IconCompatParcelizer == this.IconCompatParcelizer && accessgetdummyviewconfigurationcp.RatingCompat() == RatingCompat() && accessgetdummyviewconfigurationcp.serializer == this.serializer && accessgetdummyviewconfigurationcp.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int i2 = this.write;
        return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), this.serializer, this.RemoteActionCompatParcelizer);
    }
}
