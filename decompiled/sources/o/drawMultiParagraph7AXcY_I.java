package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class drawMultiParagraph7AXcY_I extends ContinuationImpl {
    private static int read = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2.AnonymousClass2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drawMultiParagraph7AXcY_I(StateProviderImpl$special$$inlined$map$2.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i4 = write + 35;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return objEmit;
    }
}
