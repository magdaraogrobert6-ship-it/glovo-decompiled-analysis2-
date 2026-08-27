package o;

import androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class CoreTextFieldKtCoreTextField512 extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1 RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKtCoreTextField512(AnchoredDraggableKt$restartable$2.AnonymousClass1 anonymousClass1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.emit(null, this);
    }
}
