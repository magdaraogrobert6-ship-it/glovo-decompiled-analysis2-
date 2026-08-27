package o;

/* JADX INFO: loaded from: classes2.dex */
public final class ensureSubtreeLookaheadReplaced extends traceMeasureLayout {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final accessgetPlaceOuterCoordinatorLayerBlockp MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final trackMeasurementByParent ParcelableVolumeInfo;
    public final String PlaybackStateCompatCustomAction;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final MeasurePassDelegate write;

    @Override // o.traceMeasureLayout
    public final getCanAffectPlacedParent IconCompatParcelizer() {
        getCanAffectPlacedParent getcanaffectplacedparent = new getCanAffectPlacedParent();
        getcanaffectplacedparent.PlaybackStateCompatCustomAction = this.PlaybackStateCompatCustomAction;
        getcanaffectplacedparent.MediaMetadataCompat = this.MediaSessionCompatQueueItem;
        getcanaffectplacedparent.MediaBrowserCompatMediaItem = this.MediaMetadataCompat;
        getcanaffectplacedparent.MediaSessionCompatQueueItem = this.RatingCompat;
        getcanaffectplacedparent.RatingCompat = this.MediaBrowserCompatMediaItem;
        getcanaffectplacedparent.write = this.read;
        getcanaffectplacedparent.RemoteActionCompatParcelizer = this.serializer;
        getcanaffectplacedparent.serializer = this.IconCompatParcelizer;
        getcanaffectplacedparent.IconCompatParcelizer = this.RemoteActionCompatParcelizer;
        getcanaffectplacedparent.ParcelableVolumeInfo = this.ParcelableVolumeInfo;
        getcanaffectplacedparent.MediaDescriptionCompat = this.MediaDescriptionCompat;
        getcanaffectplacedparent.read = this.write;
        getcanaffectplacedparent.MediaSessionCompatResultReceiverWrapper = (byte) 1;
        return getcanaffectplacedparent;
    }

