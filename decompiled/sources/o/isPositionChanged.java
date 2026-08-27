package o;

import com.google.firebase.perf.session.gauges.CpuGaugeCollector;
import com.google.firebase.perf.v1.CpuMetricReading;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class isPositionChanged implements Runnable {
    public final /* synthetic */ CpuGaugeCollector IconCompatParcelizer;
    public final /* synthetic */ com.google.firebase.perf.util.Timer RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ isPositionChanged(CpuGaugeCollector cpuGaugeCollector, com.google.firebase.perf.util.Timer timer, int i) {
        this.write = i;
        this.IconCompatParcelizer = cpuGaugeCollector;
        this.RemoteActionCompatParcelizer = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        com.google.firebase.perf.util.Timer timer = this.RemoteActionCompatParcelizer;
        CpuGaugeCollector cpuGaugeCollector = this.IconCompatParcelizer;
        if (i != 0) {
            CpuMetricReading cpuMetricReadingSerializer = cpuGaugeCollector.serializer(timer);
            if (cpuMetricReadingSerializer != null) {
                cpuGaugeCollector.RatingCompat.add(cpuMetricReadingSerializer);
                return;
            }
            return;
        }
        CpuMetricReading cpuMetricReadingSerializer2 = cpuGaugeCollector.serializer(timer);
        if (cpuMetricReadingSerializer2 != null) {
            cpuGaugeCollector.RatingCompat.add(cpuMetricReadingSerializer2);
        }
    }
}
