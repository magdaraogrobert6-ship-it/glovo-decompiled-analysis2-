package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.maps.Style;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineUpdateValue;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRouteLineView$renderRouteLineUpdateInternal$1$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ RouteLineUpdateValue $it;
    public final /* synthetic */ MapboxRouteLineView.OptionsHolder $optionsHolder;
    public final /* synthetic */ Style $style;
    public List L$0;
    public MapboxRouteLineView L$1;
    public Style L$2;
    public MapboxRouteLineView.OptionsHolder L$3;
    public RouteLineDynamicData L$4;
    public Iterator L$5;
    public int label;
    public final /* synthetic */ MapboxRouteLineView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRouteLineView$renderRouteLineUpdateInternal$1$1(RouteLineUpdateValue routeLineUpdateValue, MapboxRouteLineView mapboxRouteLineView, Style style, MapboxRouteLineView.OptionsHolder optionsHolder, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.$it = routeLineUpdateValue;
        this.this$0 = mapboxRouteLineView;
        this.$style = style;
        this.$optionsHolder = optionsHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new MapboxRouteLineView$renderRouteLineUpdateInternal$1$1(this.$it, this.this$0, this.$style, this.$optionsHolder, shortNewsContentCardView);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((MapboxRouteLineView$renderRouteLineUpdateInternal$1$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0105  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x017c  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e A[PHI: r2 r3 r4 r5 r6
  0x019e: PHI (r2v10 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData) = 
  (r2v8 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
  (r2v8 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
  (r2v11 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
 binds: [B:56:0x017a, B:58:0x019a, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r3v3 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder) = 
  (r3v1 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
  (r3v1 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
  (r3v4 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
 binds: [B:56:0x017a, B:58:0x019a, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r4v12 com.mapbox.maps.Style) = (r4v10 com.mapbox.maps.Style), (r4v10 com.mapbox.maps.Style), (r4v13 com.mapbox.maps.Style) binds: [B:56:0x017a, B:58:0x019a, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r5v10 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView) = 
  (r5v8 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
  (r5v8 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
  (r5v11 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
 binds: [B:56:0x017a, B:58:0x019a, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r6v7 java.util.List) = (r6v5 java.util.List), (r6v5 java.util.List), (r6v8 java.util.List) binds: [B:56:0x017a, B:58:0x019a, B:11:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2 A[PHI: r2 r3 r4 r5 r6
  0x01c2: PHI (r2v12 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData) = 
  (r2v10 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
  (r2v13 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
 binds: [B:61:0x01be, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r3v5 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder) = 
  (r3v3 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
  (r3v6 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
 binds: [B:61:0x01be, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r4v14 com.mapbox.maps.Style) = (r4v12 com.mapbox.maps.Style), (r4v15 com.mapbox.maps.Style) binds: [B:61:0x01be, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r5v12 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView) = 
  (r5v10 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
  (r5v13 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
 binds: [B:61:0x01be, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x01c2: PHI (r6v9 java.util.List) = (r6v7 java.util.List), (r6v10 java.util.List) binds: [B:61:0x01be, B:10:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3 A[PHI: r2 r3 r4 r5 r6
  0x01e3: PHI (r2v14 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData) = 
  (r2v12 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
  (r2v15 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
 binds: [B:64:0x01e0, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r3v7 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder) = 
  (r3v5 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
  (r3v8 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
 binds: [B:64:0x01e0, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r4v16 com.mapbox.maps.Style) = (r4v14 com.mapbox.maps.Style), (r4v17 com.mapbox.maps.Style) binds: [B:64:0x01e0, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r5v14 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView) = 
  (r5v12 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
  (r5v15 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
 binds: [B:64:0x01e0, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r6v11 java.util.List) = (r6v9 java.util.List), (r6v12 java.util.List) binds: [B:64:0x01e0, B:9:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206 A[PHI: r2 r3 r4 r5 r6
  0x0206: PHI (r2v16 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData) = 
  (r2v14 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
  (r2v14 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
  (r2v21 com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData)
 binds: [B:67:0x01e5, B:69:0x0203, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0206: PHI (r3v9 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder) = 
  (r3v7 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
  (r3v7 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
  (r3v14 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$OptionsHolder)
 binds: [B:67:0x01e5, B:69:0x0203, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0206: PHI (r4v18 com.mapbox.maps.Style) = (r4v16 com.mapbox.maps.Style), (r4v16 com.mapbox.maps.Style), (r4v19 com.mapbox.maps.Style) binds: [B:67:0x01e5, B:69:0x0203, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0206: PHI (r5v16 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView) = 
  (r5v14 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
  (r5v14 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
  (r5v17 com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView)
 binds: [B:67:0x01e5, B:69:0x0203, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0206: PHI (r6v13 java.util.List) = (r6v11 java.util.List), (r6v11 java.util.List), (r6v14 java.util.List) binds: [B:67:0x01e5, B:69:0x0203, B:8:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:77:0x022a A[PHI: r2
  0x022a: PHI (r2v22 java.util.List) = (r2v3 java.util.List), (r2v18 java.util.List), (r2v25 java.util.List) binds: [B:48:0x0140, B:76:0x0229, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0170, code lost:
    
        if (com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView.access$addLaunched(r12, r2, r10, r23) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0226, code lost:
    
        if (com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView.access$addLaunched(r5, r6, r2, r23) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0240, code lost:
    
        if (r2 == r1) goto L79;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView$renderRouteLineUpdateInternal$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
