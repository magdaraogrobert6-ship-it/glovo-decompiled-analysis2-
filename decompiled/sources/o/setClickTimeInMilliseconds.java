package o;

import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.rider.safety.authentication.domain.IsSafetyTrackingAllowedUseCase;
import com.roadrunner.rider.safety.lifecycle.RiderSafetyLifecycleManager;
import com.roadrunner.rider.state.status.GetCourierStatusUseCaseImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setClickTimeInMilliseconds implements getColorIntegerOrNulllambda0 {
    private static int PlaybackStateCompat = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatResultReceiverWrapper;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final mergeJsonObjects PlaybackStateCompatCustomAction;
    public final mergeJsonObjects RatingCompat;
    public final PreferenceGroupAdapter RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public setClickTimeInMilliseconds(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, mergeJsonObjects mergejsonobjects6, mergeJsonObjects mergejsonobjects7, mergeJsonObjects mergejsonobjects8, mergeJsonObjects mergejsonobjects9, mergeJsonObjects mergejsonobjects10, mergeJsonObjects mergejsonobjects11, mergeJsonObjects mergejsonobjects12, PreferenceGroupAdapter preferenceGroupAdapter, mergeJsonObjects mergejsonobjects13) {
        this.MediaSessionCompatToken = mergejsonobjects;
        this.read = mergejsonobjects2;
        this.ParcelableVolumeInfo = mergejsonobjects3;
        this.RatingCompat = mergejsonobjects4;
        this.PlaybackStateCompatCustomAction = mergejsonobjects5;
        this.write = mergejsonobjects6;
        this.MediaMetadataCompat = mergejsonobjects7;
        this.IconCompatParcelizer = mergejsonobjects8;
        this.MediaSessionCompatQueueItem = mergejsonobjects9;
        this.serializer = mergejsonobjects10;
        this.MediaBrowserCompatMediaItem = mergejsonobjects11;
        this.MediaSessionCompatResultReceiverWrapper = mergejsonobjects12;
        this.RemoteActionCompatParcelizer = preferenceGroupAdapter;
        this.MediaDescriptionCompat = mergejsonobjects13;
    }

    public static setClickTimeInMilliseconds IconCompatParcelizer(applyLayoutFeatures applylayoutfeatures, requestBannersRefreshlambda1 requestbannersrefreshlambda1, PreferenceGroupAdapter preferenceGroupAdapter, publishErrorlambda1 publisherrorlambda1, mergeJsonObjects mergejsonobjects, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects2, acquire acquireVar, mergeJsonObjects mergejsonobjects3, setStateDescription setstatedescription, mergeJsonObjects mergejsonobjects4, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, PreferenceGroupAdapter preferenceGroupAdapter2, getFailureMessage getfailuremessage) {
        int i = 2 % 2;
        setClickTimeInMilliseconds setclicktimeinmilliseconds = new setClickTimeInMilliseconds(applylayoutfeatures, requestbannersrefreshlambda1, preferenceGroupAdapter, publisherrorlambda1, mergejsonobjects, setpresentationview, mergejsonobjects2, acquireVar, mergejsonobjects3, setstatedescription, mergejsonobjects4, dataModule_ProvideSchedulerFactory, preferenceGroupAdapter2, getfailuremessage);
        int i2 = PlaybackStateCompat + 41;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return setclicktimeinmilliseconds;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        RiderSafetyLifecycleManager riderSafetyLifecycleManager = new RiderSafetyLifecycleManager((getPurchaseVerificationCallback) this.MediaSessionCompatToken.write(), (GetCourierStatusUseCaseImpl) this.read.write(), (setOnDeferredDeeplinkResponseListener) this.ParcelableVolumeInfo.write(), (setSubsessionInterval) this.RatingCompat.write(), getColorIntegerOrNull.serializer(this.PlaybackStateCompatCustomAction), (isOpenInternalroom_runtime) this.write.write(), (getContentViewGroupParentLayout) this.MediaMetadataCompat.write(), (IsSafetyTrackingAllowedUseCase) this.IconCompatParcelizer.write(), (getIsClick) this.MediaSessionCompatQueueItem.write(), (SemanticsPropertiesContentDescription1) this.serializer.write(), (transferSessionPackageI) this.MediaBrowserCompatMediaItem.write(), (getAllSemanticsNodesToMap) this.MediaSessionCompatResultReceiverWrapper.write(), (GetAppStateImpl) this.RemoteActionCompatParcelizer.write(), (getFirstErrorCode) this.MediaDescriptionCompat.write());
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 59;
        PlaybackStateCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return riderSafetyLifecycleManager;
    }
}
