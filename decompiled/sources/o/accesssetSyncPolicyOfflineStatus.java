package o;

import coil3.ComponentRegistry$Builder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accesssetSyncPolicyOfflineStatus extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public double IconCompatParcelizer;
    public double RemoteActionCompatParcelizer;
    public final /* synthetic */ ComponentRegistry$Builder read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesssetSyncPolicyOfflineStatus(ComponentRegistry$Builder componentRegistry$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = componentRegistry$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.invoke(0.0d, 0.0d, this);
    }
}
