package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ HeatmapDataStore$getBoolean$$inlined$map$1.AnonymousClass2 RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityClockgetAnimatedPropertieslambda0inlinedsortedBy1(HeatmapDataStore$getBoolean$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 49;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objEmit = this.RemoteActionCompatParcelizer.emit(null, this);
        int i4 = serializer + 35;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
