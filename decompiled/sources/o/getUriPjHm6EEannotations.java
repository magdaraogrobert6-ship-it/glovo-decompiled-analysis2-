package o;

import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getUriPjHm6EEannotations extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    public getCapitalizationIUNYP9k IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public final /* synthetic */ SendTestPushUseCase MediaMetadataCompat;
    public /* synthetic */ Object RatingCompat;
    public int RemoteActionCompatParcelizer;
    public getAutoCorrect read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getUriPjHm6EEannotations(SendTestPushUseCase sendTestPushUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = sendTestPushUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 101;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaMetadataCompat.invoke(null, this);
        int i4 = MediaSessionCompatQueueItem + 113;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
