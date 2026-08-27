package o;

import android.util.Range;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class measure3p2s80s extends maxIntrinsicWidth {
    public Range IconCompatParcelizer;
    public Range RemoteActionCompatParcelizer;
    public Integer read;
    public Integer serializer;
    public Integer write;

    public final AnimatedContentMeasurePolicymeasure3 write() {
        String strConcat = this.RemoteActionCompatParcelizer == null ? " bitrate" : "";
        if (this.IconCompatParcelizer == null) {
            strConcat = strConcat.concat(" sampleRate");
        }
        if (strConcat.isEmpty()) {
            return new AnimatedContentMeasurePolicymeasure3(this.RemoteActionCompatParcelizer, this.read.intValue(), this.serializer.intValue(), this.IconCompatParcelizer, this.write.intValue());
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties:".concat(strConcat));
        return null;
    }
}
