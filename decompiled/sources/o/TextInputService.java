package o;

import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputService extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ ObserveTagsUiState$invoke$$inlined$map$1$2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputService(ObserveTagsUiState$invoke$$inlined$map$1$2 observeTagsUiState$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = observeTagsUiState$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.RemoteActionCompatParcelizer.emit(null, this);
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 11 / 0;
        return this.RemoteActionCompatParcelizer.emit(null, this);
    }
}
