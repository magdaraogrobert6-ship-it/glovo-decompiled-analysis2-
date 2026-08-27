package o;

import android.util.Range;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedEnterExitMeasurePolicy {
    public static final accessgetGreencp serializer;
    public static final Range write = new Range(0, Integer.MAX_VALUE);
    public final int IconCompatParcelizer;
    public final accessgetGreencp RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final Range read;

    public static AnimatedEnterExitImpl RemoteActionCompatParcelizer() {
        AnimatedEnterExitImpl animatedEnterExitImpl = new AnimatedEnterExitImpl();
        accessgetGreencp accessgetgreencp = serializer;
        if (accessgetgreencp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null qualitySelector");
            return null;
        }
        animatedEnterExitImpl.serializer = accessgetgreencp;
        animatedEnterExitImpl.read = 0;
        Range range = write;
        if (range == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null bitrate");
            return null;
        }
        animatedEnterExitImpl.IconCompatParcelizer = range;
        animatedEnterExitImpl.write = -1;
        return animatedEnterExitImpl;
    }

    public final int hashCode() {
        int iHashCode = this.RatingCompat.hashCode();
        int i = this.RemoteActionCompatParcelizer;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.read.hashCode()) * 1000003) ^ this.IconCompatParcelizer;
    }

    public AnimatedEnterExitMeasurePolicy(accessgetGreencp accessgetgreencp, int i, Range range, int i2) {
        this.RatingCompat = accessgetgreencp;
        this.RemoteActionCompatParcelizer = i;
        this.read = range;
        this.IconCompatParcelizer = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnimatedEnterExitMeasurePolicy)) {
            return false;
        }
        AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) obj;
        return this.RatingCompat.equals(animatedEnterExitMeasurePolicy.RatingCompat) && this.RemoteActionCompatParcelizer == animatedEnterExitMeasurePolicy.RemoteActionCompatParcelizer && this.read.equals(animatedEnterExitMeasurePolicy.read) && this.IconCompatParcelizer == animatedEnterExitMeasurePolicy.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSpec{qualitySelector=");
        sb.append(this.RatingCompat);
        sb.append(", encodeFrameRate=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", bitrate=");
        sb.append(this.read);
        sb.append(", aspectRatio=");
        return af$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, "}", sb);
    }

    static {
        AnimatedVisibilityKt animatedVisibilityKt = AnimatedVisibilityKt.read;
        List<AnimatedVisibilityKt> listAsList = Arrays.asList(animatedVisibilityKt, AnimatedVisibilityKt.RemoteActionCompatParcelizer, AnimatedVisibilityKt.MediaBrowserCompatMediaItem);
        minIntrinsicHeight minintrinsicheight = minIntrinsicHeight.serializer;
        minIntrinsicHeight minintrinsicheight2 = new minIntrinsicHeight(animatedVisibilityKt, 1);
        coil3.util.UtilsKt.IconCompatParcelizer(listAsList, "qualities cannot be null");
        coil3.util.UtilsKt.IconCompatParcelizer("qualities cannot be empty", !listAsList.isEmpty());
        for (AnimatedVisibilityKt animatedVisibilityKt2 : listAsList) {
            coil3.util.UtilsKt.IconCompatParcelizer("qualities contain invalid quality: " + animatedVisibilityKt2, AnimatedVisibilityKt.MediaMetadataCompat.contains(animatedVisibilityKt2));
        }
        serializer = new accessgetGreencp(listAsList, minintrinsicheight2);
    }
}
