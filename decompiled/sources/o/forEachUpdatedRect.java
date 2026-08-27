package o;

import com.roadrunner.bubble.presentation.GetBubbleUiState;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class forEachUpdatedRect extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ GetBubbleUiState serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public forEachUpdatedRect(GetBubbleUiState getBubbleUiState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getBubbleUiState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(this);
        int i4 = write + 35;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        throw null;
    }
}
