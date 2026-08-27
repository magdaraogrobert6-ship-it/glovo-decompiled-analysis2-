package o;

import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class BaselineShiftKt extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaselineShiftKt(ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 41;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.serializer.emit(null, this);
            throw null;
        }
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i3 = IconCompatParcelizer + 123;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objEmit;
    }
}
