package o;

import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setClockTimes extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ CustomerUnavailableViewModel read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setClockTimes(CustomerUnavailableViewModel customerUnavailableViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = customerUnavailableViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$refreshState = CustomerUnavailableViewModel.access$refreshState(this.read, this);
        int i4 = RemoteActionCompatParcelizer + 5;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$refreshState;
    }
}
