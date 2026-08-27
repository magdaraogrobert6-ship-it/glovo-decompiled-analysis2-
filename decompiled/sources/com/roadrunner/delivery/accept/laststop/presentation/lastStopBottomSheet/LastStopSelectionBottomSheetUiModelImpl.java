package com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1;
import coil3.ExtrasKt;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.laststop.api.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModel;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import com.roadrunner.delivery.accept.overlay.domain.ObserveAcceptOverlayVisibility$invoke$1;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.errorhandler.DeliveryErrorProviderImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.addSubLayer;
import o.createFromParcel;
import o.ddefault;
import o.getContentViewGroupParentLayout;
import o.getDrawFilter;
import o.getFallbackLineSpacing;
import o.getLayoutannotations;
import o.getLineForVertical;
import o.getQueryContext;
import o.getRangeForRect;
import o.getWordIterator;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.isOpaque;
import o.onActivityPreCreated;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.restoreToCount;
import o.setBitmap;
import o.setDrawFilter;
import o.setMatrix;
import o.setTransactionSuccessful;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopSelectionBottomSheetUiModelImpl implements LastStopSelectionBottomSheetUiModel {
    private static int ResultReceiver = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final MutableStateFlow IconCompatParcelizer;
    public final getRangeForRect MediaBrowserCompatMediaItem;
    public final getFallbackLineSpacing MediaDescriptionCompat;
    public final getLayoutannotations MediaMetadataCompat;
    public final DeliveryErrorProviderImpl MediaSessionCompatQueueItem;
    public final StateFlow MediaSessionCompatResultReceiverWrapper;
    public final getLineForVertical MediaSessionCompatToken;
    public final getQueryContext ParcelableVolumeInfo;
    public final SendTestPushUseCase PlaybackStateCompat;
    public final setTransactionSuccessful PlaybackStateCompatCustomAction;
    public final StateFlow RatingCompat;
    public final LastStopSelectionCoordinator RemoteActionCompatParcelizer;
    public final DeliveryAcceptanceLogger read;
    public final ContextScope serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int serializer = 0;
        private static int write = 1;
        public final /* synthetic */ int IconCompatParcelizer;
        public final /* synthetic */ LastStopSelectionBottomSheetUiModelImpl RemoteActionCompatParcelizer;
        public int read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = lastStopSelectionBottomSheetUiModelImpl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            return new com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1(r2, r6, 1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        
            r0 = new com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1(r2, r6, r1);
            r6 = com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1.write + 61;
            com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1.serializer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (r0 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        
            if (r0 != 0) goto L9;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final o.ShortNewsContentCardView create(java.lang.Object r5, o.ShortNewsContentCardView r6) {
            /*
                r4 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1.serializer
                int r0 = r0 + 7
                int r1 = r0 % 128
                com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1.write = r1
                int r0 = r0 % r5
                r1 = 0
                if (r0 != 0) goto L19
                int r0 = r4.IconCompatParcelizer
                com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl r2 = r4.RemoteActionCompatParcelizer
                r3 = 68
                int r3 = r3 / r1
                if (r0 == 0) goto L26
                goto L1f
            L19:
                int r0 = r4.IconCompatParcelizer
                com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl r2 = r4.RemoteActionCompatParcelizer
                if (r0 == 0) goto L26
            L1f:
                com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl$1 r5 = new com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl$1
                r0 = 1
                r5.<init>(r2, r6, r0)
                return r5
            L26:
                com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl$1 r0 = new com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl$1
                r0.<init>(r2, r6, r1)
                int r6 = com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1.write
                int r6 = r6 + 61
                int r1 = r6 % 128
                com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1.serializer = r1
                int r6 = r6 % r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.laststop.presentation.lastStopBottomSheet.LastStopSelectionBottomSheetUiModelImpl.AnonymousClass1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = serializer + 53;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i4 != 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = serializer + 35;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 66 / 0;
            }
            return objInvokeSuspend;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
            int i = 2 % 2;
            int i2 = serializer + 95;
            write = i2 % Fields.SpotShadowColor;
            Object obj2 = null;
            Object[] objArr = 0;
            Object obj3 = null;
            if (i2 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                obj2.hashCode();
                throw null;
            }
            int i3 = this.IconCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl = this.RemoteActionCompatParcelizer;
            int i4 = 1;
            if (i3 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.read;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    LastStopSelectionCoordinator lastStopSelectionCoordinator = lastStopSelectionBottomSheetUiModelImpl.RemoteActionCompatParcelizer;
                    this.read = 1;
                    if (lastStopSelectionCoordinator.initialize(this) == coroutineSingletons) {
                        int i6 = serializer + 113;
                        write = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0) {
                            return coroutineSingletons;
                        }
                        throw null;
                    }
                } else {
                    if (i5 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return createfromparcel2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.read;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getLineForVertical getlineforvertical = lastStopSelectionBottomSheetUiModelImpl.MediaSessionCompatToken;
                StateFlow stateFlow = getlineforvertical.write.MediaBrowserCompatMediaItem;
                if (((FirebaseRemoteConfigImpl) getlineforvertical.IconCompatParcelizer.RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.LAST_STOP_SAVING_ADDRESS_ENABLED)) {
                    getLayoutannotations getlayoutannotations = getlineforvertical.serializer;
                    RecentLastStopsDatastoreImpl recentLastStopsDatastoreImpl = getlayoutannotations.IconCompatParcelizer;
                    SignInDataStore$get$$inlined$map$1 signInDataStore$get$$inlined$map$1 = new SignInDataStore$get$$inlined$map$1(new SignInDataStore$get$$inlined$map$1(recentLastStopsDatastoreImpl.IconCompatParcelizer.serializer(), recentLastStopsDatastoreImpl, 6), getlayoutannotations, 5);
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = FlowKt.RemoteActionCompatParcelizer(signInDataStore$get$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer);
                } else {
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(instance_delegatelambda0.write);
                }
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(stateFlow, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, new ObserveAcceptOverlayVisibility$invoke$1(getlineforvertical, objArr == true ? 1 : 0, i4));
                FlowLiveDataConversions$asLiveData$1$1 flowLiveDataConversions$asLiveData$1$1 = new FlowLiveDataConversions$asLiveData$1$1(16, lastStopSelectionBottomSheetUiModelImpl);
                this.read = 1;
                obj3 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(flowLiveDataConversions$asLiveData$1$1, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel2;
            } else if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            }
            int i8 = serializer + 65;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return obj3;
        }
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 97;
        int i3 = i2 % Fields.SpotShadowColor;
        ResultReceiver = i3;
        int i4 = i2 % 2;
        StateFlow stateFlow = this.RatingCompat;
        int i5 = i3 + 31;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return stateFlow;
    }

    public final getQueryContext read() {
        getQueryContext getquerycontext;
        int i = 2 % 2;
        int i2 = ResultReceiver + 115;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3;
        if (i2 % 2 != 0) {
            getquerycontext = this.ParcelableVolumeInfo;
            int i4 = 27 / 0;
        } else {
            getquerycontext = this.ParcelableVolumeInfo;
        }
        int i5 = i3 + 41;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return getquerycontext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LastStopSelectionBottomSheetUiModelImpl(LastStopSelectionCoordinator lastStopSelectionCoordinator, getLineForVertical getlineforvertical, SendTestPushUseCase sendTestPushUseCase, getRangeForRect getrangeforrect, getQueryContext getquerycontext, setTransactionSuccessful settransactionsuccessful, DeliveryAcceptanceLogger deliveryAcceptanceLogger, getLayoutannotations getlayoutannotations, getFallbackLineSpacing getfallbacklinespacing, DeliveryErrorProviderImpl deliveryErrorProviderImpl, ContextScope contextScope) {
        this.RemoteActionCompatParcelizer = lastStopSelectionCoordinator;
        this.MediaSessionCompatToken = getlineforvertical;
        this.PlaybackStateCompat = sendTestPushUseCase;
        this.MediaBrowserCompatMediaItem = getrangeforrect;
        this.ParcelableVolumeInfo = getquerycontext;
        this.PlaybackStateCompatCustomAction = settransactionsuccessful;
        this.read = deliveryAcceptanceLogger;
        this.MediaMetadataCompat = getlayoutannotations;
        this.MediaDescriptionCompat = getfallbacklinespacing;
        this.MediaSessionCompatQueueItem = deliveryErrorProviderImpl;
        this.serializer = contextScope;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.write = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.RatingCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:46:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x0154  */
    /* JADX WARN: Code duplicated, block: B:52:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0166  */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:61:0x018c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final Object access$saveLastStop(LastStopSelectionBottomSheetUiModelImpl lastStopSelectionBottomSheetUiModelImpl, String str, setMatrix setmatrix, isOpaque isopaque, ContinuationImpl continuationImpl) throws Throwable {
        getWordIterator getworditerator;
        Object objM4954invokeBWLJW6A;
        int i;
        Object objWithContext;
        Object obj;
        isOpaque isopaque2;
        int i2;
        Throwable thSerializer;
        int i3;
        MutableStateFlow mutableStateFlow;
        Object obj2;
        isOpaque isopaque3;
        isOpaque isopaqueWrite;
        createFromParcel createfromparcel;
        int i4;
        boolean z;
        setDrawFilter setdrawfilter;
        setMatrix setmatrix2 = setmatrix;
        isOpaque isopaque4 = isopaque;
        int i5 = 2 % 2;
        getQueryContext getquerycontext = lastStopSelectionBottomSheetUiModelImpl.ParcelableVolumeInfo;
        if (continuationImpl instanceof getWordIterator) {
            getworditerator = (getWordIterator) continuationImpl;
            int i6 = getworditerator.read;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                getworditerator.read = i6 - Integer.MIN_VALUE;
            } else {
                getworditerator = new getWordIterator(lastStopSelectionBottomSheetUiModelImpl, continuationImpl);
            }
        } else {
            getworditerator = new getWordIterator(lastStopSelectionBottomSheetUiModelImpl, continuationImpl);
        }
        Object obj3 = getworditerator.MediaDescriptionCompat;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = getworditerator.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            BuildersKt.RemoteActionCompatParcelizer(lastStopSelectionBottomSheetUiModelImpl.serializer, null, null, new LocalAuthDataSource.AnonymousClass2(lastStopSelectionBottomSheetUiModelImpl, isopaque4, shortNewsContentCardView, 17), 3);
            SendTestPushUseCase sendTestPushUseCase = lastStopSelectionBottomSheetUiModelImpl.PlaybackStateCompat;
            onActivityPreCreated onactivityprecreated = new onActivityPreCreated(setmatrix2.IconCompatParcelizer, setmatrix2.serializer);
            String str2 = setmatrix2.write;
            getworditerator.IconCompatParcelizer = setmatrix2;
            getworditerator.write = isopaque4;
            getworditerator.read = 1;
            objM4954invokeBWLJW6A = sendTestPushUseCase.m4954invokeBWLJW6A(str, onactivityprecreated, str2, getworditerator);
            if (objM4954invokeBWLJW6A != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i8 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i9 = i8 + 97;
        ResultReceiver = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (i7 == 1) {
            isOpaque isopaque5 = getworditerator.write;
            setMatrix setmatrix3 = getworditerator.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            objM4954invokeBWLJW6A = ((onItemDismiss) obj3).IconCompatParcelizer;
            isopaque4 = isopaque5;
            setmatrix2 = setmatrix3;
        } else {
            if (i7 == 2) {
                int i11 = getworditerator.RemoteActionCompatParcelizer;
                Object obj4 = getworditerator.serializer;
                isOpaque isopaque6 = getworditerator.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                isopaque2 = isopaque6;
                createfromparcel2 = createfromparcel2;
                i2 = i11;
                obj = obj4;
                getquerycontext.serializer(new setBitmap(isopaque2.MediaSessionCompatQueueItem, ddefault.RemoteActionCompatParcelizer));
                getworditerator.IconCompatParcelizer = null;
                getworditerator.write = isopaque2;
                getworditerator.serializer = obj;
                getworditerator.RemoteActionCompatParcelizer = i2;
                getworditerator.read = 3;
                if (DelayKt.delay(ConstantsKt.DEFAULT_REQUEST_TIMEOUT, getworditerator) != coroutineSingletons) {
                    isopaque4 = isopaque2;
                }
                return coroutineSingletons;
            }
            if (i7 != 3) {
                int i12 = i8 + 15;
                int i13 = i12 % Fields.SpotShadowColor;
                ResultReceiver = i13;
                int i14 = i12 % 2;
                if (i7 != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i15 = i13 + 23;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                return createfromparcel2;
            }
            obj = getworditerator.serializer;
            isopaque4 = getworditerator.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            createfromparcel2 = createfromparcel2;
        }
        getquerycontext.serializer(restoreToCount.write);
        lastStopSelectionBottomSheetUiModelImpl.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
        objM4954invokeBWLJW6A = obj;
        thSerializer = onItemDismiss.serializer(objM4954invokeBWLJW6A);
        if (thSerializer == null) {
            return createfromparcel2;
        }
        i3 = ResultReceiver + 63;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            mutableStateFlow = lastStopSelectionBottomSheetUiModelImpl.write;
            int i17 = 45 / 0;
        } else {
            mutableStateFlow = lastStopSelectionBottomSheetUiModelImpl.write;
        }
        do {
            obj2 = mutableStateFlow.read();
            isopaque3 = (isOpaque) obj2;
            if (isopaque3 != null) {
                i4 = ResultReceiver + 91;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    setdrawfilter = isopaque3.IconCompatParcelizer;
                    z = false;
                } else {
                    z = false;
                    setdrawfilter = isopaque3.IconCompatParcelizer;
                }
                isopaqueWrite = isOpaque.write(isopaque3, setDrawFilter.serializer(setdrawfilter, z));
            } else {
                isopaqueWrite = null;
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, isopaqueWrite));
        if (!(thSerializer instanceof addSubLayer)) {
            createFromParcel createfromparcel3 = createfromparcel2;
            lastStopSelectionBottomSheetUiModelImpl.ParcelableVolumeInfo.serializer(new setBitmap(isopaque4.read, ddefault.IconCompatParcelizer));
            Timber.RemoteActionCompatParcelizer.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Save last stop error: ", thSerializer.getMessage()), new Object[0]);
            return createfromparcel3;
        }
        DeliveryErrorProviderImpl deliveryErrorProviderImpl = lastStopSelectionBottomSheetUiModelImpl.MediaSessionCompatQueueItem;
        getworditerator.IconCompatParcelizer = null;
        getworditerator.write = null;
        getworditerator.serializer = objM4954invokeBWLJW6A;
        getworditerator.RemoteActionCompatParcelizer = 0;
        getworditerator.read = 4;
        deliveryErrorProviderImpl.emitError(thSerializer, getworditerator);
        createfromparcel = createfromparcel2;
        if (createfromparcel == coroutineSingletons) {
            return coroutineSingletons;
        }
        return createfromparcel;
        if (objM4954invokeBWLJW6A instanceof isItemDismissable) {
            thSerializer = onItemDismiss.serializer(objM4954invokeBWLJW6A);
            if (thSerializer == null) {
                return createfromparcel2;
            }
            i3 = ResultReceiver + 63;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                mutableStateFlow = lastStopSelectionBottomSheetUiModelImpl.write;
                int i18 = 45 / 0;
            } else {
                mutableStateFlow = lastStopSelectionBottomSheetUiModelImpl.write;
            }
            do {
                obj2 = mutableStateFlow.read();
                isopaque3 = (isOpaque) obj2;
                if (isopaque3 != null) {
                    i4 = ResultReceiver + 91;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        setdrawfilter = isopaque3.IconCompatParcelizer;
                        z = false;
                    } else {
                        z = false;
                        setdrawfilter = isopaque3.IconCompatParcelizer;
                    }
                    isopaqueWrite = isOpaque.write(isopaque3, setDrawFilter.serializer(setdrawfilter, z));
                } else {
                    isopaqueWrite = null;
                }
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, isopaqueWrite));
            if (!(thSerializer instanceof addSubLayer)) {
                createFromParcel createfromparcel4 = createfromparcel2;
                lastStopSelectionBottomSheetUiModelImpl.ParcelableVolumeInfo.serializer(new setBitmap(isopaque4.read, ddefault.IconCompatParcelizer));
                Timber.RemoteActionCompatParcelizer.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Save last stop error: ", thSerializer.getMessage()), new Object[0]);
                return createfromparcel4;
            }
            DeliveryErrorProviderImpl deliveryErrorProviderImpl2 = lastStopSelectionBottomSheetUiModelImpl.MediaSessionCompatQueueItem;
            getworditerator.IconCompatParcelizer = null;
            getworditerator.write = null;
            getworditerator.serializer = objM4954invokeBWLJW6A;
            getworditerator.RemoteActionCompatParcelizer = 0;
            getworditerator.read = 4;
            deliveryErrorProviderImpl2.emitError(thSerializer, getworditerator);
            createfromparcel = createfromparcel2;
            if (createfromparcel == coroutineSingletons) {
                return createfromparcel;
            }
        } else {
            int i19 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 31;
            ResultReceiver = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            getworditerator.IconCompatParcelizer = null;
            getworditerator.write = isopaque4;
            getworditerator.serializer = objM4954invokeBWLJW6A;
            getworditerator.RemoteActionCompatParcelizer = 0;
            getworditerator.read = 2;
            if (((FirebaseRemoteConfigImpl) lastStopSelectionBottomSheetUiModelImpl.MediaDescriptionCompat.RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.LAST_STOP_SAVING_ADDRESS_ENABLED)) {
                getLayoutannotations getlayoutannotations = lastStopSelectionBottomSheetUiModelImpl.MediaMetadataCompat;
                getDrawFilter getdrawfilter = new getDrawFilter(setmatrix2.write, setmatrix2.IconCompatParcelizer, setmatrix2.serializer);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new BridgeManager$trackEvent$2(getlayoutannotations, getdrawfilter, shortNewsContentCardView, 18), getworditerator);
                if (objWithContext != coroutineSingletons) {
                    objWithContext = createfromparcel2;
                }
                if (objWithContext != coroutineSingletons) {
                    i = ResultReceiver + 41;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i21 = 3 / 5;
                    }
                    objWithContext = createfromparcel2;
                }
            } else {
                i = ResultReceiver + 41;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i22 = 3 / 5;
                }
                objWithContext = createfromparcel2;
            }
            if (objWithContext != coroutineSingletons) {
                obj = objM4954invokeBWLJW6A;
                isopaque2 = isopaque4;
                i2 = 0;
                getquerycontext.serializer(new setBitmap(isopaque2.MediaSessionCompatQueueItem, ddefault.RemoteActionCompatParcelizer));
                getworditerator.IconCompatParcelizer = null;
                getworditerator.write = isopaque2;
                getworditerator.serializer = obj;
                getworditerator.RemoteActionCompatParcelizer = i2;
                getworditerator.read = 3;
                if (DelayKt.delay(ConstantsKt.DEFAULT_REQUEST_TIMEOUT, getworditerator) != coroutineSingletons) {
                    isopaque4 = isopaque2;
                    getquerycontext.serializer(restoreToCount.write);
                    lastStopSelectionBottomSheetUiModelImpl.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
                    objM4954invokeBWLJW6A = obj;
                    thSerializer = onItemDismiss.serializer(objM4954invokeBWLJW6A);
                    if (thSerializer == null) {
                        return createfromparcel2;
                    }
                    i3 = ResultReceiver + 63;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        mutableStateFlow = lastStopSelectionBottomSheetUiModelImpl.write;
                        int i110 = 45 / 0;
                    } else {
                        mutableStateFlow = lastStopSelectionBottomSheetUiModelImpl.write;
                    }
                    do {
                        obj2 = mutableStateFlow.read();
                        isopaque3 = (isOpaque) obj2;
                        if (isopaque3 != null) {
                            i4 = ResultReceiver + 91;
                            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                setdrawfilter = isopaque3.IconCompatParcelizer;
                                z = false;
                            } else {
                                z = false;
                                setdrawfilter = isopaque3.IconCompatParcelizer;
                            }
                            isopaqueWrite = isOpaque.write(isopaque3, setDrawFilter.serializer(setdrawfilter, z));
                        } else {
                            isopaqueWrite = null;
                        }
                    } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, isopaqueWrite));
                    if (!(thSerializer instanceof addSubLayer)) {
                        createFromParcel createfromparcel5 = createfromparcel2;
                        lastStopSelectionBottomSheetUiModelImpl.ParcelableVolumeInfo.serializer(new setBitmap(isopaque4.read, ddefault.IconCompatParcelizer));
                        Timber.RemoteActionCompatParcelizer.read(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Save last stop error: ", thSerializer.getMessage()), new Object[0]);
                        return createfromparcel5;
                    }
                    DeliveryErrorProviderImpl deliveryErrorProviderImpl3 = lastStopSelectionBottomSheetUiModelImpl.MediaSessionCompatQueueItem;
                    getworditerator.IconCompatParcelizer = null;
                    getworditerator.write = null;
                    getworditerator.serializer = objM4954invokeBWLJW6A;
                    getworditerator.RemoteActionCompatParcelizer = 0;
                    getworditerator.read = 4;
                    deliveryErrorProviderImpl3.emitError(thSerializer, getworditerator);
                    createfromparcel = createfromparcel2;
                    if (createfromparcel == coroutineSingletons) {
                        return createfromparcel;
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
