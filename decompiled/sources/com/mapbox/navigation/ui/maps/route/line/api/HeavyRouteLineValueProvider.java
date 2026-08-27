package com.mapbox.navigation.ui.maps.route.line.api;

import androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class HeavyRouteLineValueProvider {
    public final /* synthetic */ int $r8$classId;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM workerThreadExpressionGenerator;

    public /* synthetic */ HeavyRouteLineValueProvider(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.$r8$classId = i;
        this.workerThreadExpressionGenerator = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final Object generateCommand(TextAnnouncementContentCardView textAnnouncementContentCardView, Object obj, ContinuationImpl continuationImpl) {
        if (this.$r8$classId == 0) {
            return BuildersKt.withContext(textAnnouncementContentCardView, new FlowLiveDataConversions$asFlow$1$1(this, (RouteLineViewOptionsData) obj, (ShortNewsContentCardView) null, 27), continuationImpl);
        }
        return this.workerThreadExpressionGenerator.invoke((RouteLineViewOptionsData) obj);
    }
}
