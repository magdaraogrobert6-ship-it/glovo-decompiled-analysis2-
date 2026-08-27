package o;

import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.utils.BackoffTimer;
import com.google.android.gms.dynamite.zzj;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class setTrimPathStart extends ContinuationImpl {
    public PerseusConfigLocalDataStoreImpl IconCompatParcelizer;
    public final /* synthetic */ zzj MediaBrowserCompatMediaItem;
    public BackoffTimer RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public BackoffTimer serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTrimPathStart(zzj zzjVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = zzjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.read = obj;
        this.write |= Integer.MIN_VALUE;
        return this.MediaBrowserCompatMediaItem.getInstance$perseus_release(null, null, this);
    }
}
