package com.foodora.courier.push.messages.services;

import android.content.Context;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner$cancel$1;
import bo.app.hg$$ExternalSyntheticLambda5;
import bo.app.n5;
import com.foodora.courier.app.application.CourierApplication;
import com.google.re2j.Parser;
import com.huawei.hms.push.HmsMessageService;
import com.qualtrics.digital.ClientSideIntercept;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.notifications.PendingIntentBuilderImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.fwf.genii.Gen2FunWithFlagsConfigRepository;
import dagger.Lazy;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import o.BrazeExternalSyntheticLambda5;
import o.EditingBufferKt;
import o.GraphicsLayerCompanion;
import o.GraphicsLayerclipDrawBlock1;
import o.InputMethodManagerImpl;
import o.ShortNewsContentCardView;
import o.accessgetPresscp;
import o.cancelCompositionui_text;
import o.checkAdjustAdRevenue;
import o.colorResource;
import o.consume;
import o.deleteGlobalPartnerParameters;
import o.disableThirdPartySharingForCoppaEnabledI;
import o.getActionViewIntentlambda0;
import o.getCieXyz;
import o.getColorIntegerOrNull;
import o.getContentViewGroupParentLayout;
import o.getGestureEnd5zf0vsI;
import o.getIdJ3iCeTQ;
import o.getMinWidth;
import o.getPreviousPressed;
import o.getPreviousUptimeMillis;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X;
import o.mergeJsonObjects;
import o.parseLayoutDescription;
import o.q3;
import o.removeNodeAtDepth;
import o.s0;
import o.transferSessionPackageI;
import o.unregisterOnChangedCallback;
import o.updateAdidI;

/* JADX INFO: loaded from: classes2.dex */
public final class HmsPushMessagingService extends HmsMessageService {
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public Lazy ComponentActivity;
    public SendTestPushUseCase IconCompatParcelizer;
    public transferSessionPackageI MediaBrowserCompatMediaItem;
    public getGestureEnd5zf0vsI MediaDescriptionCompat;
    public getPreviousPressed MediaMetadataCompat;
    public accessgetPresscp MediaSessionCompatQueueItem;
    public getPreviousUptimeMillis MediaSessionCompatResultReceiverWrapper;
    public SendTestPushUseCase MediaSessionCompatToken;
    public colorResource ParcelableVolumeInfo;
    public TraceTimeMeasurementWithPerformanceKit PlaybackStateCompat;
    public deleteGlobalPartnerParameters PlaybackStateCompatCustomAction;
    public getIdJ3iCeTQ RatingCompat;
    public CourierApplication read;
    public CustomerChatProviderImpl serializer;
    public parseLayoutDescription write;

