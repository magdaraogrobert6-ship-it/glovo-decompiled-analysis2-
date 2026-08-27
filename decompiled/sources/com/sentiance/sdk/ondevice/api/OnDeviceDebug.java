package com.sentiance.sdk.ondevice.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.util.Pair;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueType;
import com.sentiance.sdk.ondevice.api.OnDeviceDebug;
import com.sentiance.sdk.ondevice.api.event.OccupantRole;
import com.sentiance.sdk.ondevice.api.event.TransportMode;
import com.sentiance.sdk.threading.executors.Executors;
import com.sentiance.sdk.util.N;
import com.sentiance.sdk.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.BrazeCompanionExternalSyntheticLambda4;
import o.IInAppMessageWithImage;
import o.InAppMessageFull;
import o.InAppMessageHtml;
import o.InAppMessageHtmlBase;
import o.SdkMetadataDataStoreProviderCompanion;
import o._set_durationInMilliseconds_lambda0;
import o._set_durationInMilliseconds_lambda1;
import o.cancelNotification;
import o.component4android_sdk_base_release;
import o.createStoryPageClickedPendingIntent;
import o.getAnalyticsEnabledEnterannotations;
import o.getAssetsZipRemoteUrl;
import o.getBigPictureNotificationStylelambda0;
import o.getConversationalPushStylelambda1;
import o.getConversationalPushStylelambda2;
import o.getCooldownEnterSeconds;
import o.getInlineImageStylelambda0;
import o.getInlineImageStylelambda1;
import o.getVerticalAccuracy;
import o.handleLogClick;
import o.logButtonClicklambda0;
import o.logButtonClicklambda1;
import o.migrateEventDuplicationMap;
import o.migrateEventDuplicationMaplambda20;
import o.parsePayloadFieldsFromBundleparsePushStoryData;
import o.parseString;
import o.populatePushStoryPage;
import o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk;
import o.r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M;
import o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI;
import o.r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU;
import o.r8lambdaLnKUwFcTXyyCsnNZGD04zGjVSqI;
import o.r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog;
import o.r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaSywuHIWfLiZV_fav810RJNKPOo;
import o.r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs;
import o.r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA;
import o.r8lambdaaEgDR3QhgkZgFX2zhqdtOpvzs;
import o.r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ;
import o.r8lambdamC3IEc_Rvmvul_SD1h7jhUhfLbU;
import o.r8lambdaxAOAlbTkj3YEh3SZKIXWJV04;
import o.r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA;
import o.r8lambdazOPlnxU6Foulwq_Wcc80USWXeNo;
import o.readBoolean;
import o.readandroid_sdk_base_release;
import o.runlambda0;
import o.setAssetUrls;
import o.setHeaderTextColor;
import o.setPushUniqueId;
import o.setRemoteImageUrl;
import o.storeRegisteredGeofencesToLocalStoragelambda0;

/* JADX INFO: loaded from: classes5.dex */
@runlambda0
@DontObfuscate
public class OnDeviceDebug extends N {
    private static final String GUARD_TAG = "OnDeviceDebug";

    @SuppressLint
    private static OnDeviceDebug sInstance;
    private final Context mContext;
    private r8lambdazOPlnxU6Foulwq_Wcc80USWXeNo mTCEventListener;
    private getConversationalPushStylelambda1 mTimelineUpdateEventConsumer;
    private logButtonClicklambda0 mTimelineUpdateListener;
    private getConversationalPushStylelambda2 mTCEventConsumer = null;
    private readandroid_sdk_base_release mSerialExecutor = null;

    public static /* synthetic */ r8lambdazOPlnxU6Foulwq_Wcc80USWXeNo access$000(OnDeviceDebug onDeviceDebug) {
        onDeviceDebug.getClass();
        return null;
    }

    public static /* synthetic */ logButtonClicklambda0 access$100(OnDeviceDebug onDeviceDebug) {
        onDeviceDebug.getClass();
        return null;
    }

