package o;

import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewAdapterfindAndTrackAnimations1 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ PickupDropOffSingleDeliveryUiModelImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapterfindAndTrackAnimations1(PickupDropOffSingleDeliveryUiModelImpl pickupDropOffSingleDeliveryUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = pickupDropOffSingleDeliveryUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 41;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$reloadState = PickupDropOffSingleDeliveryUiModelImpl.access$reloadState(this.IconCompatParcelizer, this);
        int i4 = serializer + 27;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$reloadState;
    }
}
