package androidx.compose.foundation.pager;

import android.view.View;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import androidx.core.view.ViewKt$allViews$1;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import coil3.ExtrasKt;
import coil3.network.NetworkFetcher;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.zp;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1;
import com.roadrunner.rrds.compose.component.image.zoomable.DetectZoomableGesturesKt$detectZoomableGestures$4;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomableNode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.JobSupport$children$1;
import kotlinx.coroutines.YieldKt;
import o.Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1;
import o.AlignmentHorizontal;
import o.CallFactoryNetworkClient;
import o.ExperimentalComposeUiApi;
import o.RemoteActionCompatParcelizer;
import o.ShortNewsContentCardView;
import o.SingleThreadCachedScheduler;
import o.createFromParcel;
import o.frameRate;
import o.getSessionParameters;
import o.getViewportSizeYbymL2g;
import o.incrementDataId;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.scheduleFutureWithReturn;
import o.toAndroidDragEvent;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutPagerKt$dragDirectionDetector$1 implements PointerInputEventHandler {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ LazyLayoutPagerKt$dragDirectionDetector$1(int i, Object obj) {
        this.serializer = i;
        this.write = obj;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, ShortNewsContentCardView shortNewsContentCardView) {
        incrementDataId incrementdataid;
        CallFactoryNetworkClient callFactoryNetworkClient;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 23;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i3 % 2 != 0) {
            int i4 = this.serializer;
            Object obj = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i5 = 3;
            int i6 = 0;
            int i7 = 11;
            int i8 = 1;
            switch (i4) {
                case 0:
                    Object objCoroutineScope = YieldKt.coroutineScope(new BlockRunner$maybeRun$1(pointerInputScope, (PagerState) obj, shortNewsContentCardView2, i7), shortNewsContentCardView);
                    return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createfromparcel;
                case 1:
                    Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new ViewKt$allViews$1((AndroidEdgeEffectOverscrollEffect) obj, null, i8), shortNewsContentCardView);
                    return objAwaitEachGesture == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture : createfromparcel;
                case 2:
                    TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj;
                    Object objAwaitEachGesture2 = ForEachGestureKt.awaitEachGesture(pointerInputScope, new JobSupport$children$1(new zp(pointerInputScope.getViewConfiguration()), textFieldSelectionManager.PlaybackStateCompat, textFieldSelectionManager.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, null), shortNewsContentCardView);
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (objAwaitEachGesture2 != coroutineSingletons) {
                        objAwaitEachGesture2 = createfromparcel;
                    }
                    return objAwaitEachGesture2 == coroutineSingletons ? objAwaitEachGesture2 : createfromparcel;
                case 3:
                    Object objAwaitEachGesture3 = ForEachGestureKt.awaitEachGesture(pointerInputScope, new ViewKt$allViews$1(new NetworkFetcher.AnonymousClass2(1, (ExperimentalComposeUiApi) obj, ExperimentalComposeUiApi.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 2), null, i), shortNewsContentCardView);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (objAwaitEachGesture3 != coroutineSingletons2) {
                        objAwaitEachGesture3 = createfromparcel;
                    }
                    return objAwaitEachGesture3 == coroutineSingletons2 ? objAwaitEachGesture3 : createfromparcel;
                case 4:
                    Object objAwaitEachGesture4 = ForEachGestureKt.awaitEachGesture(pointerInputScope, new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1((frameRate) obj, null), shortNewsContentCardView);
                    return objAwaitEachGesture4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture4 : createfromparcel;
                case 5:
                    Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ViewKt$allViews$1((Actual_jvmAndAndroidKttryPopulateReflectivelyinlinedsortedBy1) obj, null, i5), shortNewsContentCardView);
                    return objAwaitPointerEventScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitPointerEventScope : createfromparcel;
                case 6:
                    Object objCoroutineScope2 = YieldKt.coroutineScope(new SignInDataStore$set$2(pointerInputScope, (AlignmentHorizontal) obj, shortNewsContentCardView2, i8), shortNewsContentCardView);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (objCoroutineScope2 != coroutineSingletons3) {
                        objCoroutineScope2 = createfromparcel;
                    }
                    if (objCoroutineScope2 != coroutineSingletons3) {
                        return createfromparcel;
                    }
                    int i9 = read + 97;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return objCoroutineScope2;
                case 7:
                    Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, new RetryWithDelay$$ExternalSyntheticLambda0(25, (FocusManager) obj), shortNewsContentCardView, 7);
                    return objDetectTapGestures$default == CoroutineSingletons.COROUTINE_SUSPENDED ? objDetectTapGestures$default : createfromparcel;
                case 8:
                    if (shortNewsContentCardView instanceof incrementDataId) {
                        incrementdataid = (incrementDataId) shortNewsContentCardView;
                        int i11 = incrementdataid.serializer;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            incrementdataid.serializer = i11 - Integer.MIN_VALUE;
                        } else {
                            incrementdataid = new incrementDataId(this, shortNewsContentCardView);
                        }
                    } else {
                        incrementdataid = new incrementDataId(this, shortNewsContentCardView);
                    }
                    Object obj2 = incrementdataid.read;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = incrementdataid.serializer;
                    try {
                        if (i12 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj2);
                            AnchoredDraggableState$draggableState$1$drag$2 anchoredDraggableState$draggableState$1$drag$2 = new AnchoredDraggableState$draggableState$1$drag$2((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj, null);
                            incrementdataid.serializer = 1;
                            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, anchoredDraggableState$draggableState$1$drag$2, null, incrementdataid, 11) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else if (i12 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj2);
                        } else {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        break;
                    } catch (Exception e) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Failed to handle tap gesture.", new Object[0]);
                    }
                    return createfromparcel;
                case 9:
                    if (shortNewsContentCardView instanceof CallFactoryNetworkClient) {
                        callFactoryNetworkClient = (CallFactoryNetworkClient) shortNewsContentCardView;
                        int i13 = callFactoryNetworkClient.RemoteActionCompatParcelizer;
                        if ((i13 & Integer.MIN_VALUE) == 0) {
                            callFactoryNetworkClient = new CallFactoryNetworkClient(this, shortNewsContentCardView);
                        } else {
                            int i14 = read + 91;
                            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                            callFactoryNetworkClient.RemoteActionCompatParcelizer = i14 % 2 == 0 ? i13 % Integer.MIN_VALUE : i13 - Integer.MIN_VALUE;
                        }
                    } else {
                        callFactoryNetworkClient = new CallFactoryNetworkClient(this, shortNewsContentCardView);
                    }
                    CallFactoryNetworkClient callFactoryNetworkClient2 = callFactoryNetworkClient;
                    Object obj3 = callFactoryNetworkClient2.serializer;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = callFactoryNetworkClient2.RemoteActionCompatParcelizer;
                    try {
                        if (i15 != 0) {
                            int i16 = IconCompatParcelizer + 15;
                            read = i16 % Fields.SpotShadowColor;
                            if (i16 % 2 == 0 ? i15 == 1 : i15 == 0) {
                                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                            } else {
                                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            ExtrasKt.RemoteActionCompatParcelizer(obj3);
                            toAndroidDragEvent toandroiddragevent = new toAndroidDragEvent(i5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj);
                            callFactoryNetworkClient2.RemoteActionCompatParcelizer = 1;
                            if (DragGestureDetectorKt.detectDragGestures(pointerInputScope, new getViewportSizeYbymL2g(i7), new RemoteActionCompatParcelizer(7), new RemoteActionCompatParcelizer(7), toandroiddragevent, callFactoryNetworkClient2) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        }
                        break;
                    } catch (Exception e2) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Failed to handle drag gesture.", new Object[0]);
                    }
                    return createfromparcel;
                case 10:
                    Object objAwaitEachGesture5 = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DualColumnTimePickerKt$disallowParentTouchInterception$1$1$1((View) obj, null), shortNewsContentCardView);
                    return objAwaitEachGesture5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objAwaitEachGesture5 : createfromparcel;
                default:
                    ZoomableNode zoomableNode = (ZoomableNode) obj;
                    Object objAwaitEachGesture6 = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DetectZoomableGesturesKt$detectZoomableGestures$4(zoomableNode.RemoteActionCompatParcelizer != null ? new SingleThreadCachedScheduler(zoomableNode, i8) : null, zoomableNode.read != null ? new SingleThreadCachedScheduler(zoomableNode, i) : null, null, new getSessionParameters(zoomableNode), new scheduleFutureWithReturn(zoomableNode, i6), new getSessionParameters(zoomableNode), new StringsKt__StringsKt$$ExternalSyntheticLambda1(16, zoomableNode), new SlotTreeKt$$ExternalSyntheticLambda0(18, zoomableNode), new scheduleFutureWithReturn(zoomableNode, i8), null), shortNewsContentCardView);
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (objAwaitEachGesture6 != coroutineSingletons6) {
                        objAwaitEachGesture6 = createfromparcel;
                    }
                    return objAwaitEachGesture6 == coroutineSingletons6 ? objAwaitEachGesture6 : createfromparcel;
            }
        }
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        throw null;
    }
}
