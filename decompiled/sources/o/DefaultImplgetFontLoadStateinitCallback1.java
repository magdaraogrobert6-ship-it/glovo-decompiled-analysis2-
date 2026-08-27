package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultImplgetFontLoadStateinitCallback1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultImplgetFontLoadStateinitCallback1(StateProviderImpl$special$$inlined$map$2.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 51;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 41 / 0;
        return this.write.emit(null, this);
    }
}
