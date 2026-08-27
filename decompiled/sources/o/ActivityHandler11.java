package o;

import com.roadrunner.rider.recruitment.accountcreation.otp_verification.timer.OtpVerificationTimerDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityHandler11 extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ OtpVerificationTimerDataStore$get$$inlined$map$1.AnonymousClass2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityHandler11(OtpVerificationTimerDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        int i4 = read + 51;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return objEmit;
    }
}
