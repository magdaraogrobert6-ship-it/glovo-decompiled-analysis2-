package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.ondevice.api.GeoLocation;
import com.sentiance.sdk.ondevice.api.segment.Segment;
import com.sentiance.sdk.ondevice.api.venue.Venue;
import com.sentiance.sdk.ondevice.api.venue.VenueType;
import com.sentiance.sdk.semantictime.api.SemanticTime;
import com.sentiance.sdk.util.database.WhereClause;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "UserContextAssembler")
public final class getDataStoremigrateGeofencesListToJson {
    private final setHeaderTextColor IconCompatParcelizer;
    private final r8lambdaVCuqLyUfZKjxZTfwwUfO2fEej64 MediaDescriptionCompat;
    private final handlePushNotificationPayloadlambda8 MediaSessionCompatQueueItem;
    private final migrateFeatureFlagStorageToJsonlambda20 RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final component4android_sdk_base_release serializer;
    private final parseLonglambda0 write;

    public final SemanticTime IconCompatParcelizer() {
        SemanticTime semanticTimeIconCompatParcelizer = this.MediaSessionCompatQueueItem.IconCompatParcelizer();
        semanticTimeIconCompatParcelizer.getClass();
        return semanticTimeIconCompatParcelizer;
    }

    public final Venue MediaDescriptionCompat() {
        return RemoteActionCompatParcelizer(androidx.sqlite.SQLite.read(VenueSignificance.WORK, VenueSignificance.WORK_PROVISIONAL), com.sentiance.sdk.ondevice.api.venue.VenueSignificance.WORK);
    }

    public final Venue RemoteActionCompatParcelizer() {
        return RemoteActionCompatParcelizer(androidx.sqlite.SQLite.read(VenueSignificance.HOME, VenueSignificance.HOME_PROVISIONAL), com.sentiance.sdk.ondevice.api.venue.VenueSignificance.HOME);
    }

