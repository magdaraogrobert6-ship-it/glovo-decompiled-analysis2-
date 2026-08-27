package o;

import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdah0W_BenOoYnDk87aaPeRKggcT8 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SideMenuCacheImpl MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public r8lambdakQbp11wZ4ZjRP1b2DHSZXunsBM read;
    public isRoot serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdah0W_BenOoYnDk87aaPeRKggcT8(SideMenuCacheImpl sideMenuCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = sideMenuCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = this.MediaSessionCompatQueueItem.set(0L, null, this);
        int i4 = MediaBrowserCompatMediaItem + 39;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return obj2;
    }
}
