package o;

import com.roadrunner.login.logging.AuthenticationLogger;
import com.roadrunner.push.core.domain.DeletePushTokenImpl;
import com.roadrunner.push.core.domain.RegisterPushNotificationUseCaseImpl;
import com.roadrunner.rider.recruitment.applicant.domain.ClearApplicantDataImpl;
import com.roadrunner.rider.recruitment.applicant.domain.SetApplicantIdUseCaseImpl;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.i$c;

/* JADX INFO: loaded from: classes3.dex */
public final class bf implements be {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final i$c serializer;

    public bf(i$c i_c) {
        this.serializer = i_c;
    }

    public final bc read(getQueryContext getquerycontext) {
        int i = 2 % 2;
        getQueryContext getquerycontext2 = new getQueryContext();
        i$c i_c = this.serializer;
        bc bcVar = new bc(getquerycontext2, getquerycontext, (addError) ((mergeJsonObjects) i_c.write).write(), (writeObject) ((mergeJsonObjects) i_c.MediaMetadataCompat).write(), (C$b) ((lambda31) i_c.IconCompatParcelizer).write(), (ClearApplicantDataImpl) ((mergeJsonObjects) i_c.serializer).write(), new getSdkEnablementProviderandroid_sdk_base_release(6), (transferSessionPackageI) ((mergeJsonObjects) i_c.RemoteActionCompatParcelizer).write(), (RegisterPushNotificationUseCaseImpl) ((mergeJsonObjects) i_c.read).write(), (DeletePushTokenImpl) ((mergeJsonObjects) i_c.RatingCompat).write(), (AuthenticationLogger) ((mergeJsonObjects) i_c.MediaDescriptionCompat).write(), (SetApplicantIdUseCaseImpl) ((mergeJsonObjects) i_c.MediaBrowserCompatMediaItem).write());
        int i2 = RemoteActionCompatParcelizer + 3;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return bcVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
