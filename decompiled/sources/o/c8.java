package o;

import com.roadrunner.login.presentation.router.RouterViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c8 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(RouterViewModel routerViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = routerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.openRiderHiringScreen(this);
        }
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.write.openRiderHiringScreen(this);
        throw null;
    }
}
