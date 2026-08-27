package o;

import com.roadrunner.login.domain.forgotpassword.usecase.GetRemainingForgotPasswordTimerIfRunning;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class await implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int read;
    public final newTransaction write;

    public /* synthetic */ await(newTransaction newtransaction, int i) {
        this.read = i;
        this.write = newtransaction;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = serializer + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        newTransaction newtransaction = this.write;
        if (i4 != 0) {
            return new GetRemainingForgotPasswordTimerIfRunning((N$b) newtransaction.write(), 1);
        }
        GetRemainingForgotPasswordTimerIfRunning getRemainingForgotPasswordTimerIfRunning = new GetRemainingForgotPasswordTimerIfRunning((N$b) newtransaction.write(), 0);
        int i5 = RemoteActionCompatParcelizer + 57;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getRemainingForgotPasswordTimerIfRunning;
    }
}
