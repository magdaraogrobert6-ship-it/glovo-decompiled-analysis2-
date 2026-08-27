package androidx.camera.camera2.interop;

import android.app.Application;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.view.View;
import androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$3;
import androidx.camera.view.PendingValue;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.navigation.NavArgsLazy;
import androidx.recyclerview.widget.ChildHelper;
import androidx.sqlite.SQLite;
import androidx.work.RxWorker;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.braze.Braze$$ExternalSyntheticLambda9;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.security.ProviderInstaller;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import com.google.developers.mobile.targeting.proto.ClientSignalsProto$ClientSignals;
import com.google.firebase.FirebaseApp;
import com.google.firebase.firestore.local.LocalDocumentsView;
import com.google.firebase.firestore.local.SQLiteTargetCache;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.inappmessaging.internal.AnalyticsEventsManager;
import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.google.firebase.inappmessaging.internal.ImpressionStorageClient;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager$$ExternalSyntheticLambda4;
import com.google.firebase.inappmessaging.internal.MetricsLoggerClient;
import com.google.firebase.inappmessaging.internal.RateLimitProto$Counter;
import com.google.firebase.inappmessaging.internal.RateLimitProto$RateLimit;
import com.google.firebase.inappmessaging.internal.RateLimiterClient;
import com.google.firebase.inappmessaging.internal.RateLimiterClient$$ExternalSyntheticLambda0;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpressionList;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.ClientAppInfo;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsResponse;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.gwi.config.CarGwiSoFileConstant;
import com.huawei.wisesecurity.ucs_credential.x;
import com.sentiance.core.model.events.I$b;
import io.grpc.CallOptions$Builder;
import io.grpc.stub.ClientCalls;
import io.reactivex.Maybe;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.completable.CompletableFromCallable;
import io.reactivex.internal.operators.maybe.MaybeEmpty;
import io.reactivex.internal.operators.maybe.MaybeFilter;
import io.reactivex.internal.operators.maybe.MaybeFilterSingle;
import io.reactivex.internal.operators.maybe.MaybeIsEmptySingle;
import io.reactivex.internal.operators.maybe.MaybeMap;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext;
import io.reactivex.internal.operators.maybe.MaybePeek;
import io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty;
import io.reactivex.internal.operators.single.SingleDoOnSuccess;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleResumeNext;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.schedulers.Schedulers;
import io.sentry.SentryClient;
import io.sentry.SentryEnvelopeItem$$ExternalSyntheticLambda3;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.io.TextStreamsKt;
import o.AndroidPlatformTextInputSessionstartInputMethod311;
import o.AndroidTextToolbartextActionModeCallback1;
import o.AuthPromptFailureException;
import o.Camera2CameraFactory;
import o.Camera2CameraImpl;
import o.CombinedClickableNodehandleDownEvent2;
import o.Crossfade;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DpTouchBoundsExpansiona9UjIt4;
import o.DpTouchBoundsExpansiona9UjIt4default;
import o.DrawModifierNodeKt;
import o.EncoderImplMediaCodecCallback;
import o.FocusOwnerImplmoveFocusfocusSearchSuccess1;
import o.FocusPropertiesImpl;
import o.FocusRequesterModifierKt;
import o.ImageCaptureWashedOutImageQuirk;
import o.ImageResources_androidKt;
import o.InvalidConfigException;
import o.JsonUtilsa;
import o.LruCache;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorKt;
import o.NodeCoordinatorupdateLayerParameters1;
import o.OnGloballyPositionedModifierDefaultImpls;
import o.OuterPlacementScope;
import o.OwnerSnapshotObserveronCommitAffectingMeasure1;
import o.ParentDataModifierNode;
import o.PreviewView1ExternalSyntheticLambda2;
import o.RemoteActionCompatParcelizer;
import o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import o.TouchBoundsExpansionKt;
import o.TraversableNode;
import o.UnplacedAwareModifierNode;
import o.VideoQualityQuirk;
import o.WeakReference;
import o.accessgetMaindelegatecp;
import o.accessgetSizeNHjbRcjd;
import o.accessgetToRunOnFramep;
import o.accesssetActionModep;
import o.accesssetLastLayerDrawingWasSkippedp;
import o.accessswap;
import o.animateElevationrAjV9yQ;
import o.cacheIfAlive;
import o.constructObjectQuietlydefault;
import o.createFromParcel;
import o.fromId;
import o.getClipMetadata;
import o.getCollapseContentDescription;
import o.getContextClick5zf0vsI;
import o.getDefaultImageFormat;
import o.getDifferencertfAjoo;
import o.getDisposeViewCompositionStrategyannotations;
import o.getHandlerui;
import o.getHasComposition;
import o.getLastLayerDrawingWasSkippedui;
import o.getLastMeasurementConstraintsmsEJaDkui;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getRectManager;
import o.getSemanticsSource;
import o.getSensorToViewTransform;
import o.getSurfaceClass;
import o.getWrappedui;
import o.headH91voCI;
import o.internalOnMeasureui;
import o.mergeJsonObjectslambda10;
import o.monthFromInt;
import o.nativeGetYUVImageVUOff;
import o.obtainShadowContext;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onEndApplyChanges;
import o.onLayoutChange;
import o.onPostAttach;
import o.onRequestMeasure;
import o.onShowTranslationui;
import o.orH91voCI;
import o.parseGender;
import o.parseJsonObjectIntoBundlelambda0;
import o.parseStringArrayFromJsonString;
import o.r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.reuse;
import o.setBaselineAligned;
import o.setCardBackgroundColor;
import o.setContentDrawScopeui;
import o.setCustomUserAttributeJSON;
import o.setInflatedId;
import o.setMinimumHeight;
import o.setPushNotificationSubscriptionTypelambda1;
import o.setRectOutlinetz77jQwdefault;
import o.setShadowElevation;
import o.setWasLayerBlockInvokedui;
import o.shareWithSiblings;
import o.snapTo;
import o.traverseChildren;
import o.updateLayerParameters;
import o.updateParentData;
import o.visitNodes;
import o.wouldPushPermissionPromptDisplaylambda2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 implements StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, getSurfaceClass, obtainShadowContext, Camera2CameraImpl, getHandlerui, FocusPropertiesImpl, Action, onRequestMeasure, onLayoutChange, OuterPlacementScope, Function {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x02e6  */
    @Override // o.onLayoutChange, io.reactivex.functions.Function
    public Object apply(Object obj) throws Throwable {
        String str;
        int i = this.IconCompatParcelizer;
        boolean z = true;
        int i2 = 1;
        z = true;
        int i3 = 0;
        if (i == 19) {
            accesssetLastLayerDrawingWasSkippedp accesssetlastlayerdrawingwasskippedp = (accesssetLastLayerDrawingWasSkippedp) this.write;
            Set set = (Set) this.RemoteActionCompatParcelizer;
            NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = (NodeCoordinatorCompanionPointerInputSource1) obj;
            if (!accesssetlastlayerdrawingwasskippedp.write(nodeCoordinatorCompanionPointerInputSource1) && !set.contains(nodeCoordinatorCompanionPointerInputSource1.read)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        int i4 = 3;
        switch (i) {
            case 24:
                ImpressionStorageClient impressionStorageClient = (ImpressionStorageClient) this.write;
                CampaignImpression campaignImpression = (CampaignImpression) this.RemoteActionCompatParcelizer;
                impressionStorageClient.getClass();
                AndroidPlatformTextInputSessionstartInputMethod311 androidPlatformTextInputSessionstartInputMethod311NewBuilder = CampaignImpressionList.newBuilder((CampaignImpressionList) obj);
                androidPlatformTextInputSessionstartInputMethod311NewBuilder.RemoteActionCompatParcelizer();
                ((CampaignImpressionList) androidPlatformTextInputSessionstartInputMethod311NewBuilder.RemoteActionCompatParcelizer).addAlreadySeenCampaigns(campaignImpression);
                CampaignImpressionList campaignImpressionList = (CampaignImpressionList) androidPlatformTextInputSessionstartInputMethod311NewBuilder.serializer();
                r8lambdaqu7RmgdCB4kSCqXaBH9yH_wahpM r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm = impressionStorageClient.serializer;
                r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm.getClass();
                return new CompletableFromCallable(new SentryEnvelopeItem$$ExternalSyntheticLambda3(r8lambdaqu7rmgdcb4kscqxabh9yh_wahpm, i4, campaignImpressionList)).serializer(new traverseChildren(impressionStorageClient, campaignImpressionList, i3));
            case 25:
                reuse reuseVar = (reuse) this.write;
                MaybeObserveOn maybeObserveOn = (MaybeObserveOn) this.RemoteActionCompatParcelizer;
                CampaignImpressionList campaignImpressionList2 = (CampaignImpressionList) obj;
                if (!reuseVar.MediaBrowserCompatMediaItem.write()) {
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
                    accessgetMaindelegatecp accessgetmaindelegatecpNewBuilder = FetchEligibleCampaignsResponse.newBuilder();
                    accessgetmaindelegatecpNewBuilder.RemoteActionCompatParcelizer();
                    ((FetchEligibleCampaignsResponse) accessgetmaindelegatecpNewBuilder.RemoteActionCompatParcelizer).setExpirationEpochTimestampMillis(1L);
                    return Maybe.RemoteActionCompatParcelizer((FetchEligibleCampaignsResponse) accessgetmaindelegatecpNewBuilder.serializer());
                }
                MaybeMap maybeMap = new MaybeMap(new MaybeFilter(maybeObserveOn, new Gson$$ExternalSyntheticBUOutline0(14)), new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(reuseVar, 26, campaignImpressionList2));
                accessgetMaindelegatecp accessgetmaindelegatecpNewBuilder2 = FetchEligibleCampaignsResponse.newBuilder();
                accessgetmaindelegatecpNewBuilder2.RemoteActionCompatParcelizer();
                ((FetchEligibleCampaignsResponse) accessgetmaindelegatecpNewBuilder2.RemoteActionCompatParcelizer).setExpirationEpochTimestampMillis(1L);
                MaybeSwitchIfEmpty maybeSwitchIfEmpty = new MaybeSwitchIfEmpty(maybeMap, Maybe.RemoteActionCompatParcelizer((FetchEligibleCampaignsResponse) accessgetmaindelegatecpNewBuilder2.serializer()));
                Gson$$ExternalSyntheticBUOutline0 gson$$ExternalSyntheticBUOutline0 = new Gson$$ExternalSyntheticBUOutline0(15);
                Consumer consumer = Functions.serializer;
                MaybePeek maybePeek = new MaybePeek(new MaybePeek(maybeSwitchIfEmpty, gson$$ExternalSyntheticBUOutline0, consumer), new InAppMessageStreamManager$$ExternalSyntheticLambda4(reuseVar, z ? 1 : 0), consumer);
                AnalyticsEventsManager analyticsEventsManager = reuseVar.RemoteActionCompatParcelizer;
                Objects.requireNonNull(analyticsEventsManager);
                MaybePeek maybePeek2 = new MaybePeek(maybePeek, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(17, analyticsEventsManager), consumer);
                zzgs zzgsVar = reuseVar.MediaSessionCompatToken;
                Objects.requireNonNull(zzgsVar);
                return new MaybeOnErrorNext(new MaybePeek(new MaybePeek(maybePeek2, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(18, zzgsVar), consumer), consumer, new FieldType$$ExternalSyntheticBUOutline0(8)), Functions.read(MaybeEmpty.IconCompatParcelizer));
            case 26:
                reuse reuseVar2 = (reuse) this.write;
                CampaignImpressionList campaignImpressionList3 = (CampaignImpressionList) this.RemoteActionCompatParcelizer;
                DpTouchBoundsExpansiona9UjIt4 dpTouchBoundsExpansiona9UjIt4 = (DpTouchBoundsExpansiona9UjIt4) obj;
                DpTouchBoundsExpansiona9UjIt4default dpTouchBoundsExpansiona9UjIt4default = reuseVar2.serializer;
                dpTouchBoundsExpansiona9UjIt4default.getClass();
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.serializer();
                WeakReference weakReference = dpTouchBoundsExpansiona9UjIt4default.read;
                weakReference.getClass();
                try {
                    ProviderInstaller.installIfNeeded(weakReference.serializer);
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
                    e.printStackTrace();
                }
                TraversableNode traversableNode = (TraversableNode) dpTouchBoundsExpansiona9UjIt4default.serializer.write();
                accesssetActionModep accesssetactionmodepNewBuilder = FetchEligibleCampaignsRequest.newBuilder();
                FirebaseApp firebaseApp = dpTouchBoundsExpansiona9UjIt4default.IconCompatParcelizer;
                firebaseApp.IconCompatParcelizer();
                String str2 = firebaseApp.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer;
                accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer();
                ((FetchEligibleCampaignsRequest) accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer).setProjectNumber(str2);
                List<CampaignImpression> alreadySeenCampaignsList = campaignImpressionList3.getAlreadySeenCampaignsList();
                accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer();
                ((FetchEligibleCampaignsRequest) accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer).addAllAlreadySeenCampaigns(alreadySeenCampaignsList);
                updateParentData updateparentdataNewBuilder = ClientSignalsProto$ClientSignals.newBuilder();
                int i5 = Build.VERSION.SDK_INT;
                updateparentdataNewBuilder.RemoteActionCompatParcelizer();
                ((ClientSignalsProto$ClientSignals) updateparentdataNewBuilder.RemoteActionCompatParcelizer).setPlatformVersion(String.valueOf(i5));
                String string = Locale.getDefault().toString();
                updateparentdataNewBuilder.RemoteActionCompatParcelizer();
                ((ClientSignalsProto$ClientSignals) updateparentdataNewBuilder.RemoteActionCompatParcelizer).setLanguageCode(string);
                String id = TimeZone.getDefault().getID();
                updateparentdataNewBuilder.RemoteActionCompatParcelizer();
                ((ClientSignalsProto$ClientSignals) updateparentdataNewBuilder.RemoteActionCompatParcelizer).setTimeZone(id);
                Application application = dpTouchBoundsExpansiona9UjIt4default.RemoteActionCompatParcelizer;
                try {
                    str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
                } catch (PackageManager.NameNotFoundException e2) {
                    SentryLogcatAdapter.serializer("FIAM.Headless", "Error finding versionName : " + e2.getMessage());
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    updateparentdataNewBuilder.RemoteActionCompatParcelizer();
                    ((ClientSignalsProto$ClientSignals) updateparentdataNewBuilder.RemoteActionCompatParcelizer).setAppVersion(str);
                }
                ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals = (ClientSignalsProto$ClientSignals) updateparentdataNewBuilder.serializer();
                accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer();
                ((FetchEligibleCampaignsRequest) accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer).setClientSignals(clientSignalsProto$ClientSignals);
                AndroidTextToolbartextActionModeCallback1 androidTextToolbartextActionModeCallback1NewBuilder = ClientAppInfo.newBuilder();
                FirebaseApp firebaseApp2 = dpTouchBoundsExpansiona9UjIt4default.IconCompatParcelizer;
                firebaseApp2.IconCompatParcelizer();
                String str3 = firebaseApp2.PlaybackStateCompatCustomAction.IconCompatParcelizer;
                androidTextToolbartextActionModeCallback1NewBuilder.RemoteActionCompatParcelizer();
                ((ClientAppInfo) androidTextToolbartextActionModeCallback1NewBuilder.RemoteActionCompatParcelizer).setGmpAppId(str3);
                String str4 = dpTouchBoundsExpansiona9UjIt4.read;
                androidTextToolbartextActionModeCallback1NewBuilder.RemoteActionCompatParcelizer();
                ((ClientAppInfo) androidTextToolbartextActionModeCallback1NewBuilder.RemoteActionCompatParcelizer).setAppInstanceId(str4);
                String str5 = dpTouchBoundsExpansiona9UjIt4.IconCompatParcelizer.IconCompatParcelizer;
                androidTextToolbartextActionModeCallback1NewBuilder.RemoteActionCompatParcelizer();
                ((ClientAppInfo) androidTextToolbartextActionModeCallback1NewBuilder.RemoteActionCompatParcelizer).setAppInstanceIdToken(str5);
                ClientAppInfo clientAppInfo = (ClientAppInfo) androidTextToolbartextActionModeCallback1NewBuilder.serializer();
                accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer();
                ((FetchEligibleCampaignsRequest) accesssetactionmodepNewBuilder.RemoteActionCompatParcelizer).setRequestingClientApp(clientAppInfo);
                FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest = (FetchEligibleCampaignsRequest) accesssetactionmodepNewBuilder.serializer();
                accessgetToRunOnFramep accessgettorunonframep = traversableNode.write;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                parseJsonObjectIntoBundlelambda0 parsejsonobjectintobundlelambda0 = (parseJsonObjectIntoBundlelambda0) accessgettorunonframep.IconCompatParcelizer;
                mergeJsonObjectslambda10 mergejsonobjectslambda10 = (mergeJsonObjectslambda10) accessgettorunonframep.write;
                mergejsonobjectslambda10.getClass();
                if (timeUnit == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("units");
                    return null;
                }
                r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY r8lambda9bwhxitij38r9epvsmivfryty = new r8lambda9BWhXiTIJ38R9EPvsMIvFrYtY(30000000000L);
                CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda10);
                callOptions$BuilderRemoteActionCompatParcelizer.serializer = r8lambda9bwhxitij38r9epvsmivfryty;
                mergeJsonObjectslambda10 mergejsonobjectslambda11 = new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer);
                TextStreamsKt.serializer(parsejsonobjectintobundlelambda0, "channel");
                SentryClient sentryClient = SQLite.read;
                if (sentryClient == null) {
                    synchronized (SQLite.class) {
                        sentryClient = SQLite.read;
                        if (sentryClient == null) {
                            constructObjectQuietlydefault constructobjectquietlydefault = constructObjectQuietlydefault.UNARY;
                            String str6 = SentryClient.read("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns");
                            FetchEligibleCampaignsRequest defaultInstance = FetchEligibleCampaignsRequest.getDefaultInstance();
                            getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress = setPushNotificationSubscriptionTypelambda1.RemoteActionCompatParcelizer;
                            sentryClient = new SentryClient(constructobjectquietlydefault, str6, new monthFromInt(defaultInstance), new monthFromInt(FetchEligibleCampaignsResponse.getDefaultInstance()), true);
                            SQLite.read = sentryClient;
                        }
                    }
                }
                Logger logger = ClientCalls.read;
                parseGender parsegender = new parseGender();
                CallOptions$Builder callOptions$BuilderRemoteActionCompatParcelizer2 = mergeJsonObjectslambda10.RemoteActionCompatParcelizer(mergejsonobjectslambda11.IconCompatParcelizer(ClientCalls.RemoteActionCompatParcelizer, setCustomUserAttributeJSON.BLOCKING));
                callOptions$BuilderRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer = parsegender;
                JsonUtilsa jsonUtilsa = parsejsonobjectintobundlelambda0.read(sentryClient, new mergeJsonObjectslambda10(callOptions$BuilderRemoteActionCompatParcelizer2));
                try {
                    try {
                        parseStringArrayFromJsonString parsestringarrayfromjsonstringIconCompatParcelizer = ClientCalls.IconCompatParcelizer(jsonUtilsa, fetchEligibleCampaignsRequest);
                        while (!parsestringarrayfromjsonstringIconCompatParcelizer.isDone()) {
                            try {
                                parsegender.RemoteActionCompatParcelizer();
                            } catch (InterruptedException e3) {
                                try {
                                    jsonUtilsa.read("Thread interrupted", e3);
                                    i3 = 1;
                                } catch (Error e4) {
                                    e = e4;
                                    ClientCalls.IconCompatParcelizer(jsonUtilsa, e);
                                    throw null;
                                } catch (RuntimeException e5) {
                                    e = e5;
                                    ClientCalls.IconCompatParcelizer(jsonUtilsa, e);
                                    throw null;
                                }
                            }
                        }
                        parsegender.serializer();
                        Object objIconCompatParcelizer = ClientCalls.IconCompatParcelizer(parsestringarrayfromjsonstringIconCompatParcelizer);
                        if (i3 != 0) {
                            Thread.currentThread().interrupt();
                        }
                        FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = (FetchEligibleCampaignsResponse) objIconCompatParcelizer;
                        if (fetchEligibleCampaignsResponse.getExpirationEpochTimestampMillis() < System.currentTimeMillis() + 60000 || fetchEligibleCampaignsResponse.getExpirationEpochTimestampMillis() > System.currentTimeMillis() + 259200000) {
                            accessgetMaindelegatecp accessgetmaindelegatecp = (accessgetMaindelegatecp) fetchEligibleCampaignsResponse.toBuilder();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            accessgetmaindelegatecp.RemoteActionCompatParcelizer();
                            ((FetchEligibleCampaignsResponse) accessgetmaindelegatecp.RemoteActionCompatParcelizer).setExpirationEpochTimestampMillis(jCurrentTimeMillis + CarGwiSoFileConstant.CAR_GWI_SPECIFY_INTERVAL);
                            fetchEligibleCampaignsResponse = (FetchEligibleCampaignsResponse) accessgetmaindelegatecp.serializer();
                        }
                        return fetchEligibleCampaignsResponse;
                    } catch (Throwable th) {
                        th = th;
                        if (i2 != 0) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (Error e6) {
                    e = e6;
                    ClientCalls.IconCompatParcelizer(jsonUtilsa, e);
                    throw null;
                } catch (RuntimeException e7) {
                    e = e7;
                    ClientCalls.IconCompatParcelizer(jsonUtilsa, e);
                    throw null;
                } catch (Throwable th2) {
                    th = th2;
                    i2 = i3;
                    if (i2 != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
                break;
                break;
            case 27:
                reuse reuseVar3 = (reuse) this.write;
                String str7 = (String) this.RemoteActionCompatParcelizer;
                CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
                reuseVar3.getClass();
                if (campaignProto$ThickContent.getIsTestCampaign() || !str7.equals("ON_FOREGROUND")) {
                    return Maybe.RemoteActionCompatParcelizer(campaignProto$ThickContent);
                }
                RateLimiterClient rateLimiterClient = reuseVar3.MediaSessionCompatResultReceiverWrapper;
                getHasComposition gethascomposition = reuseVar3.write;
                return new MaybeMap(new MaybeFilterSingle(new SingleResumeNext(new SingleDoOnSuccess(new MaybeIsEmptySingle(new MaybeFilter(new MaybeMap(new MaybeSwitchIfEmpty(rateLimiterClient.RemoteActionCompatParcelizer(), Maybe.RemoteActionCompatParcelizer(RateLimitProto$RateLimit.getDefaultInstance())), new RateLimiterClient$$ExternalSyntheticLambda0(rateLimiterClient, gethascomposition, 2)), new RateLimiterClient$$ExternalSyntheticLambda0(rateLimiterClient, gethascomposition, i4))), new FieldType$$ExternalSyntheticBUOutline0(6)), Functions.read(Single.serializer(Boolean.FALSE))), new FieldType$$ExternalSyntheticBUOutline0(7)), new UnplacedAwareModifierNode(campaignProto$ThickContent));
            default:
                RateLimitProto$RateLimit rateLimitProto$RateLimit = (RateLimitProto$RateLimit) this.write;
                getHasComposition gethascomposition2 = (getHasComposition) this.RemoteActionCompatParcelizer;
                RateLimitProto$Counter rateLimitProto$Counter = (RateLimitProto$Counter) obj;
                cacheIfAlive cacheifaliveNewBuilder = RateLimitProto$Counter.newBuilder(rateLimitProto$Counter);
                cacheifaliveNewBuilder.RemoteActionCompatParcelizer();
                ((RateLimitProto$Counter) cacheifaliveNewBuilder.RemoteActionCompatParcelizer).clearValue();
                cacheifaliveNewBuilder.RemoteActionCompatParcelizer(rateLimitProto$Counter.getValue() + 1);
                RateLimitProto$Counter rateLimitProto$Counter2 = (RateLimitProto$Counter) cacheifaliveNewBuilder.serializer();
                getDisposeViewCompositionStrategyannotations getdisposeviewcompositionstrategyannotationsNewBuilder = RateLimitProto$RateLimit.newBuilder(rateLimitProto$RateLimit);
                gethascomposition2.getClass();
                getdisposeviewcompositionstrategyannotationsNewBuilder.RemoteActionCompatParcelizer();
                ((RateLimitProto$RateLimit) getdisposeviewcompositionstrategyannotationsNewBuilder.RemoteActionCompatParcelizer).getMutableLimitsMap().put("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY", rateLimitProto$Counter2);
                return (RateLimitProto$RateLimit) getdisposeviewcompositionstrategyannotationsNewBuilder.serializer();
        }
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FocusRequesterModifierKt focusRequesterModifierKtAddInAppMessageViewToViewGroup$lambda$2 = DefaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup$lambda$2((DefaultInAppMessageViewWrapper) this.write, (View) this.RemoteActionCompatParcelizer, view, focusRequesterModifierKt);
        int i4 = serializer + 119;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return focusRequesterModifierKtAddInAppMessageViewToViewGroup$lambda$2;
        }
        throw null;
    }

    @Override // o.getSurfaceClass
    public void RemoteActionCompatParcelizer(getDefaultImageFormat getdefaultimageformat) {
        int i = 2 % 2;
        int i2 = serializer + 3;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        if (i3 == 3) {
            ((getSurfaceClass) obj).RemoteActionCompatParcelizer((AuthPromptFailureException) obj2);
            return;
        }
        ((getSurfaceClass) obj).RemoteActionCompatParcelizer((Recorder$3) obj2);
        int i4 = serializer + 3;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.OuterPlacementScope
    public Object then(Task task) {
        int i = 2 % 2;
        int i2 = serializer + 53;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BlockRunner blockRunner = (BlockRunner) this.write;
        SentryClient sentryClient = (SentryClient) this.RemoteActionCompatParcelizer;
        blockRunner.getClass();
        zzw zzwVarRemoteActionCompatParcelizer = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(((wouldPushPermissionPromptDisplaylambda2) task.getResult()).read(sentryClient, (mergeJsonObjectslambda10) blockRunner.RatingCompat));
        int i4 = read + 77;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zzwVarRemoteActionCompatParcelizer;
    }

    @Override // o.getHandlerui
    public boolean read() {
        int i = 2 % 2;
        PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl = (PrefetchHandleProvider$HandleAndRequestImpl) this.write;
        animateElevationrAjV9yQ animateelevationrajv9yq = (animateElevationrAjV9yQ) this.RemoteActionCompatParcelizer;
        if (!prefetchHandleProvider$HandleAndRequestImpl.ParcelableVolumeInfo) {
            int i2 = serializer + 101;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            prefetchHandleProvider$HandleAndRequestImpl.write();
            long j = animateElevationrAjV9yQ.read(prefetchHandleProvider$HandleAndRequestImpl.serializer, animateelevationrajv9yq.serializer);
            animateelevationrajv9yq.serializer = j;
            prefetchHandleProvider$HandleAndRequestImpl.ParcelableVolumeInfo = !prefetchHandleProvider$HandleAndRequestImpl.write(prefetchHandleProvider$HandleAndRequestImpl.write, j + animateelevationrajv9yq.RemoteActionCompatParcelizer);
            int i4 = read + 15;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 4 / 4;
            }
        }
        return prefetchHandleProvider$HandleAndRequestImpl.ParcelableVolumeInfo;
    }

    @Override // o.Camera2CameraImpl
    public void write(getCollapseContentDescription getcollapsecontentdescription) {
        int i = 2 % 2;
        int i2 = serializer + 87;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2 = (PreviewView1ExternalSyntheticLambda2) this.write;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.RemoteActionCompatParcelizer;
        setMinimumHeight setminimumheight = setMinimumHeight.DEFAULT;
        if (surfaceRequest.IconCompatParcelizer.RemoteActionCompatParcelizer() && getcollapsecontentdescription.write) {
            setminimumheight = setMinimumHeight.YUV;
        }
        fromId fromid = previewView1ExternalSyntheticLambda2.write;
        setCardBackgroundColor.serializer(fromid.MediaMetadataCompat, true);
        setCardBackgroundColor.serializer(fromid.RatingCompat);
        if (fromid.read != setminimumheight) {
            fromid.read = setminimumheight;
            fromid.IconCompatParcelizer(fromid.MediaBrowserCompatMediaItem);
        }
        int i4 = serializer + 91;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public ImageResources_androidKt serializer() {
        int i = 2 % 2;
        int i2 = read + 77;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TextLinkScope textLinkScope = (TextLinkScope) this.write;
        AnnotatedString.Range range = (AnnotatedString.Range) this.RemoteActionCompatParcelizer;
        TextLayoutResult textLayoutResult = (TextLayoutResult) ((onShowTranslationui) textLinkScope.RemoteActionCompatParcelizer).getValue();
        if (textLayoutResult == null) {
            return new ImageResources_androidKt(0, 0, new RemoteActionCompatParcelizer(11));
        }
        AnnotatedString.Range rangeSerializer = TextLinkScope.serializer(range, textLayoutResult);
        int i4 = 12;
        if (rangeSerializer == null) {
            return new ImageResources_androidKt(0, 0, new RemoteActionCompatParcelizer(i4));
        }
        IntRect intRectRoundToIntRect = IntRectKt.roundToIntRect(textLayoutResult.getPathForRange(rangeSerializer.getStart(), rangeSerializer.getEnd()).getBounds());
        ImageResources_androidKt imageResources_androidKt = new ImageResources_androidKt(intRectRoundToIntRect.getWidth(), intRectRoundToIntRect.getHeight(), new CoroutineLiveData$$ExternalSyntheticLambda0(i4, intRectRoundToIntRect));
        int i5 = serializer + 35;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return imageResources_androidKt;
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        int i = 2 % 2;
        int i2 = serializer + 65;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.write;
        int i5 = 16;
        if (i4 == 16) {
            ((getContextClick5zf0vsI) obj2).write.read.clear();
            ((setRectOutlinetz77jQwdefault) obj).invoke();
            return;
        }
        switch (i4) {
            case 21:
                ((TouchBoundsExpansionKt) obj2).write = (FetchEligibleCampaignsResponse) obj;
                int i6 = read + 109;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 22:
                DisplayCallbacksImpl displayCallbacksImpl = (DisplayCallbacksImpl) obj2;
                OwnerSnapshotObserveronCommitAffectingMeasure1 ownerSnapshotObserveronCommitAffectingMeasure1 = (OwnerSnapshotObserveronCommitAffectingMeasure1) obj;
                MetricsLoggerClient metricsLoggerClient = (MetricsLoggerClient) displayCallbacksImpl.MediaMetadataCompat;
                internalOnMeasureui internalonmeasureui = (internalOnMeasureui) displayCallbacksImpl.read;
                metricsLoggerClient.getClass();
                if (!internalonmeasureui.serializer().MediaSessionCompatToken()) {
                    ((FirebaseInstallations) metricsLoggerClient.MediaBrowserCompatMediaItem).write().addOnSuccessListener(metricsLoggerClient.serializer, new PreviewView$1$$ExternalSyntheticLambda2(metricsLoggerClient, internalonmeasureui, ownerSnapshotObserveronCommitAffectingMeasure1, 15));
                }
                Iterator it = metricsLoggerClient.MediaMetadataCompat.serializer.values().iterator();
                if (it.hasNext()) {
                    throw ff$$ExternalSyntheticOutline0.m(it);
                }
                return;
            case 23:
                DisplayCallbacksImpl displayCallbacksImpl2 = (DisplayCallbacksImpl) obj2;
                ParentDataModifierNode parentDataModifierNode = (ParentDataModifierNode) obj;
                MetricsLoggerClient metricsLoggerClient2 = (MetricsLoggerClient) displayCallbacksImpl2.MediaMetadataCompat;
                internalOnMeasureui internalonmeasureui2 = (internalOnMeasureui) displayCallbacksImpl2.read;
                metricsLoggerClient2.getClass();
                if (!internalonmeasureui2.serializer().MediaSessionCompatToken()) {
                    ((FirebaseInstallations) metricsLoggerClient2.MediaBrowserCompatMediaItem).write().addOnSuccessListener(metricsLoggerClient2.serializer, new PreviewView$1$$ExternalSyntheticLambda2(metricsLoggerClient2, internalonmeasureui2, parentDataModifierNode, i5));
                    metricsLoggerClient2.IconCompatParcelizer(internalonmeasureui2, "fiam_dismiss", false);
                }
                Iterator it2 = metricsLoggerClient2.MediaMetadataCompat.read.values().iterator();
                if (it2.hasNext()) {
                    throw ff$$ExternalSyntheticOutline0.m(it2);
                }
                return;
            default:
                RateLimiterClient rateLimiterClient = (RateLimiterClient) obj2;
                rateLimiterClient.getClass();
                rateLimiterClient.serializer = Maybe.RemoteActionCompatParcelizer((RateLimitProto$RateLimit) obj);
                return;
        }
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        int i = 2 % 2;
        int i2 = read + 23;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.write;
        if (i3 == 4) {
            ((AtomicReference) obj2).set(ondrawwithcontent);
            return "SurfaceRequest-surface-recreation(" + ((SurfaceRequest) obj3).hashCode() + ")";
        }
        if (i3 == 8) {
            PendingValue pendingValue = (PendingValue) obj3;
            FocusOwnerImplmoveFocusfocusSearchSuccess1 focusOwnerImplmoveFocusfocusSearchSuccess1 = (FocusOwnerImplmoveFocusfocusSearchSuccess1) pendingValue.serializer;
            if (focusOwnerImplmoveFocusfocusSearchSuccess1 != null) {
                ((onDrawWithContent) focusOwnerImplmoveFocusfocusSearchSuccess1.IconCompatParcelizer).serializer();
            }
            pendingValue.serializer = new FocusOwnerImplmoveFocusfocusSearchSuccess1(ondrawwithcontent, obj2);
            return m1$$ExternalSyntheticOutline0.m(obj2, "PendingValue ");
        }
        if (i3 == 9) {
            CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2 = (CombinedClickableNodehandleDownEvent2) obj3;
            Surface surface = (Surface) obj2;
            setInflatedId.IconCompatParcelizer(3, "TextureViewImpl");
            combinedClickableNodehandleDownEvent2.MediaDescriptionCompat.write(surface, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read(), new snapTo(3, ondrawwithcontent));
            return "provideSurface[request=" + combinedClickableNodehandleDownEvent2.MediaDescriptionCompat + " surface=" + surface + "]";
        }
        final int i4 = 0;
        if (i3 == 12) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i5 = 1;
            ondrawwithcontent.RemoteActionCompatParcelizer(new Runnable() { // from class: o.ImageBitmap
                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = i5;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if (i6 != 0) {
                        atomicBoolean2.set(true);
                    } else {
                        atomicBoolean2.set(true);
                    }
                }
            }, accessgetSizeNHjbRcjd.INSTANCE);
            ((Executor) obj3).execute(new WorkerKt$$ExternalSyntheticLambda2(atomicBoolean, ondrawwithcontent, (Braze$$ExternalSyntheticLambda9) obj2, 22));
            int i6 = serializer + 93;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                int i7 = 69 / 0;
            }
            return "setForegroundAsync";
        }
        if (i3 != 13) {
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            ondrawwithcontent.RemoteActionCompatParcelizer(new Runnable() { // from class: o.ImageBitmap
                @Override // java.lang.Runnable
                public final void run() {
                    int i8 = i4;
                    AtomicBoolean atomicBoolean3 = atomicBoolean2;
                    if (i8 != 0) {
                        atomicBoolean3.set(true);
                    } else {
                        atomicBoolean3.set(true);
                    }
                }
            }, accessgetSizeNHjbRcjd.INSTANCE);
            ((Executor) obj3).execute(new WorkerKt$$ExternalSyntheticLambda2(atomicBoolean2, ondrawwithcontent, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2, i4));
            return createFromParcel.INSTANCE;
        }
        RxWorker rxWorker = (RxWorker) obj3;
        SingleSubscribeOn singleSubscribeOnWrite = ((Single) obj2).write(rxWorker.RemoteActionCompatParcelizer());
        getDifferencertfAjoo getdifferencertfajoo = rxWorker.MediaBrowserCompatMediaItem.serializer.RemoteActionCompatParcelizer;
        Scheduler scheduler = Schedulers.serializer;
        new SingleObserveOn(singleSubscribeOnWrite, new ExecutorScheduler(getdifferencertfajoo)).subscribe(new setShadowElevation(i4, ondrawwithcontent));
        int i8 = read + 21;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            return "converted single to future";
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.onRequestMeasure
    public Object write() {
        Long lValueOf;
        Long lValueOf2;
        long jLongValue;
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        I$b i$b = (I$b) this.write;
        int i4 = 0;
        if (i3 != 17) {
            DropShadowEffect dropShadowEffect = (DropShadowEffect) obj;
            NodeCoordinatorupdateLayerParameters1 nodeCoordinatorupdateLayerParameters1 = (NodeCoordinatorupdateLayerParameters1) dropShadowEffect.read;
            ArrayList arrayList = (ArrayList) dropShadowEffect.write;
            ChildHelper childHelper = (ChildHelper) i$b.serializer;
            getClipMetadata getclipmetadata = (getClipMetadata) dropShadowEffect.serializer;
            childHelper.getClass();
            getclipmetadata.getClass();
            childHelper.MediaSessionCompatQueueItem = getclipmetadata;
            childHelper.RemoteActionCompatParcelizer();
            LocalDocumentsView localDocumentsView = (LocalDocumentsView) i$b.RemoteActionCompatParcelizer;
            HashSet hashSetIconCompatParcelizer = nodeCoordinatorupdateLayerParameters1.IconCompatParcelizer();
            ArrayList arrayList2 = nodeCoordinatorupdateLayerParameters1.serializer;
            Iterator it = hashSetIconCompatParcelizer.iterator();
            while (!(!it.hasNext())) {
                visitNodes visitnodes = (visitNodes) it.next();
                NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1 = localDocumentsView.read(visitnodes);
                SnapshotVersion snapshotVersion = (SnapshotVersion) ((accessswap) dropShadowEffect.MediaDescriptionCompat).IconCompatParcelizer(visitnodes);
                if (snapshotVersion != null) {
                    int i5 = serializer + 5;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    z = 1;
                } else {
                    z = i4;
                }
                getRectManager.RemoteActionCompatParcelizer(z, "docVersions should contain every doc in the write.", new Object[i4]);
                if (nodeCoordinatorCompanionPointerInputSource1.MediaDescriptionCompat.compareTo(snapshotVersion) < 0) {
                    int size = arrayList2.size();
                    getRectManager.RemoteActionCompatParcelizer(arrayList.size() == size ? 1 : i4, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(arrayList.size()));
                    for (int i7 = i4; i7 < size; i7++) {
                        NodeCoordinatorKt nodeCoordinatorKt = (NodeCoordinatorKt) arrayList2.get(i7);
                        if (nodeCoordinatorKt.read.equals(nodeCoordinatorCompanionPointerInputSource1.read)) {
                            nodeCoordinatorKt.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1, (orH91voCI) arrayList.get(i7));
                        }
                    }
                    if (!nodeCoordinatorCompanionPointerInputSource1.serializer.equals(getSemanticsSource.INVALID)) {
                        localDocumentsView.read(nodeCoordinatorCompanionPointerInputSource1, (SnapshotVersion) dropShadowEffect.RatingCompat);
                    }
                    i4 = 0;
                }
            }
            ((ChildHelper) i$b.serializer).write(nodeCoordinatorupdateLayerParameters1);
            ((ChildHelper) i$b.serializer).read();
            ((x) i$b.write).RemoteActionCompatParcelizer(nodeCoordinatorupdateLayerParameters1.RemoteActionCompatParcelizer);
            LocalDocumentsView localDocumentsView2 = (LocalDocumentsView) i$b.MediaDescriptionCompat;
            HashSet hashSet = new HashSet();
            while (i4 < arrayList.size()) {
                if (!((orH91voCI) arrayList.get(i4)).serializer.isEmpty()) {
                    hashSet.add(((NodeCoordinatorKt) arrayList2.get(i4)).read);
                }
                i4++;
            }
            localDocumentsView2.write(((LocalDocumentsView) localDocumentsView2.read).write(hashSet));
            return ((LocalDocumentsView) i$b.MediaDescriptionCompat).serializer(nodeCoordinatorupdateLayerParameters1.IconCompatParcelizer());
        }
        SparseArray sparseArray = (SparseArray) i$b.MediaSessionCompatResultReceiverWrapper;
        final OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls = (OnGloballyPositionedModifierDefaultImpls) ((getLastLayerDrawingWasSkippedui) obj).read;
        headH91voCI headh91voci = (headH91voCI) onGloballyPositionedModifierDefaultImpls.read;
        Cursor cursorIconCompatParcelizer = headh91voci.read("PRAGMA page_count").IconCompatParcelizer();
        try {
            Long lValueOf3 = null;
            if (cursorIconCompatParcelizer.moveToFirst()) {
                int i8 = read + 5;
                serializer = i8 % Fields.SpotShadowColor;
                lValueOf = Long.valueOf(i8 % 2 != 0 ? cursorIconCompatParcelizer.getLong(1) : cursorIconCompatParcelizer.getLong(0));
                cursorIconCompatParcelizer.close();
            } else {
                cursorIconCompatParcelizer.close();
                lValueOf = null;
            }
            long jLongValue2 = lValueOf.longValue();
            Cursor cursorIconCompatParcelizer2 = headh91voci.read("PRAGMA page_size").IconCompatParcelizer();
            try {
                if (cursorIconCompatParcelizer2.moveToFirst()) {
                    lValueOf2 = Long.valueOf(cursorIconCompatParcelizer2.getLong(0));
                    cursorIconCompatParcelizer2.close();
                } else {
                    cursorIconCompatParcelizer2.close();
                    lValueOf2 = null;
                }
                long jLongValue3 = lValueOf2.longValue() * jLongValue2;
                if (jLongValue3 < 104857600) {
                    onEndApplyChanges.read("LruGarbageCollector", m1$$ExternalSyntheticOutline0.m(jLongValue3, "Garbage collection skipped; Cache size ", " is lower than threshold 104857600"), new Object[0]);
                    return new getWrappedui();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                headH91voCI headh91voci2 = (headH91voCI) onGloballyPositionedModifierDefaultImpls.read;
                long j = headh91voci2.RatingCompat.MediaMetadataCompat;
                Cursor cursorIconCompatParcelizer3 = headh91voci2.read("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").IconCompatParcelizer();
                try {
                    if (cursorIconCompatParcelizer3.moveToFirst()) {
                        lValueOf3 = Long.valueOf(cursorIconCompatParcelizer3.getLong(0));
                    }
                    cursorIconCompatParcelizer3.close();
                    int iLongValue = (int) ((lValueOf3.longValue() + j) * 0.1f);
                    if (iLongValue > 1000) {
                        onEndApplyChanges.read("LruGarbageCollector", c8$$ExternalSyntheticOutline0.m(iLongValue, "Capping sequence numbers to collect down to the maximum of 1000 from "), new Object[0]);
                        iLongValue = 1000;
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (iLongValue == 0) {
                        jLongValue = -1;
                    } else {
                        final getLastMeasurementConstraintsmsEJaDkui getlastmeasurementconstraintsmsejadkui = new getLastMeasurementConstraintsmsEJaDkui();
                        getlastmeasurementconstraintsmsejadkui.RemoteActionCompatParcelizer = iLongValue;
                        getlastmeasurementconstraintsmsejadkui.write = new PriorityQueue(iLongValue, getLastMeasurementConstraintsmsEJaDkui.serializer);
                        final int i9 = 0;
                        onPostAttach onpostattach = new onPostAttach() { // from class: o.getRectCache
                            @Override // o.onPostAttach
                            public final void IconCompatParcelizer(Object obj2) {
                                int i10 = i9;
                                getLastMeasurementConstraintsmsEJaDkui getlastmeasurementconstraintsmsejadkui2 = getlastmeasurementconstraintsmsejadkui;
                                if (i10 != 0) {
                                    getlastmeasurementconstraintsmsejadkui2.serializer((Long) obj2);
                                } else {
                                    getlastmeasurementconstraintsmsejadkui2.serializer(Long.valueOf(((setLastShapeui) obj2).read));
                                }
                            }
                        };
                        SQLiteTargetCache sQLiteTargetCache = ((headH91voCI) onGloballyPositionedModifierDefaultImpls.read).RatingCompat;
                        Cursor cursorIconCompatParcelizer4 = sQLiteTargetCache.write.read("SELECT target_proto FROM targets").IconCompatParcelizer();
                        while (cursorIconCompatParcelizer4.moveToNext()) {
                            try {
                                onpostattach.IconCompatParcelizer(sQLiteTargetCache.read(cursorIconCompatParcelizer4.getBlob(0)));
                            } catch (Throwable th) {
                                if (cursorIconCompatParcelizer4 == null) {
                                    throw th;
                                }
                                try {
                                    cursorIconCompatParcelizer4.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                        cursorIconCompatParcelizer4.close();
                        final int i10 = 1;
                        onPostAttach onpostattach2 = new onPostAttach() { // from class: o.getRectCache
                            @Override // o.onPostAttach
                            public final void IconCompatParcelizer(Object obj2) {
                                int i11 = i10;
                                getLastMeasurementConstraintsmsEJaDkui getlastmeasurementconstraintsmsejadkui2 = getlastmeasurementconstraintsmsejadkui;
                                if (i11 != 0) {
                                    getlastmeasurementconstraintsmsejadkui2.serializer((Long) obj2);
                                } else {
                                    getlastmeasurementconstraintsmsejadkui2.serializer(Long.valueOf(((setLastShapeui) obj2).read));
                                }
                            }
                        };
                        Cursor cursorIconCompatParcelizer5 = ((headH91voCI) onGloballyPositionedModifierDefaultImpls.read).read("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").IconCompatParcelizer();
                        while (cursorIconCompatParcelizer5.moveToNext()) {
                            try {
                                int i11 = read + 119;
                                serializer = i11 % Fields.SpotShadowColor;
                                int i12 = i11 % 2;
                                onpostattach2.IconCompatParcelizer(Long.valueOf(cursorIconCompatParcelizer5.getLong(0)));
                            } catch (Throwable th3) {
                                if (cursorIconCompatParcelizer5 == null) {
                                    throw th3;
                                }
                                int i13 = read + 69;
                                serializer = i13 % Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                                try {
                                    cursorIconCompatParcelizer5.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                        cursorIconCompatParcelizer5.close();
                        jLongValue = ((Long) ((PriorityQueue) getlastmeasurementconstraintsmsejadkui.write).peek()).longValue();
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    SQLiteTargetCache sQLiteTargetCache2 = ((headH91voCI) onGloballyPositionedModifierDefaultImpls.read).RatingCompat;
                    int[] iArr = new int[1];
                    x xVar = sQLiteTargetCache2.write.read("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
                    xVar.IconCompatParcelizer(Long.valueOf(jLongValue));
                    int i15 = 0;
                    xVar.RemoteActionCompatParcelizer(new setWasLayerBlockInvokedui(sQLiteTargetCache2, sparseArray, iArr, i15));
                    sQLiteTargetCache2.IconCompatParcelizer();
                    int i16 = iArr[0];
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    headH91voCI headh91voci3 = (headH91voCI) onGloballyPositionedModifierDefaultImpls.read;
                    final int[] iArr2 = new int[1];
                    final ArrayList arrayList3 = new ArrayList();
                    final shareWithSiblings[] sharewithsiblingsArr = {shareWithSiblings.serializer};
                    while (true) {
                        x xVar2 = headh91voci3.read("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
                        i = i16;
                        long j2 = jLongValue;
                        xVar2.IconCompatParcelizer(Long.valueOf(jLongValue), updateLayerParameters.write(sharewithsiblingsArr[i15]), 100);
                        if (xVar2.RemoteActionCompatParcelizer(new onPostAttach() { // from class: o.hitTestqzLsGqo
                            @Override // o.onPostAttach
                            public final void IconCompatParcelizer(Object obj2) {
                                OnGloballyPositionedModifierDefaultImpls onGloballyPositionedModifierDefaultImpls2 = onGloballyPositionedModifierDefaultImpls;
                                headH91voCI headh91voci4 = (headH91voCI) onGloballyPositionedModifierDefaultImpls2.read;
                                shareWithSiblings sharewithsiblingsRemoteActionCompatParcelizer = updateLayerParameters.RemoteActionCompatParcelizer(((Cursor) obj2).getString(0));
                                visitNodes visitnodes2 = new visitNodes(sharewithsiblingsRemoteActionCompatParcelizer);
                                boolean zIconCompatParcelizer = ((i$d) onGloballyPositionedModifierDefaultImpls2.serializer).IconCompatParcelizer(visitnodes2);
                                shareWithSiblings sharewithsiblings = visitnodes2.RemoteActionCompatParcelizer;
                                if (!zIconCompatParcelizer) {
                                    com.huawei.wisesecurity.ucs_credential.x xVar3 = headh91voci4.read("SELECT 1 FROM document_mutations WHERE path = ?");
                                    xVar3.IconCompatParcelizer(updateLayerParameters.write(sharewithsiblings));
                                    Cursor cursorIconCompatParcelizer6 = xVar3.IconCompatParcelizer();
                                    try {
                                        boolean zMoveToFirst = cursorIconCompatParcelizer6.moveToFirst();
                                        cursorIconCompatParcelizer6.close();
                                        if (!zMoveToFirst) {
                                            int[] iArr3 = iArr2;
                                            iArr3[0] = iArr3[0] + 1;
                                            arrayList3.add(visitnodes2);
                                            headh91voci4.IconCompatParcelizer("DELETE FROM target_documents WHERE path = ? AND target_id = 0", updateLayerParameters.write(sharewithsiblings));
                                        }
                                    } catch (Throwable th5) {
                                        if (cursorIconCompatParcelizer6 != null) {
                                            try {
                                                cursorIconCompatParcelizer6.close();
                                            } catch (Throwable th6) {
                                                th5.addSuppressed(th6);
                                            }
                                        }
                                        throw th5;
                                    }
                                }
                                sharewithsiblingsArr[0] = sharewithsiblingsRemoteActionCompatParcelizer;
                            }
                        }) != 100) {
                            break;
                        }
                        i16 = i;
                        jLongValue = j2;
                        i15 = 0;
                    }
                    headh91voci3.read.read(arrayList3);
                    int i17 = iArr2[0];
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    if (onEndApplyChanges.RemoteActionCompatParcelizer()) {
                        String strM = c8$$ExternalSyntheticOutline0.m(jCurrentTimeMillis2 - jCurrentTimeMillis, "ms\n", new StringBuilder("LRU Garbage Collection:\n\tCounted targets in "));
                        Locale locale = Locale.ROOT;
                        String strConcat = strM.concat("\tDetermined least recently used " + iLongValue + " sequence numbers in " + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms\n").concat("\tRemoved " + i + " targets in " + (jCurrentTimeMillis4 - jCurrentTimeMillis3) + "ms\n").concat("\tRemoved " + i17 + " documents in " + (jCurrentTimeMillis5 - jCurrentTimeMillis4) + "ms\n");
                        StringBuilder sb = new StringBuilder("Total Duration: ");
                        sb.append(jCurrentTimeMillis5 - jCurrentTimeMillis);
                        sb.append("ms");
                        onEndApplyChanges.read("LruGarbageCollector", strConcat.concat(sb.toString()), new Object[0]);
                    }
                    return new getWrappedui();
                } catch (Throwable th5) {
                    if (cursorIconCompatParcelizer3 == null) {
                        throw th5;
                    }
                    int i18 = read + 27;
                    serializer = i18 % Fields.SpotShadowColor;
                    try {
                        if (i18 % 2 != 0) {
                            cursorIconCompatParcelizer3.close();
                            int i19 = 83 / 0;
                        } else {
                            cursorIconCompatParcelizer3.close();
                        }
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (cursorIconCompatParcelizer2 == null) {
                    throw th7;
                }
                try {
                    cursorIconCompatParcelizer2.close();
                    int i20 = serializer + 69;
                    read = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (Throwable th9) {
            int i22 = read;
            int i23 = i22 + 29;
            serializer = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            if (cursorIconCompatParcelizer == null) {
                throw th9;
            }
            int i25 = i22 + 47;
            serializer = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            try {
                cursorIconCompatParcelizer.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        int i = 2 % 2;
        int i2 = read + 71;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        Object obj4 = this.write;
        if (i3 == 1) {
            setBaselineAligned setbaselinealigned = (setBaselineAligned) obj4;
            setbaselinealigned.serializer();
            ((Camera2CameraFactory) obj3).write();
            return setbaselinealigned.read();
        }
        if (i3 == 2) {
            onDrawBehind ondrawbehindRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(new Futures$$ExternalSyntheticLambda3((onDrawBehind) obj3, ((Camera2CapturePipeline$ScreenFlashTask) obj4).write, ConstantsKt.DEFAULT_REQUEST_TIMEOUT, 1));
            int i4 = read + 47;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 53 / 0;
            }
            return ondrawbehindRemoteActionCompatParcelizer;
        }
        ArrayList arrayList = (ArrayList) obj3;
        StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0 = (StreamSharing$$ExternalSyntheticLambda0) ((ImageCaptureWashedOutImageQuirk) obj4).write;
        Integer num = (Integer) ((nativeGetYUVImageVUOff) arrayList.get(0)).MediaDescriptionCompat.read(nativeGetYUVImageVUOff.read, 100);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        Integer num2 = (Integer) ((nativeGetYUVImageVUOff) arrayList.get(0)).MediaDescriptionCompat.read(nativeGetYUVImageVUOff.RemoteActionCompatParcelizer, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        NavArgsLazy navArgsLazy = ((LruCache) streamSharing$$ExternalSyntheticLambda0.serializer).ParcelableVolumeInfo;
        if (navArgsLazy == null) {
            return new EncoderImplMediaCodecCallback(0, new Exception("Failed to take picture: pipeline is not ready."));
        }
        PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2 = (PreviewView1ExternalSyntheticLambda2) navArgsLazy.MediaSessionCompatQueueItem;
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            previewView1ExternalSyntheticLambda2.IconCompatParcelizer(new Crossfade(previewView1ExternalSyntheticLambda2, 7, new getSensorToViewTransform(iIntValue, iIntValue2, ondrawwithcontent)), new InvalidConfigException(ondrawwithcontent, 1));
            ondrawwithcontent.RemoteActionCompatParcelizer = "DefaultSurfaceProcessor#snapshot";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        DrawModifierNodeKt drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind);
        int i6 = serializer + 57;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return drawModifierNodeKtWrite;
    }
}
