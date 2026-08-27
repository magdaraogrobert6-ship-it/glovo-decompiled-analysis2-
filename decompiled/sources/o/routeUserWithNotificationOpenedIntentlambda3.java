package o;

import android.util.SparseArray;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.core.model.thrift.TimeSeriesType;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.sensorstream.SensorType;
import com.sentiance.sdk.util.Optional;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class routeUserWithNotificationOpenedIntentlambda3 {
    private static final SparseArray<TimeSeriesType> read;
    private final routeUserWithNotificationOpenedIntentlambda0 IconCompatParcelizer;
    private final ConfigurationManager MediaBrowserCompatMediaItem;
    private final routeUserWithNotificationOpenedIntentlambda1 MediaDescriptionCompat;
    private long MediaMetadataCompat;
    private final routeUserWithNotificationOpenedIntentlambda4 MediaSessionCompatQueueItem;
    private EnumMap MediaSessionCompatResultReceiverWrapper;
    private EnumMap MediaSessionCompatToken;
    private List<Byte> ParcelableVolumeInfo;
    private Map<TimeSeriesType, List<List<Short>>> PlaybackStateCompat;
    private EnumMap PlaybackStateCompatCustomAction;
    private long RatingCompat;
    private final getCooldownEnterSeconds RemoteActionCompatParcelizer;
    private final parseLonglambda0 serializer;
    private final component4android_sdk_base_release write;

    static {
        SparseArray<TimeSeriesType> sparseArray = new SparseArray<>();
        read = sparseArray;
        sparseArray.put(1, TimeSeriesType.ACCELEROMETER_ANDROID_G);
        sparseArray.put(2, TimeSeriesType.GYROSCOPE);
        sparseArray.put(3, TimeSeriesType.MAGNETOMETER);
        sparseArray.put(4, TimeSeriesType.QUATERNION);
    }

    public routeUserWithNotificationOpenedIntentlambda3(parseLonglambda0 parselonglambda0, getCooldownEnterSeconds getcooldownenterseconds, component4android_sdk_base_release component4android_sdk_base_releaseVar, ConfigurationManager configurationManager, routeUserWithNotificationOpenedIntentlambda0 routeuserwithnotificationopenedintentlambda0, routeUserWithNotificationOpenedIntentlambda4 routeuserwithnotificationopenedintentlambda4, routeUserWithNotificationOpenedIntentlambda1 routeuserwithnotificationopenedintentlambda1) {
        this.serializer = parselonglambda0;
        this.RemoteActionCompatParcelizer = getcooldownenterseconds;
        this.write = component4android_sdk_base_releaseVar;
        this.IconCompatParcelizer = routeuserwithnotificationopenedintentlambda0;
        this.MediaBrowserCompatMediaItem = configurationManager;
        this.MediaSessionCompatQueueItem = routeuserwithnotificationopenedintentlambda4;
        this.MediaDescriptionCompat = routeuserwithnotificationopenedintentlambda1;
    }

    public final List<createNotification> RemoteActionCompatParcelizer(long j, long j2) {
        component4android_sdk_base_release component4android_sdk_base_releaseVar;
        routeUserWithNotificationOpenedIntentlambda1 routeuserwithnotificationopenedintentlambda1;
        parseLonglambda0 parselonglambda0;
        List<Short> list;
        component4android_sdk_base_release component4android_sdk_base_releaseVar2;
        boolean z;
        routeUserWithNotificationOpenedIntentlambda2 routeuserwithnotificationopenedintentlambda2;
        Long l;
        BrazeUser brazeUser;
        this.RatingCompat = j;
        this.MediaMetadataCompat = j2;
        this.ParcelableVolumeInfo = SensorType.toEventTypeConstants(this.IconCompatParcelizer.RemoteActionCompatParcelizer());
        TimeSeriesType timeSeriesType = TimeSeriesType.ACCELEROMETER_ANDROID_G;
        ArrayList arrayList = new ArrayList(IconCompatParcelizer(3));
        TimeSeriesType timeSeriesType2 = TimeSeriesType.GYROSCOPE;
        ArrayList arrayList2 = new ArrayList(IconCompatParcelizer(3));
        TimeSeriesType timeSeriesType3 = TimeSeriesType.MAGNETOMETER;
        ArrayList arrayList3 = new ArrayList(IconCompatParcelizer(3));
        TimeSeriesType timeSeriesType4 = TimeSeriesType.QUATERNION;
        ArrayList arrayList4 = new ArrayList(IconCompatParcelizer(4));
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(timeSeriesType, arrayList);
        AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(timeSeriesType2, arrayList2);
        AbstractMap.SimpleEntry simpleEntry3 = new AbstractMap.SimpleEntry(timeSeriesType3, arrayList3);
        AbstractMap.SimpleEntry simpleEntry4 = new AbstractMap.SimpleEntry(timeSeriesType4, arrayList4);
        int i = 0;
        boolean z2 = true;
        Map.Entry[] entryArr = {simpleEntry, simpleEntry2, simpleEntry3, simpleEntry4};
        HashMap map = new HashMap(4);
        for (int i2 = 0; i2 < 4; i2++) {
            Map.Entry entry = entryArr[i2];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(key, "duplicate key: "));
                return null;
            }
        }
        this.PlaybackStateCompat = Collections.unmodifiableMap(map);
        EnumMap enumMap = new EnumMap(TimeSeriesType.class);
        enumMap.put(TimeSeriesType.ACCELEROMETER_ANDROID_G, new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM());
        enumMap.put(TimeSeriesType.GYROSCOPE, new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM());
        enumMap.put(TimeSeriesType.MAGNETOMETER, new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM());
        enumMap.put(TimeSeriesType.QUATERNION, new r8lambdaIdQ_HVSqZroWyGs_o3rdcEiJNLM());
        this.PlaybackStateCompatCustomAction = enumMap;
        this.MediaSessionCompatResultReceiverWrapper = new EnumMap(TimeSeriesType.class);
        this.MediaSessionCompatToken = new EnumMap(TimeSeriesType.class);
        routeUserWithNotificationOpenedIntentlambda2 routeuserwithnotificationopenedintentlambda3 = new routeUserWithNotificationOpenedIntentlambda2(j, j2);
        long jWrite = this.MediaSessionCompatQueueItem.write(this.RatingCompat, this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem.getClass();
        SparseArray sparseArray = new SparseArray();
        long j3 = this.RatingCompat;
        getCooldownEnterSeconds getcooldownenterseconds = this.RemoteActionCompatParcelizer;
        getCooldownEnterSeconds.read readVarRemoteActionCompatParcelizer = getcooldownenterseconds.IconCompatParcelizer(BrazeUser.class, Long.valueOf(j3 + 1)).RemoteActionCompatParcelizer();
        while (true) {
            component4android_sdk_base_releaseVar = this.write;
            if (readVarRemoteActionCompatParcelizer == null || readVarRemoteActionCompatParcelizer.serializer() < jWrite - DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM || sparseArray.size() == this.ParcelableVolumeInfo.size()) {
                break;
            }
            routeUserWithNotificationOpenedIntentlambda2 routeuserwithnotificationopenedintentlambda4 = routeuserwithnotificationopenedintentlambda3;
            if (readVarRemoteActionCompatParcelizer.serializer() < this.RatingCompat) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = readVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
                Byte b = (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer == null || (brazeUser = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.addMenuProvider) == null) ? null : brazeUser.write;
                if (b != null && sparseArray.get(b.byteValue()) == null) {
                    sparseArray.put(b.byteValue(), Long.valueOf(readVarRemoteActionCompatParcelizer.serializer()));
                }
            }
            readVarRemoteActionCompatParcelizer = (getCooldownEnterSeconds.read) ((Optional) getcooldownenterseconds.serializer(Optional.MediaSessionCompatQueueItem(), new getRadiusMeters(getcooldownenterseconds, readVarRemoteActionCompatParcelizer.IconCompatParcelizer(), 2))).RemoteActionCompatParcelizer();
            routeuserwithnotificationopenedintentlambda3 = routeuserwithnotificationopenedintentlambda4;
        }
        routeUserWithNotificationOpenedIntentlambda2 routeuserwithnotificationopenedintentlambda5 = routeuserwithnotificationopenedintentlambda3;
        Long lValueOf = null;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            Long l2 = (Long) sparseArray.valueAt(i3);
            long jLongValue = l2.longValue();
            if (lValueOf == null || jLongValue < lValueOf.longValue()) {
                lValueOf = l2;
            }
        }
        long j4 = this.RatingCompat;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(j4);
        }
        getCooldownEnterSeconds.read readVar = (getCooldownEnterSeconds.read) ((Optional) getcooldownenterseconds.serializer(Optional.MediaSessionCompatQueueItem(), new getRadiusMeters(getcooldownenterseconds, lValueOf.longValue() - 1, 1))).RemoteActionCompatParcelizer();
        while (true) {
            routeuserwithnotificationopenedintentlambda1 = this.MediaDescriptionCompat;
            parselonglambda0 = this.serializer;
            if (readVar == null || routeuserwithnotificationopenedintentlambda1.write()) {
                break;
            }
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 = readVar.RemoteActionCompatParcelizer(component4android_sdk_base_releaseVar);
            BrazeUser brazeUser2 = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2 != null ? r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer2.serializer.addMenuProvider : null;
            if (brazeUser2 != null) {
                Long l3 = brazeUser2.RemoteActionCompatParcelizer;
                List list2 = brazeUser2.serializer;
                Byte b2 = brazeUser2.write;
                routeuserwithnotificationopenedintentlambda2 = routeuserwithnotificationopenedintentlambda5;
                sendPushActionIntentdefault sendpushactionintentdefaultIconCompatParcelizer = routeUserWithNotificationOpenedIntentlambda2.IconCompatParcelizer(routeuserwithnotificationopenedintentlambda2, readVar.serializer(), brazeUser2);
                if (sendpushactionintentdefaultIconCompatParcelizer.write()) {
                    break;
                }
                if (sendpushactionintentdefaultIconCompatParcelizer.RemoteActionCompatParcelizer()) {
                    byte bByteValue = b2.byteValue();
                    SparseArray<TimeSeriesType> sparseArray2 = read;
                    TimeSeriesType timeSeriesType5 = sparseArray2.get(bByteValue);
                    if (this.MediaSessionCompatResultReceiverWrapper.get(timeSeriesType5) == null) {
                        if (list2.size() > sendPushActionIntentdefault.read(sendpushactionintentdefaultIconCompatParcelizer)) {
                            this.MediaSessionCompatResultReceiverWrapper.put(timeSeriesType5, Long.valueOf(l3.longValue() + ((long) ((Integer) list2.get(sendPushActionIntentdefault.read(sendpushactionintentdefaultIconCompatParcelizer))).intValue())));
                        } else {
                            parselonglambda0.RemoteActionCompatParcelizer("Window start index is %d, but the sensor data size is %d", Integer.valueOf(sendPushActionIntentdefault.read(sendpushactionintentdefaultIconCompatParcelizer)), Integer.valueOf(list2.size()));
                        }
                    }
                    TimeSeriesType timeSeriesType6 = sparseArray2.get(b2.byteValue());
                    Long l4 = (Long) this.MediaSessionCompatResultReceiverWrapper.get(timeSeriesType6);
                    if (l4 == null) {
                        parselonglambda0.RemoteActionCompatParcelizer("Cannot populate offsets when no base timestamp is set for the time series", new Object[0]);
                    } else {
                        List list3 = (List) this.PlaybackStateCompatCustomAction.get(timeSeriesType6);
                        if (list3 == null) {
                            parselonglambda0.RemoteActionCompatParcelizer("Time series type %s has no offset list", timeSeriesType6.name());
                        } else {
                            int i4 = sendPushActionIntentdefault.read(sendpushactionintentdefaultIconCompatParcelizer);
                            while (i4 < list2.size() && i4 <= sendPushActionIntentdefault.write(sendpushactionintentdefaultIconCompatParcelizer)) {
                                list3.add(Integer.valueOf((int) ((l3.longValue() + ((long) ((Integer) list2.get(i4)).intValue())) - l4.longValue())));
                                i4++;
                                component4android_sdk_base_releaseVar = component4android_sdk_base_releaseVar;
                                list2 = list2;
                            }
                        }
                    }
                    component4android_sdk_base_releaseVar2 = component4android_sdk_base_releaseVar;
                    List list4 = brazeUser2.IconCompatParcelizer;
                    TimeSeriesType timeSeriesType7 = sparseArray2.get(b2.byteValue());
                    boolean z3 = timeSeriesType7 == TimeSeriesType.ACCELEROMETER_ANDROID_G;
                    List<List<Short>> list5 = this.PlaybackStateCompat.get(timeSeriesType7);
                    if (list5 == null) {
                        parselonglambda0.RemoteActionCompatParcelizer("Time series %s has no axes list", timeSeriesType7.name());
                    } else {
                        int i5 = 0;
                        while (i5 < list4.size()) {
                            List list6 = (List) list4.get(i5);
                            List<Short> list7 = i5 < list5.size() ? list5.get(i5) : null;
                            if (list6 != null && list7 != null) {
                                List list8 = list4;
                                List<List<Short>> list9 = list5;
                                int i6 = sendPushActionIntentdefault.read(sendpushactionintentdefaultIconCompatParcelizer);
                                while (i6 <= sendPushActionIntentdefault.write(sendpushactionintentdefaultIconCompatParcelizer) && i6 < list6.size()) {
                                    float fIntValue = ((Integer) list6.get(i6)).intValue();
                                    if (z3) {
                                        fIntValue = r8lambdaVfnkIDPhLBd69Q1jeqVaNvOpz6k.RemoteActionCompatParcelizer(fIntValue);
                                    }
                                    boolean z4 = z3;
                                    int i7 = z3 ? 32000 : 20000;
                                    list7.add(Short.valueOf((short) Math.min(Math.max(fIntValue, -i7), i7)));
                                    i6++;
                                    z3 = z4;
                                    sendpushactionintentdefaultIconCompatParcelizer = sendpushactionintentdefaultIconCompatParcelizer;
                                }
                                i5++;
                                list5 = list9;
                                z3 = z3;
                                sendpushactionintentdefaultIconCompatParcelizer = sendpushactionintentdefaultIconCompatParcelizer;
                                list4 = list8;
                            } else {
                                parselonglambda0.RemoteActionCompatParcelizer("Cannot continue with missing axis list (event: %s, ts: %s)", Boolean.valueOf(list6 == null), Boolean.valueOf(list7 == null));
                                break;
                            }
                        }
                    }
                    z = true;
                    Map map2 = brazeUser2.MediaBrowserCompatMediaItem;
                    TimeSeriesType timeSeriesType8 = sparseArray2.get(b2.byteValue());
                    if (this.MediaSessionCompatToken.get(timeSeriesType8) == null && (l = (Long) this.MediaSessionCompatResultReceiverWrapper.get(timeSeriesType8)) != null) {
                        HashMap map3 = new HashMap();
                        this.MediaSessionCompatToken.put(timeSeriesType8, map3);
                        Long l5 = (Long) map2.get((byte) 1);
                        Long l6 = (Long) map2.get((byte) 2);
                        Long l7 = (Long) map2.get((byte) 3);
                        if (l5 != null && l6 != null && l7 != null) {
                            long jLongValue2 = l.longValue() - l3.longValue();
                            map3.put((byte) 1, Long.valueOf(l5.longValue() + jLongValue2));
                            map3.put((byte) 2, Long.valueOf(l6.longValue() + jLongValue2));
                            map3.put((byte) 3, Long.valueOf(l7.longValue() + jLongValue2));
                        }
                    }
                } else {
                    component4android_sdk_base_releaseVar2 = component4android_sdk_base_releaseVar;
                    z = z2;
                }
            } else {
                component4android_sdk_base_releaseVar2 = component4android_sdk_base_releaseVar;
                z = z2;
                routeuserwithnotificationopenedintentlambda2 = routeuserwithnotificationopenedintentlambda5;
                parselonglambda0.IconCompatParcelizer("Unable to deserialise - null SensorEvent", new Object[i]);
            }
            readVar = (getCooldownEnterSeconds.read) ((Optional) getcooldownenterseconds.serializer(Optional.MediaSessionCompatQueueItem(), new getRadiusMeters(getcooldownenterseconds, readVar.IconCompatParcelizer(), 3))).RemoteActionCompatParcelizer();
            component4android_sdk_base_releaseVar = component4android_sdk_base_releaseVar2;
            z2 = z;
            routeuserwithnotificationopenedintentlambda5 = routeuserwithnotificationopenedintentlambda2;
            i = 0;
        }
        if (routeuserwithnotificationopenedintentlambda1.write()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<createNotification> arrayList5 = new ArrayList();
        for (TimeSeriesType timeSeriesType9 : this.PlaybackStateCompat.keySet()) {
            List<List<Short>> list10 = this.PlaybackStateCompat.get(timeSeriesType9);
            if (list10 != null && !list10.isEmpty() && (list = list10.get(0)) != null && !list.isEmpty()) {
                O$b o$b = new O$b();
                if (timeSeriesType9 != null) {
                    o$b.RemoteActionCompatParcelizer = timeSeriesType9;
                    long j5 = (Long) this.MediaSessionCompatResultReceiverWrapper.get(timeSeriesType9);
                    if (j5 == null) {
                        j5 = 0L;
                    }
                    o$b.write = j5;
                    List<List<Short>> list11 = this.PlaybackStateCompat.get(timeSeriesType9);
                    List<List<Short>> list12 = Collections.EMPTY_LIST;
                    if (list11 == null) {
                        list11 = list12;
                    }
                    o$b.read = list11;
                    List<List<Short>> list13 = (List) this.PlaybackStateCompatCustomAction.get(timeSeriesType9);
                    if (list13 != null) {
                        list12 = list13;
                    }
                    o$b.serializer = list12;
                    Map map4 = (Map) this.MediaSessionCompatToken.get(timeSeriesType9);
                    Map map5 = Collections.EMPTY_MAP;
                    if (map4 == null) {
                        map4 = map5;
                    }
                    o$b.IconCompatParcelizer = map4;
                    arrayList5.add(o$b.RatingCompat());
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'type' cannot be null");
                    return null;
                }
            }
        }
        parselonglambda0.IconCompatParcelizer("Found %d time series", Integer.valueOf(arrayList5.size()));
        for (createNotification createnotification : arrayList5) {
            parselonglambda0.IconCompatParcelizer("Found %d values for time series %s", Integer.valueOf(createnotification.IconCompatParcelizer.isEmpty() ? 0 : ((List) createnotification.IconCompatParcelizer.get(0)).size()), createnotification.read);
        }
        return arrayList5;
    }

    private static ArrayList IconCompatParcelizer(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new migrateMetadataToJsonlambda30());
        }
        return arrayList;
    }
}
