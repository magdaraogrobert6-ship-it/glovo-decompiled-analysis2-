package o;

import com.roadrunner.vendor.review.data.SubmitVendorReviewWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class waitForUserDependencyThreadlambda0 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ SubmitVendorReviewWorker IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public waitForUserDependencyThreadlambda0(SubmitVendorReviewWorker submitVendorReviewWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = submitVendorReviewWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objDoWork = this.IconCompatParcelizer.doWork(this);
        int i4 = RemoteActionCompatParcelizer + 59;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return objDoWork;
    }
}
