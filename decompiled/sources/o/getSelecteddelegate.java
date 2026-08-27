package o;

import com.roadrunner.auth.domain.IsRiderOnboardingEligibleImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getSelecteddelegate extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ IsRiderOnboardingEligibleImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSelecteddelegate(IsRiderOnboardingEligibleImpl isRiderOnboardingEligibleImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = isRiderOnboardingEligibleImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objInvoke;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            objInvoke = this.write.invoke(this);
            int i3 = 47 / 0;
        } else {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            objInvoke = this.write.invoke(this);
        }
        int i4 = IconCompatParcelizer + 27;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
