package o;

import com.roadrunner.twofa.data.entity.TwoFaTimerDataStore$get$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class logPurchaselambda10 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ TwoFaTimerDataStore$get$$inlined$map$1$2 read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logPurchaselambda10(TwoFaTimerDataStore$get$$inlined$map$1$2 twoFaTimerDataStore$get$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = twoFaTimerDataStore$get$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.read.emit(null, this);
        int i4 = write + 117;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
