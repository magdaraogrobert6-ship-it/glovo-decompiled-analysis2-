package o;

import com.sentiance.sdk.payload.creation.DetectionIdManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class setNotificationBadgeNumberIfPresentlambda0 extends setPriorityIfPresentAndSupportedlambda0<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> {
    final /* synthetic */ setDeleteIntentlambda0 IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setNotificationBadgeNumberIfPresentlambda0(setDeleteIntentlambda0 setdeleteintentlambda0) {
        super(setdeleteintentlambda0);
        this.IconCompatParcelizer = setdeleteintentlambda0;
    }

    @Override // o.setPriorityIfPresentAndSupportedlambda0
    public final List<logBaiduNotificationClicklambda1> IconCompatParcelizer(getLongitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> getlongitudeannotations) {
        setDeleteIntentlambda0 setdeleteintentlambda0 = this.IconCompatParcelizer;
        setdeleteintentlambda0.ComponentActivity.IconCompatParcelizer("LocationEvent arrived", new Object[0]);
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = getlongitudeannotations.read();
        if (!setDeleteIntentlambda0.read(setdeleteintentlambda0, setDeleteIntentlambda0.write, getlongitudeannotations.MediaMetadataCompat()) || (setdeleteintentlambda0.ParcelableVolumeInfo != null && r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.longValue() <= setdeleteintentlambda0.ParcelableVolumeInfo.longValue())) {
            return Collections.EMPTY_LIST;
        }
        setdeleteintentlambda0.ParcelableVolumeInfo = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        getVerticalAccuracy getverticalaccuracy = setdeleteintentlambda0.ResultReceiver;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        return com.sentiance.sdk.util.x.IconCompatParcelizer(setdeleteintentlambda0.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4), setdeleteintentlambda0.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer(DetectionIdManager.Detection.TRIP)));
    }
}
