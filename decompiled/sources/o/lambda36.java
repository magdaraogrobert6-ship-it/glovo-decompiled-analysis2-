package o;

import com.roadrunner.twofa.data.entity.TwoFaTimerDataStore$get$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda36 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ TwoFaTimerDataStore$get$$inlined$map$1$2 IconCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambda36(TwoFaTimerDataStore$get$$inlined$map$1$2 twoFaTimerDataStore$get$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = twoFaTimerDataStore$get$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objEmit = this.IconCompatParcelizer.emit(null, this);
        int i4 = read + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
