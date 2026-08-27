package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.reactive.PublisherAsFlow;
import kotlinx.coroutines.reactive.ReactiveSubscriber;

/* JADX INFO: loaded from: classes4.dex */
public final class onBackProgressedlambda2 extends ContinuationImpl {
    public FlowCollector IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ PublisherAsFlow MediaDescriptionCompat;
    public int RemoteActionCompatParcelizer;
    public PublisherAsFlow read;
    public long serializer;
    public ReactiveSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onBackProgressedlambda2(PublisherAsFlow publisherAsFlow, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaDescriptionCompat = publisherAsFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.MediaDescriptionCompat.collectImpl(null, this);
    }
}
