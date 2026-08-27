package o;

import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdah58aXmhhQAgDkycgUejmT5u6E extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ SideMenuCacheImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public isRoot write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdah58aXmhhQAgDkycgUejmT5u6E(SideMenuCacheImpl sideMenuCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = sideMenuCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objShouldClearCache;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objShouldClearCache = this.IconCompatParcelizer.shouldClearCache(null, this);
            int i3 = 34 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objShouldClearCache = this.IconCompatParcelizer.shouldClearCache(null, this);
        }
        int i4 = serializer + 113;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return objShouldClearCache;
    }
}
