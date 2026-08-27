package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.RegexKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getNamedColorStateList extends ContinuationImpl {
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM IconCompatParcelizer;
    public createBrazeUserChangeEventSubscriberlambda0 MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public createInAppMessageEventSubscriber MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public double write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaSessionCompatQueueItem = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        return RegexKt.retry(0, 0L, 0L, 0.0d, null, null, this);
    }

    public getNamedColorStateList(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
