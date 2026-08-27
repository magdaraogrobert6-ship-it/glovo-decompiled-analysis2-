package o;

import com.roadrunner.home.state.data.RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class clearOldPositions extends ContinuationImpl {
    private static int serializer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1.AnonymousClass2 RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clearOldPositions(RiderStateRepositoryImpl$observeComponentsByHost$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = write + 21;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
            int i3 = 9 / 0;
        } else {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        }
        int i4 = write + 49;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
