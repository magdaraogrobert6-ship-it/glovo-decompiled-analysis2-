package o;

import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutHelper extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ObserveMultiplier$invoke$$inlined$map$1$2 read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutHelper(ObserveMultiplier$invoke$$inlined$map$1$2 observeMultiplier$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = observeMultiplier$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.read.emit(null, this);
            int i3 = 68 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.read.emit(null, this);
        }
        int i4 = IconCompatParcelizer + 11;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return objEmit;
    }
}
