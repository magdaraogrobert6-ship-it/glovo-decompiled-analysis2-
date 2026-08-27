package o;

import com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getSpanStyleSaver extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatToken = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ GetAcknowledgmentParamsImpl MediaBrowserCompatMediaItem;
    public Object MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public /* synthetic */ Object RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int read;
    public Collection serializer;
    public Iterator write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSpanStyleSaver(GetAcknowledgmentParamsImpl getAcknowledgmentParamsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = getAcknowledgmentParamsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Serializable serializableInvoke;
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 47;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RatingCompat = obj;
            this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
            serializableInvoke = this.MediaBrowserCompatMediaItem.invoke(null, this);
            int i3 = 97 / 0;
        } else {
            this.RatingCompat = obj;
            this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
            serializableInvoke = this.MediaBrowserCompatMediaItem.invoke(null, this);
        }
        int i4 = MediaSessionCompatToken + 53;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return serializableInvoke;
    }
}
