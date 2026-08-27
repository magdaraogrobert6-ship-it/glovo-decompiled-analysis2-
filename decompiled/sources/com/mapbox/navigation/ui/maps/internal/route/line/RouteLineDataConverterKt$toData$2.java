package com.mapbox.navigation.ui.maps.internal.route.line;

import com.google.android.gms.internal.mlkit_vision_face.zznb;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineDynamicData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineTrimOffset;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineDataConverterKt$toData$2 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public RouteLineExpressionEventData L$3;
    public Object L$4;
    public RouteLineExpressionEventData L$5;
    public RouteLineExpressionEventData L$6;
    public RouteLineTrimOffset L$7;
    public RouteLineExpressionEventData L$8;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return zznb.toData((RouteLineDynamicData) null, (TextAnnouncementContentCardView) null, (RouteLineViewOptionsData) null, this);
    }

    public RouteLineDataConverterKt$toData$2(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
