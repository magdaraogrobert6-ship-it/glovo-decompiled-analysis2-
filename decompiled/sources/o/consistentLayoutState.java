package o;

import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes4.dex */
public final class consistentLayoutState implements getPlacementScope {
    public final /* synthetic */ int IconCompatParcelizer;
    public static final consistentLayoutState read = new consistentLayoutState(0);
    public static final consistentLayoutState RemoteActionCompatParcelizer = new consistentLayoutState(1);
    public static final consistentLayoutState serializer = new consistentLayoutState(2);
    public static final consistentLayoutState write = new consistentLayoutState(3);

    public /* synthetic */ consistentLayoutState(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.getPlacementScope
    public final Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            Object objWrite = metricsBatchProcessor.write(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(accessgetRulerScope.class, Executor.class));
            objWrite.getClass();
            int iRemoteActionCompatParcelizer = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer3 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            return (CoroutineDispatcher) coil3.util.IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, iRemoteActionCompatParcelizer2, new Object[]{(Executor) objWrite}, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer3, -1915506938);
        }
        if (i == 1) {
            Object objWrite2 = metricsBatchProcessor.write(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(captureRulersIfNeeded.class, Executor.class));
            objWrite2.getClass();
            int iRemoteActionCompatParcelizer4 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer5 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer6 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            return (CoroutineDispatcher) coil3.util.IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, iRemoteActionCompatParcelizer5, new Object[]{(Executor) objWrite2}, iRemoteActionCompatParcelizer4, iRemoteActionCompatParcelizer6, -1915506938);
        }
        if (i != 2) {
            Object objWrite3 = metricsBatchProcessor.write(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(notifyRulerValueChange.class, Executor.class));
            objWrite3.getClass();
            int iRemoteActionCompatParcelizer7 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer8 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer9 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
            return (CoroutineDispatcher) coil3.util.IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, iRemoteActionCompatParcelizer8, new Object[]{(Executor) objWrite3}, iRemoteActionCompatParcelizer7, iRemoteActionCompatParcelizer9, -1915506938);
        }
        Object objWrite4 = metricsBatchProcessor.write(new LookaheadCapablePlaceableCompaniononCommitAffectingRuler1(findAncestorRulerDefiner.class, Executor.class));
        objWrite4.getClass();
        int iRemoteActionCompatParcelizer10 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer11 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer12 = FrequentlyUsedItemKt.RemoteActionCompatParcelizer();
        return (CoroutineDispatcher) coil3.util.IntPair.RemoteActionCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), 1915506940, iRemoteActionCompatParcelizer11, new Object[]{(Executor) objWrite4}, iRemoteActionCompatParcelizer10, iRemoteActionCompatParcelizer12, -1915506938);
    }
}
