package o;

import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class reflectiveCurveTo extends ContinuationImpl {
    public Object ComponentActivity;
    public long IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public AppSessionManagerImpl MediaDescriptionCompat;
    public PerseusParamsConfig MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public ClientIdProviderImpl MediaSessionCompatResultReceiverWrapper;
    public String MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompatCustomAction;
    public String RatingCompat;
    public int RemoteActionCompatParcelizer;
    public List ResultReceiver;
    public setCustomInAppMessageAnimationFactorylambda0 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Map r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public List r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public /* synthetic */ Object r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public String r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public Object r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final /* synthetic */ HitEventFactory r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public long read;
    public long serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reflectiveCurveTo(HitEventFactory hitEventFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = hitEventFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = obj;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg |= Integer.MIN_VALUE;
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.createEventHit(null, null, null, null, null, null, this);
    }
}
