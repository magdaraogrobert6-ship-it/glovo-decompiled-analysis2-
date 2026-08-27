package o;

import com.google.firebase.perf.session.gauges.MemoryGaugeCollector;
import com.google.firebase.perf.v1.AndroidMemoryReading;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8 implements Runnable {
    public final /* synthetic */ com.google.firebase.perf.util.Timer IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ MemoryGaugeCollector read;

    public /* synthetic */ moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(MemoryGaugeCollector memoryGaugeCollector, com.google.firebase.perf.util.Timer timer, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = memoryGaugeCollector;
        this.IconCompatParcelizer = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        com.google.firebase.perf.util.Timer timer = this.IconCompatParcelizer;
        MemoryGaugeCollector memoryGaugeCollector = this.read;
        if (i != 0) {
            AndroidMemoryReading androidMemoryReadingWrite = memoryGaugeCollector.write(timer);
            if (androidMemoryReadingWrite != null) {
                memoryGaugeCollector.read.add(androidMemoryReadingWrite);
                return;
            }
            return;
        }
        AndroidMemoryReading androidMemoryReadingWrite2 = memoryGaugeCollector.write(timer);
        if (androidMemoryReadingWrite2 != null) {
            memoryGaugeCollector.read.add(androidMemoryReadingWrite2);
        }
    }
}
