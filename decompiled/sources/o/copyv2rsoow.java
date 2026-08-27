package o;

import com.roadrunner.delivery.accept.declinebutton.domain.DeclineOrderClickEventRetriever;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class copyv2rsoow extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ DeclineOrderClickEventRetriever IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyv2rsoow(DeclineOrderClickEventRetriever declineOrderClickEventRetriever, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = declineOrderClickEventRetriever;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 21;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.invoke(this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.invoke(this);
        throw null;
    }
}
