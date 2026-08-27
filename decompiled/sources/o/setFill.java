package o;

import coil3.ComponentRegistry$Builder;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setFill extends ContinuationImpl {
    public Map IconCompatParcelizer;
    public final /* synthetic */ ComponentRegistry$Builder MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaDescriptionCompat;
    public List RemoteActionCompatParcelizer;
    public int read;
    public List serializer;
    public List write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setFill(ComponentRegistry$Builder componentRegistry$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = componentRegistry$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaDescriptionCompat = obj;
        this.read |= Integer.MIN_VALUE;
        return this.MediaBrowserCompatMediaItem.provideRequestParams(null, null, null, this);
    }
}
