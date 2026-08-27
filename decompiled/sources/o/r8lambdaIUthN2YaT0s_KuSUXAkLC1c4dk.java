package o;

import com.sentiance.sdk.OnSdkStatusUpdateHandler;
import com.sentiance.sdk.SdkStatus;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaIUthN2YaT0s_KuSUXAkLC1c4dk implements Runnable {
    final /* synthetic */ SdkStatus RemoteActionCompatParcelizer;
    final /* synthetic */ OnSdkStatusUpdateHandler serializer;

    @Override // java.lang.Runnable
    public final void run() {
        this.serializer.onSdkStatusUpdate(this.RemoteActionCompatParcelizer);
    }

    public r8lambdaIUthN2YaT0s_KuSUXAkLC1c4dk(OnSdkStatusUpdateHandler onSdkStatusUpdateHandler, SdkStatus sdkStatus) {
        this.serializer = onSdkStatusUpdateHandler;
        this.RemoteActionCompatParcelizer = sdkStatus;
    }
}
