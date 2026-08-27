package o;

import androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getDateMillisValue extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ AnchoredDraggableKt$restartable$2.AnonymousClass1 read;
    public Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDateMillisValue(AnchoredDraggableKt$restartable$2.AnonymousClass1 anonymousClass1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.emit(null, this);
    }
}
