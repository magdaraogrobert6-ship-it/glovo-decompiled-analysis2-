package o;

import com.roadrunner.vendor.review.presentation.option.VendorReviewOptionUiModelImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class performPushDeliveryFlushandroid_sdk_base_release extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ VendorReviewOptionUiModelImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public performPushDeliveryFlushandroid_sdk_base_release(VendorReviewOptionUiModelImpl vendorReviewOptionUiModelImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = vendorReviewOptionUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 63;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            VendorReviewOptionUiModelImpl.access$tryLoadingSubmittedState(this.write, this);
            throw null;
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$tryLoadingSubmittedState = VendorReviewOptionUiModelImpl.access$tryLoadingSubmittedState(this.write, this);
        int i3 = RemoteActionCompatParcelizer + 103;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objAccess$tryLoadingSubmittedState;
    }
}
