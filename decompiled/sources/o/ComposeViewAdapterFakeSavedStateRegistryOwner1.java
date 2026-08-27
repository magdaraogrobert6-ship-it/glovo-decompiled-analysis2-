package o;

import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ComposeViewAdapterFakeSavedStateRegistryOwner1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ PickUpDropOffUiModelImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewAdapterFakeSavedStateRegistryOwner1(PickUpDropOffUiModelImpl pickUpDropOffUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = pickUpDropOffUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return PickUpDropOffUiModelImpl.access$reloadState(this.write, this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        PickUpDropOffUiModelImpl.access$reloadState(this.write, this);
        throw null;
    }
}
