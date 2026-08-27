package o;

import com.roadrunner.login.domain.forgotpassword.usecase.GetRemainingForgotPasswordTimerIfRunning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class QueryResultAsyncValue extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ GetRemainingForgotPasswordTimerIfRunning read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryResultAsyncValue(GetRemainingForgotPasswordTimerIfRunning getRemainingForgotPasswordTimerIfRunning, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = getRemainingForgotPasswordTimerIfRunning;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.read.invoke(null, this);
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInvoke = this.read.invoke(null, this);
        int i3 = write + 77;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvoke;
    }
}
