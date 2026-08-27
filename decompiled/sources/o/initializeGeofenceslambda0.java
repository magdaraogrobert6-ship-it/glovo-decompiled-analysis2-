package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.core.model.thrift.OS;
import io.socket.parser.IOParser$Decoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class initializeGeofenceslambda0 {
    public static setCustomUserAttributedefault read(r8lambdaFjiFiJxJXuf3VopUwRuT7TXivug r8lambdafjifijxjxuf3vopuwrut7txivug) {
        OS os;
        ArrayList arrayList;
        setCustomUserAttributelambda1 setcustomuserattributelambda1 = new setCustomUserAttributelambda1();
        setcustomuserattributelambda1.IconCompatParcelizer = r8lambdafjifijxjxuf3vopuwrut7txivug.IconCompatParcelizer;
        setcustomuserattributelambda1.RemoteActionCompatParcelizer = r8lambdafjifijxjxuf3vopuwrut7txivug.serializer;
        setcustomuserattributelambda1.MediaDescriptionCompat = r8lambdafjifijxjxuf3vopuwrut7txivug.read;
        setcustomuserattributelambda1.MediaSessionCompatQueueItem = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaSessionCompatQueueItem;
        setcustomuserattributelambda1.RatingCompat = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaMetadataCompat;
        Byte b = r8lambdafjifijxjxuf3vopuwrut7txivug.RatingCompat;
        if (b == null) {
            os = OS.NA;
        } else {
            byte bByteValue = b.byteValue();
            os = bByteValue != 1 ? bByteValue != 2 ? OS.NA : OS.IOS : OS.ANDROID;
        }
        setcustomuserattributelambda1.MediaBrowserCompatMediaItem = os;
        setcustomuserattributelambda1.MediaMetadataCompat = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaDescriptionCompat;
        setcustomuserattributelambda1.ParcelableVolumeInfo = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaBrowserCompatMediaItem;
        setcustomuserattributelambda1.MediaSessionCompatToken = r8lambdafjifijxjxuf3vopuwrut7txivug.PlaybackStateCompatCustomAction;
        setcustomuserattributelambda1.PlaybackStateCompat = r8lambdafjifijxjxuf3vopuwrut7txivug.PlaybackStateCompat;
        setcustomuserattributelambda1.PlaybackStateCompatCustomAction = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaSessionCompatResultReceiverWrapper;
        setcustomuserattributelambda1.MediaSessionCompatResultReceiverWrapper = r8lambdafjifijxjxuf3vopuwrut7txivug.MediaSessionCompatToken;
        setcustomuserattributelambda1.ComponentActivity = r8lambdafjifijxjxuf3vopuwrut7txivug.ParcelableVolumeInfo;
        setcustomuserattributelambda1.ResultReceiver = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        setcustomuserattributelambda1.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdafjifijxjxuf3vopuwrut7txivug.ComponentActivity;
        setcustomuserattributelambda1.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        setcustomuserattributelambda1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdafjifijxjxuf3vopuwrut7txivug.ResultReceiver;
        setcustomuserattributelambda1.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        setcustomuserattributelambda1.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        setcustomuserattributelambda1.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        setcustomuserattributelambda1.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        List<r8lambdaR6dAybf4g5pc5sZkFujTnBDSk> list = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        setAttributionData setattributiondata = null;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (r8lambdaR6dAybf4g5pc5sZkFujTnBDSk r8lambdar6daybf4g5pc5szkfujtnbdsk : list) {
                BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4 = new BrazeActivityLifecycleCallbackListenerExternalSyntheticLambda4();
                String str = r8lambdar6daybf4g5pc5szkfujtnbdsk.read;
                if (str == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'name' cannot be null");
                    return null;
                }
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer = str;
                String str2 = r8lambdar6daybf4g5pc5szkfujtnbdsk.serializer;
                if (str2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Required field 'version' cannot be null");
                    return null;
                }
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.write = str2;
                brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer = r8lambdar6daybf4g5pc5szkfujtnbdsk.IconCompatParcelizer;
                arrayList.add(brazeActivityLifecycleCallbackListenerExternalSyntheticLambda4.serializer());
            }
        }
        setcustomuserattributelambda1.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = arrayList;
        setcustomuserattributelambda1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        BrazeFlushPushDeliveryReceiver brazeFlushPushDeliveryReceiver = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (brazeFlushPushDeliveryReceiver != null) {
            IOParser$Decoder iOParser$Decoder = new IOParser$Decoder();
            iOParser$Decoder.read = brazeFlushPushDeliveryReceiver.RemoteActionCompatParcelizer;
            iOParser$Decoder.RemoteActionCompatParcelizer = brazeFlushPushDeliveryReceiver.read;
            setattributiondata = new setAttributionData(iOParser$Decoder);
        }
        setcustomuserattributelambda1.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = setattributiondata;
        setcustomuserattributelambda1.read = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        setcustomuserattributelambda1.write = r8lambdafjifijxjxuf3vopuwrut7txivug.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        setcustomuserattributelambda1.serializer = r8lambdafjifijxjxuf3vopuwrut7txivug.RemoteActionCompatParcelizer;
        return new setCustomUserAttributedefault(setcustomuserattributelambda1);
    }
}
