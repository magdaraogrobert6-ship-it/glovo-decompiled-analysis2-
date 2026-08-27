package o;

import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getExtras extends TelephonyManager$CellInfoCallback {
    public final /* synthetic */ ContentCaptureSessionCompatApi29Impl write;

    public getExtras(ContentCaptureSessionCompatApi29Impl contentCaptureSessionCompatApi29Impl) {
        this.write = contentCaptureSessionCompatApi29Impl;
    }

    public final void onCellInfo(List list) {
        this.write.RemoteActionCompatParcelizer(list);
    }
}
