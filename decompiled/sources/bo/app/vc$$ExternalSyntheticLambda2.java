package bo.app;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.io.IOException;
import java.util.Map;
import o.InAppMessageSlideupView;
import o.createHorizontalAnimation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vc$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ vc$$ExternalSyntheticLambda2(long j, int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        boolean z;
        int i = this.$r8$classId;
        if (i == 0) {
            return vc.a((Map.Entry) this.f$0, this.f$1);
        }
        if (i == 1) {
            return AndroidTextPaint.setBrush_12SF9DM$lambda$0((Brush) this.f$0, this.f$1);
        }
        createHorizontalAnimation createhorizontalanimation = (createHorizontalAnimation) this.f$0;
        long j = this.f$1;
        synchronized (createhorizontalanimation) {
            long j2 = createhorizontalanimation.intervalPongsReceived;
            long j3 = createhorizontalanimation.intervalPingsSent;
            if (j2 < j3) {
                z = true;
            } else {
                createhorizontalanimation.intervalPingsSent = j3 + 1;
                z = false;
            }
        }
        if (z) {
            InAppMessageSlideupView inAppMessageSlideupView = InAppMessageSlideupView.PROTOCOL_ERROR;
            createhorizontalanimation.RemoteActionCompatParcelizer(inAppMessageSlideupView, inAppMessageSlideupView, null);
            j = -1;
        } else {
            try {
                createhorizontalanimation.writer.read(1, 0, false);
            } catch (IOException e) {
                InAppMessageSlideupView inAppMessageSlideupView2 = InAppMessageSlideupView.PROTOCOL_ERROR;
                createhorizontalanimation.RemoteActionCompatParcelizer(inAppMessageSlideupView2, inAppMessageSlideupView2, e);
            }
        }
        return Long.valueOf(j);
    }
}
