package o;

import com.roadrunner.home.floatinglayer.config.GetRhFloatingLayerConfiguration$invoke$lambda$0$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class GetTargetFragmentUsageViolation extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ GetRhFloatingLayerConfiguration$invoke$lambda$0$$inlined$map$1.AnonymousClass2 RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentUsageViolation(GetRhFloatingLayerConfiguration$invoke$lambda$0$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 105;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        int i4 = read + 99;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
