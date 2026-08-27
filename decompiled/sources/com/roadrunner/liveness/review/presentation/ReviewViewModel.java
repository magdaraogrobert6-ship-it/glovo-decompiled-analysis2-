package com.roadrunner.liveness.review.presentation;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.lifecycle.ViewModel;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import com.roadrunner.liveness.api.recording.CameraImage;
import com.roadrunner.login.logging.OtpLogger;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.BrazeExternalSyntheticLambda28;
import o.ParcelImpl;
import o.getQueryContext;
import o.setCurrentItem;
import o.setDistanceToTriggerSync;
import o.setTransactionSuccessful;

/* JADX INFO: loaded from: classes3.dex */
public final class ReviewViewModel extends ViewModel {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public final OtpLogger IconCompatParcelizer;
    public final BlockRunner MediaBrowserCompatMediaItem;
    public final StateFlow MediaSessionCompatQueueItem;
    public final getQueryContext RemoteActionCompatParcelizer;
    public final NetworkErrorMapperImpl read;
    public final CompleteIdentityVerificationUseCaseImpl serializer;
    public final MutableStateFlow write;

    public ReviewViewModel(BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28, BlockRunner blockRunner, OtpLogger otpLogger, NetworkErrorMapperImpl networkErrorMapperImpl, CompleteIdentityVerificationUseCaseImpl completeIdentityVerificationUseCaseImpl, setDistanceToTriggerSync setdistancetotriggersync, getQueryContext getquerycontext) {
        brazeExternalSyntheticLambda28.getClass();
        blockRunner.getClass();
        otpLogger.getClass();
        networkErrorMapperImpl.getClass();
        completeIdentityVerificationUseCaseImpl.getClass();
        setdistancetotriggersync.getClass();
        getquerycontext.getClass();
        this.MediaBrowserCompatMediaItem = blockRunner;
        this.IconCompatParcelizer = otpLogger;
        this.read = networkErrorMapperImpl;
        this.serializer = completeIdentityVerificationUseCaseImpl;
        this.RemoteActionCompatParcelizer = getquerycontext;
        setTransactionSuccessful settransactionsuccessful = brazeExternalSyntheticLambda28.read;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new setCurrentItem(settransactionsuccessful.IconCompatParcelizer(R.string.liveness_review_title), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_review_description), settransactionsuccessful.IconCompatParcelizer(R.string.liveness_review_btn)));
        this.write = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        otpLogger.IconCompatParcelizer.logEvent("liveness_succeed", null);
        CameraImage cameraImageRemoteActionCompatParcelizer = setdistancetotriggersync.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (cameraImageRemoteActionCompatParcelizer != null) {
            if (!cameraImageRemoteActionCompatParcelizer.IconCompatParcelizer) {
            }
            int i = MediaDescriptionCompat + 3;
            RatingCompat = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }
        int i3 = 2 % 2;
        int i4 = RatingCompat + 81;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getquerycontext.serializer(ParcelImpl.IconCompatParcelizer);
        int i6 = MediaDescriptionCompat + 53;
        RatingCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 2 % 2;
        }
        int i8 = MediaDescriptionCompat + 3;
        RatingCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
    }
}
