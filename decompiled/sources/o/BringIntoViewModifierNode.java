package o;

import android.location.GnssMeasurementsEvent;
import android.os.HandlerThread;
import com.huawei.location.sdm.Sdm;

/* JADX INFO: loaded from: classes2.dex */
public final class BringIntoViewModifierNode extends GnssMeasurementsEvent.Callback {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ BringIntoViewModifierNode(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // android.location.GnssMeasurementsEvent.Callback
    public final void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        HandlerThread handlerThread;
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i != 0) {
            onScrollCaptureEnd.write((onScrollCaptureEnd) obj, gnssMeasurementsEvent);
            return;
        }
        Sdm sdm = (Sdm) obj;
        if (System.currentTimeMillis() - sdm.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus < 900) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Sdm", "do nothing because MeasurementsEvent is too fast");
            return;
        }
        sdm.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = System.currentTimeMillis();
        if (sdm.RemoteActionCompatParcelizer == null || (handlerThread = sdm.MediaSessionCompatResultReceiverWrapper) == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = new HandlerThread("Sdm");
            sdm.MediaSessionCompatResultReceiverWrapper = handlerThread2;
            handlerThread2.start();
            sdm.RemoteActionCompatParcelizer = new ViewCompatShimsApi29Impl(sdm, sdm.MediaSessionCompatResultReceiverWrapper.getLooper());
        }
        sdm.RemoteActionCompatParcelizer.obtainMessage(3, gnssMeasurementsEvent).sendToTarget();
    }

    @Override // android.location.GnssMeasurementsEvent.Callback
    public final void onStatusChanged(int i) {
        if (this.IconCompatParcelizer != 0) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssMeasurementsProvider", "GnssMeasurementsEvent onStatusChanged :" + i);
            super.onStatusChanged(i);
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("Sdm", "GnssMeasurementsEvent onStatusChanged :" + i);
        super.onStatusChanged(i);
    }
}
