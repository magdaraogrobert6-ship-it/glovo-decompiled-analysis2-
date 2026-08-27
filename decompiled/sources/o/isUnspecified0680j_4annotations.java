package o;

import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.presentation.PinValidationTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isUnspecified0680j_4annotations extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ PinValidationTaskUiModelImpl IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isUnspecified0680j_4annotations(PinValidationTaskUiModelImpl pinValidationTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = pinValidationTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            return PinValidationTaskUiModelImpl.access$loadAnalytics(this.IconCompatParcelizer, this);
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        PinValidationTaskUiModelImpl.access$loadAnalytics(this.IconCompatParcelizer, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
