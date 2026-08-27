package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DispatcherKt extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DispatcherKt(HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 1;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            this.IconCompatParcelizer.emit(null, this);
            obj2.hashCode();
            throw null;
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.IconCompatParcelizer.emit(null, this);
        int i3 = read + 11;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return objEmit;
    }
}
