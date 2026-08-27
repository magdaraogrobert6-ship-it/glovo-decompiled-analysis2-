package o;

import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewAnimationClock extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public List IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ InitiateTransferChangeUseCase read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock(InitiateTransferChangeUseCase initiateTransferChangeUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = initiateTransferChangeUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 109;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.read.invoke(null, this);
        int i4 = MediaBrowserCompatMediaItem + 3;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
