package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DeleteSurroundingTextCommand extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2.AnonymousClass2 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteSurroundingTextCommand(StateProviderImpl$special$$inlined$map$2.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit(null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
