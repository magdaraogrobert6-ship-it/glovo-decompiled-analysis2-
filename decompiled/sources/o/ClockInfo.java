package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ClockInfo extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ HeatmapDataStore$getBoolean$$inlined$map$1.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockInfo(HeatmapDataStore$getBoolean$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.write.emit(null, this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.write.emit(null, this);
        obj2.hashCode();
        throw null;
    }
}
