package com.google.firebase.sessions;

import android.net.Uri;
import android.util.Log;
import androidx.compose.material3.ThumbNode$onAttach$1$1;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SimpleActor$offer$2;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.UriKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.freshchat.DispatcherChatOrderLogger;
import com.foodora.courier.legacy.ui.main.PushTokenUpdateViewModel;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.settings.SessionsSettings;
import com.huawei.location.nlp.scan.FB;
import com.logistics.rider.glovo.R;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appmigration.presentation.AppMigrationUiModelImpl;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptMessageUiModelImpl;
import com.roadrunner.delivery.accept.autoaccept.presentation.DeliveryAutoAcceptUiModelImpl;
import com.roadrunner.delivery.accept.backToBackOrder.presentation.BackToBackAutoAcceptUiModelImpl;
import com.roadrunner.delivery.midshiftverification.MidShiftIdVerificationCoordinator;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation.EntrancePictureIconUiModelImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShowNavigationSettingsTooltipUseCaseImpl;
import com.roadrunner.freelancing.domain.FlowTimeoutExtensionsKt$withInitialTimeout$1;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.freelancing.presentation.WorkNowUiModelImpl;
import com.roadrunner.freelancing.presentation.bonus.WorkNowWithBonusUiModelImpl;
import com.roadrunner.freelancing.presentation.empty.FreelancingAvailabilityUiModelImpl;
import com.roadrunner.freelancing.presentation.infraboost.WorkNowWithInfraBoostUiModelImpl;
import com.roadrunner.freelancing.presentation.map.GetFreelancingMapLayer$invoke$1$1;
import com.roadrunner.freelancing.presentation.map.GetStartNowSubzonesLayer$invoke$1;
import com.roadrunner.freelancing.presentation.outsideactivearea.OutsideActiveAreaUiModelImpl;
import com.roadrunner.freelancing.presentation.tab.WorkOpportunityTypeSelectorUiModelImpl;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.helpcenter.floating.lifecycle.HomeHelpCenterLifecycleObserverImpl;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.opportunities.data.OpportunitiesRepository$get$$inlined$map$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.state.domain.GetRiderStateImpl$invoke$1;
import com.roadrunner.web.presentation.WebViewViewModel$handleWebViewError$1;
import io.grpc.CallOptions$Builder;
import io.grpc.internal.SharedResourcePool;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AdjustDeeplink;
import o.AndroidComposeViewAccessibilityDelegateCompat;
import o.AndroidComposeViewderivedIsAttached2;
import o.AndroidComposeViewlocaleList2;
import o.AndroidComposeViewpointerIconService1;
import o.AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1;
import o.AndroidComposeViewroot11;
import o.AndroidComposeViewsnapshotObserver1command1;
import o.AndroidComposeViewtextInputSession2;
import o.AndroidDialog_androidKtDialogLayout111;
import o.BaselineShiftSaverlambda0;
import o.BottomSheetScaffoldKtStandardBottomSheet3;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.Button;
import o.ButtonColors;
import o.ButtonDefaults;
import o.ButtonKt;
import o.ButtonKtButton21;
import o.CheckboxKt;
import o.ContainsAlllambda0;
import o.EditCommandKt;
import o.EmojiCompatStatusDelegate;
import o.FrameMetricsAggregator;
import o.IndentationFixSpan_androidKtWhenMappings;
import o.NotificationCompatMessagingStyle;
import o.NotificationCompatProgressStyle;
import o.Paint29;
import o.SaversKtColorSaver2;
import o.SaversKtExternalSyntheticLambda2;
import o.ShortNewsContentCardView;
import o.SingleProcessDataStorefile2;
import o.StaticLayoutFactory28;
import o.TextAnnouncementContentCardView;
import o.access400;
import o.accessaddSemanticsPropertiesFrom;
import o.accessgetCurrentSemanticsNodes;
import o.accessgetCurrentlyAccessibilityFocusedANIp;
import o.accessgetGocp;
import o.accessgetInstancedelegatecp;
import o.accessgetParagraphcp;
import o.accessgetPerformMeasureConstraintsp;
import o.accessgetSimplecp;
import o.accessgetStripNonMetricAffectingCharSpansp;
import o.areNotificationsEnabled;
import o.clearAndSetSemantics;
import o.constructCompatStyleForBundle;
import o.constructStyleForExtras;
import o.copy8_81llAdefault;
import o.copyjRlVdoo;
import o.createFromParcel;
import o.createNotificationChannelGroup;
import o.createNotificationChannelGroups;
import o.ddefault;
import o.f6;
import o.f7;
import o.f8;
import o.f9;
import o.g0ExternalSyntheticLambda1;
import o.g0ExternalSyntheticLambda11;
import o.g1;
import o.g2;
import o.g5;
import o.gExternalSyntheticLambda0;
import o.generateActivityResultKey;
import o.generateSemanticsId;
import o.getBoundingRectsFromInsets;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCurrentInterruptionFilter;
import o.getDetachedFromParentLookaheadPlacement;
import o.getExtraData;
import o.getHeadingrAG3T2k;
import o.getHeightPx;
import o.getHuaweiAdsReferrer;
import o.getLengthimpl;
import o.getNotificationChannelGroup;
import o.getNotificationChannelGroupCompat;
import o.getNotificationChannelsCompat;
import o.getQueryParameterslambda2;
import o.getRootStableInsets;
import o.getStrictnessusljTpc;
import o.getTextBounds;
import o.getTextLinkStylesSaver;
import o.getUnspecifiedrAG3T2kannotations;
import o.getWordBreakjp8hJ3c;
import o.hasFontAttributes;
import o.hideCurrentlyDisplayingInAppMessage;
import o.initState;
import o.instance_delegatelambda0;
import o.instantiateProvider;
import o.invoke12SF9DM;
import o.isAdapterPositionOnScreen;
import o.isAdded;
import o.isStaleResolvedFont;
import o.mergedSemanticsConfiguration;
import o.notifyContentCaptureChanges;
import o.onContentCardDismissed;
import o.opticalSizingR2X_6o;
import o.packWithCheck;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda0tFkXN0c4UQsJxVxyejUo1BomY;
import o.r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambda97B6Pg2rSmZnc05L6A5yZDJRg;
import o.r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdajRJFbIqkkFSo0J2N8n3tH4yM;
import o.r8lambdamp9rjJu0uaONMo14IZlDWVI4Ljc;
import o.r8lambdaokZBgNnbR8K2i443J9b9JUwVwk;
import o.r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I;
import o.r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ;
import o.readAndInitOrPropagateAndThrowFailure;
import o.removeNodeAtDepth;
import o.removeRearDisplayPresentationStatusListener;
import o.sc;
import o.se;
import o.semantics;
import o.setBuilder;
import o.setUnregisteredInAppMessage;
import o.shouldDumpInternalState;
import o.transferSessionPackageI;
import o.unregisterInAppMessageManager;
import o.unregisterSaveStateProvider;
import o.updateAdidI;
import o.updatePaint;
import o.v4;
import o.x8;
import okio.Options;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class SharedSessionRepositoryImpl {
    public AndroidComposeViewlocaleList2 IconCompatParcelizer;
    public final AndroidComposeViewderivedIsAttached2 MediaBrowserCompatMediaItem;
    public final performCustomExitMxy_nc0 MediaDescriptionCompat;
    public final SessionsSettings MediaMetadataCompat;
    public final SessionFirelogPublisherImpl MediaSessionCompatQueueItem;
    public final AndroidComposeViewAccessibilityDelegateCompat MediaSessionCompatToken;
    public final AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1 RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public String read;
    public boolean serializer;
    public final TextAnnouncementContentCardView write;

    /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ SharedSessionRepositoryImpl IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ int write;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00161 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
            private static int MediaDescriptionCompat = 0;
            private static int MediaMetadataCompat = 1;
            public /* synthetic */ Object IconCompatParcelizer;
            public final /* synthetic */ int RemoteActionCompatParcelizer;
            public final /* synthetic */ Object read;
            public int serializer;
            public /* synthetic */ Object write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00161(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
                super(3, shortNewsContentCardView);
                this.RemoteActionCompatParcelizer = i;
                this.read = obj;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00161(ShortNewsContentCardView shortNewsContentCardView, Object obj, int i) {
                super(3, shortNewsContentCardView);
                this.RemoteActionCompatParcelizer = i;
                this.read = obj;
            }

            @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
            public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                int i = 2;
                int i2 = 2 % 2;
                int i3 = MediaDescriptionCompat + 83;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    Object obj4 = null;
                    obj4.hashCode();
                    throw null;
                }
                int i4 = this.RemoteActionCompatParcelizer;
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                Object obj5 = this.read;
                int i5 = 0;
                if (i4 == 0) {
                    C00161 c00161 = new C00161((SharedSessionRepositoryImpl) obj5, (ShortNewsContentCardView) obj3, i5);
                    c00161.write = (FlowCollector) obj;
                    c00161.IconCompatParcelizer = (Throwable) obj2;
                    return c00161.invokeSuspend(createfromparcel2);
                }
                int i6 = 1;
                if (i4 == 1) {
                    C00161 c00162 = new C00161((ShortNewsContentCardView) obj3, (EmojiCompatStatusDelegate) obj5, i6);
                    c00162.write = (FlowCollector) obj;
                    c00162.IconCompatParcelizer = obj2;
                    Object objInvokeSuspend = c00162.invokeSuspend(createfromparcel2);
                    int i7 = MediaMetadataCompat + 115;
                    MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        int i8 = 56 / 0;
                    }
                    return objInvokeSuspend;
                }
                if (i4 == 2) {
                    C00161 c00163 = new C00161((WorkerWrapper.Builder) obj5, (ShortNewsContentCardView) obj3, i);
                    c00163.write = (hasFontAttributes) obj;
                    c00163.IconCompatParcelizer = (getStrictnessusljTpc) obj2;
                    return c00163.invokeSuspend(createfromparcel2);
                }
                int i9 = 3;
                if (i4 == 3) {
                    C00161 c00164 = new C00161((ShortNewsContentCardView) obj3, (getRootStableInsets) obj5, i9);
                    c00164.write = (FlowCollector) obj;
                    c00164.IconCompatParcelizer = obj2;
                    return c00164.invokeSuspend(createfromparcel2);
                }
                int i10 = 4;
                if (i4 == 4) {
                    C00161 c00165 = new C00161((ShortNewsContentCardView) obj3, (WorkOpportunityTypeSelectorUiModelImpl) obj5, i10);
                    c00165.write = (FlowCollector) obj;
                    c00165.IconCompatParcelizer = obj2;
                    return c00165.invokeSuspend(createfromparcel2);
                }
                C00161 c00166 = new C00161((CallOptions$Builder) obj5, (ShortNewsContentCardView) obj3, 5);
                c00166.write = (AdjustDeeplink) obj;
                c00166.IconCompatParcelizer = (se) obj2;
                return c00166.invokeSuspend(createfromparcel2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Flow flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
                Flow flowSerializer;
                Flow flowSerializer2;
                int i = 2 % 2;
                int i2 = this.RemoteActionCompatParcelizer;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj2 = this.read;
                int i3 = 1;
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (i2 == 0) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.serializer;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i5 = MediaMetadataCompat + 85;
                        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector = (FlowCollector) this.write;
                    Throwable th = (Throwable) this.IconCompatParcelizer;
                    AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = new AndroidComposeViewlocaleList2(((SharedSessionRepositoryImpl) obj2).RatingCompat.RemoteActionCompatParcelizer(null), null, null);
                    th.getMessage();
                    this.write = null;
                    this.serializer = 1;
                    return flowCollector.emit(androidComposeViewlocaleList2, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i2 == 1) {
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.serializer;
                    if (i7 != 0) {
                        if (i7 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    FlowCollector flowCollector2 = (FlowCollector) this.write;
                    accessgetGocp accessgetgocp = (accessgetGocp) this.IconCompatParcelizer;
                    StateFlow stateFlow = ((EmojiCompatStatusDelegate) obj2).write.read;
                    this.write = null;
                    this.IconCompatParcelizer = null;
                    this.serializer = 1;
                    FlowKt.IconCompatParcelizer(flowCollector2);
                    Object objCollect = stateFlow.collect(new ThumbNode$onAttach$1$1(flowCollector2, 28, accessgetgocp), this);
                    if (objCollect != coroutineSingletons2) {
                        objCollect = createfromparcel;
                    }
                    if (objCollect != coroutineSingletons2) {
                        objCollect = createfromparcel;
                    }
                    return objCollect == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
                }
                if (i2 == 2) {
                    WorkerWrapper.Builder builder = (WorkerWrapper.Builder) obj2;
                    hasFontAttributes hasfontattributes = (hasFontAttributes) this.write;
                    getStrictnessusljTpc getstrictnessusljtpc = (getStrictnessusljTpc) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.serializer;
                    if (i8 != 0) {
                        int i9 = MediaMetadataCompat + 59;
                        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0 ? i8 != 1 : i8 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        if (!((copy8_81llAdefault) builder.read).RemoteActionCompatParcelizer()) {
                            if (!(getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations)) {
                                return null;
                            }
                            ((accessgetParagraphcp) builder.IconCompatParcelizer).IconCompatParcelizer.write(new accessgetSimplecp("external-navigation-set-during-route-preview"));
                            int i10 = MediaMetadataCompat + 51;
                            MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            return null;
                        }
                        this.write = hasfontattributes;
                        this.IconCompatParcelizer = null;
                        this.serializer = 1;
                        obj = WorkerWrapper.Builder.access$isDestinationPreviewAllowed(builder, getstrictnessusljtpc, hasfontattributes, this);
                        if (obj == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return hasfontattributes;
                    }
                    return null;
                }
                int i12 = 3;
                if (i2 == 3) {
                    getRootStableInsets getrootstableinsets = (getRootStableInsets) obj2;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.serializer;
                    if (i13 == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        FlowCollector flowCollector3 = (FlowCollector) this.write;
                        sc scVar = (sc) this.IconCompatParcelizer;
                        int i14 = scVar == null ? -1 : getBoundingRectsFromInsets.IconCompatParcelizer[scVar.ordinal()];
                        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                        if (i14 == -1) {
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new f9(instance_delegatelambda0Var));
                        } else if (i14 != 1) {
                            if (i14 != 2) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            }
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new f9(instance_delegatelambda0Var));
                        } else {
                            WorkerWrapper.Builder builder2 = getrootstableinsets.RemoteActionCompatParcelizer;
                            if (((v4) builder2.MediaMetadataCompat).RemoteActionCompatParcelizer()) {
                                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = ((OpportunitiesRepository) builder2.write).read();
                                getNotificationChannelGroupCompat getnotificationchannelgroupcompat = (getNotificationChannelGroupCompat) builder2.MediaBrowserCompatMediaItem;
                                GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1Serializer = getnotificationchannelgroupcompat.IconCompatParcelizer.serializer();
                                getHuaweiAdsReferrer gethuaweiadsreferrer = getnotificationchannelgroupcompat.write;
                                flowSerializer = FlowKt.serializer(FlowKt.read(flowKt__ZipKt$combine$$inlined$unsafeFlow$1, FlowKt.serializer(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(getMapScope$invoke$$inlined$map$1Serializer, new GetMapScope$invoke$$inlined$map$1(gethuaweiadsreferrer.IconCompatParcelizer.write(), gethuaweiadsreferrer, 13), new getNotificationChannelGroup(getnotificationchannelgroupcompat))), ((getCurrentInterruptionFilter) builder2.IconCompatParcelizer).RemoteActionCompatParcelizer, new GetStartNowSubzonesLayer$invoke$1(builder2, null)));
                            } else {
                                flowSerializer = new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(new f9(instance_delegatelambda0Var));
                            }
                            flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2 = FlowKt.RemoteActionCompatParcelizer(flowSerializer, getrootstableinsets.read.serializer(), getrootstableinsets.MediaSessionCompatQueueItem.IconCompatParcelizer(), getrootstableinsets.IconCompatParcelizer.IconCompatParcelizer(), new GetFreelancingMapLayer$invoke$1$1(getrootstableinsets, shortNewsContentCardView, 0));
                        }
                        this.write = null;
                        this.IconCompatParcelizer = null;
                        this.serializer = 1;
                        return FlowKt.emitAll(flowCollector3, flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2, this) == coroutineSingletons4 ? coroutineSingletons4 : createfromparcel;
                    }
                    if (i13 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i15 = 4;
                if (i2 != 4) {
                    AdjustDeeplink adjustDeeplink = (AdjustDeeplink) this.write;
                    se seVar = (se) this.IconCompatParcelizer;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.serializer;
                    if (i16 != 0) {
                        int i17 = MediaDescriptionCompat + 17;
                        MediaMetadataCompat = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        if (i16 == 1) {
                            ExtrasKt.RemoteActionCompatParcelizer(obj);
                            return obj;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.write = null;
                    this.IconCompatParcelizer = null;
                    this.serializer = 1;
                    Object objAccess$getMapLayer = CallOptions$Builder.access$getMapLayer((CallOptions$Builder) obj2, adjustDeeplink, seVar, this);
                    if (objAccess$getMapLayer != coroutineSingletons5) {
                        return objAccess$getMapLayer;
                    }
                    int i19 = MediaMetadataCompat + 83;
                    MediaDescriptionCompat = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    return coroutineSingletons5;
                }
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.serializer;
                if (i21 != 0) {
                    if (i21 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return createfromparcel;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowCollector flowCollector4 = (FlowCollector) this.write;
                WorkOpportunityTypeSelectorUiModelImpl workOpportunityTypeSelectorUiModelImpl = (WorkOpportunityTypeSelectorUiModelImpl) obj2;
                if (((Boolean) this.IconCompatParcelizer).booleanValue()) {
                    ProtobufEncoder protobufEncoder = workOpportunityTypeSelectorUiModelImpl.serializer;
                    flowSerializer2 = new HeatmapDataStore$get$$inlined$map$1(FlowKt.read(new FlowTimeoutExtensionsKt$withInitialTimeout$1(new WorkSpecDaoKt$dedup$$inlined$map$1(10, new OpportunitiesRepository$get$$inlined$map$1(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((GetWorkNowOpportunity) protobufEncoder.write).IconCompatParcelizer(), ((removeRearDisplayPresentationStatusListener) protobufEncoder.serializer).serializer, new GetRiderStateImpl$invoke$1(i12, i15, shortNewsContentCardView)), i3)), 0L, getNotificationChannelsCompat.read, (ShortNewsContentCardView) null)), protobufEncoder, 25);
                } else {
                    workOpportunityTypeSelectorUiModelImpl.MediaBrowserCompatMediaItem.write.IconCompatParcelizer(null);
                    flowSerializer2 = FlowKt.serializer();
                }
                this.write = null;
                this.IconCompatParcelizer = null;
                this.serializer = 1;
                if (FlowKt.emitAll(flowCollector4, flowSerializer2, this) != coroutineSingletons6) {
                    return createfromparcel;
                }
                int i22 = MediaMetadataCompat + 51;
                MediaDescriptionCompat = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                return coroutineSingletons6;
            }
        }

        /* JADX INFO: renamed from: com.google.firebase.sessions.SharedSessionRepositoryImpl$1$2, reason: invalid class name */
        public final class AnonymousClass2 implements FlowCollector {
            private static int read = 1;
            private static int serializer;
            public final /* synthetic */ Object IconCompatParcelizer;
            public final /* synthetic */ int write;

            public /* synthetic */ AnonymousClass2(int i, Object obj) {
                this.write = i;
                this.IconCompatParcelizer = obj;
            }

            /* JADX WARN: Code duplicated, block: B:80:0x02d7  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List, o.instance_delegatelambda0] */
            /* JADX WARN: Type inference failed for: r6v17 */
            /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList, java.util.Collection] */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
                ZonedDateTime zonedDateTime;
                f9 f9Var;
                int i;
                Options.Companion g0externalsyntheticlambda11;
                f7 f7Var;
                g1 g1Var;
                int i2 = 2 % 2;
                int i3 = this.write;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj2 = this.IconCompatParcelizer;
                int i4 = 23;
                ShortNewsContentCardView shortNewsContentCardView2 = null;
                switch (i3) {
                    case 0:
                        AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = (AndroidComposeViewlocaleList2) obj;
                        SharedSessionRepositoryImpl sharedSessionRepositoryImpl = (SharedSessionRepositoryImpl) obj2;
                        androidComposeViewlocaleList2.getClass();
                        sharedSessionRepositoryImpl.IconCompatParcelizer = androidComposeViewlocaleList2;
                        if (sharedSessionRepositoryImpl.serializer) {
                            sharedSessionRepositoryImpl.serializer = false;
                            sharedSessionRepositoryImpl.write();
                        }
                        Object objAccess$notifySubscribers = SharedSessionRepositoryImpl.access$notifySubscribers(sharedSessionRepositoryImpl, androidComposeViewlocaleList2.sessionDetails.sessionId, AndroidComposeViewroot11.GENERAL, shortNewsContentCardView);
                        return objAccess$notifySubscribers == CoroutineSingletons.COROUTINE_SUSPENDED ? objAccess$notifySubscribers : createfromparcel;
                    case 1:
                        ButtonDefaults buttonDefaults = (ButtonDefaults) obj;
                        SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                        if (buttonDefaults instanceof ButtonKt) {
                            snapshotStateList.add(buttonDefaults);
                        } else if (buttonDefaults instanceof copyjRlVdoo) {
                            snapshotStateList.remove(((copyjRlVdoo) buttonDefaults).serializer());
                        } else if (buttonDefaults instanceof BottomSheetScaffoldKtStandardBottomSheet3) {
                            snapshotStateList.add(buttonDefaults);
                        } else if (buttonDefaults instanceof ButtonColors) {
                            int i5 = read + 41;
                            serializer = i5 % Fields.SpotShadowColor;
                            int i6 = i5 % 2;
                            snapshotStateList.remove(((ButtonColors) buttonDefaults).RemoteActionCompatParcelizer());
                        } else if (buttonDefaults instanceof Button) {
                            snapshotStateList.add(buttonDefaults);
                        } else if (!(!(buttonDefaults instanceof ButtonKtButton21))) {
                            snapshotStateList.remove(((ButtonKtButton21) buttonDefaults).IconCompatParcelizer());
                        } else if (buttonDefaults instanceof CheckboxKt) {
                            snapshotStateList.remove(((CheckboxKt) buttonDefaults).RemoteActionCompatParcelizer());
                        }
                        return createfromparcel;
                    case 2:
                        ((notifyContentCaptureChanges) obj2).setValue(obj);
                        return createfromparcel;
                    case 3:
                        Set set = (Set) obj;
                        DispatcherChatOrderLogger dispatcherChatOrderLogger = (DispatcherChatOrderLogger) obj2;
                        set.getClass();
                        Set setWrite = set;
                        if (setWrite.isEmpty()) {
                            setWrite = RangesKt.write((Object) 0);
                        }
                        onContentCardDismissed.IconCompatParcelizer(setWrite, ",", null, null, null, 62);
                        dispatcherChatOrderLogger.serializer.RemoteActionCompatParcelizer();
                        return createfromparcel;
                    case 4:
                        ((Boolean) obj).getClass();
                        ((PushTokenUpdateViewModel) obj2).RemoteActionCompatParcelizer();
                        return createfromparcel;
                    case 5:
                        accessaddSemanticsPropertiesFrom accessaddsemanticspropertiesfrom = (accessaddSemanticsPropertiesFrom) obj;
                        AppMigrationUiModelImpl appMigrationUiModelImpl = (AppMigrationUiModelImpl) obj2;
                        MutableStateFlow mutableStateFlow = appMigrationUiModelImpl.write;
                        boolean z = mutableStateFlow.read() instanceof clearAndSetSemantics;
                        if (!z || !(accessaddsemanticspropertiesfrom instanceof generateSemanticsId)) {
                            mutableStateFlow.IconCompatParcelizer(accessaddsemanticspropertiesfrom);
                            if (!z && (accessaddsemanticspropertiesfrom instanceof clearAndSetSemantics)) {
                                mergedSemanticsConfiguration mergedsemanticsconfiguration = appMigrationUiModelImpl.RemoteActionCompatParcelizer;
                                semantics semanticsVar = ((clearAndSetSemantics) accessaddsemanticspropertiesfrom).RemoteActionCompatParcelizer;
                                mergedsemanticsconfiguration.getClass();
                                mergedsemanticsconfiguration.serializer.IconCompatParcelizer("garnet_popup_viewed", mergedSemanticsConfiguration.write(semanticsVar));
                            }
                        }
                        return createfromparcel;
                    case 6:
                        Uri uri = (Uri) obj;
                        BaselineShiftSaverlambda0 baselineShiftSaverlambda0 = (BaselineShiftSaverlambda0) obj2;
                        r8lambda0tFkXN0c4UQsJxVxyejUo1BomY r8lambda0tfkxn0c4uqsjxvxyejuo1bomy = baselineShiftSaverlambda0.RemoteActionCompatParcelizer;
                        r8lambda97B6Pg2rSmZnc05L6A5yZDJRg r8lambda97b6pg2rsmznc05l6a5yzdjrg = baselineShiftSaverlambda0.serializer;
                        r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w r8lambda2fbyaooocvqhxqp2nim5pmocd5w = (r8lambda2fbYAoOOcVqhXQP2NIm5pmOCD5w) r8lambda0tfkxn0c4uqsjxvxyejuo1bomy;
                        r8lambda2fbyaooocvqhxqp2nim5pmocd5w.getClass();
                        uri.getClass();
                        r8lambda97b6pg2rsmznc05l6a5yzdjrg.getClass();
                        r8lambda2fbyaooocvqhxqp2nim5pmocd5w.serializer(uri, r8lambda97b6pg2rsmznc05l6a5yzdjrg);
                        return createfromparcel;
                    case 7:
                        List list = (List) obj;
                        DeliveryAutoAcceptMessageUiModelImpl deliveryAutoAcceptMessageUiModelImpl = (DeliveryAutoAcceptMessageUiModelImpl) obj2;
                        if (list.isEmpty()) {
                            return createfromparcel;
                        }
                        r8lambdajRJFbIqkkFSo0J2N8n3tH4yM r8lambdajrjfbiqkkfso0j2n8n3th4ym = deliveryAutoAcceptMessageUiModelImpl.RatingCompat;
                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) r8lambdajrjfbiqkkfso0j2n8n3th4ym.IconCompatParcelizer;
                        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                        if (strSerializer != null) {
                            if (m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_AUTO_ACCEPT_EARNING_DISPLAY_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl)) {
                                int i7 = serializer + 17;
                                read = i7 % Fields.SpotShadowColor;
                                if (i7 % 2 == 0) {
                                    r8lambdajrjfbiqkkfso0j2n8n3th4ym.serializer.IconCompatParcelizer();
                                    throw null;
                                }
                                if (!(!r8lambdajrjfbiqkkfso0j2n8n3th4ym.serializer.IconCompatParcelizer())) {
                                    Object objAccess$getEarningsFromAutoAcceptedOrder = DeliveryAutoAcceptMessageUiModelImpl.access$getEarningsFromAutoAcceptedOrder(deliveryAutoAcceptMessageUiModelImpl, list, shortNewsContentCardView);
                                    return objAccess$getEarningsFromAutoAcceptedOrder == CoroutineSingletons.COROUTINE_SUSPENDED ? objAccess$getEarningsFromAutoAcceptedOrder : createfromparcel;
                                }
                            }
                        }
                        deliveryAutoAcceptMessageUiModelImpl.read.IconCompatParcelizer(new SaversKtExternalSyntheticLambda2(deliveryAutoAcceptMessageUiModelImpl.PlaybackStateCompatCustomAction.IconCompatParcelizer(R.string.auto_accept_success_message), ddefault.RemoteActionCompatParcelizer));
                        int i8 = serializer + 47;
                        read = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        return createfromparcel;
                    case 8:
                        r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4 r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4 = (r8lambdaQsNujTwn7QIro1CV8S_kWMdKpa4) obj;
                        DeliveryAutoAcceptUiModelImpl deliveryAutoAcceptUiModelImpl = (DeliveryAutoAcceptUiModelImpl) obj2;
                        MutableStateFlow mutableStateFlow2 = deliveryAutoAcceptUiModelImpl.IconCompatParcelizer;
                        MutableStateFlow mutableStateFlow3 = deliveryAutoAcceptUiModelImpl.RemoteActionCompatParcelizer;
                        if (r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4 != null) {
                            mutableStateFlow3.IconCompatParcelizer(Boolean.TRUE);
                            mutableStateFlow2.IconCompatParcelizer(new SaversKtColorSaver2(r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.RemoteActionCompatParcelizer, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.read, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.write, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.RatingCompat, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.serializer, r8lambdaqsnujtwn7qiro1cv8s_kwmdkpa4.IconCompatParcelizer));
                            if (deliveryAutoAcceptUiModelImpl.MediaDescriptionCompat.read()) {
                                BuildersKt.RemoteActionCompatParcelizer(deliveryAutoAcceptUiModelImpl.write, null, null, new WebViewViewModel$handleWebViewError$1(deliveryAutoAcceptUiModelImpl, (ShortNewsContentCardView) null, 2), 3);
                            }
                        } else {
                            deliveryAutoAcceptUiModelImpl.ParcelableVolumeInfo.serializer(getTextLinkStylesSaver.RemoteActionCompatParcelizer);
                            mutableStateFlow3.IconCompatParcelizer(Boolean.FALSE);
                            mutableStateFlow2.IconCompatParcelizer(null);
                        }
                        return createfromparcel;
                    case 9:
                        BackToBackAutoAcceptUiModelImpl backToBackAutoAcceptUiModelImpl = (BackToBackAutoAcceptUiModelImpl) obj2;
                        if (!(((ContainsAlllambda0) obj) instanceof r8lambdamp9rjJu0uaONMo14IZlDWVI4Ljc)) {
                            backToBackAutoAcceptUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.FALSE);
                        } else if (backToBackAutoAcceptUiModelImpl.write.read()) {
                            int i10 = serializer + 21;
                            read = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            Object objAccess$autoAcceptDeliveryIfEnabled = BackToBackAutoAcceptUiModelImpl.access$autoAcceptDeliveryIfEnabled(backToBackAutoAcceptUiModelImpl, shortNewsContentCardView);
                            if (objAccess$autoAcceptDeliveryIfEnabled == CoroutineSingletons.COROUTINE_SUSPENDED) {
                                return objAccess$autoAcceptDeliveryIfEnabled;
                            }
                        }
                        int i12 = serializer + 23;
                        read = i12 % Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        return createfromparcel;
                    case 10:
                        getLengthimpl getlengthimpl = (getLengthimpl) obj;
                        packWithCheck packwithcheck = (packWithCheck) obj2;
                        packwithcheck.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!(getlengthimpl == null)));
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = packwithcheck.write;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                        }
                        if (getlengthimpl != null) {
                            int i14 = serializer + 87;
                            read = i14 % Fields.SpotShadowColor;
                            if (i14 % 2 == 0) {
                                zonedDateTime = getlengthimpl.IconCompatParcelizer;
                                int i15 = 35 / 0;
                            } else {
                                zonedDateTime = getlengthimpl.IconCompatParcelizer;
                            }
                        } else {
                            zonedDateTime = null;
                        }
                        if (zonedDateTime != null) {
                            getContentViewGroupParentLayout getcontentviewgroupparentlayout = packwithcheck.serializer;
                            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                            packwithcheck.write = BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new BridgeManager$trackEvent$2(packwithcheck, getlengthimpl, (ShortNewsContentCardView) null, 16), 2);
                        } else {
                            packwithcheck.read.IconCompatParcelizer(null);
                        }
                        return createfromparcel;
                    case 11:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        ((accessgetStripNonMetricAffectingCharSpansp) obj2).write.IconCompatParcelizer(bool);
                        return createfromparcel;
                    case 12:
                        getStrictnessusljTpc getstrictnessusljtpc = (getStrictnessusljTpc) obj;
                        StaticLayoutFactory28 staticLayoutFactory28 = (StaticLayoutFactory28) obj2;
                        if (!(getstrictnessusljtpc instanceof getWordBreakjp8hJ3c) && !(getstrictnessusljtpc instanceof getUnspecifiedrAG3T2kannotations) && (staticLayoutFactory28.ParcelableVolumeInfo.read() instanceof Paint29)) {
                            staticLayoutFactory28.RemoteActionCompatParcelizer(getTextBounds.IconCompatParcelizer);
                        }
                        return createfromparcel;
                    case 13:
                        unregisterSaveStateProvider unregistersavestateprovider = (unregisterSaveStateProvider) obj;
                        x8 x8Var = (x8) obj2;
                        MutableStateFlow mutableStateFlow4 = x8Var.write;
                        ProtobufEncoder protobufEncoder = (ProtobufEncoder) x8Var.RemoteActionCompatParcelizer;
                        g0ExternalSyntheticLambda1 g0externalsyntheticlambda1 = new g0ExternalSyntheticLambda1(g5.ALWAYS);
                        ?? arrayList = instance_delegatelambda0.write;
                        if (unregistersavestateprovider == null) {
                            f9Var = new f9(arrayList);
                        } else {
                            boolean z2 = unregistersavestateprovider.enablePinConnections;
                            List list2 = unregistersavestateprovider.pins;
                            List<AndroidDialog_androidKtDialogLayout111> list3 = list2;
                            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                            for (AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout111 : list3) {
                                ProtobufEncoder protobufEncoder2 = protobufEncoder;
                                f8 f8Var = new f8(androidDialog_androidKtDialogLayout111.IconCompatParcelizer().RemoteActionCompatParcelizer(), androidDialog_androidKtDialogLayout111.IconCompatParcelizer().write());
                                if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) androidDialog_androidKtDialogLayout111.read(), (CharSequence) "v3", false)) {
                                    int i16 = read + 49;
                                    serializer = i16 % Fields.SpotShadowColor;
                                    int i17 = i16 % 2;
                                    int iSerializer = ProtobufEncoder.serializer(androidDialog_androidKtDialogLayout111);
                                    int i18 = androidDialog_androidKtDialogLayout111.write() ? R.color.primary_main : R.color.neutral_80;
                                    int i19 = androidDialog_androidKtDialogLayout111.write() ? R.color.primary_main : R.color.neutral_80;
                                    int i20 = androidDialog_androidKtDialogLayout111.write() ? R.color.primary_main : R.color.neutral_80;
                                    if (androidDialog_androidKtDialogLayout111.RatingCompat() || androidDialog_androidKtDialogLayout111.MediaBrowserCompatMediaItem() || androidDialog_androidKtDialogLayout111.MediaDescriptionCompat()) {
                                        g1Var = g1.CIRCLE;
                                    } else if (!(!androidDialog_androidKtDialogLayout111.RemoteActionCompatParcelizer())) {
                                        g1Var = g1.ROUNDED_SQUARE;
                                    } else {
                                        int i21 = serializer + 91;
                                        read = i21 % Fields.SpotShadowColor;
                                        int i22 = i21 % 2;
                                        if (((Boolean) AndroidDialog_androidKtDialogLayout111.write(getQueryParameterslambda2.serializer(), -1360330102, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 1360330103, new Object[]{androidDialog_androidKtDialogLayout111})).booleanValue()) {
                                            g1Var = g1.ROUNDED_SQUARE;
                                        } else {
                                            g1Var = g1.CIRCLE;
                                        }
                                    }
                                    protobufEncoder = protobufEncoder2;
                                    g0externalsyntheticlambda11 = new g2(iSerializer, i18, i19, i20, 0, g1Var, (f6) protobufEncoder.RemoteActionCompatParcelizer, androidDialog_androidKtDialogLayout111.write(), ((Boolean) AndroidDialog_androidKtDialogLayout111.write(getQueryParameterslambda2.serializer(), 814904739, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -814904739, new Object[]{androidDialog_androidKtDialogLayout111})).booleanValue(), 32);
                                } else {
                                    protobufEncoder = protobufEncoder2;
                                    if (androidDialog_androidKtDialogLayout111.write()) {
                                        int i23 = serializer + 69;
                                        read = i23 % Fields.SpotShadowColor;
                                        int i24 = i23 % 2;
                                        i = R.color.primary_light_01;
                                    } else {
                                        i = R.color.neutral_100;
                                    }
                                    g0externalsyntheticlambda11 = new g0ExternalSyntheticLambda11(ProtobufEncoder.serializer(androidDialog_androidKtDialogLayout111), androidDialog_androidKtDialogLayout111.write() ? R.color.primary_light_01 : R.color.neutral_100, i, (f6) protobufEncoder.RemoteActionCompatParcelizer, androidDialog_androidKtDialogLayout111.write(), ((Boolean) AndroidDialog_androidKtDialogLayout111.write(getQueryParameterslambda2.serializer(), 814904739, getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -814904739, new Object[]{androidDialog_androidKtDialogLayout111})).booleanValue(), 16);
                                }
                                Options.Companion companion = g0externalsyntheticlambda11;
                                if (((FirebaseRemoteConfigImpl) ((transferSessionPackageI) protobufEncoder.write)).MediaMetadataCompat() && z2) {
                                    f7Var = f7.NONE;
                                } else if (androidDialog_androidKtDialogLayout111.RatingCompat() || androidDialog_androidKtDialogLayout111.MediaDescriptionCompat()) {
                                    f7Var = f7.ONE;
                                } else {
                                    f7Var = androidDialog_androidKtDialogLayout111.RemoteActionCompatParcelizer() ? f7.TWO : f7.NONE;
                                }
                                arrayList2.add(new gExternalSyntheticLambda0(f8Var, companion, f7Var, g5.ALWAYS, 81));
                            }
                            InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = (InitializeAppStartupItemsImpl) protobufEncoder.serializer;
                            opticalSizingR2X_6o opticalsizingr2x_6o = (opticalSizingR2X_6o) initializeAppStartupItemsImpl.serializer;
                            if (((FirebaseRemoteConfigImpl) ((transferSessionPackageI) initializeAppStartupItemsImpl.IconCompatParcelizer)).MediaMetadataCompat()) {
                                if (!z2) {
                                    int i25 = read + 49;
                                    serializer = i25 % Fields.SpotShadowColor;
                                    if (i25 % 2 != 0) {
                                        throw null;
                                    }
                                } else if (!list2.isEmpty()) {
                                    List listSerializer = onContentCardDismissed.serializer(list3, new FB(22));
                                    arrayList = new ArrayList();
                                    AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout112 = (AndroidDialog_androidKtDialogLayout111) onContentCardDismissed.read(listSerializer);
                                    arrayList.addAll(opticalsizingr2x_6o.write(new f8(androidDialog_androidKtDialogLayout112.IconCompatParcelizer().RemoteActionCompatParcelizer(), androidDialog_androidKtDialogLayout112.IconCompatParcelizer().write()), g5.ALWAYS, ColorKt.m776toArgb8_81llA(opticalsizingr2x_6o.IconCompatParcelizer.IconCompatParcelizer().setOnMenuItemClickListener())));
                                    int size = listSerializer.size();
                                    int i26 = 0;
                                    while (i26 < size - 1) {
                                        AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout113 = (AndroidDialog_androidKtDialogLayout111) listSerializer.get(i26);
                                        i26++;
                                        AndroidDialog_androidKtDialogLayout111 androidDialog_androidKtDialogLayout114 = (AndroidDialog_androidKtDialogLayout111) listSerializer.get(i26);
                                        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) opticalSizingR2X_6o.serializer(opticalsizingr2x_6o, new f8(androidDialog_androidKtDialogLayout113.IconCompatParcelizer().RemoteActionCompatParcelizer(), androidDialog_androidKtDialogLayout113.IconCompatParcelizer().write()), new f8(androidDialog_androidKtDialogLayout114.IconCompatParcelizer().RemoteActionCompatParcelizer(), androidDialog_androidKtDialogLayout114.IconCompatParcelizer().write()), g5.ALWAYS, 0, null, 24), (Collection) arrayList);
                                        listSerializer = listSerializer;
                                    }
                                }
                            }
                            f9Var = new f9(onContentCardDismissed.IconCompatParcelizer((Iterable) arrayList, onContentCardDismissed.RemoteActionCompatParcelizer((Collection) arrayList2, (Object) g0externalsyntheticlambda1)));
                        }
                        mutableStateFlow4.IconCompatParcelizer(f9Var);
                        return createfromparcel;
                    case 14:
                        IndentationFixSpan_androidKtWhenMappings indentationFixSpan_androidKtWhenMappings = (IndentationFixSpan_androidKtWhenMappings) obj;
                        getHeightPx getheightpx = (getHeightPx) obj2;
                        getheightpx.serializer.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{indentationFixSpan_androidKtWhenMappings, updatePaint.IconCompatParcelizer}, getCieXyz.write())).booleanValue()));
                        getheightpx.write.IconCompatParcelizer(indentationFixSpan_androidKtWhenMappings);
                        return createfromparcel;
                    case 15:
                        return emit(((Boolean) obj).booleanValue(), shortNewsContentCardView);
                    case 16:
                        float fFloatValue = ((Number) obj).floatValue();
                        MutableStateFlow mutableStateFlow5 = ((EntrancePictureIconUiModelImpl) obj2).read;
                        float fMax = Math.max(0.0f, fFloatValue);
                        mutableStateFlow5.IconCompatParcelizer(new Float(fMax <= 0.4f ? 1.0f + (RangesKt.write((0.4f - fMax) / 0.4f, 0.0f, 1.0f) * 0.29999995f) : 1.0f));
                        return createfromparcel;
                    case 17:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        MainActivity mainActivity = ((isStaleResolvedFont) obj2).serializer;
                        if (zBooleanValue) {
                            mainActivity.getWindow().addFlags(Fields.SpotShadowColor);
                        } else {
                            mainActivity.getWindow().clearFlags(Fields.SpotShadowColor);
                        }
                        return createfromparcel;
                    case 18:
                        ((getHeadingrAG3T2k) obj2).read.emit((getStrictnessusljTpc) obj, shortNewsContentCardView);
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        return createfromparcel;
                    case 19:
                        ShowNavigationSettingsTooltipUseCaseImpl showNavigationSettingsTooltipUseCaseImpl = (ShowNavigationSettingsTooltipUseCaseImpl) obj2;
                        r8lambdaokZBgNnbR8K2i443J9b9JUwVwk r8lambdaokzbgnnbr8k2i443j9b9juwvwk = showNavigationSettingsTooltipUseCaseImpl.read;
                        isAdapterPositionOnScreen isadapterpositiononscreen = showNavigationSettingsTooltipUseCaseImpl.RatingCompat;
                        r8lambdaokzbgnnbr8k2i443j9b9juwvwk.read.IconCompatParcelizer(new r8lambdapuqoe0VC36y8sBKTs_UMSEkf62I((String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), false));
                        Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(DeviceOrientationRequest.OUTPUT_PERIOD_FAST, new DeliveryNotesUiModelImpl.AnonymousClass1((String) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), showNavigationSettingsTooltipUseCaseImpl.IconCompatParcelizer, shortNewsContentCardView2, i4), shortNewsContentCardView);
                        return objWithTimeoutOrNull == CoroutineSingletons.COROUTINE_SUSPENDED ? objWithTimeoutOrNull : createfromparcel;
                    case 20:
                        constructStyleForExtras constructstyleforextras = (constructStyleForExtras) obj;
                        WorkNowUiModelImpl workNowUiModelImpl = (WorkNowUiModelImpl) obj2;
                        workNowUiModelImpl.write.IconCompatParcelizer(Boolean.valueOf(constructstyleforextras instanceof constructCompatStyleForBundle));
                        workNowUiModelImpl.read.IconCompatParcelizer(constructstyleforextras);
                        return createfromparcel;
                    case 21:
                        instantiateProvider instantiateprovider = (instantiateProvider) obj;
                        WorkNowWithBonusUiModelImpl workNowWithBonusUiModelImpl = (WorkNowWithBonusUiModelImpl) obj2;
                        workNowWithBonusUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{instantiateprovider, FrameMetricsAggregator.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()));
                        workNowWithBonusUiModelImpl.write.IconCompatParcelizer(instantiateprovider);
                        return createfromparcel;
                    case 22:
                        getExtraData getextradata = (getExtraData) obj;
                        FreelancingAvailabilityUiModelImpl freelancingAvailabilityUiModelImpl = (FreelancingAvailabilityUiModelImpl) obj2;
                        freelancingAvailabilityUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(getextradata);
                        freelancingAvailabilityUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(!(getextradata instanceof shouldDumpInternalState)));
                        return createfromparcel;
                    case 23:
                        NotificationCompatMessagingStyle notificationCompatMessagingStyle = (NotificationCompatMessagingStyle) obj;
                        WorkNowWithInfraBoostUiModelImpl workNowWithInfraBoostUiModelImpl = (WorkNowWithInfraBoostUiModelImpl) obj2;
                        workNowWithInfraBoostUiModelImpl.read.IconCompatParcelizer(Boolean.valueOf(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{notificationCompatMessagingStyle, NotificationCompatProgressStyle.IconCompatParcelizer}, getCieXyz.write())).booleanValue()));
                        workNowWithInfraBoostUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(notificationCompatMessagingStyle);
                        return createfromparcel;
                    case 24:
                        setBuilder setbuilder = (setBuilder) obj;
                        OutsideActiveAreaUiModelImpl outsideActiveAreaUiModelImpl = (OutsideActiveAreaUiModelImpl) obj2;
                        outsideActiveAreaUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(setbuilder);
                        outsideActiveAreaUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!(setbuilder instanceof areNotificationsEnabled)));
                        return createfromparcel;
                    case 25:
                        createNotificationChannelGroups createnotificationchannelgroups = (createNotificationChannelGroups) obj;
                        WorkOpportunityTypeSelectorUiModelImpl workOpportunityTypeSelectorUiModelImpl = (WorkOpportunityTypeSelectorUiModelImpl) obj2;
                        workOpportunityTypeSelectorUiModelImpl.write.IconCompatParcelizer(createnotificationchannelgroups);
                        workOpportunityTypeSelectorUiModelImpl.RemoteActionCompatParcelizer.IconCompatParcelizer(Boolean.valueOf(!(createnotificationchannelgroups instanceof createNotificationChannelGroup)));
                        return createfromparcel;
                    case 26:
                        ((readAndInitOrPropagateAndThrowFailure) obj2).RemoteActionCompatParcelizer.IconCompatParcelizer((f9) obj);
                        return createfromparcel;
                    case 27:
                        ((generateActivityResultKey) obj2).serializer.IconCompatParcelizer(new SingleProcessDataStorefile2(((Number) obj).intValue()));
                        return createfromparcel;
                    case 28:
                        MainActivity.IconCompatParcelizer((MainActivity) ((HomeHelpCenterLifecycleObserverImpl) obj2).read.serializer);
                        return createfromparcel;
                    default:
                        SharedResourcePool sharedResourcePool = ((HomeViewModel) obj2).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        int i27 = isAdded.serializer[((access400) obj).ordinal()];
                        if (i27 == 1) {
                            sharedResourcePool.serializer(new initState(true));
                            return createfromparcel;
                        }
                        if (i27 == 2) {
                            sharedResourcePool.serializer(new initState(false));
                            return createfromparcel;
                        }
                        if (i27 == 3) {
                            return createfromparcel;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                }
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002a  */
            public Object emit(boolean z, ShortNewsContentCardView shortNewsContentCardView) {
                EditCommandKt editCommandKt;
                int i = 2 % 2;
                Object obj = null;
                if (shortNewsContentCardView instanceof EditCommandKt) {
                    int i2 = read + 41;
                    serializer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        int i3 = ((EditCommandKt) shortNewsContentCardView).read;
                        obj.hashCode();
                        throw null;
                    }
                    editCommandKt = (EditCommandKt) shortNewsContentCardView;
                    int i4 = editCommandKt.read;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        editCommandKt.read = i4 - Integer.MIN_VALUE;
                    } else {
                        editCommandKt = new EditCommandKt(this, shortNewsContentCardView);
                    }
                } else {
                    editCommandKt = new EditCommandKt(this, shortNewsContentCardView);
                }
                Object obj2 = editCommandKt.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = editCommandKt.read;
                try {
                    if (i5 != 0) {
                        int i6 = serializer + 91;
                        read = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj2);
                        MidShiftIdVerificationCoordinator midShiftIdVerificationCoordinator = (MidShiftIdVerificationCoordinator) this.IconCompatParcelizer;
                        editCommandKt.read = 1;
                        if (MidShiftIdVerificationCoordinator.access$navigateIfSelfieRequired(midShiftIdVerificationCoordinator, editCommandKt) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Mid-shift verification failed for one dropoff event", new Object[0]);
                }
                return createFromParcel.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.write = i;
            this.IconCompatParcelizer = sharedSessionRepositoryImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.write;
            SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.IconCompatParcelizer;
            return i != 0 ? new AnonymousClass1(sharedSessionRepositoryImpl, shortNewsContentCardView, 1) : new AnonymousClass1(sharedSessionRepositoryImpl, shortNewsContentCardView, 0);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.write;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            return i != 0 ? ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.write;
            Object obj2 = createFromParcel.INSTANCE;
            SharedSessionRepositoryImpl sharedSessionRepositoryImpl = this.IconCompatParcelizer;
            int i2 = 0;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (i == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.RemoteActionCompatParcelizer;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj2;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(sharedSessionRepositoryImpl.MediaDescriptionCompat.serializer(), new C00161(sharedSessionRepositoryImpl, shortNewsContentCardView, i2));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(i2, sharedSessionRepositoryImpl);
                this.RemoteActionCompatParcelizer = 1;
                return flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(anonymousClass2, this) == coroutineSingletons ? coroutineSingletons : obj2;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.RemoteActionCompatParcelizer;
            try {
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    performCustomExitMxy_nc0 performcustomexitmxy_nc0 = sharedSessionRepositoryImpl.MediaDescriptionCompat;
                    SharedSessionRepositoryImpl$appBackground$1$1 sharedSessionRepositoryImpl$appBackground$1$1 = new SharedSessionRepositoryImpl$appBackground$1$1(sharedSessionRepositoryImpl, shortNewsContentCardView, i2);
                    this.RemoteActionCompatParcelizer = 1;
                    if (performcustomexitmxy_nc0.updateData(sharedSessionRepositoryImpl$appBackground$1$1, this) == coroutineSingletons2) {
                        obj2 = coroutineSingletons2;
                    }
                } else {
                    if (i4 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                return obj2;
            } catch (Exception e) {
                e.getMessage();
                AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = sharedSessionRepositoryImpl.IconCompatParcelizer;
                if (androidComposeViewlocaleList2 == null) {
                    removeNodeAtDepth.serializer("localSessionData");
                    throw null;
                }
                sharedSessionRepositoryImpl.MediaSessionCompatToken.getClass();
                sharedSessionRepositoryImpl.IconCompatParcelizer = AndroidComposeViewlocaleList2.write(androidComposeViewlocaleList2, null, AndroidComposeViewAccessibilityDelegateCompat.RemoteActionCompatParcelizer(), null, 5);
                return obj2;
            }
        }
    }

    public final void read() {
        this.RemoteActionCompatParcelizer = false;
        if (this.IconCompatParcelizer == null) {
            return;
        }
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(this.write), null, null, new AnonymousClass1(this, null, 1), 3);
    }

    public final void write() {
        this.RemoteActionCompatParcelizer = true;
        AndroidComposeViewlocaleList2 androidComposeViewlocaleList2 = this.IconCompatParcelizer;
        if (androidComposeViewlocaleList2 == null) {
            this.serializer = true;
            return;
        }
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (androidComposeViewlocaleList2 == null) {
            removeNodeAtDepth.serializer("localSessionData");
            throw null;
        }
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
        if (write(androidComposeViewlocaleList2) || serializer(androidComposeViewlocaleList2)) {
            BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(this.write), null, null, new SimpleActor$offer$2(this, androidComposeViewlocaleList2, shortNewsContentCardView, 22), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    public final boolean write(AndroidComposeViewlocaleList2 androidComposeViewlocaleList2) {
        BrazeInAppMessageManagerExternalSyntheticLambda2 brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer;
        long jRemoteActionCompatParcelizer;
        r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzq = androidComposeViewlocaleList2.backgroundTime;
        AndroidComposeViewpointerIconService1 androidComposeViewpointerIconService1 = androidComposeViewlocaleList2.sessionDetails;
        if (r8lambdaqacahjelyunmmyjvdipcgfmxzq == null) {
            String str = androidComposeViewpointerIconService1.sessionId;
            return false;
        }
        this.MediaSessionCompatToken.getClass();
        r8lambdaqAcahJELYuNmmyjvdiPCGfmxzQ r8lambdaqacahjelyunmmyjvdipcgfmxzqRemoteActionCompatParcelizer = AndroidComposeViewAccessibilityDelegateCompat.RemoteActionCompatParcelizer();
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        long jIconCompatParcelizer = UriKt.IconCompatParcelizer(r8lambdaqacahjelyunmmyjvdipcgfmxzqRemoteActionCompatParcelizer.ms - r8lambdaqacahjelyunmmyjvdipcgfmxzq.ms, setUnregisteredInAppMessage.MILLISECONDS);
        SessionsSettings sessionsSettings = this.MediaMetadataCompat;
        BrazeInAppMessageManagerExternalSyntheticLambda2 brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer2 = sessionsSettings.serializer.RemoteActionCompatParcelizer();
        if (brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer2 != null) {
            jRemoteActionCompatParcelizer = brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer2.IconCompatParcelizer;
            if (jRemoteActionCompatParcelizer <= 0 || BrazeInAppMessageManagerExternalSyntheticLambda2.read(jRemoteActionCompatParcelizer)) {
                brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer = sessionsSettings.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                if (brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer != null) {
                    jRemoteActionCompatParcelizer = brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer.IconCompatParcelizer;
                    if (jRemoteActionCompatParcelizer > 0 || BrazeInAppMessageManagerExternalSyntheticLambda2.read(jRemoteActionCompatParcelizer)) {
                        jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(30, setUnregisteredInAppMessage.MINUTES);
                    }
                } else {
                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(30, setUnregisteredInAppMessage.MINUTES);
                }
            }
        } else {
            brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer = sessionsSettings.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            if (brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer != null) {
                jRemoteActionCompatParcelizer = brazeInAppMessageManagerExternalSyntheticLambda2RemoteActionCompatParcelizer.IconCompatParcelizer;
                if (jRemoteActionCompatParcelizer > 0) {
                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(30, setUnregisteredInAppMessage.MINUTES);
                } else {
                    jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(30, setUnregisteredInAppMessage.MINUTES);
                }
            } else {
                jRemoteActionCompatParcelizer = UriKt.RemoteActionCompatParcelizer(30, setUnregisteredInAppMessage.MINUTES);
            }
        }
        boolean z = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(jIconCompatParcelizer, jRemoteActionCompatParcelizer) > 0;
        if (z) {
            String str2 = androidComposeViewpointerIconService1.sessionId;
        }
        return z;
    }

    public SharedSessionRepositoryImpl(SessionsSettings sessionsSettings, AndroidComposeViewrequestFocusViewFocusFixfocusSearchResult1 androidComposeViewrequestFocusViewFocusFixfocusSearchResult1, SessionFirelogPublisherImpl sessionFirelogPublisherImpl, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, performCustomExitMxy_nc0 performcustomexitmxy_nc0, AndroidComposeViewderivedIsAttached2 androidComposeViewderivedIsAttached2, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        sessionsSettings.getClass();
        androidComposeViewrequestFocusViewFocusFixfocusSearchResult1.getClass();
        sessionFirelogPublisherImpl.getClass();
        androidComposeViewAccessibilityDelegateCompat.getClass();
        performcustomexitmxy_nc0.getClass();
        androidComposeViewderivedIsAttached2.getClass();
        textAnnouncementContentCardView.getClass();
        this.MediaMetadataCompat = sessionsSettings;
        this.RatingCompat = androidComposeViewrequestFocusViewFocusFixfocusSearchResult1;
        this.MediaSessionCompatQueueItem = sessionFirelogPublisherImpl;
        this.MediaSessionCompatToken = androidComposeViewAccessibilityDelegateCompat;
        this.MediaDescriptionCompat = performcustomexitmxy_nc0;
        this.MediaBrowserCompatMediaItem = androidComposeViewderivedIsAttached2;
        this.write = textAnnouncementContentCardView;
        AndroidComposeViewroot11 androidComposeViewroot11 = AndroidComposeViewroot11.GENERAL;
        this.read = "";
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView), null, null, new AnonymousClass1(this, null, 0), 3);
    }

    public final boolean serializer(AndroidComposeViewlocaleList2 androidComposeViewlocaleList2) {
        Map map = androidComposeViewlocaleList2.processDataMap;
        AndroidComposeViewderivedIsAttached2 androidComposeViewderivedIsAttached2 = this.MediaBrowserCompatMediaItem;
        boolean z = true;
        if (map == null) {
            androidComposeViewderivedIsAttached2.IconCompatParcelizer();
            return true;
        }
        androidComposeViewderivedIsAttached2.getClass();
        invoke12SF9DM invoke12sf9dm = (invoke12SF9DM) map.get(androidComposeViewderivedIsAttached2.IconCompatParcelizer());
        if (invoke12sf9dm != null && invoke12sf9dm.pid == androidComposeViewderivedIsAttached2.serializer) {
            Object[] objArr = {invoke12sf9dm.uuid, (String) androidComposeViewderivedIsAttached2.MediaSessionCompatQueueItem.MediaSessionCompatResultReceiverWrapper()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                z = false;
            }
        }
        if (z) {
            androidComposeViewderivedIsAttached2.IconCompatParcelizer();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$notifySubscribers(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, String str, AndroidComposeViewroot11 androidComposeViewroot11, ShortNewsContentCardView shortNewsContentCardView) {
        AndroidComposeViewsnapshotObserver1command1 androidComposeViewsnapshotObserver1command1;
        if (shortNewsContentCardView instanceof AndroidComposeViewsnapshotObserver1command1) {
            androidComposeViewsnapshotObserver1command1 = (AndroidComposeViewsnapshotObserver1command1) shortNewsContentCardView;
            int i = androidComposeViewsnapshotObserver1command1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidComposeViewsnapshotObserver1command1.serializer = i - Integer.MIN_VALUE;
            } else {
                androidComposeViewsnapshotObserver1command1 = new AndroidComposeViewsnapshotObserver1command1(sharedSessionRepositoryImpl, shortNewsContentCardView);
            }
        } else {
            androidComposeViewsnapshotObserver1command1 = new AndroidComposeViewsnapshotObserver1command1(sharedSessionRepositoryImpl, shortNewsContentCardView);
        }
        Object registeredSubscribers$com_google_firebase_firebase_sessions = androidComposeViewsnapshotObserver1command1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidComposeViewsnapshotObserver1command1.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(registeredSubscribers$com_google_firebase_firebase_sessions);
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{sharedSessionRepositoryImpl.read, str}, getCieXyz.write())).booleanValue()) {
                return createFromParcel.INSTANCE;
            }
            sharedSessionRepositoryImpl.read = str;
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.read;
            androidComposeViewsnapshotObserver1command1.read = str;
            androidComposeViewsnapshotObserver1command1.IconCompatParcelizer = androidComposeViewroot11;
            androidComposeViewsnapshotObserver1command1.serializer = 1;
            registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(androidComposeViewsnapshotObserver1command1);
            if (registeredSubscribers$com_google_firebase_firebase_sessions == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            androidComposeViewroot11 = androidComposeViewsnapshotObserver1command1.IconCompatParcelizer;
            str = androidComposeViewsnapshotObserver1command1.read;
            ExtrasKt.RemoteActionCompatParcelizer(registeredSubscribers$com_google_firebase_firebase_sessions);
        }
        for (getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement : ((Map) registeredSubscribers$com_google_firebase_firebase_sessions).values()) {
            accessgetCurrentSemanticsNodes accessgetcurrentsemanticsnodes = new accessgetCurrentSemanticsNodes(str);
            getdetachedfromparentlookaheadplacement.getClass();
            Objects.toString(accessgetcurrentsemanticsnodes);
            Log.isLoggable("FirebaseCrashlytics", 3);
            accessgetPerformMeasureConstraintsp accessgetperformmeasureconstraintsp = getdetachedfromparentlookaheadplacement.RemoteActionCompatParcelizer;
            synchronized (accessgetperformmeasureconstraintsp) {
                if (!Objects.equals(accessgetperformmeasureconstraintsp.serializer, str)) {
                    accessgetPerformMeasureConstraintsp.IconCompatParcelizer(accessgetperformmeasureconstraintsp.IconCompatParcelizer, accessgetperformmeasureconstraintsp.RemoteActionCompatParcelizer, str);
                    accessgetperformmeasureconstraintsp.serializer = str;
                }
            }
            int i3 = AndroidComposeViewtextInputSession2.serializer[androidComposeViewroot11.ordinal()];
            if (i3 == 1) {
                Objects.toString(accessgetCurrentlyAccessibilityFocusedANIp.CRASHLYTICS);
            } else {
                if (i3 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                Objects.toString(accessgetCurrentlyAccessibilityFocusedANIp.CRASHLYTICS);
            }
        }
        return createFromParcel.INSTANCE;
    }
}
