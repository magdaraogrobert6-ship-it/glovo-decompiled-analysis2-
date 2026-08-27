package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class remeasureSync extends exceptionMessageForParentingOrOwnership {
    public final int IconCompatParcelizer;
    public final calculateSemanticsConfiguration RemoteActionCompatParcelizer;
    public final int serializer;

    public final int MediaDescriptionCompat() {
        calculateSemanticsConfiguration calculatesemanticsconfiguration = calculateSemanticsConfiguration.MediaBrowserCompatMediaItem;
        int i = this.serializer;
        calculateSemanticsConfiguration calculatesemanticsconfiguration2 = this.RemoteActionCompatParcelizer;
        if (calculatesemanticsconfiguration2 == calculatesemanticsconfiguration) {
            return i;
        }
        if (calculatesemanticsconfiguration2 != calculateSemanticsConfiguration.PlaybackStateCompat && calculatesemanticsconfiguration2 != calculateSemanticsConfiguration.write && calculatesemanticsconfiguration2 != calculateSemanticsConfiguration.serializer) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public remeasureSync(int i, int i2, calculateSemanticsConfiguration calculatesemanticsconfiguration) {
        this.IconCompatParcelizer = i;
        this.serializer = i2;
        this.RemoteActionCompatParcelizer = calculatesemanticsconfiguration;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", ");
        sb.append(this.serializer);
        sb.append("-byte tags, and ");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "-byte key)", sb);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof remeasureSync)) {
            return false;
        }
        remeasureSync remeasuresync = (remeasureSync) obj;
        return remeasuresync.IconCompatParcelizer == this.IconCompatParcelizer && remeasuresync.MediaDescriptionCompat() == MediaDescriptionCompat() && remeasuresync.RemoteActionCompatParcelizer == this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        int i2 = this.serializer;
        return Objects.hash(Integer.valueOf(i), Integer.valueOf(i2), this.RemoteActionCompatParcelizer);
    }
}
