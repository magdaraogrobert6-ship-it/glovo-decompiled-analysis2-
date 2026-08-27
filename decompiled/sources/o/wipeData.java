package o;

import com.roadrunner.vendor.review.data.cache.VendorReviewConfigCache;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class wipeData extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ VendorReviewConfigCache serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wipeData(VendorReviewConfigCache vendorReviewConfigCache, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = vendorReviewConfigCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objAccess$decodeFromJson = VendorReviewConfigCache.access$decodeFromJson(this.serializer, null, this);
        int i4 = RemoteActionCompatParcelizer + 57;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$decodeFromJson;
    }
}
