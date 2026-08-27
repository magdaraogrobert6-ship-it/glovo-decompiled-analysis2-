package o;

import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.GetOtpVerificationRequestId;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandlerExternalSyntheticLambda26 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetOtpVerificationRequestId serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHandlerExternalSyntheticLambda26(GetOtpVerificationRequestId getOtpVerificationRequestId, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getOtpVerificationRequestId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 75;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.serializer.invoke(this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        this.serializer.invoke(this);
        throw null;
    }
}
