package o;

import com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class LineBreakSaverlambda1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public long IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RemoveAutoAcceptedDeliveryIdImpl read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineBreakSaverlambda1(RemoveAutoAcceptedDeliveryIdImpl removeAutoAcceptedDeliveryIdImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = removeAutoAcceptedDeliveryIdImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.read.invoke(0L, this);
        int i4 = write + 73;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }
}
