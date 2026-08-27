package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class toLocal extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ WebChatViewModel serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toLocal(WebChatViewModel webChatViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objNotifyBridgeMessageFailure;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objNotifyBridgeMessageFailure = this.serializer.notifyBridgeMessageFailure(null, this);
            int i3 = 85 / 0;
        } else {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objNotifyBridgeMessageFailure = this.serializer.notifyBridgeMessageFailure(null, this);
        }
        int i4 = write + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return objNotifyBridgeMessageFailure;
    }
}
