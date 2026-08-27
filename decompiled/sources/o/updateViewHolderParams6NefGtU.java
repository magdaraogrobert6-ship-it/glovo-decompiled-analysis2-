package o;

import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class updateViewHolderParams6NefGtU extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2.AnonymousClass2 read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public updateViewHolderParams6NefGtU(StateProviderImpl$special$$inlined$map$2.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.read.emit(null, this);
            int i3 = 46 / 0;
        } else {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.read.emit(null, this);
        }
        int i4 = RemoteActionCompatParcelizer + 77;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
