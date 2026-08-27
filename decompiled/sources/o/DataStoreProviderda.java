package o;

import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
final class DataStoreProviderda extends getLatitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> {
    final /* synthetic */ r8lambdalmSvIZk2OaypKCEb55V0vnTE72k RemoteActionCompatParcelizer;

    @Override // o.getLatitudeannotations
    public final void a(getLongitudeannotations<r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU> getlongitudeannotations) {
        r8lambdalmSvIZk2OaypKCEb55V0vnTE72k r8lambdalmsvizk2oaypkceb55v0vnte72k = this.RemoteActionCompatParcelizer;
        getVerticalAccuracy getverticalaccuracy = r8lambdalmsvizk2oaypkceb55v0vnte72k.IconCompatParcelizer;
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = getlongitudeannotations.read().RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
        String strRemoteActionCompatParcelizer = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(locationWrite.getLatitude(), locationWrite.getLongitude(), 14));
        String strRemoteActionCompatParcelizer2 = shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(shutdownAllDataStoresdefault.write(locationWrite.getLatitude(), locationWrite.getLongitude(), DataStoreProviderm.write));
        r8lambdalmsvizk2oaypkceb55v0vnte72k.write.IconCompatParcelizer("New location: %f, %f, quadKey: %s, parentQuadKey: %s", Double.valueOf(locationWrite.getLatitude()), Double.valueOf(locationWrite.getLongitude()), strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2);
        boolean zEquals = strRemoteActionCompatParcelizer2.equals(r8lambdalmsvizk2oaypkceb55v0vnte72k.PlaybackStateCompatCustomAction);
        if (zEquals) {
            long j = r8lambdalmsvizk2oaypkceb55v0vnte72k.PlaybackStateCompat;
            long j2 = r8lambdalmsvizk2oaypkceb55v0vnte72k.ParcelableVolumeInfo;
            r8lambdalmsvizk2oaypkceb55v0vnte72k.MediaBrowserCompatMediaItem.getClass();
            if (j2 + (j * 30000) > System.currentTimeMillis()) {
                return;
            }
        }
        r8lambdalmsvizk2oaypkceb55v0vnte72k.PlaybackStateCompatCustomAction = strRemoteActionCompatParcelizer2;
        r8lambdalmsvizk2oaypkceb55v0vnte72k.MediaBrowserCompatMediaItem.getClass();
        r8lambdalmsvizk2oaypkceb55v0vnte72k.ParcelableVolumeInfo = System.currentTimeMillis();
        if (zEquals) {
            r8lambdalmsvizk2oaypkceb55v0vnte72k.PlaybackStateCompat = Math.min(10, r8lambdalmsvizk2oaypkceb55v0vnte72k.PlaybackStateCompat + 1);
        } else {
            r8lambdalmsvizk2oaypkceb55v0vnte72k.PlaybackStateCompat = 1;
        }
        for (String str : shutdownAllDataStoresdefault.read(locationWrite, 14)) {
            if (r8lambdalmSvIZk2OaypKCEb55V0vnTE72k.serializer(r8lambdalmsvizk2oaypkceb55v0vnte72k, str)) {
                r8lambdalmsvizk2oaypkceb55v0vnte72k.write.IconCompatParcelizer("Pending request already exists for tile with quad key %s", str);
            } else if (r8lambdalmsvizk2oaypkceb55v0vnte72k.RatingCompat.serializer(str)) {
                r8lambdalmsvizk2oaypkceb55v0vnte72k.write.IconCompatParcelizer("Tile with quad key %s already exists", str);
            } else {
                r8lambdalmsvizk2oaypkceb55v0vnte72k.serializer(str, new r8lambdaxlGZ37PBa_omfizFrRo1k0nbvE());
            }
        }
        r8lambdalmsvizk2oaypkceb55v0vnte72k.IconCompatParcelizer();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreProviderda(r8lambdalmSvIZk2OaypKCEb55V0vnTE72k r8lambdalmsvizk2oaypkceb55v0vnte72k, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "VenueProvider");
        this.RemoteActionCompatParcelizer = r8lambdalmsvizk2oaypkceb55v0vnte72k;
    }
}
