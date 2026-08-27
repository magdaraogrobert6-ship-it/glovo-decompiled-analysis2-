package o;

import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;

/* JADX INFO: loaded from: classes2.dex */
public final class dispatchKeyEventPreIme extends CompositionLocalsKtLocalHapticFeedback1 {
    public final void IconCompatParcelizer(CpuMetricReading cpuMetricReading) {
        RemoteActionCompatParcelizer();
        ((GaugeMetric) this.RemoteActionCompatParcelizer).addCpuMetricReadings(cpuMetricReading);
    }

    public final void RemoteActionCompatParcelizer(AndroidMemoryReading androidMemoryReading) {
        RemoteActionCompatParcelizer();
        ((GaugeMetric) this.RemoteActionCompatParcelizer).addAndroidMemoryReadings(androidMemoryReading);
    }

    public final void serializer(String str) {
        RemoteActionCompatParcelizer();
        ((GaugeMetric) this.RemoteActionCompatParcelizer).setSessionId(str);
    }

    public final void write(GaugeMetadata gaugeMetadata) {
        RemoteActionCompatParcelizer();
        ((GaugeMetric) this.RemoteActionCompatParcelizer).setGaugeMetadata(gaugeMetadata);
    }

    public dispatchKeyEventPreIme() {
        super(GaugeMetric.DEFAULT_INSTANCE);
    }
}
