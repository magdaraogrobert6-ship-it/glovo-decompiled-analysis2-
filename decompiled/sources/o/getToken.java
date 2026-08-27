package o;

import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getToken extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ CountDownTimerUiModel read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getToken(CountDownTimerUiModel countDownTimerUiModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = countDownTimerUiModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 95;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object remainingCountTimeDuration = this.read.getRemainingCountTimeDuration(this);
        int i4 = IconCompatParcelizer + 11;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return remainingCountTimeDuration;
    }
}
