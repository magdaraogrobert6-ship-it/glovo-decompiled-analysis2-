package o;

import com.roadrunner.countdowntimer.CountDownTimerUiModel;
import com.roadrunner.countdowntimer.CountDownTimerUiModel$observeTimerState$$inlined$map$1;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.login.presentation.checkemail.CheckEmailViewModel$startTimer$1;
import com.roadrunner.login.presentation.forgotpassword.ForgotPasswordPersistedTimerManager;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.events.N$b;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt$asFlow$1;

/* JADX INFO: loaded from: classes3.dex */
public final class TurbineTimeoutCancellationException extends androidx.lifecycle.ViewModel {
    private static int ParcelableVolumeInfo = 1;
    private static int PlaybackStateCompat;
    public final MutableStateFlow IconCompatParcelizer;
    public final getQueryContext MediaBrowserCompatMediaItem;
    public final NetworkErrorMapperImpl MediaDescriptionCompat;
    public final setTransactionSuccessful MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public final MutableStateFlow MediaSessionCompatResultReceiverWrapper;
    public final transferSessionPackageI RatingCompat;
    public final ForgotPasswordPersistedTimerManager RemoteActionCompatParcelizer;
    public final OtpLogger read;
    public final CountDownTimerUiModel serializer;
    public final N$b write;

    public TurbineTimeoutCancellationException(OtpLogger otpLogger, setTransactionSuccessful settransactionsuccessful, CountDownTimerUiModel countDownTimerUiModel, transferSessionPackageI transfersessionpackagei, N$b n$b, ForgotPasswordPersistedTimerManager forgotPasswordPersistedTimerManager, NetworkErrorMapperImpl networkErrorMapperImpl, getQueryContext getquerycontext) {
        otpLogger.getClass();
        settransactionsuccessful.getClass();
        countDownTimerUiModel.getClass();
        transfersessionpackagei.getClass();
        n$b.getClass();
        forgotPasswordPersistedTimerManager.getClass();
        networkErrorMapperImpl.getClass();
        getquerycontext.getClass();
        this.read = otpLogger;
        this.MediaMetadataCompat = settransactionsuccessful;
        this.serializer = countDownTimerUiModel;
        this.RatingCompat = transfersessionpackagei;
        this.write = n$b;
        this.RemoteActionCompatParcelizer = forgotPasswordPersistedTimerManager;
        this.MediaDescriptionCompat = networkErrorMapperImpl;
        this.MediaBrowserCompatMediaItem = getquerycontext;
        this.MediaSessionCompatQueueItem = "";
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new a4((String) null, (String) null, (String) null, (String) null, (androidx.compose.ui.text.AnnotatedString) null, (RectListDebuggerModifierNode) null, 127));
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatResultReceiverWrapper = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        otpLogger.IconCompatParcelizer.IconCompatParcelizer("Reset Password Open Email Screen", null);
        int i = 2;
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_PERSIST_TIMER_IN_RESET_PASSWORD_ENABLED)) {
            r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new CheckEmailViewModel$startTimer$1(this, shortNewsContentCardView, i));
            int i2 = ParcelableVolumeInfo + 31;
            PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return;
            }
            shortNewsContentCardView.hashCode();
            throw null;
        }
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new RxConvertKt$asFlow$1(new CountDownTimerUiModel$observeTimerState$$inlined$map$1(countDownTimerUiModel.write.serializer, countDownTimerUiModel, com.logistics.rider.glovo.R.string.login_otp_count_down_text), new RetryWithDelay$$ExternalSyntheticLambda0(24, this), (ShortNewsContentCardView) null, 26), 3);
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new CheckEmailViewModel$startTimer$1(this, shortNewsContentCardView, 0));
        int i3 = ParcelableVolumeInfo + 69;
        PlaybackStateCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
