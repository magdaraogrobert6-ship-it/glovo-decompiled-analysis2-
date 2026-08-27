package com.mapbox.navigation.ui.maps.route.line.api;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zznh;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineNoOpExpressionEventData;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineProviderBasedExpressionEventData;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineValueCommandHolder {
    public final zznh applier;
    public final HeavyRouteLineValueProvider provider;

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.api.RouteLineValueCommandHolder$toRouteLineExpressionEventData$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public RouteLineValueCommandHolder L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RouteLineValueCommandHolder.this.toRouteLineExpressionEventData(null, null, this);
        }
    }

    public RouteLineValueCommandHolder(HeavyRouteLineValueProvider heavyRouteLineValueProvider, zznh zznhVar) {
        this.provider = heavyRouteLineValueProvider;
        this.applier = zznhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object toRouteLineExpressionEventData(TextAnnouncementContentCardView textAnnouncementContentCardView, RouteLineViewOptionsData routeLineViewOptionsData, ContinuationImpl continuationImpl) {
        AnonymousClass1 anonymousClass1;
        RouteLineValueCommandHolder routeLineValueCommandHolder;
        if (continuationImpl instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuationImpl;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuationImpl);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuationImpl);
        }
        Object objGenerateCommand = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objGenerateCommand);
                HeavyRouteLineValueProvider heavyRouteLineValueProvider = this.provider;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objGenerateCommand = heavyRouteLineValueProvider.generateCommand(textAnnouncementContentCardView, routeLineViewOptionsData, anonymousClass1);
                if (objGenerateCommand == coroutineSingletons) {
                    return coroutineSingletons;
                }
                routeLineValueCommandHolder = this;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                routeLineValueCommandHolder = anonymousClass1.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(objGenerateCommand);
            }
            return new RouteLineProviderBasedExpressionEventData(routeLineValueCommandHolder.applier.getProperty(), null, (StylePropertyValue) objGenerateCommand, 2, null);
        } catch (Throwable unused) {
            return new RouteLineNoOpExpressionEventData();
        }
    }
}
