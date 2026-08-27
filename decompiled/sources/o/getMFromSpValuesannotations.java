package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getMFromSpValuesannotations extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2.AnonymousClass2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMFromSpValuesannotations(StateProviderImpl$special$$inlined$map$2.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.emit(null, this);
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 41 / 0;
        return this.RemoteActionCompatParcelizer.emit(null, this);
    }
}