    public final CourierApplication IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 27;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
        CourierApplication courierApplication = this.read;
        if (courierApplication == null) {
            removeNodeAtDepth.serializer("app");
            throw null;
        }
        int i4 = i2 + 27;
        int i5 = i4 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5;
        if (i4 % 2 == 0) {
            int i6 = 12 / 0;
        }
        int i7 = i5 + 15;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return courierApplication;
    }

    public final getMinWidth RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i3 = i2 + 21;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getGestureEnd5zf0vsI getgestureend5zf0vsi = this.MediaDescriptionCompat;
        if (getgestureend5zf0vsi == null) {
            removeNodeAtDepth.serializer("dispatcherChat");
            throw null;
        }
        int i5 = i2 + 119;
        int i6 = i5 % Fields.SpotShadowColor;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 65;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 69 / 0;
        }
        return getgestureend5zf0vsi;
    }

    public final CustomerChatProviderImpl write() {
        int i = 2 % 2;
        CustomerChatProviderImpl customerChatProviderImpl = this.serializer;
        if (customerChatProviderImpl == null) {
            removeNodeAtDepth.serializer("customerChatInitializer");
            throw null;
        }
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 39;
        int i3 = i2 % Fields.SpotShadowColor;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return customerChatProviderImpl;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        o.removeNodeAtDepth.serializer("traceTimeMeasurement");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r1.read("push_e2e_hms", new com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6(r5, 5, r4));
        r5 = com.foodora.courier.push.messages.services.HmsPushMessagingService.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 33;
        com.foodora.courier.push.messages.services.HmsPushMessagingService.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    @Override // com.huawei.hms.push.HmsMessageService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(com.huawei.hms.push.RemoteMessage r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.foodora.courier.push.messages.services.HmsPushMessagingService.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.foodora.courier.push.messages.services.HmsPushMessagingService.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L16
            com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit r1 = r4.PlaybackStateCompat
            r2 = 6
            int r2 = r2 / 0
            if (r1 == 0) goto L2f
            goto L1a
        L16:
            com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit r1 = r4.PlaybackStateCompat
            if (r1 == 0) goto L2f
        L1a:
            com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6 r2 = new com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6
            r3 = 5
            r2.<init>(r5, r3, r4)
            java.lang.String r5 = "push_e2e_hms"
            r1.read(r5, r2)
            int r5 = com.foodora.courier.push.messages.services.HmsPushMessagingService.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus
            int r5 = r5 + 33
            int r1 = r5 % 128
            com.foodora.courier.push.messages.services.HmsPushMessagingService.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r1
            int r5 = r5 % r0
            return
        L2f:
            java.lang.String r5 = "traceTimeMeasurement"
            o.removeNodeAtDepth.serializer(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foodora.courier.push.messages.services.HmsPushMessagingService.onMessageReceived(com.huawei.hms.push.RemoteMessage):void");
    }

    public final void serializer(checkAdjustAdRevenue checkadjustadrevenue) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 45;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        deleteGlobalPartnerParameters deleteglobalpartnerparameters = this.PlaybackStateCompatCustomAction;
        if (deleteglobalpartnerparameters == null) {
            removeNodeAtDepth.serializer("pushNotificationManager");
            throw null;
        }
        hg$$ExternalSyntheticLambda5 hg__externalsyntheticlambda5 = new hg$$ExternalSyntheticLambda5(11);
        accessgetPresscp accessgetpresscp = this.MediaSessionCompatQueueItem;
        if (accessgetpresscp == null) {
            removeNodeAtDepth.serializer("pendingIntentBuilder");
            throw null;
        }
        ((s0) deleteglobalpartnerparameters).RemoteActionCompatParcelizer(checkadjustadrevenue, hg__externalsyntheticlambda5, accessgetpresscp.IconCompatParcelizer.IconCompatParcelizer(checkadjustadrevenue, true));
        int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 105;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 23 / 0;
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService
    public final void onNewToken(String str) {
        int i = 2 % 2;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 15;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            str.getClass();
            super.onNewToken(str);
            throw null;
        }
        str.getClass();
        super.onNewToken(str);
        transferSessionPackageI transfersessionpackagei = this.MediaBrowserCompatMediaItem;
        if (transfersessionpackagei == null) {
            removeNodeAtDepth.serializer("firebaseRemoteConfig");
            throw null;
        }
        if (!(!((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_PUSH_NOTIFICATION_FOR_APPLICANT_ENABLED))) {
            colorResource colorresource = this.ParcelableVolumeInfo;
            if (colorresource != null) {
                BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) colorresource.IconCompatParcelizer, null, null, new BlockRunner$cancel$1(colorresource, (ShortNewsContentCardView) null, 28), 3);
                return;
            } else {
                removeNodeAtDepth.serializer("registerPushToken");
                throw null;
            }
        }
        getPreviousUptimeMillis getpreviousuptimemillis = this.MediaSessionCompatResultReceiverWrapper;
        if (getpreviousuptimemillis == null) {
            removeNodeAtDepth.serializer("triggerPushTokenUpdate");
            throw null;
        }
        int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 17;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        getpreviousuptimemillis.write(str, "new_push_huawei_token");
        int i5 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 111;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0110  */
    /* JADX WARN: Code duplicated, block: B:36:0x0128  */
    /* JADX WARN: Code duplicated, block: B:40:0x0130  */
    public final void serializer(Map map, boolean z) {
        Lazy lazy;
        int i = 2 % 2;
        unregisterOnChangedCallback unregisteronchangedcallback = (unregisterOnChangedCallback) CustomerChatProviderImpl.RemoteActionCompatParcelizer(ClientSideIntercept.RemoteActionCompatParcelizer(), -693785403, 693785404, new Object[]{write(), map}, ClientSideIntercept.RemoteActionCompatParcelizer(), ClientSideIntercept.RemoteActionCompatParcelizer(), ClientSideIntercept.RemoteActionCompatParcelizer());
        if (unregisteronchangedcallback != null) {
            int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 1;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
            Object obj = null;
            if (i2 % 2 == 0) {
                String str = unregisteronchangedcallback.IconCompatParcelizer;
                String str2 = unregisteronchangedcallback.RemoteActionCompatParcelizer;
                String str3 = unregisteronchangedcallback.read;
                ((Boolean) CourierApplication.read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1696115683, new Object[]{IconCompatParcelizer()}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1696115685)).booleanValue();
                throw null;
            }
            String str4 = unregisteronchangedcallback.IconCompatParcelizer;
            String str5 = unregisteronchangedcallback.RemoteActionCompatParcelizer;
            String str6 = unregisteronchangedcallback.read;
            if (!((Boolean) CourierApplication.read(InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), -1696115683, new Object[]{IconCompatParcelizer()}, InputMethodManagerImpl.RemoteActionCompatParcelizer(), InputMethodManagerImpl.RemoteActionCompatParcelizer(), 1696115685)).booleanValue()) {
                serializer(disableThirdPartySharingForCoppaEnabledI.IconCompatParcelizer(unregisteronchangedcallback));
                return;
            }
            if (!(!write().write())) {
                SendTestPushUseCase sendTestPushUseCase = this.IconCompatParcelizer;
                if (sendTestPushUseCase == null) {
                    removeNodeAtDepth.serializer("checkShouldUpdateActionableChatNotifications");
                    throw null;
                }
                int i3 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 73;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (sendTestPushUseCase.RemoteActionCompatParcelizer(z)) {
                    int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 9;
                    r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    Lazy lazy2 = this.ComponentActivity;
                    if (lazy2 != null) {
                        ((EditingBufferKt) lazy2.write()).IconCompatParcelizer(new GraphicsLayerclipDrawBlock1(str6, str5, str4));
                        return;
                    } else {
                        removeNodeAtDepth.serializer("updateActionableChatNotifications");
                        throw null;
                    }
                }
                return;
            }
            int i7 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 89;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{IconCompatParcelizer().MediaSessionCompatQueueItem, consume.Main.getValue()}, getCieXyz.write())).booleanValue()) {
                SendTestPushUseCase sendTestPushUseCase2 = this.IconCompatParcelizer;
                if (sendTestPushUseCase2 == null) {
                    removeNodeAtDepth.serializer("checkShouldUpdateActionableChatNotifications");
                    throw null;
                }
                int i9 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 77;
                r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    boolean zRemoteActionCompatParcelizer = sendTestPushUseCase2.RemoteActionCompatParcelizer(z);
                    int i10 = 92 / 0;
                    if (zRemoteActionCompatParcelizer) {
                        lazy = this.ComponentActivity;
                        if (lazy != null) {
                            removeNodeAtDepth.serializer("updateActionableChatNotifications");
                            throw null;
                        }
                        ((EditingBufferKt) lazy.write()).IconCompatParcelizer(new GraphicsLayerclipDrawBlock1(str6, str5, str4));
                        int i11 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 103;
                        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                    } else {
                        serializer(disableThirdPartySharingForCoppaEnabledI.IconCompatParcelizer(unregisteronchangedcallback));
                    }
                } else if (sendTestPushUseCase2.RemoteActionCompatParcelizer(z)) {
                    lazy = this.ComponentActivity;
                    if (lazy != null) {
                        removeNodeAtDepth.serializer("updateActionableChatNotifications");
                        throw null;
                    }
                    ((EditingBufferKt) lazy.write()).IconCompatParcelizer(new GraphicsLayerclipDrawBlock1(str6, str5, str4));
                    int i13 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 103;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                } else {
                    serializer(disableThirdPartySharingForCoppaEnabledI.IconCompatParcelizer(unregisteronchangedcallback));
                }
            } else {
                serializer(disableThirdPartySharingForCoppaEnabledI.IconCompatParcelizer(unregisteronchangedcallback));
            }
            write().RemoteActionCompatParcelizer();
            int i15 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 45;
            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service
    public final void onCreate() {
        int i = 2 % 2;
        super.onCreate();
        CourierApplication courierApplication = CourierApplication.write;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        this.read = (CourierApplication) applicationContext;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X getstyleable_vector_drawable_group_translate_x = IconCompatParcelizer().read().r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw._init_lambda2;
        this.ParcelableVolumeInfo = getstyleable_vector_drawable_group_translate_x.RemoteActionCompatParcelizer();
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = getstyleable_vector_drawable_group_translate_x.write;
        this.MediaBrowserCompatMediaItem = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
        this.PlaybackStateCompatCustomAction = (deleteGlobalPartnerParameters) getstyleable_vector_drawable_group_rotation.TapGestureDetectorKtdetectTapAndPress21.write();
        q3 q3VarAddOnPictureInPictureModeChangedListener = getstyleable_vector_drawable_group_rotation.addOnPictureInPictureModeChangedListener();
        Parser.Pair pairMediaBrowserCompatMediaItem = getstyleable_vector_drawable_group_rotation.MediaBrowserCompatMediaItem();
        getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
        CourierApplication courierApplication2 = getstyleable_vector_drawable_group_rotation.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        this.MediaSessionCompatQueueItem = new accessgetPresscp(new PendingIntentBuilderImpl(q3VarAddOnPictureInPictureModeChangedListener, pairMediaBrowserCompatMediaItem, getactionviewintentlambda0, courierApplication2, new BrazeExternalSyntheticLambda5(3)));
        this.read = courierApplication2;
        this.serializer = (CustomerChatProviderImpl) getstyleable_vector_drawable_group_rotation.GestureNodeKtExternalSyntheticLambda0.write();
        this.MediaMetadataCompat = getstyleable_vector_drawable_group_rotation.addOnTrimMemoryListener();
        this.MediaSessionCompatResultReceiverWrapper = getstyleable_vector_drawable_group_translate_x.IconCompatParcelizer();
        this.RatingCompat = getstyleable_vector_drawable_group_rotation.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        this.write = (parseLayoutDescription) getstyleable_vector_drawable_group_rotation.removeOnConfigurationChangedListener.write();
        int iIconCompatParcelizer = n5.IconCompatParcelizer();
        int iIconCompatParcelizer2 = n5.IconCompatParcelizer();
        this.MediaDescriptionCompat = (getGestureEnd5zf0vsI) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(246983860, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -246983855, iIconCompatParcelizer, n5.IconCompatParcelizer(), iIconCompatParcelizer2);
        this.ComponentActivity = getColorIntegerOrNull.serializer((mergeJsonObjects) getstyleable_vector_drawable_group_translate_x.onMultiWindowModeChanged);
        Gen2FunWithFlagsConfigRepository gen2FunWithFlagsConfigRepository = (Gen2FunWithFlagsConfigRepository) getstyleable_vector_drawable_group_rotation.ScrollableNode.write();
        gen2FunWithFlagsConfigRepository.getClass();
        this.IconCompatParcelizer = new SendTestPushUseCase(new InitializeAppStartupItemsImpl(new GraphicsLayerCompanion(gen2FunWithFlagsConfigRepository), (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write()));
        this.MediaSessionCompatToken = new SendTestPushUseCase(new EditingBufferKt((cancelCompositionui_text) getstyleable_vector_drawable_group_rotation.MediaMetadataCompat.write()));
        int iIconCompatParcelizer3 = n5.IconCompatParcelizer();
        int iIconCompatParcelizer4 = n5.IconCompatParcelizer();
        this.PlaybackStateCompat = (TraceTimeMeasurementWithPerformanceKit) getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION.read(1568881057, new Object[]{getstyleable_vector_drawable_group_rotation}, n5.IconCompatParcelizer(), -1568881038, iIconCompatParcelizer3, n5.IconCompatParcelizer(), iIconCompatParcelizer4);
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 85;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.huawei.hms.push.HmsMessageService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
