package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.datasync.DateTime;
import com.sentiance.core.model.datasync.GeoLocation;
import com.sentiance.core.model.datasync.HarshDrivingEvent;
import com.sentiance.core.model.datasync.HarshDrivingEventType;
import com.sentiance.core.model.datasync.MLModel;
import com.sentiance.core.model.datasync.SpeedLimit;
import com.sentiance.core.model.datasync.TransportOccupantRole;
import com.sentiance.core.model.datasync.VehicleCrashEvent;
import com.sentiance.core.model.datasync.VehicleCrashEventSeverity;
import com.sentiance.core.model.datasync.Waypoint;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.OccupantRoleInternal;
import com.sentiance.sdk.ondevicecommon.CrashSeverityInternal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r8lambdaRCRU6D22OHh6TjuvCYuaaTno78 {
    public static final VehicleCrashEvent RemoteActionCompatParcelizer(getSdkEnablementProviderandroid_sdk_base_releaseannotations getsdkenablementproviderandroid_sdk_base_releaseannotations, r8lambda5plvMMYc7MSPH8a8XIGNiKxWbe0 r8lambda5plvmmyc7msph8a8xignikxwbe0, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, boolean z) {
        double dFloatValue;
        Integer numValueOf;
        r8lambda5plvmmyc7msph8a8xignikxwbe0.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder, r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompatCustomAction(), migratefeatureflagstoragetojsonlambda20);
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setTimestamp(dateTimeRemoteActionCompatParcelizer);
        VehicleCrashEventSeverity vehicleCrashEventSeverity = null;
        if (r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaMetadataCompat() == null || r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaDescriptionCompat() == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Crash entry must have a valid latitude/longitude");
            return null;
        }
        isDisabledannotations isdisabledannotationsNewBuilder = Waypoint.newBuilder();
        double dFloatValue2 = 0.0d;
        if (z) {
            dFloatValue = 0.0d;
        } else {
            Float fMediaMetadataCompat = r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaMetadataCompat();
            fMediaMetadataCompat.getClass();
            dFloatValue = fMediaMetadataCompat.floatValue();
        }
        if (!z) {
            Float fMediaDescriptionCompat = r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaDescriptionCompat();
            fMediaDescriptionCompat.getClass();
            dFloatValue2 = fMediaDescriptionCompat.floatValue();
        }
        if (z) {
            numValueOf = -1;
        } else {
            Short sh = r8lambda5plvmmyc7msph8a8xignikxwbe0.read();
            numValueOf = sh != null ? Integer.valueOf(sh.shortValue()) : null;
        }
        GeoLocation geoLocationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(dFloatValue, dFloatValue2, numValueOf);
        isdisabledannotationsNewBuilder.serializer();
        ((Waypoint) isdisabledannotationsNewBuilder.write).setLocation(geoLocationRemoteActionCompatParcelizer);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2, r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompatCustomAction(), migratefeatureflagstoragetojsonlambda20);
        isdisabledannotationsNewBuilder.serializer();
        ((Waypoint) isdisabledannotationsNewBuilder.write).setTimestamp(dateTimeRemoteActionCompatParcelizer2);
        if (r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompat() != null) {
            Float fPlaybackStateCompat = r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompat();
            fPlaybackStateCompat.getClass();
            float fFloatValue = fPlaybackStateCompat.floatValue();
            isdisabledannotationsNewBuilder.serializer();
            ((Waypoint) isdisabledannotationsNewBuilder.write).setSpeedMps(fFloatValue);
        } else {
            isdisabledannotationsNewBuilder.serializer();
            ((Waypoint) isdisabledannotationsNewBuilder.write).clearSpeedMps();
        }
        isdisabledannotationsNewBuilder.serializer();
        ((Waypoint) isdisabledannotationsNewBuilder.write).clearSpeedLimit();
        Waypoint waypoint = (Waypoint) isdisabledannotationsNewBuilder.write();
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setWaypoint(waypoint);
        List<r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA> listMediaSessionCompatQueueItem = r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaSessionCompatQueueItem();
        listMediaSessionCompatQueueItem.getClass();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listMediaSessionCompatQueueItem, 10));
        for (r8lambdaGJYiIlALo3PjxJPWrDNLhr7A4uA r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua : listMediaSessionCompatQueueItem) {
            r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.getClass();
            clearDataStoreDatalambda0 cleardatastoredatalambda0NewBuilder = MLModel.newBuilder();
            String strIconCompatParcelizer = r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.IconCompatParcelizer();
            cleardatastoredatalambda0NewBuilder.serializer();
            ((MLModel) cleardatastoredatalambda0NewBuilder.write).setName(strIconCompatParcelizer);
            String strRemoteActionCompatParcelizer = r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.RemoteActionCompatParcelizer();
            cleardatastoredatalambda0NewBuilder.serializer();
            ((MLModel) cleardatastoredatalambda0NewBuilder.write).setFlavor(strRemoteActionCompatParcelizer);
            String str = r8lambdagjyiilalo3pjxjpwrdnlhr7a4ua.read();
            cleardatastoredatalambda0NewBuilder.serializer();
            ((MLModel) cleardatastoredatalambda0NewBuilder.write).setVersion(str);
            arrayList.add((MLModel) cleardatastoredatalambda0NewBuilder.write());
        }
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).addAllMlModels(arrayList);
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).clearMaxMagnitudeMps2();
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).clearMaxMagnitudeG();
        Float fRatingCompat = r8lambda5plvmmyc7msph8a8xignikxwbe0.RatingCompat();
        if (fRatingCompat != null) {
            float fFloatValue2 = fRatingCompat.floatValue();
            getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
            ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setMaxMagnitudeMps2(fFloatValue2);
            float fRemoteActionCompatParcelizer = r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.RemoteActionCompatParcelizer(fRatingCompat.floatValue());
            getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
            ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setMaxMagnitudeG(fRemoteActionCompatParcelizer);
        }
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).clearConfidencePercentage();
        Float fSerializer = r8lambda5plvmmyc7msph8a8xignikxwbe0.serializer();
        if (fSerializer != null) {
            int iFloatValue = (int) (fSerializer.floatValue() * 100.0f);
            getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
            ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setConfidencePercentage(iFloatValue);
        }
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).clearSpeedAtImpactMps();
        Float fPlaybackStateCompat2 = r8lambda5plvmmyc7msph8a8xignikxwbe0.PlaybackStateCompat();
        if (fPlaybackStateCompat2 != null) {
            float fFloatValue3 = fPlaybackStateCompat2.floatValue();
            getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
            ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setSpeedAtImpactMps(fFloatValue3);
        }
        getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
        ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).clearDeltaVMps();
        Float fMediaBrowserCompatMediaItem = r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaBrowserCompatMediaItem();
        if (fMediaBrowserCompatMediaItem != null) {
            float fFloatValue4 = fMediaBrowserCompatMediaItem.floatValue();
            getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
            ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setDeltaVMps(fFloatValue4);
        }
        CrashSeverityInternal crashSeverityInternalMediaSessionCompatResultReceiverWrapper = r8lambda5plvmmyc7msph8a8xignikxwbe0.MediaSessionCompatResultReceiverWrapper();
        int i = crashSeverityInternalMediaSessionCompatResultReceiverWrapper == null ? -1 : r8lambdaOGOAh5mtMGjkWWFJnaZg117J230.read[crashSeverityInternalMediaSessionCompatResultReceiverWrapper.ordinal()];
        if (i != -1) {
            if (i == 1) {
                vehicleCrashEventSeverity = VehicleCrashEventSeverity.VEHICLE_CRASH_EVENT_SEVERITY_HIGH;
            } else if (i != 2) {
                vehicleCrashEventSeverity = i != 3 ? VehicleCrashEventSeverity.VEHICLE_CRASH_EVENT_SEVERITY_UNSPECIFIED : VehicleCrashEventSeverity.VEHICLE_CRASH_EVENT_SEVERITY_LOW;
            } else {
                vehicleCrashEventSeverity = VehicleCrashEventSeverity.VEHICLE_CRASH_EVENT_SEVERITY_MEDIUM;
            }
        }
        if (vehicleCrashEventSeverity != null) {
            getsdkenablementproviderandroid_sdk_base_releaseannotations.serializer();
            ((VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write).setSeverity(vehicleCrashEventSeverity);
        }
        return (VehicleCrashEvent) getsdkenablementproviderandroid_sdk_base_releaseannotations.write();
    }

    public static final Waypoint serializer(handleLogClickdefault handlelogclickdefault, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20) {
        handlelogclickdefault.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        isDisabledannotations isdisabledannotationsNewBuilder = Waypoint.newBuilder();
        double dRemoteActionCompatParcelizer = handlelogclickdefault.RemoteActionCompatParcelizer();
        double dSerializer = handlelogclickdefault.serializer();
        Float fWrite = handlelogclickdefault.write();
        GeoLocation geoLocationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(dRemoteActionCompatParcelizer, dSerializer, fWrite != null ? Integer.valueOf((int) fWrite.floatValue()) : null);
        isdisabledannotationsNewBuilder.serializer();
        ((Waypoint) isdisabledannotationsNewBuilder.write).setLocation(geoLocationRemoteActionCompatParcelizer);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder, handlelogclickdefault.MediaDescriptionCompat(), migratefeatureflagstoragetojsonlambda20);
        isdisabledannotationsNewBuilder.serializer();
        ((Waypoint) isdisabledannotationsNewBuilder.write).setTimestamp(dateTimeRemoteActionCompatParcelizer);
        boolean zMediaSessionCompatResultReceiverWrapper = handlelogclickdefault.MediaSessionCompatResultReceiverWrapper();
        isdisabledannotationsNewBuilder.serializer();
        ((Waypoint) isdisabledannotationsNewBuilder.write).setIsSynthetic(zMediaSessionCompatResultReceiverWrapper);
        if (handlelogclickdefault.RatingCompat()) {
            Float fIconCompatParcelizer = handlelogclickdefault.IconCompatParcelizer();
            fIconCompatParcelizer.getClass();
            float fFloatValue = fIconCompatParcelizer.floatValue();
            isdisabledannotationsNewBuilder.serializer();
            ((Waypoint) isdisabledannotationsNewBuilder.write).setSpeedMps(fFloatValue);
        } else {
            isdisabledannotationsNewBuilder.serializer();
            ((Waypoint) isdisabledannotationsNewBuilder.write).clearSpeedMps();
        }
        enableDelayedInitializationlambda0 enabledelayedinitializationlambda0NewBuilder = SpeedLimit.newBuilder();
        if (handlelogclickdefault.MediaSessionCompatToken()) {
            enabledelayedinitializationlambda0NewBuilder.serializer();
            ((SpeedLimit) enabledelayedinitializationlambda0NewBuilder.write).setIsUnlimited(true);
            enabledelayedinitializationlambda0NewBuilder.serializer();
            ((SpeedLimit) enabledelayedinitializationlambda0NewBuilder.write).setSpeedLimitMps(Float.MAX_VALUE);
            SpeedLimit speedLimit = (SpeedLimit) enabledelayedinitializationlambda0NewBuilder.write();
            isdisabledannotationsNewBuilder.serializer();
            ((Waypoint) isdisabledannotationsNewBuilder.write).setSpeedLimit(speedLimit);
        } else if (handlelogclickdefault.MediaMetadataCompat()) {
            enabledelayedinitializationlambda0NewBuilder.serializer();
            ((SpeedLimit) enabledelayedinitializationlambda0NewBuilder.write).setIsUnlimited(false);
            Float fMediaBrowserCompatMediaItem = handlelogclickdefault.MediaBrowserCompatMediaItem();
            fMediaBrowserCompatMediaItem.getClass();
            float fFloatValue2 = fMediaBrowserCompatMediaItem.floatValue();
            enabledelayedinitializationlambda0NewBuilder.serializer();
            ((SpeedLimit) enabledelayedinitializationlambda0NewBuilder.write).setSpeedLimitMps(fFloatValue2);
            SpeedLimit speedLimit2 = (SpeedLimit) enabledelayedinitializationlambda0NewBuilder.write();
            isdisabledannotationsNewBuilder.serializer();
            ((Waypoint) isdisabledannotationsNewBuilder.write).setSpeedLimit(speedLimit2);
        } else {
            isdisabledannotationsNewBuilder.serializer();
            ((Waypoint) isdisabledannotationsNewBuilder.write).clearSpeedLimit();
        }
        return (Waypoint) isdisabledannotationsNewBuilder.write();
    }

    public static final GeoLocation RemoteActionCompatParcelizer(double d, double d2, Integer num) {
        r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder = GeoLocation.newBuilder();
        r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.serializer();
        ((GeoLocation) r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.write).setLatitude(d);
        r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.serializer();
        ((GeoLocation) r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.write).setLongitude(d2);
        if (num == null) {
            r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.serializer();
            ((GeoLocation) r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.write).clearHorizontalAccuracyMeters();
        } else {
            int iIntValue = num.intValue();
            r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.serializer();
            ((GeoLocation) r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.write).setHorizontalAccuracyMeters(iIntValue);
        }
        return (GeoLocation) r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.write();
    }

    public static final DateTime RemoteActionCompatParcelizer(r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1e, long j, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20) {
        migratefeatureflagstoragetojsonlambda20.getClass();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1e.serializer();
        ((DateTime) r8lambdaunx8bxencluajm_a_yqdjvn9p1e.write).setTimestampUtcMilliseconds(j);
        int timezoneOffsetInMinutes = migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(j)).getTimezoneOffsetInMinutes();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1e.serializer();
        ((DateTime) r8lambdaunx8bxencluajm_a_yqdjvn9p1e.write).setTimezoneOffsetMinutes(timezoneOffsetInMinutes);
        return (DateTime) r8lambdaunx8bxencluajm_a_yqdjvn9p1e.write();
    }

    public static final HarshDrivingEvent write(r8lambdaToWEBn4vVR9WqvyA_znNRwHzM r8lambdatowebn4vvr9wqvya_znnrwhzm, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, boolean z) {
        Iterable iterable;
        r8lambdatowebn4vvr9wqvya_znnrwhzm.getClass();
        migratefeatureflagstoragetojsonlambda20.getClass();
        clearDataStoreData cleardatastoredataNewBuilder = HarshDrivingEvent.newBuilder();
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder, r8lambdatowebn4vvr9wqvya_znnrwhzm.serializer(), migratefeatureflagstoragetojsonlambda20);
        cleardatastoredataNewBuilder.serializer();
        ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).setStart(dateTimeRemoteActionCompatParcelizer);
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2 = DateTime.newBuilder();
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2.getClass();
        DateTime dateTimeRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder2, r8lambdatowebn4vvr9wqvya_znnrwhzm.IconCompatParcelizer(), migratefeatureflagstoragetojsonlambda20);
        cleardatastoredataNewBuilder.serializer();
        ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).setEnd(dateTimeRemoteActionCompatParcelizer2);
        if (z) {
            iterable = instance_delegatelambda0.write;
        } else {
            List<handleLogClickdefault> listMediaDescriptionCompat = r8lambdatowebn4vvr9wqvya_znnrwhzm.MediaDescriptionCompat();
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listMediaDescriptionCompat, 10));
            Iterator<T> it = listMediaDescriptionCompat.iterator();
            while (it.hasNext()) {
                arrayList.add(serializer((handleLogClickdefault) it.next(), migratefeatureflagstoragetojsonlambda20));
            }
            iterable = arrayList;
        }
        cleardatastoredataNewBuilder.serializer();
        ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).addAllWaypoints(iterable);
        if (r8lambdatowebn4vvr9wqvya_znnrwhzm.MediaMetadataCompat() == null) {
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).clearType();
        } else {
            HarshDrivingEventType harshDrivingEventTypeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(r8lambdatowebn4vvr9wqvya_znnrwhzm.MediaMetadataCompat());
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).setType(harshDrivingEventTypeRemoteActionCompatParcelizer);
        }
        if (r8lambdatowebn4vvr9wqvya_znnrwhzm.read() == null) {
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).clearConfidencePercent();
        } else {
            int iIntValue = r8lambdatowebn4vvr9wqvya_znnrwhzm.read().intValue();
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).setConfidencePercent(iIntValue);
        }
        if (r8lambdatowebn4vvr9wqvya_znnrwhzm.RatingCompat() == null) {
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).clearTypeMotorcycle();
        } else {
            HarshDrivingEventType harshDrivingEventTypeRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(r8lambdatowebn4vvr9wqvya_znnrwhzm.RatingCompat());
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).setTypeMotorcycle(harshDrivingEventTypeRemoteActionCompatParcelizer2);
        }
        if (r8lambdatowebn4vvr9wqvya_znnrwhzm.RemoteActionCompatParcelizer() == null) {
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).clearConfidenceMotorcyclePercent();
        } else {
            int iIntValue2 = r8lambdatowebn4vvr9wqvya_znnrwhzm.RemoteActionCompatParcelizer().intValue();
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).setConfidenceMotorcyclePercent(iIntValue2);
        }
        if (r8lambdatowebn4vvr9wqvya_znnrwhzm.write() == null) {
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).clearMagnitudeMps2();
        } else {
            float fDoubleValue = (float) r8lambdatowebn4vvr9wqvya_znnrwhzm.write().doubleValue();
            cleardatastoredataNewBuilder.serializer();
            ((HarshDrivingEvent) cleardatastoredataNewBuilder.write).setMagnitudeMps2(fDoubleValue);
        }
        return (HarshDrivingEvent) cleardatastoredataNewBuilder.write();
    }

    private static final HarshDrivingEventType RemoteActionCompatParcelizer(HarshDrivingEntryType harshDrivingEntryType) {
        int i = r8lambdaOGOAh5mtMGjkWWFJnaZg117J230.serializer[harshDrivingEntryType.ordinal()];
        if (i == 1) {
            return HarshDrivingEventType.HARSH_DRIVING_EVENT_TYPE_ACCELERATING;
        }
        if (i == 2) {
            return HarshDrivingEventType.HARSH_DRIVING_EVENT_TYPE_BRAKING;
        }
        if (i == 3) {
            return HarshDrivingEventType.HARSH_DRIVING_EVENT_TYPE_TURN;
        }
        if (i == 4) {
            return HarshDrivingEventType.HARSH_DRIVING_EVENT_TYPE_NO_EVENT;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }

    public static final TransportOccupantRole serializer(OccupantRoleInternal occupantRoleInternal) {
        int i = occupantRoleInternal == null ? -1 : r8lambdaOGOAh5mtMGjkWWFJnaZg117J230.RemoteActionCompatParcelizer[occupantRoleInternal.ordinal()];
        if (i == -1) {
            return TransportOccupantRole.TRANSPORT_OCCUPANT_ROLE_UNAVAILABLE;
        }
        if (i == 1) {
            return TransportOccupantRole.TRANSPORT_OCCUPANT_ROLE_DRIVER;
        }
        if (i == 2) {
            return TransportOccupantRole.TRANSPORT_OCCUPANT_ROLE_PASSENGER;
        }
        if (i == 3) {
            return TransportOccupantRole.TRANSPORT_OCCUPANT_ROLE_UNAVAILABLE;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
