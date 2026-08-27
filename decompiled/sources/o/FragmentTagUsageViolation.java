package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentTagUsageViolation extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(HeatmapDataStore$get$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEmit;
        int i = 2 % 2;
        int i2 = serializer + 79;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
            int i3 = 76 / 0;
        } else {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objEmit = this.write.emit(null, this);
        }
        int i4 = serializer + 23;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
