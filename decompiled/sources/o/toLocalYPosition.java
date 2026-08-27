package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class toLocalYPosition extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ WebChatViewModel RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toLocalYPosition(WebChatViewModel webChatViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 39;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.onCloseRequested(null, this);
            obj2.hashCode();
            throw null;
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objOnCloseRequested = this.RemoteActionCompatParcelizer.onCloseRequested(null, this);
        int i3 = IconCompatParcelizer + 119;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objOnCloseRequested;
        }
        throw null;
    }
}
