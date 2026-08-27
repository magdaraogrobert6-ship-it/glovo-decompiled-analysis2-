package com.foodora.courier.push.messages.domain;

import android.app.PendingIntent;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import androidx.work.impl.WorkManagerImpl;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.application.CourierApplication;
import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.deeplink.analytics.PushAnalyticsData;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptBackgroundHandlerImpl$invoke$1;
import com.roadrunner.inappnotifications.data.FetchInAppMessageWorker;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import com.roadrunner.push.event.PushDeepLink;
import com.roadrunner.push.messages.display.backgroud.services.SendPushReceiptWorker;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import o.AndroidAssetFont;
import o.AndroidFontResolveInterceptor_androidKt;
import o.AwaitFirstLayoutModifier;
import o.FontVariationSetting;
import o.GraphicsLayerScope;
import o.InputMethodManagerImpl;
import o.PlatformParagraphStyleSaverlambda0;
import o.PlatformParagraphStyleSaverlambda1;
import o.PrerenderException;
import o.RecyclerViewAdapter;
import o.SaversKtExternalSyntheticLambda0;
import o.SaversKtNonNullValueClassSaver1;
import o.ShortNewsContentCardView;
import o.TypefaceSpan;
import o.access1000;
import o.accessgetAmbientShadowColor0d7_KjUjd;
import o.accessgetCompositingStrategyNrFUSIjd;
import o.accessgetPresscp;
import o.accessgetReleasecp;
import o.accesssetColorFilterjd;
import o.checkAdjustAdRevenue;
import o.checkForInstallReferrerInfo;
import o.consume;
import o.deleteEventMetadata;
import o.deleteGlobalCallbackParameters;
import o.disableThirdPartySharingForCoppaEnabledI;
import o.drawOutlinehn5TExg;
import o.foregroundTimerFiredI;
import o.getAllSemanticsNodesToMap;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getMultiplier;
import o.getPositionF1C5BW0;
import o.handleThirdPartySharingCallbackI;
import o.isUnderlineText;
import o.lambdaaddGlobalPartnerParameter22;
import o.maybeSendPoolingContainerAttach;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.processAdapterUpdatesAndSetAnimationFlags;
import o.processDisappeared;
import o.r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdachPO4eWAQ7w61QZHJUYsstdg5A4;
import o.removeNodeAtDepth;
import o.s0;
import o.setCompositingStrategyaDBOjCE;
import o.setFrom58bKbWc;
import o.toolingGraphicsLayer;
import o.updateAdidI;
import okio.Okio;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class HandlePushMessageUseCase {
    private static int ResultReceiver = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final PlatformParagraphStyleSaverlambda1 ComponentActivity;
    public final AndroidAssetFont IconCompatParcelizer;
    public final handleThirdPartySharingCallbackI MediaBrowserCompatMediaItem;
    public final RecyclerViewAdapter MediaDescriptionCompat;
    public final TypefaceSpan MediaMetadataCompat;
    public final getMultiplier MediaSessionCompatQueueItem;
    public final PushWithAppStateDataStoreImpl MediaSessionCompatResultReceiverWrapper;
    public final accessgetReleasecp MediaSessionCompatToken;
    public final PrerenderException ParcelableVolumeInfo;
    public final SignInDataStore PlaybackStateCompat;
    public final PlatformParagraphStyleSaverlambda0 PlaybackStateCompatCustomAction;
    public final processDisappeared RatingCompat;
    public final SaversKtNonNullValueClassSaver1 RemoteActionCompatParcelizer;
    public final getAllSemanticsNodesToMap r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final getPositionF1C5BW0 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final isUnderlineText read;
    public final lambdaaddGlobalPartnerParameter22 serializer;
    public final getContentViewGroupParentLayout write;

    public HandlePushMessageUseCase(lambdaaddGlobalPartnerParameter22 lambdaaddglobalpartnerparameter22, getPositionF1C5BW0 getpositionf1c5bw0, accessgetReleasecp accessgetreleasecp, RecyclerViewAdapter recyclerViewAdapter, getMultiplier getmultiplier, handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki, PlatformParagraphStyleSaverlambda1 platformParagraphStyleSaverlambda1, SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver1, PlatformParagraphStyleSaverlambda0 platformParagraphStyleSaverlambda0, processDisappeared processdisappeared, AndroidAssetFont androidAssetFont, TypefaceSpan typefaceSpan, isUnderlineText isunderlinetext, PushWithAppStateDataStoreImpl pushWithAppStateDataStoreImpl, PrerenderException prerenderException, SignInDataStore signInDataStore, getContentViewGroupParentLayout getcontentviewgroupparentlayout, getAllSemanticsNodesToMap getallsemanticsnodestomap) {
        lambdaaddglobalpartnerparameter22.getClass();
        getpositionf1c5bw0.getClass();
        accessgetreleasecp.getClass();
        recyclerViewAdapter.getClass();
        getmultiplier.getClass();
        handlethirdpartysharingcallbacki.getClass();
        platformParagraphStyleSaverlambda1.getClass();
        saversKtNonNullValueClassSaver1.getClass();
        platformParagraphStyleSaverlambda0.getClass();
        processdisappeared.getClass();
        androidAssetFont.getClass();
        typefaceSpan.getClass();
        isunderlinetext.getClass();
        pushWithAppStateDataStoreImpl.getClass();
        prerenderException.getClass();
        signInDataStore.getClass();
        getcontentviewgroupparentlayout.getClass();
        getallsemanticsnodestomap.getClass();
        this.serializer = lambdaaddglobalpartnerparameter22;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getpositionf1c5bw0;
        this.MediaSessionCompatToken = accessgetreleasecp;
        this.MediaDescriptionCompat = recyclerViewAdapter;
        this.MediaSessionCompatQueueItem = getmultiplier;
        this.MediaBrowserCompatMediaItem = handlethirdpartysharingcallbacki;
        this.ComponentActivity = platformParagraphStyleSaverlambda1;
        this.RemoteActionCompatParcelizer = saversKtNonNullValueClassSaver1;
        this.PlaybackStateCompatCustomAction = platformParagraphStyleSaverlambda0;
        this.RatingCompat = processdisappeared;
        this.IconCompatParcelizer = androidAssetFont;
        this.MediaMetadataCompat = typefaceSpan;
        this.read = isunderlinetext;
        this.MediaSessionCompatResultReceiverWrapper = pushWithAppStateDataStoreImpl;
        this.ParcelableVolumeInfo = prerenderException;
        this.PlaybackStateCompat = signInDataStore;
        this.write = getcontentviewgroupparentlayout;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = getallsemanticsnodestomap;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x045b  */
    /* JADX WARN: Code duplicated, block: B:102:0x045f  */
    /* JADX WARN: Code duplicated, block: B:103:0x0464  */
    /* JADX WARN: Code duplicated, block: B:105:0x0468  */
    /* JADX WARN: Code duplicated, block: B:106:0x046d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0471  */
    /* JADX WARN: Code duplicated, block: B:109:0x0476  */
    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[PHI: r4 r7 r8 r9 r10
  0x0042: PHI (r4v41 o.lambdaaddGlobalPartnerParameter22) = (r4v4 o.lambdaaddGlobalPartnerParameter22), (r4v42 o.lambdaaddGlobalPartnerParameter22) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r7v14 o.deleteGlobalCallbackParameters) = (r7v0 o.deleteGlobalCallbackParameters), (r7v15 o.deleteGlobalCallbackParameters) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r8v14 o.deleteEventMetadata) = (r8v0 o.deleteEventMetadata), (r8v15 o.deleteEventMetadata) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r9v5 o.AwaitFirstLayoutModifier) = (r9v0 o.AwaitFirstLayoutModifier), (r9v6 o.AwaitFirstLayoutModifier) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0042: PHI (r10v3 boolean) = (r10v0 boolean), (r10v4 boolean) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x047a  */
    /* JADX WARN: Code duplicated, block: B:112:0x047f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0491  */
    /* JADX WARN: Code duplicated, block: B:117:0x0495  */
    /* JADX WARN: Code duplicated, block: B:119:0x049c  */
    /* JADX WARN: Code duplicated, block: B:120:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:122:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:123:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:137:0x04de  */
    /* JADX WARN: Code duplicated, block: B:139:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:141:0x0516  */
    /* JADX WARN: Code duplicated, block: B:143:0x0524  */
    /* JADX WARN: Code duplicated, block: B:145:0x052e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0531  */
    /* JADX WARN: Code duplicated, block: B:149:0x053b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0575  */
    /* JADX WARN: Code duplicated, block: B:158:0x0579  */
    /* JADX WARN: Code duplicated, block: B:161:0x057e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0581  */
    /* JADX WARN: Code duplicated, block: B:165:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:166:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:176:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x03d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x03fe A[EDGE_INSN: B:178:0x03fe->B:79:0x03fe BREAK  A[LOOP:1: B:69:0x0394->B:75:0x03cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:33:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:35:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:40:0x023a  */
    /* JADX WARN: Code duplicated, block: B:43:0x026c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0275  */
    /* JADX WARN: Code duplicated, block: B:47:0x030e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0314  */
    /* JADX WARN: Code duplicated, block: B:51:0x033c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0342  */
    /* JADX WARN: Code duplicated, block: B:55:0x034e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0352  */
    /* JADX WARN: Code duplicated, block: B:59:0x035d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0361  */
    /* JADX WARN: Code duplicated, block: B:63:0x0368  */
    /* JADX WARN: Code duplicated, block: B:65:0x0376 A[LOOP:0: B:64:0x0374->B:65:0x0376, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x038c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0396  */
    /* JADX WARN: Code duplicated, block: B:72:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x03cf A[LOOP:1: B:69:0x0394->B:75:0x03cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0400  */
    /* JADX WARN: Code duplicated, block: B:82:0x040c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0410  */
    /* JADX WARN: Code duplicated, block: B:85:0x0414  */
    /* JADX WARN: Code duplicated, block: B:87:0x0417  */
    /* JADX WARN: Code duplicated, block: B:89:0x0423  */
    /* JADX WARN: Code duplicated, block: B:90:0x0426  */
    /* JADX WARN: Code duplicated, block: B:92:0x042a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0446  */
    /* JADX WARN: Code duplicated, block: B:99:0x0456  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e A[PHI: r4 r7 r8 r9 r10
  0x003e: PHI (r4v5 o.lambdaaddGlobalPartnerParameter22) = (r4v4 o.lambdaaddGlobalPartnerParameter22), (r4v42 o.lambdaaddGlobalPartnerParameter22) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r7v1 o.deleteGlobalCallbackParameters) = (r7v0 o.deleteGlobalCallbackParameters), (r7v15 o.deleteGlobalCallbackParameters) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r8v1 o.deleteEventMetadata) = (r8v0 o.deleteEventMetadata), (r8v15 o.deleteEventMetadata) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r9v1 o.AwaitFirstLayoutModifier) = (r9v0 o.AwaitFirstLayoutModifier), (r9v6 o.AwaitFirstLayoutModifier) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x003e: PHI (r10v1 boolean) = (r10v0 boolean), (r10v4 boolean) binds: [B:8:0x003c, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0368, please report this as an issue */
    public final void read(checkAdjustAdRevenue checkadjustadrevenue, CourierApplication courierApplication, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        lambdaaddGlobalPartnerParameter22 lambdaaddglobalpartnerparameter22;
        deleteGlobalCallbackParameters deleteglobalcallbackparameters;
        deleteEventMetadata deleteeventmetadata;
        AwaitFirstLayoutModifier awaitFirstLayoutModifier;
        boolean z;
        checkForInstallReferrerInfo checkforinstallreferrerinfo;
        PlatformParagraphStyleSaverlambda1 platformParagraphStyleSaverlambda1;
        checkForInstallReferrerInfo checkforinstallreferrerinfo2;
        String str;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl;
        String strSerializer;
        FontVariationSetting fontVariationSetting;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl2;
        r8lambdachPO4eWAQ7w61QZHJUYsstdg5A4 r8lambdachpo4ewaq7w61qzhjuysstdg5a4;
        Set set;
        deleteEventMetadata deleteeventmetadata2;
        checkForInstallReferrerInfo checkforinstallreferrerinfo3;
        PushAnalyticsData pushAnalyticsData;
        PlatformParagraphStyleSaverlambda0 platformParagraphStyleSaverlambda0;
        checkForInstallReferrerInfo checkforinstallreferrerinfo4;
        String str2;
        deleteGlobalCallbackParameters deleteglobalcallbackparameters2;
        int i;
        checkForInstallReferrerInfo checkforinstallreferrerinfo5;
        boolean zWrite;
        String str3;
        PushDeepLink pushDeepLink;
        String str4;
        String str5;
        PushAnalyticsData pushAnalyticsData2;
        ArrayList arrayList;
        int i2;
        String str6;
        consume[] consumeVarArrValues;
        int length;
        int i3;
        consume consumeVar;
        int i4;
        checkForInstallReferrerInfo checkforinstallreferrerinfo6;
        String str7;
        int i5;
        int i6;
        maybeSendPoolingContainerAttach maybesendpoolingcontainerattach;
        int i7 = 2 % 2;
        int i8 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
        ResultReceiver = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            lambdaaddglobalpartnerparameter22 = this.serializer;
            lambdaaddglobalpartnerparameter22.getClass();
            checkadjustadrevenue.getClass();
            deleteglobalcallbackparameters = checkadjustadrevenue.RemoteActionCompatParcelizer;
            deleteeventmetadata = checkadjustadrevenue.serializer;
            awaitFirstLayoutModifier = checkadjustadrevenue.IconCompatParcelizer;
            z = awaitFirstLayoutModifier instanceof checkForInstallReferrerInfo;
            int i9 = 59 / 0;
            if (z) {
                checkforinstallreferrerinfo = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
            } else {
                checkforinstallreferrerinfo = null;
            }
        } else {
            lambdaaddglobalpartnerparameter22 = this.serializer;
            lambdaaddglobalpartnerparameter22.getClass();
            checkadjustadrevenue.getClass();
            deleteglobalcallbackparameters = checkadjustadrevenue.RemoteActionCompatParcelizer;
            deleteeventmetadata = checkadjustadrevenue.serializer;
            awaitFirstLayoutModifier = checkadjustadrevenue.IconCompatParcelizer;
            z = awaitFirstLayoutModifier instanceof checkForInstallReferrerInfo;
            if (z) {
                checkforinstallreferrerinfo = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
            } else {
                checkforinstallreferrerinfo = null;
            }
        }
        if (checkforinstallreferrerinfo != null) {
            long epochMilli = ZonedDateTime.now().toInstant().toEpochMilli();
            String str8 = deleteglobalcallbackparameters.serializer;
            String str9 = checkforinstallreferrerinfo.MediaDescriptionCompat;
            if (checkforinstallreferrerinfo.MediaMetadataCompat) {
                int i10 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 45;
                ResultReceiver = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (str9 != null) {
                    r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(SendPushReceiptWorker.class);
                    ((LinkedHashSet) r8lambdalmkbrrgswwtv97obrsj7trj7ai.read).add("PushReceiptAckWorker");
                    setCompositingStrategyaDBOjCE setcompositingstrategyadbojce = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    setCompositingStrategyaDBOjCE setcompositingstrategyadbojce2 = setCompositingStrategyaDBOjCE.CONNECTED;
                    setcompositingstrategyadbojce2.getClass();
                    ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).read = new toolingGraphicsLayer(new drawOutlinehn5TExg(null), setcompositingstrategyadbojce2, false, false, false, false, -1L, -1L, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(linkedHashSet));
                    String str10 = checkforinstallreferrerinfo.RatingCompat;
                    String str11 = checkforinstallreferrerinfo.MediaSessionCompatQueueItem;
                    String str12 = checkforinstallreferrerinfo.IconCompatParcelizer;
                    String str13 = checkforinstallreferrerinfo.serializer;
                    deleteeventmetadata.getClass();
                    onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0(PushNotificationParserObj.MESSAGE_ID_KEY, str9), new onViewAttachedToWindowlambda0("message_new_id", str11), new onViewAttachedToWindowlambda0("metadata", str10), new onViewAttachedToWindowlambda0("notification_message", str8), new onViewAttachedToWindowlambda0("received_at", Long.valueOf(epochMilli)), new onViewAttachedToWindowlambda0("read_at", null), new onViewAttachedToWindowlambda0("delivery_Id", str12), new onViewAttachedToWindowlambda0("category", str13), new onViewAttachedToWindowlambda0("sourceTrigger", Integer.valueOf(deleteeventmetadata.ordinal()))};
                    accessgetCompositingStrategyNrFUSIjd accessgetcompositingstrategynrfusijd = new accessgetCompositingStrategyNrFUSIjd(0);
                    for (int i12 = 0; i12 < 9; i12++) {
                        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = onviewattachedtowindowlambda0Arr[i12];
                        accessgetcompositingstrategynrfusijd.IconCompatParcelizer(onviewattachedtowindowlambda0.write, (String) onviewattachedtowindowlambda0.serializer);
                    }
                    ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai.serializer).MediaSessionCompatToken = accessgetcompositingstrategynrfusijd.IconCompatParcelizer();
                    lambdaaddglobalpartnerparameter22.read.RemoteActionCompatParcelizer(r8lambdalmkbrrgswwtv97obrsj7trj7ai.read(GraphicsLayerScope.EXPONENTIAL, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM).RemoteActionCompatParcelizer());
                }
            }
        }
        if (!z) {
            if (awaitFirstLayoutModifier instanceof checkForInstallReferrerInfo) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((checkForInstallReferrerInfo) awaitFirstLayoutModifier).serializer, foregroundTimerFiredI.DELIVERY_STATUS_CHANGED.getValue()}, getCieXyz.write())).booleanValue()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("received delivery state change silent push", new Object[0]);
                    return;
                }
            }
            if (z) {
                int i13 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                ResultReceiver = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((checkForInstallReferrerInfo) awaitFirstLayoutModifier).serializer, foregroundTimerFiredI.COURIER_GPS_OFF_FOR_X_MINUTES.getValue()}, getCieXyz.write())).booleanValue()) {
                    Timber.RemoteActionCompatParcelizer.write(new CourierGpsOffException("Courier GPS off notification received"));
                }
            }
            if (((Boolean) disableThirdPartySharingForCoppaEnabledI.read(new Object[]{awaitFirstLayoutModifier}, -162380724, zzlq.serializer(), zzlq.serializer(), zzlq.serializer(), zzlq.serializer(), 162380725)).booleanValue()) {
                awaitFirstLayoutModifier.getClass();
                maybesendpoolingcontainerattach = ((checkForInstallReferrerInfo) awaitFirstLayoutModifier).MediaBrowserCompatMediaItem;
                if (maybesendpoolingcontainerattach != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("In App message data is null");
                    return;
                }
                RecyclerViewAdapter recyclerViewAdapter = this.MediaDescriptionCompat;
                recyclerViewAdapter.getClass();
                InAppNotificationsRepository inAppNotificationsRepository = recyclerViewAdapter.serializer;
                inAppNotificationsRepository.getClass();
                WorkManagerImpl workManagerImpl = inAppNotificationsRepository.serializer;
                accesssetColorFilterjd accesssetcolorfilterjd = accesssetColorFilterjd.REPLACE;
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai2 = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(FetchInAppMessageWorker.class);
                setCompositingStrategyaDBOjCE setcompositingstrategyadbojce3 = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                setCompositingStrategyaDBOjCE setcompositingstrategyadbojce4 = setCompositingStrategyaDBOjCE.CONNECTED;
                setcompositingstrategyadbojce4.getClass();
                ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai2.serializer).read = new toolingGraphicsLayer(new drawOutlinehn5TExg(null), setcompositingstrategyadbojce4, false, false, false, false, -1L, -1L, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(linkedHashSet2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("in_app_message_data", maybesendpoolingcontainerattach.IconCompatParcelizer);
                processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags = maybesendpoolingcontainerattach.serializer;
                linkedHashMap.put(PushNotificationParserObj.MESSAGE_ID_KEY, processadapterupdatesandsetanimationflags.RemoteActionCompatParcelizer);
                linkedHashMap.put("campaign_id", processadapterupdatesandsetanimationflags.IconCompatParcelizer);
                linkedHashMap.put("execution_id", processadapterupdatesandsetanimationflags.serializer);
                linkedHashMap.put("template_id", processadapterupdatesandsetanimationflags.read);
                linkedHashMap.put("notification_id", processadapterupdatesandsetanimationflags.write);
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd = new accessgetAmbientShadowColor0d7_KjUjd(linkedHashMap);
                Okio.serializer(accessgetambientshadowcolor0d7_kjujd);
                ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai2.serializer).MediaSessionCompatToken = accessgetambientshadowcolor0d7_kjujd;
                workManagerImpl.serializer("fetch_in_app_message_work", accesssetcolorfilterjd, r8lambdalmkbrrgswwtv97obrsj7trj7ai2.read(GraphicsLayerScope.EXPONENTIAL, 30000L).RemoteActionCompatParcelizer());
                return;
            }
            if (!(!((Boolean) CourierApplication.read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1696115683, new Object[]{courierApplication}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1696115685)).booleanValue())) {
                platformParagraphStyleSaverlambda1 = this.ComponentActivity;
                platformParagraphStyleSaverlambda1.getClass();
                if (z) {
                    checkforinstallreferrerinfo2 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo2 = null;
                }
                if (checkforinstallreferrerinfo2 != null) {
                    str = checkforinstallreferrerinfo2.serializer;
                } else {
                    str = null;
                }
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) platformParagraphStyleSaverlambda1.serializer.write;
                if ((!firebaseRemoteConfigImpl.MediaDescriptionCompat() || firebaseRemoteConfigImpl.RatingCompat()) && (strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer()) != null && m1$$ExternalSyntheticOutline0.m(updateAdidI.IS_AUTO_ACCEPT_BACKGROUND_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl)) {
                    fontVariationSetting = platformParagraphStyleSaverlambda1.IconCompatParcelizer;
                    firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) fontVariationSetting.write;
                    if (firebaseRemoteConfigImpl2.RatingCompat()) {
                        if (!((AndroidFontResolveInterceptor_androidKt) fontVariationSetting.IconCompatParcelizer.serializer).serializer.get()) {
                            r8lambdachpo4ewaq7w61qzhjuysstdg5a4 = platformParagraphStyleSaverlambda1.RemoteActionCompatParcelizer;
                            if (r8lambdachpo4ewaq7w61qzhjuysstdg5a4.read.RemoteActionCompatParcelizer()) {
                                set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.serializer;
                            } else {
                                set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.IconCompatParcelizer;
                            }
                            if (onContentCardDismissed.write(set, str) && platformParagraphStyleSaverlambda1.write.IconCompatParcelizer() && deleteeventmetadata2 == deleteEventMetadata.Remote) {
                                deleteeventmetadata2 = deleteeventmetadata;
                                SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda0 = SaversKtExternalSyntheticLambda0.BACKGROUND;
                                SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver1 = this.RemoteActionCompatParcelizer;
                                saversKtNonNullValueClassSaver1.getClass();
                                saversKtExternalSyntheticLambda0.getClass();
                                BuildersKt.RemoteActionCompatParcelizer(saversKtNonNullValueClassSaver1.IconCompatParcelizer, null, null, new AutoAcceptBackgroundHandlerImpl$invoke$1(checkadjustadrevenue, saversKtNonNullValueClassSaver1, saversKtExternalSyntheticLambda0, (ShortNewsContentCardView) null), 3);
                                return;
                            }
                        }
                    } else if (firebaseRemoteConfigImpl2.MediaDescriptionCompat()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fontVariationSetting.serializer.RemoteActionCompatParcelizer(Boolean.TYPE, "auto_accept_toggle_checked"), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            if (!((AndroidFontResolveInterceptor_androidKt) fontVariationSetting.IconCompatParcelizer.serializer).serializer.get()) {
                                r8lambdachpo4ewaq7w61qzhjuysstdg5a4 = platformParagraphStyleSaverlambda1.RemoteActionCompatParcelizer;
                                if (r8lambdachpo4ewaq7w61qzhjuysstdg5a4.read.RemoteActionCompatParcelizer()) {
                                    set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.serializer;
                                } else {
                                    set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.IconCompatParcelizer;
                                }
                                if (onContentCardDismissed.write(set, str)) {
                                    deleteeventmetadata2 = deleteeventmetadata;
                                    SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda1 = SaversKtExternalSyntheticLambda0.BACKGROUND;
                                    SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver2 = this.RemoteActionCompatParcelizer;
                                    saversKtNonNullValueClassSaver2.getClass();
                                    saversKtExternalSyntheticLambda1.getClass();
                                    BuildersKt.RemoteActionCompatParcelizer(saversKtNonNullValueClassSaver2.IconCompatParcelizer, null, null, new AutoAcceptBackgroundHandlerImpl$invoke$1(checkadjustadrevenue, saversKtNonNullValueClassSaver2, saversKtExternalSyntheticLambda1, (ShortNewsContentCardView) null), 3);
                                    return;
                                }
                            }
                        }
                    }
                }
                deleteeventmetadata2 = deleteeventmetadata;
                getPositionF1C5BW0 getpositionf1c5bw0 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                getpositionf1c5bw0.getClass();
                accessgetPresscp accessgetpresscp = getpositionf1c5bw0.serializer;
                accessgetpresscp.getClass();
                PendingIntent pendingIntentIconCompatParcelizer = accessgetpresscp.IconCompatParcelizer.IconCompatParcelizer(checkadjustadrevenue, true);
                if (z) {
                    checkforinstallreferrerinfo3 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo3 = null;
                }
                access1000 access1000Var = getpositionf1c5bw0.IconCompatParcelizer;
                if (checkforinstallreferrerinfo3 != null) {
                    pushAnalyticsData = checkforinstallreferrerinfo3.write;
                } else {
                    pushAnalyticsData = null;
                }
                access1000Var.IconCompatParcelizer.logEvent("push_notification_shown", access1000Var.IconCompatParcelizer(pushAnalyticsData));
                ((s0) getpositionf1c5bw0.read).RemoteActionCompatParcelizer(checkadjustadrevenue, new Navigator$$ExternalSyntheticLambda1(checkadjustadrevenue, 26, pendingIntentIconCompatParcelizer), pendingIntentIconCompatParcelizer);
                platformParagraphStyleSaverlambda0 = this.PlaybackStateCompatCustomAction;
                platformParagraphStyleSaverlambda0.getClass();
                if (z) {
                    checkforinstallreferrerinfo4 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo4 = null;
                }
                if (checkforinstallreferrerinfo4 != null && onContentCardDismissed.write(platformParagraphStyleSaverlambda0.RemoteActionCompatParcelizer, checkforinstallreferrerinfo4.serializer) && (str2 = checkforinstallreferrerinfo4.IconCompatParcelizer) != null) {
                    BuildersKt.RemoteActionCompatParcelizer(platformParagraphStyleSaverlambda0.IconCompatParcelizer, null, null, new BridgeManager$trackEvent$2(platformParagraphStyleSaverlambda0, str2, (ShortNewsContentCardView) null, 8), 3);
                }
            } else if (deleteglobalcallbackparameters2.read != null) {
                i = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 15;
                ResultReceiver = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
                    String str14 = deleteglobalcallbackparameters2.serializer;
                    throw null;
                }
                if (deleteglobalcallbackparameters2.serializer != null) {
                    int i15 = ResultReceiver + 81;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (z) {
                        deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
                        checkforinstallreferrerinfo5 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                    } else {
                        deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
                        checkforinstallreferrerinfo5 = null;
                    }
                    zWrite = disableThirdPartySharingForCoppaEnabledI.write(checkforinstallreferrerinfo5);
                    if (zWrite) {
                        consume[] consumeVarArrValues2 = consume.values();
                        arrayList = new ArrayList(consumeVarArrValues2.length);
                        for (consume consumeVar2 : consumeVarArrValues2) {
                            arrayList.add(consumeVar2.getValue());
                        }
                        if (arrayList.contains(courierApplication.MediaSessionCompatQueueItem)) {
                            str6 = courierApplication.MediaSessionCompatQueueItem;
                            consumeVarArrValues = consume.values();
                            length = consumeVarArrValues.length;
                            i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    consumeVar = null;
                                    break;
                                }
                                i6 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                                ResultReceiver = i6 % Fields.SpotShadowColor;
                                if (i6 % 2 != 0) {
                                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{consumeVarArrValues[i3].getValue(), str6}, getCieXyz.write())).booleanValue();
                                    throw null;
                                }
                                consumeVar = consumeVarArrValues[i3];
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{consumeVar.getValue(), str6}, getCieXyz.write())).booleanValue()) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (consumeVar != null) {
                                i4 = ResultReceiver + 35;
                                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                                    Object obj = null;
                                    obj.hashCode();
                                    throw null;
                                }
                                Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                                if (z) {
                                    checkforinstallreferrerinfo6 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                                } else {
                                    checkforinstallreferrerinfo6 = null;
                                }
                                if (checkforinstallreferrerinfo6 != null) {
                                    i5 = ResultReceiver + 1;
                                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
                                    if (i5 % 2 == 0) {
                                        String str15 = checkforinstallreferrerinfo6.serializer;
                                        throw null;
                                    }
                                    str7 = checkforinstallreferrerinfo6.serializer;
                                } else {
                                    str7 = null;
                                }
                                forest2.IconCompatParcelizer(consumeVar + " is closed by sync push, message_category: " + str7, new Object[0]);
                            }
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                        }
                    }
                    String str16 = deleteglobalcallbackparameters2.read;
                    String str17 = deleteglobalcallbackparameters2.serializer;
                    if (checkforinstallreferrerinfo5 != null) {
                        str3 = checkforinstallreferrerinfo5.serializer;
                    } else {
                        str3 = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        pushDeepLink = checkforinstallreferrerinfo5.read;
                    } else {
                        pushDeepLink = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        str4 = checkforinstallreferrerinfo5.IconCompatParcelizer;
                    } else {
                        str4 = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        str5 = checkforinstallreferrerinfo5.MediaSessionCompatQueueItem;
                    } else {
                        str5 = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        pushAnalyticsData2 = checkforinstallreferrerinfo5.write;
                    } else {
                        pushAnalyticsData2 = null;
                    }
                    this.MediaSessionCompatToken.handleMessage(str16, str17, str3, zWrite, pushDeepLink, str4, str5, pushAnalyticsData2, deleteeventmetadata.name());
                    return;
                }
            }
        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((checkForInstallReferrerInfo) awaitFirstLayoutModifier).serializer, foregroundTimerFiredI.COURIER_STATUS_CHANGED.getValue()}, getCieXyz.write())).booleanValue()) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("received rider state change silent push", new Object[0]);
            processDisappeared processdisappeared = this.RatingCompat;
            if (((FirebaseRemoteConfigImpl) processdisappeared.IconCompatParcelizer).PlaybackStateCompat()) {
                int i17 = ResultReceiver + 91;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                processdisappeared.serializer.write(Calendar.getInstance());
                return;
            }
        } else {
            if (awaitFirstLayoutModifier instanceof checkForInstallReferrerInfo) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((checkForInstallReferrerInfo) awaitFirstLayoutModifier).serializer, foregroundTimerFiredI.DELIVERY_STATUS_CHANGED.getValue()}, getCieXyz.write())).booleanValue()) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("received delivery state change silent push", new Object[0]);
                    return;
                }
            }
            if (z) {
                int i19 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                ResultReceiver = i19 % Fields.SpotShadowColor;
                int i110 = i19 % 2;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((checkForInstallReferrerInfo) awaitFirstLayoutModifier).serializer, foregroundTimerFiredI.COURIER_GPS_OFF_FOR_X_MINUTES.getValue()}, getCieXyz.write())).booleanValue()) {
                    Timber.RemoteActionCompatParcelizer.write(new CourierGpsOffException("Courier GPS off notification received"));
                }
            }
            if (((Boolean) disableThirdPartySharingForCoppaEnabledI.read(new Object[]{awaitFirstLayoutModifier}, -162380724, zzlq.serializer(), zzlq.serializer(), zzlq.serializer(), zzlq.serializer(), 162380725)).booleanValue()) {
                awaitFirstLayoutModifier.getClass();
                maybesendpoolingcontainerattach = ((checkForInstallReferrerInfo) awaitFirstLayoutModifier).MediaBrowserCompatMediaItem;
                if (maybesendpoolingcontainerattach != null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("In App message data is null");
                    return;
                }
                RecyclerViewAdapter recyclerViewAdapter2 = this.MediaDescriptionCompat;
                recyclerViewAdapter2.getClass();
                InAppNotificationsRepository inAppNotificationsRepository2 = recyclerViewAdapter2.serializer;
                inAppNotificationsRepository2.getClass();
                WorkManagerImpl workManagerImpl2 = inAppNotificationsRepository2.serializer;
                accesssetColorFilterjd accesssetcolorfilterjd2 = accesssetColorFilterjd.REPLACE;
                r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai3 = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(FetchInAppMessageWorker.class);
                setCompositingStrategyaDBOjCE setcompositingstrategyadbojce5 = setCompositingStrategyaDBOjCE.NOT_REQUIRED;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                setCompositingStrategyaDBOjCE setcompositingstrategyadbojce6 = setCompositingStrategyaDBOjCE.CONNECTED;
                setcompositingstrategyadbojce6.getClass();
                ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai3.serializer).read = new toolingGraphicsLayer(new drawOutlinehn5TExg(null), setcompositingstrategyadbojce6, false, false, false, false, -1L, -1L, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(linkedHashSet3));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("in_app_message_data", maybesendpoolingcontainerattach.IconCompatParcelizer);
                processAdapterUpdatesAndSetAnimationFlags processadapterupdatesandsetanimationflags2 = maybesendpoolingcontainerattach.serializer;
                linkedHashMap2.put(PushNotificationParserObj.MESSAGE_ID_KEY, processadapterupdatesandsetanimationflags2.RemoteActionCompatParcelizer);
                linkedHashMap2.put("campaign_id", processadapterupdatesandsetanimationflags2.IconCompatParcelizer);
                linkedHashMap2.put("execution_id", processadapterupdatesandsetanimationflags2.serializer);
                linkedHashMap2.put("template_id", processadapterupdatesandsetanimationflags2.read);
                linkedHashMap2.put("notification_id", processadapterupdatesandsetanimationflags2.write);
                accessgetAmbientShadowColor0d7_KjUjd accessgetambientshadowcolor0d7_kjujd2 = new accessgetAmbientShadowColor0d7_KjUjd(linkedHashMap2);
                Okio.serializer(accessgetambientshadowcolor0d7_kjujd2);
                ((setFrom58bKbWc) r8lambdalmkbrrgswwtv97obrsj7trj7ai3.serializer).MediaSessionCompatToken = accessgetambientshadowcolor0d7_kjujd2;
                workManagerImpl2.serializer("fetch_in_app_message_work", accesssetcolorfilterjd2, r8lambdalmkbrrgswwtv97obrsj7trj7ai3.read(GraphicsLayerScope.EXPONENTIAL, 30000L).RemoteActionCompatParcelizer());
                return;
            }
            if (!(!((Boolean) CourierApplication.read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1696115683, new Object[]{courierApplication}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1696115685)).booleanValue())) {
                platformParagraphStyleSaverlambda1 = this.ComponentActivity;
                platformParagraphStyleSaverlambda1.getClass();
                if (z) {
                    checkforinstallreferrerinfo2 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo2 = null;
                }
                if (checkforinstallreferrerinfo2 != null) {
                    str = checkforinstallreferrerinfo2.serializer;
                } else {
                    str = null;
                }
                firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) platformParagraphStyleSaverlambda1.serializer.write;
                if (!firebaseRemoteConfigImpl.MediaDescriptionCompat()) {
                    fontVariationSetting = platformParagraphStyleSaverlambda1.IconCompatParcelizer;
                    firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) fontVariationSetting.write;
                    if (firebaseRemoteConfigImpl2.RatingCompat()) {
                        if (!((AndroidFontResolveInterceptor_androidKt) fontVariationSetting.IconCompatParcelizer.serializer).serializer.get()) {
                            r8lambdachpo4ewaq7w61qzhjuysstdg5a4 = platformParagraphStyleSaverlambda1.RemoteActionCompatParcelizer;
                            if (r8lambdachpo4ewaq7w61qzhjuysstdg5a4.read.RemoteActionCompatParcelizer()) {
                                set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.serializer;
                            } else {
                                set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.IconCompatParcelizer;
                            }
                            if (onContentCardDismissed.write(set, str)) {
                                deleteeventmetadata2 = deleteeventmetadata;
                                SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda2 = SaversKtExternalSyntheticLambda0.BACKGROUND;
                                SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver3 = this.RemoteActionCompatParcelizer;
                                saversKtNonNullValueClassSaver3.getClass();
                                saversKtExternalSyntheticLambda2.getClass();
                                BuildersKt.RemoteActionCompatParcelizer(saversKtNonNullValueClassSaver3.IconCompatParcelizer, null, null, new AutoAcceptBackgroundHandlerImpl$invoke$1(checkadjustadrevenue, saversKtNonNullValueClassSaver3, saversKtExternalSyntheticLambda2, (ShortNewsContentCardView) null), 3);
                                return;
                            }
                        }
                    } else if (firebaseRemoteConfigImpl2.MediaDescriptionCompat()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fontVariationSetting.serializer.RemoteActionCompatParcelizer(Boolean.TYPE, "auto_accept_toggle_checked"), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            if (!((AndroidFontResolveInterceptor_androidKt) fontVariationSetting.IconCompatParcelizer.serializer).serializer.get()) {
                                r8lambdachpo4ewaq7w61qzhjuysstdg5a4 = platformParagraphStyleSaverlambda1.RemoteActionCompatParcelizer;
                                if (r8lambdachpo4ewaq7w61qzhjuysstdg5a4.read.RemoteActionCompatParcelizer()) {
                                    set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.serializer;
                                } else {
                                    set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.IconCompatParcelizer;
                                }
                                if (onContentCardDismissed.write(set, str)) {
                                    deleteeventmetadata2 = deleteeventmetadata;
                                    SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda3 = SaversKtExternalSyntheticLambda0.BACKGROUND;
                                    SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver4 = this.RemoteActionCompatParcelizer;
                                    saversKtNonNullValueClassSaver4.getClass();
                                    saversKtExternalSyntheticLambda3.getClass();
                                    BuildersKt.RemoteActionCompatParcelizer(saversKtNonNullValueClassSaver4.IconCompatParcelizer, null, null, new AutoAcceptBackgroundHandlerImpl$invoke$1(checkadjustadrevenue, saversKtNonNullValueClassSaver4, saversKtExternalSyntheticLambda3, (ShortNewsContentCardView) null), 3);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    fontVariationSetting = platformParagraphStyleSaverlambda1.IconCompatParcelizer;
                    firebaseRemoteConfigImpl2 = (FirebaseRemoteConfigImpl) fontVariationSetting.write;
                    if (firebaseRemoteConfigImpl2.RatingCompat()) {
                        if (!((AndroidFontResolveInterceptor_androidKt) fontVariationSetting.IconCompatParcelizer.serializer).serializer.get()) {
                            r8lambdachpo4ewaq7w61qzhjuysstdg5a4 = platformParagraphStyleSaverlambda1.RemoteActionCompatParcelizer;
                            if (r8lambdachpo4ewaq7w61qzhjuysstdg5a4.read.RemoteActionCompatParcelizer()) {
                                set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.serializer;
                            } else {
                                set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.IconCompatParcelizer;
                            }
                            if (onContentCardDismissed.write(set, str)) {
                                deleteeventmetadata2 = deleteeventmetadata;
                                SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda4 = SaversKtExternalSyntheticLambda0.BACKGROUND;
                                SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver5 = this.RemoteActionCompatParcelizer;
                                saversKtNonNullValueClassSaver5.getClass();
                                saversKtExternalSyntheticLambda4.getClass();
                                BuildersKt.RemoteActionCompatParcelizer(saversKtNonNullValueClassSaver5.IconCompatParcelizer, null, null, new AutoAcceptBackgroundHandlerImpl$invoke$1(checkadjustadrevenue, saversKtNonNullValueClassSaver5, saversKtExternalSyntheticLambda4, (ShortNewsContentCardView) null), 3);
                                return;
                            }
                        }
                    } else if (firebaseRemoteConfigImpl2.MediaDescriptionCompat()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{fontVariationSetting.serializer.RemoteActionCompatParcelizer(Boolean.TYPE, "auto_accept_toggle_checked"), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            if (!((AndroidFontResolveInterceptor_androidKt) fontVariationSetting.IconCompatParcelizer.serializer).serializer.get()) {
                                r8lambdachpo4ewaq7w61qzhjuysstdg5a4 = platformParagraphStyleSaverlambda1.RemoteActionCompatParcelizer;
                                if (r8lambdachpo4ewaq7w61qzhjuysstdg5a4.read.RemoteActionCompatParcelizer()) {
                                    set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.serializer;
                                } else {
                                    set = r8lambdachpo4ewaq7w61qzhjuysstdg5a4.IconCompatParcelizer;
                                }
                                if (onContentCardDismissed.write(set, str)) {
                                    deleteeventmetadata2 = deleteeventmetadata;
                                    SaversKtExternalSyntheticLambda0 saversKtExternalSyntheticLambda5 = SaversKtExternalSyntheticLambda0.BACKGROUND;
                                    SaversKtNonNullValueClassSaver1 saversKtNonNullValueClassSaver6 = this.RemoteActionCompatParcelizer;
                                    saversKtNonNullValueClassSaver6.getClass();
                                    saversKtExternalSyntheticLambda5.getClass();
                                    BuildersKt.RemoteActionCompatParcelizer(saversKtNonNullValueClassSaver6.IconCompatParcelizer, null, null, new AutoAcceptBackgroundHandlerImpl$invoke$1(checkadjustadrevenue, saversKtNonNullValueClassSaver6, saversKtExternalSyntheticLambda5, (ShortNewsContentCardView) null), 3);
                                    return;
                                }
                            }
                        }
                    }
                }
                deleteeventmetadata2 = deleteeventmetadata;
                getPositionF1C5BW0 getpositionf1c5bw1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                getpositionf1c5bw1.getClass();
                accessgetPresscp accessgetpresscp2 = getpositionf1c5bw1.serializer;
                accessgetpresscp2.getClass();
                PendingIntent pendingIntentIconCompatParcelizer2 = accessgetpresscp2.IconCompatParcelizer.IconCompatParcelizer(checkadjustadrevenue, true);
                if (z) {
                    checkforinstallreferrerinfo3 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo3 = null;
                }
                access1000 access1000Var2 = getpositionf1c5bw1.IconCompatParcelizer;
                if (checkforinstallreferrerinfo3 != null) {
                    pushAnalyticsData = checkforinstallreferrerinfo3.write;
                } else {
                    pushAnalyticsData = null;
                }
                access1000Var2.IconCompatParcelizer.logEvent("push_notification_shown", access1000Var2.IconCompatParcelizer(pushAnalyticsData));
                ((s0) getpositionf1c5bw1.read).RemoteActionCompatParcelizer(checkadjustadrevenue, new Navigator$$ExternalSyntheticLambda1(checkadjustadrevenue, 26, pendingIntentIconCompatParcelizer2), pendingIntentIconCompatParcelizer2);
                platformParagraphStyleSaverlambda0 = this.PlaybackStateCompatCustomAction;
                platformParagraphStyleSaverlambda0.getClass();
                if (z) {
                    checkforinstallreferrerinfo4 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                } else {
                    checkforinstallreferrerinfo4 = null;
                }
                if (checkforinstallreferrerinfo4 != null) {
                    BuildersKt.RemoteActionCompatParcelizer(platformParagraphStyleSaverlambda0.IconCompatParcelizer, null, null, new BridgeManager$trackEvent$2(platformParagraphStyleSaverlambda0, str2, (ShortNewsContentCardView) null, 8), 3);
                }
            } else if (deleteglobalcallbackparameters2.read != null) {
                i = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 15;
                ResultReceiver = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
                    String str18 = deleteglobalcallbackparameters2.serializer;
                    throw null;
                }
                if (deleteglobalcallbackparameters2.serializer != null) {
                    int i111 = ResultReceiver + 81;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i111 % Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                    if (z) {
                        deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
                        checkforinstallreferrerinfo5 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                    } else {
                        deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
                        checkforinstallreferrerinfo5 = null;
                    }
                    zWrite = disableThirdPartySharingForCoppaEnabledI.write(checkforinstallreferrerinfo5);
                    if (zWrite) {
                        consume[] consumeVarArrValues3 = consume.values();
                        arrayList = new ArrayList(consumeVarArrValues3.length);
                        while (i2 < r3) {
                            arrayList.add(consumeVar2.getValue());
                        }
                        if (arrayList.contains(courierApplication.MediaSessionCompatQueueItem)) {
                            str6 = courierApplication.MediaSessionCompatQueueItem;
                            consumeVarArrValues = consume.values();
                            length = consumeVarArrValues.length;
                            i3 = 0;
                            while (true) {
                                if (i3 < length) {
                                    consumeVar = null;
                                    break;
                                }
                                i6 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 63;
                                ResultReceiver = i6 % Fields.SpotShadowColor;
                                if (i6 % 2 != 0) {
                                    ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{consumeVarArrValues[i3].getValue(), str6}, getCieXyz.write())).booleanValue();
                                    throw null;
                                }
                                consumeVar = consumeVarArrValues[i3];
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{consumeVar.getValue(), str6}, getCieXyz.write())).booleanValue()) {
                                    break;
                                    break;
                                }
                                i3++;
                            }
                            if (consumeVar != null) {
                                i4 = ResultReceiver + 35;
                                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 == 0) {
                                    Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                                    Object obj2 = null;
                                    obj2.hashCode();
                                    throw null;
                                }
                                Timber.Forest forest4 = Timber.RemoteActionCompatParcelizer;
                                if (z) {
                                    checkforinstallreferrerinfo6 = (checkForInstallReferrerInfo) awaitFirstLayoutModifier;
                                } else {
                                    checkforinstallreferrerinfo6 = null;
                                }
                                if (checkforinstallreferrerinfo6 != null) {
                                    i5 = ResultReceiver + 1;
                                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
                                    if (i5 % 2 == 0) {
                                        String str19 = checkforinstallreferrerinfo6.serializer;
                                        throw null;
                                    }
                                    str7 = checkforinstallreferrerinfo6.serializer;
                                } else {
                                    str7 = null;
                                }
                                forest4.IconCompatParcelizer(consumeVar + " is closed by sync push, message_category: " + str7, new Object[0]);
                            }
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
                        }
                    }
                    String str110 = deleteglobalcallbackparameters2.read;
                    String str111 = deleteglobalcallbackparameters2.serializer;
                    if (checkforinstallreferrerinfo5 != null) {
                        str3 = checkforinstallreferrerinfo5.serializer;
                    } else {
                        str3 = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        pushDeepLink = checkforinstallreferrerinfo5.read;
                    } else {
                        pushDeepLink = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        str4 = checkforinstallreferrerinfo5.IconCompatParcelizer;
                    } else {
                        str4 = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        str5 = checkforinstallreferrerinfo5.MediaSessionCompatQueueItem;
                    } else {
                        str5 = null;
                    }
                    if (checkforinstallreferrerinfo5 != null) {
                        pushAnalyticsData2 = checkforinstallreferrerinfo5.write;
                    } else {
                        pushAnalyticsData2 = null;
                    }
                    this.MediaSessionCompatToken.handleMessage(str110, str111, str3, zWrite, pushDeepLink, str4, str5, pushAnalyticsData2, deleteeventmetadata.name());
                    return;
                }
            }
        }
        deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
        deleteglobalcallbackparameters2 = deleteglobalcallbackparameters;
        int i20 = ResultReceiver + 123;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i20 % Fields.SpotShadowColor;
        int i21 = i20 % 2;
    }
}
