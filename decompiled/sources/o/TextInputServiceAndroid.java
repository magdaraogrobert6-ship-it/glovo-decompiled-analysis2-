package o;

import com.sentiance.core.model.events.H$b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputServiceAndroid extends ContinuationImpl {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompat = 1;
    public Collection IconCompatParcelizer;
    public /* synthetic */ Object MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public Collection MediaMetadataCompat;
    public TextFieldValueCompanion MediaSessionCompatQueueItem;
    public final /* synthetic */ H$b MediaSessionCompatResultReceiverWrapper;
    public Iterator RatingCompat;
    public List RemoteActionCompatParcelizer;
    public int read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputServiceAndroid(H$b h$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatResultReceiverWrapper = h$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 77;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaBrowserCompatMediaItem = obj;
        this.MediaDescriptionCompat |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaSessionCompatResultReceiverWrapper.invoke(null, null, this);
        int i4 = MediaSessionCompatToken + 35;
        PlaybackStateCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }
}