    public final int hashCode() {
        int iHashCode = this.PlaybackStateCompatCustomAction.hashCode();
        int iHashCode2 = this.MediaSessionCompatQueueItem.hashCode();
        int i = this.MediaMetadataCompat;
        int iHashCode3 = this.RatingCompat.hashCode();
        String str = this.MediaBrowserCompatMediaItem;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.read;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.serializer;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        int iHashCode7 = this.IconCompatParcelizer.hashCode();
        int iHashCode8 = this.RemoteActionCompatParcelizer.hashCode();
        trackMeasurementByParent trackmeasurementbyparent = this.ParcelableVolumeInfo;
        int iHashCode9 = trackmeasurementbyparent == null ? 0 : trackmeasurementbyparent.hashCode();
        accessgetPlaceOuterCoordinatorLayerBlockp accessgetplaceoutercoordinatorlayerblockp = this.MediaDescriptionCompat;
        int iHashCode10 = accessgetplaceoutercoordinatorlayerblockp == null ? 0 : accessgetplaceoutercoordinatorlayerblockp.hashCode();
        MeasurePassDelegate measurePassDelegate = this.write;
        return ((((((((((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ i) * 1000003) ^ iHashCode3) * 1000003) ^ iHashCode4) * 1000003) ^ iHashCode5) * 1000003) ^ iHashCode6) * 1000003) ^ iHashCode7) * 1000003) ^ iHashCode8) * 1000003) ^ iHashCode9) * 1000003) ^ iHashCode10) * 1000003) ^ (measurePassDelegate != null ? measurePassDelegate.hashCode() : 0);
    }

    public ensureSubtreeLookaheadReplaced(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, trackMeasurementByParent trackmeasurementbyparent, accessgetPlaceOuterCoordinatorLayerBlockp accessgetplaceoutercoordinatorlayerblockp, MeasurePassDelegate measurePassDelegate) {
        this.PlaybackStateCompatCustomAction = str;
        this.MediaSessionCompatQueueItem = str2;
        this.MediaMetadataCompat = i;
        this.RatingCompat = str3;
        this.MediaBrowserCompatMediaItem = str4;
        this.read = str5;
        this.serializer = str6;
        this.IconCompatParcelizer = str7;
        this.RemoteActionCompatParcelizer = str8;
        this.ParcelableVolumeInfo = trackmeasurementbyparent;
        this.MediaDescriptionCompat = accessgetplaceoutercoordinatorlayerblockp;
        this.write = measurePassDelegate;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof traceMeasureLayout)) {
            return false;
        }
        ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplaced = (ensureSubtreeLookaheadReplaced) ((traceMeasureLayout) obj);
        if (!this.PlaybackStateCompatCustomAction.equals(ensuresubtreelookaheadreplaced.PlaybackStateCompatCustomAction) || !this.MediaSessionCompatQueueItem.equals(ensuresubtreelookaheadreplaced.MediaSessionCompatQueueItem) || this.MediaMetadataCompat != ensuresubtreelookaheadreplaced.MediaMetadataCompat || !this.RatingCompat.equals(ensuresubtreelookaheadreplaced.RatingCompat)) {
            return false;
        }
        String str = ensuresubtreelookaheadreplaced.MediaBrowserCompatMediaItem;
        String str2 = this.MediaBrowserCompatMediaItem;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = ensuresubtreelookaheadreplaced.read;
        String str4 = this.read;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = ensuresubtreelookaheadreplaced.serializer;
        String str6 = this.serializer;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (!this.IconCompatParcelizer.equals(ensuresubtreelookaheadreplaced.IconCompatParcelizer) || !this.RemoteActionCompatParcelizer.equals(ensuresubtreelookaheadreplaced.RemoteActionCompatParcelizer)) {
            return false;
        }
        trackMeasurementByParent trackmeasurementbyparent = ensuresubtreelookaheadreplaced.ParcelableVolumeInfo;
        trackMeasurementByParent trackmeasurementbyparent2 = this.ParcelableVolumeInfo;
        if (trackmeasurementbyparent2 == null) {
            if (trackmeasurementbyparent != null) {
                return false;
            }
        } else if (!trackmeasurementbyparent2.equals(trackmeasurementbyparent)) {
            return false;
        }
        accessgetPlaceOuterCoordinatorLayerBlockp accessgetplaceoutercoordinatorlayerblockp = ensuresubtreelookaheadreplaced.MediaDescriptionCompat;
        accessgetPlaceOuterCoordinatorLayerBlockp accessgetplaceoutercoordinatorlayerblockp2 = this.MediaDescriptionCompat;
        if (accessgetplaceoutercoordinatorlayerblockp2 == null) {
            if (accessgetplaceoutercoordinatorlayerblockp != null) {
                return false;
            }
        } else if (!accessgetplaceoutercoordinatorlayerblockp2.equals(accessgetplaceoutercoordinatorlayerblockp)) {
            return false;
        }
        MeasurePassDelegate measurePassDelegate = ensuresubtreelookaheadreplaced.write;
        MeasurePassDelegate measurePassDelegate2 = this.write;
        if (measurePassDelegate2 == null) {
            if (measurePassDelegate != null) {
                return false;
            }
        } else if (!measurePassDelegate2.equals(measurePassDelegate)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.PlaybackStateCompatCustomAction + ", gmpAppId=" + this.MediaSessionCompatQueueItem + ", platform=" + this.MediaMetadataCompat + ", installationUuid=" + this.RatingCompat + ", firebaseInstallationId=" + this.MediaBrowserCompatMediaItem + ", firebaseAuthenticationToken=" + this.read + ", appQualitySessionId=" + this.serializer + ", buildVersion=" + this.IconCompatParcelizer + ", displayVersion=" + this.RemoteActionCompatParcelizer + ", session=" + this.ParcelableVolumeInfo + ", ndkPayload=" + this.MediaDescriptionCompat + ", appExitInfo=" + this.write + "}";
    }
}
