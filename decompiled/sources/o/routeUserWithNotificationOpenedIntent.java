package o;

import android.util.Pair;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.i$c;
import com.sentiance.core.model.thrift.ThriftBool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public class routeUserWithNotificationOpenedIntent extends logBaiduNotificationClicklambda1 {
    private final setSoundIfPresentAndSupportedlambda1 IconCompatParcelizer;
    private final r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q RemoteActionCompatParcelizer;
    private final long serializer;

    public static setCustomUserAttributelambda2 serializer(routeUserWithNotificationOpenedIntent routeuserwithnotificationopenedintent, r8lambdaM7UaNzSECvCoNHXoN4wkPSK8w_I r8lambdam7uanzsecvconhxon4wkpsk8w_i) {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        ThriftBool thriftBoolWrite = write(r8lambdam7uanzsecvconhxon4wkpsk8w_i.serializer);
        ArrayList arrayList = null;
        if (thriftBoolWrite == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_accelerometer_available' cannot be null");
            return null;
        }
        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = thriftBoolWrite;
        ThriftBool thriftBoolWrite2 = write(r8lambdam7uanzsecvconhxon4wkpsk8w_i.RemoteActionCompatParcelizer);
        if (thriftBoolWrite2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_gyroscope_available' cannot be null");
            return null;
        }
        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = thriftBoolWrite2;
        ThriftBool thriftBoolWrite3 = write(r8lambdam7uanzsecvconhxon4wkpsk8w_i.read);
        if (thriftBoolWrite3 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_device_power_saving_mode_enabled' cannot be null");
            return null;
        }
        r8lambdabirsljoagmyxhikohl5z5hht12q.write = thriftBoolWrite3;
        onActivityPausedlambda0 onactivitypausedlambda0 = r8lambdam7uanzsecvconhxon4wkpsk8w_i.IconCompatParcelizer;
        r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = new r8lambda1MNczrzuv4oWduWgKg6cjtSWs();
        ThriftBool thriftBoolWrite4 = write(onactivitypausedlambda0.RemoteActionCompatParcelizer);
        if (thriftBoolWrite4 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_low' cannot be null");
            return null;
        }
        r8lambda1mnczrzuv4owduwgkg6cjtsws.write = thriftBoolWrite4;
        Byte b = onactivitypausedlambda0.write;
        if (b == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'percent_threshold' cannot be null");
            return null;
        }
        r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer = b;
        r8lambdabirsljoagmyxhikohl5z5hht12q.read = r8lambda1mnczrzuv4owduwgkg6cjtsws.read();
        registerOnApplicationlambda0 registeronapplicationlambda0 = r8lambdam7uanzsecvconhxon4wkpsk8w_i.MediaDescriptionCompat;
        FormBody.Builder builder = new FormBody.Builder();
        ThriftBool thriftBoolWrite5 = write(registeronapplicationlambda0.serializer);
        if (thriftBoolWrite5 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_low' cannot be null");
            return null;
        }
        builder.serializer = thriftBoolWrite5;
        Byte b2 = registeronapplicationlambda0.RemoteActionCompatParcelizer;
        if (b2 == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'percent_threshold' cannot be null");
            return null;
        }
        builder.RemoteActionCompatParcelizer = b2;
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = builder.IconCompatParcelizer();
        List list = r8lambdam7uanzsecvconhxon4wkpsk8w_i.MediaSessionCompatQueueItem;
        if (list != null) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte bByteValue = ((Byte) it.next()).byteValue();
                if (bByteValue == 1) {
                    hashSet.add((byte) 1);
                } else if (bByteValue == 2) {
                    hashSet.add((byte) 2);
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = arrayList;
        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = write(r8lambdam7uanzsecvconhxon4wkpsk8w_i.MediaBrowserCompatMediaItem);
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaSessionCompatQueueItem = write(r8lambdam7uanzsecvconhxon4wkpsk8w_i.MediaMetadataCompat);
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaBrowserCompatMediaItem = write(r8lambdam7uanzsecvconhxon4wkpsk8w_i.MediaSessionCompatToken);
        return r8lambdabirsljoagmyxhikohl5z5hht12q.write();
    }

    public routeUserWithNotificationOpenedIntent(setSoundIfPresentAndSupportedlambda1 setsoundifpresentandsupportedlambda1, r8lambdaK6IZILH9V8ErT5zK67D8Tg0VC8Q r8lambdak6izilh9v8ert5zk67d8tg0vc8q, long j) {
        this.IconCompatParcelizer = setsoundifpresentandsupportedlambda1;
        this.RemoteActionCompatParcelizer = r8lambdak6izilh9v8ert5zk67d8tg0vc8q;
        this.serializer = j;
    }

    private static Byte RemoteActionCompatParcelizer(byte b) {
        if (b == 2) {
            return (byte) 2;
        }
        if (b != 3) {
            return (byte) 1;
        }
        return (byte) 3;
    }

    @Override // o.logBaiduNotificationClicklambda1
    public final Iterator<Pair<getCustomLocationProviderNamesandroid_sdk_base_release, isValidNotificationVisibility>> write() {
        return new refreshFeatureFlagsIfAppropriatelambda0(this);
    }

    public static setEmailNotificationSubscriptionTypelambda0 RemoteActionCompatParcelizer(routeUserWithNotificationOpenedIntent routeuserwithnotificationopenedintent, publishBrazePushAction publishbrazepushaction) {
        r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q r8lambdabirsljoagmyxhikohl5z5hht12q = new r8lambdaBirSLjOAGmYxhIkoHl5Z5HHT12Q();
        byte bByteValue = publishbrazepushaction.RemoteActionCompatParcelizer.byteValue();
        byte b = 1;
        if (bByteValue != 1) {
            b = 2;
            if (bByteValue != 2) {
                b = 3;
                if (bByteValue != 3) {
                    b = 4;
                }
            }
        }
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaDescriptionCompat = Byte.valueOf(b);
        r8lambdabirsljoagmyxhikohl5z5hht12q.serializer = RemoteActionCompatParcelizer(publishbrazepushaction.write.byteValue());
        r8lambdabirsljoagmyxhikohl5z5hht12q.RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(publishbrazepushaction.serializer.byteValue());
        r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer = RemoteActionCompatParcelizer(publishbrazepushaction.read.byteValue());
        r8lambdabirsljoagmyxhikohl5z5hht12q.write = write(publishbrazepushaction.MediaBrowserCompatMediaItem);
        r8lambdabirsljoagmyxhikohl5z5hht12q.read = publishbrazepushaction.MediaMetadataCompat;
        r8lambdabirsljoagmyxhikohl5z5hht12q.MediaMetadataCompat = publishbrazepushaction.RatingCompat;
        r8lambdabirsljoagmyxhikohl5z5hht12q.RatingCompat = write(publishbrazepushaction.MediaDescriptionCompat);
        return r8lambdabirsljoagmyxhikohl5z5hht12q.IconCompatParcelizer();
    }

    public static setPhoneNumber RemoteActionCompatParcelizer(routeUserWithNotificationOpenedIntent routeuserwithnotificationopenedintent, logPushCampaign logpushcampaign) {
        Byte b;
        Byte b2 = (byte) 4;
        i$c i_c = new i$c(0);
        byte bByteValue = logpushcampaign.read.byteValue();
        if (bByteValue != 3) {
            b = bByteValue != 5 ? b2 : (byte) 5;
        } else {
            b = (byte) 3;
        }
        i_c.write = b;
        ThriftBool thriftBoolWrite = write(logpushcampaign.write);
        if (thriftBoolWrite != null) {
            i_c.IconCompatParcelizer = thriftBoolWrite;
            ThriftBool thriftBoolWrite2 = write(logpushcampaign.serializer);
            if (thriftBoolWrite2 != null) {
                i_c.serializer = thriftBoolWrite2;
                i_c.RemoteActionCompatParcelizer = write(logpushcampaign.IconCompatParcelizer);
                i_c.read = write(logpushcampaign.MediaSessionCompatQueueItem);
                i_c.RatingCompat = write(logpushcampaign.MediaDescriptionCompat);
                Byte b3 = logpushcampaign.MediaMetadataCompat;
                if (b3 == null) {
                    b2 = null;
                } else {
                    byte bByteValue2 = b3.byteValue();
                    if (bByteValue2 == 2) {
                        b2 = (byte) 2;
                    } else if (bByteValue2 == 3) {
                        b2 = (byte) 3;
                    } else if (bByteValue2 != 4) {
                        if (bByteValue2 == 5) {
                            b2 = (byte) 5;
                        } else if (bByteValue2 != 6) {
                            b2 = (byte) 1;
                        } else {
                            b2 = (byte) 6;
                        }
                    }
                }
                i_c.MediaMetadataCompat = b2;
                return i_c.write();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_activity_recognition_permission_granted' cannot be null");
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'is_precise_location_permission_granted' cannot be null");
        return null;
    }

    private static ThriftBool write(com.sentiance.core.model.events.ThriftBool thriftBool) {
        if (thriftBool != null && thriftBool != com.sentiance.core.model.events.ThriftBool.UNSET) {
            if (thriftBool == com.sentiance.core.model.events.ThriftBool.TRUE) {
                return ThriftBool.TRUE;
            }
            return ThriftBool.FALSE;
        }
        return ThriftBool.UNSET;
    }
}
