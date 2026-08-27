package o;

import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.helpcenter.businessmetrics.BusinessMetricsTracker;
import com.roadrunner.helpcenter.businessmetrics.BusinessMetricsTracker$runTimer$1;
import com.roadrunner.helpcenter.businessmetrics.repo.BusinessMetricsRepository;
import com.roadrunner.helpcenter.dispatcher_chat.WebDispatcherChat;
import com.roadrunner.helpcenter.presentation.activity.HelpCenterActivityViewModel$checkRootedDevice$1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.rider.support.implementation.RiderSupportRootedCheckImpl;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import com.sentiance.core.model.events.H$b;
import io.grpc.internal.SharedResourcePool;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getLoaderManager extends androidx.lifecycle.ViewModel {
    private static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = 0;
    private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;
    public final SemanticsPropertiesContentDescription1 ComponentActivity;
    public final setConstraintSet IconCompatParcelizer;
    public final setFirstVerticalBias MediaBrowserCompatMediaItem;
    public final transferSessionPackageI MediaDescriptionCompat;
    public final RectManager MediaMetadataCompat;
    public final CustomerChatCommunicatorImpl MediaSessionCompatQueueItem;
    public final OtpLogger MediaSessionCompatResultReceiverWrapper;
    public final getFragmentManager MediaSessionCompatToken;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public final SendTestPushUseCase PlaybackStateCompatCustomAction;
    public final getExitAnim RatingCompat;
    public final SendTestPushUseCase RemoteActionCompatParcelizer;
    public final setHorizontalStyle ResultReceiver;
    public final SharedResourcePool r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final H$b r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final setTransactionSuccessful r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final isAdapterPositionOnScreen r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final WebDispatcherChat r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final RiderSupportRootedCheckImpl r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final getExitTransition read;
    public final setUdmandroid_sdk_base_release serializer;
    public final BusinessMetricsTracker write;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = i3 | i2 | (~i6);
        int i8 = (~((~i3) | i2)) | (~(i3 | i6));
        int i9 = (~(i6 | (~i2))) | i3;
        int i10 = i3 + i2 + i4 + ((-1069702238) * i) + (1645725337 * i5);
        int i11 = i10 * i10;
        int i12 = ((i3 * 2084108943) - 1824784384) + (2084108943 * i2) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i4) + ((-1977090048) * i) + (448004096 * i5) + (1807155200 * i11);
        int i13 = (i3 * (-999696423)) + 1136243370 + (i2 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i4 * (-999695593)) + (i * 636963214) + (i5 * (-1077364033)) + (i11 * 980484096);
        return i12 + ((i13 * i13) * 1287192576) != 1 ? read(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    public final SharedResourcePool write() {
        int i = 2 % 2;
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 3;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3;
        int i4 = i2 % 2;
        SharedResourcePool sharedResourcePool = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i5 = i3 + 123;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return sharedResourcePool;
    }

    public getLoaderManager(SemanticsPropertiesContentDescription1 semanticsPropertiesContentDescription1, SendTestPushUseCase sendTestPushUseCase, SendTestPushUseCase sendTestPushUseCase2, setTransactionSuccessful settransactionsuccessful, RectManager rectManager, SharedResourcePool sharedResourcePool, transferSessionPackageI transfersessionpackagei, WebDispatcherChat webDispatcherChat, setConstraintSet setconstraintset, BusinessMetricsTracker businessMetricsTracker, CustomerChatCommunicatorImpl customerChatCommunicatorImpl, OtpLogger otpLogger, H$b h$b, setUdmandroid_sdk_base_release setudmandroid_sdk_base_release, RiderSupportRootedCheckImpl riderSupportRootedCheckImpl, getFragmentManager getfragmentmanager, getExitAnim getexitanim, setFirstVerticalBias setfirstverticalbias, setHorizontalStyle sethorizontalstyle, getExitTransition getexittransition) {
        semanticsPropertiesContentDescription1.getClass();
        sendTestPushUseCase.getClass();
        sendTestPushUseCase2.getClass();
        settransactionsuccessful.getClass();
        rectManager.getClass();
        sharedResourcePool.getClass();
        transfersessionpackagei.getClass();
        webDispatcherChat.getClass();
        setconstraintset.getClass();
        businessMetricsTracker.getClass();
        customerChatCommunicatorImpl.getClass();
        otpLogger.getClass();
        h$b.getClass();
        setudmandroid_sdk_base_release.getClass();
        riderSupportRootedCheckImpl.getClass();
        getfragmentmanager.getClass();
        getexitanim.getClass();
        setfirstverticalbias.getClass();
        sethorizontalstyle.getClass();
        this.ComponentActivity = semanticsPropertiesContentDescription1;
        this.PlaybackStateCompatCustomAction = sendTestPushUseCase;
        this.RemoteActionCompatParcelizer = sendTestPushUseCase2;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = settransactionsuccessful;
        this.MediaMetadataCompat = rectManager;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = sharedResourcePool;
        this.MediaDescriptionCompat = transfersessionpackagei;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = webDispatcherChat;
        this.IconCompatParcelizer = setconstraintset;
        this.write = businessMetricsTracker;
        this.MediaSessionCompatQueueItem = customerChatCommunicatorImpl;
        this.MediaSessionCompatResultReceiverWrapper = otpLogger;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = h$b;
        this.serializer = setudmandroid_sdk_base_release;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = riderSupportRootedCheckImpl;
        this.MediaSessionCompatToken = getfragmentmanager;
        this.RatingCompat = getexitanim;
        this.MediaBrowserCompatMediaItem = setfirstverticalbias;
        this.ResultReceiver = sethorizontalstyle;
        this.read = getexittransition;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new isAdapterPositionOnScreen(new RoomDatabaseExternalSyntheticLambda4(1));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void RemoteActionCompatParcelizer(String str) {
        getListParameter getlistparameter;
        invokeSuspendcomroadrunnerremoteconfigfirebaseanalyticsFirebaseFlagLoggerImpllogTrackedFirebaseFlags111 invokesuspendcomroadrunnerremoteconfigfirebaseanalyticsfirebaseflagloggerimpllogtrackedfirebaseflags111;
        str.getClass();
        SendTestPushUseCase sendTestPushUseCase = this.RemoteActionCompatParcelizer;
        sendTestPushUseCase.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            getlistparameter = (getListParameter) ((r8lambda3kmCh7YKlPUi_5SMGAzRgcZHGLc) sendTestPushUseCase.serializer).serializer(str, getUserVisibleHint.serializer);
        } catch (SerializationException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Bridge provider failed to parse message.", new Object[0]);
            getlistparameter = null;
        }
        if (getlistparameter == null) {
            RemoteActionCompatParcelizer(invokeSuspendcomroadrunnerremoteconfigfirebaseanalyticsFirebaseFlagLoggerImpllogTrackedFirebaseFlags111.ERROR_BRIDGE_MSG_SERIALIZATION);
            EnumColumnAdapter.serializer(this.serializer.read, "help_center_bridge_communication_failed", executeAsList.INFRA, "Failed to parse Help Center Bridge Message");
            if (((FirebaseRemoteConfigImpl) this.MediaDescriptionCompat).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                this.RemoteActionCompatParcelizer.getClass();
                RemoteActionCompatParcelizer(SendTestPushUseCase.read("ERROR_BRIDGE_MSG_SERIALIZATION"));
                RatingCompat();
                return;
            }
            return;
        }
        this.RemoteActionCompatParcelizer.getClass();
        isMap ismap = (setCarryoverInAppMessage.read(getlistparameter.serializer(), "_ACK", false) || !getTargetFragment.read.contains(getlistparameter.serializer())) ? null : new isMap(getlistparameter.RemoteActionCompatParcelizer(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(getlistparameter.serializer(), "_ACK"));
        if (ismap != null) {
            RemoteActionCompatParcelizer(ismap);
        }
        String strSerializer = getlistparameter.serializer();
        int i = 1;
        switch (strSerializer.hashCode()) {
            case -2111344888:
                if (strSerializer.equals("HELPCENTER_ASKS_FOR_SHUTDOWN")) {
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(getReenterTransition.serializer);
                    return;
                }
                return;
            case -1796266542:
                if (strSerializer.equals("HOST_SENDS_AUTO_CHAT_PARAMS_ACK")) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("log", new Object[0]);
                    WebDispatcherChat webDispatcherChat = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    webDispatcherChat.MediaBrowserCompatMediaItem = true;
                    webDispatcherChat.PlaybackStateCompat = 0;
                    WebDispatcherChat.write(-1410168088, sourceInformationContextOfdefault.read(), 1410168089, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), new Object[]{webDispatcherChat}, sourceInformationContextOfdefault.read());
                    return;
                }
                return;
            case -834679791:
                if (strSerializer.equals("HELPCENTER_INIT_IS_DONE")) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Help center init is done, activating web dispatcher chat.", new Object[0]);
                    WebDispatcherChat webDispatcherChat2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    webDispatcherChat2.MediaBrowserCompatMediaItem = true;
                    webDispatcherChat2.PlaybackStateCompat = 0;
                    WebDispatcherChat.write(-1410168088, sourceInformationContextOfdefault.read(), 1410168089, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), new Object[]{webDispatcherChat2}, sourceInformationContextOfdefault.read());
                    getExitAnim getexitanim = this.RatingCompat;
                    synchronized (getexitanim.write) {
                        getexitanim.MediaBrowserCompatMediaItem.getClass();
                        getexitanim.read = Long.valueOf(System.currentTimeMillis());
                    }
                    if (((FirebaseRemoteConfigImpl) this.MediaDescriptionCompat).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_HELP_CENTER_NATIVE_LOADING_IMPROVEMENTS_ENABLED.getFirebaseFlagName())) {
                        this.ParcelableVolumeInfo = BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new DividerUiModelImpl$1(this, shortNewsContentCardView, 5), 3);
                        return;
                    }
                    return;
                }
                return;
            case -618417531:
                if (strSerializer.equals("HELPCENTER_WILL_NOT_HANDLE_BACK_NAVIGATION")) {
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(getReturnTransition.serializer);
                    return;
                }
                return;
            case -548232453:
                if (strSerializer.equals("HELPCENTER_INIT_STARTED")) {
                    getExitAnim getexitanim2 = this.RatingCompat;
                    synchronized (getexitanim2.write) {
                        getexitanim2.MediaBrowserCompatMediaItem.getClass();
                        getexitanim2.IconCompatParcelizer = Long.valueOf(System.currentTimeMillis());
                    }
                    this.RemoteActionCompatParcelizer.getClass();
                    RemoteActionCompatParcelizer(new reportImageLoadingTimeTrace(new FlexBuffersFlexBufferException(getTargetFragment.read)));
                    return;
                }
                return;
            case -371619065:
                if (strSerializer.equals("CLIENT_CRITICAL_CONTENT_RENDERED")) {
                    this.MediaSessionCompatToken.write();
                    if (((FirebaseRemoteConfigImpl) this.MediaDescriptionCompat).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_HELP_CENTER_NATIVE_LOADING_IMPROVEMENTS_ENABLED.getFirebaseFlagName())) {
                        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.ParcelableVolumeInfo;
                        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                        }
                        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(getSharedElementEnterTransition.RemoteActionCompatParcelizer);
                    }
                    getExitAnim getexitanim3 = this.RatingCompat;
                    synchronized (getexitanim3.write) {
                        getexitanim3.MediaBrowserCompatMediaItem.getClass();
                        getexitanim3.RatingCompat = Long.valueOf(System.currentTimeMillis());
                    }
                    RxDataStore rxDataStoreRemoteActionCompatParcelizer = this.RatingCompat.RemoteActionCompatParcelizer();
                    if (rxDataStoreRemoteActionCompatParcelizer != null) {
                        RemoteActionCompatParcelizer(rxDataStoreRemoteActionCompatParcelizer);
                        return;
                    }
                    return;
                }
                return;
            case 598685807:
                if (strSerializer.equals("HELPCENTER_ASKS_FOR_AUTO_CHAT_PARAMS")) {
                    SendTestPushUseCase sendTestPushUseCase2 = this.RemoteActionCompatParcelizer;
                    getExitTransition getexittransition = this.read;
                    String str2 = getexittransition.write;
                    String str3 = getexittransition.MediaDescriptionCompat;
                    String str4 = getexittransition.read;
                    sendTestPushUseCase2.getClass();
                    if (str3 == null) {
                        str3 = "20A.1";
                    }
                    setDrawerLockMode setdrawerlockmode = new setDrawerLockMode(str2, str4 == null ? "" : str4);
                    if (str4 == null) {
                        str4 = "";
                    }
                    RemoteActionCompatParcelizer(new EmojiCompatInitializer(new EmojiCompatInitCallback(str3, setdrawerlockmode, str4)));
                    return;
                }
                return;
            case 701199971:
                if (!strSerializer.equals("HELPCENTER_INIT_FAILED")) {
                    return;
                }
                break;
            case 765628025:
                if (strSerializer.equals("HELPCENTER_ASKS_FOR_FILE_DOWNLOAD")) {
                    if (getlistparameter instanceof getDefaultDefault) {
                        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new HelpCenterActivityViewModel$checkRootedDevice$1(this, shortNewsContentCardView, i));
                        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(new getRetainInstance(((getDefaultDefault) getlistparameter).payload.url));
                        return;
                    } else {
                        if (((FirebaseRemoteConfigImpl) this.MediaDescriptionCompat).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                            r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new HelpCenterActivityViewModel$checkRootedDevice$1(this, shortNewsContentCardView, 2));
                            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(new getTargetRequestCode(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(com.logistics.rider.glovo.R.string.snackbar_error_exception)));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1540257049:
                if (strSerializer.equals("HELPCENTER_NOTIFIES_IMAGE_UPLOAD_PERMISSIONS") && (getlistparameter instanceof forId)) {
                    this.PlaybackStateCompat = ((forId) getlistparameter).payload.isCameraOnly;
                    return;
                }
                return;
            case 2058304306:
                if (!strSerializer.equals("HELPCENTER_ENCOUNTERED_ERROR")) {
                    return;
                }
                break;
            default:
                return;
        }
        this.MediaSessionCompatToken.serializer();
        String strSerializer2 = getlistparameter.serializer();
        strSerializer2.getClass();
        boolean zEquals = strSerializer2.equals("HELPCENTER_ENCOUNTERED_ERROR");
        setUdmandroid_sdk_base_release setudmandroid_sdk_base_release = this.serializer;
        if (zEquals) {
            EnumColumnAdapter.serializer(setudmandroid_sdk_base_release.read, "help_center_bridge_communication_failed", executeAsList.INFRA, "Help Center Bridge Communication Encountered an Error.");
            invokesuspendcomroadrunnerremoteconfigfirebaseanalyticsfirebaseflagloggerimpllogtrackedfirebaseflags111 = invokeSuspendcomroadrunnerremoteconfigfirebaseanalyticsFirebaseFlagLoggerImpllogTrackedFirebaseFlags111.ERROR_BRIDGE_MSG_ENCOUNTERED_ERROR;
        } else {
            EnumColumnAdapter.serializer(setudmandroid_sdk_base_release.read, "help_center_bridge_communication_failed", executeAsList.INFRA, "Help Center Bridge Message Initialization Failed.");
            invokesuspendcomroadrunnerremoteconfigfirebaseanalyticsfirebaseflagloggerimpllogtrackedfirebaseflags111 = invokeSuspendcomroadrunnerremoteconfigfirebaseanalyticsFirebaseFlagLoggerImpllogTrackedFirebaseFlags111.ERROR_BRIDGE_MSG_INIT_FAILED;
        }
        RemoteActionCompatParcelizer(invokesuspendcomroadrunnerremoteconfigfirebaseanalyticsfirebaseflagloggerimpllogtrackedfirebaseflags111);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(new getTargetRequestCode(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer(com.logistics.rider.glovo.R.string.snackbar_error_exception)));
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getLoaderManager getloadermanager = (getLoaderManager) objArr[0];
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 107;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        getloadermanager.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        int i4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 25;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final BrazeLogger serializer() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 95;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return (BrazeLogger) this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new TwoFaViewModel$onPinChanged$1(this, null));
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 123;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 1;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer.IconCompatParcelizer("Help Center", null);
        int i4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 87;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void RemoteActionCompatParcelizer(getListParameter getlistparameter) {
        int i = 2 % 2;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer(new getSharedElementSourceNames(getlistparameter));
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 79;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i3 = i2 + 47;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.ParcelableVolumeInfo;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i5 = i2 + 47;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        this.ParcelableVolumeInfo = null;
    }

    public final void read() {
        int i = 2 % 2;
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new HelpCenterActivityViewModel$checkRootedDevice$1(this, null, 0));
        int i2 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 93;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer.getClass();
        RemoteActionCompatParcelizer(new isMap("HOST_ASKS_FOR_BACK_NAVIGATION", "HOST_ASKS_FOR_BACK_NAVIGATION"));
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 11;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        return java.lang.Boolean.valueOf(r4.IconCompatParcelizer.serializer(o.updateAdidI.IS_HELP_CENTER_NAVIGATION_FIX_ENABLED.getFirebaseFlagName(), r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r2 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r4 = o.getLoaderManager.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 63;
        o.getLoaderManager.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object read(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            o.getLoaderManager r4 = (o.getLoaderManager) r4
            r1 = 2
            int r2 = r1 % r1
            int r2 = o.getLoaderManager.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            int r2 = r2 + 27
            int r3 = r2 % 128
            o.getLoaderManager.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r3
            int r2 = r2 % r1
            if (r2 == 0) goto L23
            o.transferSessionPackageI r4 = r4.MediaDescriptionCompat
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r4 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r4
            o.foregroundTimerFired r2 = r4.RemoteActionCompatParcelizer
            java.lang.String r2 = r2.serializer()
            r3 = 42
            int r3 = r3 / r0
            if (r2 != 0) goto L3d
            goto L2f
        L23:
            o.transferSessionPackageI r4 = r4.MediaDescriptionCompat
            com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl r4 = (com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl) r4
            o.foregroundTimerFired r2 = r4.RemoteActionCompatParcelizer
            java.lang.String r2 = r2.serializer()
            if (r2 != 0) goto L3d
        L2f:
            int r4 = o.getLoaderManager.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
            int r4 = r4 + 63
            int r2 = r4 % 128
            o.getLoaderManager.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r2
            int r4 = r4 % r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L3d:
            com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider r4 = r4.IconCompatParcelizer
            o.updateAdidI r0 = o.updateAdidI.IS_HELP_CENTER_NAVIGATION_FIX_ENABLED
            java.lang.String r0 = r0.getFirebaseFlagName()
            boolean r4 = r4.serializer(r0, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getLoaderManager.read(java.lang.Object[]):java.lang.Object");
    }

    public final void RatingCompat() {
        int i = 2 % 2;
        BrazeLogger brazeLoggerSerializer = serializer();
        brazeLoggerSerializer.getClass();
        AndroidGraphicsContext2 androidGraphicsContext2 = brazeLoggerSerializer.IconCompatParcelizer;
        androidGraphicsContext2.RemoteActionCompatParcelizer(new getPopDirection((String) null, 5, false));
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 119;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        BrazeLogger brazeLoggerSerializer = serializer();
        brazeLoggerSerializer.getClass();
        AndroidGraphicsContext2 androidGraphicsContext2 = brazeLoggerSerializer.IconCompatParcelizer;
        androidGraphicsContext2.RemoteActionCompatParcelizer(new getPopDirection((String) null, 6, false));
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 119;
        r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
        }
    }

    public final void RemoteActionCompatParcelizer(invokeSuspendcomroadrunnerremoteconfigfirebaseanalyticsFirebaseFlagLoggerImpllogTrackedFirebaseFlags111 invokesuspendcomroadrunnerremoteconfigfirebaseanalyticsfirebaseflagloggerimpllogtrackedfirebaseflags111) {
        int i = 2 % 2;
        CodedInputStreamArrayDecoder codedInputStreamArrayDecoder = new CodedInputStreamArrayDecoder(invokesuspendcomroadrunnerremoteconfigfirebaseanalyticsfirebaseflagloggerimpllogtrackedfirebaseflags111.getValue());
        BusinessMetricsTracker businessMetricsTracker = this.write;
        businessMetricsTracker.getClass();
        dump dumpVar = businessMetricsTracker.RatingCompat;
        dumpVar.getClass();
        BusinessMetricsRepository businessMetricsRepository = dumpVar.RemoteActionCompatParcelizer;
        businessMetricsRepository.getClass();
        businessMetricsRepository.write.add(codedInputStreamArrayDecoder);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = businessMetricsTracker.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            if (!r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.PlaybackStateCompat()) {
                return;
            }
            int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 17;
            r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        Timber.RemoteActionCompatParcelizer.getClass();
        ContextScope contextScope = businessMetricsTracker.MediaMetadataCompat;
        ((inCompatibilityMode) businessMetricsTracker.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        businessMetricsTracker.write = BuildersKt.RemoteActionCompatParcelizer(contextScope, DefaultIoScheduler.RemoteActionCompatParcelizer, null, new BusinessMetricsTracker$runTimer$1(businessMetricsTracker, null, 0), 2);
        int i4 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 17;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void MediaSessionCompatQueueItem() {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        read(sourceInformationContextOfdefault.read(), -84177799, 84177800, i2, sourceInformationContextOfdefault.read(), i, new Object[]{this});
    }

    public final boolean MediaMetadataCompat() {
        int i = sourceInformationContextOfdefault.read();
        int i2 = sourceInformationContextOfdefault.read();
        return ((Boolean) read(sourceInformationContextOfdefault.read(), -1897123027, 1897123027, i2, sourceInformationContextOfdefault.read(), i, new Object[]{this})).booleanValue();
    }
}
