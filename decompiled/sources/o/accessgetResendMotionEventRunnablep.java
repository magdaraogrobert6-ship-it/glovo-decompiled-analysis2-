package o;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class accessgetResendMotionEventRunnablep implements getPlacementScope {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 read;

    public /* synthetic */ accessgetResendMotionEventRunnablep(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, int i) {
        this.IconCompatParcelizer = i;
        this.read = lookaheadCapablePlaceableCompaniononCommitAffectingRuler1;
    }

    @Override // o.getPlacementScope
    public final Object create(MetricsBatchProcessor metricsBatchProcessor) {
        int i = this.IconCompatParcelizer;
        LookaheadCapablePlaceableCompaniononCommitAffectingRuler1 lookaheadCapablePlaceableCompaniononCommitAffectingRuler1 = this.read;
        if (i == 0) {
            return FirebasePerfRegistrar.lambda$getComponents$0(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, metricsBatchProcessor);
        }
        if (i != 1) {
            return i != 2 ? RemoteConfigRegistrar.lambda$getComponents$0(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, metricsBatchProcessor) : FirebaseMessagingRegistrar.lambda$getComponents$0(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1, metricsBatchProcessor);
        }
        return new onSemanticsChange((Context) metricsBatchProcessor.read(Context.class), ((FirebaseApp) metricsBatchProcessor.read(FirebaseApp.class)).serializer(), metricsBatchProcessor.read(LookaheadCapablePlaceableCompaniononCommitAffectingRuler1.read(setRoundRectOutlineTNW_H78default.class)), metricsBatchProcessor.write(requestFocusCurrent.class), (Executor) metricsBatchProcessor.write(lookaheadCapablePlaceableCompaniononCommitAffectingRuler1));
    }
}