    public final GeoLocation read() {
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer;
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) this.IconCompatParcelizer.serializer(InAppMessageFull.read());
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null || r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() == TransportChangeType.OFF_THE_GRID || (readVarRemoteActionCompatParcelizer = this.read.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null).RemoteActionCompatParcelizer()) == null || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.serializer)) == null || (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) == null) {
            return null;
        }
        Location locationWrite = getVerticalAccuracy.write(r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer);
        return new GeoLocation(locationWrite.getLatitude(), locationWrite.getLongitude(), (int) locationWrite.getAccuracy());
    }

    public final LinkedHashMap serializer() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = this.read.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null).RemoteActionCompatParcelizer();
        Long lValueOf = readVarRemoteActionCompatParcelizer != null ? Long.valueOf(readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) : null;
        if (lValueOf != null) {
            linkedHashMap.put(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, lValueOf);
        }
        return linkedHashMap;
    }

    public getDataStoremigrateGeofencesListToJson(parseLonglambda0 parselonglambda0, getCooldownEnterSeconds getcooldownenterseconds, getVerticalAccuracy getverticalaccuracy, component4android_sdk_base_release component4android_sdk_base_releaseVar, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, setHeaderTextColor setheadertextcolor, r8lambdaVCuqLyUfZKjxZTfwwUfO2fEej64 r8lambdavcuqlyufzkjxztfwwufo2feej64, handlePushNotificationPayloadlambda8 handlepushnotificationpayloadlambda8) {
        parselonglambda0.getClass();
        getcooldownenterseconds.getClass();
        getverticalaccuracy.getClass();
        component4android_sdk_base_releaseVar.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        setheadertextcolor.getClass();
        r8lambdavcuqlyufzkjxztfwwufo2feej64.getClass();
        handlepushnotificationpayloadlambda8.getClass();
        this.write = parselonglambda0;
        this.read = getcooldownenterseconds;
        this.serializer = component4android_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = migratefeatureflagstoragetojsonlambda20;
        this.IconCompatParcelizer = setheadertextcolor;
        this.MediaDescriptionCompat = r8lambdavcuqlyufzkjxztfwwufo2feej64;
        this.MediaSessionCompatQueueItem = handlepushnotificationpayloadlambda8;
    }

    public final ArrayList RemoteActionCompatParcelizer(boolean z) {
        List<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> list;
        InAppMessageFull inAppMessageFull = InAppMessageFull.read();
        ArrayList arrayList = new ArrayList();
        setHeaderTextColor setheadertextcolor = this.IconCompatParcelizer;
        r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) setheadertextcolor.serializer(inAppMessageFull);
        Long lValueOf = null;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq == null) {
            list = instance_delegatelambda0.write;
        } else {
            if (!r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat() || z) {
                arrayList.add(r8lambdali8uu9krigfjg6en6xj7af4cwaq);
            }
            long jPlaybackStateCompatCustomAction = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
            InAppMessageFull inAppMessageFull2 = InAppMessageFull.read();
            List list2 = androidx.sqlite.SQLite.read(Integer.valueOf(TransportChangeType.STATIONARY.value), Integer.valueOf(TransportChangeType.OFF_THE_GRID.value));
            InAppMessageFull.read readVar = new InAppMessageFull.read();
            readVar.IconCompatParcelizer("event_time").read(Long.valueOf(jPlaybackStateCompatCustomAction));
            readVar.IconCompatParcelizer("type").read(list2);
            List list3 = setheadertextcolor.read((isPushPrimer) inAppMessageFull2, (WhereClause) readVar, (Integer) 1, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "DESC"));
            list3.getClass();
            r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2 = (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) onContentCardDismissed.MediaMetadataCompat(list3);
            list = arrayList;
            if (r8lambdali8uu9krigfjg6en6xj7af4cwaq2 != null) {
                long jPlaybackStateCompatCustomAction2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction();
                long jPlaybackStateCompatCustomAction3 = r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction();
                InAppMessageFull inAppMessageFull3 = InAppMessageFull.read();
                InAppMessageFull.read readVar2 = new InAppMessageFull.read();
                readVar2.IconCompatParcelizer("event_time").IconCompatParcelizer(Long.valueOf(jPlaybackStateCompatCustomAction2));
                readVar2.IconCompatParcelizer("event_time").read(Long.valueOf(jPlaybackStateCompatCustomAction3));
                readVar2.write(z);
                List list4 = setheadertextcolor.read(inAppMessageFull3, readVar2, (Integer) null, migrateSealedSessionsMapToJsonlambda10.RemoteActionCompatParcelizer("event_time", "DESC"));
                list4.getClass();
                arrayList.addAll(list4);
                if (!r8lambdali8uu9krigfjg6en6xj7af4cwaq2.MediaDescriptionCompat() || z) {
                    list = arrayList;
                    arrayList.add(r8lambdali8uu9krigfjg6en6xj7af4cwaq2);
                    list = arrayList;
                }
            }
        }
        Object[] objArr = {Integer.valueOf(list.size())};
        parseLonglambda0 parselonglambda0 = this.write;
        parselonglambda0.IconCompatParcelizer("Preparing the user's context with %d transport change entries", objArr);
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq3 : list) {
            com.sentiance.sdk.ondevice.api.event.Event event = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.read(r8lambdali8uu9krigfjg6en6xj7af4cwaq3, lValueOf, this.RemoteActionCompatParcelizer, setheadertextcolor, parselonglambda0);
            long jPlaybackStateCompatCustomAction4 = r8lambdali8uu9krigfjg6en6xj7af4cwaq3.PlaybackStateCompatCustomAction();
            arrayList2.add(event);
            lValueOf = Long.valueOf(jPlaybackStateCompatCustomAction4);
        }
        return arrayList2;
    }

    public final ArrayList write() {
        this.MediaDescriptionCompat.write().getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            Segment segment = obj instanceof Segment ? (Segment) obj : null;
            if (segment != null) {
                arrayList2.add(segment);
            }
        }
        return arrayList2;
    }

    private final Venue RemoteActionCompatParcelizer(List<? extends VenueSignificance> list, com.sentiance.sdk.ondevice.api.venue.VenueSignificance venueSignificance) {
        VenueType venueType;
        r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw r8lambda4uwa2xkn9m8lsqlzysujo6oipxw = new r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw();
        r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw.IconCompatParcelizer iconCompatParcelizer = new r8lambda4uWA2XKn9m8LsqLzYSUJO6oiPxw.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((VenueSignificance) it.next()).value));
        }
        iconCompatParcelizer.IconCompatParcelizer("m.venue_significance").read(arrayList);
        List list2 = (List) this.IconCompatParcelizer.serializer(Collections.EMPTY_LIST, new r8lambdayIxqFCqp5HXqcwSgBY71YAQtSs(r8lambda4uwa2xkn9m8lsqlzysujo6oipxw, iconCompatParcelizer, this.write, 3));
        list2.getClass();
        setMessageFields setmessagefields = (setMessageFields) onContentCardDismissed.MediaMetadataCompat(list2);
        if (setmessagefields == null) {
            return null;
        }
        _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = setmessagefields.read();
        com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType venueTypeMediaBrowserCompatMediaItem = _set_durationinmilliseconds_lambda0.MediaBrowserCompatMediaItem();
        if (venueTypeMediaBrowserCompatMediaItem == null || (venueType = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.read(venueTypeMediaBrowserCompatMediaItem)) == null) {
            venueType = VenueType.UNKNOWN;
        }
        return new Venue(venueSignificance, venueType, new GeoLocation(_set_durationinmilliseconds_lambda0.MediaMetadataCompat(), _set_durationinmilliseconds_lambda0.MediaDescriptionCompat(), _set_durationinmilliseconds_lambda0.read()));
    }
}
