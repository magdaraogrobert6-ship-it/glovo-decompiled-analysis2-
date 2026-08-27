package o;

import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getLastMatrixRecalculationAnimationTimeui extends CompositionLocalsKtLocalHapticFeedback1 implements getPrimaryDirectionalMotionAxisOverridedqNNBbUui {
    @Override // o.getPrimaryDirectionalMotionAxisOverridedqNNBbUui
    public final GaugeMetric getGaugeMetric() {
        return ((PerfMetric) this.RemoteActionCompatParcelizer).getGaugeMetric();
    }

    @Override // o.getPrimaryDirectionalMotionAxisOverridedqNNBbUui
    public final NetworkRequestMetric getNetworkRequestMetric() {
        return ((PerfMetric) this.RemoteActionCompatParcelizer).getNetworkRequestMetric();
    }

    @Override // o.getPrimaryDirectionalMotionAxisOverridedqNNBbUui
    public final TraceMetric getTraceMetric() {
        return ((PerfMetric) this.RemoteActionCompatParcelizer).getTraceMetric();
    }

    @Override // o.getPrimaryDirectionalMotionAxisOverridedqNNBbUui
    public final boolean hasGaugeMetric() {
        return ((PerfMetric) this.RemoteActionCompatParcelizer).hasGaugeMetric();
    }

    @Override // o.getPrimaryDirectionalMotionAxisOverridedqNNBbUui
    public final boolean hasNetworkRequestMetric() {
        return ((PerfMetric) this.RemoteActionCompatParcelizer).hasNetworkRequestMetric();
    }

    @Override // o.getPrimaryDirectionalMotionAxisOverridedqNNBbUui
    public final boolean hasTraceMetric() {
        return ((PerfMetric) this.RemoteActionCompatParcelizer).hasTraceMetric();
    }

    public getLastMatrixRecalculationAnimationTimeui(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
