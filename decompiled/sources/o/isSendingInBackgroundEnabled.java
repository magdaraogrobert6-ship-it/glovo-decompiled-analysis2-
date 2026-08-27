package o;

import com.roadrunner.rider.safety.sentiance.SentianceGuard;
import java.util.Date;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isSendingInBackgroundEnabled extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SentianceGuard MediaMetadataCompat;
    public Date RemoteActionCompatParcelizer;
    public int read;
    public r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isSendingInBackgroundEnabled(SentianceGuard sentianceGuard, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = sentianceGuard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 109;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            this.MediaMetadataCompat.startTrip(null, null, this);
            obj2.hashCode();
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objStartTrip = this.MediaMetadataCompat.startTrip(null, null, this);
        int i3 = MediaSessionCompatQueueItem + 49;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objStartTrip;
        }
        obj2.hashCode();
        throw null;
    }
}
