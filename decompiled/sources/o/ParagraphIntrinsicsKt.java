package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphIntrinsicsKt extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ WebChatViewModel RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphIntrinsicsKt(WebChatViewModel webChatViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objOnInitStarted$1 = this.RemoteActionCompatParcelizer.onInitStarted$1(this);
        int i4 = IconCompatParcelizer + 123;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objOnInitStarted$1;
    }
}
