package o;

import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getLoadingStrategyPKNRLFQ extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ ObserveTagsUiState$invoke$$inlined$map$1$2 IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getLoadingStrategyPKNRLFQ(ObserveTagsUiState$invoke$$inlined$map$1$2 observeTagsUiState$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = observeTagsUiState$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit(null, this);
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
