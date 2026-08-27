package o;

import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.logger.DatabaseInfoLogger;
import java.util.Calendar;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setTrimPathEnd extends ContinuationImpl {
    public long IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public coil3.memory.MemoryCacheService MediaDescriptionCompat;
    public final /* synthetic */ DatabaseInfoLogger MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public int RatingCompat;
    public quadToRelative RemoteActionCompatParcelizer;
    public Integer read;
    public Calendar serializer;
    public PerseusParamsConfig write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTrimPathEnd(DatabaseInfoLogger databaseInfoLogger, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = databaseInfoLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaBrowserCompatMediaItem = obj;
        this.RatingCompat |= Integer.MIN_VALUE;
        return this.MediaMetadataCompat.createBacklogInfoRequest(null, null, this);
    }
}
