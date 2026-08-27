package o;

import io.grpc.CallOptions$Builder;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 extends ContinuationImpl {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public BaseContentCardViewExternalSyntheticLambda0 MediaBrowserCompatMediaItem;
    public final /* synthetic */ CallOptions$Builder MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public ArrayList RemoteActionCompatParcelizer;
    public BaseContentCardViewExternalSyntheticLambda0 read;
    public t2ExternalSyntheticLambda1 serializer;
    public BaseContentCardViewExternalSyntheticLambda0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(CallOptions$Builder callOptions$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = callOptions$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatResultReceiverWrapper + 65;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatQueueItem = obj;
        this.MediaMetadataCompat |= Integer.MIN_VALUE;
        Object objAccess$getMapLayer = CallOptions$Builder.access$getMapLayer(this.MediaDescriptionCompat, null, null, this);
        int i4 = RatingCompat + 77;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objAccess$getMapLayer;
    }
}
