package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionManager extends ContinuationImpl {
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public Object MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public /* synthetic */ Object MediaSessionCompatToken;
    public Object RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatToken = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        return androidx.compose.foundation.gestures.TapGestureDetectorKt.processTapGesture(null, null, null, null, null, this);
    }

    public TextFieldSelectionManager(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
