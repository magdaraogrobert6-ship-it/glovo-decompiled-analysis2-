package o;

import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptRequestManagerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public int IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ AutoAcceptRequestManagerImpl MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public boolean read;
    public int serializer;
    public setCustomInAppMessageAnimationFactorylambda0 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaPabvzeZJPOXN9KgGoFGOJE5Boas(AutoAcceptRequestManagerImpl autoAcceptRequestManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = autoAcceptRequestManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 57;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaDescriptionCompat = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objCanPerformRequest = this.MediaMetadataCompat.canPerformRequest(this);
        int i4 = RatingCompat + 73;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objCanPerformRequest;
    }
}
