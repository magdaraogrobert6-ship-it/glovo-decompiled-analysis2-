package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphIntrinsicInfo extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ WebChatViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphIntrinsicInfo(WebChatViewModel webChatViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objSendUpdatedVerificationToken$1 = this.write.sendUpdatedVerificationToken$1(null, this);
        int i4 = IconCompatParcelizer + 17;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objSendUpdatedVerificationToken$1;
        }
        obj2.hashCode();
        throw null;
    }
}
