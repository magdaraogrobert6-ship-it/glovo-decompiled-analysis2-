package o;

import com.roadrunner.auth.domain.token.DoesAccessTokenExistUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onLongClickdefault extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ DoesAccessTokenExistUseCaseImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onLongClickdefault(DoesAccessTokenExistUseCaseImpl doesAccessTokenExistUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = doesAccessTokenExistUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.IconCompatParcelizer.invoke(this);
        int i4 = serializer + 45;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
