package com.mapbox.navigation.ui.maps.internal.route.line;

import com.google.android.gms.internal.mlkit_vision_face.zznb;
import com.mapbox.navigation.ui.maps.route.line.model.RouteSetValue;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineDataConverterKt$toEventValue$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Collection L$3;
    public Iterator L$4;
    public RouteLineEventData L$5;
    public Collection L$6;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return zznb.toEventValue((RouteSetValue) null, (TextAnnouncementContentCardView) null, (RouteLineViewOptionsData) null, this);
    }

    public RouteLineDataConverterKt$toEventValue$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
