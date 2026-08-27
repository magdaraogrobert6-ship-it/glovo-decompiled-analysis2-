package o;

import com.roadrunner.login.presentation.router.GetAuthStateViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ GetAuthStateViewModel read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(GetAuthStateViewModel getAuthStateViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = getAuthStateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objAccess$onUserAuthenticated = GetAuthStateViewModel.access$onUserAuthenticated(this.read, null, null, this);
        int i4 = RemoteActionCompatParcelizer + 3;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$onUserAuthenticated;
        }
        throw null;
    }
}
