package o;

import com.roadrunner.login.presentation.router.LoadAbTestConfigUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class c3 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ LoadAbTestConfigUseCase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(LoadAbTestConfigUseCase loadAbTestConfigUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = loadAbTestConfigUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 117;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = serializer + 53;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
