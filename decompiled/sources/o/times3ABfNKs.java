package o;

import android.os.Bundle;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class times3ABfNKs implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ CustomerSignatureFragment RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ times3ABfNKs(CustomerSignatureFragment customerSignatureFragment, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = customerSignatureFragment;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 33;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        CustomerSignatureFragment customerSignatureFragment = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            Bundle arguments = customerSignatureFragment.getArguments();
            if (arguments == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Fragment ", customerSignatureFragment, " has null arguments");
                return null;
            }
            int i5 = write + 51;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return arguments;
        }
        if (i4 != 1) {
            Bundle arguments2 = customerSignatureFragment.getArguments();
            if (arguments2 != null) {
                return arguments2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Fragment ", customerSignatureFragment, " has null arguments");
            return null;
        }
        Bundle arguments3 = customerSignatureFragment.getArguments();
        if (arguments3 != null) {
            return arguments3;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Fragment ", customerSignatureFragment, " has null arguments");
        return null;
    }
}
