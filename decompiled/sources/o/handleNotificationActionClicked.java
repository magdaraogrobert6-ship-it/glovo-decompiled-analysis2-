package o;

import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
final class handleNotificationActionClicked extends getLatitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> {
    final /* synthetic */ addNotificationActionslambda1 read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleNotificationActionClicked(addNotificationActionslambda1 addnotificationactionslambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "LocationAccuracyMonitor");
        this.read = addnotificationactionslambda1;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> getlongitudeannotations) {
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku = getlongitudeannotations.read();
        addNotificationActionslambda1 addnotificationactionslambda1 = this.read;
        getVerticalAccuracy getverticalaccuracy = addnotificationactionslambda1.ParcelableVolumeInfo;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        addnotificationactionslambda1.RatingCompat.IconCompatParcelizer("New location: %s", getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.RemoteActionCompatParcelizer(locationWrite));
        addNotificationActionslambda1.IconCompatParcelizer(addnotificationactionslambda1, locationWrite);
    }
}
