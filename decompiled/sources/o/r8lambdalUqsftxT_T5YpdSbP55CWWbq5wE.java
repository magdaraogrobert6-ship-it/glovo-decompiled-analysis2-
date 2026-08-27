package o;

import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdalUqsftxT_T5YpdSbP55CWWbq5wE extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public ConfirmationRepository IconCompatParcelizer;
    public final /* synthetic */ ConfirmationRepository MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdalUqsftxT_T5YpdSbP55CWWbq5wE(ConfirmationRepository confirmationRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = confirmationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConfirmationRepository confirmationRepository;
        long j;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 75;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            confirmationRepository = this.MediaMetadataCompat;
            j = 1;
        } else {
            this.read = obj;
            this.write |= Integer.MIN_VALUE;
            confirmationRepository = this.MediaMetadataCompat;
            j = 0;
        }
        return confirmationRepository.getConfirmationResponse(j, this);
    }
}