    private readandroid_sdk_base_release getSerialExecutor() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar;
        synchronized (this) {
            if (this.mSerialExecutor == null) {
                this.mSerialExecutor = ((Executors) setPushUniqueId.read(Executors.class)).read();
            }
            readandroid_sdk_base_releaseVar = this.mSerialExecutor;
        }
        return readandroid_sdk_base_releaseVar;
    }

    public static OnDeviceDebug getInstance(Context context) {
        OnDeviceDebug onDeviceDebug;
        synchronized (OnDeviceDebug.class) {
            if (sInstance == null) {
                sInstance = new OnDeviceDebug(context);
            }
            onDeviceDebug = sInstance;
        }
        return onDeviceDebug;
    }

    @runlambda0
    private Location getLatestHomeOrWorkLocation(List<VenueSignificance> list) {
        setHeaderTextColor setheadertextcolor = (setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class);
        List<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> list2 = setheadertextcolor.read(list);
        Collections.sort(list2, new createStoryPageClickedPendingIntent(0));
        if (list2.isEmpty()) {
            return null;
        }
        List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem(), list2.get(0).r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        Location location = new Location("");
        location.setLatitude(((_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0)).MediaMetadataCompat());
        location.setLongitude(((_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0)).MediaDescriptionCompat());
        return location;
    }

    @runlambda0
    private Location getStationaryLocation(String str) {
        List listIconCompatParcelizer = ((setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class)).IconCompatParcelizer(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem(), str);
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        Location location = new Location("transport-change-stationary");
        _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = (_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0);
        location.setLatitude(_set_durationinmilliseconds_lambda0.MediaMetadataCompat());
        location.setLongitude(_set_durationinmilliseconds_lambda0.MediaDescriptionCompat());
        location.setAccuracy(_set_durationinmilliseconds_lambda0.read());
        return location;
    }

    @runlambda0
    private String getTags(long j) {
        setHeaderTextColor setheadertextcolor = (setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class);
        setheadertextcolor.getClass();
        List<getAssetsZipRemoteUrl> list = (List) setheadertextcolor.serializer(Collections.EMPTY_LIST, new migrateEventDuplicationMap(setheadertextcolor, j, 2));
        if (list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (getAssetsZipRemoteUrl getassetszipremoteurl : list) {
            if (getassetszipremoteurl.read().equals("name")) {
                return getassetszipremoteurl.MediaDescriptionCompat();
            }
            arrayList.add(getassetszipremoteurl.MediaDescriptionCompat());
        }
        return r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ", ");
    }

    private handleLogClick getTransportMetadataEntry(String str) {
        List listIconCompatParcelizer = ((setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class)).IconCompatParcelizer(InAppMessageHtml.MediaBrowserCompatMediaItem(), str);
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        return (handleLogClick) listIconCompatParcelizer.get(0);
    }

    @runlambda0
    private long getVenueId(long j) {
        setHeaderTextColor setheadertextcolor = (setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class);
        setheadertextcolor.getClass();
        List list = (List) setheadertextcolor.serializer(Collections.EMPTY_LIST, new migrateEventDuplicationMap(setheadertextcolor, j, 1));
        if (list.isEmpty()) {
            return -1L;
        }
        return ((setRemoteImageUrl) list.get(0)).RemoteActionCompatParcelizer;
    }

    @runlambda0
    private Pair<Long, String> getVenueIdAndTags(String str) {
        setHeaderTextColor setheadertextcolor = (setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class);
        setheadertextcolor.getClass();
        _set_durationInMilliseconds_lambda1 _set_durationinmilliseconds_lambda1 = (_set_durationInMilliseconds_lambda1) setheadertextcolor.RemoteActionCompatParcelizer(new migrateEventDuplicationMaplambda20(setheadertextcolor, str, 1));
        if (_set_durationinmilliseconds_lambda1 == null) {
            return new Pair<>(-1L, "");
        }
        long jSerializer = _set_durationinmilliseconds_lambda1.serializer();
        long venueId = getVenueId(jSerializer);
        return new Pair<>(Long.valueOf(venueId), getTags(jSerializer));
    }

    @runlambda0
    private com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueSignificance getVenueSignificance(String str) {
        List listIconCompatParcelizer = ((setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class)).IconCompatParcelizer(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem(), str);
        if (listIconCompatParcelizer.isEmpty()) {
            return null;
        }
        VenueSignificance venueSignificanceRatingCompat = ((_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0)).RatingCompat();
        if (venueSignificanceRatingCompat == VenueSignificance.UNSET) {
            return com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueSignificance.UNSET;
        }
        if (venueSignificanceRatingCompat == VenueSignificance.UNKNOWN) {
            return com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueSignificance.UNKNOWN;
        }
        if (Arrays.asList(VenueSignificance.HOME, VenueSignificance.HOME_PROVISIONAL).contains(venueSignificanceRatingCompat)) {
            return com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueSignificance.HOME;
        }
        if (Arrays.asList(VenueSignificance.WORK, VenueSignificance.WORK_PROVISIONAL).contains(venueSignificanceRatingCompat)) {
            return com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueSignificance.WORK;
        }
        if (Arrays.asList(VenueSignificance.POI, VenueSignificance.POI_PROVISIONAL).contains(venueSignificanceRatingCompat)) {
            return com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueSignificance.POI;
        }
        return null;
    }

    @runlambda0
    private VenueType getVenueType(String str) {
        com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType venueTypeMediaBrowserCompatMediaItem;
        List listIconCompatParcelizer = ((setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class)).IconCompatParcelizer(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem(), str);
        if (listIconCompatParcelizer.isEmpty() || (venueTypeMediaBrowserCompatMediaItem = ((_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0)).MediaBrowserCompatMediaItem()) == null) {
            return null;
        }
        switch (getInlineImageStylelambda1.read[venueTypeMediaBrowserCompatMediaItem.ordinal()]) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static List lambda$getActiveModels$3(List list) {
        cancelNotification cancelnotification = (cancelNotification) setPushUniqueId.read(cancelNotification.class);
        Iterator<r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA> it = ((r8lambdaLnKUwFcTXyyCsnNZGD04zGjVSqI) setPushUniqueId.read(r8lambdaLnKUwFcTXyyCsnNZGD04zGjVSqI.class)).write().read().iterator();
        while (it.hasNext()) {
            populatePushStoryPage populatepushstorypageWrite = cancelnotification.write(it.next().MediaMetadataCompat());
            if (populatepushstorypageWrite != null) {
                list.add(new r8lambdaaEgDR3QhgkZgFX2zhqdtOpvzs(populatepushstorypageWrite.MediaSessionCompatQueueItem(), populatepushstorypageWrite.MediaBrowserCompatMediaItem(), populatepushstorypageWrite.read()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Location lambda$getLastLocation$6() {
        r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        getCooldownEnterSeconds getcooldownenterseconds = (getCooldownEnterSeconds) setPushUniqueId.read(getCooldownEnterSeconds.class);
        getVerticalAccuracy getverticalaccuracy = (getVerticalAccuracy) setPushUniqueId.read(getVerticalAccuracy.class);
        component4android_sdk_base_release component4android_sdk_base_releaseVar = (component4android_sdk_base_release) setPushUniqueId.read(component4android_sdk_base_release.class);
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, (Long) null);
        if (!optionalIconCompatParcelizer.IconCompatParcelizer() || (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = optionalIconCompatParcelizer.write().RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar)) == null || (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) == null) {
            return null;
        }
        BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
        getverticalaccuracy.getClass();
        return getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getStationaryVenues$4(InAppMessageHtmlBase inAppMessageHtmlBase) {
        ArrayList arrayList = new ArrayList();
        setHeaderTextColor setheadertextcolor = (setHeaderTextColor) setPushUniqueId.read(setHeaderTextColor.class);
        setheadertextcolor.getClass();
        for (_set_durationInMilliseconds_lambda1 _set_durationinmilliseconds_lambda1 : (List) setheadertextcolor.serializer(Collections.EMPTY_LIST, new IInAppMessageWithImage(setheadertextcolor, 0))) {
            List listSerializer = setheadertextcolor.serializer(InAppMessageFull.read(), _set_durationinmilliseconds_lambda1.MediaSessionCompatQueueItem());
            if (!listSerializer.isEmpty() && ((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) listSerializer.get(0)).read() == TransportChangeType.STATIONARY) {
                List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem(), ((r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ) listSerializer.get(0)).r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
                if (!listIconCompatParcelizer.isEmpty()) {
                    _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = (_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0);
                    double dMediaMetadataCompat = _set_durationinmilliseconds_lambda0.MediaMetadataCompat();
                    double dMediaDescriptionCompat = _set_durationinmilliseconds_lambda0.MediaDescriptionCompat();
                    HashMap map = new HashMap();
                    for (getAssetsZipRemoteUrl getassetszipremoteurl : (List) setheadertextcolor.serializer(Collections.EMPTY_LIST, new migrateEventDuplicationMap(setheadertextcolor, _set_durationinmilliseconds_lambda1.serializer(), 2))) {
                        map.put(getassetszipremoteurl.read(), getassetszipremoteurl.MediaDescriptionCompat());
                    }
                    arrayList.add(new setAssetUrls(dMediaMetadataCompat, dMediaDescriptionCompat, map));
                }
            }
        }
        readBoolean.serializer(new getInlineImageStylelambda0(arrayList, getHomeLocation(), getWorkLocation()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @runlambda0
    public r8lambdamC3IEc_Rvmvul_SD1h7jhUhfLbU toTransportChangeExternal(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq) {
        long jLongValue;
        com.sentiance.sdk.eventtimeline.timelines.tempinterface.VenueSignificance venueSignificance;
        VenueType venueType;
        Location stationaryLocation;
        String str;
        Integer numValueOf;
        Map<String, String> map;
        List list;
        OccupantRole occupantRoleIconCompatParcelizer;
        com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType transportChangeTypeExternal = toTransportChangeTypeExternal(r8lambdali8uu9krigfjg6en6xj7af4cwaq.read());
        if (transportChangeTypeExternal == null) {
            return null;
        }
        if (r8lambdali8uu9krigfjg6en6xj7af4cwaq.read() == TransportChangeType.STATIONARY) {
            Pair<Long, String> venueIdAndTags = getVenueIdAndTags(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            jLongValue = ((Long) venueIdAndTags.first).longValue();
            str = (String) venueIdAndTags.second;
            venueSignificance = getVenueSignificance(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            venueType = getVenueType(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            stationaryLocation = getStationaryLocation(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        } else {
            jLongValue = -1;
            venueSignificance = null;
            venueType = null;
            stationaryLocation = null;
            str = "";
        }
        long j = jLongValue;
        handleLogClick transportMetadataEntry = getTransportMetadataEntry(r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
        List list2 = Collections.EMPTY_LIST;
        OccupantRole occupantRole = OccupantRole.UNAVAILABLE;
        if (transportMetadataEntry == null || transportMetadataEntry.MediaDescriptionCompat() == -1) {
            numValueOf = null;
            map = null;
            list = list2;
            occupantRoleIconCompatParcelizer = occupantRole;
        } else {
            ArrayList arrayList = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.read(transportMetadataEntry);
            int iMediaDescriptionCompat = transportMetadataEntry.MediaDescriptionCompat();
            parseString parsestringPlaybackStateCompat = transportMetadataEntry.PlaybackStateCompat();
            map = parsestringPlaybackStateCompat != null ? parsestringPlaybackStateCompat.read() : null;
            occupantRoleIconCompatParcelizer = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.IconCompatParcelizer(transportMetadataEntry.MediaMetadataCompat());
            list = arrayList;
            numValueOf = Integer.valueOf(iMediaDescriptionCompat);
        }
        return new r8lambdamC3IEc_Rvmvul_SD1h7jhUhfLbU(transportChangeTypeExternal, r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction(), j, str, venueSignificance, venueType, stationaryLocation, list, numValueOf, map, occupantRoleIconCompatParcelizer, r8lambdali8uu9krigfjg6en6xj7af4cwaq.MediaDescriptionCompat());
    }

    @runlambda0
    private com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType toTransportChangeTypeExternal(TransportChangeType transportChangeType) {
        switch (getInlineImageStylelambda1.RemoteActionCompatParcelizer[transportChangeType.ordinal()]) {
            case 1:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.STATIONARY;
            case 2:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.OFF_THE_GRID;
            case 3:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_BIKING;
            case 4:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_CAR;
            case 5:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_TRAIN;
            case 6:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_TRAM;
            case 7:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_WALKING;
            case 8:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_RUNNING;
            case 9:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_BUS;
            case 10:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_FOOT;
            case 11:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_VEHICLE;
            case 12:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_RAIL;
            case 13:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_MOTORCYCLE;
            case 14:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_UNKNOWN;
            case 15:
                return com.sentiance.sdk.eventtimeline.timelines.tempinterface.TransportChangeType.TRANSPORT_IDLE;
            default:
                return null;
        }
    }

    @runlambda0
    public List<r8lambdaaEgDR3QhgkZgFX2zhqdtOpvzs> getActiveModels() {
        final ArrayList arrayList = new ArrayList();
        return (List) ifSdkIsInitializedWithUser(arrayList, (r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk<ArrayList>) new r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk() { // from class: o.getBigPictureNotificationStylelambda1
            @Override // o.r8lambda4Ay9OZbjge2RHLfWCxo1syVlPrk
            public final Object IconCompatParcelizer() {
                return OnDeviceDebug.lambda$getActiveModels$3(arrayList);
            }
        });
    }

    public String getClassifiedTransportModeOverride() {
        return ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).IconCompatParcelizer();
    }

    @runlambda0
    public Location getLastLocation() {
        return (Location) ifSdkIsInitializedWithUser(new SdkMetadataDataStoreProviderCompanion() { // from class: o.createStoryTraversedPendingIntent
            @Override // o.SdkMetadataDataStoreProviderCompanion
            public final Object serializer() {
                return OnDeviceDebug.lambda$getLastLocation$6();
            }
        });
    }

    @runlambda0
    public Map<String, String> getLastSetTransportTags() {
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = (r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI) setPushUniqueId.read(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI.class);
        parsePayloadFieldsFromBundleparsePushStoryData parsepayloadfieldsfrombundleparsepushstorydata = (parsePayloadFieldsFromBundleparsePushStoryData) setPushUniqueId.read(parsePayloadFieldsFromBundleparsePushStoryData.class);
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        parseString parsestring = parsepayloadfieldsfrombundleparsepushstorydata.read(System.currentTimeMillis());
        if (parsestring == null) {
            return null;
        }
        return parsestring.read();
    }

    @runlambda0
    public void getTransportChanges(final long j, logButtonClicklambda1 logbuttonclicklambda1) {
        ifSdkIsInitializedWithUser(new r8lambdaA5Nojo_weyBvRJwWwexNGN83YI() { // from class: o.getBigPictureNotificationStylelambda2
            @Override // o.r8lambdaA5Nojo_weyBvRJwWwexNGN83YI
            public final void RemoteActionCompatParcelizer() {
                this.serializer.lambda$getTransportChanges$1(j, null);
            }
        });
    }

    @runlambda0
    public boolean isAutoSyncAllPayloadsOverrideSet() {
        return ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).MediaDescriptionCompat();
    }

    public Boolean isTransportPostProcessingEnabled() {
        return ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).MediaSessionCompatQueueItem();
    }

    @runlambda0
    public void setAutoSyncAllPayloadsOverride(boolean z) {
        ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).read(z);
    }

    public void setTransportPostProcessingEnabled(Boolean bool) {
        ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).read(bool);
    }

    @runlambda0
    public void setTimelineUpdateListener(logButtonClicklambda0 logbuttonclicklambda0) {
        ifSdkIsInitializedWithUser(new r8lambdaxAOAlbTkj3YEh3SZKIXWJV04(this, 2));
    }

    @runlambda0
    public void setTransportClassificationEventListener(r8lambdazOPlnxU6Foulwq_Wcc80USWXeNo r8lambdazoplnxu6foulwq_wcc80uswxeno) {
        ifSdkIsInitializedWithUser(new r8lambdaxAOAlbTkj3YEh3SZKIXWJV04(this, 1));
    }

    private OnDeviceDebug(Context context) {
        this.mContext = context;
    }

    @runlambda0
    private Location getHomeLocation() {
        return getLatestHomeOrWorkLocation(Arrays.asList(VenueSignificance.HOME, VenueSignificance.HOME_PROVISIONAL));
    }

    @runlambda0
    private Location getWorkLocation() {
        return getLatestHomeOrWorkLocation(Arrays.asList(VenueSignificance.WORK, VenueSignificance.WORK_PROVISIONAL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getLatestHomeOrWorkLocation$5(r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq, r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq2) {
        return Long.compare(r8lambdali8uu9krigfjg6en6xj7af4cwaq2.PlaybackStateCompatCustomAction(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.PlaybackStateCompatCustomAction());
    }

    public void setClassifiedTransportModeOverride(TransportMode transportMode) {
        if (transportMode == null) {
            ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).write((String) null);
        } else {
            ((storeRegisteredGeofencesToLocalStoragelambda0) setPushUniqueId.read(storeRegisteredGeofencesToLocalStoragelambda0.class)).write(transportMode.name());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getTransportChanges$1(long j, logButtonClicklambda1 logbuttonclicklambda1) {
        getParallelExecutor().RemoteActionCompatParcelizer(new getBigPictureNotificationStylelambda0(this, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTimelineUpdateListener$2(logButtonClicklambda0 logbuttonclicklambda0) {
        if (this.mTimelineUpdateEventConsumer == null) {
            this.mTimelineUpdateEventConsumer = new getConversationalPushStylelambda1(this, getParallelExecutor());
        }
        if (logbuttonclicklambda0 == null) {
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(this.mTimelineUpdateEventConsumer);
        } else {
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, this.mTimelineUpdateEventConsumer);
        }
    }

    @runlambda0
    public void getStationaryVenues(InAppMessageHtmlBase inAppMessageHtmlBase) {
        ifSdkIsInitializedWithUser(getSentianceHandler(), new r8lambdaxAOAlbTkj3YEh3SZKIXWJV04(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTransportClassificationEventListener$0(r8lambdazOPlnxU6Foulwq_Wcc80USWXeNo r8lambdazoplnxu6foulwq_wcc80uswxeno) {
        getConversationalPushStylelambda2 getconversationalpushstylelambda2 = this.mTCEventConsumer;
        if (r8lambdazoplnxu6foulwq_wcc80uswxeno != null) {
            if (getconversationalpushstylelambda2 == null) {
                this.mTCEventConsumer = new getConversationalPushStylelambda2(this, getSerialExecutor());
            }
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).RemoteActionCompatParcelizer(r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class, this.mTCEventConsumer);
        } else if (getconversationalpushstylelambda2 != null) {
            ((getAnalyticsEnabledEnterannotations) setPushUniqueId.read(getAnalyticsEnabledEnterannotations.class)).serializer(r8lambdaVYxNhK9sdrAxWugVbef6IZzXiDs.class, this.mTCEventConsumer);
        }
    }
}
