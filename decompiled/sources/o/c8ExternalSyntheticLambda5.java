package o;

import com.roadrunner.login.presentation.router.RouterViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c8ExternalSyntheticLambda5 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ RouterViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8ExternalSyntheticLambda5(RouterViewModel routerViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = routerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objResumeWithNormalRiderFlow;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            objResumeWithNormalRiderFlow = this.write.resumeWithNormalRiderFlow(this);
            int i3 = 49 / 0;
        } else {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            objResumeWithNormalRiderFlow = this.write.resumeWithNormalRiderFlow(this);
        }
        int i4 = IconCompatParcelizer + 57;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return objResumeWithNormalRiderFlow;
    }
}
