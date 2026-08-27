package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class copy38bxuX8 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copy38bxuX8(StateProviderImpl$special$$inlined$map$2.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objEmit = this.write.emit(null, this);
        int i4 = RemoteActionCompatParcelizer + 75;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
