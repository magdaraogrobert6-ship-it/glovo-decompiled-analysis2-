package o;

import com.deliveryhero.perseus.repository.PerseusHitsRepositoryImpl;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setStrokeLineJoinWw9F2mQ extends ContinuationImpl {
    public List IconCompatParcelizer;
    public final /* synthetic */ PerseusHitsRepositoryImpl MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public List RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public Map write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setStrokeLineJoinWw9F2mQ(PerseusHitsRepositoryImpl perseusHitsRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = perseusHitsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.MediaDescriptionCompat.insertEvent(null, null, null, this);
    }
}
