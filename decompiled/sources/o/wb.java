package o;

import com.roadrunner.opportunities.domain.OpportunitiesMapper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class wb extends ContinuationImpl {
    private static int ComponentActivity = 1;
    private static int MediaSessionCompatToken;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public Iterator MediaDescriptionCompat;
    public Collection MediaMetadataCompat;
    public Collection MediaSessionCompatQueueItem;
    public /* synthetic */ Object MediaSessionCompatResultReceiverWrapper;
    public int ParcelableVolumeInfo;
    public final /* synthetic */ OpportunitiesMapper PlaybackStateCompat;
    public List PlaybackStateCompatCustomAction;
    public Iterator RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(OpportunitiesMapper opportunitiesMapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.PlaybackStateCompat = opportunitiesMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 71;
        ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatResultReceiverWrapper = obj;
        this.ParcelableVolumeInfo |= Integer.MIN_VALUE;
        Object zoneGeoJson = this.PlaybackStateCompat.getZoneGeoJson(null, null, this);
        int i4 = ComponentActivity + 63;
        MediaSessionCompatToken = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zoneGeoJson;
    }
}
