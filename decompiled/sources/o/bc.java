package o;

import com.roadrunner.login.logging.AuthenticationLogger;
import com.roadrunner.push.core.domain.DeletePushTokenImpl;
import com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ClearApplicantDataImpl;
import com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl;
import com.sentiance.core.model.events.C$b;

/* JADX INFO: loaded from: classes3.dex */
public final class bc extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 1;
    private static int PlaybackStateCompatCustomAction;
    public final DeletePushTokenImpl IconCompatParcelizer;
    public final C$b MediaBrowserCompatMediaItem;
    public final RegisterPushNotificationUseCaseImpl MediaDescriptionCompat;
    public final AuthenticationLogger MediaMetadataCompat;
    public final getQueryContext MediaSessionCompatQueueItem;
    public final SetApplicantIdUseCaseImpl MediaSessionCompatToken;
    public final addError ParcelableVolumeInfo;
    public final getQueryContext RatingCompat;
    public final writeObject RemoteActionCompatParcelizer;
    public final getSdkEnablementProviderandroid_sdk_base_release read;
    public final transferSessionPackageI serializer;
    public final ClearApplicantDataImpl write;

    public final getQueryContext IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 125;
        MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaSessionCompatQueueItem;
        }
        int i3 = 31 / 0;
        return this.MediaSessionCompatQueueItem;
    }

    public bc(getQueryContext getquerycontext, getQueryContext getquerycontext2, addError adderror, writeObject writeobject, C$b c$b, ClearApplicantDataImpl clearApplicantDataImpl, getSdkEnablementProviderandroid_sdk_base_release getsdkenablementproviderandroid_sdk_base_release, transferSessionPackageI transfersessionpackagei, RegisterPushNotificationUseCaseImpl registerPushNotificationUseCaseImpl, DeletePushTokenImpl deletePushTokenImpl, AuthenticationLogger authenticationLogger, SetApplicantIdUseCaseImpl setApplicantIdUseCaseImpl) {
        getquerycontext.getClass();
        getquerycontext2.getClass();
        adderror.getClass();
        writeobject.getClass();
        c$b.getClass();
        clearApplicantDataImpl.getClass();
        getsdkenablementproviderandroid_sdk_base_release.getClass();
        transfersessionpackagei.getClass();
        registerPushNotificationUseCaseImpl.getClass();
        deletePushTokenImpl.getClass();
        authenticationLogger.getClass();
        setApplicantIdUseCaseImpl.getClass();
        this.MediaSessionCompatQueueItem = getquerycontext;
        this.RatingCompat = getquerycontext2;
        this.ParcelableVolumeInfo = adderror;
        this.RemoteActionCompatParcelizer = writeobject;
        this.MediaBrowserCompatMediaItem = c$b;
        this.write = clearApplicantDataImpl;
        this.read = getsdkenablementproviderandroid_sdk_base_release;
        this.serializer = transfersessionpackagei;
        this.MediaDescriptionCompat = registerPushNotificationUseCaseImpl;
        this.IconCompatParcelizer = deletePushTokenImpl;
        this.MediaMetadataCompat = authenticationLogger;
        this.MediaSessionCompatToken = setApplicantIdUseCaseImpl;
    }
}
