package o;

import androidx.camera.video.Recorder$3;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getTextOff implements Runnable {
    public final /* synthetic */ Recorder$3 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getTextOff(Recorder$3 recorder$3, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = recorder$3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        Recorder$3 recorder$3 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            ((AtomicInteger) recorder$3.RemoteActionCompatParcelizer).incrementAndGet();
            setInflatedId.IconCompatParcelizer(3, "VideoUsageControl");
            return;
        }
        int iDecrementAndGet = ((AtomicInteger) recorder$3.RemoteActionCompatParcelizer).decrementAndGet();
        if (iDecrementAndGet >= 0) {
            setInflatedId.IconCompatParcelizer(3, "VideoUsageControl");
            return;
        }
        setInflatedId.read("VideoUsageControl", "decrementUsage: mVideoUsage = " + iDecrementAndGet + ", which is less than 0!");
    }
}
