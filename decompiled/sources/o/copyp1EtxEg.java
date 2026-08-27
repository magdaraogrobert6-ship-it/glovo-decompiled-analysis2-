package o;

import com.roadrunner.delivery.accept.declinebutton.domain.DeclineButtonClickEventRetriever;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class copyp1EtxEg extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ DeclineButtonClickEventRetriever write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copyp1EtxEg(DeclineButtonClickEventRetriever declineButtonClickEventRetriever, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = declineButtonClickEventRetriever;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = read + 59;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
