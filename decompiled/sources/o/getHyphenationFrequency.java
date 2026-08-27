package o;

import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getHyphenationFrequency extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ ObserveMultiplier$invoke$$inlined$map$1$2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getHyphenationFrequency(ObserveMultiplier$invoke$$inlined$map$1$2 observeMultiplier$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = observeMultiplier$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 25;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.emit(null, this);
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i3 = write + 81;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objEmit;
        }
        throw null;
    }
}
