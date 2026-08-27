package o;

import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiHelperForM2 extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiHelperForM2(ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit(null, this);
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 58 / 0;
        return this.IconCompatParcelizer.emit(null, this);
    }
}
