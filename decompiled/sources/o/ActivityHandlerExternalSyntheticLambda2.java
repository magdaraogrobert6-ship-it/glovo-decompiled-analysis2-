package o;

import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetRemainingOtpVerificationTimerIfRunning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandlerExternalSyntheticLambda2 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public final /* synthetic */ GetRemainingOtpVerificationTimerIfRunning IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHandlerExternalSyntheticLambda2(GetRemainingOtpVerificationTimerIfRunning getRemainingOtpVerificationTimerIfRunning, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = getRemainingOtpVerificationTimerIfRunning;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.IconCompatParcelizer.invoke(null, this);
        int i4 = write + 101;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
