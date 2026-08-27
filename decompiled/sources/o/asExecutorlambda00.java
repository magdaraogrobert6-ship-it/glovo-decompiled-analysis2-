package o;

import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class asExecutorlambda00 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ ObserveTagsUiState$invoke$$inlined$map$1$2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asExecutorlambda00(ObserveTagsUiState$invoke$$inlined$map$1$2 observeTagsUiState$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = observeTagsUiState$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = read + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
            int i3 = 7 / 0;
        } else {
            this.serializer = obj;
            this.write |= Integer.MIN_VALUE;
            objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        }
        int i4 = IconCompatParcelizer + 125;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
