package o;

import com.roadrunner.twofa.data.entity.TwoFaTimerDataStore$get$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetBrazeClassLockcp extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public final /* synthetic */ TwoFaTimerDataStore$get$$inlined$map$1$2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessgetBrazeClassLockcp(TwoFaTimerDataStore$get$$inlined$map$1$2 twoFaTimerDataStore$get$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = twoFaTimerDataStore$get$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 15;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.emit(null, this);
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.RemoteActionCompatParcelizer.emit(null, this);
        throw null;
    }
}
