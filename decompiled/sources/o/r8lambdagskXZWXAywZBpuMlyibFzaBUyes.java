package o;

import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdagskXZWXAywZBpuMlyibFzaBUyes extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ SideMenuCacheImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdagskXZWXAywZBpuMlyibFzaBUyes(SideMenuCacheImpl sideMenuCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = sideMenuCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.write.clear(this);
            throw null;
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objClear = this.write.clear(this);
        int i3 = read + 81;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objClear;
        }
        throw null;
    }
}
