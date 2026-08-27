package o;

import com.roadrunner.login.presentation.router.RouterViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c7 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ RouterViewModel read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(RouterViewModel routerViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = routerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            return RouterViewModel.access$initializeViewModel(this.read, this);
        }
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        RouterViewModel.access$initializeViewModel(this.read, this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
