package o;

import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class horizontalOverlap extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ ObserveMultiplier$invoke$$inlined$map$1$2 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public horizontalOverlap(ObserveMultiplier$invoke$$inlined$map$1$2 observeMultiplier$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = observeMultiplier$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = write + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit(null, this);
            int i3 = 91 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit(null, this);
        }
        int i4 = serializer + 39;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return objEmit;
    }
}
