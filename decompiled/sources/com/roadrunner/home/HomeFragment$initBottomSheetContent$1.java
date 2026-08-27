package com.roadrunner.home;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.settings.SettingsCacheImpl;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onDestroyOptionsMenu;
import o.onOptionsMenuClosed;
import o.onPrimaryNavigationFragmentChanged;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeFragment$initBottomSheetContent$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ HomeFragment RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeFragment$initBottomSheetContent$1(HomeFragment homeFragment, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 31;
        read = i3 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = this.serializer;
        HomeFragment homeFragment = this.RemoteActionCompatParcelizer;
        switch (i4) {
            case 0:
                HomeFragment$initBottomSheetContent$1 homeFragment$initBottomSheetContent$1 = new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 0);
                int i5 = IconCompatParcelizer + 87;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return homeFragment$initBottomSheetContent$1;
                }
                throw null;
            case 1:
                return new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 1);
            case 2:
                return new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, i);
            case 3:
                HomeFragment$initBottomSheetContent$1 homeFragment$initBottomSheetContent$2 = new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 3);
                int i6 = IconCompatParcelizer + 109;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return homeFragment$initBottomSheetContent$2;
            case 4:
                return new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 4);
            case 5:
                return new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 5);
            case 6:
                HomeFragment$initBottomSheetContent$1 homeFragment$initBottomSheetContent$3 = new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 6);
                int i8 = IconCompatParcelizer + 89;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return homeFragment$initBottomSheetContent$3;
            default:
                return new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a A[PHI: r2 r5 r6
  0x002a: PHI (r2v9 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r5v30 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x002a: PHI (r6v17 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035 A[PHI: r2 r5 r6
  0x0035: PHI (r2v8 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r5v26 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r6v16 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0040 A[PHI: r2 r5 r6
  0x0040: PHI (r2v7 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r5v22 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r6v15 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b A[PHI: r2 r5 r6
  0x004b: PHI (r2v6 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r5v18 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x004b: PHI (r6v14 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[PHI: r2 r5 r6
  0x0056: PHI (r2v5 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r5v14 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r6v10 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x006a A[PHI: r2 r5 r6
  0x006a: PHI (r2v4 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r5v10 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r6v4 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084 A[PHI: r2 r5 r6
  0x0084: PHI (r2v3 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r5v6 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r6v3 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x008f A[PHI: r2 r5 r6
  0x008f: PHI (r2v2 o.createFromParcel) = (r2v1 o.createFromParcel), (r2v10 o.createFromParcel) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r5v2 o.getContentViewGroupParentLayout) = (r5v1 o.getContentViewGroupParentLayout), (r5v34 o.getContentViewGroupParentLayout) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r6v2 o.ShortNewsContentCardView) = (r6v1 o.ShortNewsContentCardView), (r6v18 o.ShortNewsContentCardView) binds: [B:8:0x0026, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        createFromParcel createfromparcel;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        ShortNewsContentCardView shortNewsContentCardView;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 93;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = this.serializer;
            createfromparcel = createFromParcel.INSTANCE;
            getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            switch (i4) {
                case 0:
                    return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 1:
                    Object objInvokeSuspend = ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    i = IconCompatParcelizer + 105;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        int i5 = 18 / 0;
                    }
                    return objInvokeSuspend;
                case 2:
                    Object objInvokeSuspend2 = ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                    int i6 = IconCompatParcelizer + 69;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return objInvokeSuspend2;
                case 3:
                    return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 4:
                    return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 5:
                    return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                case 6:
                    return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                default:
                    return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
        }
        int i8 = this.serializer;
        createfromparcel = createFromParcel.INSTANCE;
        getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        int i9 = 11 / 0;
        switch (i8) {
            case 0:
                return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 1:
                Object objInvokeSuspend3 = ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                i = IconCompatParcelizer + 105;
                read = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i10 = 18 / 0;
                }
                return objInvokeSuspend3;
            case 2:
                Object objInvokeSuspend4 = ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i11 = IconCompatParcelizer + 69;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                return objInvokeSuspend4;
            case 3:
                return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 4:
                return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 5:
                return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            case 6:
                return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            default:
                return ((HomeFragment$initBottomSheetContent$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        final HomeFragment homeFragment = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        final int i4 = 1;
        switch (i3) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.write;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.STARTED;
                HomeFragment$initBottomSheetContent$1 homeFragment$initBottomSheetContent$1 = new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, i4);
                this.write = 1;
                return UrlUtils.repeatOnLifecycle(homeFragment, tocolorlong8_81lla, homeFragment$initBottomSheetContent$1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.write;
                final int i7 = 0;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    StateFlow stateFlow = ((HomeBottomSheetUiModelImpl) homeFragment.RemoteActionCompatParcelizer().MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.roadrunner.home.HomeFragment$initBottomSheetContent$1$1$1
                        private static int IconCompatParcelizer = 0;
                        private static int write = 1;

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView2) {
                            int i8 = 2 % 2;
                            int i9 = i7;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            HomeFragment homeFragment2 = homeFragment;
                            if (i9 == 0) {
                                onOptionsMenuClosed onoptionsmenuclosed = (onOptionsMenuClosed) obj2;
                                onDestroyOptionsMenu ondestroyoptionsmenuSerializer = homeFragment2.serializer();
                                ondestroyoptionsmenuSerializer.getClass();
                                onoptionsmenuclosed.getClass();
                                ondestroyoptionsmenuSerializer.MediaSessionCompatQueueItem.post(new ND$$ExternalSyntheticLambda0(ondestroyoptionsmenuSerializer, 26, onoptionsmenuclosed));
                                return createfromparcel2;
                            }
                            onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = (onPrimaryNavigationFragmentChanged) obj2;
                            homeFragment2.serializer().read(onprimarynavigationfragmentchanged);
                            Object objOnAutoBottomSheetStateChanged = homeFragment2.RemoteActionCompatParcelizer().onAutoBottomSheetStateChanged(onprimarynavigationfragmentchanged, shortNewsContentCardView2);
                            if (objOnAutoBottomSheetStateChanged != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                return createfromparcel2;
                            }
                            int i10 = write;
                            int i11 = i10 + 105;
                            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                            if (i11 % 2 != 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            int i12 = i10 + 79;
                            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            return objOnAutoBottomSheetStateChanged;
                        }
                    };
                    this.write = 1;
                    if (stateFlow.collect(flowCollector, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        int i8 = IconCompatParcelizer + 125;
                        read = i8 % Fields.SpotShadowColor;
                        if (i8 % 2 != 0) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        int i9 = 70 / 0;
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                DrawableTransformation.read();
                return null;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.write;
                if (i10 != 0) {
                    int i11 = read + 31;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (i10 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedFlowImpl sharedFlowImpl = ((HomeBottomSheetUiModelImpl) homeFragment.RemoteActionCompatParcelizer().MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).MediaDescriptionCompat;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.roadrunner.home.HomeFragment$initBottomSheetContent$1$1$1
                        private static int IconCompatParcelizer = 0;
                        private static int write = 1;

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView2) {
                            int i13 = 2 % 2;
                            int i14 = i4;
                            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                            HomeFragment homeFragment2 = homeFragment;
                            if (i14 == 0) {
                                onOptionsMenuClosed onoptionsmenuclosed = (onOptionsMenuClosed) obj2;
                                onDestroyOptionsMenu ondestroyoptionsmenuSerializer = homeFragment2.serializer();
                                ondestroyoptionsmenuSerializer.getClass();
                                onoptionsmenuclosed.getClass();
                                ondestroyoptionsmenuSerializer.MediaSessionCompatQueueItem.post(new ND$$ExternalSyntheticLambda0(ondestroyoptionsmenuSerializer, 26, onoptionsmenuclosed));
                                return createfromparcel2;
                            }
                            onPrimaryNavigationFragmentChanged onprimarynavigationfragmentchanged = (onPrimaryNavigationFragmentChanged) obj2;
                            homeFragment2.serializer().read(onprimarynavigationfragmentchanged);
                            Object objOnAutoBottomSheetStateChanged = homeFragment2.RemoteActionCompatParcelizer().onAutoBottomSheetStateChanged(onprimarynavigationfragmentchanged, shortNewsContentCardView2);
                            if (objOnAutoBottomSheetStateChanged != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                return createfromparcel2;
                            }
                            int i15 = write;
                            int i16 = i15 + 105;
                            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                            if (i16 % 2 != 0) {
                                Object obj3 = null;
                                obj3.hashCode();
                                throw null;
                            }
                            int i17 = i15 + 79;
                            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            return objOnAutoBottomSheetStateChanged;
                        }
                    };
                    this.write = 1;
                    sharedFlowImpl.getClass();
                    if (SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, flowCollector2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                }
                DrawableTransformation.read();
                return null;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.write;
                if (i13 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    toColorLong8_81llA tocolorlong8_81lla2 = toColorLong8_81llA.STARTED;
                    HomeFragment$initBottomSheetContent$1 homeFragment$initBottomSheetContent$2 = new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, i);
                    this.write = 1;
                    return UrlUtils.repeatOnLifecycle(homeFragment, tocolorlong8_81lla2, homeFragment$initBottomSheetContent$2, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
                }
                int i14 = read;
                int i15 = i14 + 87;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                if (i15 % 2 == 0 ? i13 != 1 : i13 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i16 = i14 + 33;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.write;
                if (i18 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedFlowImpl sharedFlowImpl2 = ((HomeBottomSheetUiModelImpl) homeFragment.RemoteActionCompatParcelizer().MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()).r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    MapLayersUiModel$1 mapLayersUiModel$1 = new MapLayersUiModel$1(homeFragment, null, 9);
                    this.write = 1;
                    return FlowKt.collectLatest(sharedFlowImpl2, mapLayersUiModel$1, this) == coroutineSingletons5 ? coroutineSingletons5 : createfromparcel;
                }
                int i19 = IconCompatParcelizer + 15;
                read = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0 ? i18 != 1 : i18 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.write;
                if (i20 != 0) {
                    if (i20 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                toColorLong8_81llA tocolorlong8_81lla3 = toColorLong8_81llA.STARTED;
                HomeFragment$initBottomSheetContent$1 homeFragment$initBottomSheetContent$3 = new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 4);
                this.write = 1;
                if (UrlUtils.repeatOnLifecycle(homeFragment, tocolorlong8_81lla3, homeFragment$initBottomSheetContent$3, this) != coroutineSingletons6) {
                    return createfromparcel;
                }
                int i21 = read + 31;
                IconCompatParcelizer = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                return coroutineSingletons6;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.write;
                if (i23 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SharedFlowImpl sharedFlowImpl3 = homeFragment.RemoteActionCompatParcelizer().r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.IconCompatParcelizer;
                    SettingsCacheImpl.AnonymousClass1.C00171 c00171 = new SettingsCacheImpl.AnonymousClass1.C00171(2, homeFragment);
                    this.write = 1;
                    sharedFlowImpl3.getClass();
                    return SharedFlowImpl.collect$suspendImpl(sharedFlowImpl3, c00171, this) == coroutineSingletons7 ? coroutineSingletons7 : createfromparcel;
                }
                if (i23 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i24 = read + 55;
                IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                if (i24 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            default:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.write;
                if (i25 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    toColorLong8_81llA tocolorlong8_81lla4 = toColorLong8_81llA.STARTED;
                    HomeFragment$initBottomSheetContent$1 homeFragment$initBottomSheetContent$4 = new HomeFragment$initBottomSheetContent$1(homeFragment, shortNewsContentCardView, 6);
                    this.write = 1;
                    return UrlUtils.repeatOnLifecycle(homeFragment, tocolorlong8_81lla4, homeFragment$initBottomSheetContent$4, this) == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel;
                }
                int i26 = read + 31;
                int i27 = i26 % Fields.SpotShadowColor;
                IconCompatParcelizer = i27;
                int i28 = i26 % 2;
                if (i25 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i29 = i27 + 25;
                read = i29 % Fields.SpotShadowColor;
                if (i29 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                shortNewsContentCardView.hashCode();
                throw null;
        }
    }
}
