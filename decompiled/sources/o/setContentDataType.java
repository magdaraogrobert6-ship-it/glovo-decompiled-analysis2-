package o;

import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setContentDataType extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public setInputTextSuggestionState IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int serializer;
    public final /* synthetic */ FlowLiveDataConversions$asLiveData$1$1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setContentDataType(FlowLiveDataConversions$asLiveData$1$1 flowLiveDataConversions$asLiveData$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = flowLiveDataConversions$asLiveData$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 113;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.write.emit((setInputTextSuggestionState) null, (ShortNewsContentCardView) this);
        int i4 = MediaDescriptionCompat + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
