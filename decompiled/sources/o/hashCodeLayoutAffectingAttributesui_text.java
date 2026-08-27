package o;

import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class hashCodeLayoutAffectingAttributesui_text extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ ObserveMultiplier$invoke$$inlined$map$1$2 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hashCodeLayoutAffectingAttributesui_text(ObserveMultiplier$invoke$$inlined$map$1$2 observeMultiplier$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = observeMultiplier$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 19;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit(null, this);
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
