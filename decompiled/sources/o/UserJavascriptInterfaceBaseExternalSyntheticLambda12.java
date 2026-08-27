package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.Status;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class UserJavascriptInterfaceBaseExternalSyntheticLambda12 extends hasPermissionlambda0 {
    public static final runOnUserlambda0 MediaSessionCompatQueueItem = new runOnUserlambda0(0);
    public boolean MediaBrowserCompatMediaItem;
    public final UserJavascriptInterfaceBaseExternalSyntheticLambda26 MediaDescriptionCompat;
    public wouldPushPermissionPromptDisplaylambda3 MediaMetadataCompat;
    public hasPermissionlambda0 MediaSessionCompatResultReceiverWrapper;
    public requestPushPermissionPromptlambda3 MediaSessionCompatToken;
    public wouldPushPermissionPromptDisplaylambda3 ParcelableVolumeInfo;
    public final subscriptionTypeFromJavascriptString PlaybackStateCompat;
    public setResourcePackageNamelambda0 PlaybackStateCompatCustomAction;
    public hasPermissionlambda0 RatingCompat;

    public final void IconCompatParcelizer(wouldPushPermissionPromptDisplaylambda3 wouldpushpermissionpromptdisplaylambda3) {
        TextStreamsKt.serializer(wouldpushpermissionpromptdisplaylambda3, "newBalancerFactory");
        if (wouldpushpermissionpromptdisplaylambda3 == this.ParcelableVolumeInfo) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper.read();
        this.MediaSessionCompatResultReceiverWrapper = this.MediaDescriptionCompat;
        this.ParcelableVolumeInfo = null;
        this.PlaybackStateCompatCustomAction = setResourcePackageNamelambda0.CONNECTING;
        this.MediaSessionCompatToken = MediaSessionCompatQueueItem;
        if (wouldpushpermissionpromptdisplaylambda3 == this.MediaMetadataCompat) {
            return;
        }
        r8lambdaBDSR_JOoMt3FuQZhimpJwbZJ44 r8lambdabdsr_joomt3fuqzhimpjwbzj44 = new r8lambdaBDSR_JOoMt3FuQZhimpJwbZJ44(this);
        hasPermissionlambda0 haspermissionlambda0RemoteActionCompatParcelizer = wouldpushpermissionpromptdisplaylambda3.RemoteActionCompatParcelizer(r8lambdabdsr_joomt3fuqzhimpjwbzj44);
        r8lambdabdsr_joomt3fuqzhimpjwbzj44.RemoteActionCompatParcelizer = haspermissionlambda0RemoteActionCompatParcelizer;
        this.MediaSessionCompatResultReceiverWrapper = haspermissionlambda0RemoteActionCompatParcelizer;
        this.ParcelableVolumeInfo = wouldpushpermissionpromptdisplaylambda3;
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        write();
    }

    @Override // o.hasPermissionlambda0
    public final void read() {
        this.MediaSessionCompatResultReceiverWrapper.read();
        this.RatingCompat.read();
    }

    public final hasPermissionlambda0 serializer() {
        hasPermissionlambda0 haspermissionlambda0 = this.MediaSessionCompatResultReceiverWrapper;
        return haspermissionlambda0 == this.MediaDescriptionCompat ? this.RatingCompat : haspermissionlambda0;
    }

    public final void write() {
        this.PlaybackStateCompat.write(this.PlaybackStateCompatCustomAction, this.MediaSessionCompatToken);
        this.RatingCompat.read();
        this.RatingCompat = this.MediaSessionCompatResultReceiverWrapper;
        this.MediaMetadataCompat = this.ParcelableVolumeInfo;
        this.MediaSessionCompatResultReceiverWrapper = this.MediaDescriptionCompat;
        this.ParcelableVolumeInfo = null;
    }

    @Override // o.hasPermissionlambda0
    public final boolean IconCompatParcelizer() {
        return serializer().IconCompatParcelizer();
    }

    @Override // o.hasPermissionlambda0
    public final void RemoteActionCompatParcelizer() {
        serializer().RemoteActionCompatParcelizer();
    }

    @Override // o.hasPermissionlambda0
    public final void serializer(Status status) {
        serializer().serializer(status);
    }

    @Override // o.hasPermissionlambda0
    public final void write(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        serializer().write(requestpushpermissionpromptlambda1);
    }

    public UserJavascriptInterfaceBaseExternalSyntheticLambda12(subscriptionTypeFromJavascriptString subscriptiontypefromjavascriptstring) {
        UserJavascriptInterfaceBaseExternalSyntheticLambda26 userJavascriptInterfaceBaseExternalSyntheticLambda26 = new UserJavascriptInterfaceBaseExternalSyntheticLambda26(this);
        this.MediaDescriptionCompat = userJavascriptInterfaceBaseExternalSyntheticLambda26;
        this.RatingCompat = userJavascriptInterfaceBaseExternalSyntheticLambda26;
        this.MediaSessionCompatResultReceiverWrapper = userJavascriptInterfaceBaseExternalSyntheticLambda26;
        this.PlaybackStateCompat = subscriptiontypefromjavascriptstring;
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(serializer(), "delegate");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }
}
