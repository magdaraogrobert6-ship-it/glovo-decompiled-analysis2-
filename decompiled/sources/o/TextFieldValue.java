package o;

import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.data.UploadSharedContentWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextFieldValue extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public String IconCompatParcelizer;
    public final /* synthetic */ UploadSharedContentWorker MediaDescriptionCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public r8lambdaCTegLFIY2N5eeYL50pY32CICZRI RemoteActionCompatParcelizer;
    public setReset read;
    public TextFieldValueCompanion serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldValue(UploadSharedContentWorker uploadSharedContentWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = uploadSharedContentWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objDoWork;
        int i = 2 % 2;
        int i2 = RatingCompat + 37;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.MediaSessionCompatQueueItem = obj;
            this.write |= Integer.MIN_VALUE;
            objDoWork = this.MediaDescriptionCompat.doWork(this);
            int i3 = 77 / 0;
        } else {
            this.MediaSessionCompatQueueItem = obj;
            this.write |= Integer.MIN_VALUE;
            objDoWork = this.MediaDescriptionCompat.doWork(this);
        }
        int i4 = MediaBrowserCompatMediaItem + 51;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objDoWork;
    }
}
