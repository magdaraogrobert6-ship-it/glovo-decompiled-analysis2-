package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManagercut1 extends ContinuationImpl {
    public final /* synthetic */ androidx.compose.foundation.gestures.TrackpadScrollingLogic IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManagercut1(androidx.compose.foundation.gestures.TrackpadScrollingLogic trackpadScrollingLogic, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = trackpadScrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TrackpadScrollingLogic.access$dispatchTrackpadScroll(this.IconCompatParcelizer, null, null, this);
    }
}
