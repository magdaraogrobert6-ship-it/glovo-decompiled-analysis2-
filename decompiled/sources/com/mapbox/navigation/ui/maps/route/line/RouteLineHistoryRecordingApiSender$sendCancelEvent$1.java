package com.mapbox.navigation.ui.maps.route.line;

import coil3.ExtrasKt;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiCancelValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiClearRouteLineValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getOrElse;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineHistoryRecordingApiSender$sendCancelEvent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ getOrElse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RouteLineHistoryRecordingApiSender$sendCancelEvent$1(getOrElse getorelse, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.$r8$classId = i;
        this.this$0 = getorelse;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((RouteLineHistoryRecordingApiSender$sendCancelEvent$1) create(textAnnouncementContentCardView, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((RouteLineHistoryRecordingApiSender$sendCancelEvent$1) create(textAnnouncementContentCardView, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        getOrElse getorelse = this.this$0;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return new RouteLineApiEvent((String) getorelse.gson, new RouteLineApiClearRouteLineValue());
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return new RouteLineApiEvent((String) getorelse.gson, new RouteLineApiCancelValue());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return this.$r8$classId != 0 ? new RouteLineHistoryRecordingApiSender$sendCancelEvent$1(this.this$0, shortNewsContentCardView, 1) : new RouteLineHistoryRecordingApiSender$sendCancelEvent$1(this.this$0, shortNewsContentCardView, 0);
    }
}
