package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphIntrinsicsdefault extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int read;
    public final /* synthetic */ WebChatViewModel IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public getPlaceholderRects write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphIntrinsicsdefault(WebChatViewModel webChatViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objSendMessage;
        int i = 2 % 2;
        int i2 = RatingCompat + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objSendMessage = this.IconCompatParcelizer.sendMessage(null, this);
            int i3 = 40 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objSendMessage = this.IconCompatParcelizer.sendMessage(null, this);
        }
        int i4 = read + 35;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objSendMessage;
    }
}
