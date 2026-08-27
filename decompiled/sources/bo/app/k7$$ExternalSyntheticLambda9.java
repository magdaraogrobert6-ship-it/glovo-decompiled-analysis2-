package bo.app;

import com.braze.Braze;
import java.io.IOException;
import java.net.SocketTimeoutException;
import o.RequestBuilder;
import o.ViewUtilsExternalSyntheticLambda1;
import o.isUnreadIndicatorEnabled;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7$$ExternalSyntheticLambda9 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ k7$$ExternalSyntheticLambda9(long j, int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        isUnreadIndicatorEnabled isunreadindicatorenabled;
        int i = this.$r8$classId;
        if (i == 0) {
            return k7.c((k7) this.f$0, this.f$1);
        }
        if (i == 1) {
            return Braze.schedulePushDelivery$lambda$1((Braze) this.f$0, this.f$1);
        }
        ViewUtilsExternalSyntheticLambda1 viewUtilsExternalSyntheticLambda1 = (ViewUtilsExternalSyntheticLambda1) this.f$0;
        long j = this.f$1;
        synchronized (viewUtilsExternalSyntheticLambda1) {
            if (!viewUtilsExternalSyntheticLambda1.MediaSessionCompatQueueItem && (isunreadindicatorenabled = viewUtilsExternalSyntheticLambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) != null) {
                int i2 = viewUtilsExternalSyntheticLambda1.serializer ? viewUtilsExternalSyntheticLambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus : -1;
                viewUtilsExternalSyntheticLambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus++;
                viewUtilsExternalSyntheticLambda1.serializer = true;
                if (i2 != -1) {
                    StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                    sb.append(viewUtilsExternalSyntheticLambda1.MediaSessionCompatResultReceiverWrapper);
                    sb.append("ms (after ");
                    ViewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewUtilsExternalSyntheticLambda1, new SocketTimeoutException(af$$ExternalSyntheticOutline0.m(i2 - 1, " successful ping/pongs)", sb)), null, 2);
                } else {
                    try {
                        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
                        requestBuilder.getClass();
                        isunreadindicatorenabled.serializer(9, requestBuilder);
                    } catch (IOException e) {
                        ViewUtilsExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewUtilsExternalSyntheticLambda1, e, null, 2);
                    }
                }
            }
        }
        return Long.valueOf(j);
    }
}
