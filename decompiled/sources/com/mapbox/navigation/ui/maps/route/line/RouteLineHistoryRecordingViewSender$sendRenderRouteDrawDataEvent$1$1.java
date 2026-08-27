package com.mapbox.navigation.ui.maps.route.line;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zznb;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewDataError;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewExpectedInput;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewRenderRouteDrawDataValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewRenderRouteLineUpdateValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineUpdateValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteSetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ RouteLineViewOptionsData $data;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $styleId;
    public final /* synthetic */ Expected $value;
    public /* synthetic */ Object L$0;
    public String L$1;
    public int label;
    public final /* synthetic */ RouteLineHistoryRecordingViewSender this$0;

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ RouteLineViewOptionsData $data;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ TextAnnouncementContentCardView $workerCoroutineContext;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(RouteLineViewOptionsData routeLineViewOptionsData, TextAnnouncementContentCardView textAnnouncementContentCardView, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.$r8$classId = i;
            this.$data = routeLineViewOptionsData;
            this.$workerCoroutineContext = textAnnouncementContentCardView;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            return i != 0 ? ((AnonymousClass1) create((RouteLineUpdateValue) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create((RouteSetValue) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            TextAnnouncementContentCardView textAnnouncementContentCardView = this.$workerCoroutineContext;
            RouteLineViewOptionsData routeLineViewOptionsData = this.$data;
            if (i != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    RouteLineUpdateValue routeLineUpdateValue = (RouteLineUpdateValue) this.L$0;
                    if (routeLineViewOptionsData == null) {
                        return new RouteLineViewDataError("NoOptions");
                    }
                    this.label = 1;
                    obj = zznb.toEventValue(routeLineUpdateValue, textAnnouncementContentCardView, routeLineViewOptionsData, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return (RouteLineViewExpectedInput) obj;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouteSetValue routeSetValue = (RouteSetValue) this.L$0;
                if (routeLineViewOptionsData == null) {
                    return new RouteLineViewDataError("NoOptions");
                }
                this.label = 1;
                obj = zznb.toEventValue(routeSetValue, textAnnouncementContentCardView, routeLineViewOptionsData, this);
                if (obj == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return (RouteLineViewExpectedInput) obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            if (this.$r8$classId != 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.$workerCoroutineContext, shortNewsContentCardView, 1);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.$data, this.$workerCoroutineContext, shortNewsContentCardView, 0);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1(RouteLineHistoryRecordingViewSender routeLineHistoryRecordingViewSender, String str, Expected expected, RouteLineViewOptionsData routeLineViewOptionsData, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.$r8$classId = i;
        this.this$0 = routeLineHistoryRecordingViewSender;
        this.$styleId = str;
        this.$value = expected;
        this.$data = routeLineViewOptionsData;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1) create(textAnnouncementContentCardView, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1) create(textAnnouncementContentCardView, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i = 1;
        if (this.$r8$classId != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                TextAnnouncementContentCardView textAnnouncementContentCardView = (TextAnnouncementContentCardView) this.L$0;
                str3 = (String) this.this$0.gson;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, textAnnouncementContentCardView, shortNewsContentCardView, i);
                this.L$0 = str3;
                String str5 = this.$styleId;
                this.L$1 = str5;
                this.label = 1;
                Object input = zznb.toInput(this.$value, anonymousClass1, this);
                if (input == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str4 = str5;
                obj = input;
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = this.L$1;
                str3 = (String) this.L$0;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return new RouteLineViewEvent(str3, new RouteLineViewRenderRouteLineUpdateValue(str4, (RouteLineViewExpectedInput) obj));
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TextAnnouncementContentCardView textAnnouncementContentCardView2 = (TextAnnouncementContentCardView) this.L$0;
            str = (String) this.this$0.gson;
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.$data, textAnnouncementContentCardView2, shortNewsContentCardView, 0);
            this.L$0 = str;
            String str6 = this.$styleId;
            this.L$1 = str6;
            this.label = 1;
            Object input2 = zznb.toInput(this.$value, anonymousClass2, this);
            if (input2 == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            str2 = str6;
            obj = input2;
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = this.L$1;
            str = (String) this.L$0;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return new RouteLineViewEvent(str, new RouteLineViewRenderRouteDrawDataValue(str2, (RouteLineViewExpectedInput) obj));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.$r8$classId != 0) {
            RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1 routeLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1 = new RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1(this.this$0, this.$styleId, this.$value, this.$data, shortNewsContentCardView, 1);
            routeLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1.L$0 = obj;
            return routeLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1;
        }
        RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1 routeLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$2 = new RouteLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$1(this.this$0, this.$styleId, this.$value, this.$data, shortNewsContentCardView, 0);
        routeLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$2.L$0 = obj;
        return routeLineHistoryRecordingViewSender$sendRenderRouteDrawDataEvent$1$2;
    }
}
