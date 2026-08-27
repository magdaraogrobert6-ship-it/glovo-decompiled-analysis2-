package o;

import com.roadrunner.face.verification.api.navigation.IdentityVerificationParams;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setRegistrationDataProviderandroid_sdk_base_release implements schedulePushDeliveryandroid_sdk_base_release {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public final requestContentCardsRefreshFromCache IconCompatParcelizer;
    public final createQuery MediaSessionCompatQueueItem;
    public final transferSessionPackageI RatingCompat;
    public final boundingRectInRoot RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final getHardwareName serializer;
    public final r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 write;

    public setRegistrationDataProviderandroid_sdk_base_release(requestContentCardsRefreshFromCache requestcontentcardsrefreshfromcache, getQueryContext getquerycontext, transferSessionPackageI transfersessionpackagei, createQuery createquery, boundingRectInRoot boundingrectinroot, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8, getHardwareName gethardwarename) {
        requestcontentcardsrefreshfromcache.getClass();
        getquerycontext.getClass();
        transfersessionpackagei.getClass();
        createquery.getClass();
        boundingrectinroot.getClass();
        r8lambda4txk7kovp_j84hgvzl3zo6mzli8.getClass();
        gethardwarename.getClass();
        this.IconCompatParcelizer = requestcontentcardsrefreshfromcache;
        this.read = getquerycontext;
        this.RatingCompat = transfersessionpackagei;
        this.MediaSessionCompatQueueItem = createquery;
        this.RemoteActionCompatParcelizer = boundingrectinroot;
        this.write = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
        this.serializer = gethardwarename;
    }

    public final void write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 25;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = this.RemoteActionCompatParcelizer.write().countryCode;
        r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer = ((r8lambda3VVJpFrLw0gBk1Y7AUcJE0v96U) this.write).RemoteActionCompatParcelizer.serializer();
        Long lValueOf = null;
        if (r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer != null) {
            int i4 = MediaMetadataCompat + 71;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                lValueOf = Long.valueOf(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
            } else {
                Long.valueOf(r8lambda4iulmttpk1bccxnrohiqnfq1opaSerializer.read);
                throw null;
            }
        }
        String strValueOf = String.valueOf(lValueOf);
        requestContentCardsRefreshFromCache requestcontentcardsrefreshfromcache = this.IconCompatParcelizer;
        this.read.serializer(new setExternalIEventMessengerandroid_sdk_base_release(new IdentityVerificationParams(str, strValueOf, requestcontentcardsrefreshfromcache.getLoggingName(), requestcontentcardsrefreshfromcache.getSelfieTrigger())));
    }

    public final void read() {
        int i = 2 % 2;
        boolean z = ((FirebaseRemoteConfigImpl) this.RatingCompat).read();
        getQueryContext getquerycontext = this.read;
        if (z) {
            getquerycontext.serializer(setConfigurationProviderandroid_sdk_base_release.read);
            int i2 = MediaBrowserCompatMediaItem + 87;
            MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        Object obj = null;
        this.serializer.read.IconCompatParcelizer("Identity Verification", null);
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.MediaSessionCompatQueueItem.write;
        firebaseRemoteConfigImpl.getClass();
        boolean z2 = true;
        if (!firebaseRemoteConfigImpl.IconCompatParcelizer(updateAdidI.IS_LIVENESS_DETECTION_ENABLED)) {
            write();
            return;
        }
        if (this.IconCompatParcelizer != requestContentCardsRefreshFromCache.ID_VERIFICATION_IN_MID_SHIFT) {
            int i4 = MediaBrowserCompatMediaItem + 65;
            MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            int i6 = MediaMetadataCompat + 11;
            MediaBrowserCompatMediaItem = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z2 = false;
        }
        getquerycontext.serializer(new setDeviceIdProviderandroid_sdk_base_release(z2));
        int i8 = MediaBrowserCompatMediaItem + 53;
        MediaMetadataCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
