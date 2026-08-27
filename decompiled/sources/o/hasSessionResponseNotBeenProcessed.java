package o;

import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantTokenExpiryUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class hasSessionResponseNotBeenProcessed extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ GetApplicantTokenExpiryUseCaseImpl RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hasSessionResponseNotBeenProcessed(GetApplicantTokenExpiryUseCaseImpl getApplicantTokenExpiryUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getApplicantTokenExpiryUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        int i = 2 % 2;
        int i2 = write + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objInvoke = this.RemoteActionCompatParcelizer.invoke(this);
            int i3 = 81 / 0;
        } else {
            this.IconCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objInvoke = this.RemoteActionCompatParcelizer.invoke(this);
        }
        int i4 = read + 33;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return objInvoke;
    }
}
