package com.mapbox.navigation.ui.maps.internal.route.line;

import com.google.android.gms.internal.mlkit_vision_face.zznb;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineUpdateValue;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineDataConverterKt$toEventValue$3 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public RouteLineViewOptionsData L$2;
    public Collection L$3;
    public Iterator L$4;
    public RouteLineDynamicEventData L$5;
    public Collection L$6;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return zznb.toEventValue((RouteLineUpdateValue) null, (TextAnnouncementContentCardView) null, (RouteLineViewOptionsData) null, this);
    }

    public RouteLineDataConverterKt$toEventValue$3(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
