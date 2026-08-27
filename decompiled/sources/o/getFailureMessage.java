package o;

import android.app.Application;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.face.verification.domain.ImageCaptureUseCaseImpl;
import com.roadrunner.inappnotifications.data.InAppNotificationsRepository;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.rider.safety.authentication.data.RiderSafetyRepository;
import com.roadrunner.rider.safety.permission.data.PermissionHistoryRepository;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class getFailureMessage implements getColorIntegerOrNulllambda0 {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final mergeJsonObjects serializer;
    public final mergeJsonObjects write;

    public /* synthetic */ getFailureMessage(mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, int i) {
        this.read = i;
        this.write = mergejsonobjects;
        this.IconCompatParcelizer = mergejsonobjects2;
        this.RemoteActionCompatParcelizer = mergejsonobjects3;
        this.serializer = mergejsonobjects4;
    }

    public static getFailureMessage write(mergeJsonObjects mergejsonobjects, setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3) {
        int i = 2 % 2;
        getFailureMessage getfailuremessage = new getFailureMessage(mergejsonobjects, setpresentationview, mergejsonobjects2, mergejsonobjects3, 0);
        int i2 = MediaDescriptionCompat + 31;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return getfailuremessage;
        }
        throw null;
    }

    public static getFailureMessage serializer(lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, mergeJsonObjects mergejsonobjects) {
        int i = 2 % 2;
        getFailureMessage getfailuremessage = new getFailureMessage(lambdaprocessandresolvedeeplink15, r8lambda6uovp7lvejigbq5knkop8a0veiw, requestsinglelocationupdatelambda1, mergejsonobjects, 6);
        int i2 = MediaDescriptionCompat + 1;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getfailuremessage;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        mergeJsonObjects mergejsonobjects = this.serializer;
        mergeJsonObjects mergejsonobjects2 = this.RemoteActionCompatParcelizer;
        mergeJsonObjects mergejsonobjects3 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects4 = this.write;
        switch (i2) {
            case 0:
                return new getFirstErrorCode((decode) mergejsonobjects4.write(), (isOpenInternalroom_runtime) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
            case 1:
                getTextHandleMove5zf0vsI gettexthandlemove5zf0vsi = new getTextHandleMove5zf0vsI();
                gettexthandlemove5zf0vsi.MediaSessionCompatToken = (DefaultForegroundSoundManager) mergejsonobjects4.write();
                gettexthandlemove5zf0vsi.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (getKeyboardTap5zf0vsI) mergejsonobjects3.write();
                gettexthandlemove5zf0vsi.RatingCompat = (DialogMessageRequestProxy) mergejsonobjects2.write();
                gettexthandlemove5zf0vsi.ParcelableVolumeInfo = (access1000) mergejsonobjects.write();
                return gettexthandlemove5zf0vsi;
            case 2:
                unaryMinusXSAIIZE unaryminusxsaiize = new unaryMinusXSAIIZE((roundToIntSizeuvyYCjk) mergejsonobjects4.write(), (getCenterozmzZPIannotations) mergejsonobjects3.write(), (transferSessionPackageI) mergejsonobjects2.write(), (GetTaskByTypeAndIdUseCaseImpl) mergejsonobjects.write(), new com.huawei.wisesecurity.ucs_credential.n0(0), new com.huawei.wisesecurity.ucs_credential.g0(0), new getQueryContext(), new ImageCaptureUseCaseImpl(2));
                int i3 = MediaDescriptionCompat + 59;
                MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    int i4 = 70 / 0;
                }
                return unaryminusxsaiize;
            case 3:
                return new N$b((decode) mergejsonobjects4.write(), (getError) mergejsonobjects3.write(), (InAppNotificationsRepository) mergejsonobjects2.write(), (getContentViewGroupParentLayout) mergejsonobjects.write());
            case 4:
                return new ag((setTransactionSuccessful) mergejsonobjects4.write(), (transferSessionPackageI) mergejsonobjects3.write(), (QueryResultCompanion) mergejsonobjects2.write(), (getBindingAdapter) mergejsonobjects.write());
            case 5:
                Application application = (Application) mergejsonobjects4.write();
                setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) mergejsonobjects3.write();
                oa oaVar = (oa) mergejsonobjects2.write();
                transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects.write();
                application.getClass();
                settransactionsuccessful.getClass();
                oaVar.getClass();
                transfersessionpackagei.getClass();
                N$b n$b = new N$b();
                n$b.read = application;
                n$b.write = settransactionsuccessful;
                n$b.IconCompatParcelizer = oaVar;
                n$b.serializer = transfersessionpackagei;
                int i5 = MediaSessionCompatQueueItem + 121;
                MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return n$b;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 6:
                return new RiderSafetyRepository(getColorIntegerOrNull.serializer(mergejsonobjects4), (ExecuteApiRequest) mergejsonobjects3.write(), (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) mergejsonobjects2.write(), (getIsClick) mergejsonobjects.write());
            default:
                disableCoppaComplianceInDelay disablecoppacomplianceindelay = (disableCoppaComplianceInDelay) mergejsonobjects4.write();
                setEventDeduplicationIdsMaxSize seteventdeduplicationidsmaxsize = (setEventDeduplicationIdsMaxSize) mergejsonobjects3.write();
                enablePlayStoreKidsComplianceInDelay enableplaystorekidscomplianceindelay = (enablePlayStoreKidsComplianceInDelay) mergejsonobjects2.write();
                PermissionHistoryRepository permissionHistoryRepository = (PermissionHistoryRepository) mergejsonobjects.write();
                disablecoppacomplianceindelay.getClass();
                seteventdeduplicationidsmaxsize.getClass();
                enableplaystorekidscomplianceindelay.getClass();
                permissionHistoryRepository.getClass();
                N$b n$b2 = new N$b();
                n$b2.read = disablecoppacomplianceindelay;
                n$b2.write = seteventdeduplicationidsmaxsize;
                n$b2.IconCompatParcelizer = enableplaystorekidscomplianceindelay;
                n$b2.serializer = permissionHistoryRepository;
                return n$b2;
        }
    }
}
