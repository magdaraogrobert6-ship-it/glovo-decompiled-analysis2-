package o;

import android.content.Context;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.lite.common.util.NetworkUtil;
import com.huawei.location.logic.E5;
import com.huawei.location.nlp.scan.LW;

/* JADX INFO: loaded from: classes2.dex */
public final class toAutofillId extends LW implements ViewCompatShims {
    public E5 IconCompatParcelizer;
    public AutofillIdCompat MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public AutofillIdCompat RemoteActionCompatParcelizer;
    public boolean read;
    public toContentCaptureSessionCompat serializer;
    public toAutofillIdCompat write;

    @Override // o.ViewCompatShims
    public final void p_() {
        this.read = true;
        if (this.write.hasMessages(0)) {
            this.write.removeMessages(0);
        }
        if (this.write.hasMessages(1)) {
            this.write.removeMessages(1);
        }
        if (this.write.hasMessages(-1)) {
            this.write.removeMessages(-1);
        }
        this.write.sendEmptyMessage(0);
        this.write.sendEmptyMessage(1);
        this.write.sendEmptyMessageDelayed(-1, ConstantsKt.DEFAULT_REQUEST_TIMEOUT);
    }

    public static boolean read(toAutofillId toautofillid) {
        if (!NetworkUtil.RemoteActionCompatParcelizer(placeAtf8xVGno.read()) || !onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read())) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "checkLocationAvailability false");
            return false;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "isNeed:" + toautofillid.read);
        return toautofillid.read;
    }

    @Override // o.ViewCompatShims
    public final void read() {
        getContentCaptureSession getcontentcapturesession;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "stopScan");
        if (this.write.hasMessages(0)) {
            this.write.removeMessages(0);
        }
        if (this.write.hasMessages(1)) {
            this.write.removeMessages(1);
        }
        if (this.write.hasMessages(-1)) {
            this.write.removeMessages(-1);
        }
        E5 e5 = this.IconCompatParcelizer;
        Context context = (Context) e5.write;
        if (context != null && (getcontentcapturesession = (getContentCaptureSession) e5.serializer) != null) {
            try {
                context.unregisterReceiver(getcontentcapturesession);
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.read("WifiScanManager", "unregisterReceiver error");
            }
            e5.serializer = null;
        }
        this.read = false;
        this.MediaMetadataCompat = true;
        this.MediaSessionCompatQueueItem = true;
    }

    @Override // o.ViewCompatShims
    public final void RemoteActionCompatParcelizer(long j) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("WifiAndCell", "setScanInterval:" + j);
        this.RatingCompat = j;
    }

    public toAutofillId(i$d.a aVar) {
        super(aVar);
    }
}
