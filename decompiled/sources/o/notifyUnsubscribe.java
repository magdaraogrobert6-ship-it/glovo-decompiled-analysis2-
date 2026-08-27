package o;

import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableTaskUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class notifyUnsubscribe extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ CustomerUnavailableTaskUiModelImpl IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public notifyUnsubscribe(CustomerUnavailableTaskUiModelImpl customerUnavailableTaskUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = customerUnavailableTaskUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            CustomerUnavailableTaskUiModelImpl.access$loadAnalytics(this.IconCompatParcelizer, this);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$loadAnalytics = CustomerUnavailableTaskUiModelImpl.access$loadAnalytics(this.IconCompatParcelizer, this);
        int i3 = serializer + 121;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAccess$loadAnalytics;
    }
}
