package com.roadrunner.delivery.ontheway.navigation.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore$data$1;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.navigation.domain.GetNavigationButtonAction;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.NavigationSettingsDialogManagerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShowNavigationSettingsTooltipUseCaseImpl;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.logger.logger.perseus.buffer.EventsBufferImpl$1$1;
import io.grpc.internal.CallTracer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.AndroidTextPaint_androidKt;
import o.AndroidTypeface;
import o.AndroidTypefaceCache;
import o.AndroidTypefaceWrapper;
import o.LineBreakStrictnessCompanion;
import o.ShortNewsContentCardView;
import o.accessgetParagraphcp;
import o.accesshandleUpdate;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.accessunpackByte3;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getFontLoaded;
import o.getFragment;
import o.getQueryContext;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET;
import o.onInitialized;
import o.packBytes;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setBrush12SF9DM;
import o.setDrawStyle;
import o.setShaderStateui_text;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationButtonUiModelImpl implements getFragment {
    private static int ResultReceiver = 1;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final MutableStateFlow IconCompatParcelizer;
    public final getFontLoaded MediaBrowserCompatMediaItem;
    public final setBrush12SF9DM MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final NavigationSettingsDialogManagerImpl MediaSessionCompatQueueItem;
    public final CallTracer MediaSessionCompatResultReceiverWrapper;
    public final LineBreakStrictnessCompanion MediaSessionCompatToken;
    public final StateFlow ParcelableVolumeInfo;
    public final ShowNavigationSettingsTooltipUseCaseImpl PlaybackStateCompat;
    public final onInitialized PlaybackStateCompatCustomAction;
    public final accessgetParagraphcp RatingCompat;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final GetNavigationButtonAction read;
    public final ContextScope serializer;
    public final getQueryContext write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        public final /* synthetic */ NavigationButtonUiModelImpl RemoteActionCompatParcelizer;
        public int serializer;
        public final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(NavigationButtonUiModelImpl navigationButtonUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.RemoteActionCompatParcelizer = navigationButtonUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.write;
            NavigationButtonUiModelImpl navigationButtonUiModelImpl = this.RemoteActionCompatParcelizer;
            int i4 = 1;
            if (i3 == 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(navigationButtonUiModelImpl, shortNewsContentCardView, 0);
                int i5 = IconCompatParcelizer + 1;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return anonymousClass1;
            }
            if (i3 != 1) {
                return new AnonymousClass1(navigationButtonUiModelImpl, shortNewsContentCardView, i);
            }
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(navigationButtonUiModelImpl, shortNewsContentCardView, i4);
            int i7 = IconCompatParcelizer + 43;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return anonymousClass2;
            }
            throw null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = read + 99;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            int i3 = this.write;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i3 == 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            if (i3 == 1) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = IconCompatParcelizer + 31;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objCollectLatest;
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.write;
            NavigationButtonUiModelImpl navigationButtonUiModelImpl = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i3 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.serializer;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    onInitialized oninitialized = navigationButtonUiModelImpl.PlaybackStateCompatCustomAction;
                    boolean zRemoteActionCompatParcelizer = oninitialized.IconCompatParcelizer.RemoteActionCompatParcelizer();
                    accessrequireViewFactoryHolder accessrequireviewfactoryholder = oninitialized.RemoteActionCompatParcelizer;
                    int i5 = 13;
                    Flow flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = zRemoteActionCompatParcelizer ? new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(new HeatmapDataStore$get$$inlined$map$1(new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) accessrequireviewfactoryholder)).MediaBrowserCompatMediaItem, 20), oninitialized, i5), oninitialized.write.read, new accesshandleUpdate(3, oninitialized, onInitialized.class, "combineStates", "combineStates(Lcom/roadrunner/delivery/ontheway/navigation/api/NavigateFloatingButtonUiState;Lcom/roadrunner/delivery/ontheway/turnbyturn/MapNavigationState;)Lcom/roadrunner/delivery/ontheway/navigation/api/NavigateFloatingButtonUiState;", 4, 1)) : new HeatmapDataStore$get$$inlined$map$1(new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) accessrequireviewfactoryholder)).MediaBrowserCompatMediaItem, 20), oninitialized, i5);
                    SingleProcessDataStore$data$1.AnonymousClass1 anonymousClass1 = new SingleProcessDataStore$data$1.AnonymousClass1(navigationButtonUiModelImpl, shortNewsContentCardView, 10);
                    this.serializer = 1;
                    return FlowKt.collectLatest(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                int i6 = read;
                int i7 = i6 + 15;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = i6 + 79;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            if (i3 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.serializer;
                if (i11 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ShowNavigationSettingsTooltipUseCaseImpl showNavigationSettingsTooltipUseCaseImpl = navigationButtonUiModelImpl.PlaybackStateCompat;
                    this.serializer = 1;
                    return showNavigationSettingsTooltipUseCaseImpl.invoke(this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                }
                int i12 = read + 93;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0 ? i11 != 1 : i11 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.serializer;
            if (i13 != 0) {
                if (i13 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            CallTracer callTracer = navigationButtonUiModelImpl.MediaSessionCompatResultReceiverWrapper;
            this.serializer = 1;
            if (((accessunpackByte3) callTracer.RemoteActionCompatParcelizer).read()) {
                SettingsOnboardingDataStore settingsOnboardingDataStore = ((packBytes) callTracer.IconCompatParcelizer).RemoteActionCompatParcelizer;
                objCollectLatest = FlowKt.collectLatest(FlowKt.serializer(new HeatmapDataStore$get$$inlined$map$1(settingsOnboardingDataStore.IconCompatParcelizer.serializer(), settingsOnboardingDataStore, 17)), new EventsBufferImpl$1$1(callTracer, shortNewsContentCardView, i), this);
                if (objCollectLatest != coroutineSingletons3) {
                    objCollectLatest = createfromparcel;
                }
            } else {
                objCollectLatest = createfromparcel;
            }
            if (objCollectLatest != coroutineSingletons3) {
                return createfromparcel;
            }
            int i14 = IconCompatParcelizer + 9;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            return coroutineSingletons3;
        }
    }

    @Override // o.getFragment
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i3 = i2 + 35;
        ResultReceiver = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        StateFlow stateFlow = this.MediaMetadataCompat;
        int i5 = i2 + 25;
        ResultReceiver = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public NavigationButtonUiModelImpl(onInitialized oninitialized, setBrush12SF9DM setbrush12sf9dm, GetNavigationButtonAction getNavigationButtonAction, accessgetParagraphcp accessgetparagraphcp, ContextScope contextScope, getQueryContext getquerycontext, LineBreakStrictnessCompanion lineBreakStrictnessCompanion, NavigationSettingsDialogManagerImpl navigationSettingsDialogManagerImpl, getFontLoaded getfontloaded, ShowNavigationSettingsTooltipUseCaseImpl showNavigationSettingsTooltipUseCaseImpl, CallTracer callTracer) {
        this.PlaybackStateCompatCustomAction = oninitialized;
        this.MediaDescriptionCompat = setbrush12sf9dm;
        this.read = getNavigationButtonAction;
        this.RatingCompat = accessgetparagraphcp;
        this.serializer = contextScope;
        this.write = getquerycontext;
        this.MediaSessionCompatToken = lineBreakStrictnessCompanion;
        this.MediaSessionCompatQueueItem = navigationSettingsDialogManagerImpl;
        this.MediaBrowserCompatMediaItem = getfontloaded;
        this.PlaybackStateCompat = showNavigationSettingsTooltipUseCaseImpl;
        this.MediaSessionCompatResultReceiverWrapper = callTracer;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(AndroidTypefaceWrapper.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.ParcelableVolumeInfo = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.IconCompatParcelizer = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(this, shortNewsContentCardView, 2), 3);
    }

    public final setDrawStyle RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        setShaderStateui_text setshaderstateui_text = (setShaderStateui_text) this.RemoteActionCompatParcelizer.read();
        if (setshaderstateui_text instanceof AndroidTextPaint_androidKt) {
            int i2 = ResultReceiver + 113;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return ((AndroidTextPaint_androidKt) setshaderstateui_text).write;
        }
        if (setshaderstateui_text instanceof AndroidTypeface) {
            return ((AndroidTypeface) setshaderstateui_text).write();
        }
        Object obj = null;
        if (!(setshaderstateui_text instanceof AndroidTypefaceWrapper)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        int i4 = ResultReceiver + 63;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049 A[PHI: r0
  0x0049: PHI (r0v5 o.setShaderStateui_text) = (r0v3 o.setShaderStateui_text), (r0v10 o.setShaderStateui_text) binds: [B:15:0x0047, B:12:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    public final void serializer() {
        setDrawStyle setdrawstyleRemoteActionCompatParcelizer;
        setShaderStateui_text setshaderstateui_text;
        int i = 2 % 2;
        int i2 = ResultReceiver + 55;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            setdrawstyleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int i3 = 9 / 0;
            if (setdrawstyleRemoteActionCompatParcelizer == null) {
                return;
            }
        } else {
            setdrawstyleRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (setdrawstyleRemoteActionCompatParcelizer == null) {
                return;
            }
        }
        int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 97;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            setshaderstateui_text = (setShaderStateui_text) this.RemoteActionCompatParcelizer.read();
            int i5 = 93 / 0;
            if (!(!(setshaderstateui_text instanceof AndroidTextPaint_androidKt))) {
                if (((AndroidTextPaint_androidKt) setshaderstateui_text).RemoteActionCompatParcelizer) {
                    return;
                }
            }
        } else {
            setshaderstateui_text = (setShaderStateui_text) this.RemoteActionCompatParcelizer.read();
            if (setshaderstateui_text instanceof AndroidTextPaint_androidKt) {
                if (((AndroidTextPaint_androidKt) setshaderstateui_text).RemoteActionCompatParcelizer) {
                    return;
                }
            }
        }
        BuildersKt.RemoteActionCompatParcelizer(this.serializer, null, null, new PerseusLogger$w$1(this, setdrawstyleRemoteActionCompatParcelizer, null, 23), 3);
    }

    public final void write(boolean z) {
        MutableStateFlow mutableStateFlow;
        Object obj;
        Object obj2;
        int i = 2 % 2;
        do {
            mutableStateFlow = this.RemoteActionCompatParcelizer;
            obj = mutableStateFlow.read();
            obj2 = (setShaderStateui_text) obj;
            AndroidTypefaceCache androidTypefaceCache = null;
            AndroidTextPaint_androidKt androidTextPaint_androidKt = obj2 instanceof AndroidTextPaint_androidKt ? (AndroidTextPaint_androidKt) obj2 : null;
            if (androidTextPaint_androidKt != null) {
                int i2 = ResultReceiver + 87;
                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                if (z) {
                    getFontLoaded getfontloaded = this.MediaBrowserCompatMediaItem;
                    setTransactionSuccessful settransactionsuccessful = getfontloaded.IconCompatParcelizer;
                    androidTypefaceCache = new AndroidTypefaceCache(settransactionsuccessful.IconCompatParcelizer(R.string.turn_by_turn_settings_dialog_quick_trips), settransactionsuccessful.read(R.string.turn_by_turn_settings_dialog_skip_tolls, ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) getfontloaded.write).IconCompatParcelizer), settransactionsuccessful.IconCompatParcelizer(R.string.turn_by_turn_settings_dialog_use_in_app), settransactionsuccessful.IconCompatParcelizer(R.string.turn_by_turn_settings_popup_not_now));
                }
                obj2 = AndroidTextPaint_androidKt.read(androidTextPaint_androidKt, false, androidTypefaceCache, 3);
                int i4 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 119;
                ResultReceiver = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, obj2));
    }
}
