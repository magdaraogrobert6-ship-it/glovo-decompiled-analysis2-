package o;

import android.location.Location;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class deleteDataStoreFile {
    private final r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final _set_durationInMilliseconds_lambda0 read;
    private final r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ serializer;
    private final r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ write;

    public final r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ MediaMetadataCompat() {
        return this.serializer;
    }

    public final _set_durationInMilliseconds_lambda0 read() {
        return this.read;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = this.write;
        if (!RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq2) || (r8lambdali8uu9krigfjg6en6xj7af4cwaq = this.IconCompatParcelizer) == null) {
            return false;
        }
        long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
        long jPlaybackStateCompatCustomAction2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
        List<VenueSignificance> list = r8lambdaNhlkRWz5iIYpTs8A0990satz5JA.read;
        return jPlaybackStateCompatCustomAction - jPlaybackStateCompatCustomAction2 < 1800000;
    }

    public final boolean MediaDescriptionCompat() {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = this.write;
        if (!RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq)) {
            return false;
        }
        this.RemoteActionCompatParcelizer.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
        if (this.IconCompatParcelizer != null) {
            return false;
        }
        List<VenueSignificance> list = r8lambdaNhlkRWz5iIYpTs8A0990satz5JA.read;
        return jCurrentTimeMillis - jPlaybackStateCompatCustomAction < 1800000;
    }

    public final boolean MediaSessionCompatQueueItem() {
        long jCurrentTimeMillis;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = this.write;
        if (!RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq)) {
            return false;
        }
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = this.IconCompatParcelizer;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq2 != null) {
            jCurrentTimeMillis = r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
        } else {
            this.RemoteActionCompatParcelizer.getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
        List<VenueSignificance> list = r8lambdaNhlkRWz5iIYpTs8A0990satz5JA.read;
        return jCurrentTimeMillis - jPlaybackStateCompatCustomAction > 1800000;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.read.RatingCompat() == VenueSignificance.UNSET;
    }

    public final boolean ParcelableVolumeInfo() {
        VenueSignificance venueSignificanceRatingCompat = this.read.RatingCompat();
        return (venueSignificanceRatingCompat == VenueSignificance.UNSET || venueSignificanceRatingCompat.isOfTypeProvisional()) ? false : true;
    }

    public final boolean PlaybackStateCompatCustomAction() {
        return this.read.RatingCompat().isOfTypeProvisional();
    }

    public final int hashCode() {
        return this.read.serializer().hashCode();
    }

    public final long serializer() {
        long jPlaybackStateCompatCustomAction = this.serializer.PlaybackStateCompatCustomAction();
        long jIconCompatParcelizer = IconCompatParcelizer();
        if (jIconCompatParcelizer <= 0) {
            return 0L;
        }
        double d = jIconCompatParcelizer - jPlaybackStateCompatCustomAction;
        return (long) Math.ceil(((d % 3600000.0d) + d) / 3600000.0d);
    }

    public final long write() {
        return this.serializer.PlaybackStateCompatCustomAction();
    }

    public deleteDataStoreFile(_set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0, r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq, setHeaderTextColor setheadertextcolor, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = _set_durationinmilliseconds_lambda0;
        this.serializer = r8lambdali8uu9krigfjg6en6xj7af4cwaq;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
        setheadertextcolor.getClass();
        List list = (List) setheadertextcolor.serializer(Collections.EMPTY_LIST, new IInAppMessageThemeable(setheadertextcolor, 2, jPlaybackStateCompatCustomAction, inAppMessageFull));
        this.write = !list.isEmpty() ? (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) list.get(0) : null;
        this.IconCompatParcelizer = list.size() > 1 ? (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) list.get(1) : null;
    }

    public final long IconCompatParcelizer() {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = this.write;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq2 != null && !RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq2)) {
            return r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
        }
        if (!RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq2) || (r8lambdali8uu9krigfjg6en6xj7af4cwaq = this.IconCompatParcelizer) == null) {
            return 0L;
        }
        long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
        long jPlaybackStateCompatCustomAction2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
        List<VenueSignificance> list = r8lambdaNhlkRWz5iIYpTs8A0990satz5JA.read;
        if (jPlaybackStateCompatCustomAction - jPlaybackStateCompatCustomAction2 < 1800000) {
            return r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
        }
        return 0L;
    }

    public final boolean RatingCompat() {
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = this.write;
        return (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null || RemoteActionCompatParcelizer(r8lambdali8uu9krigfjg6en6xj7af4cwaq)) ? false : true;
    }

    public final Location RemoteActionCompatParcelizer() {
        Location location = new Location("");
        _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = this.read;
        location.setLatitude(_set_durationinmilliseconds_lambda0.MediaMetadataCompat());
        location.setLongitude(_set_durationinmilliseconds_lambda0.MediaDescriptionCompat());
        location.setTime(this.serializer.PlaybackStateCompatCustomAction());
        return location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || deleteDataStoreFile.class != obj.getClass()) {
            return false;
        }
        return this.read.serializer().equals(((deleteDataStoreFile) obj).read.serializer());
    }

    private static boolean RemoteActionCompatParcelizer(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq) {
        return r8lambdali8uu9krigfjg6en6xj7af4cwaq != null && r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() == TransportChangeType.OFF_THE_GRID;
    }
}
