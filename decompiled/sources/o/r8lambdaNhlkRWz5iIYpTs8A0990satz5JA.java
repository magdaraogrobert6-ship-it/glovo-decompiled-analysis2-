package o;

import android.location.Location;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.O$b;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueSignificance;
import com.sentiance.sdk.eventtimeline.timelines.stores.entries.VenueType;
import com.sentiance.sdk.processguard.Guard$Type;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.FormBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@InjectUsing(cacheName = "VenueMapper", componentName = "VenueMapper", guardType = Guard$Type.REFERENCE_COUNTED)
public class r8lambdaNhlkRWz5iIYpTs8A0990satz5JA implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    public static final List<VenueSignificance> read = Arrays.asList(VenueSignificance.UNSET, VenueSignificance.POI_PROVISIONAL, VenueSignificance.UNKNOWN_PROVISIONAL, VenueSignificance.HOME_PROVISIONAL, VenueSignificance.WORK_PROVISIONAL);
    private final getAnalyticsEnabledEnterannotations IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaBrowserCompatMediaItem;
    private final setHeaderTextColor MediaDescriptionCompat;
    private final readandroid_sdk_base_release MediaMetadataCompat;
    private final handlePushNotificationPayloadlambda8 MediaSessionCompatQueueItem;
    private final ConfigurationManager MediaSessionCompatToken;
    private final com.sentiance.sdk.venuemapper.w ParcelableVolumeInfo;
    private final r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ PlaybackStateCompat;
    private final r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4 RatingCompat;
    private final r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 RemoteActionCompatParcelizer;
    private deleteDataStoreFile ResultReceiver;
    private final parseLonglambda0 serializer;
    private final com.sentiance.sdk.util.c write;
    private final LinkedHashSet<deleteDataStoreFile> MediaSessionCompatResultReceiverWrapper = new LinkedHashSet<>();
    private final migrateTriggersReeligibilityToJsonlambda1<HashSet<deleteDataStoreFilelambda0>> PlaybackStateCompatCustomAction = new r8lambdaNwFwtm519jR2TaiEzHatp5EckwY(this);

    /* JADX WARN: Code duplicated, block: B:68:0x013e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void RemoteActionCompatParcelizer(r8lambdaNhlkRWz5iIYpTs8A0990satz5JA r8lambdanhlkrwz5iiypts8a0990satz5ja) {
        deleteDataStoreFile next;
        synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
            deleteDataStoreFilelambda0 deletedatastorefilelambda0 = null;
            if (r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaSessionCompatResultReceiverWrapper.isEmpty()) {
                next = null;
            } else {
                next = r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaSessionCompatResultReceiverWrapper.iterator().next();
                r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaSessionCompatResultReceiverWrapper.remove(next);
            }
            if (next == null) {
                r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.IconCompatParcelizer("No stationaries to venue map", new Object[0]);
                r8lambdanhlkrwz5iiypts8a0990satz5ja.ResultReceiver = null;
                r8lambdanhlkrwz5iiypts8a0990satz5ja.RemoteActionCompatParcelizer.IconCompatParcelizer();
                return;
            }
            _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = next.read();
            r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.IconCompatParcelizer("Venue mapping stationary %s", _set_durationinmilliseconds_lambda0.toString());
            boolean zMediaSessionCompatResultReceiverWrapper = next.MediaSessionCompatResultReceiverWrapper();
            boolean zRatingCompat = next.RatingCompat();
            boolean zMediaBrowserCompatMediaItem = next.MediaBrowserCompatMediaItem();
            if (next.ParcelableVolumeInfo()) {
                r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.IconCompatParcelizer("Stationary ID %s is non-provisionally venue mapped", _set_durationinmilliseconds_lambda0.serializer());
                r8lambdanhlkrwz5iiypts8a0990satz5ja.IconCompatParcelizer();
            } else if (next.PlaybackStateCompatCustomAction() && next.MediaSessionCompatQueueItem()) {
                VenueSignificance venueSignificanceRatingCompat = _set_durationinmilliseconds_lambda0.RatingCompat();
                VenueSignificance confirmedType = venueSignificanceRatingCompat.toConfirmedType();
                r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.IconCompatParcelizer("Stationary ID %s followed by long OTG, switch venue significance: %s -> %s", _set_durationinmilliseconds_lambda0.serializer(), venueSignificanceRatingCompat.name(), confirmedType);
                if (venueSignificanceRatingCompat != confirmedType) {
                    r8lambdanhlkrwz5iiypts8a0990satz5ja.RemoteActionCompatParcelizer(_set_durationinmilliseconds_lambda0.serializer(), confirmedType, null, _set_durationinmilliseconds_lambda0.MediaBrowserCompatMediaItem());
                }
                r8lambdanhlkrwz5iiypts8a0990satz5ja.IconCompatParcelizer();
            } else if (next.PlaybackStateCompatCustomAction() && next.MediaDescriptionCompat()) {
                r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.RemoteActionCompatParcelizer("Stationary ID %s, skipping venue mapping because next transport is an ongoing (still short) OTG", _set_durationinmilliseconds_lambda0.serializer());
                r8lambdanhlkrwz5iiypts8a0990satz5ja.IconCompatParcelizer();
            } else if (zMediaSessionCompatResultReceiverWrapper || zRatingCompat || zMediaBrowserCompatMediaItem) {
                String strSerializer = next.read().serializer();
                synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
                    Iterator<deleteDataStoreFilelambda0> it = r8lambdanhlkrwz5iiypts8a0990satz5ja.PlaybackStateCompatCustomAction.read().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        deleteDataStoreFilelambda0 next2 = it.next();
                        if (next2.IconCompatParcelizer.equals(strSerializer)) {
                            deletedatastorefilelambda0 = next2;
                            break;
                        }
                    }
                }
                if (deletedatastorefilelambda0 != null) {
                    long j = deletedatastorefilelambda0.read();
                    r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaBrowserCompatMediaItem.getClass();
                    if (System.currentTimeMillis() - j < 1800000) {
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.IconCompatParcelizer();
                    } else {
                        synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
                            r8lambdanhlkrwz5iiypts8a0990satz5ja.PlaybackStateCompatCustomAction.read().remove(deletedatastorefilelambda0);
                            r8lambdanhlkrwz5iiypts8a0990satz5ja.RemoteActionCompatParcelizer();
                        }
                        synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
                            r8lambdanhlkrwz5iiypts8a0990satz5ja.ResultReceiver = next;
                        }
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.RemoteActionCompatParcelizer.read();
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.RatingCompat.write().read(next.RemoteActionCompatParcelizer(), new r8lambdaVJB9V53xyThsAt9bf4NibwuYo6I(r8lambdanhlkrwz5iiypts8a0990satz5ja));
                    }
                } else {
                    synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.ResultReceiver = next;
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.RemoteActionCompatParcelizer.read();
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.RatingCompat.write().read(next.RemoteActionCompatParcelizer(), new r8lambdaVJB9V53xyThsAt9bf4NibwuYo6I(r8lambdanhlkrwz5iiypts8a0990satz5ja));
                    }
                }
            } else {
                r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.IconCompatParcelizer("Stationary ID %s, skipping venue mapping due to unsatisfactory conditions", _set_durationinmilliseconds_lambda0.serializer());
                r8lambdanhlkrwz5iiypts8a0990satz5ja.IconCompatParcelizer();
            }
            r8lambdanhlkrwz5iiypts8a0990satz5ja.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:175:0x02d0  */
    public static void write(r8lambdaNhlkRWz5iIYpTs8A0990satz5JA r8lambdanhlkrwz5iiypts8a0990satz5ja) {
        Map<VenueType, Float> map;
        decodeSampledBitmapFromStream decodesampledbitmapfromstream;
        VenueSignificance venueSignificance;
        VenueType venueType;
        synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
            deleteDataStoreFile deletedatastorefile = r8lambdanhlkrwz5iiypts8a0990satz5ja.ResultReceiver;
            if (deletedatastorefile == null) {
                r8lambdanhlkrwz5iiypts8a0990satz5ja.IconCompatParcelizer();
                return;
            }
            Location locationRemoteActionCompatParcelizer = deletedatastorefile.RemoteActionCompatParcelizer();
            r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.IconCompatParcelizer("Processing stationary %s, location: (%f, %f), start time: %s, stop time: %s, duration hours: %d", deletedatastorefile.MediaSessionCompatResultReceiverWrapper() ? "enter" : "exit", Double.valueOf(locationRemoteActionCompatParcelizer.getLatitude()), Double.valueOf(locationRemoteActionCompatParcelizer.getLongitude()), com.sentiance.sdk.util.x.c(deletedatastorefile.MediaMetadataCompat().PlaybackStateCompatCustomAction()), deletedatastorefile.IconCompatParcelizer() == 0 ? "0" : com.sentiance.sdk.util.x.c(deletedatastorefile.IconCompatParcelizer()), Long.valueOf(deletedatastorefile.serializer()));
            synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
                map = null;
                if (r8lambdanhlkrwz5iiypts8a0990satz5ja.ParcelableVolumeInfo.read()) {
                    decodesampledbitmapfromstream = r8lambdanhlkrwz5iiypts8a0990satz5ja.ParcelableVolumeInfo.read(deletedatastorefile.RemoteActionCompatParcelizer(), deletedatastorefile.MediaSessionCompatResultReceiverWrapper(), deletedatastorefile.write(), deletedatastorefile.IconCompatParcelizer());
                    r8lambdanhlkrwz5iiypts8a0990satz5ja.ParcelableVolumeInfo.write();
                } else {
                    decodesampledbitmapfromstream = null;
                }
            }
            r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer.IconCompatParcelizer("Result: %s", decodesampledbitmapfromstream == null ? null : decodesampledbitmapfromstream.toString());
            if (decodesampledbitmapfromstream != null) {
                r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaSessionCompatQueueItem.serializer(decodesampledbitmapfromstream.f);
                _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = deletedatastorefile.read();
                parseLonglambda0 parselonglambda0 = r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer;
                com.sentiance.visitessentials.VenueType venueType2 = decodesampledbitmapfromstream.g;
                boolean z = decodesampledbitmapfromstream.b;
                boolean z2 = decodesampledbitmapfromstream.a;
                VenueType venueType3 = read(venueType2);
                if (_set_durationinmilliseconds_lambda0.RatingCompat() == VenueSignificance.UNSET) {
                    if (z2) {
                        venueSignificance = VenueSignificance.HOME_PROVISIONAL;
                    } else if (z) {
                        venueSignificance = VenueSignificance.WORK_PROVISIONAL;
                    } else {
                        venueSignificance = venueType3 == VenueType.UNKNOWN ? VenueSignificance.UNKNOWN_PROVISIONAL : VenueSignificance.POI_PROVISIONAL;
                    }
                } else if (!_set_durationinmilliseconds_lambda0.RatingCompat().isOfTypeProvisional()) {
                    parselonglambda0.RemoteActionCompatParcelizer("Attempting to venue map a stationary whose venue significance is neither UNSET nor pending: %s", _set_durationinmilliseconds_lambda0.RatingCompat());
                    venueSignificance = VenueSignificance.UNKNOWN;
                } else if (z2) {
                    venueSignificance = VenueSignificance.HOME;
                } else if (z) {
                    venueSignificance = VenueSignificance.WORK;
                } else {
                    venueSignificance = venueType3 == VenueType.UNKNOWN ? VenueSignificance.UNKNOWN : VenueSignificance.POI;
                }
                VenueType venueType4 = VenueType.UNKNOWN;
                if (!Arrays.asList(VenueSignificance.HOME, VenueSignificance.HOME_PROVISIONAL, VenueSignificance.WORK_PROVISIONAL, VenueSignificance.WORK).contains(venueSignificance)) {
                    venueType4 = read(decodesampledbitmapfromstream.g);
                    List list = decodesampledbitmapfromstream.d;
                    if (list == null) {
                        map = Collections.EMPTY_MAP;
                    } else {
                        Set<Map.Entry> setEntrySet = r8lambdaqWHh_D9OmwtkJ21CJOYxsvMqaVc.serializer.write().entrySet();
                        HashMap map2 = new HashMap();
                        for (Map.Entry entry : setEntrySet) {
                            String str = (String) entry.getKey();
                            str.getClass();
                            switch (str) {
                                case "shop_long":
                                    venueType = VenueType.SHOP_LONG;
                                    break;
                                case "leisure_park":
                                    venueType = VenueType.LEISURE_PARK;
                                    break;
                                case "resto_mid":
                                    venueType = VenueType.RESTO_MID;
                                    break;
                                case "leisure_day":
                                    venueType = VenueType.LEISURE_DAY;
                                    break;
                                case "drink_day":
                                    venueType = VenueType.DRINK_DAY;
                                    break;
                                case "travel_hotel":
                                    venueType = VenueType.TRAVEL_HOTEL;
                                    break;
                                case "travel_short":
                                    venueType = VenueType.TRAVEL_SHORT;
                                    break;
                                case "health":
                                    venueType = VenueType.HEALTH;
                                    break;
                                case "office":
                                    venueType = VenueType.OFFICE;
                                    break;
                                case "shop_short":
                                    venueType = VenueType.SHOP_SHORT;
                                    break;
                                case "drink_evening":
                                    venueType = VenueType.DRINK_EVENING;
                                    break;
                                case "leisure_evening":
                                    venueType = VenueType.LEISURE_EVENING;
                                    break;
                                case "religion":
                                    venueType = VenueType.RELIGION;
                                    break;
                                case "sport_attend":
                                    venueType = VenueType.SPORT_ATTEND;
                                    break;
                                case "travel_fill":
                                    venueType = VenueType.TRAVEL_FILL;
                                    break;
                                case "travel_long":
                                    venueType = VenueType.TRAVEL_LONG;
                                    break;
                                case "travel_conference":
                                    venueType = VenueType.TRAVEL_CONFERENCE;
                                    break;
                                case "unknown":
                                    venueType = VenueType.UNKNOWN;
                                    break;
                                case "resto_short":
                                    venueType = VenueType.RESTO_SHORT;
                                    break;
                                case "leisure_beach":
                                    venueType = VenueType.LEISURE_BEACH;
                                    break;
                                case "sport":
                                    venueType = VenueType.SPORT;
                                    break;
                                case "education_independent":
                                    venueType = VenueType.EDUCATION_INDEPENDENT;
                                    break;
                                case "travel_bus":
                                    venueType = VenueType.TRAVEL_BUS;
                                    break;
                                case "residential":
                                    venueType = VenueType.RESIDENTIAL;
                                    break;
                                case "education_parents":
                                    venueType = VenueType.EDUCATION_PARENTS;
                                    break;
                                case "industrial":
                                    venueType = VenueType.INDUSTRIAL;
                                    break;
                                case "leisure_museum":
                                    venueType = VenueType.LEISURE_MUSEUM;
                                    break;
                                case "leisure_nature":
                                    venueType = VenueType.LEISURE_NATURE;
                                    break;
                                default:
                                    venueType = VenueType.UNKNOWN;
                                    break;
                            }
                            int iIntValue = ((Integer) entry.getValue()).intValue();
                            if (iIntValue < list.size()) {
                                map2.put(venueType, (Float) list.get(iIntValue));
                            }
                        }
                        map = map2;
                    }
                }
                r8lambdanhlkrwz5iiypts8a0990satz5ja.RemoteActionCompatParcelizer(_set_durationinmilliseconds_lambda0.serializer(), venueSignificance, map, venueType4);
                parselonglambda0.IconCompatParcelizer("Done venue mapping stationary ID: %s, switch venue significance: %s -> %s with venue type: %s", _set_durationinmilliseconds_lambda0.serializer(), _set_durationinmilliseconds_lambda0.RatingCompat().name(), venueSignificance.name(), venueType4);
                if (venueSignificance.isOfTypeProvisional()) {
                    deletedatastorefile.read().serializer(venueSignificance);
                    synchronized (r8lambdanhlkrwz5iiypts8a0990satz5ja) {
                        ArrayList arrayList = new ArrayList(r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaSessionCompatResultReceiverWrapper);
                        arrayList.add(0, deletedatastorefile);
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaSessionCompatResultReceiverWrapper.clear();
                        r8lambdanhlkrwz5iiypts8a0990satz5ja.MediaSessionCompatResultReceiverWrapper.addAll(arrayList);
                    }
                }
            }
            r8lambdanhlkrwz5iiypts8a0990satz5ja.IconCompatParcelizer();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return Collections.EMPTY_MAP;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        synchronized (this) {
            this.ParcelableVolumeInfo.write();
            this.ResultReceiver = null;
            this.MediaSessionCompatResultReceiverWrapper.clear();
            this.PlaybackStateCompatCustomAction.write();
            RemoteActionCompatParcelizer();
        }
    }

    private void RemoteActionCompatParcelizer() {
        JSONObject jSONObjectIconCompatParcelizer;
        HashSet<deleteDataStoreFilelambda0> hashSet = this.PlaybackStateCompatCustomAction.read();
        JSONArray jSONArray = new JSONArray();
        for (deleteDataStoreFilelambda0 deletedatastorefilelambda0 : hashSet) {
            try {
                jSONObjectIconCompatParcelizer = deletedatastorefilelambda0.IconCompatParcelizer();
            } catch (JSONException e) {
                this.serializer.IconCompatParcelizer(false, e, "Failed to serialize ThrottledStationary object: " + deletedatastorefilelambda0, new Object[0]);
                jSONObjectIconCompatParcelizer = null;
            }
            if (jSONObjectIconCompatParcelizer != null) {
                jSONArray.put(jSONObjectIconCompatParcelizer);
            }
        }
        this.write.RemoteActionCompatParcelizer("KEY_THROTTLED_STATIONARIES", jSONArray.toString());
    }

    private void RemoteActionCompatParcelizer(String str, VenueSignificance venueSignificance, Map<VenueType, Float> map, VenueType venueType) {
        byte b;
        this.MediaBrowserCompatMediaItem.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.PlaybackStateCompat.getClass();
        if (venueSignificance == VenueSignificance.UNSET) {
            b = 1;
        } else if (venueSignificance == VenueSignificance.UNKNOWN_PROVISIONAL) {
            b = 2;
        } else if (venueSignificance == VenueSignificance.POI_PROVISIONAL) {
            b = 3;
        } else if (venueSignificance == VenueSignificance.HOME_PROVISIONAL) {
            b = 4;
        } else if (venueSignificance == VenueSignificance.WORK_PROVISIONAL) {
            b = 5;
        } else if (venueSignificance == VenueSignificance.UNKNOWN) {
            b = 6;
        } else if (venueSignificance == VenueSignificance.POI) {
            b = 7;
        } else if (venueSignificance == VenueSignificance.HOME) {
            b = 8;
        } else {
            if (venueSignificance != VenueSignificance.WORK) {
                throw new SdkException("Undefined venue significance " + venueSignificance);
            }
            b = 9;
        }
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<VenueType, Float> entry : map.entrySet()) {
                FormBody.Builder builder = new FormBody.Builder();
                builder.serializer = Short.valueOf(entry.getKey().toThriftConstant());
                builder.RemoteActionCompatParcelizer = Double.valueOf(entry.getValue().doubleValue());
                arrayList.add(builder.RemoteActionCompatParcelizer());
            }
        }
        Short shValueOf = venueType != null ? Short.valueOf(venueType.toThriftConstant()) : null;
        O$b o$b = new O$b();
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'stationary_unique_id' cannot be null");
            return;
        }
        o$b.read = str;
        o$b.write = Byte.valueOf(b);
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'venues' cannot be null");
            return;
        }
        o$b.RemoteActionCompatParcelizer = list;
        o$b.IconCompatParcelizer = arrayList;
        o$b.serializer = shValueOf;
        r8lambdaGN7c5ha_LrYxg0qpuqGwSIc0Hc r8lambdagn7c5ha_lryxg0qpuqgwsic0hcSerializer = o$b.serializer();
        r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0 r8lambdaromdixahini0blcevvl7ehebhj0 = new r8lambdaRoMdixaHini0BLcEvvl7EHeBHj0();
        r8lambdaromdixahini0blcevvl7ehebhj0.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdagn7c5ha_lryxg0qpuqgwsic0hcSerializer;
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer = r8lambdaromdixahini0blcevvl7ehebhj0.IconCompatParcelizer();
        r8lambdaOa7yOH60JzY3mr0PMwYpzaH5bmM r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm = getVerticalAccuracy.read(jCurrentTimeMillis);
        r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm.write = r8lambdaturwertf3otevz1wenzex5tdwaIconCompatParcelizer;
        this.IconCompatParcelizer.serializer(r8lambdaoa7yoh60jzy3mr0pmwypzah5bmm);
    }

    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.read();
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(new e$$ExternalSyntheticLambda0(10, this));
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.ParcelableVolumeInfo.serializer();
        this.write.read();
    }

    public final void read() {
        boolean z;
        if (!this.MediaSessionCompatToken.createFullyDrawnExecutor()) {
            this.serializer.IconCompatParcelizer("Venue mapping is not enabled remotely. Aborting...", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        setHeaderTextColor setheadertextcolor = this.MediaDescriptionCompat;
        List<r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ> list = setheadertextcolor.read(read);
        parseLonglambda0 parselonglambda0 = this.serializer;
        parselonglambda0.IconCompatParcelizer("Unprocessed stationary entries found: %d ", Integer.valueOf(list.size()));
        for (r8lambdalI8uU9kRiGfJG6en6Xj7AF4cWAQ r8lambdali8uu9krigfjg6en6xj7af4cwaq : list) {
            List listIconCompatParcelizer = setheadertextcolor.IconCompatParcelizer(r8lambdaSywuHIWfLiZV_fav810RJNKPOo.MediaBrowserCompatMediaItem(), r8lambdali8uu9krigfjg6en6xj7af4cwaq.r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
            _set_durationInMilliseconds_lambda0 _set_durationinmilliseconds_lambda0 = listIconCompatParcelizer.isEmpty() ? null : (_set_durationInMilliseconds_lambda0) listIconCompatParcelizer.get(0);
            if (_set_durationinmilliseconds_lambda0 != null) {
                arrayList.add(new deleteDataStoreFile(_set_durationinmilliseconds_lambda0, r8lambdali8uu9krigfjg6en6xj7af4cwaq, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem));
            } else {
                parselonglambda0.IconCompatParcelizer("Failed to get stationary metadata entry: %s", r8lambdali8uu9krigfjg6en6xj7af4cwaq.toString());
            }
        }
        synchronized (this) {
            this.MediaSessionCompatResultReceiverWrapper.addAll(arrayList);
            z = this.ResultReceiver == null;
        }
        if (z) {
            IconCompatParcelizer();
        }
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.MediaMetadataCompat;
        r8lambdadUy6u_n80in43NRwroZFxTEhSg r8lambdaduy6u_n80in43nrwrozfxtehsg = new r8lambdadUy6u_n80in43NRwroZFxTEhSg(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.IconCompatParcelizer;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(r8lambdaQOukgS6h1GFby4ttoKXnAo8Yog.class, r8lambdaduy6u_n80in43nrwrozfxtehsg);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdah7_qOZG1npIThIOnqsLS_FfvLwo(this, readandroid_sdk_base_releaseVar));
        getanalyticsenabledenterannotations.read(ControlMessage.TILE_PROVIDER_NEW_TILE_LOADED, new aExternalSyntheticLambda0(this, readandroid_sdk_base_releaseVar));
    }

    public r8lambdaNhlkRWz5iIYpTs8A0990satz5JA(r8lambdacP6WykJgkKnD5ek6ovbkqwFwPT4 r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4, parseLonglambda0 parselonglambda0, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, com.sentiance.sdk.util.c cVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, setHeaderTextColor setheadertextcolor, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq, handlePushNotificationPayloadlambda8 handlepushnotificationpayloadlambda8, com.sentiance.sdk.venuemapper.w wVar, r8lambdaXPYBZDOuJKDQIhpUsif_DKhgJb4 r8lambdaxpybzdoujkdqihpusif_dkhgjb4, ConfigurationManager configurationManager) {
        this.RemoteActionCompatParcelizer = r8lambdacp6wykjgkknd5ek6ovbkqwfwpt4;
        this.write = cVar;
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = getanalyticsenabledenterannotations;
        this.RatingCompat = r8lambdaxpybzdoujkdqihpusif_dkhgjb4;
        this.MediaBrowserCompatMediaItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.MediaDescriptionCompat = setheadertextcolor;
        this.MediaMetadataCompat = readandroid_sdk_base_releaseVar;
        this.MediaSessionCompatQueueItem = handlepushnotificationpayloadlambda8;
        this.PlaybackStateCompat = r8lambda59swxcybpdsiw8mt9h_rosbr8qq;
        this.ParcelableVolumeInfo = wVar;
        this.MediaSessionCompatToken = configurationManager;
    }

    public static HashSet serializer(r8lambdaNhlkRWz5iIYpTs8A0990satz5JA r8lambdanhlkrwz5iiypts8a0990satz5ja) {
        deleteDataStoreFilelambda0 deletedatastorefilelambda0;
        parseLonglambda0 parselonglambda0 = r8lambdanhlkrwz5iiypts8a0990satz5ja.serializer;
        String strWrite = r8lambdanhlkrwz5iiypts8a0990satz5ja.write.write("KEY_THROTTLED_STATIONARIES", (String) null);
        if (strWrite == null) {
            return new HashSet();
        }
        try {
            JSONArray jSONArray = new JSONArray(strWrite);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                try {
                    deletedatastorefilelambda0 = new deleteDataStoreFilelambda0((JSONObject) obj);
                } catch (JSONException e) {
                    parselonglambda0.IconCompatParcelizer(false, e, "Failed to deserialize throttled stationary: " + obj, new Object[0]);
                    deletedatastorefilelambda0 = null;
                }
                if (deletedatastorefilelambda0 != null) {
                    arrayList.add(deletedatastorefilelambda0);
                }
            }
            parselonglambda0.IconCompatParcelizer("Loaded the following throttled stationaries: " + arrayList, new Object[0]);
            return new HashSet(arrayList);
        } catch (JSONException e2) {
            parselonglambda0.IconCompatParcelizer(false, e2, "Failed to deserialize this list of throttled stationaries: ".concat(strWrite), new Object[0]);
            return new HashSet();
        }
    }

    private static VenueType read(com.sentiance.visitessentials.VenueType venueType) {
        switch (r8lambdauRPpDNTSPG88Zoz1xxX6L1Imp1o.IconCompatParcelizer[venueType.ordinal()]) {
            case 1:
                return VenueType.UNKNOWN;
            case 2:
                return VenueType.DRINK_DAY;
            case 3:
                return VenueType.DRINK_EVENING;
            case 4:
                return VenueType.EDUCATION_INDEPENDENT;
            case 5:
                return VenueType.EDUCATION_PARENTS;
            case 6:
                return VenueType.HEALTH;
            case 7:
                return VenueType.INDUSTRIAL;
            case 8:
                return VenueType.LEISURE_BEACH;
            case 9:
                return VenueType.LEISURE_DAY;
            case 10:
                return VenueType.LEISURE_EVENING;
            case 11:
                return VenueType.LEISURE_MUSEUM;
            case 12:
                return VenueType.LEISURE_NATURE;
            case 13:
                return VenueType.LEISURE_PARK;
            case 14:
                return VenueType.OFFICE;
            case 15:
                return VenueType.RELIGION;
            case 16:
                return VenueType.RESIDENTIAL;
            case 17:
                return VenueType.RESTO_MID;
            case 18:
                return VenueType.RESTO_SHORT;
            case 19:
                return VenueType.SHOP_LONG;
            case 20:
                return VenueType.SHOP_SHORT;
            case 21:
                return VenueType.SPORT;
            case 22:
                return VenueType.SPORT_ATTEND;
            case 23:
                return VenueType.TRAVEL_BUS;
            case 24:
                return VenueType.TRAVEL_CONFERENCE;
            case 25:
                return VenueType.TRAVEL_FILL;
            case 26:
                return VenueType.TRAVEL_HOTEL;
            case 27:
                return VenueType.TRAVEL_LONG;
            case 28:
                return VenueType.TRAVEL_SHORT;
            default:
                return VenueType.UNKNOWN;
        }
    }
}
