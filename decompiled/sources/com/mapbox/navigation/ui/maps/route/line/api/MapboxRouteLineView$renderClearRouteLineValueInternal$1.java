package com.mapbox.navigation.ui.maps.route.line.api;

import coil3.ExtrasKt;
import com.deliveryhero.perseus.logger.PerseusLogger$e$1;
import com.mapbox.bindgen.Expected;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.internal.extensions.MapboxStyleEx;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingPusherProvider;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingViewSender;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineView$renderClearRouteLineValueInternal$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Expected $clearRouteLineValue;
    public final /* synthetic */ Style $style;
    public final /* synthetic */ MapboxRouteLineView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineView$renderClearRouteLineValueInternal$1(MapboxRouteLineView mapboxRouteLineView, Style style, Expected expected, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.this$0 = mapboxRouteLineView;
        this.$style = style;
        this.$clearRouteLineValue = expected;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new MapboxRouteLineView$renderClearRouteLineValueInternal$1(this.this$0, this.$style, this.$clearRouteLineValue, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        MapboxRouteLineView$renderClearRouteLineValueInternal$1 mapboxRouteLineView$renderClearRouteLineValueInternal$1 = (MapboxRouteLineView$renderClearRouteLineValueInternal$1) create((ShortNewsContentCardView) obj);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        mapboxRouteLineView$renderClearRouteLineValueInternal$1.invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MapboxRouteLineView mapboxRouteLineView = this.this$0;
        MapboxRouteLineView.OptionsHolder optionsHolder = mapboxRouteLineView.optionsHolder;
        RouteLineHistoryRecordingViewSender routeLineHistoryRecordingViewSender = mapboxRouteLineView.sender;
        Style style = this.$style;
        String styleId = MapboxStyleEx.getStyleId(style);
        routeLineHistoryRecordingViewSender.getClass();
        Expected expected = this.$clearRouteLineValue;
        expected.getClass();
        RouteLineHistoryRecordingPusherProvider.instance.pushEventIfEnabled(new PerseusLogger$e$1(routeLineHistoryRecordingViewSender, styleId, expected, (ShortNewsContentCardView) null));
        MapboxRouteLineView.access$rebuildSourcesAndLayersIfNeeded(mapboxRouteLineView, style, optionsHolder.options);
        expected.onValue(new MapboxRouteLineView$$ExternalSyntheticLambda2(mapboxRouteLineView, style, 1));
        return createFromParcel.INSTANCE;
    }
}
