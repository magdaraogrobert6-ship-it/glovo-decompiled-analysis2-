package o;

import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange.TransferChangeFragment;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    public /* synthetic */ r8lambdaFy5cFs23n4jmTZ3pAoKFIBBQQ(androidx.fragment.app.DialogFragment dialogFragment, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.serializer = i;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.write;
        Object obj2 = null;
        switch (i2) {
            case 0:
                return new Object[((Flow[]) obj).length];
            case 1:
                TransferChangeFragment transferChangeFragment = (TransferChangeFragment) obj;
                Bundle arguments = transferChangeFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Fragment ", transferChangeFragment, " has null arguments");
                return null;
            case 2:
                return new AndroidPaint_androidKt(1, (RetryWithDelay$$ExternalSyntheticLambda0) obj);
            case 3:
                return new AndroidPaint_androidKt(1, (RetryWithDelay$$ExternalSyntheticLambda0) obj);
            case 4:
                return new AndroidPaint_androidKt(1, (RetryWithDelay$$ExternalSyntheticLambda0) obj);
            case 5:
                return new AndroidPaint_androidKt(1, (RetryWithDelay$$ExternalSyntheticLambda0) obj);
            case 6:
                return new AndroidPaint_androidKt(1, (RetryWithDelay$$ExternalSyntheticLambda0) obj);
            case 7:
                CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) obj;
                if (!(!(cancellableContinuationImpl.RemoteActionCompatParcelizer() instanceof onTouchEnded))) {
                    int i3 = RemoteActionCompatParcelizer + 97;
                    read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    cancellableContinuationImpl.resumeWith(createfromparcel);
                }
                return createfromparcel;
            case 8:
                OrderDetailsFragment orderDetailsFragment = (OrderDetailsFragment) obj;
                Bundle arguments2 = orderDetailsFragment.getArguments();
                if (arguments2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Fragment ", orderDetailsFragment, " has null arguments");
                    return null;
                }
                int i5 = RemoteActionCompatParcelizer + 103;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return arguments2;
                }
                obj2.hashCode();
                throw null;
            case 9:
                ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj).invoke();
                return createfromparcel;
            default:
                androidx.compose.foundation.ScrollState scrollState = (androidx.compose.foundation.ScrollState) obj;
                return Boolean.valueOf(scrollState.serializer() != scrollState.read());
        }
    }
}
