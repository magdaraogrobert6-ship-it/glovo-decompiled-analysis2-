package o;

import com.foodora.courier.main.lifecycle.PermissionsLifecycleObserver;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getFireAdvertisingId extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public long IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ PermissionsLifecycleObserver write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFireAdvertisingId(PermissionsLifecycleObserver permissionsLifecycleObserver, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = permissionsLifecycleObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        return PermissionsLifecycleObserver.access$refreshStatusContinuously(this.write, 0L, this);
    }
}
