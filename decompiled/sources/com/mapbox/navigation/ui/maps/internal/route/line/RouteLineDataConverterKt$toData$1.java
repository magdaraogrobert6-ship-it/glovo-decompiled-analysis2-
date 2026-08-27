package com.mapbox.navigation.ui.maps.internal.route.line;

import com.google.android.gms.internal.mlkit_vision_face.zznb;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineData;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineDataConverterKt$toData$1 extends ContinuationImpl {
    public FeatureCollection L$0;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return zznb.toData((RouteLineData) null, (TextAnnouncementContentCardView) null, (RouteLineViewOptionsData) null, this);
    }

    public RouteLineDataConverterKt$toData$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
