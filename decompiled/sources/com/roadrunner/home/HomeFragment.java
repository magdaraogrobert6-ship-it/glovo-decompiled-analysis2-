package com.roadrunner.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.AbstractClickableNode$onKeyEvent$1;
import androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.room.RoomDatabase$closeBarrier$1;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.aqs.AppQualityScore;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.logistics.rider.glovo.R;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleObjectInfo;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.CircleLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import com.roadrunner.freelancing.api.presentation.tab.WorkOpportunityTypeSelectorUiModel;
import com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import com.roadrunner.home.bottomsheet.HomeBottomSheetContentKt;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import com.roadrunner.home.floatinglayer.GetFloatingComposable$$ExternalSyntheticLambda25;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModelImpl;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import com.roadrunner.map.container.enabled.presentation.MapboxFragment;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.push.presentation.BasePushMessagesViewModel;
import com.roadrunner.push.presentation.viewentity.MessageDialogData;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import com.roadrunner.util.sound.DefaultForegroundSoundManager$play$1;
import com.ui.common.base.BaseInjectionFragment;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.CombinedScopeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.reactive.FlowSubscription;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AbstractC0210v;
import o.ActivityState;
import o.AnchoredDraggableKtanimateToWithDecay2;
import o.AndroidContentCaptureManager;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.Button;
import o.C0209u;
import o.C0211w;
import o.CoreComponentFactory;
import o.DragAndDropTargetModifierNode;
import o.EmptyResultSetException;
import o.FragmentSavedState;
import o.GraphicsLayer;
import o.InnerShadowRendererProvider;
import o.MinimumInteractiveModifierNode;
import o.PackageHandler7;
import o.ScrollbarHelper;
import o.ShortNewsContentCardView;
import o.T;
import o.TooltipKt;
import o.Violation;
import o.WrongFragmentContainerViolation;
import o.WrongNestedHierarchyViolation;
import o.access300;
import o.access900;
import o.accessgetInstancedelegatecp;
import o.accessisRenderNodeCompatiblecp;
import o.animateElevation;
import o.clipRectmtrdDEdefault;
import o.copyO0kMr_c;
import o.createFromParcel;
import o.createInnerPathShadowBrushLjSzlW0;
import o.createInnerShadowBrushu1Psq8;
import o.createNotificationChannelGroupsCompat;
import o.ddefault;
import o.decode;
import o.defaultViewModelProviderFactory_delegatelambda0;
import o.displayInAppMessagelambda1;
import o.div7Ah8Wj8;
import o.dlambda0;
import o.drawCachedImageFqjB98A;
import o.drawWithRotationAndOffsetubNVwUQ;
import o.e9;
import o.f5ExternalSyntheticLambda4;
import o.findFragmentById;
import o.fullMultiplicationHighBits;
import o.g6;
import o.getAdjustedBounds;
import o.getBirthDateFull;
import o.getChildViewHolderInt;
import o.getClipPathData;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getDecoratedBoundsWithMarginsInt;
import o.getKeyboardTap5zf0vsI;
import o.getNumChildren;
import o.getPostalCode;
import o.getPowersOfTen;
import o.getStripNonMetricAffectingCharSpansannotations;
import o.getViewLifecycleOwner;
import o.getViewLifecycleOwnerLiveData;
import o.handleUrlOverridelambda1;
import o.hasOptionsMenu;
import o.hideCurrentlyDisplayingInAppMessage;
import o.ihExternalSyntheticLambda2;
import o.inCompatibilityMode;
import o.initLifecycle;
import o.initState;
import o.isAdapterPositionOnScreen;
import o.isDigit;
import o.isInfiniteannotations;
import o.isOpenInternalroom_runtime;
import o.isResumed;
import o.lambdaonActivityLifecycle1;
import o.markFragmentsCreated;
import o.markItemDecorInsetsDirty;
import o.mergeJsonObjects;
import o.obtainTint8_81llA;
import o.offsetPositionRecordsForRemove;
import o.onContentCardDismissed;
import o.onDestroyOptionsMenu;
import o.onGetLayoutInflater;
import o.onHiddenChanged;
import o.onMove;
import o.onOptionsItemSelected;
import o.onPrimaryNavigationFragmentChanged;
import o.onViewAttachedToWindow;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.performStart;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY;
import o.r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.requireHost;
import o.sc;
import o.setAllowEnterTransitionOverlap;
import o.setCarryoverInAppMessage;
import o.setDrawDisappearingViewsLast;
import o.setLineBreakConfig;
import o.setOnApplyWindowInsetsListener;
import o.setOnSessionTrackingFailedListener;
import o.setRoundRectOutlineTNW_H78default;
import o.shouldIgnore;
import o.snapToTargetExistingView;
import o.startPostponedEnterTransition;
import o.superDispatchKeyEvent;
import o.supportFinishAfterTransition;
import o.supportStartPostponedEnterTransition;
import o.supportsColorMatrixQuery;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateSubhierarchy;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeFragment extends BaseInjectionFragment implements setOnApplyWindowInsetsListener, obtainTint8_81llA {
    private static int onActivityResult = 0;
    private static int onBackPressed = 1;
    public onOptionsItemSelected IconCompatParcelizer;
    public setDrawDisappearingViewsLast MediaBrowserCompatMediaItem;
    public getChildViewHolderInt MediaDescriptionCompat;
    public WrongNestedHierarchyViolation MediaMetadataCompat;
    public setLineBreakConfig MediaSessionCompatQueueItem;
    public copyO0kMr_c MediaSessionCompatResultReceiverWrapper;
    public AndroidUiDispatcherCompanioncurrentThread1 MediaSessionCompatToken;
    public ActivityState ParcelableVolumeInfo;
    public markItemDecorInsetsDirty PlaybackStateCompat;
    public final HomeFragment$mapViewLifecycleCallback$1 PlaybackStateCompatCustomAction;
    public onHiddenChanged RatingCompat;
    public requireHost RemoteActionCompatParcelizer;
    public dlambda0 ResultReceiver;
    public r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY getNavigationEventDispatcher;
    public final ComponentRegistry$Builder getOnBackPressedDispatcher;
    public int getSavedStateRegistry;
    public FragmentSavedState read;
    public final isAdapterPositionOnScreen serializer;
    public snapToTargetExistingView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.roadrunner.home.HomeFragment$mapViewLifecycleCallback$1] */
    public HomeFragment() {
        super(0);
        final int i = 0;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.home.HomeFragment$$ExternalSyntheticLambda1
            private static int read = 1;
            private static int serializer;
            public final /* synthetic */ HomeFragment RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = read + 19;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i;
                HomeFragment homeFragment = this.RemoteActionCompatParcelizer;
                if (i5 == 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = homeFragment.getNavigationEventDispatcher;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                        removeNodeAtDepth.serializer("viewModelFactory");
                        throw null;
                    }
                    int i6 = read + 103;
                    serializer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                onOptionsItemSelected onoptionsitemselected = homeFragment.IconCompatParcelizer;
                if (onoptionsitemselected == null) {
                    removeNodeAtDepth.serializer("homeScreenLayoutCoordinatorFactory");
                    throw null;
                }
                requireHost requirehost = homeFragment.RemoteActionCompatParcelizer;
                requirehost.getClass();
                RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2 = new RoomDatabase$$ExternalSyntheticLambda2(22, homeFragment);
                HomeFragment.AnonymousClass1 anonymousClass1 = new HomeFragment.AnonymousClass1(1, homeFragment.RemoteActionCompatParcelizer(), HomeViewModel.class, "onSafeAreaChanged", "onSafeAreaChanged(Lcom/roadrunner/map/contracts/layering/entity/SafeArea;)V", 0, 13);
                CombinedScopeView combinedScopeView = onoptionsitemselected.serializer;
                return new onDestroyOptionsMenu((e9) ((mergeJsonObjects) combinedScopeView.RemoteActionCompatParcelizer).write(), (isResumed) ((mergeJsonObjects) combinedScopeView.read).write(), (transferSessionPackageI) ((mergeJsonObjects) combinedScopeView.write).write(), requirehost, roomDatabase$$ExternalSyntheticLambda2, anonymousClass1);
            }
        };
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1Serializer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.NONE, new SingleProcessDataStore$file$2(13, new SingleProcessDataStore$file$2(12, this)));
        final int i2 = 1;
        this.getOnBackPressedDispatcher = new ComponentRegistry$Builder(displayInAppMessagelambda1.serializer(HomeViewModel.class), new initLifecycle(onviewdetachedfromwindowlambda1Serializer, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, new initLifecycle(onviewdetachedfromwindowlambda1Serializer, 1));
        this.serializer = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: com.roadrunner.home.HomeFragment$$ExternalSyntheticLambda1
            private static int read = 1;
            private static int serializer;
            public final /* synthetic */ HomeFragment RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                int i3 = 2 % 2;
                int i4 = read + 19;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i2;
                HomeFragment homeFragment = this.RemoteActionCompatParcelizer;
                if (i6 == 0) {
                    r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = homeFragment.getNavigationEventDispatcher;
                    if (r8lambdaudhhxliolpu0hpccqh6voskpny == null) {
                        removeNodeAtDepth.serializer("viewModelFactory");
                        throw null;
                    }
                    int i7 = read + 103;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return r8lambdaudhhxliolpu0hpccqh6voskpny;
                }
                onOptionsItemSelected onoptionsitemselected = homeFragment.IconCompatParcelizer;
                if (onoptionsitemselected == null) {
                    removeNodeAtDepth.serializer("homeScreenLayoutCoordinatorFactory");
                    throw null;
                }
                requireHost requirehost = homeFragment.RemoteActionCompatParcelizer;
                requirehost.getClass();
                RoomDatabase$$ExternalSyntheticLambda2 roomDatabase$$ExternalSyntheticLambda2 = new RoomDatabase$$ExternalSyntheticLambda2(22, homeFragment);
                HomeFragment.AnonymousClass1 anonymousClass1 = new HomeFragment.AnonymousClass1(1, homeFragment.RemoteActionCompatParcelizer(), HomeViewModel.class, "onSafeAreaChanged", "onSafeAreaChanged(Lcom/roadrunner/map/contracts/layering/entity/SafeArea;)V", 0, 13);
                CombinedScopeView combinedScopeView = onoptionsitemselected.serializer;
                return new onDestroyOptionsMenu((e9) ((mergeJsonObjects) combinedScopeView.RemoteActionCompatParcelizer).write(), (isResumed) ((mergeJsonObjects) combinedScopeView.read).write(), (transferSessionPackageI) ((mergeJsonObjects) combinedScopeView.write).write(), requirehost, roomDatabase$$ExternalSyntheticLambda2, anonymousClass1);
            }
        });
        this.PlaybackStateCompatCustomAction = new FragmentManager$FragmentLifecycleCallbacks() { // from class: com.roadrunner.home.HomeFragment$mapViewLifecycleCallback$1
            private static int RemoteActionCompatParcelizer = 1;
            private static int serializer;

            @Override // androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks
            public final void write(div7Ah8Wj8 div7ah8wj8, Fragment fragment, View view) {
                int i3 = 2 % 2;
                int i4 = serializer + 5;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    fragment.getClass();
                    view.getClass();
                    view.findViewWithTag("map_view_tag");
                    throw null;
                }
                fragment.getClass();
                view.getClass();
                View viewFindViewWithTag = view.findViewWithTag("map_view_tag");
                if (viewFindViewWithTag != null) {
                    final HomeFragment homeFragment = this.write;
                    viewFindViewWithTag.setOnTouchListener(new View.OnTouchListener() { // from class: com.roadrunner.home.HomeFragment$mapViewLifecycleCallback$1$$ExternalSyntheticLambda0
                        private static int read = 1;
                        private static int write;

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            int i5 = 2 % 2;
                            int i6 = read + 57;
                            write = i6 % Fields.SpotShadowColor;
                            Object obj = null;
                            if (i6 % 2 != 0) {
                                motionEvent.getAction();
                                throw null;
                            }
                            if (motionEvent.getAction() == 0) {
                                int i7 = read + 115;
                                write = i7 % Fields.SpotShadowColor;
                                if (i7 % 2 != 0) {
                                    homeFragment.serializer().read(onPrimaryNavigationFragmentChanged.COLLAPSED);
                                    obj.hashCode();
                                    throw null;
                                }
                                homeFragment.serializer().read(onPrimaryNavigationFragmentChanged.COLLAPSED);
                            }
                            int i8 = read + 99;
                            write = i8 % Fields.SpotShadowColor;
                            if (i8 % 2 == 0) {
                                return false;
                            }
                            obj.hashCode();
                            throw null;
                        }
                    });
                }
                int i5 = RemoteActionCompatParcelizer + 43;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 14 / 0;
                }
            }
        };
    }

    @Override // o.obtainTint8_81llA
    public final getPowersOfTen read() {
        int i = 2 % 2;
        int i2 = onBackPressed + 87;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        isDigit isdigit = isDigit.serializer;
        int i4 = onActivityResult + 117;
        onBackPressed = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return isdigit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.roadrunner.home.HomeFragment$onViewCreated$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public final /* synthetic */ int write;
        private static final byte[] $$a = {112, 92, -119, 6, 68, -68};
        private static final int $$b = 118;
        private static int RemoteActionCompatParcelizer = 0;
        private static int IconCompatParcelizer = 1;

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r6 = 111 - r6
                byte[] r0 = com.roadrunner.home.HomeFragment.AnonymousClass1.$$a
                int r7 = r7 * 2
                int r1 = r7 + 3
                int r8 = r8 * 3
                int r8 = 3 - r8
                byte[] r1 = new byte[r1]
                int r7 = r7 + 2
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r8
                r4 = r2
                goto L31
            L18:
                r3 = r2
            L19:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L31:
                int r6 = -r6
                int r8 = r8 + r6
                int r6 = r8 + 3
                r8 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.HomeFragment.AnonymousClass1.a(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
            super(i, i2, cls, obj, str, str2);
            this.write = i3;
        }

        /* JADX WARN: Code duplicated, block: B:257:0x0222 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x021f A[Catch: Exception -> 0x032e, TryCatch #1 {Exception -> 0x032e, blocks: (B:42:0x0159, B:43:0x0168, B:47:0x017b, B:52:0x01a4, B:50:0x0190, B:53:0x01a8, B:54:0x01b7, B:57:0x01c1, B:58:0x01d4, B:62:0x01e7, B:67:0x0210, B:69:0x021f, B:65:0x01fc, B:71:0x0224, B:72:0x0228, B:74:0x022e, B:76:0x0258, B:77:0x0304), top: B:236:0x0159 }] */
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            Object[] objArr;
            long[] jArr;
            int i;
            int i2;
            Object next;
            StyleObjectInfo styleObjectInfo;
            String id;
            Object next2;
            int i3 = 2;
            int i4 = 2 % 2;
            int i5 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            int i8 = 0;
            int i9 = 1;
            ShortNewsContentCardView shortNewsContentCardView = null;
            switch (i7) {
                case 0:
                    hasOptionsMenu hasoptionsmenu = (hasOptionsMenu) obj;
                    hasoptionsmenu.getClass();
                    HomeFragment homeFragment = (HomeFragment) this.MediaMetadataCompat;
                    if (hasoptionsmenu instanceof getViewLifecycleOwner) {
                        int i10 = IconCompatParcelizer + 111;
                        RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        homeFragment.RemoteActionCompatParcelizer(((getViewLifecycleOwner) hasoptionsmenu).IconCompatParcelizer, ddefault.IconCompatParcelizer, 0);
                        return createfromparcel;
                    }
                    homeFragment.getClass();
                    if (hasoptionsmenu.equals(getViewLifecycleOwnerLiveData.IconCompatParcelizer)) {
                        homeFragment.RemoteActionCompatParcelizer(setOnSessionTrackingFailedListener.OTHER);
                        ActivityState activityState = homeFragment.ParcelableVolumeInfo;
                        if (activityState == null) {
                            removeNodeAtDepth.serializer("riderSafetyNavigator");
                            throw null;
                        }
                        FragmentActivity fragmentActivityRequireActivity = homeFragment.requireActivity();
                        fragmentActivityRequireActivity.getClass();
                        activityState.RemoteActionCompatParcelizer(fragmentActivityRequireActivity);
                        return createfromparcel;
                    }
                    if (!(hasoptionsmenu instanceof initState)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    boolean z = ((initState) hasoptionsmenu).write;
                    ExtrasKt.write(homeFragment, Boolean.valueOf(z));
                    ExtrasKt.read(662558831, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -662558827, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{homeFragment, Boolean.valueOf(z)});
                    try {
                        homeFragment.requireActivity().reportFullyDrawn();
                        return createfromparcel;
                    } catch (SecurityException e) {
                        Timber.RemoteActionCompatParcelizer.serializer(e, "report fully drawn error", new Object[0]);
                        return createfromparcel;
                    }
                case 1:
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    AbstractClickableNode abstractClickableNode = (AbstractClickableNode) this.MediaMetadataCompat;
                    AnchoredDraggableKtanimateToWithDecay2 anchoredDraggableKtanimateToWithDecay2 = abstractClickableNode.write;
                    if (zBooleanValue) {
                        int i12 = IconCompatParcelizer + 101;
                        RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        abstractClickableNode.RemoteActionCompatParcelizer();
                    } else {
                        if (abstractClickableNode.PlaybackStateCompatCustomAction != null) {
                            Object[] objArr2 = anchoredDraggableKtanimateToWithDecay2.MediaDescriptionCompat;
                            long[] jArr2 = anchoredDraggableKtanimateToWithDecay2.read;
                            int length = jArr2.length - 2;
                            if (length >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j = jArr2[i14];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = RemoteActionCompatParcelizer + 101;
                                        IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                                        if (i15 % 2 == 0) {
                                            i2 = (~(i14 * length)) * 2596;
                                            i = 57;
                                        } else {
                                            i = 8;
                                            i2 = 8 - ((~(i14 - length)) >>> 31);
                                        }
                                        while (i8 < i2) {
                                            if ((j & 255) < 128) {
                                                BuildersKt.RemoteActionCompatParcelizer(abstractClickableNode.getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, (Button) objArr2[(i14 << 3) + i8], shortNewsContentCardView, i9), 3);
                                            }
                                            j >>= i;
                                            i8++;
                                            objArr2 = objArr2;
                                            jArr2 = jArr2;
                                        }
                                        objArr = objArr2;
                                        jArr = jArr2;
                                        if (i2 == i) {
                                        }
                                    } else {
                                        objArr = objArr2;
                                        jArr = jArr2;
                                    }
                                    if (i14 != length) {
                                        int i16 = IconCompatParcelizer + 27;
                                        RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                                        int i17 = i16 % 2;
                                        i14++;
                                        objArr2 = objArr;
                                        jArr2 = jArr;
                                        i8 = 0;
                                    }
                                }
                            }
                            int i18 = 2;
                            Button button = abstractClickableNode.MediaSessionCompatToken;
                            if (button != null) {
                                BuildersKt.RemoteActionCompatParcelizer(abstractClickableNode.getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(abstractClickableNode, button, shortNewsContentCardView, i18), 3);
                            }
                        }
                        anchoredDraggableKtanimateToWithDecay2.write();
                        abstractClickableNode.MediaSessionCompatToken = null;
                        abstractClickableNode.IconCompatParcelizer();
                    }
                    return createfromparcel;
                case 2:
                    Set set = (Set) obj;
                    set.getClass();
                    InvalidationTracker invalidationTracker = (InvalidationTracker) this.MediaMetadataCompat;
                    ReentrantLock reentrantLock = invalidationTracker.MediaDescriptionCompat;
                    reentrantLock.lock();
                    try {
                        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat(invalidationTracker.serializer.values());
                        reentrantLock.unlock();
                        Iterator it = listPlaybackStateCompat.iterator();
                        while (it.hasNext()) {
                            ((clipRectmtrdDEdefault) it.next()).read(set);
                        }
                        return createfromparcel;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                case 3:
                    InnerShadowRendererProvider innerShadowRendererProvider = (InnerShadowRendererProvider) obj;
                    innerShadowRendererProvider.getClass();
                    Iterator it2 = ((CopyOnWriteArraySet) ((AppQualityScore) this.MediaMetadataCompat).MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()).iterator();
                    while (it2.hasNext()) {
                        ((getAdjustedBounds) it2.next()).onEventReady(innerShadowRendererProvider);
                    }
                    return createfromparcel;
                case 4:
                    createInnerShadowBrushu1Psq8 createinnershadowbrushu1psq8 = (createInnerShadowBrushu1Psq8) obj;
                    createinnershadowbrushu1psq8.getClass();
                    Iterator it3 = ((CopyOnWriteArraySet) ((AppQualityScore) this.MediaMetadataCompat).MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper()).iterator();
                    while (it3.hasNext()) {
                        ((getAdjustedBounds) it3.next()).onEventReady(createinnershadowbrushu1psq8);
                    }
                    return createfromparcel;
                case 5:
                    fullMultiplicationHighBits fullmultiplicationhighbits = (fullMultiplicationHighBits) obj;
                    fullmultiplicationhighbits.getClass();
                    for (createInnerPathShadowBrushLjSzlW0 createinnerpathshadowbrushljszlw0 : ((drawCachedImageFqjB98A) this.MediaMetadataCompat).MediaSessionCompatToken) {
                        createinnerpathshadowbrushljszlw0.getClass();
                        createinnerpathshadowbrushljszlw0.write.invoke(new createInnerShadowBrushu1Psq8(onMove.RemoteActionCompatParcelizer(fullmultiplicationhighbits.RemoteActionCompatParcelizer, (Map) createinnerpathshadowbrushljszlw0.RemoteActionCompatParcelizer.invoke())));
                    }
                    return createfromparcel;
                case 6:
                    String str = (String) obj;
                    str.getClass();
                    ((getNumChildren) this.MediaMetadataCompat).getClass();
                    getClipPathData getclippathdata = (getClipPathData) getNumChildren.read.get(str);
                    if (getclippathdata != null) {
                        getNumChildren.IconCompatParcelizer(getclippathdata);
                    }
                    return createfromparcel;
                case 7:
                    String str2 = (String) obj;
                    str2.getClass();
                    ((getNumChildren) this.MediaMetadataCompat).getClass();
                    getClipPathData getclippathdata2 = (getClipPathData) getNumChildren.read.get(str2);
                    if (getclippathdata2 != null && getclippathdata2.IconCompatParcelizer == null) {
                        getNumChildren.write(getclippathdata2, str2);
                    }
                    return createfromparcel;
                case 8:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 9:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 10:
                    ((Timber.Forest) this.MediaMetadataCompat).write((Throwable) obj);
                    return createfromparcel;
                case 11:
                    Throwable th2 = (Throwable) obj;
                    th2.getClass();
                    ((BehaviorSubject) this.MediaMetadataCompat).onError(th2);
                    return createfromparcel;
                case 12:
                    createNotificationChannelGroupsCompat createnotificationchannelgroupscompat = (createNotificationChannelGroupsCompat) obj;
                    createnotificationchannelgroupscompat.getClass();
                    WorkOpportunityTypeSelectorUiModelImpl workOpportunityTypeSelectorUiModelImpl = (WorkOpportunityTypeSelectorUiModelImpl) ((WorkOpportunityTypeSelectorUiModel) this.MediaMetadataCompat);
                    workOpportunityTypeSelectorUiModelImpl.getClass();
                    CoreComponentFactory coreComponentFactory = workOpportunityTypeSelectorUiModelImpl.MediaMetadataCompat;
                    sc scVar = createnotificationchannelgroupscompat.MediaSessionCompatQueueItem;
                    scVar.getClass();
                    int i19 = superDispatchKeyEvent.read[scVar.ordinal()];
                    if (i19 == 1) {
                        Map mapSingletonMap = Collections.singletonMap("start_session_type", "existing_shift");
                        mapSingletonMap.getClass();
                        coreComponentFactory.IconCompatParcelizer("session_type_select", mapSingletonMap);
                    } else {
                        if (i19 != 2) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return null;
                        }
                        int i20 = RemoteActionCompatParcelizer + 81;
                        IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        Map mapSingletonMap2 = Collections.singletonMap("start_session_type", "work_now");
                        mapSingletonMap2.getClass();
                        coreComponentFactory.IconCompatParcelizer("session_type_select", mapSingletonMap2);
                    }
                    workOpportunityTypeSelectorUiModelImpl.MediaBrowserCompatMediaItem.write.IconCompatParcelizer(scVar);
                    return createfromparcel;
                case 13:
                    g6 g6Var = (g6) obj;
                    g6Var.getClass();
                    HomeViewModel homeViewModel = (HomeViewModel) this.MediaMetadataCompat;
                    homeViewModel.getClass();
                    SafeAreaPublisherImpl safeAreaPublisherImpl = homeViewModel.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    safeAreaPublisherImpl.getClass();
                    safeAreaPublisherImpl.read.IconCompatParcelizer(g6Var);
                    return createfromparcel;
                case 14:
                    ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(new Violation((String) obj));
                    return createfromparcel;
                case 15:
                    ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(new Violation((String) obj));
                    return createfromparcel;
                case 16:
                    ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(new Violation((String) obj));
                    return createfromparcel;
                case 17:
                    ((WrongFragmentContainerViolation) this.MediaMetadataCompat).serializer.IconCompatParcelizer(new Violation((String) obj));
                    return createfromparcel;
                case 18:
                    boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                    HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = (HomeBottomSheetUiModelImpl) this.MediaMetadataCompat;
                    if (!homeBottomSheetUiModelImpl.ComponentActivity && zBooleanValue2) {
                        homeBottomSheetUiModelImpl.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer(access300.BottomSheet);
                        homeBottomSheetUiModelImpl.ComponentActivity = true;
                    }
                    return createfromparcel;
                case 19:
                    boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                    HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl2 = (HomeBottomSheetUiModelImpl) this.MediaMetadataCompat;
                    if (!homeBottomSheetUiModelImpl2.ComponentActivity && zBooleanValue3) {
                        homeBottomSheetUiModelImpl2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer(access300.BottomSheet);
                        homeBottomSheetUiModelImpl2.ComponentActivity = true;
                    }
                    return createfromparcel;
                case 20:
                    int iIntValue = ((Number) obj).intValue();
                    markFragmentsCreated markfragmentscreated = (markFragmentsCreated) this.MediaMetadataCompat;
                    if (!markfragmentscreated.MediaBrowserCompatMediaItem && iIntValue > 0) {
                        markfragmentscreated.MediaSessionCompatQueueItem.IconCompatParcelizer(access300.FloatingLayer);
                        markfragmentscreated.MediaBrowserCompatMediaItem = true;
                    }
                    return createfromparcel;
                case 21:
                    int iIntValue2 = ((Number) obj).intValue();
                    markFragmentsCreated markfragmentscreated2 = (markFragmentsCreated) this.MediaMetadataCompat;
                    if (!markfragmentscreated2.MediaBrowserCompatMediaItem && iIntValue2 > 0) {
                        int i22 = RemoteActionCompatParcelizer + 83;
                        IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        markfragmentscreated2.MediaSessionCompatQueueItem.IconCompatParcelizer(access300.FloatingLayer);
                        markfragmentscreated2.MediaBrowserCompatMediaItem = true;
                    }
                    return createfromparcel;
                case 22:
                    shouldIgnore shouldignore = (shouldIgnore) obj;
                    shouldignore.getClass();
                    InstantShiftsUiModelImpl instantShiftsUiModelImpl = (InstantShiftsUiModelImpl) ((InstantShiftsUiModel) this.MediaMetadataCompat);
                    instantShiftsUiModelImpl.getClass();
                    if (EmptyResultSetException.read[shouldignore.RemoteActionCompatParcelizer().ordinal()] != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    instantShiftsUiModelImpl.read.serializer(new ScrollbarHelper(shouldignore));
                    instantShiftsUiModelImpl.write.IconCompatParcelizer.logEvent("todays_shifts_take_shift", null);
                    return createfromparcel;
                case 23:
                    AbstractC0210v abstractC0210v = (AbstractC0210v) obj;
                    abstractC0210v.getClass();
                    MapboxFragment mapboxFragment = (MapboxFragment) this.MediaMetadataCompat;
                    if (abstractC0210v instanceof C0211w) {
                        ((T) mapboxFragment.serializer().write()).MediaDescriptionCompat.write(createfromparcel);
                        return createfromparcel;
                    }
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    a(b, b2, b2, objArr3);
                    if (!Class.forName((String) objArr3[0]).isInstance(abstractC0210v)) {
                        mapboxFragment.getClass();
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    T t = (T) mapboxFragment.serializer().write();
                    g6 g6Var2 = ((C0209u) abstractC0210v).IconCompatParcelizer;
                    t.getClass();
                    g6Var2.getClass();
                    t.IconCompatParcelizer = f5ExternalSyntheticLambda4.RemoteActionCompatParcelizer(t.IconCompatParcelizer, 0.0d, null, g6Var2, 3);
                    t.MediaDescriptionCompat.write(createfromparcel);
                    return createfromparcel;
                case 24:
                    Style style = (Style) obj;
                    style.getClass();
                    ((ihExternalSyntheticLambda2) this.MediaMetadataCompat).getClass();
                    try {
                        List<StyleObjectInfo> styleLayers = style.getStyleLayers();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it4 = styleLayers.iterator();
                        while (it4.hasNext()) {
                            int i24 = RemoteActionCompatParcelizer + 79;
                            IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                            if (i24 % 2 == 0) {
                                next2 = it4.next();
                                String id2 = ((StyleObjectInfo) next2).getId();
                                id2.getClass();
                                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(id2, "cluster-annotation-layer-id-shadow-", true)) {
                                    arrayList.add(next2);
                                }
                            } else {
                                next2 = it4.next();
                                String id3 = ((StyleObjectInfo) next2).getId();
                                id3.getClass();
                                if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(id3, "cluster-annotation-layer-id-shadow-", false)) {
                                    arrayList.add(next2);
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
                        Iterator it5 = arrayList.iterator();
                        while (true) {
                            int i25 = 6;
                            if (!it5.hasNext()) {
                                Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
                                List<StyleObjectInfo> styleLayers2 = style.getStyleLayers();
                                ArrayList<StyleObjectInfo> arrayList3 = new ArrayList();
                                Iterator<T> it6 = styleLayers2.iterator();
                                while (it6.hasNext()) {
                                    int i26 = IconCompatParcelizer + 109;
                                    RemoteActionCompatParcelizer = i26 % Fields.SpotShadowColor;
                                    if (i26 % i3 != 0) {
                                        next = it6.next();
                                        styleObjectInfo = (StyleObjectInfo) next;
                                        String id4 = styleObjectInfo.getId();
                                        id4.getClass();
                                        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(id4, "mapbox-android-pointAnnotation-cluster-circle-layer-0-", true)) {
                                            id = styleObjectInfo.getId();
                                            id.getClass();
                                            if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) id, (CharSequence) "shadow-", false)) {
                                                arrayList3.add(next);
                                            }
                                        }
                                    } else {
                                        next = it6.next();
                                        styleObjectInfo = (StyleObjectInfo) next;
                                        String id5 = styleObjectInfo.getId();
                                        id5.getClass();
                                        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(id5, "mapbox-android-pointAnnotation-cluster-circle-layer-0-", false)) {
                                            id = styleObjectInfo.getId();
                                            id.getClass();
                                            if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) id, (CharSequence) "shadow-", false)) {
                                                arrayList3.add(next);
                                            }
                                        }
                                    }
                                    i3 = 2;
                                }
                                for (StyleObjectInfo styleObjectInfo2 : arrayList3) {
                                    String id6 = styleObjectInfo2.getId();
                                    id6.getClass();
                                    if (setR8lambda54BeH8ZsBru0CXI2CCSP2syNys.contains(Integer.valueOf(Integer.parseInt((String) onContentCardDismissed.MediaDescriptionCompat(hideCurrentlyDisplayingInAppMessage.serializer(id6, new String[]{"-"}, i25))) - 1))) {
                                        String str3 = styleObjectInfo2.getId() + "-shadow";
                                        String id7 = styleObjectInfo2.getId();
                                        id7.getClass();
                                        String string = style.getStyleLayerProperty(id7, "source").getValue().toString();
                                        string.getClass();
                                        String id8 = styleObjectInfo2.getId();
                                        id8.getClass();
                                        String string2 = style.getStyleLayerProperty(id8, "circle-radius").getValue().toString();
                                        string2.getClass();
                                        double d = Double.parseDouble(string2);
                                        CircleLayer circleLayer = new CircleLayer(str3, string);
                                        circleLayer.setProperty$extension_style_release(new PropertyValue("circle-radius", Double.valueOf(d + 5.0d)));
                                        circleLayer.circleColor(Color.parseColor("#90000000"));
                                        circleLayer.setProperty$extension_style_release(new PropertyValue("circle-blur", Double.valueOf(0.45d)));
                                        Expression[] expressionArr = {new Expression("point_count")};
                                        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder("has");
                                        expressionBuilder.addArgument(expressionArr[0]);
                                        circleLayer.setProperty$extension_style_release(new PropertyValue("filter", expressionBuilder.build()));
                                        circleLayer.bindTo(style, new LayerPosition(null, styleObjectInfo2.getId(), null));
                                        i25 = 6;
                                    }
                                    break;
                                }
                            } else {
                                String id9 = ((StyleObjectInfo) it5.next()).getId();
                                id9.getClass();
                                arrayList2.add(Integer.valueOf(Integer.parseInt((String) onContentCardDismissed.MediaDescriptionCompat(hideCurrentlyDisplayingInAppMessage.serializer(id9, new String[]{"-"}, 6)))));
                                i3 = 2;
                            }
                            return createfromparcel;
                        }
                    } catch (Exception e2) {
                        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Could not add shadow layer to clusters", new Object[0]);
                    }
                    break;
                case 25:
                    access900 access900Var = (access900) obj;
                    access900Var.getClass();
                    BasePushMessagesViewModel basePushMessagesViewModel = (BasePushMessagesViewModel) this.MediaMetadataCompat;
                    basePushMessagesViewModel.getClass();
                    DialogMessageRequestProxy dialogMessageRequestProxy = basePushMessagesViewModel.RatingCompat;
                    if (dialogMessageRequestProxy == null) {
                        removeNodeAtDepth.serializer("dialogMessageRequestProxy");
                        throw null;
                    }
                    dialogMessageRequestProxy.write.onNext(new GraphicsLayer());
                    if (!((Boolean) access900.read(42385299, new Object[]{access900Var}, PackageHandler7.read(), PackageHandler7.read(), PackageHandler7.read(), -42385298, PackageHandler7.read())).booleanValue()) {
                        if (access900Var.MediaBrowserCompatMediaItem()) {
                            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Hide push dialog for back to back orders", new Object[0]);
                        } else if (access900Var.PlaybackStateCompat()) {
                            basePushMessagesViewModel.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(Boolean.TRUE);
                        } else {
                            DefaultForegroundSoundManager defaultForegroundSoundManager = basePushMessagesViewModel.MediaSessionCompatToken;
                            if (defaultForegroundSoundManager == null) {
                                removeNodeAtDepth.serializer("soundManager");
                                throw null;
                            }
                            try {
                                r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = defaultForegroundSoundManager.MediaSessionCompatResultReceiverWrapper;
                                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu == null || !r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.I_()) {
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout = defaultForegroundSoundManager.PlaybackStateCompatCustomAction;
                                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                    defaultForegroundSoundManager.MediaSessionCompatResultReceiverWrapper = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new DefaultForegroundSoundManager$play$1(defaultForegroundSoundManager, shortNewsContentCardView, i8), 2);
                                } else {
                                    int i27 = RemoteActionCompatParcelizer + 87;
                                    IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                                    int i28 = i27 % 2;
                                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Notification job is already running. Skipping play request", new Object[0]);
                                }
                            } catch (Exception e3) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e3, "An error occurred while playing notification from new sound manager", new Object[0]);
                            }
                            getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi = basePushMessagesViewModel.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            if (getkeyboardtap5zf0vsi == null) {
                                removeNodeAtDepth.serializer("vibrationManager");
                                throw null;
                            }
                            getkeyboardtap5zf0vsi.serializer();
                            basePushMessagesViewModel.MediaMetadataCompat.RemoteActionCompatParcelizer(new MessageDialogData(access900Var.MediaMetadataCompat(), access900Var.IconCompatParcelizer(), access900Var.PlaybackStateCompatCustomAction(), access900Var.write(), access900Var.MediaSessionCompatQueueItem(), access900Var.RemoteActionCompatParcelizer(), access900Var.MediaDescriptionCompat(), access900Var.RatingCompat()));
                        }
                        break;
                    } else {
                        basePushMessagesViewModel.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(new lambdaonActivityLifecycle1(access900Var.MediaMetadataCompat(), access900Var.IconCompatParcelizer(), access900Var.serializer(), access900Var.read(), access900Var.MediaSessionCompatQueueItem(), access900Var.RatingCompat()));
                    }
                    return createfromparcel;
                case 26:
                    String str4 = (String) obj;
                    str4.getClass();
                    r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY r8lambdap8kvrporasful_ov_pvwbybk_ny = (r8lambdap8kVRPOrasFuL_ov_PvwbyBK_nY) this.MediaMetadataCompat;
                    r8lambdap8kvrporasful_ov_pvwbybk_ny.getClass();
                    r8lambdap8kvrporasful_ov_pvwbybk_ny.MediaDescriptionCompat.read.IconCompatParcelizer(new r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I(str4, true));
                    return createfromparcel;
                default:
                    return FlowSubscription.access$flowProcessing((FlowSubscription) this.MediaMetadataCompat, (ShortNewsContentCardView) obj);
            }
        }
    }

    public final HomeViewModel RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onBackPressed + 33;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        HomeViewModel homeViewModel = (HomeViewModel) this.getOnBackPressedDispatcher.MediaSessionCompatResultReceiverWrapper();
        int i4 = onBackPressed + 71;
        onActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return homeViewModel;
    }

    public final onDestroyOptionsMenu serializer() {
        int i = 2 % 2;
        int i2 = onBackPressed + 103;
        onActivityResult = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (onDestroyOptionsMenu) this.serializer.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void RemoteActionCompatParcelizer(String str, ddefault ddefaultVar, int i) {
        int i2 = 2 % 2;
        dlambda0 dlambda0Var = this.ResultReceiver;
        if (dlambda0Var == null) {
            removeNodeAtDepth.serializer("snackbarManager");
            throw null;
        }
        int i3 = onBackPressed + 123;
        onActivityResult = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        View viewRequireView = requireView();
        viewRequireView.getClass();
        r8lambdawmxPERJX66sfUc7BfHYWeVjHcwo.IconCompatParcelizer(dlambda0Var, viewRequireView, str, ddefaultVar, i, Float.valueOf(getResources().getDimensionPixelSize(R.dimen.spacing_04)), null, 32);
        int i5 = onActivityResult + 123;
        onBackPressed = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        super.onResume();
        CallTracer callTracer = RemoteActionCompatParcelizer().MediaSessionCompatToken;
        ((decode) callTracer.RemoteActionCompatParcelizer).IconCompatParcelizer("Home", null);
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) callTracer.serializer;
        ((inCompatibilityMode) ((isOpenInternalroom_runtime) callTracer.IconCompatParcelizer)).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new MapLayersUiModel$1(callTracer, null, 10), 2);
        int i2 = onBackPressed + 107;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = onBackPressed + 89;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getChildFragmentManager().read(this.PlaybackStateCompatCustomAction);
        onDestroyOptionsMenu ondestroyoptionsmenuSerializer = serializer();
        ComposeView composeView = ondestroyoptionsmenuSerializer.IconCompatParcelizer;
        onGetLayoutInflater ongetlayoutinflater = ondestroyoptionsmenuSerializer.ComponentActivity;
        composeView.removeOnLayoutChangeListener(ongetlayoutinflater);
        ondestroyoptionsmenuSerializer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.removeOnLayoutChangeListener(ongetlayoutinflater);
        ondestroyoptionsmenuSerializer.RatingCompat.removeOnLayoutChangeListener(ongetlayoutinflater);
        ondestroyoptionsmenuSerializer.serializer.removeOnLayoutChangeListener(ondestroyoptionsmenuSerializer.MediaSessionCompatToken);
        ondestroyoptionsmenuSerializer.write.removeBottomSheetCallback(ondestroyoptionsmenuSerializer.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = null;
        super.onDestroyView();
        int i4 = onActivityResult + 71;
        onBackPressed = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void RemoteActionCompatParcelizer(setOnSessionTrackingFailedListener setonsessiontrackingfailedlistener) {
        int i = 2 % 2;
        int i2 = onBackPressed + 81;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        markFragmentsCreated markfragmentscreated = (markFragmentsCreated) RemoteActionCompatParcelizer().serializer.MediaSessionCompatResultReceiverWrapper();
        markfragmentscreated.read.IconCompatParcelizer(Boolean.TRUE);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = markfragmentscreated.PlaybackStateCompatCustomAction;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        markfragmentscreated.PlaybackStateCompatCustomAction = BuildersKt.RemoteActionCompatParcelizer(markfragmentscreated.IconCompatParcelizer, null, null, new NonTouchScrollingLogicKt$busyReceive$2$job$1(), 3);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        fragmentActivityRequireActivity.getClass();
        ((MainActivity) fragmentActivityRequireActivity).read(setonsessiontrackingfailedlistener, this);
        int i4 = onActivityResult + 21;
        onBackPressed = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onBackPressed + 1;
        onActivityResult = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        layoutInflater.getClass();
        int i4 = 0;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
        int i5 = R.id.bottomSheetContent;
        View viewRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(R.id.bottomSheetContent, viewInflate);
        Object obj = null;
        if (viewRemoteActionCompatParcelizer != null) {
            int i6 = R.id.bottomSheetBodyComposeView;
            ComposeView composeView = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.bottomSheetBodyComposeView, viewRemoteActionCompatParcelizer);
            if (composeView != null) {
                i6 = R.id.bottomSheetHeaderComposeView;
                ComposeView composeView2 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.bottomSheetHeaderComposeView, viewRemoteActionCompatParcelizer);
                if (composeView2 != null) {
                    i6 = R.id.bottomSheetNestedScrollView;
                    NestedScrollView nestedScrollView = (NestedScrollView) ExtrasKt.RemoteActionCompatParcelizer(R.id.bottomSheetNestedScrollView, viewRemoteActionCompatParcelizer);
                    if (nestedScrollView != null) {
                        int i7 = onActivityResult + 81;
                        onBackPressed = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 == 0) {
                            throw null;
                        }
                        ComposeView composeView3 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.bottomSheetSeparatorView, viewRemoteActionCompatParcelizer);
                        if (composeView3 != null) {
                            setAllowEnterTransitionOverlap setallowentertransitionoverlap = new setAllowEnterTransitionOverlap((ConstraintLayout) viewRemoteActionCompatParcelizer, composeView, composeView2, nestedScrollView, composeView3);
                            i5 = R.id.bottomSheetParent;
                            drawWithRotationAndOffsetubNVwUQ drawwithrotationandoffsetubnvwuq = (drawWithRotationAndOffsetubNVwUQ) ExtrasKt.RemoteActionCompatParcelizer(R.id.bottomSheetParent, viewInflate);
                            if (drawwithrotationandoffsetubnvwuq != null) {
                                i5 = R.id.expandedBubbleLayerComposeView;
                                ComposeView composeView4 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.expandedBubbleLayerComposeView, viewInflate);
                                if (composeView4 != null) {
                                    int i8 = onBackPressed + 85;
                                    onActivityResult = i8 % Fields.SpotShadowColor;
                                    if (i8 % 2 != 0) {
                                        obj.hashCode();
                                        throw null;
                                    }
                                    ComposeView composeView5 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.footerComposeView, viewInflate);
                                    if (composeView5 != null) {
                                        i5 = R.id.glowBoxBannerComposeView;
                                        ComposeView composeView6 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.glowBoxBannerComposeView, viewInflate);
                                        if (composeView6 != null) {
                                            i5 = R.id.headerComposeView;
                                            ComposeView composeView7 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.headerComposeView, viewInflate);
                                            if (composeView7 != null) {
                                                i5 = R.id.loadingComposeView;
                                                ComposeView composeView8 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.loadingComposeView, viewInflate);
                                                if (composeView8 != null) {
                                                    i5 = R.id.mapFragmentContainer;
                                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) ExtrasKt.RemoteActionCompatParcelizer(R.id.mapFragmentContainer, viewInflate);
                                                    if (fragmentContainerView != null) {
                                                        int i9 = onBackPressed + 23;
                                                        onActivityResult = i9 % Fields.SpotShadowColor;
                                                        int i10 = i9 % 2;
                                                        i5 = R.id.popupLayerComposeView;
                                                        ComposeView composeView9 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.popupLayerComposeView, viewInflate);
                                                        if (composeView9 != null) {
                                                            i5 = R.id.shadow;
                                                            if (ExtrasKt.RemoteActionCompatParcelizer(R.id.shadow, viewInflate) != null) {
                                                                i5 = R.id.stickyFooterComposeView;
                                                                ComposeView composeView10 = (ComposeView) ExtrasKt.RemoteActionCompatParcelizer(R.id.stickyFooterComposeView, viewInflate);
                                                                if (composeView10 != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                    this.RemoteActionCompatParcelizer = new requireHost(constraintLayout, setallowentertransitionoverlap, drawwithrotationandoffsetubnvwuq, composeView4, composeView5, composeView6, composeView7, composeView8, fragmentContainerView, composeView9, composeView10);
                                                                    constraintLayout.setOnApplyWindowInsetsListener(new HomeFragment$$ExternalSyntheticLambda4(this, i4));
                                                                    requireHost requirehost = this.RemoteActionCompatParcelizer;
                                                                    requirehost.getClass();
                                                                    ConstraintLayout constraintLayout2 = requirehost.MediaMetadataCompat;
                                                                    constraintLayout2.getClass();
                                                                    return constraintLayout2;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i5 = R.id.footerComposeView;
                                    }
                                }
                            }
                        } else {
                            i6 = R.id.bottomSheetSeparatorView;
                        }
                    }
                }
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewRemoteActionCompatParcelizer.getResources().getResourceName(i6)));
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0510  */
    /* JADX WARN: Code duplicated, block: B:39:0x0514  */
    /* JADX WARN: Code duplicated, block: B:40:0x0574  */
    /* JADX WARN: Code duplicated, block: B:58:0x05e7  */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        setLineBreakConfig setlinebreakconfig;
        int i = 2 % 2;
        int i2 = onActivityResult + 67;
        onBackPressed = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        view.getClass();
        super.onViewCreated(view, bundle);
        defaultViewModelProviderFactory_delegatelambda0 onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        accessisRenderNodeCompatiblecp viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        onBackPressedDispatcher.read(serializer().PlaybackStateCompat, viewLifecycleOwner);
        supportsColorMatrixQuery lifecycle = getLifecycle();
        snapToTargetExistingView snaptotargetexistingview = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (snaptotargetexistingview == null) {
            removeNodeAtDepth.serializer("cancelHomeScreenPerformanceTracker");
            throw null;
        }
        int i4 = onBackPressed + 11;
        onActivityResult = i4 % Fields.SpotShadowColor;
        int i5 = 0;
        if (i4 % 2 != 0) {
            lifecycle.IconCompatParcelizer(snaptotargetexistingview);
            getChildFragmentManager().RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) this.PlaybackStateCompatCustomAction, false);
            if (bundle == null) {
                if (this.MediaSessionCompatToken != null) {
                    removeNodeAtDepth.serializer("mapFragmentFactory");
                    throw null;
                }
                MapboxFragment mapboxFragment = new MapboxFragment();
                div7Ah8Wj8 childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(childFragmentManager);
                isinfiniteannotations.IconCompatParcelizer(R.id.mapFragmentContainer, mapboxFragment, MapboxFragment.class.getName());
                isinfiniteannotations.read();
            }
        } else {
            lifecycle.IconCompatParcelizer(snaptotargetexistingview);
            getChildFragmentManager().RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) this.PlaybackStateCompatCustomAction, false);
            if (bundle == null) {
                if (this.MediaSessionCompatToken != null) {
                    removeNodeAtDepth.serializer("mapFragmentFactory");
                    throw null;
                }
                MapboxFragment mapboxFragment2 = new MapboxFragment();
                div7Ah8Wj8 childFragmentManager2 = getChildFragmentManager();
                childFragmentManager2.getClass();
                isInfiniteannotations isinfiniteannotations2 = new isInfiniteannotations(childFragmentManager2);
                isinfiniteannotations2.IconCompatParcelizer(R.id.mapFragmentContainer, mapboxFragment2, MapboxFragment.class.getName());
                isinfiniteannotations2.read();
            }
        }
        markItemDecorInsetsDirty markitemdecorinsetsdirty = this.PlaybackStateCompat;
        if (markitemdecorinsetsdirty == null) {
            removeNodeAtDepth.serializer("initHomeStickyFooter");
            throw null;
        }
        requireHost requirehost = this.RemoteActionCompatParcelizer;
        requirehost.getClass();
        ComposeView composeView = requirehost.ParcelableVolumeInfo;
        offsetPositionRecordsForRemove offsetpositionrecordsforremove = (offsetPositionRecordsForRemove) RemoteActionCompatParcelizer().ComponentActivity.MediaSessionCompatResultReceiverWrapper();
        HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1 = new HomeFragment$initPopupLayer$1(3, this, HomeFragment.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Lcom/ui/common/util/SnackbarType;I)V", 0, 4);
        int i6 = 0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "showLoading", "showLoading(Ljava/lang/String;)V", i6, 17);
        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1 = new RoomDatabase$closeBarrier$1(0, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "hideLoading", "hideLoading()V", i6, 12);
        offsetpositionrecordsforremove.getClass();
        ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed disposeOnViewTreeLifecycleDestroyed = ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE;
        composeView.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        int i7 = 1;
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView, false, new DragAndDropTargetModifierNode(new updateSubhierarchy(offsetpositionrecordsforremove, markitemdecorinsetsdirty, homeFragment$initPopupLayer$1, anonymousClass1, roomDatabase$closeBarrier$1, 3), true, -753019229)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new HomeFragment$initBottomSheetContent$1(this, shortNewsContentCardView, i5), 3);
        final onHiddenChanged onhiddenchanged = this.RatingCompat;
        if (onhiddenchanged == null) {
            removeNodeAtDepth.serializer("initHomeBottomSheetContent");
            throw null;
        }
        requireHost requirehost2 = this.RemoteActionCompatParcelizer;
        requirehost2.getClass();
        ComposeView composeView2 = requirehost2.read.IconCompatParcelizer;
        requireHost requirehost3 = this.RemoteActionCompatParcelizer;
        requirehost3.getClass();
        ComposeView composeView3 = requirehost3.read.write;
        requireHost requirehost4 = this.RemoteActionCompatParcelizer;
        requirehost4.getClass();
        ComposeView composeView4 = requirehost4.read.serializer;
        HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = (HomeBottomSheetUiModelImpl) RemoteActionCompatParcelizer().MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper();
        final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$2 = new HomeFragment$initPopupLayer$1(3, this, HomeFragment.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Lcom/ui/common/util/SnackbarType;I)V", 0, 1);
        int i8 = 0;
        final AnonymousClass1 anonymousClass2 = new AnonymousClass1(1, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "showLoading", "showLoading(Ljava/lang/String;)V", i8, 14);
        int i9 = 0;
        final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$2 = new RoomDatabase$closeBarrier$1(i9, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "hideLoading", "hideLoading()V", i8, 9);
        homeBottomSheetUiModelImpl.getClass();
        final StateFlow stateFlow = homeBottomSheetUiModelImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        final StateFlow stateFlow2 = homeBottomSheetUiModelImpl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$3 = new RoomDatabase$closeBarrier$1(i9, homeBottomSheetUiModelImpl, HomeBottomSheetUiModelImpl.class, "onHeaderClick", "onHeaderClick()V", i8, 13);
        final AnonymousClass1 anonymousClass3 = new AnonymousClass1(1, homeBottomSheetUiModelImpl, HomeBottomSheetUiModelImpl.class, "onViewRendered", "onViewRendered(Z)V", i8, 18);
        composeView2.setFocusable(true);
        composeView2.setClickable(true);
        composeView2.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView2, false, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.onInflate
            private static int MediaMetadataCompat = 0;
            private static int MediaSessionCompatQueueItem = 1;

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int i10 = 2 % 2;
                int i11 = MediaMetadataCompat + 3;
                MediaSessionCompatQueueItem = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(stateFlow2, getpostalcode, 0);
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = coil3.ExtrasKt.write(stateFlow, getpostalcode, 0);
                    androidx.compose.ui.Modifier modifier = canReadPlayIds.read(androidx.compose.ui.Modifier.Companion, null, false, null, roomDatabase$closeBarrier$3, getpostalcode, 63);
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7Write.getValue();
                    onHiddenChanged onhiddenchanged2 = onhiddenchanged;
                    Object objWrite = onhiddenchanged2.IconCompatParcelizer.write();
                    objWrite.getClass();
                    HomeBottomSheetContentKt.HomeBottomSheetContent(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, ((Boolean) populateViewStructure_androidKtpopulate7Write2.getValue()).booleanValue(), (isRemoving) objWrite, homeFragment$initPopupLayer$2, anonymousClass3, modifier, anonymousClass2, roomDatabase$closeBarrier$2, onhiddenchanged2.write, getpostalcode, 0, 0);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i13 = MediaMetadataCompat + 71;
                    MediaSessionCompatQueueItem = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                }
                return createFromParcel.INSTANCE;
            }
        }, true, -2132834775)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        performStart performstart = homeBottomSheetUiModelImpl.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        composeView4.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView4, false, new DragAndDropTargetModifierNode(new Updater$$ExternalSyntheticLambda1(9, performstart), true, -962471465)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        final StateFlow stateFlow3 = homeBottomSheetUiModelImpl.MediaBrowserCompatMediaItem;
        final AnonymousClass1 anonymousClass4 = new AnonymousClass1(1, homeBottomSheetUiModelImpl, HomeBottomSheetUiModelImpl.class, "onViewRendered", "onViewRendered(Z)V", 0, 19);
        composeView3.setFocusable(true);
        composeView3.setClickable(true);
        composeView3.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView3, false, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.onPrepareOptionsMenu
            private static int MediaSessionCompatQueueItem = 1;
            private static int RatingCompat;

            /* JADX WARN: Code duplicated, block: B:8:0x0025  */
            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                boolean z;
                int i10 = 2 % 2;
                getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if ((iIntValue & 3) != 2) {
                    int i11 = MediaSessionCompatQueueItem + 103;
                    RatingCompat = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                if (getpostalcode.write(iIntValue & 1, z)) {
                    int i12 = RatingCompat + 123;
                    MediaSessionCompatQueueItem = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(stateFlow3, getpostalcode, 0);
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = coil3.ExtrasKt.write(stateFlow, getpostalcode, 0);
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) populateViewStructure_androidKtpopulate7Write.getValue();
                    onHiddenChanged onhiddenchanged2 = onhiddenchanged;
                    Object objWrite = onhiddenchanged2.IconCompatParcelizer.write();
                    objWrite.getClass();
                    HomeBottomSheetContentKt.HomeBottomSheetContent(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, ((Boolean) populateViewStructure_androidKtpopulate7Write2.getValue()).booleanValue(), (isRemoving) objWrite, homeFragment$initPopupLayer$2, anonymousClass4, null, anonymousClass2, roomDatabase$closeBarrier$2, onhiddenchanged2.write, getpostalcode, 0, 32);
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                int i14 = RatingCompat + 101;
                MediaSessionCompatQueueItem = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    return createfromparcel;
                }
                throw null;
            }
        }, true, 69096384)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        final setDrawDisappearingViewsLast setdrawdisappearingviewslast = this.MediaBrowserCompatMediaItem;
        if (setdrawdisappearingviewslast == null) {
            removeNodeAtDepth.serializer("initFloatingLayer");
            throw null;
        }
        requireHost requirehost5 = this.RemoteActionCompatParcelizer;
        requirehost5.getClass();
        ComposeView composeView5 = requirehost5.RatingCompat;
        requireHost requirehost6 = this.RemoteActionCompatParcelizer;
        requirehost6.getClass();
        ComposeView composeView6 = requirehost6.serializer;
        final markFragmentsCreated markfragmentscreated = (markFragmentsCreated) RemoteActionCompatParcelizer().serializer.MediaSessionCompatResultReceiverWrapper();
        final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$3 = new HomeFragment$initPopupLayer$1(3, this, HomeFragment.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Lcom/ui/common/util/SnackbarType;I)V", 0, 2);
        final int i10 = 0;
        final AnonymousClass1 anonymousClass5 = new AnonymousClass1(1, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "showLoading", "showLoading(Ljava/lang/String;)V", i10, 15);
        final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$4 = new RoomDatabase$closeBarrier$1(0, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "hideLoading", "hideLoading()V", i10, 10);
        markfragmentscreated.getClass();
        composeView5.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView5, false, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.FragmentContainerView
            private static int MediaMetadataCompat = 0;
            private static int RatingCompat = 1;

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                boolean z;
                int i11 = 2 % 2;
                int i12 = i10;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                boolean z2 = true;
                if (i12 != 0) {
                    getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if ((iIntValue & 3) != 2) {
                        int i13 = RatingCompat + 85;
                        MediaMetadataCompat = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                    if (getpostalcode.write(iIntValue & 1, z)) {
                        final markFragmentsCreated markfragmentscreated2 = markfragmentscreated;
                        final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(markfragmentscreated2.PlaybackStateCompat, getpostalcode, 0);
                        boolean zBooleanValue = ((Boolean) coil3.ExtrasKt.write(markfragmentscreated2.ParcelableVolumeInfo, getpostalcode, 0).getValue()).booleanValue();
                        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                        TapGestureDetectorKt tapGestureDetectorKtWrite = onKeyEventZmokQxo.write(null, 3);
                        final setDrawDisappearingViewsLast setdrawdisappearingviewslast2 = setdrawdisappearingviewslast;
                        final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$4 = homeFragment$initPopupLayer$3;
                        final HomeFragment.AnonymousClass1 anonymousClass6 = anonymousClass5;
                        final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$5 = roomDatabase$closeBarrier$4;
                        final int i15 = 0;
                        androidx.compose.animation.AnimatedVisibilityKt.RemoteActionCompatParcelizer(!zBooleanValue, null, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKtWrite, null, coil3.ExtrasKt.write(-81752360, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.roadrunner.home.floatinglayer.InitFloatingLayerImpl$$ExternalSyntheticLambda2
                            private static int MediaBrowserCompatMediaItem = 0;
                            private static int MediaDescriptionCompat = 1;

                            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i16 = 2 % 2;
                                int i17 = MediaDescriptionCompat + 101;
                                MediaBrowserCompatMediaItem = i17 % Fields.SpotShadowColor;
                                int i18 = i17 % 2;
                                int i19 = i15;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                                onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Write;
                                setDrawDisappearingViewsLast setdrawdisappearingviewslast3 = setdrawdisappearingviewslast2;
                                if (i19 == 0) {
                                    ((Integer) obj5).getClass();
                                    ((AnimatedVisibilityScope) obj3).getClass();
                                    supportStartPostponedEnterTransition supportstartpostponedentertransition = ((findFragmentById) onviewattachedtowindow.getValue()).IconCompatParcelizer;
                                    Object objWrite = setdrawdisappearingviewslast3.write.write();
                                    objWrite.getClass();
                                    supportFinishAfterTransition supportfinishaftertransition = (supportFinishAfterTransition) objWrite;
                                    getPostalCode getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj4);
                                    markFragmentsCreated markfragmentscreated3 = markfragmentscreated2;
                                    boolean z3 = getpostalcode2.read(markfragmentscreated3);
                                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                                    if (z3 || objComponentActivity == androidContentCaptureManager) {
                                        objComponentActivity = new HomeFragment.AnonymousClass1(1, markfragmentscreated3, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 21);
                                        getpostalcode2.write(objComponentActivity);
                                    }
                                    FloatingContentKt.FloatingContent(supportstartpostponedentertransition, supportfinishaftertransition, homeFragment$initPopupLayer$4, anonymousClass6, roomDatabase$closeBarrier$5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), null, null, getpostalcode2, 0, 192);
                                    int i20 = MediaDescriptionCompat + 13;
                                    MediaBrowserCompatMediaItem = i20 % Fields.SpotShadowColor;
                                    int i21 = i20 % 2;
                                    return createfromparcel2;
                                }
                                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj4;
                                ((Integer) obj5).getClass();
                                ((AnimatedVisibilityScope) obj3).getClass();
                                Modifier.Companion companion = Modifier.Companion;
                                supportStartPostponedEnterTransition supportstartpostponedentertransition2 = ((findFragmentById) onviewattachedtowindow.getValue()).RemoteActionCompatParcelizer;
                                WeakHashMap weakHashMap = TooltipKt.serializer;
                                animateElevation animateelevation = setRoundRectOutlineTNW_H78default.read(getbirthdatefull2).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                Object objWrite2 = setdrawdisappearingviewslast3.write.write();
                                objWrite2.getClass();
                                supportFinishAfterTransition supportfinishaftertransition2 = (supportFinishAfterTransition) objWrite2;
                                getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                                markFragmentsCreated markfragmentscreated4 = markfragmentscreated2;
                                boolean z4 = getpostalcode3.read(markfragmentscreated4);
                                Object objComponentActivity2 = getpostalcode3.ComponentActivity();
                                if (!(!z4) || objComponentActivity2 == androidContentCaptureManager) {
                                    objComponentActivity2 = new HomeFragment.AnonymousClass1(1, markfragmentscreated4, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 20);
                                    getpostalcode3.write(objComponentActivity2);
                                }
                                FloatingContentKt.FloatingContent(supportstartpostponedentertransition2, supportfinishaftertransition2, homeFragment$initPopupLayer$4, anonymousClass6, roomDatabase$closeBarrier$5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, animateelevation, getpostalcode3, 1572864, 0);
                                return createfromparcel2;
                            }
                        }, getpostalcode), getpostalcode, 200064, 18);
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createfromparcel;
                }
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final markFragmentsCreated markfragmentscreated3 = markfragmentscreated;
                    final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = coil3.ExtrasKt.write(markfragmentscreated3.PlaybackStateCompat, getpostalcode2, 0);
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write3 = coil3.ExtrasKt.write(markfragmentscreated3.ParcelableVolumeInfo, getpostalcode2, 0);
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                        getpostalcode2.write(objComponentActivity);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new MapLayersUiModel$1(populateViewStructure_androidKtpopulate7, null, 12);
                        getpostalcode2.write(objComponentActivity2);
                        int i16 = MediaMetadataCompat + 59;
                        RatingCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i17 = i16 % 2;
                    }
                    getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
                    if (((Boolean) populateViewStructure_androidKtpopulate7Write3.getValue()).booleanValue() || !((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                        z2 = false;
                    } else {
                        int i18 = RatingCompat + 107;
                        MediaMetadataCompat = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                    }
                    ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer2 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                    TapGestureDetectorKt tapGestureDetectorKtWrite2 = onKeyEventZmokQxo.write(null, 3);
                    final setDrawDisappearingViewsLast setdrawdisappearingviewslast3 = setdrawdisappearingviewslast;
                    final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$5 = homeFragment$initPopupLayer$3;
                    final HomeFragment.AnonymousClass1 anonymousClass7 = anonymousClass5;
                    final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$6 = roomDatabase$closeBarrier$4;
                    final int i20 = 1;
                    androidx.compose.animation.AnimatedVisibilityKt.RemoteActionCompatParcelizer(z2, null, scrollingLogicdoFlingAnimation2reverseScope1Serializer2, tapGestureDetectorKtWrite2, null, coil3.ExtrasKt.write(1794541615, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.roadrunner.home.floatinglayer.InitFloatingLayerImpl$$ExternalSyntheticLambda2
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaDescriptionCompat = 1;

                        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i110 = 2 % 2;
                            int i111 = MediaDescriptionCompat + 101;
                            MediaBrowserCompatMediaItem = i111 % Fields.SpotShadowColor;
                            int i112 = i111 % 2;
                            int i113 = i20;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                            onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Write2;
                            setDrawDisappearingViewsLast setdrawdisappearingviewslast4 = setdrawdisappearingviewslast3;
                            if (i113 == 0) {
                                ((Integer) obj5).getClass();
                                ((AnimatedVisibilityScope) obj3).getClass();
                                supportStartPostponedEnterTransition supportstartpostponedentertransition = ((findFragmentById) onviewattachedtowindow.getValue()).IconCompatParcelizer;
                                Object objWrite = setdrawdisappearingviewslast4.write.write();
                                objWrite.getClass();
                                supportFinishAfterTransition supportfinishaftertransition = (supportFinishAfterTransition) objWrite;
                                getPostalCode getpostalcode3 = (getPostalCode) ((getBirthDateFull) obj4);
                                markFragmentsCreated markfragmentscreated4 = markfragmentscreated3;
                                boolean z3 = getpostalcode3.read(markfragmentscreated4);
                                Object objComponentActivity3 = getpostalcode3.ComponentActivity();
                                if (z3 || objComponentActivity3 == androidContentCaptureManager2) {
                                    objComponentActivity3 = new HomeFragment.AnonymousClass1(1, markfragmentscreated4, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 21);
                                    getpostalcode3.write(objComponentActivity3);
                                }
                                FloatingContentKt.FloatingContent(supportstartpostponedentertransition, supportfinishaftertransition, homeFragment$initPopupLayer$5, anonymousClass7, roomDatabase$closeBarrier$6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3), null, null, getpostalcode3, 0, 192);
                                int i21 = MediaDescriptionCompat + 13;
                                MediaBrowserCompatMediaItem = i21 % Fields.SpotShadowColor;
                                int i22 = i21 % 2;
                                return createfromparcel2;
                            }
                            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj4;
                            ((Integer) obj5).getClass();
                            ((AnimatedVisibilityScope) obj3).getClass();
                            Modifier.Companion companion = Modifier.Companion;
                            supportStartPostponedEnterTransition supportstartpostponedentertransition2 = ((findFragmentById) onviewattachedtowindow.getValue()).RemoteActionCompatParcelizer;
                            WeakHashMap weakHashMap = TooltipKt.serializer;
                            animateElevation animateelevation = setRoundRectOutlineTNW_H78default.read(getbirthdatefull3).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            Object objWrite2 = setdrawdisappearingviewslast4.write.write();
                            objWrite2.getClass();
                            supportFinishAfterTransition supportfinishaftertransition2 = (supportFinishAfterTransition) objWrite2;
                            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                            markFragmentsCreated markfragmentscreated5 = markfragmentscreated3;
                            boolean z4 = getpostalcode4.read(markfragmentscreated5);
                            Object objComponentActivity4 = getpostalcode4.ComponentActivity();
                            if (!(!z4) || objComponentActivity4 == androidContentCaptureManager2) {
                                objComponentActivity4 = new HomeFragment.AnonymousClass1(1, markfragmentscreated5, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 20);
                                getpostalcode4.write(objComponentActivity4);
                            }
                            FloatingContentKt.FloatingContent(supportstartpostponedentertransition2, supportfinishaftertransition2, homeFragment$initPopupLayer$5, anonymousClass7, roomDatabase$closeBarrier$6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, animateelevation, getpostalcode4, 1572864, 0);
                            return createfromparcel2;
                        }
                    }, getpostalcode2), getpostalcode2, 200064, 18);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i21 = RatingCompat + 39;
                    MediaMetadataCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                }
                return createfromparcel;
            }
        }, true, -151244281)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        composeView6.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        final int i11 = 1;
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView6, false, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.FragmentContainerView
            private static int MediaMetadataCompat = 0;
            private static int RatingCompat = 1;

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                boolean z;
                int i12 = 2 % 2;
                int i13 = i11;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                boolean z2 = true;
                if (i13 != 0) {
                    getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if ((iIntValue & 3) != 2) {
                        int i14 = RatingCompat + 85;
                        MediaMetadataCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                    if (getpostalcode.write(iIntValue & 1, z)) {
                        final markFragmentsCreated markfragmentscreated2 = markfragmentscreated;
                        final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = coil3.ExtrasKt.write(markfragmentscreated2.PlaybackStateCompat, getpostalcode, 0);
                        boolean zBooleanValue = ((Boolean) coil3.ExtrasKt.write(markfragmentscreated2.ParcelableVolumeInfo, getpostalcode, 0).getValue()).booleanValue();
                        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                        TapGestureDetectorKt tapGestureDetectorKtWrite = onKeyEventZmokQxo.write(null, 3);
                        final setDrawDisappearingViewsLast setdrawdisappearingviewslast2 = setdrawdisappearingviewslast;
                        final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$4 = homeFragment$initPopupLayer$3;
                        final HomeFragment.AnonymousClass1 anonymousClass6 = anonymousClass5;
                        final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$5 = roomDatabase$closeBarrier$4;
                        final int i16 = 0;
                        androidx.compose.animation.AnimatedVisibilityKt.RemoteActionCompatParcelizer(!zBooleanValue, null, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKtWrite, null, coil3.ExtrasKt.write(-81752360, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.roadrunner.home.floatinglayer.InitFloatingLayerImpl$$ExternalSyntheticLambda2
                            private static int MediaBrowserCompatMediaItem = 0;
                            private static int MediaDescriptionCompat = 1;

                            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i110 = 2 % 2;
                                int i111 = MediaDescriptionCompat + 101;
                                MediaBrowserCompatMediaItem = i111 % Fields.SpotShadowColor;
                                int i112 = i111 % 2;
                                int i113 = i16;
                                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Write;
                                setDrawDisappearingViewsLast setdrawdisappearingviewslast4 = setdrawdisappearingviewslast2;
                                if (i113 == 0) {
                                    ((Integer) obj5).getClass();
                                    ((AnimatedVisibilityScope) obj3).getClass();
                                    supportStartPostponedEnterTransition supportstartpostponedentertransition = ((findFragmentById) onviewattachedtowindow.getValue()).IconCompatParcelizer;
                                    Object objWrite = setdrawdisappearingviewslast4.write.write();
                                    objWrite.getClass();
                                    supportFinishAfterTransition supportfinishaftertransition = (supportFinishAfterTransition) objWrite;
                                    getPostalCode getpostalcode3 = (getPostalCode) ((getBirthDateFull) obj4);
                                    markFragmentsCreated markfragmentscreated4 = markfragmentscreated2;
                                    boolean z3 = getpostalcode3.read(markfragmentscreated4);
                                    Object objComponentActivity3 = getpostalcode3.ComponentActivity();
                                    if (z3 || objComponentActivity3 == androidContentCaptureManager2) {
                                        objComponentActivity3 = new HomeFragment.AnonymousClass1(1, markfragmentscreated4, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 21);
                                        getpostalcode3.write(objComponentActivity3);
                                    }
                                    FloatingContentKt.FloatingContent(supportstartpostponedentertransition, supportfinishaftertransition, homeFragment$initPopupLayer$4, anonymousClass6, roomDatabase$closeBarrier$5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3), null, null, getpostalcode3, 0, 192);
                                    int i21 = MediaDescriptionCompat + 13;
                                    MediaBrowserCompatMediaItem = i21 % Fields.SpotShadowColor;
                                    int i22 = i21 % 2;
                                    return createfromparcel2;
                                }
                                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj4;
                                ((Integer) obj5).getClass();
                                ((AnimatedVisibilityScope) obj3).getClass();
                                Modifier.Companion companion = Modifier.Companion;
                                supportStartPostponedEnterTransition supportstartpostponedentertransition2 = ((findFragmentById) onviewattachedtowindow.getValue()).RemoteActionCompatParcelizer;
                                WeakHashMap weakHashMap = TooltipKt.serializer;
                                animateElevation animateelevation = setRoundRectOutlineTNW_H78default.read(getbirthdatefull3).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                                Object objWrite2 = setdrawdisappearingviewslast4.write.write();
                                objWrite2.getClass();
                                supportFinishAfterTransition supportfinishaftertransition2 = (supportFinishAfterTransition) objWrite2;
                                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                                markFragmentsCreated markfragmentscreated5 = markfragmentscreated2;
                                boolean z4 = getpostalcode4.read(markfragmentscreated5);
                                Object objComponentActivity4 = getpostalcode4.ComponentActivity();
                                if (!(!z4) || objComponentActivity4 == androidContentCaptureManager2) {
                                    objComponentActivity4 = new HomeFragment.AnonymousClass1(1, markfragmentscreated5, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 20);
                                    getpostalcode4.write(objComponentActivity4);
                                }
                                FloatingContentKt.FloatingContent(supportstartpostponedentertransition2, supportfinishaftertransition2, homeFragment$initPopupLayer$4, anonymousClass6, roomDatabase$closeBarrier$5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, animateelevation, getpostalcode4, 1572864, 0);
                                return createfromparcel2;
                            }
                        }, getpostalcode), getpostalcode, 200064, 18);
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createfromparcel;
                }
                getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    final markFragmentsCreated markfragmentscreated3 = markfragmentscreated;
                    final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = coil3.ExtrasKt.write(markfragmentscreated3.PlaybackStateCompat, getpostalcode2, 0);
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write3 = coil3.ExtrasKt.write(markfragmentscreated3.ParcelableVolumeInfo, getpostalcode2, 0);
                    Object objComponentActivity = getpostalcode2.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                        getpostalcode2.write(objComponentActivity);
                    }
                    PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
                    Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new MapLayersUiModel$1(populateViewStructure_androidKtpopulate7, null, 12);
                        getpostalcode2.write(objComponentActivity2);
                        int i17 = MediaMetadataCompat + 59;
                        RatingCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                    }
                    getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2);
                    if (((Boolean) populateViewStructure_androidKtpopulate7Write3.getValue()).booleanValue() || !((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                        z2 = false;
                    } else {
                        int i19 = RatingCompat + 107;
                        MediaMetadataCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                    }
                    ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer2 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                    TapGestureDetectorKt tapGestureDetectorKtWrite2 = onKeyEventZmokQxo.write(null, 3);
                    final setDrawDisappearingViewsLast setdrawdisappearingviewslast3 = setdrawdisappearingviewslast;
                    final HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$5 = homeFragment$initPopupLayer$3;
                    final HomeFragment.AnonymousClass1 anonymousClass7 = anonymousClass5;
                    final RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$6 = roomDatabase$closeBarrier$4;
                    final int i20 = 1;
                    androidx.compose.animation.AnimatedVisibilityKt.RemoteActionCompatParcelizer(z2, null, scrollingLogicdoFlingAnimation2reverseScope1Serializer2, tapGestureDetectorKtWrite2, null, coil3.ExtrasKt.write(1794541615, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: com.roadrunner.home.floatinglayer.InitFloatingLayerImpl$$ExternalSyntheticLambda2
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaDescriptionCompat = 1;

                        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i111 = 2 % 2;
                            int i112 = MediaDescriptionCompat + 101;
                            MediaBrowserCompatMediaItem = i112 % Fields.SpotShadowColor;
                            int i113 = i112 % 2;
                            int i114 = i20;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                            onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Write2;
                            setDrawDisappearingViewsLast setdrawdisappearingviewslast4 = setdrawdisappearingviewslast3;
                            if (i114 == 0) {
                                ((Integer) obj5).getClass();
                                ((AnimatedVisibilityScope) obj3).getClass();
                                supportStartPostponedEnterTransition supportstartpostponedentertransition = ((findFragmentById) onviewattachedtowindow.getValue()).IconCompatParcelizer;
                                Object objWrite = setdrawdisappearingviewslast4.write.write();
                                objWrite.getClass();
                                supportFinishAfterTransition supportfinishaftertransition = (supportFinishAfterTransition) objWrite;
                                getPostalCode getpostalcode3 = (getPostalCode) ((getBirthDateFull) obj4);
                                markFragmentsCreated markfragmentscreated4 = markfragmentscreated3;
                                boolean z3 = getpostalcode3.read(markfragmentscreated4);
                                Object objComponentActivity3 = getpostalcode3.ComponentActivity();
                                if (z3 || objComponentActivity3 == androidContentCaptureManager2) {
                                    objComponentActivity3 = new HomeFragment.AnonymousClass1(1, markfragmentscreated4, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 21);
                                    getpostalcode3.write(objComponentActivity3);
                                }
                                FloatingContentKt.FloatingContent(supportstartpostponedentertransition, supportfinishaftertransition, homeFragment$initPopupLayer$5, anonymousClass7, roomDatabase$closeBarrier$6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3), null, null, getpostalcode3, 0, 192);
                                int i21 = MediaDescriptionCompat + 13;
                                MediaBrowserCompatMediaItem = i21 % Fields.SpotShadowColor;
                                int i22 = i21 % 2;
                                return createfromparcel2;
                            }
                            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj4;
                            ((Integer) obj5).getClass();
                            ((AnimatedVisibilityScope) obj3).getClass();
                            Modifier.Companion companion = Modifier.Companion;
                            supportStartPostponedEnterTransition supportstartpostponedentertransition2 = ((findFragmentById) onviewattachedtowindow.getValue()).RemoteActionCompatParcelizer;
                            WeakHashMap weakHashMap = TooltipKt.serializer;
                            animateElevation animateelevation = setRoundRectOutlineTNW_H78default.read(getbirthdatefull3).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                            Object objWrite2 = setdrawdisappearingviewslast4.write.write();
                            objWrite2.getClass();
                            supportFinishAfterTransition supportfinishaftertransition2 = (supportFinishAfterTransition) objWrite2;
                            getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
                            markFragmentsCreated markfragmentscreated5 = markfragmentscreated3;
                            boolean z4 = getpostalcode4.read(markfragmentscreated5);
                            Object objComponentActivity4 = getpostalcode4.ComponentActivity();
                            if (!(!z4) || objComponentActivity4 == androidContentCaptureManager2) {
                                objComponentActivity4 = new HomeFragment.AnonymousClass1(1, markfragmentscreated5, markFragmentsCreated.class, "onViewRendered", "onViewRendered(I)V", 0, 20);
                                getpostalcode4.write(objComponentActivity4);
                            }
                            FloatingContentKt.FloatingContent(supportstartpostponedentertransition2, supportfinishaftertransition2, homeFragment$initPopupLayer$5, anonymousClass7, roomDatabase$closeBarrier$6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, animateelevation, getpostalcode4, 1572864, 0);
                            return createfromparcel2;
                        }
                    }, getpostalcode2), getpostalcode2, 200064, 18);
                } else {
                    getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    int i21 = RatingCompat + 39;
                    MediaMetadataCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i22 = i21 % 2;
                }
                return createfromparcel;
            }
        }, true, -1671224656)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        getChildViewHolderInt getchildviewholderint = this.MediaDescriptionCompat;
        if (getchildviewholderint == null) {
            removeNodeAtDepth.serializer("initHomePopupLayer");
            throw null;
        }
        requireHost requirehost7 = this.RemoteActionCompatParcelizer;
        requirehost7.getClass();
        ComposeView composeView7 = requirehost7.MediaBrowserCompatMediaItem;
        getDecoratedBoundsWithMarginsInt getdecoratedboundswithmarginsint = (getDecoratedBoundsWithMarginsInt) RemoteActionCompatParcelizer().MediaSessionCompatResultReceiverWrapper.MediaSessionCompatResultReceiverWrapper();
        HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$4 = new HomeFragment$initPopupLayer$1(3, this, HomeFragment.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Lcom/ui/common/util/SnackbarType;I)V", 0, 0);
        int i12 = 0;
        AnonymousClass1 anonymousClass6 = new AnonymousClass1(1, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "showLoading", "showLoading(Ljava/lang/String;)V", i12, 16);
        RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$5 = new RoomDatabase$closeBarrier$1(0, RemoteActionCompatParcelizer().MediaMetadataCompat, WrongFragmentContainerViolation.class, "hideLoading", "hideLoading()V", i12, 11);
        getdecoratedboundswithmarginsint.getClass();
        composeView7.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView7, false, new DragAndDropTargetModifierNode(new updateSubhierarchy(getdecoratedboundswithmarginsint, getchildviewholderint, homeFragment$initPopupLayer$4, anonymousClass6, roomDatabase$closeBarrier$5, 2), true, -1296701887)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new HomeFragment$initBottomSheetContent$1(this, shortNewsContentCardView2, 3), 3);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(getLifecycle()), null, null, new HomeFragment$initBottomSheetContent$1(this, shortNewsContentCardView2, 7), 3);
        requireActivity().getSupportFragmentManager().read("START_WORKING_REQUEST_KEY", this, new PerseusInitializerImpl$$ExternalSyntheticLambda0(19, this));
        if (this.MediaMetadataCompat == null) {
            removeNodeAtDepth.serializer("initFullScreenLoadingLayer");
            throw null;
        }
        requireHost requirehost8 = this.RemoteActionCompatParcelizer;
        requirehost8.getClass();
        ComposeView composeView8 = requirehost8.MediaDescriptionCompat;
        WrongFragmentContainerViolation wrongFragmentContainerViolation = RemoteActionCompatParcelizer().MediaMetadataCompat;
        wrongFragmentContainerViolation.getClass();
        composeView8.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView8, false, new DragAndDropTargetModifierNode(new Updater$$ExternalSyntheticLambda1(10, wrongFragmentContainerViolation), true, -563857234)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        FragmentSavedState fragmentSavedState = this.read;
        if (fragmentSavedState == null) {
            removeNodeAtDepth.serializer("initExpandedBubbleLayer");
            throw null;
        }
        requireHost requirehost9 = this.RemoteActionCompatParcelizer;
        requirehost9.getClass();
        ComposeView composeView9 = requirehost9.IconCompatParcelizer;
        startPostponedEnterTransition startpostponedentertransition = (startPostponedEnterTransition) RemoteActionCompatParcelizer().read.MediaSessionCompatResultReceiverWrapper();
        startpostponedentertransition.getClass();
        composeView9.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
        UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView9, false, new DragAndDropTargetModifierNode(new MinimumInteractiveModifierNode(startpostponedentertransition, 3, fragmentSavedState), true, -681164996)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        copyO0kMr_c copyo0kmr_c = this.MediaSessionCompatResultReceiverWrapper;
        if (copyo0kmr_c == null) {
            removeNodeAtDepth.serializer("shouldEnableBackToBackOrders");
            throw null;
        }
        int i13 = onBackPressed + 59;
        onActivityResult = i13 % Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            int i14 = 33 / 0;
            if (copyo0kmr_c.RemoteActionCompatParcelizer()) {
                setlinebreakconfig = this.MediaSessionCompatQueueItem;
                if (setlinebreakconfig != null) {
                    removeNodeAtDepth.serializer("initGlowBoxBannerLayer");
                    throw null;
                }
                requireHost requirehost10 = this.RemoteActionCompatParcelizer;
                requirehost10.getClass();
                ComposeView composeView10 = requirehost10.RemoteActionCompatParcelizer;
                getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations = (getStripNonMetricAffectingCharSpansannotations) RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
                HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$5 = new HomeFragment$initPopupLayer$1(3, this, HomeFragment.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Lcom/ui/common/util/SnackbarType;I)V", 0, 3);
                getstripnonmetricaffectingcharspansannotations.getClass();
                DragAndDropTargetModifierNode dragAndDropTargetModifierNodeSerializer = setlinebreakconfig.write.serializer(setlinebreakconfig.RemoteActionCompatParcelizer);
                composeView10.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
                UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView10, false, new DragAndDropTargetModifierNode(new GetFloatingComposable$$ExternalSyntheticLambda25(getstripnonmetricaffectingcharspansannotations, homeFragment$initPopupLayer$5, dragAndDropTargetModifierNodeSerializer, i7), true, -990918505)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
            }
        } else if (copyo0kmr_c.RemoteActionCompatParcelizer()) {
            setlinebreakconfig = this.MediaSessionCompatQueueItem;
            if (setlinebreakconfig != null) {
                removeNodeAtDepth.serializer("initGlowBoxBannerLayer");
                throw null;
            }
            requireHost requirehost11 = this.RemoteActionCompatParcelizer;
            requirehost11.getClass();
            ComposeView composeView11 = requirehost11.RemoteActionCompatParcelizer;
            getStripNonMetricAffectingCharSpansannotations getstripnonmetricaffectingcharspansannotations2 = (getStripNonMetricAffectingCharSpansannotations) RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
            HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$6 = new HomeFragment$initPopupLayer$1(3, this, HomeFragment.class, "showSnackbar", "showSnackbar(Ljava/lang/String;Lcom/ui/common/util/SnackbarType;I)V", 0, 3);
            getstripnonmetricaffectingcharspansannotations2.getClass();
            DragAndDropTargetModifierNode dragAndDropTargetModifierNodeSerializer2 = setlinebreakconfig.write.serializer(setlinebreakconfig.RemoteActionCompatParcelizer);
            composeView11.setViewCompositionStrategy(disposeOnViewTreeLifecycleDestroyed);
            UtilsKt.RemoteActionCompatParcelizer(-916013161, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{composeView11, false, new DragAndDropTargetModifierNode(new GetFloatingComposable$$ExternalSyntheticLambda25(getstripnonmetricaffectingcharspansannotations2, homeFragment$initPopupLayer$6, dragAndDropTargetModifierNodeSerializer2, i7), true, -990918505)}, 916013162, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        }
        ShortNewsContentCardView shortNewsContentCardView3 = null;
        accessisRenderNodeCompatiblecp viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.read(viewLifecycleOwner2.getLifecycle()), null, null, new HomeFragment$initBottomSheetContent$1(this, shortNewsContentCardView3, 5), 3);
        SharedResourcePool sharedResourcePool = RemoteActionCompatParcelizer().r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        accessisRenderNodeCompatiblecp viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        sharedResourcePool.RemoteActionCompatParcelizer(viewLifecycleOwner3, new AnonymousClass1(1, this, HomeFragment.class, "handleActions", "handleActions(Lcom/roadrunner/home/HomeAction;)V", 0, 0));
    }
}
