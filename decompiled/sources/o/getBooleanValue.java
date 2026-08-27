package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class getBooleanValue extends ContinuationImpl {
    public int read;
    public /* synthetic */ Object serializer;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        return androidx.compose.material3.internal.AnchoredDraggableKt.access$restartable(null, null, this);
    }

    public getBooleanValue(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
