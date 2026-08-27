package o;

import com.google.firebase.perf.v1.TraceMetric;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class onCheckIsTextEditor extends CompositionLocalsKtLocalHapticFeedback1 implements onTouchModeChanged {
    public final void RemoteActionCompatParcelizer(TraceMetric traceMetric) {
        RemoteActionCompatParcelizer();
        ((TraceMetric) this.RemoteActionCompatParcelizer).addSubtraces(traceMetric);
    }

    public final void read(long j) {
        RemoteActionCompatParcelizer();
        ((TraceMetric) this.RemoteActionCompatParcelizer).setClientStartTimeUs(j);
    }

    public final void read(String str) {
        RemoteActionCompatParcelizer();
        ((TraceMetric) this.RemoteActionCompatParcelizer).setName(str);
    }

    public final void write(long j) {
        RemoteActionCompatParcelizer();
        ((TraceMetric) this.RemoteActionCompatParcelizer).setDurationUs(j);
    }

    public final void write(long j, String str) {
        str.getClass();
        RemoteActionCompatParcelizer();
        ((TraceMetric) this.RemoteActionCompatParcelizer).getMutableCountersMap().put(str, Long.valueOf(j));
    }

    public onCheckIsTextEditor(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
