package androidx.navigation.compose;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;
import androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.room.RoomDatabase;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusEvent;
import com.deliveryhero.perseus.data.local.db.entity.HitEventFactory;
import com.huawei.wisesecurity.ucs_credential.x;
import com.logistics.rider.glovo.R;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.api.directions.v5.models.VoiceInstructions;
import com.mapbox.bindgen.DataRef;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentPluginImpl;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.mapbox.navigation.core.internal.router.GetRouteSignature;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;
import com.mapbox.navigation.core.reroute.MapboxRerouteController;
import com.mapbox.navigation.core.reroute.MapboxRerouteController$rerouteInternal$2;
import com.mapbox.navigation.core.reroute.NativeMapboxRerouteController;
import com.mapbox.navigation.ui.maps.internal.route.line.RouteLineViewOptionsData;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineView;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouterOrigin;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase;
import com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.BleScanningLifecycleObserverImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.signature.presentation.SignatureTaskUiModelImpl;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import com.sentiance.core.model.events.H$b;
import io.grpc.internal.MetadataApplierImpl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AndroidGraphicsContext2;
import o.ArrangementHorizontal;
import o.BoringLayoutFactory33ExternalSyntheticApiModelOutline0;
import o.BrazeLogger;
import o.ClipOpCompanion;
import o.Density;
import o.KeepScreenOnNode;
import o.NullableInputConnectionWrapperApi34;
import o.NullableInputConnectionWrapper_androidKt;
import o.OffsetMappingCompanion;
import o.OffsetMappingCompanionIdentity1;
import o.PasswordVisualTransformation;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextMotionCompanion;
import o.TtsAnnotation;
import o.accessgetClipcp;
import o.accessgetSendingFocusAffectingEventp;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.accesssetSpotShadowColor8_81llAjd;
import o.cancelPendingWebViewPause;
import o.clipOutRect;
import o.collectRangeTransitions;
import o.createFromParcel;
import o.cubicTo;
import o.decode;
import o.deleteSurroundingTextInCodePoints;
import o.displayInAppMessagelambda1;
import o.findFollowingBreak;
import o.getBottomCenternOccac;
import o.getContentViewGroupParentLayout;
import o.getDecimalPjHm6EE;
import o.getNone4e0Vf04;
import o.getNormalNSsRyOo;
import o.getQueryContext;
import o.getSubpixelTextPositioningui_text;
import o.hasSameCornerRadius;
import o.isAdapterPositionOnScreen;
import o.isInsideContent;
import o.isItemDismissable;
import o.isOpaque;
import o.isVerticalSwipeInAllowedDirection;
import o.mf;
import o.notifyFocusedRect;
import o.onConnectionClosed;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.performHandwritingGesture;
import o.processAdapterUpdatesAndSetAnimationFlags;
import o.r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.removeScheduledCallback;
import o.resetTransientState;
import o.safeSetClipToOutline;
import o.scrollStep;
import o.setDrawFilter;
import o.setFocusedChild;
import o.setFrom58bKbWc;
import o.setMatrix;
import o.smoothScrollToPosition;
import o.startNestedScroll;
import o.suppressLayout;
import o.toColorLong8_81llA;
import o.wrapper;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class NavHostKt$NavHost$29$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public Object IconCompatParcelizer;
    public int MediaSessionCompatQueueItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public Object serializer;
    public Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$29$1(Object obj, Object obj2, Object obj3, Object obj4, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = obj3;
        this.RemoteActionCompatParcelizer = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00db  */
    /* JADX WARN: Code duplicated, block: B:30:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x0126  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0142  */
    /* JADX WARN: Code duplicated, block: B:68:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$bluetoothscanning$BleScanningLifecycleObserverImpl$scan$2(Object obj) throws Throwable {
        String str;
        Throwable th;
        TextMotionCompanion textMotionCompanion;
        accessgetClipcp accessgetclipcp;
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl;
        TextMotionCompanion textMotionCompanion2;
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl2;
        accessgetClipcp accessgetclipcp2;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaSessionCompatQueueItem;
        if (i != 0) {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.IconCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                textMotionCompanion2 = ((BleScanningLifecycleObserverImpl) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                synchronized (textMotionCompanion2) {
                    List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(textMotionCompanion2.RemoteActionCompatParcelizer);
                }
                Integer num = (Integer) onContentCardDismissed.MediaBrowserCompatMediaItem(listPlaybackStateCompat);
                if (((accessregisterComponentCallback) ((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer).getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    bleScanningLifecycleObserverImpl2 = (BleScanningLifecycleObserverImpl) this.write;
                    if (!bleScanningLifecycleObserverImpl2.MediaMetadataCompat) {
                        accessgetclipcp2 = accessgetClipcp.BLUETOOTH_DISABLED;
                    } else if (!bleScanningLifecycleObserverImpl2.MediaSessionCompatQueueItem) {
                        accessgetclipcp2 = accessgetClipcp.RIDER_OUTSIDE_GEOFENCE;
                    } else if (bleScanningLifecycleObserverImpl2.MediaSessionCompatResultReceiverWrapper) {
                        accessgetclipcp2 = accessgetClipcp.VENDOR_SWITCH;
                    } else {
                        accessgetclipcp2 = accessgetClipcp.ORDER_STATE_CHANGED;
                    }
                } else {
                    accessgetclipcp2 = accessgetClipcp.BACKGROUND;
                }
                ((BleScanningLifecycleObserverImpl) this.write).write.IconCompatParcelizer(str, num, accessgetclipcp2);
                return createfromparcel;
            } catch (Throwable th2) {
                th = th2;
                textMotionCompanion = ((BleScanningLifecycleObserverImpl) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                synchronized (textMotionCompanion) {
                    List listPlaybackStateCompat2 = onContentCardDismissed.PlaybackStateCompat(textMotionCompanion.RemoteActionCompatParcelizer);
                }
                Integer num2 = (Integer) onContentCardDismissed.MediaBrowserCompatMediaItem(listPlaybackStateCompat2);
                if (((accessregisterComponentCallback) ((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer).getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    bleScanningLifecycleObserverImpl = (BleScanningLifecycleObserverImpl) this.write;
                    if (bleScanningLifecycleObserverImpl.MediaMetadataCompat) {
                        accessgetclipcp = accessgetClipcp.BLUETOOTH_DISABLED;
                    } else if (bleScanningLifecycleObserverImpl.MediaSessionCompatQueueItem) {
                        accessgetclipcp = accessgetClipcp.RIDER_OUTSIDE_GEOFENCE;
                    } else if (bleScanningLifecycleObserverImpl.MediaSessionCompatResultReceiverWrapper) {
                        accessgetclipcp = accessgetClipcp.VENDOR_SWITCH;
                    } else {
                        accessgetclipcp = accessgetClipcp.ORDER_STATE_CHANGED;
                    }
                } else {
                    accessgetclipcp = accessgetClipcp.BACKGROUND;
                }
                ((BleScanningLifecycleObserverImpl) this.write).write.IconCompatParcelizer(str, num2, accessgetclipcp);
                throw th;
            }
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        BleScanningLifecycleObserverImpl bleScanningLifecycleObserverImpl3 = (BleScanningLifecycleObserverImpl) this.write;
        bleScanningLifecycleObserverImpl3.MediaSessionCompatResultReceiverWrapper = false;
        getNone4e0Vf04 getnone4e0vf04RemoteActionCompatParcelizer = bleScanningLifecycleObserverImpl3.RatingCompat.RemoteActionCompatParcelizer();
        if (getnone4e0vf04RemoteActionCompatParcelizer == null) {
            return createfromparcel;
        }
        String str2 = ((isInsideContent) this.serializer).id;
        cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
        ((BleScanningLifecycleObserverImpl) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer = getnone4e0vf04RemoteActionCompatParcelizer.rssiPercentileForCalculation;
        getSubpixelTextPositioningui_text getsubpixeltextpositioningui_text = ((BleScanningLifecycleObserverImpl) this.write).write;
        int i2 = getnone4e0vf04RemoteActionCompatParcelizer.scanningStartGeofenceMeters;
        getsubpixeltextpositioningui_text.getClass();
        str2.getClass();
        decode decodeVar = getsubpixeltextpositioningui_text.serializer;
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        safesetcliptooutline.putAll(getsubpixeltextpositioningui_text.IconCompatParcelizer.write());
        safesetcliptooutline.put("vendor_id", str2);
        safesetcliptooutline.put("start_geofence_meters", String.valueOf(i2));
        safesetcliptooutline.put("timestamp", String.valueOf(getsubpixeltextpositioningui_text.read.instant().toEpochMilli()));
        decodeVar.logEvent("ble_scan_started", safesetcliptooutline.IconCompatParcelizer());
        try {
            NetworkFetcher$doFetch$fetchResult$1 networkFetcher$doFetch$fetchResult$1 = new NetworkFetcher$doFetch$fetchResult$1((BleScanningLifecycleObserverImpl) this.write, str2, cancelpendingwebviewpause, getnone4e0vf04RemoteActionCompatParcelizer, null, 4);
            this.IconCompatParcelizer = str2;
            this.MediaSessionCompatQueueItem = 1;
            if (YieldKt.coroutineScope(networkFetcher$doFetch$fetchResult$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            textMotionCompanion2 = ((BleScanningLifecycleObserverImpl) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            synchronized (textMotionCompanion2) {
                List listPlaybackStateCompat3 = onContentCardDismissed.PlaybackStateCompat(textMotionCompanion2.RemoteActionCompatParcelizer);
                Integer num3 = (Integer) onContentCardDismissed.MediaBrowserCompatMediaItem(listPlaybackStateCompat3);
                if (((accessregisterComponentCallback) ((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer).getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    accessgetclipcp2 = accessgetClipcp.BACKGROUND;
                } else {
                    bleScanningLifecycleObserverImpl2 = (BleScanningLifecycleObserverImpl) this.write;
                    if (!bleScanningLifecycleObserverImpl2.MediaMetadataCompat) {
                        accessgetclipcp2 = accessgetClipcp.BLUETOOTH_DISABLED;
                    } else if (!bleScanningLifecycleObserverImpl2.MediaSessionCompatQueueItem) {
                        accessgetclipcp2 = accessgetClipcp.RIDER_OUTSIDE_GEOFENCE;
                    } else if (bleScanningLifecycleObserverImpl2.MediaSessionCompatResultReceiverWrapper) {
                        accessgetclipcp2 = accessgetClipcp.VENDOR_SWITCH;
                    } else {
                        accessgetclipcp2 = accessgetClipcp.ORDER_STATE_CHANGED;
                    }
                }
                ((BleScanningLifecycleObserverImpl) this.write).write.IconCompatParcelizer(str, num3, accessgetclipcp2);
                return createfromparcel;
            }
        } catch (Throwable th3) {
            str = str2;
            th = th3;
            textMotionCompanion = ((BleScanningLifecycleObserverImpl) this.write).r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            synchronized (textMotionCompanion) {
                List listPlaybackStateCompat4 = onContentCardDismissed.PlaybackStateCompat(textMotionCompanion.RemoteActionCompatParcelizer);
                Integer num4 = (Integer) onContentCardDismissed.MediaBrowserCompatMediaItem(listPlaybackStateCompat4);
                if (((accessregisterComponentCallback) ((accessisRenderNodeCompatiblecp) this.RemoteActionCompatParcelizer).getLifecycle()).RatingCompat.isAtLeast(toColorLong8_81llA.STARTED)) {
                    bleScanningLifecycleObserverImpl = (BleScanningLifecycleObserverImpl) this.write;
                    if (bleScanningLifecycleObserverImpl.MediaMetadataCompat) {
                        accessgetclipcp = accessgetClipcp.BLUETOOTH_DISABLED;
                    } else if (bleScanningLifecycleObserverImpl.MediaSessionCompatQueueItem) {
                        accessgetclipcp = accessgetClipcp.RIDER_OUTSIDE_GEOFENCE;
                    } else if (bleScanningLifecycleObserverImpl.MediaSessionCompatResultReceiverWrapper) {
                        accessgetclipcp = accessgetClipcp.VENDOR_SWITCH;
                    } else {
                        accessgetclipcp = accessgetClipcp.ORDER_STATE_CHANGED;
                    }
                } else {
                    accessgetclipcp = accessgetClipcp.BACKGROUND;
                }
                ((BleScanningLifecycleObserverImpl) this.write).write.IconCompatParcelizer(str, num4, accessgetclipcp);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(RoomDatabase roomDatabase, ShortNewsContentCardView shortNewsContentCardView, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(2, shortNewsContentCardView);
        this.read = 7;
        this.serializer = roomDatabase;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(TrackpadScrollingLogic trackpadScrollingLogic, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = 4;
        this.RemoteActionCompatParcelizer = trackpadScrollingLogic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$29$1(Object obj, Object obj2, Object obj3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = obj;
        this.serializer = obj2;
        this.RemoteActionCompatParcelizer = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$29$1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r1.emit(r7, r6) == r3) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$com$roadrunner$delivery$ontheway$crowdsourcing$floating$presentation$ObserveImageSharingUiState$invoke$2$1(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.navigation.compose.NavHostKt$NavHost$29$1.RatingCompat
            int r1 = r1 + 5
            int r2 = r1 % 128
            androidx.navigation.compose.NavHostKt$NavHost$29$1.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L6c
            java.lang.Object r1 = r6.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r6.MediaSessionCompatQueueItem
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 == r5) goto L31
            if (r4 != r0) goto L2b
            int r1 = androidx.navigation.compose.NavHostKt$NavHost$29$1.MediaDescriptionCompat
            int r1 = r1 + 59
            int r2 = r1 % 128
            androidx.navigation.compose.NavHostKt$NavHost$29$1.RatingCompat = r2
            int r1 = r1 % r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto L69
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
            return r2
        L31:
            java.lang.Object r1 = r6.write
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            goto L53
        L39:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
            java.lang.Object r7 = r6.serializer
            o.deleteSurroundingTextInCodePoints r7 = (o.deleteSurroundingTextInCodePoints) r7
            com.roadrunner.diagnostics.domain.SendTestPushUseCase r7 = r7.RemoteActionCompatParcelizer
            java.lang.Object r4 = r6.RemoteActionCompatParcelizer
            o.getDecimalPjHm6EE r4 = (o.getDecimalPjHm6EE) r4
            r6.IconCompatParcelizer = r2
            r6.write = r1
            r6.MediaSessionCompatQueueItem = r5
            java.lang.Object r7 = r7.invoke(r4, r6)
            if (r7 != r3) goto L53
            goto L5f
        L53:
            r6.IconCompatParcelizer = r2
            r6.write = r2
            r6.MediaSessionCompatQueueItem = r0
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r3) goto L69
        L5f:
            int r7 = androidx.navigation.compose.NavHostKt$NavHost$29$1.RatingCompat
            int r7 = r7 + 31
            int r1 = r7 % 128
            androidx.navigation.compose.NavHostKt$NavHost$29$1.MediaDescriptionCompat = r1
            int r7 = r7 % r0
            return r3
        L69:
            o.createFromParcel r7 = o.createFromParcel.INSTANCE
            return r7
        L6c:
            java.lang.Object r7 = r6.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1.invokeSuspend$com$roadrunner$delivery$ontheway$crowdsourcing$floating$presentation$ObserveImageSharingUiState$invoke$2$1(java.lang.Object):java.lang.Object");
    }

    private final Object invokeSuspend$com$roadrunner$delivery$accept$laststop$presentation$lastStopBottomSheet$LastStopSelectionBottomSheetUiModelImpl$onSetLocationClick$1(Object obj) {
        Object obj2;
        isOpaque isopaqueWrite;
        int i = 2 % 2;
        LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl = (LastStopSelectionBottomSheetUiModelImpl) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaSessionCompatQueueItem;
        Object obj3 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MutableStateFlow mutableStateFlow = lastStopSelectionBottomSheetUiModelImpl.write;
            do {
                obj2 = mutableStateFlow.read();
                isOpaque isopaque = (isOpaque) obj2;
                if (isopaque != null) {
                    isopaqueWrite = isOpaque.write(isopaque, setDrawFilter.serializer(isopaque.IconCompatParcelizer, true));
                    int i3 = MediaDescriptionCompat + 87;
                    RatingCompat = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                } else {
                    isopaqueWrite = null;
                }
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, isopaqueWrite));
            int i5 = MediaDescriptionCompat + 117;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            String str = (String) this.write;
            setMatrix setmatrix = (setMatrix) this.serializer;
            isOpaque isopaque2 = (isOpaque) this.RemoteActionCompatParcelizer;
            this.MediaSessionCompatQueueItem = 1;
            if (LastStopSelectionBottomSheetUiModelImpl.access$saveLastStop(lastStopSelectionBottomSheetUiModelImpl, str, setmatrix, isopaque2, this) == coroutineSingletons) {
                int i7 = MediaDescriptionCompat + 109;
                RatingCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return coroutineSingletons;
                }
                obj3.hashCode();
                throw null;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }

    private final Object invokeSuspend$com$roadrunner$map$integration$mapbox$navigation$MapNavigationImpl$processFlows$2$1(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.MediaSessionCompatQueueItem;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 != 0) {
            int i4 = RatingCompat + 25;
            int i5 = i4 % Fields.SpotShadowColor;
            MediaDescriptionCompat = i5;
            int i6 = i4 % 2;
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = i5 + 23;
            RatingCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            isAdapterPositionOnScreen isadapterpositiononscreen = MapboxNavigationApp.mapboxNavigationAppDelegate$delegate;
            int i8 = 3;
            GetAppStateImpl$invoke$$inlined$map$1 getAppStateImpl$invoke$$inlined$map$1 = new GetAppStateImpl$invoke$$inlined$map$1(FlowKt.write(new NonTouchScrollingLogicKt$busyReceive$2$job$1(i, i8, shortNewsContentCardView)), i8);
            MapboxRerouteController$rerouteInternal$2 mapboxRerouteController$rerouteInternal$2 = new MapboxRerouteController$rerouteInternal$2(getcontentviewgroupparentlayout, (MapNavigationImpl) this.write, (LocationComponentPluginImpl) this.serializer, (MapboxMap) this.RemoteActionCompatParcelizer, (ShortNewsContentCardView) null, 3);
            this.IconCompatParcelizer = null;
            this.MediaSessionCompatQueueItem = 1;
            if (FlowKt.collectLatest(getAppStateImpl$invoke$$inlined$map$1, mapboxRerouteController$rerouteInternal$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i9 = RatingCompat + 41;
        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 89 / 0;
        }
        return createfromparcel;
    }

    private final Object invokeSuspend$com$roadrunner$inappnotifications$data$InAppNotificationsRepository$fetchAndSaveInAppMessage$2$1(Object obj) throws Throwable {
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaSessionCompatQueueItem;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            startNestedScroll startnestedscroll = ((InAppNotificationsRepository) this.IconCompatParcelizer).RemoteActionCompatParcelizer;
            String str = (String) this.write;
            scrollStep scrollstep = (scrollStep) this.serializer;
            isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
            isverticalswipeinalloweddirection.getClass();
            String strRemoteActionCompatParcelizer = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer(scrollStep.Companion.serializer(), scrollstep);
            processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags = (processAdapterUpdatesAndSetAnimationFlags) this.RemoteActionCompatParcelizer;
            suppressLayout suppresslayout = new suppressLayout(0L, str, strRemoteActionCompatParcelizer, false, processadapterupdatesandsetanimationflags.RemoteActionCompatParcelizer, processadapterupdatesandsetanimationflags.IconCompatParcelizer, processadapterupdatesandsetanimationflags.serializer, processadapterupdatesandsetanimationflags.read, processadapterupdatesandsetanimationflags.write);
            this.MediaSessionCompatQueueItem = 1;
            smoothScrollToPosition smoothscrolltoposition = (smoothScrollToPosition) startnestedscroll;
            Object objPerformSuspending = TuplesKt.performSuspending(smoothscrolltoposition.RemoteActionCompatParcelizer, false, true, new SuspendingWorkUseCase$$ExternalSyntheticLambda0(smoothscrolltoposition, 23, suppresslayout), this);
            if (objPerformSuspending != coroutineSingletons) {
                objPerformSuspending = createfromparcel;
            }
            if (objPerformSuspending == coroutineSingletons) {
                int i3 = RatingCompat + 13;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    return coroutineSingletons;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i4 = MediaDescriptionCompat + 7;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createfromparcel;
    }

    private final Object invokeSuspend$com$roadrunner$delivery$pickupdropoff$tasks$signature$presentation$SignatureTaskUiModelImpl$onOpenSignatureScreen$1(Object obj) {
        wrapper wrapperVar;
        int i = 2 % 2;
        wrapper wrapperVar2 = (wrapper) this.serializer;
        SignatureTaskUiModelImpl signatureTaskUiModelImpl = (SignatureTaskUiModelImpl) this.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaSessionCompatQueueItem;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (signatureTaskUiModelImpl.RemoteActionCompatParcelizer == null) {
                this.MediaSessionCompatQueueItem = 1;
                if (signatureTaskUiModelImpl.loadAnalytics$6(this) != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        int i3 = RatingCompat + 23;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i4;
        int i5 = i3 % 2;
        if (i2 != 1) {
            int i6 = i4 + 121;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = i4 + 117;
            RatingCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                wrapperVar = (wrapper) this.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i9 = 43 / 0;
            } else {
                wrapperVar = (wrapper) this.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        signatureTaskUiModelImpl.read.serializer(new getBottomCenternOccac(wrapperVar));
        return createFromParcel.INSTANCE;
        signatureTaskUiModelImpl.MediaMetadataCompat.serializer(signatureTaskUiModelImpl.RemoteActionCompatParcelizer, wrapperVar2.taskId);
        wrapper wrapperVarIconCompatParcelizer = wrapper.IconCompatParcelizer(wrapperVar2, new Density(((r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs) this.RemoteActionCompatParcelizer).toString()));
        UpdateTaskUseCaseImpl updateTaskUseCaseImpl = signatureTaskUiModelImpl.PlaybackStateCompat;
        long j = signatureTaskUiModelImpl.MediaDescriptionCompat;
        String str = signatureTaskUiModelImpl.RatingCompat;
        r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer = displayInAppMessagelambda1.serializer(wrapper.class);
        this.IconCompatParcelizer = wrapperVarIconCompatParcelizer;
        this.MediaSessionCompatQueueItem = 2;
        if (updateTaskUseCaseImpl.invoke(j, str, wrapperVarIconCompatParcelizer, r8lambdaucgighn8fiyv_vccodeafjfpedkSerializer, this) != coroutineSingletons) {
            wrapperVar = wrapperVarIconCompatParcelizer;
            signatureTaskUiModelImpl.read.serializer(new getBottomCenternOccac(wrapperVar));
            return createFromParcel.INSTANCE;
        }
        return coroutineSingletons;
    }

    private final Object invokeSuspend$com$roadrunner$delivery$accept$declinebutton$presentation$LasagnaDeclineBottomSheetViewModel$animateBottomSheetValues$1(Object obj) {
        BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0;
        setFocusedChild setfocusedchild;
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaSessionCompatQueueItem;
        int i3 = 1;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            setFocusedChild setfocusedchild2 = ((TtsAnnotation) this.serializer).RemoteActionCompatParcelizer;
            boringLayoutFactory33ExternalSyntheticApiModelOutline0 = (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.RemoteActionCompatParcelizer;
            BrazeLogger brazeLogger = boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaSessionCompatToken;
            brazeLogger.getClass();
            brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(clipOutRect.IconCompatParcelizer((clipOutRect) brazeLogger.write(), null, null, null, Integer.valueOf(setfocusedchild2.currentAcceptanceRate), 7));
            this.IconCompatParcelizer = boringLayoutFactory33ExternalSyntheticApiModelOutline0;
            this.write = setfocusedchild2;
            this.MediaSessionCompatQueueItem = 1;
            if (DelayKt.delay(800L, this) == coroutineSingletons) {
                int i4 = RatingCompat + 119;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return coroutineSingletons;
            }
            setfocusedchild = setfocusedchild2;
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = MediaDescriptionCompat + 29;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            setfocusedchild = (setFocusedChild) this.write;
            boringLayoutFactory33ExternalSyntheticApiModelOutline0 = (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) this.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        BrazeLogger brazeLogger2 = boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaSessionCompatToken;
        brazeLogger2.getClass();
        AndroidGraphicsContext2 androidGraphicsContext2 = brazeLogger2.IconCompatParcelizer;
        clipOutRect clipoutrect = (clipOutRect) brazeLogger2.write();
        int i8 = setfocusedchild.currentAcceptanceRate - setfocusedchild.reducedDelta;
        if (i8 < 0) {
            int i9 = MediaDescriptionCompat + 111;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                i3 = 0;
            }
        } else {
            i3 = i8;
        }
        androidGraphicsContext2.RemoteActionCompatParcelizer(clipOutRect.IconCompatParcelizer(clipoutrect, null, null, null, Integer.valueOf(i3), 7));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i10 = MediaDescriptionCompat + 33;
        RatingCompat = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        return createfromparcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer, new coil3.disk.DiskLruCache$launchCleanup$1(r1, r5, 20), r11) == r2) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object invokeSuspend$com$roadrunner$customerchat$selfservice$data$image$ImageCacheResolverImpl$cacheImageFile$2(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.navigation.compose.NavHostKt$NavHost$29$1.MediaDescriptionCompat
            int r1 = r1 + 25
            int r2 = r1 % 128
            androidx.navigation.compose.NavHostKt$NavHost$29$1.RatingCompat = r2
            int r1 = r1 % r0
            java.lang.Object r1 = r11.serializer
            com.roadrunner.auth.data.SignInDataStore r1 = (com.roadrunner.auth.data.SignInDataStore) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r11.MediaSessionCompatQueueItem
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L43
            if (r3 == r4) goto L3b
            int r2 = androidx.navigation.compose.NavHostKt$NavHost$29$1.RatingCompat
            int r2 = r2 + 105
            int r4 = r2 % 128
            androidx.navigation.compose.NavHostKt$NavHost$29$1.MediaDescriptionCompat = r4
            int r2 = r2 % r0
            if (r3 != r0) goto L35
            int r4 = r4 + 13
            int r2 = r4 % 128
            androidx.navigation.compose.NavHostKt$NavHost$29$1.RatingCompat = r2
            int r4 = r4 % r0
            java.lang.Object r0 = r11.IconCompatParcelizer
            android.net.Uri r0 = (android.net.Uri) r0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Exception -> Lb0
            goto La7
        L35:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            return r5
        L3b:
            java.lang.Object r3 = r11.IconCompatParcelizer
            android.net.Uri r3 = (android.net.Uri) r3
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Exception -> Lb0
            goto L6f
        L43:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            java.lang.Object r12 = r11.write     // Catch: java.lang.Exception -> Lb0
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> Lb0
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch: java.lang.Exception -> Lb0
            r11.IconCompatParcelizer = r12     // Catch: java.lang.Exception -> Lb0
            r11.MediaSessionCompatQueueItem = r4     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r3 = r1.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb0
            o.isOpenInternalroom_runtime r3 = (o.isOpenInternalroom_runtime) r3     // Catch: java.lang.Exception -> Lb0
            o.inCompatibilityMode r3 = (o.inCompatibilityMode) r3     // Catch: java.lang.Exception -> Lb0
            r3.getClass()     // Catch: java.lang.Exception -> Lb0
            kotlinx.coroutines.scheduling.DefaultScheduler r3 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb0
            kotlinx.coroutines.scheduling.DefaultIoScheduler r3 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb0
            com.roadrunner.auth.data.LocalAuthDataSource$store$2 r4 = new com.roadrunner.auth.data.LocalAuthDataSource$store$2     // Catch: java.lang.Exception -> Lb0
            r6 = 7
            r4.<init>(r1, r12, r5, r6)     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r11)     // Catch: java.lang.Exception -> Lb0
            if (r3 != r2) goto L6c
            goto La5
        L6c:
            r10 = r3
            r3 = r12
            r12 = r10
        L6f:
            java.lang.Long r12 = (java.lang.Long) r12     // Catch: java.lang.Exception -> Lb0
            if (r12 == 0) goto La6
            long r6 = r12.longValue()     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r12 = r1.serializer     // Catch: java.lang.Exception -> Lb0
            android.app.Application r12 = (android.app.Application) r12     // Catch: java.lang.Exception -> Lb0
            java.io.File r12 = r12.getCacheDir()     // Catch: java.lang.Exception -> Lb0
            long r8 = r12.getFreeSpace()     // Catch: java.lang.Exception -> Lb0
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 >= 0) goto La6
            r11.IconCompatParcelizer = r3     // Catch: java.lang.Exception -> Lb0
            r11.MediaSessionCompatQueueItem = r0     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r12 = r1.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb0
            o.isOpenInternalroom_runtime r12 = (o.isOpenInternalroom_runtime) r12     // Catch: java.lang.Exception -> Lb0
            o.inCompatibilityMode r12 = (o.inCompatibilityMode) r12     // Catch: java.lang.Exception -> Lb0
            r12.getClass()     // Catch: java.lang.Exception -> Lb0
            kotlinx.coroutines.scheduling.DefaultScheduler r12 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb0
            kotlinx.coroutines.scheduling.DefaultIoScheduler r12 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb0
            coil3.disk.DiskLruCache$launchCleanup$1 r0 = new coil3.disk.DiskLruCache$launchCleanup$1     // Catch: java.lang.Exception -> Lb0
            r4 = 20
            r0.<init>(r1, r5, r4)     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r0, r11)     // Catch: java.lang.Exception -> Lb0
            if (r12 != r2) goto La6
        La5:
            return r2
        La6:
            r0 = r3
        La7:
            java.lang.Object r12 = r11.RemoteActionCompatParcelizer     // Catch: java.lang.Exception -> Lb0
            java.lang.String r12 = (java.lang.String) r12     // Catch: java.lang.Exception -> Lb0
            java.lang.String r12 = com.roadrunner.auth.data.SignInDataStore.serializer(r1, r0, r12)     // Catch: java.lang.Exception -> Lb0
            return r12
        Lb0:
            r12 = move-exception
            timber.log.Timber$Forest r0 = timber.log.Timber.RemoteActionCompatParcelizer
            r0.write(r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1.invokeSuspend$com$roadrunner$customerchat$selfservice$data$image$ImageCacheResolverImpl$cacheImageFile$2(java.lang.Object):java.lang.Object");
    }

    private final Object invokeSuspend$com$roadrunner$delivery$ontheway$crowdsourcing$gallery$presentation$GalleryViewModel$onSubmitReport$2(Object obj) {
        Object objM4915invokeBWLJW6A;
        Object obj2;
        Object obj3;
        int i = 2 % 2;
        notifyFocusedRect notifyfocusedrect = (notifyFocusedRect) this.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.MediaSessionCompatQueueItem;
        if (i2 != 0) {
            int i3 = RatingCompat + 39;
            int i4 = i3 % Fields.SpotShadowColor;
            MediaDescriptionCompat = i4;
            if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = i4 + 73;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4915invokeBWLJW6A = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ReportPictureUseCase reportPictureUseCase = notifyfocusedrect.MediaSessionCompatQueueItem;
            String str = (String) this.write;
            String str2 = (String) this.serializer;
            boolean z = ((NullableInputConnectionWrapperApi34) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
            this.MediaSessionCompatQueueItem = 1;
            objM4915invokeBWLJW6A = reportPictureUseCase.m4915invokeBWLJW6A(str, str2, this, z);
            if (objM4915invokeBWLJW6A == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (!(objM4915invokeBWLJW6A instanceof isItemDismissable)) {
            MutableStateFlow mutableStateFlow = notifyfocusedrect.read;
            do {
                obj3 = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, OffsetMappingCompanion.read((OffsetMappingCompanion) obj3, null, null, false, null, null, false, 31)));
            notifyfocusedrect.serializer.serializer(new onConnectionClosed(notifyfocusedrect.RatingCompat.IconCompatParcelizer(R.string.df_crowdsourcing_gallery_report_image_success), false));
            UpdateStateUseCaseImpl.write(notifyfocusedrect.PlaybackStateCompat);
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4915invokeBWLJW6A);
        if (thSerializer != null) {
            int i7 = MediaDescriptionCompat + 23;
            RatingCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            MutableStateFlow mutableStateFlow2 = notifyfocusedrect.read;
            do {
                obj2 = mutableStateFlow2.read();
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, OffsetMappingCompanion.read((OffsetMappingCompanion) obj2, null, null, false, null, null, false, 31)));
            getQueryContext getquerycontext = notifyfocusedrect.serializer;
            String message = thSerializer.getMessage();
            if (message == null) {
                message = notifyfocusedrect.RatingCompat.IconCompatParcelizer(R.string.all_error_message);
            }
            getquerycontext.serializer(new onConnectionClosed(message, true));
        }
        return createFromParcel.INSTANCE;
    }

    private final Object invokeSuspend$com$roadrunner$delivery$ontheway$crowdsourcing$gallery$presentation$GalleryViewModel$onVotePressed$1(Object obj) {
        performHandwritingGesture performhandwritinggesture;
        Object obj2;
        OffsetMappingCompanion offsetMappingCompanion;
        Object objM4916invokegIAlus;
        Object obj3;
        OffsetMappingCompanion offsetMappingCompanion2;
        LinkedHashMap linkedHashMap;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        RatingCompat = i2 % Fields.SpotShadowColor;
        Object obj4 = null;
        if (i2 % 2 == 0) {
            MutableStateFlow mutableStateFlow = ((notifyFocusedRect) this.IconCompatParcelizer).read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj4.hashCode();
            throw null;
        }
        String str = (String) this.write;
        notifyFocusedRect notifyfocusedrect = (notifyFocusedRect) this.IconCompatParcelizer;
        MutableStateFlow mutableStateFlow2 = notifyfocusedrect.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.MediaSessionCompatQueueItem;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            PasswordVisualTransformation passwordVisualTransformation = (PasswordVisualTransformation) this.serializer;
            notifyfocusedrect.PlaybackStateCompatCustomAction.getClass();
            passwordVisualTransformation.getClass();
            int i4 = NullableInputConnectionWrapper_androidKt.write[passwordVisualTransformation.ordinal()];
            if (i4 == 1) {
                performhandwritinggesture = new performHandwritingGesture(true, false);
            } else if (i4 != 2) {
                int i5 = MediaDescriptionCompat + 33;
                RatingCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0 ? i4 == 3 : i4 == 2) {
                    performhandwritinggesture = new performHandwritingGesture(false, true);
                } else {
                    if (i4 != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    performhandwritinggesture = new performHandwritingGesture(false, false);
                }
            } else {
                performhandwritinggesture = new performHandwritingGesture(false, false);
            }
            do {
                obj2 = mutableStateFlow2.read();
                offsetMappingCompanion = (OffsetMappingCompanion) obj2;
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, OffsetMappingCompanion.read(offsetMappingCompanion, null, null, false, onMove.serializer(offsetMappingCompanion.serializer, new onViewAttachedToWindowlambda0(str, performhandwritinggesture)), null, false, 55)));
            int i6 = RatingCompat + 59;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ReportPictureUseCase reportPictureUseCase = notifyfocusedrect.MediaBrowserCompatMediaItem;
            OffsetMappingCompanionIdentity1 offsetMappingCompanionIdentity1 = (OffsetMappingCompanionIdentity1) this.RemoteActionCompatParcelizer;
            this.MediaSessionCompatQueueItem = 1;
            objM4916invokegIAlus = reportPictureUseCase.m4916invokegIAlus(offsetMappingCompanionIdentity1, this);
            if (objM4916invokegIAlus == coroutineSingletons2) {
                int i8 = MediaDescriptionCompat + 63;
                RatingCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons2;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = MediaDescriptionCompat + 31;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4916invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (objM4916invokegIAlus instanceof isItemDismissable) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onItemDismiss.serializer(objM4916invokegIAlus), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Crowdsourcing voting failed for imageId=", str), new Object[0]);
            do {
                obj3 = mutableStateFlow2.read();
                offsetMappingCompanion2 = (OffsetMappingCompanion) obj3;
                linkedHashMap = new LinkedHashMap(offsetMappingCompanion2.serializer);
                linkedHashMap.remove(str);
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj3, OffsetMappingCompanion.read(offsetMappingCompanion2, null, null, false, onMove.read(linkedHashMap), null, false, 55)));
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i12 = RatingCompat + 33;
        MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
        if (i12 % 2 != 0) {
            int i13 = 69 / 0;
        }
        return createfromparcel;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 4:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((NavHostKt$NavHost$29$1) create((PlatformTextInputSession) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                return ((NavHostKt$NavHost$29$1) create((ClipOpCompanion) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 8:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((NavHostKt$NavHost$29$1) create((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                Object objInvokeSuspend = ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = RatingCompat + 11;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 11:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                Object objInvokeSuspend2 = ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = RatingCompat + 107;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 26 / 0;
                }
                return objInvokeSuspend2;
            case 15:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 17:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((NavHostKt$NavHost$29$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 26:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((NavHostKt$NavHost$29$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        switch (i3) {
            case 0:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1((SeekableTransitionState) this.write, (cubicTo) this.serializer, (Transition) obj2, shortNewsContentCardView, 0);
                navHostKt$NavHost$29$1.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$1;
            case 1:
                return new NavHostKt$NavHost$29$1(this.IconCompatParcelizer, (Animatable) this.write, (PopulateViewStructure_androidKtpopulate7) this.serializer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 1);
            case 2:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$2 = new NavHostKt$NavHost$29$1((PopulateViewStructure_androidKtpopulate7) this.serializer, (ArrangementHorizontal) obj2, shortNewsContentCardView, i);
                navHostKt$NavHost$29$2.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$2;
            case 3:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$3 = new NavHostKt$NavHost$29$1((PointerInputScope) this.write, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 3);
                navHostKt$NavHost$29$3.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$3;
            case 4:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$4 = new NavHostKt$NavHost$29$1((TrackpadScrollingLogic) obj2, shortNewsContentCardView);
                navHostKt$NavHost$29$4.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$4;
            case 5:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$5 = new NavHostKt$NavHost$29$1((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) this.write, (getNormalNSsRyOo) this.serializer, (KeepScreenOnNode) obj2, shortNewsContentCardView, 5);
                navHostKt$NavHost$29$5.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$5;
            case 6:
                return new NavHostKt$NavHost$29$1((PlatformSelectionBehaviorsImpl) this.serializer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj2, shortNewsContentCardView, 6);
            case 7:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$6 = new NavHostKt$NavHost$29$1((RoomDatabase) this.serializer, shortNewsContentCardView, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2);
                navHostKt$NavHost$29$6.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$6;
            case 8:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$7 = new NavHostKt$NavHost$29$1((accesssetSpotShadowColor8_81llAjd) this.IconCompatParcelizer, (setFrom58bKbWc) this.write, (hasSameCornerRadius) this.serializer, (Context) obj2, shortNewsContentCardView, 8);
                int i4 = RatingCompat + 93;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return navHostKt$NavHost$29$7;
                }
                throw null;
            case 9:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$8 = new NavHostKt$NavHost$29$1((HitEventFactory) this.write, (Map.Entry) this.serializer, (PerseusEvent) obj2, shortNewsContentCardView, 9);
                navHostKt$NavHost$29$8.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$8;
            case 10:
                return new NavHostKt$NavHost$29$1((accessgetSendingFocusAffectingEventp) this.IconCompatParcelizer, (Map) this.write, (RealImageLoader$execute$2$job$1) this.serializer, (SignInDataStore$clear$2) obj2, shortNewsContentCardView, 10);
            case 11:
                return new NavHostKt$NavHost$29$1((MapboxRerouteController) this.IconCompatParcelizer, (RouteOptions) this.write, (GetRouteSignature) this.serializer, (MapboxNavigation$$ExternalSyntheticLambda4) obj2, shortNewsContentCardView, 11);
            case 12:
                return new NavHostKt$NavHost$29$1((NativeMapboxRerouteController) this.IconCompatParcelizer, (DataRef) this.write, (String) this.serializer, (RouterOrigin) obj2, shortNewsContentCardView, 12);
            case 13:
                return new NavHostKt$NavHost$29$1((RouteInterface) this.IconCompatParcelizer, (List) this.write, (MetadataApplierImpl) this.serializer, (SignInDataStore$set$2) obj2, shortNewsContentCardView, 13);
            case 14:
                return new NavHostKt$NavHost$29$1((MapboxRouteLineView) this.IconCompatParcelizer, (onViewAttachedToWindowlambda0) this.write, (Style) this.serializer, (RouteLineViewOptionsData) obj2, shortNewsContentCardView, 14);
            case 15:
                return new NavHostKt$NavHost$29$1((H$b) this.serializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2, shortNewsContentCardView, 15);
            case 16:
                return new NavHostKt$NavHost$29$1((mf) this.write, (x) this.serializer, (VoiceInstructions) obj2, shortNewsContentCardView, 16);
            case 17:
                return new NavHostKt$NavHost$29$1((String) this.write, (SignInDataStore) this.serializer, (String) obj2, shortNewsContentCardView, 17);
            case 18:
                return new NavHostKt$NavHost$29$1((collectRangeTransitions) this.IconCompatParcelizer, (HelpCenterRemoteDataSourceImpl) this.write, (removeScheduledCallback) this.serializer, (String) obj2, shortNewsContentCardView, 18);
            case 19:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$9 = new NavHostKt$NavHost$29$1((findFollowingBreak) this.write, (DownloadChatAssetsUseCase) this.serializer, (String) obj2, shortNewsContentCardView, 19);
                navHostKt$NavHost$29$9.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$9;
            case 20:
                return new NavHostKt$NavHost$29$1((TtsAnnotation) this.serializer, (BoringLayoutFactory33ExternalSyntheticApiModelOutline0) obj2, shortNewsContentCardView, 20);
            case 21:
                return new NavHostKt$NavHost$29$1((LastStopSelectionBottomSheetUiModelImpl) this.IconCompatParcelizer, (String) this.write, (setMatrix) this.serializer, (isOpaque) obj2, shortNewsContentCardView, 21);
            case 22:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$10 = new NavHostKt$NavHost$29$1((deleteSurroundingTextInCodePoints) this.serializer, (getDecimalPjHm6EE) obj2, shortNewsContentCardView, 22);
                navHostKt$NavHost$29$10.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$10;
            case 23:
                return new NavHostKt$NavHost$29$1((notifyFocusedRect) this.IconCompatParcelizer, (String) this.write, (String) this.serializer, (NullableInputConnectionWrapperApi34) obj2, shortNewsContentCardView, 23);
            case 24:
                return new NavHostKt$NavHost$29$1((notifyFocusedRect) this.IconCompatParcelizer, (String) this.write, (PasswordVisualTransformation) this.serializer, (OffsetMappingCompanionIdentity1) obj2, shortNewsContentCardView, 24);
            case 25:
                return new NavHostKt$NavHost$29$1((BleScanningLifecycleObserverImpl) this.write, (isInsideContent) this.serializer, (accessisRenderNodeCompatiblecp) obj2, shortNewsContentCardView, 25);
            case 26:
                return new NavHostKt$NavHost$29$1((SignatureTaskUiModelImpl) this.write, (wrapper) this.serializer, (r8lambdaKPF3ExuVmwcbLmeNzxtdfQ9jzhs) obj2, shortNewsContentCardView, 26);
            case 27:
                return new NavHostKt$NavHost$29$1((InAppNotificationsRepository) this.IconCompatParcelizer, (String) this.write, (scrollStep) this.serializer, (processAdapterUpdatesAndSetAnimationFlags) obj2, shortNewsContentCardView, 27);
            case 28:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$11 = new NavHostKt$NavHost$29$1((MapNavigationImpl) this.write, (LocationComponentPluginImpl) this.serializer, (MapboxMap) obj2, shortNewsContentCardView, 28);
                navHostKt$NavHost$29$11.IconCompatParcelizer = obj;
                return navHostKt$NavHost$29$11;
            default:
                NavHostKt$NavHost$29$1 navHostKt$NavHost$29$12 = new NavHostKt$NavHost$29$1((accessisRenderNodeCompatiblecp) this.IconCompatParcelizer, (MapNavigationImpl) this.write, (LocationComponentPluginImpl) this.serializer, (MapboxMap) obj2, shortNewsContentCardView, 29);
                int i5 = RatingCompat + 89;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return navHostKt$NavHost$29$12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:456:0x0a6d A[PHI: r2 r3
  0x0a6d: PHI (r2v9 o.cancelPendingWebViewPauselambda0) = 
  (r2v7 o.cancelPendingWebViewPauselambda0)
  (r2v8 o.cancelPendingWebViewPauselambda0)
  (r2v8 o.cancelPendingWebViewPauselambda0)
  (r2v13 o.cancelPendingWebViewPauselambda0)
 binds: [B:455:0x0a5c, B:460:0x0a93, B:462:0x0aad, B:452:0x0a40] A[DONT_GENERATE, DONT_INLINE]
  0x0a6d: PHI (r3v11 o.getContentViewGroupParentLayout) = 
  (r3v9 o.getContentViewGroupParentLayout)
  (r3v10 o.getContentViewGroupParentLayout)
  (r3v10 o.getContentViewGroupParentLayout)
  (r3v15 o.getContentViewGroupParentLayout)
 binds: [B:455:0x0a5c, B:460:0x0a93, B:462:0x0aad, B:452:0x0a40] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:459:0x0a8e A[PHI: r2 r3
  0x0a8e: PHI (r2v8 o.cancelPendingWebViewPauselambda0) = (r2v9 o.cancelPendingWebViewPauselambda0), (r2v11 o.cancelPendingWebViewPauselambda0) binds: [B:457:0x0a8b, B:454:0x0a50] A[DONT_GENERATE, DONT_INLINE]
  0x0a8e: PHI (r3v10 o.getContentViewGroupParentLayout) = (r3v11 o.getContentViewGroupParentLayout), (r3v13 o.getContentViewGroupParentLayout) binds: [B:457:0x0a8b, B:454:0x0a50] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:461:0x0a95  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r2v23, types: [o.setCustomInAppMessageAnimationFactorylambda0] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v84, types: [o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:423:0x09cd -> B:416:0x099e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:460:0x0a93 -> B:456:0x0a6d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:462:0x0aad -> B:456:0x0a6d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
