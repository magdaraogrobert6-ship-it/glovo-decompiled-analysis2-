package o;

import com.huawei.location.ut;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierNode extends ContinuationImpl {
    public ut IconCompatParcelizer;
    public androidx.compose.ui.input.pointer.AwaitPointerEventScope RemoteActionCompatParcelizer;
    public cancelPendingWebViewPause read;
    public int serializer;
    public /* synthetic */ Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(null, null, null, null, this);
    }

    public ModifierNode(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
