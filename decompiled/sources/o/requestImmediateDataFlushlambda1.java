package o;

import com.roadrunner.twofa.domain.GetRemainingTwoFaTimerIfRunning;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class requestImmediateDataFlushlambda1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ GetRemainingTwoFaTimerIfRunning write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public requestImmediateDataFlushlambda1(GetRemainingTwoFaTimerIfRunning getRemainingTwoFaTimerIfRunning, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = getRemainingTwoFaTimerIfRunning;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 87;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = read + 33;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
