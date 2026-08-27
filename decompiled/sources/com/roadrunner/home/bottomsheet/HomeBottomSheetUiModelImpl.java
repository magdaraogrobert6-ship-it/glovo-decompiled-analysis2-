package com.roadrunner.home.bottomsheet;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.home.bottomsheet.config.GetBottomSheetConfigurationType;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.container.maplayer.MapLayersUiModel$1;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1;
import io.grpc.internal.CallTracer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.DrawableTransformation;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.consumeFlingInStretch;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getNoneeUduSuo;
import o.isItemViewSwipeEnabled;
import o.isStateSaved;
import o.onContentCardDismissed;
import o.onContextItemSelected;
import o.onCreateAnimation;
import o.onCreateAnimator;
import o.onOptionsMenuClosed;
import o.onPrimaryNavigationFragmentChanged;
import o.onViewCreated;
import o.performActivityCreated;
import o.performContextItemSelected;
import o.performPause;
import o.performPrepareOptionsMenu;
import o.performStart;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44;
import o.removeNodeAtDepth;
import o.requestPermissions;
import o.requireActivity;
import o.setUseTempTrackingTableroom_runtime;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeBottomSheetUiModelImpl {
    private static int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = 0;
    private static int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = 1;
    public boolean ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaBrowserCompatMediaItem;
    public final SharedFlowImpl MediaDescriptionCompat;
    public final SharedFlowImpl MediaMetadataCompat;
    public final isStateSaved MediaSessionCompatQueueItem;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU MediaSessionCompatResultReceiverWrapper;
    public final onContextItemSelected MediaSessionCompatToken;
    public performContextItemSelected ParcelableVolumeInfo;
    public final RouterLogger PlaybackStateCompat;
    public final getContentViewGroupParentLayout PlaybackStateCompatCustomAction;
    public final MutableStateFlow RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final performPause ResultReceiver;
    public final getNoneeUduSuo r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final StateFlow r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final StateFlow r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final SharedFlowImpl r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final consumeFlingInStretch r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final performStart r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final StateFlow r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final MutableStateFlow read;
    public final MutableStateFlow serializer;
    public final SharedFlowImpl write;

    /* JADX INFO: renamed from: com.roadrunner.home.bottomsheet.HomeBottomSheetUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int read = 1;
        private static int write;
        public final /* synthetic */ HomeBottomSheetUiModelImpl IconCompatParcelizer;
        public final /* synthetic */ int RemoteActionCompatParcelizer;
        public int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = homeBottomSheetUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = read + 37;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.RemoteActionCompatParcelizer;
            HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = this.IconCompatParcelizer;
            if (i5 == 0) {
                return new AnonymousClass1(homeBottomSheetUiModelImpl, shortNewsContentCardView, 0);
            }
            int i6 = 1;
            if (i5 != 1) {
                return new AnonymousClass1(homeBottomSheetUiModelImpl, shortNewsContentCardView, i);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(homeBottomSheetUiModelImpl, shortNewsContentCardView, i6);
            int i7 = write + 71;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i2 == 0) {
                Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
                int i3 = write + 87;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            }
            if (i2 == 1) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend2 = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = read + 29;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, o.ShortNewsContentCardView] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v4 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.RemoteActionCompatParcelizer;
            Object obj2 = createFromParcel.INSTANCE;
            HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl = this.IconCompatParcelizer;
            int i4 = 0;
            ?? r6 = 0;
            r6 = 0;
            int i5 = 1;
            if (i3 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.serializer;
                if (i6 != 0) {
                    int i7 = write + 29;
                    read = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0 ? i6 == 1 : i6 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        DrawableTransformation.read();
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    MutableStateFlow mutableStateFlow = homeBottomSheetUiModelImpl.RatingCompat;
                    onCreateAnimator oncreateanimator = new onCreateAnimator(homeBottomSheetUiModelImpl, i4);
                    this.serializer = 1;
                    if (mutableStateFlow.collect(oncreateanimator, this) == coroutineSingletons) {
                        int i8 = read + 31;
                        write = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        r6 = coroutineSingletons;
                    } else {
                        DrawableTransformation.read();
                    }
                }
                int i10 = read + 95;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return r6;
            }
            if (i3 != 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.serializer;
                if (i12 != 0) {
                    int i13 = read + 125;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    if (i12 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                RouterLogger routerLogger = homeBottomSheetUiModelImpl.PlaybackStateCompat;
                Flow flowWrite = FlowKt.write(FlowKt.IconCompatParcelizer(new HeatmapDataStore$get$$inlined$map$1(((requireActivity) ((requestPermissions) routerLogger.read)).RemoteActionCompatParcelizer, routerLogger, 27), ((performActivityCreated) routerLogger.serializer).read), 500L);
                onCreateAnimator oncreateanimator2 = new onCreateAnimator(homeBottomSheetUiModelImpl, i);
                this.serializer = 1;
                if (flowWrite.collect(oncreateanimator2, this) != coroutineSingletons2) {
                    return obj2;
                }
                int i15 = read;
                int i16 = i15 + 35;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                int i18 = i15 + 97;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                return coroutineSingletons2;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i20 = this.serializer;
            int i21 = 11;
            if (i20 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performPause performpause = homeBottomSheetUiModelImpl.ResultReceiver;
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = homeBottomSheetUiModelImpl.PlaybackStateCompatCustomAction;
                getcontentviewgroupparentlayout.getClass();
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SingleProcessDataStore$data$1.AnonymousClass1(performpause, r6, 17), new SideMenuCacheImpl$get$$inlined$map$1(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new MapLayersUiModel$1(performpause, r6, i21), FlowKt.serializer(performpause.serializer.read())), getcontentviewgroupparentlayout, performpause, 3));
                onCreateAnimator oncreateanimator3 = new onCreateAnimator(homeBottomSheetUiModelImpl, i5);
                this.serializer = 1;
                if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(oncreateanimator3, this) == coroutineSingletons3) {
                    obj2 = coroutineSingletons3;
                }
            } else if (i20 == 1) {
                int i22 = read + 85;
                write = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r6.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i23 = read + 11;
            write = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            return obj2;
        }
    }

    public HomeBottomSheetUiModelImpl(performPrepareOptionsMenu performprepareoptionsmenu, performPause performpause, onContextItemSelected oncontextitemselected, RouterLogger routerLogger, onCreateAnimation oncreateanimation, consumeFlingInStretch consumeflinginstretch, isStateSaved isstatesaved, getNoneeUduSuo getnoneeudusuo, ContextScope contextScope) {
        contextScope.getClass();
        this.ResultReceiver = performpause;
        this.MediaSessionCompatToken = oncontextitemselected;
        this.PlaybackStateCompat = routerLogger;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = consumeflinginstretch;
        this.MediaSessionCompatQueueItem = isstatesaved;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getnoneeudusuo;
        this.PlaybackStateCompatCustomAction = contextScope;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(onOptionsMenuClosed.HIDDEN);
        this.serializer = mutableStateFlow;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mutableStateFlow2;
        SmallPersistentVector smallPersistentVector = SmallPersistentVector.RemoteActionCompatParcelizer;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(smallPersistentVector);
        this.IconCompatParcelizer = mutableStateFlow3;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mutableStateFlow3;
        CallTracer callTracer = performprepareoptionsmenu.read;
        Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.RemoteActionCompatParcelizer).write();
        objWrite.getClass();
        isStateSaved isstatesaved2 = (isStateSaved) objWrite;
        GetBottomSheetConfigurationType getBottomSheetConfigurationType = (GetBottomSheetConfigurationType) ((setUseTempTrackingTableroom_runtime) callTracer.write).write();
        Object objWrite2 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.serializer).write();
        objWrite2.getClass();
        Object objWrite3 = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) callTracer.IconCompatParcelizer).write();
        objWrite3.getClass();
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new performStart(isstatesaved2, getBottomSheetConfigurationType, (getNoneeUduSuo) objWrite2, (requestPermissions) objWrite3, contextScope);
        MutableStateFlow mutableStateFlow4 = StateFlowKt.read(smallPersistentVector);
        this.read = mutableStateFlow4;
        this.MediaBrowserCompatMediaItem = mutableStateFlow4;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, IInAppMessageViewWrapper.DROP_OLDEST, 1);
        this.write = sharedFlowImplRemoteActionCompatParcelizer;
        this.MediaDescriptionCompat = sharedFlowImplRemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer2 = SharedFlowKt.RemoteActionCompatParcelizer(0, 1, null, 5);
        this.MediaMetadataCompat = sharedFlowImplRemoteActionCompatParcelizer2;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = sharedFlowImplRemoteActionCompatParcelizer2;
        this.RatingCompat = StateFlowKt.read(onPrimaryNavigationFragmentChanged.HALF_EXPANDED);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
    }

    public static final void read(HomeBottomSheetUiModelImpl homeBottomSheetUiModelImpl) {
        boolean z;
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer;
        Object obj;
        Object obj2;
        onOptionsMenuClosed onoptionsmenuclosed;
        Object obj3;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 75;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        performContextItemSelected performcontextitemselected = homeBottomSheetUiModelImpl.ParcelableVolumeInfo;
        if (performcontextitemselected != null) {
            onContextItemSelected oncontextitemselected = homeBottomSheetUiModelImpl.MediaSessionCompatToken;
            boolean z2 = oncontextitemselected.IconCompatParcelizer;
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = performcontextitemselected.serializer;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                if (((Boolean) ((onViewCreated) obj4).IconCompatParcelizer().read()).booleanValue()) {
                    arrayList.add(obj4);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int i5 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 27;
                        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        if (((onViewCreated) it.next()).RatingCompat()) {
                            int i7 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 15;
                            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i7 % Fields.SpotShadowColor;
                            if (i7 % 2 == 0) {
                                z = true;
                                break;
                            }
                            break;
                        }
                    }
                    z = false;
                    break;
                }
            }
            z = false;
            break;
            ArrayList arrayList2 = new ArrayList();
            r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = new r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(arrayList.iterator());
            while (((Iterator) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.IconCompatParcelizer).hasNext()) {
                Object next = r8lambdaorcgh_zecjpqysbjv51vn1ttu44.next();
                if (((onViewCreated) ((isItemViewSwipeEnabled) next).read).x_()) {
                    arrayList2.add(next);
                }
            }
            isItemViewSwipeEnabled isitemviewswipeenabled = (isItemViewSwipeEnabled) onContentCardDismissed.read(1, arrayList2);
            int size = isitemviewswipeenabled != null ? isitemviewswipeenabled.IconCompatParcelizer : arrayList.size();
            if (z2) {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                int size2 = arrayList.size();
                boolean z3 = arrayList.size() > size;
                StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(size2, size, "initial displayableItems size: ", " headerItemCount: ", " displayableItems.size > headerItemCount: ");
                sbM.append(z3);
                forest.write(new RavlNonFatalLoggingException(sbM.toString()));
            }
            List list = onContentCardDismissed.read(arrayList, size);
            boolean z4 = arrayList.size() > size;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (list.isEmpty()) {
                int i8 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 81;
                r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i8 % Fields.SpotShadowColor;
                r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer = i8 % 2 != 0 ? removeNodeAtDepth.serializer(oncontextitemselected.serializer) : removeNodeAtDepth.serializer(oncontextitemselected.serializer);
            } else {
                r8lambdaKYpm98J7WxBu_lRN9AgXa8gwNH0 r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer = SmallPersistentVector.RemoteActionCompatParcelizer.serializer();
                if (z) {
                    int i9 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 55;
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 != 0) {
                        r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.add(oncontextitemselected.RemoteActionCompatParcelizer);
                        throw null;
                    }
                    r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.add(oncontextitemselected.RemoteActionCompatParcelizer);
                }
                if (z4) {
                    r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.add(oncontextitemselected.write);
                    r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.addAll(list);
                } else {
                    r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.addAll(list);
                }
                r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer = r8lambdakypm98j7wxbu_lrn9agxa8gwnh0Serializer.read();
            }
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(onContentCardDismissed.serializer(arrayList, size));
            boolean z5 = size > 0;
            r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer.getClass();
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer.getClass();
            if (z2) {
                Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException(af$$ExternalSyntheticOutline0.m(r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer.size(), "final headerItems size: ", r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer.size(), " bodyItems size is ")));
            }
            homeBottomSheetUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(z5));
            MutableStateFlow mutableStateFlow = homeBottomSheetUiModelImpl.IconCompatParcelizer;
            do {
                obj = mutableStateFlow.read();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer));
            int i10 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 99;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            MutableStateFlow mutableStateFlow2 = homeBottomSheetUiModelImpl.read;
            do {
                obj2 = mutableStateFlow2.read();
            } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj2, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer));
            int size3 = r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer.size();
            int size4 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer.size();
            if (size3 == 0) {
                onoptionsmenuclosed = onOptionsMenuClosed.HIDDEN;
            } else if (size4 == 0) {
                int i12 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 99;
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                onoptionsmenuclosed = onOptionsMenuClosed.HEADER_ONLY;
            } else {
                onoptionsmenuclosed = onOptionsMenuClosed.HEADER_AND_BODY;
            }
            int i14 = r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + 61;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                MutableStateFlow mutableStateFlow3 = homeBottomSheetUiModelImpl.serializer;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            MutableStateFlow mutableStateFlow4 = homeBottomSheetUiModelImpl.serializer;
            do {
                obj3 = mutableStateFlow4.read();
            } while (!mutableStateFlow4.RemoteActionCompatParcelizer(obj3, onoptionsmenuclosed));
            if (homeBottomSheetUiModelImpl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
                return;
            }
            homeBottomSheetUiModelImpl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = true;
            BuildersKt.RemoteActionCompatParcelizer(homeBottomSheetUiModelImpl.PlaybackStateCompatCustomAction, null, null, new AnonymousClass1(homeBottomSheetUiModelImpl, shortNewsContentCardView, i), 3);
        }
    }
}
