package o;

import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes2.dex */
public final class reflectiveCurveToRelative extends ContinuationImpl {
    public Object IconCompatParcelizer;
    public final /* synthetic */ SideMenuCacheImpl$get$$inlined$map$1.AnonymousClass2 MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public FlowCollector read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public reflectiveCurveToRelative(SideMenuCacheImpl$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.MediaMetadataCompat = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.MediaMetadataCompat.emit(null, this);
    }
}
