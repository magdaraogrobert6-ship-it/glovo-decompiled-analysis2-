package o;

/* JADX INFO: loaded from: classes3.dex */
final class handleNotificationActionClickedlambda2 extends getLatitudeannotations<addBannerViewMonitor> {
    final /* synthetic */ addNotificationActionslambda1 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handleNotificationActionClickedlambda2(addNotificationActionslambda1 addnotificationactionslambda1, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "LocationAccuracyMonitor");
        this.write = addnotificationactionslambda1;
    }

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<addBannerViewMonitor> getlongitudeannotations) {
        long jMediaMetadataCompat = getlongitudeannotations.MediaMetadataCompat();
        addNotificationActionslambda1 addnotificationactionslambda1 = this.write;
        getCooldownEnterSeconds.read readVarWrite = addNotificationActionslambda1.write(addnotificationactionslambda1, jMediaMetadataCompat);
        if (readVarWrite == null) {
            addnotificationactionslambda1.read(addnotificationactionslambda1.MediaSessionCompatToken, jMediaMetadataCompat);
            return;
        }
        Class clsIconCompatParcelizer = getBitmapFromCache.IconCompatParcelizer(readVarWrite, addnotificationactionslambda1.ParcelableVolumeInfo);
        if (clsIconCompatParcelizer != null) {
            addnotificationactionslambda1.serializer(readVarWrite.RemoteActionCompatParcelizer(), clsIconCompatParcelizer);
        }
        addNotificationActionslambda1.serializer(addnotificationactionslambda1);
        addnotificationactionslambda1.read(addnotificationactionslambda1.MediaSessionCompatToken, jMediaMetadataCompat);
    }
}
