package o;

import android.annotation.SuppressLint;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.sdk.drivinginsights.api.HarshDrivingEvent;
import com.sentiance.sdk.drivinginsights.api.PhoneUsageEvent;
import com.sentiance.sdk.eventtimeline.timelines.creators.HarshDrivingEntryType;
import com.sentiance.sdk.util.DateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeGeofenceManagerExternalSyntheticLambda35 {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);

    public static final class RemoteActionCompatParcelizer {
        public RemoteActionCompatParcelizer(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        public static ArrayList read(List list, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20, boolean z) {
            HarshDrivingEvent.Type type;
            migratefeatureflagstoragetojsonlambda20.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r8lambdaToWEBn4vVR9WqvyA_znNRwHzM r8lambdatowebn4vvr9wqvya_znnrwhzm = (r8lambdaToWEBn4vVR9WqvyA_znNRwHzM) it.next();
                DateTime dateTime = migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdatowebn4vvr9wqvya_znnrwhzm.serializer()));
                HarshDrivingEntryType harshDrivingEntryTypeRatingCompat = z ? r8lambdatowebn4vvr9wqvya_znnrwhzm.RatingCompat() : r8lambdatowebn4vvr9wqvya_znnrwhzm.MediaMetadataCompat();
                if (harshDrivingEntryTypeRatingCompat != null) {
                    BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer.getClass();
                    int i = BrazeGeofenceManagerExternalSyntheticLambda1.read[harshDrivingEntryTypeRatingCompat.ordinal()];
                    if (i == 1) {
                        type = HarshDrivingEvent.Type.ACCELERATION;
                    } else if (i == 2) {
                        type = HarshDrivingEvent.Type.BRAKING;
                    } else if (i != 3) {
                        type = null;
                    } else {
                        type = HarshDrivingEvent.Type.TURN;
                    }
                } else {
                    type = null;
                }
                Integer numRemoteActionCompatParcelizer = z ? r8lambdatowebn4vvr9wqvya_znnrwhzm.RemoteActionCompatParcelizer() : r8lambdatowebn4vvr9wqvya_znnrwhzm.read();
                Double dWrite = r8lambdatowebn4vvr9wqvya_znnrwhzm.write();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer;
                List<handleLogClickdefault> listMediaDescriptionCompat = r8lambdatowebn4vvr9wqvya_znnrwhzm.MediaDescriptionCompat();
                remoteActionCompatParcelizer.getClass();
                HarshDrivingEvent harshDrivingEventSerializer = serializer(dateTime, type, numRemoteActionCompatParcelizer, dWrite, listMediaDescriptionCompat);
                if (harshDrivingEventSerializer != null) {
                    arrayList.add(harshDrivingEventSerializer);
                }
            }
            return arrayList;
        }

        public static ArrayList IconCompatParcelizer(List list, migrateFeatureFlagStorageToJsonlambda20 migratefeatureflagstoragetojsonlambda20) {
            PhoneUsageEvent.CallState callState;
            migratefeatureflagstoragetojsonlambda20.getClass();
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0 r8lambdauqhb7dt0btnjovszzbervrbdwj0 = (r8lambdaUQHb7DT0BtnJovsZzbeRVrBdwJ0) it.next();
                DateTime dateTime = migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdauqhb7dt0btnjovszzbervrbdwj0.serializer()));
                DateTime dateTime2 = migratefeatureflagstoragetojsonlambda20.read(Long.valueOf(r8lambdauqhb7dt0btnjovszzbervrbdwj0.IconCompatParcelizer()));
                ArrayList arrayListWrite = r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.write(r8lambdauqhb7dt0btnjovszzbervrbdwj0.MediaDescriptionCompat());
                BrazeGeofenceManagerExternalSyntheticLambda35.IconCompatParcelizer.getClass();
                boolean zWrite = r8lambdauqhb7dt0btnjovszzbervrbdwj0.write();
                if (zWrite) {
                    callState = PhoneUsageEvent.CallState.CALL_IN_PROGRESS;
                } else {
                    if (zWrite) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                    callState = PhoneUsageEvent.CallState.NO_CALL;
                }
                arrayList.add(new PhoneUsageEvent(dateTime, dateTime2, arrayListWrite, callState));
            }
            return arrayList;
        }

        @SuppressLint
        private static HarshDrivingEvent serializer(DateTime dateTime, HarshDrivingEvent.Type type, Integer num, Double d, List list) {
            StringBuilder sb = new StringBuilder();
            if (type == null) {
                sb.append("Event type is null. ");
            }
            if (num == null) {
                sb.append("Confidence is null. ");
            }
            if (d == null) {
                sb.append("Magnitude is null. ");
            }
            if (sb.toString().length() > 0) {
                ((configureFromServerConfiglambda1) setPushUniqueId.read(configureFromServerConfiglambda1.class)).getClass();
                return null;
            }
            type.getClass();
            num.getClass();
            int iIntValue = num.intValue();
            d.getClass();
            return new HarshDrivingEvent(dateTime, dateTime, type, iIntValue, d.doubleValue(), r8lambdaxHkJqKUHkuBvtHvtOlqgehcIRIA.write(list));
        }

        public static HarshDrivingEvent serializer(setConfiguredCustomEndpointandroid_sdk_base_release setconfiguredcustomendpointandroid_sdk_base_release, DateTime dateTime) {
            HarshDrivingEvent.Type type;
            Byte b = setconfiguredcustomendpointandroid_sdk_base_release.RemoteActionCompatParcelizer;
            if (b != null && b.byteValue() == 1) {
                type = HarshDrivingEvent.Type.ACCELERATION;
            } else if (b == null || b.byteValue() != 2) {
                type = (b == null || b.byteValue() != 3) ? null : HarshDrivingEvent.Type.TURN;
            } else {
                type = HarshDrivingEvent.Type.BRAKING;
            }
            Byte b2 = setconfiguredcustomendpointandroid_sdk_base_release.write;
            return serializer(dateTime, type, b2 != null ? Integer.valueOf(b2.byteValue()) : null, setconfiguredcustomendpointandroid_sdk_base_release.serializer, instance_delegatelambda0.write);
        }
    }
}
