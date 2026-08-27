package com.roadrunner.delivery.ontheway.deliverynotes.presentation;

import android.content.IntentFilter;
import android.location.Location;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$1;
import androidx.room.Room;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.messaging.SyncTask$ConnectivityChangeReceiver;
import com.google.re2j.Parser;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.LocalAuthDataSource;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.domain.usecase.GetCrowdSourcingEntryPointScreenImpl;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesUiModel;
import com.roadrunner.delivery.ontheway.destinationdetails.presentation.DestinationDetailsUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl;
import com.roadrunner.delivery.ontheway.header.implementation.presentation.DestinationHeaderUiModelImpl;
import com.roadrunner.delivery.ontheway.navigation.domain.GetNavigationButtonAction;
import com.roadrunner.delivery.ontheway.navigation.presentation.NavigationButtonUiModelImpl;
import com.roadrunner.delivery.ontheway.phonecall.UnifiedPhoneCallerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.switcher.SwitcherUiModelImpl$1;
import com.roadrunner.delivery.ontheway.turnbyturn.ui.tripinformation.TripInformationUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.details.contactrider.presentation.ContactRiderViewModel;
import com.roadrunner.delivery.pickupdropoff.presentation.PickUpDropOffUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.presentation.PickupDropOffSingleDeliveryUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.acknowledgement.presentation.AcknowledgementTaskUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.extension.FlowExtensionsKt;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.ActualParagraphXGqx6AY;
import o.AndroidFontListTypeface;
import o.AndroidResourceFontLoaderHelper;
import o.BaselineShiftCompanion;
import o.CompositionDataRecordCompanion;
import o.CustomBulletSpan;
import o.DefaultContentCardView;
import o.FocusListener;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.InfiniteTransitionSearchInfo;
import o.InputMethodManagerImplimm2;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.TextDirection;
import o.TextFieldValueCompanion;
import o.TextInputServiceAndroid_androidKtExternalSyntheticLambda1;
import o.accessgetFalseyp;
import o.accessgetGocp;
import o.accessgetOnEditCommandp;
import o.accessgetSimplecp;
import o.accessgetSubscriptcp;
import o.accessisRenderNodeCompatiblecp;
import o.accesstoNestedScrollSource;
import o.asExecutorlambda0;
import o.backwardFocusSearch;
import o.copyYTHSh70;
import o.copywBHncE4default;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.fastFilterNotNull;
import o.getCieXyz;
import o.getComposePaint;
import o.getContentViewGroupParentLayout;
import o.getNativeTypefacePYhJU0U;
import o.getPlatformImeOptions;
import o.getQueryContext;
import o.getRearDisplayMetrics;
import o.getSendeUduSuo;
import o.getSentencesIUNYP9kannotations;
import o.getSpanVerticalAligndo9XGg;
import o.getSpanVerticalAligndo9XGgannotations;
import o.getStartEllipsisgIe3tQ8annotations;
import o.getUnderlineannotations;
import o.getUnspecifiedeUduSuo;
import o.hasFlag;
import o.isEditorFocused;
import o.isIncludeFontPaddingEnabled;
import o.isItemDismissable;
import o.isStateSaved;
import o.onConnectionClosed;
import o.onItemDismiss;
import o.onViewCreated;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaokZBgNnbR8K2i443J9b9JUwVwk;
import o.r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I;
import o.r8lambdattOPrCwQAZdC10c20qDtJUliAwE;
import o.removeNodeAtDepth;
import o.sendSynthesizedKeyEvent;
import o.setBaselineShift0ocSgnM;
import o.setDrawStyle;
import o.toColorLong8_81llA;
import o.updateWithEmojiCompat;
import o.width;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryNotesUiModelImpl implements DeliveryNotesUiModel {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaSessionCompatQueueItem;
    public final MutableStateFlow IconCompatParcelizer;
    public final StateFlow MediaDescriptionCompat;
    public final StateFlow MediaMetadataCompat;
    public final Parser.Pair RemoteActionCompatParcelizer;
    public final hasFlag read;
    public final MutableStateFlow serializer;
    public final getQueryContext write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RatingCompat = 1;
        private static int RemoteActionCompatParcelizer;
        public Object IconCompatParcelizer;
        public final /* synthetic */ Object read;
        public final /* synthetic */ int serializer;
        public int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, AndroidFontListTypeface androidFontListTypeface, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.serializer = 10;
            this.read = androidFontListTypeface;
            this.write = i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.IconCompatParcelizer = obj;
            this.read = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.read = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 79;
            RatingCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = this.serializer;
            Object obj2 = this.read;
            int i6 = 23;
            int i7 = 15;
            int i8 = 0;
            switch (i5) {
                case 0:
                    return new AnonymousClass1((TextInputServiceAndroid_androidKtExternalSyntheticLambda1) this.IconCompatParcelizer, (DeliveryNotesUiModelImpl) obj2, shortNewsContentCardView, i8);
                case 1:
                    return new AnonymousClass1((copyYTHSh70) this.IconCompatParcelizer, (copywBHncE4default) obj2, shortNewsContentCardView, 1);
                case 2:
                    return new AnonymousClass1((SnackbarHostState) this.IconCompatParcelizer, (getPlatformImeOptions) obj2, shortNewsContentCardView, i);
                case 3:
                    return new AnonymousClass1((View) this.IconCompatParcelizer, (Animatable) obj2, shortNewsContentCardView, 3);
                case 4:
                    return new AnonymousClass1((sendSynthesizedKeyEvent) this.IconCompatParcelizer, (getSentencesIUNYP9kannotations) obj2, shortNewsContentCardView, 4);
                case 5:
                    return new AnonymousClass1((isEditorFocused) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 5);
                case 6:
                    return new AnonymousClass1((isEditorFocused) this.IconCompatParcelizer, (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj2, shortNewsContentCardView, 6);
                case 7:
                    return new AnonymousClass1((SendTestPushUseCase) this.IconCompatParcelizer, (DeliveryNotesLinkUiModelImpl) obj2, shortNewsContentCardView, 7);
                case 8:
                    return new AnonymousClass1((onViewCreated) this.IconCompatParcelizer, (DestinationDetailsUiModelImpl) obj2, shortNewsContentCardView, 8);
                case 9:
                    return new AnonymousClass1((isStateSaved) this.IconCompatParcelizer, (DestinationDetailsUiModelImpl) obj2, shortNewsContentCardView, 9);
                case 10:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.write, (AndroidFontListTypeface) obj2, shortNewsContentCardView);
                    anonymousClass1.IconCompatParcelizer = obj;
                    return anonymousClass1;
                case 11:
                    return new AnonymousClass1((AndroidFontListTypeface) this.IconCompatParcelizer, (String) obj2, shortNewsContentCardView, 11);
                case 12:
                    return new AnonymousClass1((SendTestPushUseCase) this.IconCompatParcelizer, (isIncludeFontPaddingEnabled) obj2, shortNewsContentCardView, 12);
                case 13:
                    return new AnonymousClass1((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.IconCompatParcelizer, (PopulateViewStructure_androidKtpopulate7) obj2, shortNewsContentCardView, 13);
                case 14:
                    return new AnonymousClass1((EntrancePictureIconUiModelImpl) this.IconCompatParcelizer, (getNativeTypefacePYhJU0U) obj2, shortNewsContentCardView, 14);
                case 15:
                    return new AnonymousClass1((getComposePaint) this.IconCompatParcelizer, (DestinationHeaderUiModelImpl) obj2, shortNewsContentCardView, i7);
                case 16:
                    return new AnonymousClass1((DestinationHeaderUiModelImpl) this.IconCompatParcelizer, (getSpanVerticalAligndo9XGgannotations) obj2, shortNewsContentCardView, 16);
                case 17:
                    return new AnonymousClass1((NavigationButtonUiModelImpl) obj2, shortNewsContentCardView, 17);
                case 18:
                    AnonymousClass1 anonymousClass2 = new AnonymousClass1((accessgetFalseyp) obj2, shortNewsContentCardView, 18);
                    anonymousClass2.IconCompatParcelizer = obj;
                    return anonymousClass2;
                case 19:
                    AnonymousClass1 anonymousClass3 = new AnonymousClass1((accessisRenderNodeCompatiblecp) this.IconCompatParcelizer, (accessgetFalseyp) obj2, shortNewsContentCardView, 19);
                    int i9 = RemoteActionCompatParcelizer + 23;
                    RatingCompat = i9 % Fields.SpotShadowColor;
                    if (i9 % 2 == 0) {
                        int i10 = 32 / 0;
                    }
                    return anonymousClass3;
                case 20:
                    AnonymousClass1 anonymousClass4 = new AnonymousClass1((NestLoadingServiceImpl$special$$inlined$map$1) obj2, shortNewsContentCardView, 20);
                    anonymousClass4.IconCompatParcelizer = obj;
                    return anonymousClass4;
                case 21:
                    return new AnonymousClass1((CustomBulletSpan) this.IconCompatParcelizer, (getSpanVerticalAligndo9XGg) obj2, shortNewsContentCardView, 21);
                case 22:
                    return new AnonymousClass1((SendTestPushUseCase) this.IconCompatParcelizer, (BaselineShiftCompanion) obj2, shortNewsContentCardView, 22);
                case 23:
                    return new AnonymousClass1((String) this.IconCompatParcelizer, (InitializeAppStartupItemsImpl) obj2, shortNewsContentCardView, i6);
                case 24:
                    return new AnonymousClass1((TripInformationUiModelImpl) this.IconCompatParcelizer, (getSpanVerticalAligndo9XGgannotations) obj2, shortNewsContentCardView, 24);
                case 25:
                    AnonymousClass1 anonymousClass5 = new AnonymousClass1((getStartEllipsisgIe3tQ8annotations) obj2, shortNewsContentCardView, 25);
                    anonymousClass5.IconCompatParcelizer = obj;
                    return anonymousClass5;
                case 26:
                    AnonymousClass1 anonymousClass6 = new AnonymousClass1((ContactRiderViewModel) this.IconCompatParcelizer, (getSpanVerticalAligndo9XGg) obj2, shortNewsContentCardView, 26);
                    int i11 = RemoteActionCompatParcelizer + 15;
                    RatingCompat = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    return anonymousClass6;
                case 27:
                    AnonymousClass1 anonymousClass7 = new AnonymousClass1((PickUpDropOffUiModelImpl) obj2, shortNewsContentCardView, 27);
                    anonymousClass7.IconCompatParcelizer = obj;
                    return anonymousClass7;
                case 28:
                    AnonymousClass1 anonymousClass8 = new AnonymousClass1((PickupDropOffSingleDeliveryUiModelImpl) obj2, shortNewsContentCardView, 28);
                    anonymousClass8.IconCompatParcelizer = obj;
                    return anonymousClass8;
                default:
                    return new AnonymousClass1((ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer, (AcknowledgementTaskUiModelImpl) obj2, shortNewsContentCardView, 29);
            }
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            switch (i4) {
                case 0:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 1:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 2:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 3:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 4:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 5:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 6:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 7:
                    Object objInvokeSuspend = ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    int i5 = RemoteActionCompatParcelizer + 37;
                    RatingCompat = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                case 8:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 9:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 10:
                    ((AnonymousClass1) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                    return createfromparcel;
                case 11:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 12:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 13:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 14:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 15:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 16:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 17:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 18:
                    return ((AnonymousClass1) create((accessgetGocp) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 19:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 20:
                    return ((AnonymousClass1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 21:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 22:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 23:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 24:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 25:
                    return ((AnonymousClass1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 26:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 27:
                    return ((AnonymousClass1) create((r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                case 28:
                    return ((AnonymousClass1) create((r8lambdattOPrCwQAZdC10c20qDtJUliAwE) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                default:
                    return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer;
            Object objRemoteActionCompatParcelizer;
            Object objM4919callgIAlus;
            getQueryContext getquerycontext;
            Object obj2;
            Object obj3;
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            Object obj4 = this.read;
            int i4 = 4;
            int i5 = 23;
            int i6 = 29;
            int i7 = 15;
            Object obj5 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            int i8 = 1;
            switch (i3) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.write;
                    if (i9 != 0) {
                        if (i9 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    TextInputServiceAndroid_androidKtExternalSyntheticLambda1 textInputServiceAndroid_androidKtExternalSyntheticLambda1 = (TextInputServiceAndroid_androidKtExternalSyntheticLambda1) this.IconCompatParcelizer;
                    SignInDataStore$get$$inlined$map$1 signInDataStore$get$$inlined$map$1 = new SignInDataStore$get$$inlined$map$1(new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) textInputServiceAndroid_androidKtExternalSyntheticLambda1.serializer.RemoteActionCompatParcelizer)).MediaBrowserCompatMediaItem, 15), textInputServiceAndroid_androidKtExternalSyntheticLambda1, 14);
                    SwitcherUiModelImpl$1.AnonymousClass1 anonymousClass1 = new SwitcherUiModelImpl$1.AnonymousClass1((DeliveryNotesUiModelImpl) obj4, objArr == true ? 1 : 0, i8);
                    this.write = 1;
                    return FlowKt.collectLatest(signInDataStore$get$$inlined$map$1, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                case 1:
                    copyYTHSh70 copyythsh70 = (copyYTHSh70) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.write;
                    if (i10 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        if (!copyythsh70.serializer() || copyythsh70.write()) {
                            return createfromparcel;
                        }
                        this.write = 1;
                        if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        if (i10 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    ((copywBHncE4default) obj4).IconCompatParcelizer(copyythsh70);
                    return createfromparcel;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.write;
                    if (i11 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        SnackbarHostState snackbarHostState = (SnackbarHostState) this.IconCompatParcelizer;
                        String str = ((onConnectionClosed) ((getPlatformImeOptions) obj4)).read;
                        this.write = 1;
                        return SnackbarHostState.RemoteActionCompatParcelizer(snackbarHostState, str, null, null, this, 14) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
                    }
                    if (i11 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i12 = RemoteActionCompatParcelizer + 125;
                    RatingCompat = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    obj5.hashCode();
                    throw null;
                case 3:
                    Animatable animatable = (Animatable) obj4;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.write;
                    if (i13 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        ((View) this.IconCompatParcelizer).performHapticFeedback(1);
                        Float f = new Float(1.4f);
                        width widthVarIconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 10000.0f, 5, (Object) null);
                        this.write = 1;
                        if (Animatable.IconCompatParcelizer(animatable, f, widthVarIconCompatParcelizer, this, 12) != coroutineSingletons4) {
                        }
                        return coroutineSingletons4;
                    }
                    int i14 = RatingCompat;
                    int i15 = i14 + 69;
                    RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (i13 != 1) {
                        int i17 = i14 + 49;
                        RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        if (i13 == 2) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Float f2 = new Float(1.0f);
                    width widthVarIconCompatParcelizer2 = DelayKt.IconCompatParcelizer(0.5f, 1500.0f, 4, (Object) null);
                    this.write = 2;
                    if (Animatable.IconCompatParcelizer(animatable, f2, widthVarIconCompatParcelizer2, this, 12) != coroutineSingletons4) {
                        return createfromparcel;
                    }
                    return coroutineSingletons4;
                case 4:
                    sendSynthesizedKeyEvent sendsynthesizedkeyevent = (sendSynthesizedKeyEvent) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.write;
                    if (i19 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        GetCrowdSourcingEntryPointScreenImpl getCrowdSourcingEntryPointScreenImpl = sendsynthesizedkeyevent.RemoteActionCompatParcelizer;
                        this.write = 1;
                        objIconCompatParcelizer = GetCrowdSourcingEntryPointScreenImpl.IconCompatParcelizer(getCrowdSourcingEntryPointScreenImpl, true, this);
                        if (objIconCompatParcelizer == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i19 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objIconCompatParcelizer = obj;
                    }
                    sendsynthesizedkeyevent.IconCompatParcelizer.write(new getSendeUduSuo((InputMethodManagerImplimm2) objIconCompatParcelizer, ((getSentencesIUNYP9kannotations) obj4).RemoteActionCompatParcelizer()));
                    return createfromparcel;
                case 5:
                    isEditorFocused iseditorfocused = (isEditorFocused) this.IconCompatParcelizer;
                    ArrayList arrayList = iseditorfocused.read;
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.write;
                    if (i20 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        getRearDisplayMetrics getreardisplaymetrics = iseditorfocused.MediaMetadataCompat;
                        this.write = 1;
                        objRemoteActionCompatParcelizer = getreardisplaymetrics.RemoteActionCompatParcelizer(this);
                        if (objRemoteActionCompatParcelizer == coroutineSingletons6) {
                            int i21 = RatingCompat + 59;
                            RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i20 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objRemoteActionCompatParcelizer = obj;
                    }
                    Location location = (Location) objRemoteActionCompatParcelizer;
                    if (location == null) {
                        return createfromparcel;
                    }
                    String str2 = (String) obj4;
                    Iterator it = arrayList.iterator();
                    int i23 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((TextFieldValueCompanion) it.next()).id, str2}, getCieXyz.write())).booleanValue()) {
                                i23++;
                            }
                        } else {
                            i23 = -1;
                        }
                    }
                    if (i23 == -1) {
                        return createfromparcel;
                    }
                    TextFieldValueCompanion textFieldValueCompanion = (TextFieldValueCompanion) arrayList.get(i23);
                    Double d = new Double(location.getLatitude());
                    Double d2 = new Double(location.getLongitude());
                    String str3 = textFieldValueCompanion.id;
                    String str4 = textFieldValueCompanion.path;
                    long j = textFieldValueCompanion.capturedAt;
                    str3.getClass();
                    str4.getClass();
                    arrayList.set(i23, new TextFieldValueCompanion(str3, str4, j, d, d2));
                    return createfromparcel;
                case 6:
                    isEditorFocused iseditorfocused2 = (isEditorFocused) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.write;
                    if (i24 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        String str5 = iseditorfocused2.serializer;
                        this.write = 1;
                        if (iseditorfocused2.MediaSessionCompatResultReceiverWrapper.invoke((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj4, str5, this) == coroutineSingletons7) {
                            return coroutineSingletons7;
                        }
                    } else {
                        if (i24 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    iseditorfocused2.RatingCompat.read(getUnspecifiedeUduSuo.AGREE_AND_POST);
                    iseditorfocused2.MediaDescriptionCompat.serializer(accessgetOnEditCommandp.IconCompatParcelizer);
                    return createfromparcel;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.write;
                    if (i25 != 0) {
                        if (i25 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SendTestPushUseCase sendTestPushUseCase = (SendTestPushUseCase) this.IconCompatParcelizer;
                    SignInDataStore$get$$inlined$map$1 signInDataStore$get$$inlined$map$2 = new SignInDataStore$get$$inlined$map$1(new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) ((updateWithEmojiCompat) sendTestPushUseCase.serializer).RemoteActionCompatParcelizer)).MediaBrowserCompatMediaItem, 15), sendTestPushUseCase, i7);
                    LocalAuthDataSource.AnonymousClass2 anonymousClass2 = new LocalAuthDataSource.AnonymousClass2((DeliveryNotesLinkUiModelImpl) obj4, objArr2 == true ? 1 : 0, i6);
                    this.write = 1;
                    return FlowKt.collectLatest(signInDataStore$get$$inlined$map$2, anonymousClass2, this) == coroutineSingletons8 ? coroutineSingletons8 : createfromparcel;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.write;
                    if (i26 != 0) {
                        if (i26 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    StateFlow stateFlowIconCompatParcelizer = ((onViewCreated) this.IconCompatParcelizer).IconCompatParcelizer();
                    DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1((DestinationDetailsUiModelImpl) obj4, objArr3 == true ? 1 : 0, i6);
                    this.write = 1;
                    return FlowKt.collectLatest(stateFlowIconCompatParcelizer, diskLruCache$launchCleanup$1, this) == coroutineSingletons9 ? coroutineSingletons9 : createfromparcel;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i27 = this.write;
                    if (i27 != 0) {
                        if (i27 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    StateFlow stateFlow = ((isStateSaved) this.IconCompatParcelizer).read;
                    SwitcherUiModelImpl$1.AnonymousClass1 anonymousClass3 = new SwitcherUiModelImpl$1.AnonymousClass1((DestinationDetailsUiModelImpl) obj4, objArr4 == true ? 1 : 0, i);
                    this.write = 1;
                    return FlowKt.collectLatest(stateFlow, anonymousClass3, this) == coroutineSingletons10 ? coroutineSingletons10 : createfromparcel;
                case 10:
                    backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    backwardfocussearch.write(((AndroidFontListTypeface) obj4).write, new Integer(this.write));
                    return createfromparcel;
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.write;
                    if (i28 != 0) {
                        if (i28 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    AndroidFontListTypeface androidFontListTypeface = (AndroidFontListTypeface) this.IconCompatParcelizer;
                    performCustomExitMxy_nc0 performcustomexitmxy_nc0 = androidFontListTypeface.RemoteActionCompatParcelizer;
                    SignInDataStore$set$2 signInDataStore$set$2 = new SignInDataStore$set$2((Object) androidFontListTypeface, obj4, (ShortNewsContentCardView) (objArr5 == true ? 1 : 0), 28);
                    this.write = 1;
                    return pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, signInDataStore$set$2, this) == coroutineSingletons12 ? coroutineSingletons12 : createfromparcel;
                case 12:
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.write;
                    if (i29 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        int i30 = 3;
                        Flow flowSerializer = FlowKt.serializer(new DefaultContentCardView(i30), new NestLoadingServiceImpl$special$$inlined$map$1(FlowKt.serializer(((EntrancePictureRepository) ((SendTestPushUseCase) this.IconCompatParcelizer).serializer).RemoteActionCompatParcelizer()), 16));
                        SwitcherUiModelImpl$1.AnonymousClass1 anonymousClass4 = new SwitcherUiModelImpl$1.AnonymousClass1((isIncludeFontPaddingEnabled) obj4, objArr6 == true ? 1 : 0, i30);
                        this.write = 1;
                        return FlowKt.collectLatest(flowSerializer, anonymousClass4, this) == coroutineSingletons13 ? coroutineSingletons13 : createfromparcel;
                    }
                    if (i29 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i31 = RatingCompat + 17;
                    RemoteActionCompatParcelizer = i31 % Fields.SpotShadowColor;
                    if (i31 % 2 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    throw null;
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.write;
                    if (i32 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.write = 1;
                        if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i32 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    ((PopulateViewStructure_androidKtpopulate7) obj4).setValue(Boolean.TRUE);
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) this.IconCompatParcelizer).invoke();
                    return createfromparcel;
                case 14:
                    EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl = (EntrancePictureIconUiModelImpl) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.write;
                    if (i33 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.write = 1;
                        if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, this) != coroutineSingletons15) {
                        }
                        return coroutineSingletons15;
                    }
                    if (i33 != 1) {
                        if (i33 == 2) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Object obj6 = entrancePictureIconUiModelImpl.RemoteActionCompatParcelizer.read();
                    getNativeTypefacePYhJU0U getnativetypefacepyhju0u = obj6 instanceof getNativeTypefacePYhJU0U ? (getNativeTypefacePYhJU0U) obj6 : null;
                    if (getnativetypefacepyhju0u != null) {
                        entrancePictureIconUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(getNativeTypefacePYhJU0U.write(getnativetypefacepyhju0u, 23));
                    }
                    String str6 = ((getNativeTypefacePYhJU0U) obj4).RemoteActionCompatParcelizer;
                    this.write = 2;
                    if (EntrancePictureIconUiModelImpl.access$saveTooltipShownForCurrentDelivery(entrancePictureIconUiModelImpl, str6, this) != coroutineSingletons15) {
                        return createfromparcel;
                    }
                    return coroutineSingletons15;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.write;
                    if (i34 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        getComposePaint getcomposepaint = (getComposePaint) this.IconCompatParcelizer;
                        SignInDataStore$get$$inlined$map$1 signInDataStore$get$$inlined$map$3 = new SignInDataStore$get$$inlined$map$1(new NestLoadingServiceImpl$special$$inlined$map$1(((StateProviderImpl) ((accesstoNestedScrollSource) getcomposepaint.serializer.IconCompatParcelizer)).MediaBrowserCompatMediaItem, 17), getcomposepaint, 18);
                        SwitcherUiModelImpl$1.AnonymousClass1 anonymousClass5 = new SwitcherUiModelImpl$1.AnonymousClass1((DestinationHeaderUiModelImpl) obj4, objArr7 == true ? 1 : 0, 6);
                        this.write = 1;
                        return FlowKt.collectLatest(signInDataStore$get$$inlined$map$3, anonymousClass5, this) == coroutineSingletons16 ? coroutineSingletons16 : createfromparcel;
                    }
                    int i35 = RatingCompat + 97;
                    RemoteActionCompatParcelizer = i35 % Fields.SpotShadowColor;
                    if (i35 % 2 == 0 ? i34 != 1 : i34 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                case 16:
                    DestinationHeaderUiModelImpl destinationHeaderUiModelImpl = (DestinationHeaderUiModelImpl) this.IconCompatParcelizer;
                    getQueryContext getquerycontext2 = destinationHeaderUiModelImpl.RemoteActionCompatParcelizer;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i36 = this.write;
                    if (i36 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        UnifiedPhoneCallerImpl unifiedPhoneCallerImpl = destinationHeaderUiModelImpl.MediaDescriptionCompat;
                        getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations = (getSpanVerticalAligndo9XGgannotations) obj4;
                        getspanverticalaligndo9xggannotations.getClass();
                        getSpanVerticalAligndo9XGg getspanverticalaligndo9xgg = new getSpanVerticalAligndo9XGg(64, getspanverticalaligndo9xggannotations.serializer, getspanverticalaligndo9xggannotations.RatingCompat, getspanverticalaligndo9xggannotations.RemoteActionCompatParcelizer, getspanverticalaligndo9xggannotations.MediaBrowserCompatMediaItem, getspanverticalaligndo9xggannotations.read, getspanverticalaligndo9xggannotations.write);
                        this.write = 1;
                        objM4919callgIAlus = unifiedPhoneCallerImpl.m4919callgIAlus(getspanverticalaligndo9xgg, this);
                        if (objM4919callgIAlus == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i36 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        objM4919callgIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
                    }
                    if (!(objM4919callgIAlus instanceof isItemDismissable)) {
                        getquerycontext2.serializer(AndroidResourceFontLoaderHelper.RemoteActionCompatParcelizer);
                    }
                    Throwable thSerializer = onItemDismiss.serializer(objM4919callgIAlus);
                    if (thSerializer == null) {
                        return createfromparcel;
                    }
                    String message = thSerializer.getMessage();
                    getquerycontext2.serializer(new ActualParagraphXGqx6AY(message != null ? message : ""));
                    return createfromparcel;
                case 17:
                    NavigationButtonUiModelImpl navigationButtonUiModelImpl = (NavigationButtonUiModelImpl) obj4;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i37 = this.write;
                    if (i37 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        setBaselineShift0ocSgnM setbaselineshift0ocsgnm = navigationButtonUiModelImpl.MediaDescriptionCompat.RemoteActionCompatParcelizer.serializer;
                        setbaselineshift0ocsgnm.IconCompatParcelizer.logEvent("navigation_error_ext_clicked", setbaselineshift0ocsgnm.write.write());
                        navigationButtonUiModelImpl.RatingCompat.IconCompatParcelizer.write(new accessgetSimplecp("navigation_error_ext_clicked"));
                        setDrawStyle setdrawstyleRemoteActionCompatParcelizer = navigationButtonUiModelImpl.RemoteActionCompatParcelizer();
                        if (setdrawstyleRemoteActionCompatParcelizer == null) {
                            return createfromparcel;
                        }
                        getquerycontext = navigationButtonUiModelImpl.write;
                        GetNavigationButtonAction getNavigationButtonAction = navigationButtonUiModelImpl.read;
                        this.IconCompatParcelizer = getquerycontext;
                        this.write = 1;
                        obj2 = getNavigationButtonAction.read(setdrawstyleRemoteActionCompatParcelizer, true, this);
                        if (obj2 == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i37 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i38 = RemoteActionCompatParcelizer + 81;
                        RatingCompat = i38 % Fields.SpotShadowColor;
                        if (i38 % 2 == 0) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            (objArr11 == true ? 1 : 0).hashCode();
                            throw null;
                        }
                        getQueryContext getquerycontext3 = (getQueryContext) this.IconCompatParcelizer;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        getquerycontext = getquerycontext3;
                        obj2 = obj;
                    }
                    getquerycontext.serializer(obj2);
                    return createfromparcel;
                case 18:
                    accessgetFalseyp accessgetfalseyp = (accessgetFalseyp) obj4;
                    accessgetGocp accessgetgocp = (accessgetGocp) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i39 = this.write;
                    if (i39 != 0) {
                        if (i39 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (accessgetgocp == null) {
                        accessgetfalseyp.write.RemoteActionCompatParcelizer.write(null);
                        return createfromparcel;
                    }
                    Flow flowRemoteActionCompatParcelizer = accessgetfalseyp.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(accessgetgocp.serializer, accessgetgocp.IconCompatParcelizer);
                    SwitcherUiModelImpl$1.AnonymousClass1 anonymousClass6 = new SwitcherUiModelImpl$1.AnonymousClass1(accessgetfalseyp, objArr8 == true ? 1 : 0, 8);
                    this.IconCompatParcelizer = null;
                    this.write = 1;
                    return FlowKt.collectLatest(flowRemoteActionCompatParcelizer, anonymousClass6, this) == coroutineSingletons19 ? coroutineSingletons19 : createfromparcel;
                case 19:
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i40 = this.write;
                    if (i40 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = (accessisRenderNodeCompatiblecp) this.IconCompatParcelizer;
                        toColorLong8_81llA tocolorlong8_81lla = toColorLong8_81llA.RESUMED;
                        SwitcherUiModelImpl$1 switcherUiModelImpl$1 = new SwitcherUiModelImpl$1(obj4, (ShortNewsContentCardView) (objArr9 == true ? 1 : 0), 9);
                        this.write = 1;
                        return UrlUtils.repeatOnLifecycle(accessisrendernodecompatiblecp, tocolorlong8_81lla, switcherUiModelImpl$1, this) == coroutineSingletons20 ? coroutineSingletons20 : createfromparcel;
                    }
                    int i41 = RemoteActionCompatParcelizer + 23;
                    RatingCompat = i41 % Fields.SpotShadowColor;
                    if (i41 % 2 != 0 ? i40 != 1 : i40 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i42 = this.write;
                    if (i42 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        ObserveDivider$invoke$$inlined$map$1.AnonymousClass2 anonymousClass7 = new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2((FlowCollector) this.IconCompatParcelizer, i8);
                        this.IconCompatParcelizer = null;
                        this.write = 1;
                        return ((NestLoadingServiceImpl$special$$inlined$map$1) obj4).collect(anonymousClass7, this) == coroutineSingletons21 ? coroutineSingletons21 : createfromparcel;
                    }
                    if (i42 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                case 21:
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i43 = this.write;
                    if (i43 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.write = 1;
                        return ((CustomBulletSpan) this.IconCompatParcelizer).RatingCompat.m4919callgIAlus((getSpanVerticalAligndo9XGg) obj4, this) == coroutineSingletons22 ? coroutineSingletons22 : createfromparcel;
                    }
                    if (i43 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((onItemDismiss) obj).getClass();
                    return createfromparcel;
                case 22:
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i44 = this.write;
                    if (i44 != 0) {
                        if (i44 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SendTestPushUseCase sendTestPushUseCase2 = (SendTestPushUseCase) this.IconCompatParcelizer;
                    Flow flowRemoteActionCompatParcelizer2 = FlowKt.RemoteActionCompatParcelizer(new SignInDataStore$get$$inlined$map$1(new SettingsViewModel$special$$inlined$map$1(((accessgetSubscriptcp) sendTestPushUseCase2.serializer).read.IconCompatParcelizer, i4, "trip_planner"), sendTestPushUseCase2, 22), prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
                    SwitcherUiModelImpl$1.AnonymousClass1 anonymousClass8 = new SwitcherUiModelImpl$1.AnonymousClass1((BaselineShiftCompanion) obj4, objArr10 == true ? 1 : 0, 11);
                    this.write = 1;
                    return FlowKt.collectLatest(flowRemoteActionCompatParcelizer2, anonymousClass8, this) == coroutineSingletons23 ? coroutineSingletons23 : createfromparcel;
                case 23:
                    InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) obj4;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i45 = this.write;
                    if (i45 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        FlowKt__LimitKt$take$$inlined$unsafeFlow$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(new SignInDataStore$get$$inlined$map$1(((r8lambdaokZBgNnbR8K2i443J9b9JUwVwk) initializeAppStartupItemsImpl.serializer).serializer, new r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I((String) this.IconCompatParcelizer, true), i5));
                        FlowLiveDataConversions$asLiveData$1$1 flowLiveDataConversions$asLiveData$1$1 = new FlowLiveDataConversions$asLiveData$1$1(27, initializeAppStartupItemsImpl);
                        this.write = 1;
                        return flowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(flowLiveDataConversions$asLiveData$1$1, this) == coroutineSingletons24 ? coroutineSingletons24 : createfromparcel;
                    }
                    int i46 = RemoteActionCompatParcelizer + 7;
                    RatingCompat = i46 % Fields.SpotShadowColor;
                    if (i46 % 2 != 0 ? i45 != 1 : i45 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                case 24:
                    TripInformationUiModelImpl tripInformationUiModelImpl = (TripInformationUiModelImpl) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i47 = this.write;
                    if (i47 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        UnifiedPhoneCallerImpl unifiedPhoneCallerImpl2 = tripInformationUiModelImpl.MediaSessionCompatResultReceiverWrapper;
                        getSpanVerticalAligndo9XGgannotations getspanverticalaligndo9xggannotations2 = (getSpanVerticalAligndo9XGgannotations) obj4;
                        getspanverticalaligndo9xggannotations2.getClass();
                        getSpanVerticalAligndo9XGg getspanverticalaligndo9xgg2 = new getSpanVerticalAligndo9XGg(64, getspanverticalaligndo9xggannotations2.serializer, getspanverticalaligndo9xggannotations2.RatingCompat, getspanverticalaligndo9xggannotations2.RemoteActionCompatParcelizer, getspanverticalaligndo9xggannotations2.MediaBrowserCompatMediaItem, getspanverticalaligndo9xggannotations2.read, getspanverticalaligndo9xggannotations2.write);
                        this.write = 1;
                        Object objM4919callgIAlus2 = unifiedPhoneCallerImpl2.m4919callgIAlus(getspanverticalaligndo9xgg2, this);
                        if (objM4919callgIAlus2 == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                        obj3 = objM4919callgIAlus2;
                    } else {
                        if (i47 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                    }
                    if (!(obj3 instanceof isItemDismissable)) {
                        tripInformationUiModelImpl.IconCompatParcelizer.serializer(getUnderlineannotations.serializer);
                    }
                    Throwable thSerializer2 = onItemDismiss.serializer(obj3);
                    if (thSerializer2 == null) {
                        return createfromparcel;
                    }
                    getQueryContext getquerycontext4 = tripInformationUiModelImpl.IconCompatParcelizer;
                    String message2 = thSerializer2.getMessage();
                    getquerycontext4.serializer(new TextDirection(message2 != null ? message2 : ""));
                    return createfromparcel;
                case 25:
                    getStartEllipsisgIe3tQ8annotations getstartellipsisgie3tq8annotations = (getStartEllipsisgIe3tQ8annotations) obj4;
                    InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i48 = this.write;
                    if (i48 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        boolean z = getstartellipsisgie3tq8annotations.serializer.read() && getstartellipsisgie3tq8annotations.read.RemoteActionCompatParcelizer();
                        this.IconCompatParcelizer = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
                        this.write = 1;
                        if (((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).read.serializer((Object) Boolean.valueOf(z), (ShortNewsContentCardView) this) != coroutineSingletons26) {
                        }
                        return coroutineSingletons26;
                    }
                    if (i48 != 1) {
                        int i49 = RatingCompat + 109;
                        RemoteActionCompatParcelizer = i49 % Fields.SpotShadowColor;
                        int i50 = i49 % 2;
                        if (i48 == 2) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    SyncTask$ConnectivityChangeReceiver syncTask$ConnectivityChangeReceiver = new SyncTask$ConnectivityChangeReceiver(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, i, getstartellipsisgie3tq8annotations);
                    FocusListener.read(getstartellipsisgie3tq8annotations.IconCompatParcelizer, syncTask$ConnectivityChangeReceiver, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), null, 4);
                    DeviceManager$$ExternalSyntheticLambda1 deviceManager$$ExternalSyntheticLambda1 = new DeviceManager$$ExternalSyntheticLambda1(getstartellipsisgie3tq8annotations, i, syncTask$ConnectivityChangeReceiver);
                    this.IconCompatParcelizer = null;
                    this.write = 2;
                    if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, deviceManager$$ExternalSyntheticLambda1, this) != coroutineSingletons26) {
                        return createfromparcel;
                    }
                    return coroutineSingletons26;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i51 = this.write;
                    if (i51 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        this.write = 1;
                        return ((ContactRiderViewModel) this.IconCompatParcelizer).MediaMetadataCompat.m4919callgIAlus((getSpanVerticalAligndo9XGg) obj4, this) == coroutineSingletons27 ? coroutineSingletons27 : createfromparcel;
                    }
                    if (i51 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ((onItemDismiss) obj).getClass();
                    return createfromparcel;
                case 27:
                    r8lambdattOPrCwQAZdC10c20qDtJUliAwE r8lambdattoprcwqazdc10c20qdtjuliawe = (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i52 = this.write;
                    if (i52 != 0) {
                        if (i52 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!r8lambdattoprcwqazdc10c20qdtjuliawe.read && !r8lambdattoprcwqazdc10c20qdtjuliawe.serializer) {
                        return createfromparcel;
                    }
                    this.IconCompatParcelizer = null;
                    this.write = 1;
                    return PickUpDropOffUiModelImpl.access$reloadState((PickUpDropOffUiModelImpl) obj4, this) == coroutineSingletons28 ? coroutineSingletons28 : createfromparcel;
                case 28:
                    r8lambdattOPrCwQAZdC10c20qDtJUliAwE r8lambdattoprcwqazdc10c20qdtjuliawe2 = (r8lambdattOPrCwQAZdC10c20qDtJUliAwE) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i53 = this.write;
                    if (i53 != 0) {
                        if (i53 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    if (!r8lambdattoprcwqazdc10c20qdtjuliawe2.read && !r8lambdattoprcwqazdc10c20qdtjuliawe2.serializer) {
                        return createfromparcel;
                    }
                    this.IconCompatParcelizer = null;
                    this.write = 1;
                    return PickupDropOffSingleDeliveryUiModelImpl.access$reloadState((PickupDropOffSingleDeliveryUiModelImpl) obj4, this) == coroutineSingletons29 ? coroutineSingletons29 : createfromparcel;
                default:
                    AcknowledgementTaskUiModelImpl acknowledgementTaskUiModelImpl = (AcknowledgementTaskUiModelImpl) obj4;
                    CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i54 = this.write;
                    if (i54 != 0) {
                        if (i54 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl = (ObserveTaskByTypeAndIdUseCaseImpl) this.IconCompatParcelizer;
                    fastFilterNotNull fastfilternotnull = acknowledgementTaskUiModelImpl.RemoteActionCompatParcelizer;
                    FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1Write = FlowExtensionsKt.write(observeTaskByTypeAndIdUseCaseImpl.serializer(fastfilternotnull.deliveryId, fastfilternotnull.action, acknowledgementTaskUiModelImpl.MediaSessionCompatQueueItem, displayInAppMessagelambda1.serializer(InfiniteTransitionSearchInfo.class)), acknowledgementTaskUiModelImpl.read, CompositionDataRecordCompanion.IconCompatParcelizer, "AcknowledgementTaskUiModelImpl: Error observing acknowledgement task by type and ID.");
                    FlowLiveDataConversions$asLiveData$1$1 flowLiveDataConversions$asLiveData$1$2 = new FlowLiveDataConversions$asLiveData$1$1(i6, acknowledgementTaskUiModelImpl);
                    this.write = 1;
                    return flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1Write.collect(flowLiveDataConversions$asLiveData$1$2, this) == coroutineSingletons30 ? coroutineSingletons30 : createfromparcel;
            }
        }
    }

    @Override // o.onViewCreated
    public final StateFlow IconCompatParcelizer() {
        StateFlow stateFlow;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem;
        int i3 = i2 + 47;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            stateFlow = this.MediaMetadataCompat;
            int i4 = 13 / 0;
        } else {
            stateFlow = this.MediaMetadataCompat;
        }
        int i5 = i2 + 89;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public DeliveryNotesUiModelImpl(TextInputServiceAndroid_androidKtExternalSyntheticLambda1 textInputServiceAndroid_androidKtExternalSyntheticLambda1, ContextScope contextScope, hasFlag hasflag, Parser.Pair pair, getQueryContext getquerycontext) {
        this.read = hasflag;
        this.RemoteActionCompatParcelizer = pair;
        this.write = getquerycontext;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(asExecutorlambda0.IconCompatParcelizer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaDescriptionCompat = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(Boolean.FALSE);
        this.serializer = mutableStateFlow2;
        this.MediaMetadataCompat = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass1(textInputServiceAndroid_androidKtExternalSyntheticLambda1, this, null, 0), 3);
    }
}
