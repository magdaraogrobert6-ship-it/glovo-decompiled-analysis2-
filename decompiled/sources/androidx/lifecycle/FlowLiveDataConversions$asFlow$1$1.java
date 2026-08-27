package androidx.lifecycle;

import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.ui.graphics.Fields;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon;
import androidx.transition.TransitionValuesMaps;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.deliveryhero.chatui.data.datasource.ImageCacheResolverImpl;
import com.deliveryhero.chatui.view.root.CustomerChatViewModel;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.ui.WebChatViewmodel;
import com.foodora.courier.delivery.service.DeliveryService;
import com.google.android.gms.internal.mlkit_vision_face.zzli;
import com.huawei.location.nlp.scan.FB;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.geojson.Point;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteLegProgress;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.base.trip.model.RouteStepProgress;
import com.mapbox.navigation.base.trip.model.TripNotificationState$TripNotificationData;
import com.mapbox.navigation.base.trip.notification.NotificationAction;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$monitorNotificationActionButton$1$WhenMappings;
import com.mapbox.navigation.core.accounts.BillingController$onExternalRouteSet$newWaypoints$1;
import com.mapbox.navigation.core.trip.service.MapboxTripService;
import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.mapbox.navigation.core.trip.session.LocationObserver;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.core.trip.session.RouteProgressObserver;
import com.mapbox.navigation.ui.maps.internal.route.line.MapboxRouteLineUtils;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiOptionsEventValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiUpdateTraveledRouteLineValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineApiUpdateWithRouteProgressValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewEvent;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewInitialOptionsValue;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.RouteLineHistoryRecordingViewSender;
import com.mapbox.navigation.ui.maps.route.line.api.HeavyRouteLineValueProvider;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.mapbox.navigation.ui.maps.route.line.model.MapboxRouteLineApiOptions;
import com.mapbox.navigation.ui.maps.route.line.model.RouteFeatureData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineExpressionData;
import com.mapbox.navigator.FallbackVersionsObserver;
import com.mapbox.navigator.RoadObjectPassInfo;
import com.mapbox.navigator.RoadObjectType;
import com.sentiance.core.model.thrift.k$c;
import io.reactivex.disposables.Disposable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractClickableNodehandlePressInteractionRelease11;
import o.BackspaceCommand;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.LayerSnapshotV22;
import o.RegistryNoModelLoaderAvailableException;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.TextAnnouncementContentCardView;
import o.VectorPropertyPathData;
import o.VectorPropertyScaleX;
import o.WebViewRenderProcessClientFrameworkAdapter;
import o.accessunregisterComponentCallback;
import o.applyAlpha;
import o.backwardFocusSearch;
import o.configureShadowFoewPVk;
import o.createFromParcel;
import o.getCacheBitmapConfig_sVssgQui;
import o.getCollapse;
import o.getContentViewGroupParentLayout;
import o.getHasNonTranslationComponentsannotations;
import o.getMayRenderInSoftware;
import o.getOrElse;
import o.getTraverseKey;
import o.getViewportSizeNHjbRcui;
import o.hideCurrentlyDisplayingInAppMessage;
import o.invokepweu1eQ;
import o.isIdentityannotations;
import o.isRoot;
import o.obtainSizePxVpY3zN4;
import o.onContentCardDismissed;
import o.onImageAvailable;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.parseFourDigits;
import o.r8lambda3bU44Zoh4poQG1b9BbDBVanKQ;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resetTransientState;
import o.screenToLocalMKHz9U;
import o.seekToStartTag;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.setCarryoverInAppMessage;
import o.sourceInformationContextOfdefault;
import o.unregisterComponentCallback;
import o.updateClipPath;
import o.updateMatrix;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class FlowLiveDataConversions$asFlow$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1$1(WebChatViewmodel webChatViewmodel, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = 12;
        this.IconCompatParcelizer = webChatViewmodel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowLiveDataConversions$asFlow$1$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowLiveDataConversions$asFlow$1$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowLiveDataConversions$asFlow$1$1(Throwable th, ShortNewsContentCardView shortNewsContentCardView, Object obj, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = th;
        this.IconCompatParcelizer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 85;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        switch (i5) {
            case 0:
                return new FlowLiveDataConversions$asFlow$1$1((accessunregisterComponentCallback) this.RemoteActionCompatParcelizer, (AbstractClickableNodehandlePressInteractionRelease11) obj2, shortNewsContentCardView, 0);
            case 1:
                FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$1 = new FlowLiveDataConversions$asFlow$1$1((getTraverseKey) obj2, shortNewsContentCardView, 1);
                flowLiveDataConversions$asFlow$1$1.RemoteActionCompatParcelizer = obj;
                return flowLiveDataConversions$asFlow$1$1;
            case 2:
                return new FlowLiveDataConversions$asFlow$1$1((accessunregisterComponentCallback) this.RemoteActionCompatParcelizer, (unregisterComponentCallback) obj2, shortNewsContentCardView, i);
            case 3:
                FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$2 = new FlowLiveDataConversions$asFlow$1$1((MeasurementManagerImplCommon) obj2, shortNewsContentCardView, 3);
                flowLiveDataConversions$asFlow$1$2.RemoteActionCompatParcelizer = obj;
                return flowLiveDataConversions$asFlow$1$2;
            case 4:
                return new FlowLiveDataConversions$asFlow$1$1((ImageCacheResolverImpl) this.RemoteActionCompatParcelizer, (Uri) obj2, shortNewsContentCardView, 4);
            case 5:
                return new FlowLiveDataConversions$asFlow$1$1((Throwable) this.RemoteActionCompatParcelizer, shortNewsContentCardView, (CustomerChatViewModel) obj2, 5);
            case 6:
                return new FlowLiveDataConversions$asFlow$1$1((RegistryNoModelLoaderAvailableException) this.RemoteActionCompatParcelizer, (applyAlpha) obj2, shortNewsContentCardView, 6);
            case 7:
                FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$3 = new FlowLiveDataConversions$asFlow$1$1((Map) obj2, shortNewsContentCardView, 7);
                flowLiveDataConversions$asFlow$1$3.RemoteActionCompatParcelizer = obj;
                int i6 = write + 95;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return flowLiveDataConversions$asFlow$1$3;
            case 8:
                return new FlowLiveDataConversions$asFlow$1$1((updateMatrix) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 8);
            case 9:
                return new FlowLiveDataConversions$asFlow$1$1((TransitionValuesMaps) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 9);
            case 10:
                return new FlowLiveDataConversions$asFlow$1$1((obtainSizePxVpY3zN4) this.RemoteActionCompatParcelizer, (getCacheBitmapConfig_sVssgQui) obj2, shortNewsContentCardView, 10);
            case 11:
                return new FlowLiveDataConversions$asFlow$1$1((Throwable) this.RemoteActionCompatParcelizer, shortNewsContentCardView, (obtainSizePxVpY3zN4) obj2, 11);
            case 12:
                FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$4 = new FlowLiveDataConversions$asFlow$1$1((WebChatViewmodel) obj2, shortNewsContentCardView);
                flowLiveDataConversions$asFlow$1$4.RemoteActionCompatParcelizer = obj;
                return flowLiveDataConversions$asFlow$1$4;
            case 13:
                return new FlowLiveDataConversions$asFlow$1$1((WebViewRenderProcessClientFrameworkAdapter) this.RemoteActionCompatParcelizer, (DeliveryService) obj2, shortNewsContentCardView, 13);
            case 14:
                FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$5 = new FlowLiveDataConversions$asFlow$1$1((k$c) obj2, shortNewsContentCardView, 14);
                flowLiveDataConversions$asFlow$1$5.RemoteActionCompatParcelizer = obj;
                return flowLiveDataConversions$asFlow$1$5;
            case 15:
                FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$6 = new FlowLiveDataConversions$asFlow$1$1((MapboxNavigation) obj2, shortNewsContentCardView, 15);
                flowLiveDataConversions$asFlow$1$6.RemoteActionCompatParcelizer = obj;
                return flowLiveDataConversions$asFlow$1$6;
            case 16:
                return new FlowLiveDataConversions$asFlow$1$1((MapboxTripSession) this.RemoteActionCompatParcelizer, (String) obj2, shortNewsContentCardView, 16);
            case 17:
                return new FlowLiveDataConversions$asFlow$1$1((MapboxTripSession) this.RemoteActionCompatParcelizer, (List) obj2, shortNewsContentCardView, 17);
            case 18:
                return new FlowLiveDataConversions$asFlow$1$1((LocationObserver) this.RemoteActionCompatParcelizer, (LocationMatcherResult) obj2, shortNewsContentCardView, 18);
            case 19:
                return new FlowLiveDataConversions$asFlow$1$1((MapboxTripSession) this.RemoteActionCompatParcelizer, (RouteProgress) obj2, shortNewsContentCardView, 19);
            case 20:
                return new FlowLiveDataConversions$asFlow$1$1((RouteProgressObserver) this.RemoteActionCompatParcelizer, (RouteProgress) obj2, shortNewsContentCardView, 20);
            case 21:
                FlowLiveDataConversions$asFlow$1$1 flowLiveDataConversions$asFlow$1$7 = new FlowLiveDataConversions$asFlow$1$1((RoadObjectPassInfo) obj2, shortNewsContentCardView, 21);
                flowLiveDataConversions$asFlow$1$7.RemoteActionCompatParcelizer = obj;
                return flowLiveDataConversions$asFlow$1$7;
            case 22:
                return new FlowLiveDataConversions$asFlow$1$1((DropShadowEffect) this.RemoteActionCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 22);
            case 23:
                return new FlowLiveDataConversions$asFlow$1$1((getOrElse) this.RemoteActionCompatParcelizer, (MapboxRouteLineApiOptions) obj2, shortNewsContentCardView, 23);
            case 24:
                return new FlowLiveDataConversions$asFlow$1$1((getOrElse) this.RemoteActionCompatParcelizer, (Point) obj2, shortNewsContentCardView, 24);
            case 25:
                return new FlowLiveDataConversions$asFlow$1$1((getOrElse) this.RemoteActionCompatParcelizer, (RouteProgress) obj2, shortNewsContentCardView, 25);
            case 26:
                return new FlowLiveDataConversions$asFlow$1$1((RouteLineHistoryRecordingViewSender) this.RemoteActionCompatParcelizer, (RouteLineViewOptionsData) obj2, shortNewsContentCardView, 26);
            case 27:
                return new FlowLiveDataConversions$asFlow$1$1((HeavyRouteLineValueProvider) this.RemoteActionCompatParcelizer, (RouteLineViewOptionsData) obj2, shortNewsContentCardView, 27);
            case 28:
                return new FlowLiveDataConversions$asFlow$1$1((RouteFeatureData) this.RemoteActionCompatParcelizer, (MapboxRouteLineApi) obj2, shortNewsContentCardView, 28);
            default:
                return new FlowLiveDataConversions$asFlow$1$1((BillingController$onExternalRouteSet$newWaypoints$1) this.RemoteActionCompatParcelizer, (RouteLineExpressionData) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = 2 % 2;
        int i2 = write + 47;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = null;
        switch (i4) {
            case 0:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 1:
                return ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 3:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                throw null;
            case 4:
                return ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 6:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 7:
                ((FlowLiveDataConversions$asFlow$1$1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 8:
                return ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 11:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 12:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 13:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = write + 5;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return createfromparcel;
                }
                obj3.hashCode();
                throw null;
            case 14:
                ((FlowLiveDataConversions$asFlow$1$1) create((r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 15:
                ((FlowLiveDataConversions$asFlow$1$1) create((NotificationAction) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 16:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 17:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 18:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 19:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 20:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 21:
                if (obj != null) {
                    throw new ClassCastException();
                }
                int i6 = write + 41;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ((FlowLiveDataConversions$asFlow$1$1) create(null, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                throw null;
            case 22:
                ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 23:
                return ((FlowLiveDataConversions$asFlow$1$1) create((TextAnnouncementContentCardView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((FlowLiveDataConversions$asFlow$1$1) create((TextAnnouncementContentCardView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((FlowLiveDataConversions$asFlow$1$1) create((TextAnnouncementContentCardView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((FlowLiveDataConversions$asFlow$1$1) create((TextAnnouncementContentCardView) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((FlowLiveDataConversions$asFlow$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0502  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object obj2;
        Long lValueOf;
        Long l;
        Object obj3;
        getCollapse tripNotificationState$TripNotificationData;
        int i = 2 % 2;
        int i2 = this.serializer;
        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.IconCompatParcelizer;
        boolean z = false;
        ?? r11 = 0;
        getCollapse tripNotificationState$TripNotificationData2 = null;
        parsefourdigits = null;
        parseFourDigits parsefourdigits = null;
        l = null;
        Long l2 = null;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((accessunregisterComponentCallback) this.RemoteActionCompatParcelizer).read((AbstractClickableNodehandlePressInteractionRelease11) obj4);
                return createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
                getTraverseKey gettraversekey = (getTraverseKey) obj4;
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) gettraversekey.RemoteActionCompatParcelizer.getAndSet(null);
                AtomicReference atomicReference = gettraversekey.RemoteActionCompatParcelizer;
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new BlockRunner$maybeRun$1(setallviewgroupchildrenasnonaccessibilityimportantlambda0, gettraversekey, r11, 15), 3);
                while (!atomicReference.compareAndSet(null, r8lambda7q1qcwxcuhrhcsgrauldg_ksbguRemoteActionCompatParcelizer)) {
                    if (atomicReference.get() != null) {
                        return Boolean.valueOf(z);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((accessunregisterComponentCallback) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer((unregisterComponentCallback) obj4);
                return createfromparcel;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Cursor cursorQuery = ((ImageCacheResolverImpl) this.RemoteActionCompatParcelizer).read.getContentResolver().query((Uri) obj4, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        int columnIndex = cursorQuery.getColumnIndex("_size");
                        if (columnIndex != -1 && cursorQuery.moveToFirst()) {
                            l2 = new Long(cursorQuery.getLong(columnIndex));
                        }
                        cursorQuery.close();
                        r11 = l2;
                        break;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{cursorQuery, th}, sourceInformationContextOfdefault.read());
                            throw th2;
                        }
                    }
                }
                return r11;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Throwable th3 = (Throwable) this.RemoteActionCompatParcelizer;
                CustomerChatViewModel customerChatViewModel = (CustomerChatViewModel) obj4;
                onImageAvailable onimageavailable = customerChatViewModel.RemoteActionCompatParcelizer;
                isIdentityannotations isidentityannotations = onimageavailable.serializer;
                if (isidentityannotations != null) {
                    isidentityannotations.RemoteActionCompatParcelizer(LayerSnapshotV22.ERROR, "WEB_CHAT_OPEN_ERROR", "Fetch ChatID endpoint failed", th3);
                }
                getHasNonTranslationComponentsannotations gethasnontranslationcomponentsannotations = onimageavailable.read;
                if (gethasnontranslationcomponentsannotations != null) {
                    int i3 = read + 7;
                    write = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    gethasnontranslationcomponentsannotations.write("chat_e2e_tap_to_page_loaded");
                    gethasnontranslationcomponentsannotations.write("chat_native_tap_to_web_start");
                    gethasnontranslationcomponentsannotations.write("chat_native_before_load_url");
                    gethasnontranslationcomponentsannotations.write("chat_native_activity_get_chat_id");
                    gethasnontranslationcomponentsannotations.IconCompatParcelizer();
                }
                MutableStateFlow mutableStateFlow = customerChatViewModel.write;
                do {
                    obj2 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, getMayRenderInSoftware.read((getMayRenderInSoftware) obj2, false, true, null, null, 12)));
                int i5 = write + 3;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return createfromparcel;
                }
                throw null;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ((FileOutputStream) ((RegistryNoModelLoaderAvailableException) this.RemoteActionCompatParcelizer).read).write(setCarryoverInAppMessage.RatingCompat(resetTransientState.read.RemoteActionCompatParcelizer(applyAlpha.Companion.serializer(), (applyAlpha) obj4)));
                return createfromparcel;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.RemoteActionCompatParcelizer;
                for (Map.Entry entry : ((Map) obj4).entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    isRoot isroot = (isRoot) RangesKt.read(220732900, BackspaceCommand.write(), BackspaceCommand.write(), new Object[]{str}, BackspaceCommand.write(), -220732894, BackspaceCommand.write());
                    backwardfocussearch.getClass();
                    backwardfocussearch.serializer(isroot, str2);
                }
                return createfromparcel;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                updateMatrix updatematrix = (updateMatrix) this.RemoteActionCompatParcelizer;
                ConcurrentHashMap concurrentHashMap = updatematrix.serializer;
                if (concurrentHashMap.isEmpty()) {
                    int i6 = write + 73;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        r11.hashCode();
                        throw null;
                    }
                } else {
                    String str3 = (String) obj4;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        String str4 = (String) entry2.getKey();
                        configureShadowFoewPVk configureshadowfoewpvk = (configureShadowFoewPVk) entry2.getValue();
                        if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str4, "##").equals(str3) && configureshadowfoewpvk != null && (configureshadowfoewpvk.serializer == null || configureshadowfoewpvk.IconCompatParcelizer != null)) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        int i7 = write + 71;
                        read = i7 % Fields.SpotShadowColor;
                        int i8 = i7 % 2;
                        configureShadowFoewPVk configureshadowfoewpvk2 = (configureShadowFoewPVk) ((Map.Entry) it.next()).getValue();
                        if (configureshadowfoewpvk2 == null || (l = configureshadowfoewpvk2.serializer) == null) {
                            lValueOf = null;
                        } else {
                            int i9 = read + 119;
                            write = i9 % Fields.SpotShadowColor;
                            int i10 = i9 % 2;
                            long jLongValue = l.longValue();
                            Long l3 = configureshadowfoewpvk2.IconCompatParcelizer;
                            if (l3 != null) {
                                lValueOf = Long.valueOf(l3.longValue() - jLongValue);
                            } else {
                                lValueOf = null;
                            }
                        }
                        if (lValueOf != null) {
                            arrayList.add(lValueOf);
                        }
                    }
                    List listSerializer = onContentCardDismissed.serializer(arrayList, new FB(8));
                    if (listSerializer.isEmpty()) {
                        int i11 = write + 45;
                        read = i11 % Fields.SpotShadowColor;
                        if (i11 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        long jLongValue2 = ((Number) screenToLocalMKHz9U.serializer(50, listSerializer)).longValue();
                        long jLongValue3 = ((Number) screenToLocalMKHz9U.serializer(75, listSerializer)).longValue();
                        long jLongValue4 = ((Number) screenToLocalMKHz9U.serializer(95, listSerializer)).longValue();
                        Long l4 = (Long) onContentCardDismissed.MediaSessionCompatQueueItem((Iterable) listSerializer);
                        parsefourdigits = new parseFourDigits(jLongValue2, jLongValue3, jLongValue4, l4 != null ? l4.longValue() : 0L);
                        Iterator it2 = linkedHashMap.entrySet().iterator();
                        while (it2.hasNext()) {
                            concurrentHashMap.remove(((Map.Entry) it2.next()).getKey());
                        }
                        HashMap map = updatematrix.read;
                        for (Map.Entry entry3 : map.entrySet()) {
                            ((View) entry3.getKey()).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) entry3.getValue());
                        }
                        map.clear();
                    }
                }
                return parsefourdigits;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                TransitionValuesMaps transitionValuesMaps = (TransitionValuesMaps) this.RemoteActionCompatParcelizer;
                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) transitionValuesMaps.RatingCompat;
                updateClipPath updateclippath = (updateClipPath) ((LinkedHashMap) transitionValuesMaps.MediaMetadataCompat).remove((String) obj4);
                if (updateclippath == null) {
                    return simpleItemTouchHelperCallback;
                }
                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = updateclippath.write;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                Map mapSerializer = onMove.serializer(updateclippath.RemoteActionCompatParcelizer);
                List listPlaybackStateCompatCustomAction = onContentCardDismissed.PlaybackStateCompatCustomAction(onContentCardDismissed.PlaybackStateCompat(updateclippath.IconCompatParcelizer));
                if (listPlaybackStateCompatCustomAction.isEmpty()) {
                    return onMove.serializer(mapSerializer, onviewattachedtowindowlambda0);
                }
                Long l5 = (Long) onContentCardDismissed.MediaSessionCompatQueueItem((Iterable) listPlaybackStateCompatCustomAction);
                return onMove.RemoteActionCompatParcelizer(mapSerializer, onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("smu_on_resume_".concat("p50"), screenToLocalMKHz9U.serializer(50, listPlaybackStateCompatCustomAction)), new onViewAttachedToWindowlambda0("smu_on_resume_".concat("p90"), screenToLocalMKHz9U.serializer(90, listPlaybackStateCompatCustomAction)), new onViewAttachedToWindowlambda0("smu_on_resume_".concat("max"), new Long(l5 != null ? l5.longValue() : 0L)), onviewattachedtowindowlambda0));
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                obtainSizePxVpY3zN4 obtainsizepxvpy3zn4 = (obtainSizePxVpY3zN4) this.RemoteActionCompatParcelizer;
                String strRemoteActionCompatParcelizer = getViewportSizeNHjbRcui.IconCompatParcelizer.RemoteActionCompatParcelizer(invokepweu1eQ.RemoteActionCompatParcelizer, (getCacheBitmapConfig_sVssgQui) obj4);
                WebView webView = obtainsizepxvpy3zn4.PlaybackStateCompat;
                if (webView != null) {
                    webView.evaluateJavascript("window.sendBridgeMessageFromAndroid(" + strRemoteActionCompatParcelizer + ')', null);
                }
                return createfromparcel;
            case 11:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Throwable th4 = (Throwable) this.RemoteActionCompatParcelizer;
                isIdentityannotations isidentityannotations2 = ((obtainSizePxVpY3zN4) obj4).serializer.serializer;
                if (isidentityannotations2 != null) {
                    int i12 = read + 11;
                    write = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        isidentityannotations2.serializer("WEB_CHAT_TRACKING_ERROR_EVENT", simpleItemTouchHelperCallback, th4);
                        throw null;
                    }
                    isidentityannotations2.serializer("WEB_CHAT_TRACKING_ERROR_EVENT", simpleItemTouchHelperCallback, th4);
                }
                return createfromparcel;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow2 = ((WebChatViewmodel) obj4).r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                do {
                    obj3 = mutableStateFlow2.read();
                } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj3, null, false, false, VectorPropertyPathData.write, false, 18)));
                return createfromparcel;
            case 13:
                DeliveryService deliveryService = (DeliveryService) obj4;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i13 = seekToStartTag.read[((WebViewRenderProcessClientFrameworkAdapter) this.RemoteActionCompatParcelizer).ordinal()];
                if (i13 == 1) {
                    deliveryService.IconCompatParcelizer().serializer();
                    return createfromparcel;
                }
                if (i13 == 2) {
                    deliveryService.IconCompatParcelizer().read();
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            case 14:
                r8lambda3bU44Zoh4poQG1b9BbDBVanKQ r8lambda3bu44zoh4poqg1b9bbdbvankq = (r8lambda3bU44Zoh4poQG1b9BbDBVanKQ) this.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DeviceStateChange called , state is  " + r8lambda3bu44zoh4poqg1b9bbdbvankq, new Object[0]);
                k$c k_c = (k$c) obj4;
                Disposable disposable = (Disposable) k_c.serializer;
                if (disposable != null) {
                    disposable.dispose();
                }
                if (r8lambda3bu44zoh4poqg1b9bbdbvankq == r8lambda3bU44Zoh4poQG1b9BbDBVanKQ.AVAILABLE) {
                    k_c.serializer = k_c.startTimer();
                } else {
                    k_c.MediaBrowserCompatMediaItem = null;
                }
                int i14 = read + 51;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    int i15 = 70 / 0;
                }
                return createfromparcel;
            case 15:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (MapboxNavigation$monitorNotificationActionButton$1$WhenMappings.$EnumSwitchMapping$0[((NotificationAction) this.RemoteActionCompatParcelizer).ordinal()] == 1) {
                    ((MapboxNavigation) obj4).tripSession.stop();
                }
                return createfromparcel;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                String str5 = (String) obj4;
                Iterator it3 = ((MapboxTripSession) this.RemoteActionCompatParcelizer).fallbackVersionsObservers.iterator();
                while (it3.hasNext()) {
                    ((FallbackVersionsObserver) it3.next()).onCanReturnToLatest(str5);
                }
                return createfromparcel;
            case 17:
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                List<String> list = (List) obj4;
                Iterator it4 = ((MapboxTripSession) this.RemoteActionCompatParcelizer).fallbackVersionsObservers.iterator();
                while (!(!it4.hasNext())) {
                    ((FallbackVersionsObserver) it4.next()).onFallbackVersionsFound(list);
                }
                return createfromparcel;
            case 18:
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                LocationObserver locationObserver = (LocationObserver) this.RemoteActionCompatParcelizer;
                String strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(70, locationObserver.getClass().getName());
                PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
                String strConcat = "MapboxTripSession#locationObserver#".concat(strIconCompatParcelizer);
                LocationMatcherResult locationMatcherResult = (LocationMatcherResult) obj4;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted(strConcat);
                    try {
                        long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                        locationObserver.onNewLocationMatcherResult(locationMatcherResult);
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(strConcat, new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                    } catch (Throwable th5) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(strConcat, null);
                        throw th5;
                    }
                } else {
                    locationObserver.onNewLocationMatcherResult(locationMatcherResult);
                }
                return createfromparcel;
            case 19:
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PerformanceTracker performanceTracker2 = PerformanceTracker.INSTANCE;
                MapboxTripService mapboxTripService = ((MapboxTripSession) this.RemoteActionCompatParcelizer).tripService;
                RouteProgress routeProgress = (RouteProgress) obj4;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted("MapboxTripSession#updateRouteProgress-update-notification");
                    try {
                        long jWrite2 = BrazeInAppMessageManagerWhenMappings.write();
                        if (routeProgress != null) {
                            RouteLegProgress routeLegProgress = routeProgress.currentLegProgress;
                            RouteStepProgress routeStepProgress = routeLegProgress.currentStepProgress;
                            BannerInstructions bannerInstructions = routeProgress.bannerInstructions;
                            double d = routeStepProgress.distanceRemaining;
                            double d2 = routeLegProgress.durationRemaining;
                            LegStep legStep = routeStepProgress.step;
                            tripNotificationState$TripNotificationData = new TripNotificationState$TripNotificationData(bannerInstructions, Double.valueOf(d), Double.valueOf(d2), legStep != null ? legStep.drivingSide() : null);
                        } else {
                            tripNotificationState$TripNotificationData = null;
                        }
                        if (tripNotificationState$TripNotificationData == null) {
                            tripNotificationState$TripNotificationData = new getCollapse() { // from class: com.mapbox.navigation.base.trip.model.TripNotificationState$TripNotificationFreeState
                                public final boolean equals(Object obj5) {
                                    return this == obj5;
                                }

                                public final int hashCode() {
                                    return System.identityHashCode(this);
                                }
                            };
                        }
                        mapboxTripService.notificationChannel.b_(tripNotificationState$TripNotificationData);
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateRouteProgress-update-notification", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite2)));
                    } catch (Throwable th6) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("MapboxTripSession#updateRouteProgress-update-notification", null);
                        throw th6;
                    }
                } else {
                    if (routeProgress != null) {
                        RouteLegProgress routeLegProgress2 = routeProgress.currentLegProgress;
                        RouteStepProgress routeStepProgress2 = routeLegProgress2.currentStepProgress;
                        BannerInstructions bannerInstructions2 = routeProgress.bannerInstructions;
                        double d3 = routeStepProgress2.distanceRemaining;
                        double d4 = routeLegProgress2.durationRemaining;
                        LegStep legStep2 = routeStepProgress2.step;
                        tripNotificationState$TripNotificationData2 = new TripNotificationState$TripNotificationData(bannerInstructions2, Double.valueOf(d3), Double.valueOf(d4), legStep2 != null ? legStep2.drivingSide() : null);
                    }
                    if (tripNotificationState$TripNotificationData2 == null) {
                        tripNotificationState$TripNotificationData2 = new getCollapse() { // from class: com.mapbox.navigation.base.trip.model.TripNotificationState$TripNotificationFreeState
                            public final boolean equals(Object obj5) {
                                return this == obj5;
                            }

                            public final int hashCode() {
                                return System.identityHashCode(this);
                            }
                        };
                    }
                    mapboxTripService.notificationChannel.b_(tripNotificationState$TripNotificationData2);
                }
                return createfromparcel;
            case 20:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouteProgressObserver routeProgressObserver = (RouteProgressObserver) this.RemoteActionCompatParcelizer;
                String strIconCompatParcelizer2 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(70, routeProgressObserver.getClass().getName());
                PerformanceTracker performanceTracker3 = PerformanceTracker.INSTANCE;
                String strConcat2 = "MapboxTripSession#routeProgressObserver#".concat(strIconCompatParcelizer2);
                RouteProgress routeProgress2 = (RouteProgress) obj4;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted(strConcat2);
                    try {
                        long jWrite3 = BrazeInAppMessageManagerWhenMappings.write();
                        routeProgressObserver.onRouteProgressChanged(routeProgress2);
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(strConcat2, new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite3)));
                    } catch (Throwable th7) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y(strConcat2, null);
                        throw th7;
                    }
                } else {
                    routeProgressObserver.onRouteProgressChanged(routeProgress2);
                }
                return createfromparcel;
            case 21:
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (this.RemoteActionCompatParcelizer != null) {
                    throw new ClassCastException();
                }
                RoadObjectPassInfo roadObjectPassInfo = (RoadObjectPassInfo) obj4;
                roadObjectPassInfo.getRoadObjectId().getClass();
                RoadObjectType type = roadObjectPassInfo.getType();
                type.getClass();
                zzli.mapToRoadObjectType(type);
                throw null;
            case 22:
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                PerformanceTracker performanceTracker4 = PerformanceTracker.INSTANCE;
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) ((DropShadowEffect) this.RemoteActionCompatParcelizer).write;
                if (PerformanceTracker.getTrackingIsActive()) {
                    PerformanceTracker.syncSectionStarted("EHorizon.notifyAllObservers");
                    try {
                        long jWrite4 = BrazeInAppMessageManagerWhenMappings.write();
                        Iterator it5 = copyOnWriteArraySet.iterator();
                        if (it5.hasNext()) {
                            it5.next().getClass();
                            throw new ClassCastException();
                        }
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("EHorizon.notifyAllObservers", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite4)));
                    } catch (Throwable th8) {
                        PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("EHorizon.notifyAllObservers", null);
                        throw th8;
                    }
                } else {
                    Iterator it6 = copyOnWriteArraySet.iterator();
                    if (it6.hasNext()) {
                        throw ff$$ExternalSyntheticOutline0.m(it6);
                    }
                }
                return createfromparcel;
            case 23:
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new RouteLineApiEvent((String) ((getOrElse) this.RemoteActionCompatParcelizer).gson, new RouteLineApiOptionsEventValue((MapboxRouteLineApiOptions) obj4));
            case 24:
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new RouteLineApiEvent((String) ((getOrElse) this.RemoteActionCompatParcelizer).gson, new RouteLineApiUpdateTraveledRouteLineValue((Point) obj4));
            case 25:
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouteProgress routeProgress3 = (RouteProgress) obj4;
                return new RouteLineApiEvent((String) ((getOrElse) this.RemoteActionCompatParcelizer).gson, new RouteLineApiUpdateWithRouteProgressValue(routeProgress3.navigationRoute.id, routeProgress3.currentRouteGeometryIndex, routeProgress3.currentState, new Integer(routeProgress3.currentLegProgress.legIndex)));
            case 26:
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return new RouteLineViewEvent((String) ((RouteLineHistoryRecordingViewSender) this.RemoteActionCompatParcelizer).gson, new RouteLineViewInitialOptionsValue((RouteLineViewOptionsData) obj4));
            case 27:
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object objInvoke = ((HeavyRouteLineValueProvider) this.RemoteActionCompatParcelizer).workerThreadExpressionGenerator.invoke((RouteLineViewOptionsData) obj4);
                int i16 = write + 85;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                return objInvoke;
            case 28:
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                NavigationRoute navigationRoute = ((RouteFeatureData) this.RemoteActionCompatParcelizer).route;
                MapboxRouteLineApi mapboxRouteLineApi = (MapboxRouteLineApi) obj4;
                MapboxRouteLineUtils mapboxRouteLineUtils = MapboxRouteLineUtils.INSTANCE;
                return MapboxRouteLineUtils.calculateRouteLineSegments(navigationRoute, mapboxRouteLineApi.trafficBackfillRoadClasses, true, mapboxRouteLineApi.routeLineOptions);
            default:
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((BillingController$onExternalRouteSet$newWaypoints$1) this.RemoteActionCompatParcelizer).invoke((RouteLineExpressionData) obj4);
        }
    }
}
