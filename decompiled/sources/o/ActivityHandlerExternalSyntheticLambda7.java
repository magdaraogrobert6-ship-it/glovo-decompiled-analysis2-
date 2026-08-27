package o;

import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandlerExternalSyntheticLambda7 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ OtpVerificationTimerDataStore$get$$inlined$map$1.AnonymousClass2 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHandlerExternalSyntheticLambda7(OtpVerificationTimerDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.serializer.emit(null, this);
            throw null;
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i3 = RemoteActionCompatParcelizer + 43;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
