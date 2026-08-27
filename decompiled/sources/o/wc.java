package o;

import com.roadrunner.opportunities.domain.OpportunitiesMapper;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class wc extends ContinuationImpl {
    private static int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 0;
    private static int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = 1;
    public Collection ComponentActivity;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public String MediaSessionCompatResultReceiverWrapper;
    public w4ExternalSyntheticLambda0 MediaSessionCompatToken;
    public List ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public Collection ResultReceiver;
    public Iterator r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public List r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public waExternalSyntheticLambda0 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public w8ExternalSyntheticLambda6 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public Collection r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public Iterator r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public Iterator r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public Collection r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final /* synthetic */ OpportunitiesMapper r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public /* synthetic */ Object r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public int read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(OpportunitiesMapper opportunitiesMapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = opportunitiesMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 + 1;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = obj;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 |= Integer.MIN_VALUE;
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.mapToZones(null, this);
            obj2.hashCode();
            throw null;
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = obj;
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 |= Integer.MIN_VALUE;
        Serializable serializableMapToZones = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.mapToZones(null, this);
        int i3 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 39;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
        }
        return serializableMapToZones;
    }
}
