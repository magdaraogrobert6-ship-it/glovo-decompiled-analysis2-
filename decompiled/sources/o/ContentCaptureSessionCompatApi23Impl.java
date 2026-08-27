package o;

import android.content.Context;
import android.os.Handler;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.logic.E5;
import com.huawei.location.nlp.scan.LW;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentCaptureSessionCompatApi23Impl extends LW implements ViewCompatShims {
    public boolean IconCompatParcelizer;
    public Object MediaMetadataCompat;
    public Handler RemoteActionCompatParcelizer;
    public boolean read;
    public final /* synthetic */ int serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentCaptureSessionCompatApi23Impl(i$d.a aVar, int i) {
        super(aVar);
        this.serializer = i;
    }

    @Override // o.ViewCompatShims
    public final void p_() {
        if (this.serializer != 0) {
            this.IconCompatParcelizer = true;
            if (((toAutofillIdCompat) this.RemoteActionCompatParcelizer).hasMessages(0)) {
                ((toAutofillIdCompat) this.RemoteActionCompatParcelizer).removeMessages(0);
            }
            ((toAutofillIdCompat) this.RemoteActionCompatParcelizer).sendEmptyMessage(0);
            return;
        }
        this.IconCompatParcelizer = true;
        if (((toAutofillIdCompat) this.RemoteActionCompatParcelizer).hasMessages(0)) {
            ((toAutofillIdCompat) this.RemoteActionCompatParcelizer).removeMessages(0);
        }
        ((toAutofillIdCompat) this.RemoteActionCompatParcelizer).sendEmptyMessage(0);
    }

    @Override // o.ViewCompatShims
    public final void read() {
        getContentCaptureSession getcontentcapturesession;
        if (this.serializer == 0) {
            if (((toAutofillIdCompat) this.RemoteActionCompatParcelizer).hasMessages(0)) {
                ((toAutofillIdCompat) this.RemoteActionCompatParcelizer).removeMessages(0);
            }
            this.IconCompatParcelizer = false;
            this.read = true;
            return;
        }
        if (((toAutofillIdCompat) this.RemoteActionCompatParcelizer).hasMessages(0)) {
            ((toAutofillIdCompat) this.RemoteActionCompatParcelizer).removeMessages(0);
        }
        this.IconCompatParcelizer = false;
        this.read = true;
        E5 e5 = (E5) this.write;
        Context context = (Context) e5.write;
        if (context == null || (getcontentcapturesession = (getContentCaptureSession) e5.serializer) == null) {
            return;
        }
        try {
            context.unregisterReceiver(getcontentcapturesession);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("WifiScanManager", "unregisterReceiver error");
        }
        e5.serializer = null;
    }

    @Override // o.ViewCompatShims
    public final void RemoteActionCompatParcelizer(long j) {
        if (this.serializer != 0) {
            this.RatingCompat = j;
        } else {
            this.RatingCompat = j;
        }
    }
}
