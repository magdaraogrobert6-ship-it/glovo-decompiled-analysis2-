package o;

import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getVisiblegIe3tQ8annotations extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ SideMenuCacheImpl$get$$inlined$map$1.AnonymousClass2 read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getVisiblegIe3tQ8annotations(SideMenuCacheImpl$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 67;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.read.emit(null, this);
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.read.emit(null, this);
        int i3 = RemoteActionCompatParcelizer + 3;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
