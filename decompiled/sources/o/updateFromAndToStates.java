package o;

import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModelV2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class updateFromAndToStates extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ CustomerUnavailableViewModelV2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateFromAndToStates(CustomerUnavailableViewModelV2 customerUnavailableViewModelV2, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = customerUnavailableViewModelV2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            CustomerUnavailableViewModelV2.access$notifyTimerStarted(this.RemoteActionCompatParcelizer, null, this);
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$notifyTimerStarted = CustomerUnavailableViewModelV2.access$notifyTimerStarted(this.RemoteActionCompatParcelizer, null, this);
        int i3 = IconCompatParcelizer + 13;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objAccess$notifyTimerStarted;
        }
        obj2.hashCode();
        throw null;
    }
}
