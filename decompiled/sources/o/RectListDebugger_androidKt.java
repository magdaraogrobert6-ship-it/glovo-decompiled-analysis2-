package o;

import com.roadrunner.countdowntimer.CountDownTimerUiModel$observeTimerState$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class RectListDebugger_androidKt extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ CountDownTimerUiModel$observeTimerState$$inlined$map$1.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectListDebugger_androidKt(CountDownTimerUiModel$observeTimerState$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
            int i3 = 89 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
        }
        int i4 = serializer + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objEmit;
        }
        throw null;
    }
}
