package o;

import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getDecoratedBoundsWithMarginsInt {
    public final MutableStateFlow read;
    public final StateFlow write;

    public getDecoratedBoundsWithMarginsInt(access500 access500Var, ContextScope contextScope) {
        contextScope.getClass();
        MutableStateFlow mutableStateFlow = StateFlowKt.read(instance_delegatelambda0.write);
        this.read = mutableStateFlow;
        this.write = mutableStateFlow;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new HeatmapDataStore$set$2(access500Var, contextScope, this, (ShortNewsContentCardView) null, 4), 3);
    }
}
