package com.roadrunner.login.presentation.otp;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.ViewModel;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.countdowntimer.CountDownTimerUiModel$observeTimerState$$inlined$map$1;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import com.roadrunner.login.legacy.data.LoginStorageManager;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.nafath.NafathModalContentKt$NafathModal$1$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;
import o.BrazeLogger;
import o.RectListDebuggerModifierNode;
import o.ShortNewsContentCardView;
import o.b4;
import o.b5;
import o.bbExternalSyntheticLambda0;
import o.bbExternalSyntheticLambda1;
import o.bbExternalSyntheticLambda3;
import o.createFromParcel;
import o.getAbsoluteAdapterPosition;
import o.getBindingAdapter;
import o.getBoolean;
import o.getQueryContext;
import o.isInitialized;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE;
import o.setTransactionSuccessful;
import o.toBitmapConfig1JJdX4A;
import o.transferSessionPackageI;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class OtpViewModel extends ViewModel {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public final transferSessionPackageI IconCompatParcelizer;
    public final setTransactionSuccessful MediaDescriptionCompat;
    public final BrazeLogger MediaMetadataCompat;
    public final LoginStorageManager MediaSessionCompatQueueItem;
    public final BlockRunner RatingCompat;
    public final ForgotPasswordPersistedTimerManager RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final OtpLogger serializer;
    public final CountDownTimerUiModel write;

    public OtpViewModel(CountDownTimerUiModel countDownTimerUiModel, BlockRunner blockRunner, LoginStorageManager loginStorageManager, setTransactionSuccessful settransactionsuccessful, transferSessionPackageI transfersessionpackagei, OtpLogger otpLogger, ForgotPasswordPersistedTimerManager forgotPasswordPersistedTimerManager, getBindingAdapter getbindingadapter, getQueryContext getquerycontext) {
        int i;
        countDownTimerUiModel.getClass();
        blockRunner.getClass();
        loginStorageManager.getClass();
        settransactionsuccessful.getClass();
        transfersessionpackagei.getClass();
        otpLogger.getClass();
        forgotPasswordPersistedTimerManager.getClass();
        getbindingadapter.getClass();
        getquerycontext.getClass();
        this.write = countDownTimerUiModel;
        this.RatingCompat = blockRunner;
        this.MediaSessionCompatQueueItem = loginStorageManager;
        this.MediaDescriptionCompat = settransactionsuccessful;
        this.IconCompatParcelizer = transfersessionpackagei;
        this.serializer = otpLogger;
        this.RemoteActionCompatParcelizer = forgotPasswordPersistedTimerManager;
        this.read = getquerycontext;
        ShortNewsContentCardView shortNewsContentCardView = null;
        this.MediaMetadataCompat = new BrazeLogger(new bbExternalSyntheticLambda0(new getBoolean(null, 0, null, getbindingadapter.serializer(getAbsoluteAdapterPosition.write), new NafathModalContentKt$NafathModal$1$1(0, this, OtpViewModel.class, "clearAuthErrorOnInputsChanged", "clearAuthErrorOnInputsChanged()V", 0, 2), false, 39), new RectListDebuggerModifierNode(null, 3), false, false, false));
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED)) {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new DividerUiModelImpl$1(this, shortNewsContentCardView, 25), 3);
            i = ParcelableVolumeInfo + 125;
        } else {
            BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asFlow$1(new CountDownTimerUiModel$observeTimerState$$inlined$map$1(countDownTimerUiModel.write.serializer, countDownTimerUiModel, R.string.login_otp_count_down_text), new bbExternalSyntheticLambda3(this, 0), shortNewsContentCardView, 26), 3);
            r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 17));
            i = ParcelableVolumeInfo + 103;
        }
        MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
        int i2 = i % 2;
        int i3 = 2 % 2;
        otpLogger.IconCompatParcelizer.IconCompatParcelizer("New Reset Password SMS", null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    public static final Object access$invokeForgotPassword(OtpViewModel otpViewModel, String str, ContinuationImpl continuationImpl) {
        bbExternalSyntheticLambda1 bbexternalsyntheticlambda1;
        Object objM3947invoke0E7RQCE;
        int i = 2 % 2;
        BrazeLogger brazeLogger = otpViewModel.MediaMetadataCompat;
        getQueryContext getquerycontext = otpViewModel.read;
        if (continuationImpl instanceof bbExternalSyntheticLambda1) {
            bbexternalsyntheticlambda1 = (bbExternalSyntheticLambda1) continuationImpl;
            int i2 = bbexternalsyntheticlambda1.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = ParcelableVolumeInfo + 79;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                bbexternalsyntheticlambda1.write = i3 % 2 != 0 ? i2 - Integer.MIN_VALUE : i2 - Integer.MIN_VALUE;
            } else {
                bbexternalsyntheticlambda1 = new bbExternalSyntheticLambda1(otpViewModel, continuationImpl);
            }
        } else {
            bbexternalsyntheticlambda1 = new bbExternalSyntheticLambda1(otpViewModel, continuationImpl);
        }
        Object obj = bbexternalsyntheticlambda1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = bbexternalsyntheticlambda1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            BlockRunner blockRunner = otpViewModel.RatingCompat;
            FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) otpViewModel.IconCompatParcelizer;
            firebaseRemoteConfigImpl.getClass();
            boolean zIconCompatParcelizer = firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_RESET_PASSWORD_FLEXIBILITY_ENABLED);
            bbexternalsyntheticlambda1.write = 1;
            objM3947invoke0E7RQCE = blockRunner.m3947invoke0E7RQCE(str, zIconCompatParcelizer, bbexternalsyntheticlambda1);
            if (objM3947invoke0E7RQCE == coroutineSingletons) {
                int i5 = MediaBrowserCompatMediaItem + 29;
                ParcelableVolumeInfo = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = ParcelableVolumeInfo + 27;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM3947invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM3947invoke0E7RQCE instanceof isItemDismissable)) {
            brazeLogger.getClass();
            brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(bbExternalSyntheticLambda0.IconCompatParcelizer((bbExternalSyntheticLambda0) brazeLogger.write(), null, false, false, false, 27));
            r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(otpViewModel, new MapboxNavigation$parsing$2(otpViewModel, shortNewsContentCardView, 17));
            getquerycontext.serializer(new b4(new isInitialized(otpViewModel.MediaDescriptionCompat.IconCompatParcelizer(R.string.login_reset_password_message_sent_pop_up_title))));
        }
        Throwable thSerializer = onItemDismiss.serializer(objM3947invoke0E7RQCE);
        if (thSerializer != null) {
            brazeLogger.getClass();
            brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(bbExternalSyntheticLambda0.IconCompatParcelizer((bbExternalSyntheticLambda0) brazeLogger.write(), null, false, false, false, 27));
            getquerycontext.serializer(new b5(thSerializer));
        }
        return createFromParcel.INSTANCE;
    }
}
