package o;

import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getPasswordPjHm6EEannotations extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ ObserveTagsUiState$invoke$$inlined$map$1$2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPasswordPjHm6EEannotations(ObserveTagsUiState$invoke$$inlined$map$1$2 observeTagsUiState$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = observeTagsUiState$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 37;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.write.emit(null, this);
        int i4 = read + 33;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEmit;
        }
        throw null;
    }
}
