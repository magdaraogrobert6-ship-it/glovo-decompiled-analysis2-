package com.mapbox.navigation.core.reroute;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.lifecycle.BlockRunner;
import coil3.ExtrasKt;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.mapbox.common.Cancelable;
import com.mapbox.navigation.core.internal.router.OngoingRequest;
import com.mapbox.navigation.core.routerefresh.RouteRefresher;
import com.mapbox.navigation.ui.utils.internal.resource.DefaultResourceLoader;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.clearTmpDetachFlag;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRerouteController$requestAsync$2$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long $requestId;
    public final /* synthetic */ Object this$0;

    /* JADX INFO: renamed from: com.mapbox.navigation.core.reroute.MapboxRerouteController$requestAsync$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ long $requestId;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.$r8$classId = i;
            this.this$0 = obj;
            this.$requestId = j;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i2 == 0) {
                ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = write + 17;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return createfromparcel;
            }
            if (i2 != 1) {
                ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                return createfromparcel;
            }
            ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = write + 123;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = write + 53;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i3 = this.$r8$classId;
            Object obj3 = this.this$0;
            if (i3 == 0) {
                return new AnonymousClass1((MapboxRerouteController) obj3, this.$requestId, shortNewsContentCardView, 0);
            }
            if (i3 != 1) {
                return new AnonymousClass1((clearTmpDetachFlag) obj3, this.$requestId, shortNewsContentCardView, 2);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((RouteRefresher) obj3, this.$requestId, shortNewsContentCardView, 1);
            int i4 = RemoteActionCompatParcelizer + 99;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = write + 105;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            long j = this.$requestId;
            Object obj2 = this.this$0;
            if (i4 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((MapboxRerouteController) obj2).directionsSession.cancelRouteRequest(j);
                return createfromparcel;
            }
            String str = null;
            if (i4 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BlockRunner blockRunner = ((RouteRefresher) obj2).routeRefresh.router;
                LinkedHashMap linkedHashMap = (LinkedHashMap) blockRunner.write;
                OngoingRequest ongoingRequest = (OngoingRequest) linkedHashMap.get(Long.valueOf(j));
                if (ongoingRequest != null) {
                    int i5 = RemoteActionCompatParcelizer + 37;
                    write = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    ongoingRequest.onCancel.invoke();
                    linkedHashMap.remove(Long.valueOf(j));
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = ongoingRequest.parsingJob;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                        int i7 = RemoteActionCompatParcelizer + 93;
                        write = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                    }
                }
                blockRunner.getRouter$navigation_release().cancelRouteRefreshRequest(j);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            clearTmpDetachFlag cleartmpdetachflag = (clearTmpDetachFlag) obj2;
            String str2 = (String) cleartmpdetachflag.serializer.IconCompatParcelizer().serializer.get(new Long(j));
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "pickup"}, getCieXyz.write())).booleanValue()) {
                int i9 = RemoteActionCompatParcelizer + 21;
                write = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    throw null;
                }
                str = "order-pickup";
            } else {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "dropoff"}, getCieXyz.write())).booleanValue())) {
                    str = "delivery-confirmed";
                }
            }
            if (str != null) {
                cleartmpdetachflag.read.RemoteActionCompatParcelizer(str, onMove.RemoteActionCompatParcelizer(onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0("delivery_id", String.valueOf(j))), clearTmpDetachFlag.RemoteActionCompatParcelizer(cleartmpdetachflag)));
                int i10 = RemoteActionCompatParcelizer + 99;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            return createfromparcel;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxRerouteController$requestAsync$2$1(long j, Shape shape) {
        super(1);
        this.$r8$classId = 1;
        this.$requestId = j;
        this.this$0 = shape;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        long j = this.$requestId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.this$0;
        if (i == 0) {
            MapboxRerouteController mapboxRerouteController = (MapboxRerouteController) obj2;
            ContextScope contextScope = mapboxRerouteController.mainJobController.scope;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(contextScope, MainDispatcherLoader.read.IconCompatParcelizer(), null, new AnonymousClass1(mapboxRerouteController, this.$requestId, null, 0), 2);
            return createfromparcel;
        }
        if (i != 1) {
            Cancelable cancelable = (Cancelable) ((DefaultResourceLoader) obj2).cancelableMap.remove(Long.valueOf(j));
            if (cancelable != null) {
                cancelable.cancel();
            }
            return createfromparcel;
        }
        InspectorInfo inspectorInfo = (InspectorInfo) obj;
        inspectorInfo.setName("background");
        inspectorInfo.setValue(Color.m712boximpl(j));
        inspectorInfo.getProperties().set(RemoteMessageConst.Notification.COLOR, Color.m712boximpl(j));
        inspectorInfo.getProperties().set("shape", (Shape) obj2);
        return createfromparcel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxRerouteController$requestAsync$2$1(long j, int i, Object obj) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$requestId = j;
    }
}
