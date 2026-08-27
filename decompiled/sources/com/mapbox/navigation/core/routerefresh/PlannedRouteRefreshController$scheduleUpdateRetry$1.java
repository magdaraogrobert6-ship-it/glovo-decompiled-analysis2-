package com.mapbox.navigation.core.routerefresh;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.I$b;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getUseEvaluationsCachefwf_client_release;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class PlannedRouteRefreshController$scheduleUpdateRetry$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ List $routes;
    public final /* synthetic */ boolean $shouldNotifyOnStart;
    public int label;
    public final /* synthetic */ I$b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlannedRouteRefreshController$scheduleUpdateRetry$1(I$b i$b, List list, boolean z, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.this$0 = i$b;
        this.$routes = list;
        this.$shouldNotifyOnStart = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new PlannedRouteRefreshController$scheduleUpdateRetry$1(this.this$0, this.$routes, this.$shouldNotifyOnStart, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((PlannedRouteRefreshController$scheduleUpdateRetry$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            I$b i$b = this.this$0;
            ((getUseEvaluationsCachefwf_client_release) i$b.RatingCompat).write++;
            this.label = 1;
            if (I$b.access$executePlannedRefresh(i$b, this.$routes, this.$shouldNotifyOnStart, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
