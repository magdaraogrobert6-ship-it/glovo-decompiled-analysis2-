package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class InlineDensity extends ContinuationImpl {
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public androidx.compose.ui.input.pointer.PointerInputScope read;
    public /* synthetic */ Object serializer;
    public TextAnnouncementContentCardView write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(null, null, this);
    }

    public InlineDensity(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
