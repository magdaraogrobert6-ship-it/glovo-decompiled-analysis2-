package o;

import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ SideMenuCacheImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdahA_Tal7rtdMP7Bv9IDcuwYDoHo(SideMenuCacheImpl sideMenuCacheImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = sideMenuCacheImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAccess$fromJson;
        int i = 2 % 2;
        int i2 = serializer + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objAccess$fromJson = SideMenuCacheImpl.access$fromJson(this.IconCompatParcelizer, null, this);
            int i3 = 27 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objAccess$fromJson = SideMenuCacheImpl.access$fromJson(this.IconCompatParcelizer, null, this);
        }
        int i4 = serializer + 81;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objAccess$fromJson;
        }
        throw null;
    }
}
