package o;

import android.location.Location;
import android.util.SparseArray;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import com.sentiance.core.model.events.i$c;
import com.sentiance.core.model.thrift.LocationProvider;
import com.sentiance.core.model.thrift.MotionActivity;
import com.sentiance.core.model.thrift.OS;
import com.sentiance.core.model.thrift.TransportMode;
import com.sentiance.okhttp3.u$a;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.util.Optional;
import io.sentry.util.network.NetworkBody;
import io.socket.parser.IOParser$Decoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "PayloadUtil")
public class setSoundIfPresentAndSupportedlambda1 {
    private static final SparseArray<MotionActivity> write;
    private final r8lambdaw447glWJfoun4bg91upXnaDQEZs RemoteActionCompatParcelizer;

    static {
        SparseArray<MotionActivity> sparseArray = new SparseArray<>();
        write = sparseArray;
        sparseArray.put(1, MotionActivity.ANDROID_IN_VEHICLE);
        sparseArray.put(2, MotionActivity.ANDROID_ON_BICYCLE);
        sparseArray.put(3, MotionActivity.ANDROID_ON_FOOT);
        sparseArray.put(4, MotionActivity.ANDROID_RUNNING);
        sparseArray.put(5, MotionActivity.ANDROID_STILL);
        sparseArray.put(6, MotionActivity.ANDROID_TILTING);
        sparseArray.put(7, MotionActivity.ANDROID_UNKNOWN);
        sparseArray.put(8, MotionActivity.ANDROID_WALKING);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    private static removeFromSubscriptionGrouplambda0 read(Location location, long j, handleIncomingIntent handleincomingintent) {
        byte b;
        LocationProvider locationProvider;
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls r8lambdayc78smgbbb6fudfjq0u5z3_ls2 = new r8lambdayC78SmgbBb6fUdfJq0U5z3_Ls();
        r8lambdayc78smgbbb6fudfjq0u5z3_ls2.IconCompatParcelizer = Integer.valueOf((int) Math.round(location.getLatitude() * 100000.0d));
        r8lambdayc78smgbbb6fudfjq0u5z3_ls2.write = Integer.valueOf((int) Math.round(location.getLongitude() * 100000.0d));
        if (location.hasAccuracy()) {
            r8lambdayc78smgbbb6fudfjq0u5z3_ls2.serializer = Short.valueOf((short) location.getAccuracy());
        }
        if (location.hasVerticalAccuracy()) {
            r8lambdayc78smgbbb6fudfjq0u5z3_ls2.RemoteActionCompatParcelizer = Short.valueOf((short) location.getVerticalAccuracyMeters());
        }
        if (location.hasAltitude()) {
            r8lambdayc78smgbbb6fudfjq0u5z3_ls2.MediaBrowserCompatMediaItem = Short.valueOf((short) location.getAltitude());
        }
        removeFromCustomAttributeArraylambda1 removefromcustomattributearraylambda1Serializer = null;
        if (location.getProvider() != null) {
            String provider = location.getProvider();
            provider.getClass();
            switch (provider) {
                case "passive":
                    b = 0;
                    break;
                case "stationary":
                    b = 1;
                    break;
                case "gps":
                    b = 2;
                    break;
                case "fused":
                    b = 3;
                    break;
                case "network":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                locationProvider = LocationProvider.PASSIVE;
            } else if (b == 1) {
                locationProvider = LocationProvider.STATIONARY;
            } else if (b == 2) {
                locationProvider = LocationProvider.GPS;
            } else if (b != 3) {
                locationProvider = b != 4 ? null : LocationProvider.NETWORK;
            } else {
                locationProvider = LocationProvider.FUSED;
            }
            if (locationProvider != null) {
                r8lambdayc78smgbbb6fudfjq0u5z3_ls2.read = locationProvider;
            }
        }
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.serializer = r8lambdayc78smgbbb6fudfjq0u5z3_ls2.read();
        if (handleincomingintent != null) {
            r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(6);
            String str = handleincomingintent.IconCompatParcelizer;
            if (str == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'ssid' cannot be null");
                return null;
            }
            r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = str;
            removefromcustomattributearraylambda1Serializer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.serializer();
        }
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.read = removefromcustomattributearraylambda1Serializer;
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer = Long.valueOf(j);
        if (location.hasSpeed()) {
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.IconCompatParcelizer = Short.valueOf((short) Math.round(location.getSpeed() * 10.0f));
        }
        if (location.hasBearing()) {
            r8lambdayc78smgbbb6fudfjq0u5z3_ls.write = Short.valueOf((short) location.getBearing());
        }
        r8lambdayc78smgbbb6fudfjq0u5z3_ls.MediaBrowserCompatMediaItem = Long.valueOf(location.getElapsedRealtimeNanos() / 1000000);
        return r8lambdayc78smgbbb6fudfjq0u5z3_ls.RemoteActionCompatParcelizer();
    }

    public setSoundIfPresentAndSupportedlambda1(parseLonglambda0 parselonglambda0, r8lambdaw447glWJfoun4bg91upXnaDQEZs r8lambdaw447glwjfoun4bg91upxnadqezs) {
        this.RemoteActionCompatParcelizer = r8lambdaw447glwjfoun4bg91upxnadqezs;
    }

    private static Optional write(setDefaultNotificationAccentColorandroid_sdk_base_release setdefaultnotificationaccentcolorandroid_sdk_base_release) {
        getBadNetworkIntervalandroid_sdk_base_release getbadnetworkintervalandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.read;
        if (getbadnetworkintervalandroid_sdk_base_release != null) {
            return Optional.RemoteActionCompatParcelizer(getbadnetworkintervalandroid_sdk_base_release);
        }
        setCustomUserAttributedefault setcustomuserattributedefault = setdefaultnotificationaccentcolorandroid_sdk_base_release.RemoteActionCompatParcelizer;
        if (setcustomuserattributedefault != null) {
            return Optional.RemoteActionCompatParcelizer(setcustomuserattributedefault);
        }
        BrazeUserExternalSyntheticLambda1 brazeUserExternalSyntheticLambda1 = setdefaultnotificationaccentcolorandroid_sdk_base_release.write;
        if (brazeUserExternalSyntheticLambda1 != null) {
            return Optional.RemoteActionCompatParcelizer(brazeUserExternalSyntheticLambda1);
        }
        setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.serializer;
        if (setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release != null) {
            return Optional.RemoteActionCompatParcelizer(setcontentcardsunreadvisualindicatorenabledandroid_sdk_base_release);
        }
        setGender setgender = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaMetadataCompat;
        if (setgender != null) {
            return Optional.RemoteActionCompatParcelizer(setgender);
        }
        unsetCustomUserAttributelambda1 unsetcustomuserattributelambda1 = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaBrowserCompatMediaItem;
        if (unsetcustomuserattributelambda1 != null) {
            return Optional.RemoteActionCompatParcelizer(unsetcustomuserattributelambda1);
        }
        IBrazeExternalSyntheticBUOutline0 iBrazeExternalSyntheticBUOutline0 = setdefaultnotificationaccentcolorandroid_sdk_base_release.MediaDescriptionCompat;
        if (iBrazeExternalSyntheticBUOutline0 != null) {
            return Optional.RemoteActionCompatParcelizer(iBrazeExternalSyntheticBUOutline0);
        }
        getGreatNetworkIntervalandroid_sdk_base_release getgreatnetworkintervalandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.ParcelableVolumeInfo;
        if (getgreatnetworkintervalandroid_sdk_base_release != null) {
            return Optional.RemoteActionCompatParcelizer(getgreatnetworkintervalandroid_sdk_base_release);
        }
        setEmail setemail = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (setemail != null) {
            return Optional.RemoteActionCompatParcelizer(setemail);
        }
        setAutomaticLocationCollectionEnabledandroid_sdk_base_release setautomaticlocationcollectionenabledandroid_sdk_base_release = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (setautomaticlocationcollectionenabledandroid_sdk_base_release != null) {
            return Optional.RemoteActionCompatParcelizer(setautomaticlocationcollectionenabledandroid_sdk_base_release);
        }
        logPurchasedefault logpurchasedefault = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (logpurchasedefault != null) {
            return Optional.RemoteActionCompatParcelizer(logpurchasedefault);
        }
        setCustomUserAttributelambda0 setcustomuserattributelambda0 = setdefaultnotificationaccentcolorandroid_sdk_base_release.ComponentActivity;
        if (setcustomuserattributelambda0 != null) {
            return Optional.RemoteActionCompatParcelizer(setcustomuserattributelambda0);
        }
        unsetCustomUserAttribute unsetcustomuserattribute = setdefaultnotificationaccentcolorandroid_sdk_base_release.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        return unsetcustomuserattribute != null ? Optional.RemoteActionCompatParcelizer(unsetcustomuserattribute) : Optional.MediaSessionCompatQueueItem();
    }

    private static Optional serializer(incrementCustomUserAttributedefault incrementcustomuserattributedefault) {
        if (incrementcustomuserattributedefault != null) {
            Optional optionalWrite = write(incrementcustomuserattributedefault.write.RemoteActionCompatParcelizer.read);
            if (optionalWrite.read()) {
                return Optional.MediaSessionCompatQueueItem();
            }
            return serializer(optionalWrite.write().getClass());
        }
        return Optional.MediaSessionCompatQueueItem();
    }

    public static TransportMode write(Byte b) {
        if (b == null) {
            return null;
        }
        switch (b.byteValue()) {
            case 2:
                return TransportMode.CAR;
            case 3:
                return TransportMode.BICYCLE;
            case 4:
                return TransportMode.ON_FOOT;
            case 5:
                return TransportMode.TRAIN;
            case 6:
                return TransportMode.TRAM;
            case 7:
                return TransportMode.BUS;
            case 8:
                return TransportMode.PLANE;
            case 9:
                return TransportMode.BOAT;
            case 10:
                return TransportMode.METRO;
            case 11:
                return TransportMode.RUNNING;
            default:
                return TransportMode.UNKNOWN;
        }
    }

    public static removeFromSubscriptionGrouplambda0 read(Location location) {
        return read(location, location.getTime(), null);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa A[RETURN] */
    public final getCustomLocationProviderNamesandroid_sdk_base_release write(r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k r8lambdanclnumohj3w_eprkcj4qjg7b2k, Long l) {
        setDefaultNotificationAccentColorandroid_sdk_base_release setdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer;
        setDefaultNotificationAccentColor setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem;
        setBadNetworkIntervalandroid_sdk_base_release setbadnetworkintervalandroid_sdk_base_releaseRemoteActionCompatParcelizer;
        r8lambdaZcbG_e0HJUSJy78mvgh54SWZqtY r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer;
        setDefaultNotificationChannelName setdefaultnotificationchannelname = new setDefaultNotificationChannelName();
        if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof getBadNetworkIntervalandroid_sdk_base_release) {
            setdefaultnotificationchannelname.read = (getBadNetworkIntervalandroid_sdk_base_release) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof setCustomUserAttributedefault) {
            setdefaultnotificationchannelname.serializer = (setCustomUserAttributedefault) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof BrazeUserExternalSyntheticLambda1) {
            setdefaultnotificationchannelname.RemoteActionCompatParcelizer = (BrazeUserExternalSyntheticLambda1) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) {
            setdefaultnotificationchannelname.write = (setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof setGender) {
            setdefaultnotificationchannelname.IconCompatParcelizer = (setGender) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof unsetCustomUserAttributelambda1) {
            setdefaultnotificationchannelname.RatingCompat = (unsetCustomUserAttributelambda1) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof IBrazeExternalSyntheticBUOutline0) {
            setdefaultnotificationchannelname.MediaBrowserCompatMediaItem = (IBrazeExternalSyntheticBUOutline0) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof getGreatNetworkIntervalandroid_sdk_base_release) {
            setdefaultnotificationchannelname.PlaybackStateCompat = (getGreatNetworkIntervalandroid_sdk_base_release) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof setEmail) {
            setdefaultnotificationchannelname.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = (setEmail) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof setAutomaticLocationCollectionEnabledandroid_sdk_base_release) {
            setdefaultnotificationchannelname.ComponentActivity = (setAutomaticLocationCollectionEnabledandroid_sdk_base_release) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof logPurchasedefault) {
            setdefaultnotificationchannelname.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = (logPurchasedefault) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof setCustomUserAttributelambda0) {
            setdefaultnotificationchannelname.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (setCustomUserAttributelambda0) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
        } else {
            if (r8lambdanclnumohj3w_eprkcj4qjg7b2k instanceof unsetCustomUserAttribute) {
                setdefaultnotificationchannelname.ResultReceiver = (unsetCustomUserAttribute) r8lambdanclnumohj3w_eprkcj4qjg7b2k;
            } else {
                setdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer = null;
            }
            if (setdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer != null || (r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.write().RemoteActionCompatParcelizer()) == null) {
                setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem = null;
            } else {
                NetworkBody networkBody = new NetworkBody(25);
                String strSerializer = r8lambdazcbg_e0hjusjy78mvgh54swzqtyRemoteActionCompatParcelizer.serializer();
                r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k = new r8lambdayDbPQmcrpbdH8qFzwvJYuiVgV8k(13);
                r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer = strSerializer;
                networkBody.IconCompatParcelizer = r8lambdaydbpqmcrpbdh8qfzwvjyuivgv8k.RemoteActionCompatParcelizer();
                networkBody.RemoteActionCompatParcelizer = setdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer;
                setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem = networkBody.MediaBrowserCompatMediaItem();
            }
            if (setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem != null) {
                return null;
            }
            i$c i_c = new i$c(0);
            i_c.write = setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem;
            setCountrylambda0 setcountrylambda0 = i_c.read();
            if (l == null) {
                setbadnetworkintervalandroid_sdk_base_releaseRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(System.currentTimeMillis());
            } else {
                setbadnetworkintervalandroid_sdk_base_releaseRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(l.longValue());
            }
            u$a u_a = new u$a();
            ArrayList arrayList = new ArrayList();
            NetworkBody networkBody2 = new NetworkBody(16);
            networkBody2.IconCompatParcelizer = setbadnetworkintervalandroid_sdk_base_releaseRemoteActionCompatParcelizer;
            networkBody2.RemoteActionCompatParcelizer = setcountrylambda0;
            arrayList.add(networkBody2.RemoteActionCompatParcelizer());
            u_a.IconCompatParcelizer = arrayList;
            return new getCustomLocationProviderNamesandroid_sdk_base_release(u_a);
        }
        setdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer = setdefaultnotificationchannelname.IconCompatParcelizer();
        if (setdefaultnotificationaccentcolorandroid_sdk_base_releaseIconCompatParcelizer != null) {
            setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem = null;
        } else {
            setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem = null;
        }
        if (setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem != null) {
            return null;
        }
        i$c i_c2 = new i$c(0);
        i_c2.write = setdefaultnotificationaccentcolorMediaBrowserCompatMediaItem;
        setCountrylambda0 setcountrylambda1 = i_c2.read();
        if (l == null) {
            setbadnetworkintervalandroid_sdk_base_releaseRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(System.currentTimeMillis());
        } else {
            setbadnetworkintervalandroid_sdk_base_releaseRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(l.longValue());
        }
        u$a u_a2 = new u$a();
        ArrayList arrayList2 = new ArrayList();
        NetworkBody networkBody3 = new NetworkBody(16);
        networkBody3.IconCompatParcelizer = setbadnetworkintervalandroid_sdk_base_releaseRemoteActionCompatParcelizer;
        networkBody3.RemoteActionCompatParcelizer = setcountrylambda1;
        arrayList2.add(networkBody3.RemoteActionCompatParcelizer());
        u_a2.IconCompatParcelizer = arrayList2;
        return new getCustomLocationProviderNamesandroid_sdk_base_release(u_a2);
    }

    public final getCustomLocationProviderNamesandroid_sdk_base_release write(Location location, String str, long j, handleIncomingIntent handleincomingintent) {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(5);
        iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = read(location, j, handleincomingintent);
        setLanguage setlanguageSerializer = iscontentcardsunreadvisualindicatorenabled.serializer();
        IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
        if (str != null) {
            iOParser$Decoder.RemoteActionCompatParcelizer = str;
            iOParser$Decoder.read = setlanguageSerializer;
            return write(iOParser$Decoder.write(), Long.valueOf(j));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'stationary_id' cannot be null");
        return null;
    }

    public static MotionActivity serializer(Byte b) {
        return write.get(b.byteValue());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    public static Optional IconCompatParcelizer(getCustomLocationProviderNamesandroid_sdk_base_release getcustomlocationprovidernamesandroid_sdk_base_release) {
        Optional optionalMediaSessionCompatQueueItem;
        Optional optionalMediaSessionCompatQueueItem2;
        Optional optionalMediaSessionCompatQueueItem3;
        List list = getcustomlocationprovidernamesandroid_sdk_base_release.IconCompatParcelizer;
        if (list.isEmpty()) {
            return Optional.MediaSessionCompatQueueItem();
        }
        incrementCustomUserAttributedefault incrementcustomuserattributedefault = (incrementCustomUserAttributedefault) list.get(0);
        Optional optionalSerializer = serializer(incrementcustomuserattributedefault);
        Optional optionalSerializer2 = serializer(incrementcustomuserattributedefault);
        if (optionalSerializer2.IconCompatParcelizer() && ((String) optionalSerializer2.write()).equals("tripEvent")) {
            if (incrementcustomuserattributedefault != null) {
                Optional optionalWrite = write(incrementcustomuserattributedefault.write.RemoteActionCompatParcelizer.read);
                if (optionalWrite.IconCompatParcelizer() && (optionalWrite.write() instanceof setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release)) {
                    setContentCardsUnreadVisualIndicatorEnabled setcontentcardsunreadvisualindicatorenabled = ((setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release) optionalWrite.write()).read;
                    r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4 r8lambdasscpazklpwhzf7qziwqx9zu4wp4 = setcontentcardsunreadvisualindicatorenabled.IconCompatParcelizer;
                    if (r8lambdasscpazklpwhzf7qziwqx9zu4wp4 != null) {
                        optionalMediaSessionCompatQueueItem3 = Optional.RemoteActionCompatParcelizer(r8lambdasscpazklpwhzf7qziwqx9zu4wp4);
                    } else {
                        setApiKeyandroid_sdk_base_release setapikeyandroid_sdk_base_release = setcontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer;
                        if (setapikeyandroid_sdk_base_release != null) {
                            optionalMediaSessionCompatQueueItem3 = Optional.RemoteActionCompatParcelizer(setapikeyandroid_sdk_base_release);
                        } else {
                            removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda0 = setcontentcardsunreadvisualindicatorenabled.read;
                            if (removefromsubscriptiongrouplambda0 != null) {
                                optionalMediaSessionCompatQueueItem3 = Optional.RemoteActionCompatParcelizer(removefromsubscriptiongrouplambda0);
                            } else {
                                getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations getbraze_push_delivery_flush_min_keyannotations = setcontentcardsunreadvisualindicatorenabled.serializer;
                                if (getbraze_push_delivery_flush_min_keyannotations != null) {
                                    optionalMediaSessionCompatQueueItem3 = Optional.RemoteActionCompatParcelizer(getbraze_push_delivery_flush_min_keyannotations);
                                } else {
                                    setCustomWebViewActivityClass setcustomwebviewactivityclass = setcontentcardsunreadvisualindicatorenabled.MediaMetadataCompat;
                                    if (setcustomwebviewactivityclass != null) {
                                        optionalMediaSessionCompatQueueItem3 = Optional.RemoteActionCompatParcelizer(setcustomwebviewactivityclass);
                                    } else {
                                        optionalMediaSessionCompatQueueItem3 = Optional.MediaSessionCompatQueueItem();
                                    }
                                }
                            }
                        }
                    }
                    if (optionalMediaSessionCompatQueueItem3.IconCompatParcelizer()) {
                        optionalMediaSessionCompatQueueItem = serializer(optionalMediaSessionCompatQueueItem3.write().getClass());
                    } else {
                        optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
                    }
                } else {
                    optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
                }
            } else {
                optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
            }
        } else if (optionalSerializer2.IconCompatParcelizer() && ((String) optionalSerializer2.write()).equals("stationaryEvent") && incrementcustomuserattributedefault != null) {
            Optional optionalWrite2 = write(incrementcustomuserattributedefault.write.RemoteActionCompatParcelizer.read);
            if (optionalWrite2.IconCompatParcelizer() && (optionalWrite2.write() instanceof setGender)) {
                setLanguage setlanguage = ((setGender) optionalWrite2.write()).write;
                setLineId setlineid = setlanguage.serializer;
                if (setlineid != null) {
                    optionalMediaSessionCompatQueueItem2 = Optional.RemoteActionCompatParcelizer(setlineid);
                } else {
                    setCustomUserAttributeToSecondsFromEpoch setcustomuserattributetosecondsfromepoch = setlanguage.read;
                    if (setcustomuserattributetosecondsfromepoch != null) {
                        optionalMediaSessionCompatQueueItem2 = Optional.RemoteActionCompatParcelizer(setcustomuserattributetosecondsfromepoch);
                    } else {
                        removeFromSubscriptionGrouplambda0 removefromsubscriptiongrouplambda1 = setlanguage.write;
                        if (removefromsubscriptiongrouplambda1 != null) {
                            optionalMediaSessionCompatQueueItem2 = Optional.RemoteActionCompatParcelizer(removefromsubscriptiongrouplambda1);
                        } else {
                            optionalMediaSessionCompatQueueItem2 = Optional.MediaSessionCompatQueueItem();
                        }
                    }
                }
                if (optionalMediaSessionCompatQueueItem2.IconCompatParcelizer()) {
                    optionalMediaSessionCompatQueueItem = serializer(optionalMediaSessionCompatQueueItem2.write().getClass());
                } else {
                    optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
                }
            } else {
                optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
            }
        } else {
            optionalMediaSessionCompatQueueItem = Optional.MediaSessionCompatQueueItem();
        }
        if (optionalSerializer.read()) {
            return Optional.MediaSessionCompatQueueItem();
        }
        if (optionalMediaSessionCompatQueueItem.read()) {
            return optionalSerializer;
        }
        return Optional.RemoteActionCompatParcelizer(((String) optionalSerializer.write()) + '|' + ((String) optionalMediaSessionCompatQueueItem.write()));
    }

    public static Optional serializer(Class cls) {
        if (cls == getBadNetworkIntervalandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer(FeedbackEvent.DRIVER_MODE_TRIP);
        }
        if (cls == setCustomUserAttributedefault.class) {
            return Optional.RemoteActionCompatParcelizer("device_info");
        }
        if (cls == BrazeUserExternalSyntheticLambda1.class) {
            return Optional.RemoteActionCompatParcelizer("metadata");
        }
        if (cls == setContentCardsUnreadVisualIndicatorEnabledandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer("tripEvent");
        }
        if (cls == setGender.class) {
            return Optional.RemoteActionCompatParcelizer("stationaryEvent");
        }
        if (cls == unsetCustomUserAttributelambda1.class) {
            return Optional.RemoteActionCompatParcelizer("sleep");
        }
        if (cls == setEmaillambda3.class) {
            return Optional.RemoteActionCompatParcelizer("externalEvent");
        }
        if (cls == IBrazeExternalSyntheticBUOutline0.class) {
            return Optional.RemoteActionCompatParcelizer("offTheGridEvent");
        }
        if (cls == r8lambdasscPAzKLPWHzf7qZIWQX9zU4wP4.class) {
            return Optional.RemoteActionCompatParcelizer("trip_start");
        }
        if (cls == setApiKeyandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer("trip_end");
        }
        if (cls == getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations.class) {
            return Optional.RemoteActionCompatParcelizer("motion_activity_event");
        }
        if (cls == setLineId.class) {
            return Optional.RemoteActionCompatParcelizer("stationary_start");
        }
        if (cls == setCustomUserAttributeToSecondsFromEpoch.class) {
            return Optional.RemoteActionCompatParcelizer("stationary_end");
        }
        if (cls == removeFromSubscriptionGrouplambda0.class) {
            return Optional.RemoteActionCompatParcelizer("waypoint");
        }
        if (cls == setCustomWebViewActivityClass.class) {
            return Optional.RemoteActionCompatParcelizer(CrashHianalyticsData.EVENT_ID_CRASH);
        }
        if (cls == getGreatNetworkIntervalandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer("timeline");
        }
        if (cls == setEmail.class) {
            return Optional.RemoteActionCompatParcelizer("app_foreground_session");
        }
        if (cls == setAutomaticLocationCollectionEnabledandroid_sdk_base_release.class) {
            return Optional.RemoteActionCompatParcelizer("user_segments");
        }
        if (cls == logPurchasedefault.class) {
            return Optional.RemoteActionCompatParcelizer("step_count");
        }
        if (cls == setCustomUserAttributelambda0.class) {
            return Optional.RemoteActionCompatParcelizer("sdk_reset");
        }
        if (cls == unsetCustomUserAttribute.class) {
            return Optional.RemoteActionCompatParcelizer("status_update");
        }
        return Optional.MediaSessionCompatQueueItem();
    }

    private static setBadNetworkIntervalandroid_sdk_base_release RemoteActionCompatParcelizer(long j) {
        isContentCardsUnreadVisualIndicatorEnabled iscontentcardsunreadvisualindicatorenabled = new isContentCardsUnreadVisualIndicatorEnabled(15);
        iscontentcardsunreadvisualindicatorenabled.IconCompatParcelizer = Integer.valueOf((int) (j / 1000));
        iscontentcardsunreadvisualindicatorenabled.read = Long.valueOf(j);
        iscontentcardsunreadvisualindicatorenabled.write = Short.valueOf((short) (((long) TimeZone.getDefault().getOffset(new Date().getTime())) / 60000));
        OS os = OS.ANDROID;
        if (os != null) {
            iscontentcardsunreadvisualindicatorenabled.RemoteActionCompatParcelizer = os;
            return iscontentcardsunreadvisualindicatorenabled.MediaMetadataCompat();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'os' cannot be null");
        return null;
    }
}
