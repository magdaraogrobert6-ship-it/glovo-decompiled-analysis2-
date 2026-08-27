package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.ondevice.api.GeoLocation;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.ondevice.api.event.OccupantRole;
import com.sentiance.sdk.ondevice.api.event.OffTheGridEvent;
import com.sentiance.sdk.ondevice.api.event.StationaryEvent;
import com.sentiance.sdk.ondevice.api.event.TransportEvent;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import com.sentiance.sdk.ondevice.api.event.UnknownEvent;
import com.sentiance.sdk.ondevice.api.venue.Venue;
import com.sentiance.sdk.ondevice.api.venue.VenueSignificance;
import com.sentiance.sdk.ondevice.api.venue.VenueType;
import com.sentiance.sdk.util.DateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA {
    public static final VenueType read(com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType venueType) {
        switch (r8lambdaciDJKXmZgLzmydiUMG1ZIpVpbxI.serializer[venueType.ordinal()]) {
            case 1:
                return VenueType.DRINK_DAY;
            case 2:
                return VenueType.DRINK_EVENING;
            case 3:
                return VenueType.EDUCATION_INDEPENDENT;
            case 4:
                return VenueType.EDUCATION_PARENTS;
            case 5:
                return VenueType.HEALTH;
            case 6:
                return VenueType.INDUSTRIAL;
            case 7:
                return VenueType.LEISURE_BEACH;
            case 8:
                return VenueType.LEISURE_DAY;
            case 9:
                return VenueType.LEISURE_EVENING;
            case 10:
                return VenueType.LEISURE_MUSEUM;
            case 11:
                return VenueType.LEISURE_NATURE;
            case 12:
                return VenueType.LEISURE_PARK;
            case 13:
                return VenueType.OFFICE;
            case 14:
                return VenueType.RELIGION;
            case 15:
                return VenueType.RESIDENTIAL;
            case 16:
                return VenueType.RESTO_MID;
            case 17:
                return VenueType.RESTO_SHORT;
            case 18:
                return VenueType.SHOP_LONG;
            case 19:
                return VenueType.SHOP_SHORT;
            case 20:
                return VenueType.SPORT;
            case 21:
                return VenueType.SPORT_ATTEND;
            case 22:
                return VenueType.TRAVEL_BUS;
            case 23:
                return VenueType.TRAVEL_CONFERENCE;
            case 24:
                return VenueType.TRAVEL_FILL;
            case 25:
                return VenueType.TRAVEL_HOTEL;
            case 26:
                return VenueType.TRAVEL_LONG;
            case 27:
                return VenueType.TRAVEL_SHORT;
            default:
                return VenueType.UNKNOWN;
        }
    }

    public static final OccupantRole IconCompatParcelizer(OccupantRoleInternal occupantRoleInternal) {
        occupantRoleInternal.getClass();
        int i = r8lambdaciDJKXmZgLzmydiUMG1ZIpVpbxI.write[occupantRoleInternal.ordinal()];
        if (i == 1) {
            return OccupantRole.DRIVER;
        }
        if (i == 2) {
            return OccupantRole.PASSENGER;
        }
        if (i == 3) {
            return OccupantRole.UNAVAILABLE;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public static final com.sentiance.sdk.ondevice.api.event.Event read(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq, Long l, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, setHeaderTextColor setheadertextcolor, parseLonglambda0 parselonglambda0) {
        TransportMode transportMode;
        List list;
        OccupantRole occupantRoleIconCompatParcelizer;
        parseString parsestringPlaybackStateCompat;
        OccupantRoleInternal occupantRoleInternalMediaMetadataCompat;
        VenueSignificance venueSignificance;
        VenueType venueType;
        r8lambdali8uu9krigfjg6en6xj7af4cwaq.getClass();
        List<accessgetClickLoggedp> listWrite = migratefeatureflagstoragetojsonlambda20.write();
        map = null;
        Map<String, String> map = null;
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() == TransportChangeType.OFF_THE_GRID) {
            listWrite.getClass();
            return new OffTheGridEvent(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction()), listWrite), l != null ? migrateFeatureFlagStorageToJsonlambda20.read(l, listWrite) : null, migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()), listWrite), r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat());
        }
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() == TransportChangeType.STATIONARY) {
            listWrite.getClass();
            DateTime dateTime = migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction()), listWrite);
            DateTime dateTime2 = l != null ? migrateFeatureFlagStorageToJsonlambda20.read(l, listWrite) : null;
            DateTime dateTime3 = migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()), listWrite);
            List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            listIconCompatParcelizer.getClass();
            if (listIconCompatParcelizer.isEmpty()) {
                return new StationaryEvent(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), dateTime, dateTime2, dateTime3, new Venue(VenueSignificance.UNKNOWN, VenueType.UNKNOWN, null), null);
            }
            _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = (_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0);
            com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance venueSignificanceRatingCompat = _set_durationinmilliseconds_lambda0.RatingCompat();
            venueSignificanceRatingCompat.getClass();
            switch (r8lambdaciDJKXmZgLzmydiUMG1ZIpVpbxI.RemoteActionCompatParcelizer[venueSignificanceRatingCompat.ordinal()]) {
                case 1:
                case 2:
                    venueSignificance = VenueSignificance.POINT_OF_INTEREST;
                    break;
                case 3:
                case 4:
                    venueSignificance = VenueSignificance.HOME;
                    break;
                case 5:
                case 6:
                    venueSignificance = VenueSignificance.WORK;
                    break;
                default:
                    venueSignificance = VenueSignificance.UNKNOWN;
                    break;
            }
            com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType venueTypeMediaBrowserCompatMediaItem = _set_durationinmilliseconds_lambda0.MediaBrowserCompatMediaItem();
            if (venueTypeMediaBrowserCompatMediaItem == null || (venueType = read(venueTypeMediaBrowserCompatMediaItem)) == null) {
                venueType = VenueType.UNKNOWN;
            }
            GeoLocation geoLocation = new GeoLocation(_set_durationinmilliseconds_lambda0.MediaMetadataCompat(), _set_durationinmilliseconds_lambda0.MediaDescriptionCompat(), _set_durationinmilliseconds_lambda0.read());
            return new StationaryEvent(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), dateTime, dateTime2, dateTime3, new Venue(venueSignificance, venueType, (venueSignificance == VenueSignificance.HOME || venueSignificance == VenueSignificance.WORK) ? geoLocation : null), geoLocation);
        }
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().isOfTypeTransport()) {
            listWrite.getClass();
            TransportChangeType transportChangeType = r8lambdali8uu9krigfjg6en6xj7af4cwaq.read();
            switch (transportChangeType == null ? -1 : r8lambdaciDJKXmZgLzmydiUMG1ZIpVpbxI.IconCompatParcelizer[transportChangeType.ordinal()]) {
                case 1:
                    transportMode = TransportMode.BICYCLE;
                    break;
                case 2:
                    transportMode = TransportMode.RUNNING;
                    break;
                case 3:
                case 4:
                    transportMode = TransportMode.WALKING;
                    break;
                case 5:
                case 6:
                    transportMode = TransportMode.TRAIN;
                    break;
                case 7:
                    transportMode = TransportMode.TRAM;
                    break;
                case 8:
                    transportMode = TransportMode.MOTORCYCLE;
                    break;
                case 9:
                case 10:
                    transportMode = TransportMode.CAR;
                    break;
                case 11:
                    transportMode = TransportMode.BUS;
                    break;
                case 12:
                    transportMode = TransportMode.UNKNOWN;
                    break;
                case 13:
                    transportMode = TransportMode.IDLE;
                    break;
                default:
                    parselonglambda0.RemoteActionCompatParcelizer("Could not identify the transport mode for transport state change of type " + r8lambdali8uu9krigfjg6en6xj7af4cwaq.read().name(), new Object[0]);
                    transportMode = TransportMode.UNKNOWN;
                    break;
            }
            TransportMode transportMode2 = transportMode;
            DateTime dateTime4 = migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction()), listWrite);
            DateTime dateTime5 = l != null ? migrateFeatureFlagStorageToJsonlambda20.read(l, listWrite) : null;
            DateTime dateTime6 = migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()), listWrite);
            String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys = r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            strR8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            List listIconCompatParcelizer2 = setheadertextcolor.IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), strR8lambda54BeH8ZsBru0CXI2CCSP2syNys);
            listIconCompatParcelizer2.getClass();
            handleLogClick handlelogclick = !listIconCompatParcelizer2.isEmpty() ? (handleLogClick) listIconCompatParcelizer2.get(0) : null;
            if (handlelogclick != null) {
                list = read(handlelogclick);
            } else {
                list = instance_delegatelambda0.write;
            }
            List list2 = list;
            if (handlelogclick == null || (occupantRoleInternalMediaMetadataCompat = handlelogclick.MediaMetadataCompat()) == null || (occupantRoleIconCompatParcelizer = IconCompatParcelizer(occupantRoleInternalMediaMetadataCompat)) == null) {
                occupantRoleIconCompatParcelizer = OccupantRole.UNAVAILABLE;
            }
            OccupantRole occupantRole = occupantRoleIconCompatParcelizer;
            String strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2 = r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys();
            Integer numValueOf = (handlelogclick == null || handlelogclick.MediaDescriptionCompat() == -1) ? null : Integer.valueOf(handlelogclick.MediaDescriptionCompat());
            if (handlelogclick != null && (parsestringPlaybackStateCompat = handlelogclick.PlaybackStateCompat()) != null) {
                map = parsestringPlaybackStateCompat.read();
            }
            return new TransportEvent(strR8lambda54BeH8ZsBru0CXI2CCSP2syNys2, dateTime4, dateTime5, dateTime6, transportMode2, list2, numValueOf, map == null ? SimpleItemTouchHelperCallback.serializer : map, occupantRole, r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat());
        }
        listWrite.getClass();
        return new UnknownEvent(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction()), listWrite), l != null ? migrateFeatureFlagStorageToJsonlambda20.read(l, listWrite) : null, migrateFeatureFlagStorageToJsonlambda20.read(Long.valueOf(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()), listWrite), r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat());
    }

    public static final ArrayList read(handleLogClick handlelogclick) {
        List<handleLogClickdefault> listMediaSessionCompatResultReceiverWrapper = handlelogclick.MediaSessionCompatResultReceiverWrapper();
        listMediaSessionCompatResultReceiverWrapper.getClass();
        ArrayList arrayList = new ArrayList(write(listMediaSessionCompatResultReceiverWrapper));
        BrazeContentCardsManagerCompanion.write(arrayList, new Comparator() { // from class: o.r8lambdaeh2HECQmxqIeNL_4VwzeUEYb8eM
            public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0(2) { // from class: com.sentiance.sdk.ondevice.api.OnDeviceAPIUtilKt$publicApiWaypoints$1
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    Waypoint waypoint = (Waypoint) obj;
                    Waypoint waypoint2 = (Waypoint) obj2;
                    waypoint.getClass();
                    waypoint2.getClass();
                    return Integer.valueOf((int) (waypoint.getTimestamp() - waypoint2.getTimestamp()));
                }
            };

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = this.write;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
                return ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, obj2)).intValue();
            }
        });
        return arrayList;
    }

    public static final ArrayList write(List list) {
        int iFloatValue;
        Float fIconCompatParcelizer;
        list.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) it.next();
            Float fValueOf = Float.valueOf(-1.0f);
            handlelogclickdefault.getClass();
            if (handlelogclickdefault.MediaSessionCompatQueueItem()) {
                Float fWrite = handlelogclickdefault.write();
                fWrite.getClass();
                iFloatValue = (int) fWrite.floatValue();
            } else {
                iFloatValue = -1;
            }
            int i = iFloatValue;
            if (handlelogclickdefault.RatingCompat()) {
                fIconCompatParcelizer = handlelogclickdefault.IconCompatParcelizer();
                fIconCompatParcelizer.getClass();
            } else {
                fIconCompatParcelizer = fValueOf;
            }
            float fFloatValue = fIconCompatParcelizer.floatValue();
            if (handlelogclickdefault.MediaMetadataCompat()) {
                fValueOf = handlelogclickdefault.MediaBrowserCompatMediaItem();
                fValueOf.getClass();
            }
            arrayList.add(new Waypoint(handlelogclickdefault.RemoteActionCompatParcelizer(), handlelogclickdefault.serializer(), handlelogclickdefault.MediaDescriptionCompat(), i, fFloatValue, fValueOf.floatValue(), handlelogclickdefault.MediaSessionCompatResultReceiverWrapper()));
        }
        return arrayList;
    }
}
