package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteSetValue;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineView$renderRouteDrawDataInternal$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ RoutesRenderedCallbackWrapper $callback;
    public final /* synthetic */ Expected $routeDrawData;
    public final /* synthetic */ Style $style;
    public int I$0;
    public int I$1;
    public MapboxRouteLineView.OptionsHolder L$0;
    public Set L$1;
    public onViewAttachedToWindowlambda0 L$10;
    public Object L$11;
    public List L$2;
    public List L$3;
    public MapboxRouteLineView L$4;
    public Style L$5;
    public RouteSetValue L$6;
    public List L$7;
    public Iterator L$8;
    public RouteLineData L$9;
    public int label;
    public final /* synthetic */ MapboxRouteLineView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineView$renderRouteDrawDataInternal$1(MapboxRouteLineView mapboxRouteLineView, Style style, Expected expected, RoutesRenderedCallbackWrapper routesRenderedCallbackWrapper, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.this$0 = mapboxRouteLineView;
        this.$style = style;
        this.$routeDrawData = expected;
        this.$callback = routesRenderedCallbackWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new MapboxRouteLineView$renderRouteDrawDataInternal$1(this.this$0, this.$style, this.$routeDrawData, this.$callback, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((MapboxRouteLineView$renderRouteDrawDataInternal$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x052e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0536  */
    /* JADX WARN: Code duplicated, block: B:122:0x0541  */
    /* JADX WARN: Code duplicated, block: B:125:0x054e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0560  */
    /* JADX WARN: Code duplicated, block: B:160:0x0706  */
    /* JADX WARN: Code duplicated, block: B:166:0x0762  */
    /* JADX WARN: Code duplicated, block: B:200:0x086b  */
    /* JADX WARN: Code duplicated, block: B:404:0x0598 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v73, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:166:0x0762 -> B:167:0x0773). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x086b -> B:201:0x0873). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 3177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderRouteDrawDataInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
