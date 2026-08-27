package o;

import com.roadrunner.login.presentation.otp.OtpViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class bbExternalSyntheticLambda1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ OtpViewModel RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbExternalSyntheticLambda1(OtpViewModel otpViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = otpViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            OtpViewModel.access$invokeForgotPassword(this.RemoteActionCompatParcelizer, null, this);
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$invokeForgotPassword = OtpViewModel.access$invokeForgotPassword(this.RemoteActionCompatParcelizer, null, this);
        int i3 = serializer + 17;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objAccess$invokeForgotPassword;
        }
        obj2.hashCode();
        throw null;
    }
}
