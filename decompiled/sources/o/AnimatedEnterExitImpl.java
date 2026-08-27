package o;

import android.util.Range;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedEnterExitImpl extends getVelocityFromNanos {
    public Range IconCompatParcelizer;
    public Integer read;
    public accessgetGreencp serializer;
    public Integer write;

    public final AnimatedEnterExitMeasurePolicy write() {
        String strConcat = this.serializer == null ? " qualitySelector" : "";
        if (this.read == null) {
            strConcat = strConcat.concat(" encodeFrameRate");
        }
        if (this.IconCompatParcelizer == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (this.write == null) {
            strConcat = strConcat.concat(" aspectRatio");
        }
        if (strConcat.isEmpty()) {
            return new AnimatedEnterExitMeasurePolicy(this.serializer, this.read.intValue(), this.IconCompatParcelizer, this.write.intValue());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }
}
