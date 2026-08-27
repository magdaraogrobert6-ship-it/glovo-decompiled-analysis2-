package o;

import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetRemainingOtpVerificationTimerIfRunning;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandlerExternalSyntheticLambda8 implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int serializer = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final newTransaction write;

    public /* synthetic */ ActivityHandlerExternalSyntheticLambda8(newTransaction newtransaction, setPresentationView setpresentationview, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = newtransaction;
        this.IconCompatParcelizer = setpresentationview;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.IconCompatParcelizer;
        newTransaction newtransaction = this.write;
        if (i3 == 0) {
            return new GetRemainingOtpVerificationTimerIfRunning((com.airbnb.lottie.parser.DropShadowEffect) newtransaction.write(), (Clock) mergejsonobjects.write(), 0);
        }
        GetRemainingOtpVerificationTimerIfRunning getRemainingOtpVerificationTimerIfRunning = new GetRemainingOtpVerificationTimerIfRunning((com.airbnb.lottie.parser.DropShadowEffect) newtransaction.write(), (Clock) mergejsonobjects.write(), 1);
        int i4 = serializer + 35;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return getRemainingOtpVerificationTimerIfRunning;
        }
        throw null;
    }
}
