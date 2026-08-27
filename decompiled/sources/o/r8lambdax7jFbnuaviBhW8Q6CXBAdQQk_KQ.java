package o;

import com.sentiance.sdk.eventtimeline.transportclassification.ClassifiedTransportMode;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ {
    private final ClassifiedTransportMode IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final long read;
    private final EnumMap write;

    public final EnumMap IconCompatParcelizer() {
        return this.write;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final ClassifiedTransportMode write() {
        return this.IconCompatParcelizer;
    }

    public r8lambdax7jFbnuaviBhW8Q6CXBAdQQk_KQ(clean cleanVar) {
        this.RemoteActionCompatParcelizer = cleanVar.write;
        this.read = cleanVar.IconCompatParcelizer;
        this.IconCompatParcelizer = cleanVar.serializer;
        this.write = cleanVar.read;
    }

    public final String toString() {
        return "TransportClassification{mStartTimeMs=" + this.RemoteActionCompatParcelizer + ", mEndTimeMs=" + this.read + ", mProbabilities=" + this.write + ", mPredictedTransportMode=" + this.IconCompatParcelizer + '}';
    }
}
