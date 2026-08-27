package com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import com.mapbox.navigator.R;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase.ObserveEntrancePicture;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidFontListTypeface;
import o.AndroidParagraphHelper_androidKtNoopSpan1;
import o.ShortNewsContentCardView;
import o.createCharSequence;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getFragment;
import o.getQueryContext;
import o.isOpenInternalroom_runtime;
import o.isResumed;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setSpanStyle;
import o.transferSessionPackageI;

/* JADX INFO: loaded from: classes3.dex */
public final class EntrancePictureIconUiModelImpl implements getFragment {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final isResumed IconCompatParcelizer;
    public final isOpenInternalroom_runtime MediaBrowserCompatMediaItem;
    public final EntrancePictureRepository MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final createCharSequence MediaSessionCompatQueueItem;
    public final ObserveEntrancePicture MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU PlaybackStateCompat;
    public final StateFlow PlaybackStateCompatCustomAction;
    public final ContextScope RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final getQueryContext serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int read = 0;
        private static int serializer = 1;
        public final /* synthetic */ int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ EntrancePictureIconUiModelImpl write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.write = entrancePictureIconUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = read + 93;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl = this.write;
            if (i4 == 0) {
                return new AnonymousClass1(entrancePictureIconUiModelImpl, shortNewsContentCardView, 0);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(entrancePictureIconUiModelImpl, shortNewsContentCardView, 1);
            int i5 = serializer + 49;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return anonymousClass1;
            }
            throw null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = read + 85;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                throw null;
            }
            int i3 = this.IconCompatParcelizer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i3 != 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = read + 47;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x009f  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            int i2 = 2 % 2;
            int i3 = this.IconCompatParcelizer;
            Object obj2 = createFromParcel.INSTANCE;
            EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl = this.write;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i3 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.RemoteActionCompatParcelizer;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1Serializer = FlowKt.serializer(entrancePictureIconUiModelImpl.IconCompatParcelizer.IconCompatParcelizer, 16L);
                    SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2 anonymousClass2 = new SharedSessionRepositoryImpl.AnonymousClass1.AnonymousClass2(16, entrancePictureIconUiModelImpl);
                    this.RemoteActionCompatParcelizer = 1;
                    if (flowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1Serializer.collect(anonymousClass2, this) != coroutineSingletons) {
                        return obj2;
                    }
                    int i5 = serializer + 53;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return coroutineSingletons;
                }
                int i7 = serializer;
                int i8 = i7 + 59;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = i7 + 113;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = this.RemoteActionCompatParcelizer;
            if (i12 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ObserveEntrancePicture observeEntrancePicture = entrancePictureIconUiModelImpl.MediaSessionCompatToken;
                this.RemoteActionCompatParcelizer = 1;
                HeatmapDataStore$get$$inlined$map$1 heatmapDataStore$get$$inlined$map$1 = new HeatmapDataStore$get$$inlined$map$1(observeEntrancePicture.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), observeEntrancePicture, 12);
                if (heatmapDataStore$get$$inlined$map$1 == coroutineSingletons2) {
                    obj2 = coroutineSingletons2;
                } else {
                    obj = heatmapDataStore$get$$inlined$map$1;
                }
                i = read + 23;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return obj2;
                }
                shortNewsContentCardView.hashCode();
                throw null;
            }
            int i13 = serializer + 1;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (i12 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else if (i12 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            i = read + 23;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return obj2;
            }
            shortNewsContentCardView.hashCode();
            throw null;
            SingleProcessDataStore$data$1.AnonymousClass1 anonymousClass1 = new SingleProcessDataStore$data$1.AnonymousClass1(entrancePictureIconUiModelImpl, shortNewsContentCardView, 9);
            this.RemoteActionCompatParcelizer = 2;
            if (FlowKt.collectLatest((Flow) obj, anonymousClass1, this) == coroutineSingletons2) {
                obj2 = coroutineSingletons2;
            }
            i = read + 23;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return obj2;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
    }

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 3;
        MediaSessionCompatResultReceiverWrapper = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaMetadataCompat;
        int i5 = i2 + 115;
        MediaSessionCompatResultReceiverWrapper = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public EntrancePictureIconUiModelImpl(ContextScope contextScope, ObserveEntrancePicture observeEntrancePicture, transferSessionPackageI transfersessionpackagei, getQueryContext getquerycontext, EntrancePictureRepository entrancePictureRepository, isOpenInternalroom_runtime isopeninternalroom_runtime, isResumed isresumed, createCharSequence createcharsequence) {
        observeEntrancePicture.getClass();
        transfersessionpackagei.getClass();
        getquerycontext.getClass();
        entrancePictureRepository.getClass();
        isopeninternalroom_runtime.getClass();
        isresumed.getClass();
        createcharsequence.getClass();
        this.RatingCompat = contextScope;
        this.MediaSessionCompatToken = observeEntrancePicture;
        this.serializer = getquerycontext;
        this.MediaDescriptionCompat = entrancePictureRepository;
        this.MediaBrowserCompatMediaItem = isopeninternalroom_runtime;
        this.IconCompatParcelizer = isresumed;
        this.MediaSessionCompatQueueItem = createcharsequence;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(setSpanStyle.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.write = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        MutableStateFlow mutableStateFlow3 = StateFlowKt.read(Float.valueOf(1.0f));
        this.read = mutableStateFlow3;
        this.PlaybackStateCompatCustomAction = mutableStateFlow3;
        int iSerializer = R.serializer();
        int iSerializer2 = R.serializer();
        int iSerializer3 = R.serializer();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (((Boolean) FirebaseRemoteConfigImpl.RemoteActionCompatParcelizer(52023560, iSerializer2, R.serializer(), -52023556, iSerializer3, iSerializer, new Object[]{(FirebaseRemoteConfigImpl) transfersessionpackagei})).booleanValue()) {
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
            BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
            int i = MediaSessionCompatResultReceiverWrapper + 49;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i % Fields.SpotShadowColor;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = MediaSessionCompatResultReceiverWrapper + 121;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public static final Object access$saveTooltipShownForCurrentDelivery(EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl, String str, ContinuationImpl continuationImpl) throws Throwable {
        AndroidParagraphHelper_androidKtNoopSpan1 androidParagraphHelper_androidKtNoopSpan1;
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 61;
        MediaSessionCompatResultReceiverWrapper = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        EntrancePictureRepository entrancePictureRepository = entrancePictureIconUiModelImpl.MediaDescriptionCompat;
        if (continuationImpl instanceof AndroidParagraphHelper_androidKtNoopSpan1) {
            androidParagraphHelper_androidKtNoopSpan1 = (AndroidParagraphHelper_androidKtNoopSpan1) continuationImpl;
            int i4 = androidParagraphHelper_androidKtNoopSpan1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                androidParagraphHelper_androidKtNoopSpan1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                androidParagraphHelper_androidKtNoopSpan1 = new AndroidParagraphHelper_androidKtNoopSpan1(entrancePictureIconUiModelImpl, continuationImpl);
            }
        } else {
            androidParagraphHelper_androidKtNoopSpan1 = new AndroidParagraphHelper_androidKtNoopSpan1(entrancePictureIconUiModelImpl, continuationImpl);
        }
        Object obj = androidParagraphHelper_androidKtNoopSpan1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = androidParagraphHelper_androidKtNoopSpan1.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            androidParagraphHelper_androidKtNoopSpan1.IconCompatParcelizer = 1;
            AndroidFontListTypeface androidFontListTypeface = entrancePictureRepository.IconCompatParcelizer;
            isOpenInternalroom_runtime isopeninternalroom_runtime = androidFontListTypeface.IconCompatParcelizer;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new DeliveryNotesUiModelImpl.AnonymousClass1(androidFontListTypeface, str, shortNewsContentCardView, 11), androidParagraphHelper_androidKtNoopSpan1);
            if (objWithContext != coroutineSingletons) {
                int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 113;
                MediaSessionCompatResultReceiverWrapper = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                objWithContext = createfromparcel;
            }
            if (objWithContext != coroutineSingletons) {
                int i8 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 107;
                MediaSessionCompatResultReceiverWrapper = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                objWithContext = createfromparcel;
            }
            if (objWithContext != coroutineSingletons) {
            }
        }
        if (i5 != 1) {
            int i10 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 93;
            MediaSessionCompatResultReceiverWrapper = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (i5 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        androidParagraphHelper_androidKtNoopSpan1.IconCompatParcelizer = 2;
        return entrancePictureRepository.incrementTooltipShownCount(androidParagraphHelper_androidKtNoopSpan1) == coroutineSingletons ? coroutineSingletons : createfromparcel;
    }
}
