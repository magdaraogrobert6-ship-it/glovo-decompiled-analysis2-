package o;

import android.content.Context;
import com.roadrunner.rider.state.polling.RiderStatusPollingWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class incrementSequenceForEvent implements getViewWidget {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final getPageSize RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 write;

    public incrementSequenceForEvent(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, getPageSize getpagesize) {
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.write = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.RemoteActionCompatParcelizer = getpagesize;
    }

    @Override // o.getViewWidget
    public final accesssetSpotShadowColor8_81llAjd read(Context context, androidx.work.WorkerParameters workerParameters) {
        int i = 2 % 2;
        context.getClass();
        RiderStatusPollingWorker riderStatusPollingWorker = new RiderStatusPollingWorker(context, workerParameters, this.read, this.write, this.RemoteActionCompatParcelizer);
        int i2 = serializer + 83;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return riderStatusPollingWorker;
    }
}
