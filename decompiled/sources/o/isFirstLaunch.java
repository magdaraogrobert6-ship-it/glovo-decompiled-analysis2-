package o;

import com.roadrunner.rider.recruitment.applicant.domain.GetApplicantAccessTokenUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isFirstLaunch extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ GetApplicantAccessTokenUseCaseImpl IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isFirstLaunch(GetApplicantAccessTokenUseCaseImpl getApplicantAccessTokenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = getApplicantAccessTokenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 35;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.invoke(this);
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 46 / 0;
        return this.IconCompatParcelizer.invoke(this);
    }
}
