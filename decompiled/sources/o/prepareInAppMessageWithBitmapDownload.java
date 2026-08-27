package o;

import com.google.android.gms.measurement.internal.zzgs;
import java.util.LinkedHashMap;
import kotlin.DeepRecursiveScopeImpl;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class prepareInAppMessageWithBitmapDownload extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ zzgs MediaDescriptionCompat;
    public int MediaSessionCompatQueueItem;
    public DeepRecursiveScopeImpl RemoteActionCompatParcelizer;
    public zzgs read;
    public String serializer;
    public LinkedHashMap write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prepareInAppMessageWithBitmapDownload(zzgs zzgsVar, BaseContinuationImpl baseContinuationImpl) {
        super(baseContinuationImpl);
        this.MediaDescriptionCompat = zzgsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        return zzgs.access$readObject(this.MediaDescriptionCompat, null, this);
    }
}
