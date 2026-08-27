package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "TransportWaypointsProvider")
public class setDismissed {
    private final _set_isDismissed_lambda0 IconCompatParcelizer;
    private final r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final component4android_sdk_base_release serializer;
    private final getCooldownEnterSeconds write;

    public setDismissed(getCooldownEnterSeconds getcooldownenterseconds, r8lambda59SWxCYBPdsiW8mt9H_rosbR8qQ r8lambda59swxcybpdsiw8mt9h_rosbr8qq, component4android_sdk_base_release component4android_sdk_base_releaseVar, _set_isDismissed_lambda0 _set_isdismissed_lambda0, parseLonglambda0 parselonglambda0) {
        this.read = parselonglambda0;
        this.write = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = r8lambda59swxcybpdsiw8mt9h_rosbr8qq;
        this.serializer = component4android_sdk_base_releaseVar;
        this.IconCompatParcelizer = _set_isdismissed_lambda0;
    }

    public final List<Location> read(long j, long j2, Location location) {
        r8lambdaTURWeRtF3oTEvz1WenZeX5TdwA r8lambdaturwertf3otevz1wenzex5tdwa;
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        Object[] objArr = {com.sentiance.sdk.util.x.c(j), com.sentiance.sdk.util.x.c(j2)};
        parseLonglambda0 parselonglambda0 = this.read;
        parselonglambda0.IconCompatParcelizer("Retrieving waypoints from time %s to %s", objArr);
        ArrayList arrayList = new ArrayList();
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(j - 1), Long.valueOf(j2), false, false);
        parselonglambda0.IconCompatParcelizer("Retrieved %d waypoints", Integer.valueOf(listRemoteActionCompatParcelizer.size()));
        HashSet hashSet = new HashSet();
        Iterator<getCooldownEnterSeconds.read> it = listRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.serializer);
            if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = (r8lambdaturwertf3otevz1wenzex5tdwa = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer).r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
                java.util.Locale locale = java.util.Locale.US;
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
                hashSet.add(brazeCompanionExternalSyntheticLambda4.read + ", " + brazeCompanionExternalSyntheticLambda4.write);
                BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda5 = r8lambdaturwertf3otevz1wenzex5tdwa.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer.getClass();
                arrayList.add(getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda5));
            }
        }
        parselonglambda0.IconCompatParcelizer("%d unique locations were converted from thrift to android location", Integer.valueOf(hashSet.size()));
        parselonglambda0.IconCompatParcelizer("%d unique converted android locations", Integer.valueOf(getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.serializer(arrayList)));
        int i = 0;
        if (location != null) {
            parselonglambda0.IconCompatParcelizer("Adding the proceeding stationary location", new Object[0]);
            if (!arrayList.isEmpty()) {
                parselonglambda0.IconCompatParcelizer("First location coordinates are %.4f, %.4f and timestamp is %d", Double.valueOf(((Location) arrayList.get(0)).getLatitude()), Double.valueOf(((Location) arrayList.get(0)).getLongitude()), Long.valueOf(((Location) arrayList.get(0)).getTime()));
            }
            arrayList.add(location);
            parselonglambda0.IconCompatParcelizer("First location coordinates now are %.4f, %.4f and timestamp is %d", Double.valueOf(((Location) arrayList.get(0)).getLatitude()), Double.valueOf(((Location) arrayList.get(0)).getLongitude()), Long.valueOf(((Location) arrayList.get(0)).getTime()));
        }
        parselonglambda0.IconCompatParcelizer("There are %d unique locations before cleanup", Integer.valueOf(getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.serializer(arrayList)));
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it2 = arrayList2.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Location location2 = (Location) it2.next();
            if (location2.getLatitude() == 0.0d && location2.getLongitude() == 0.0d) {
                it2.remove();
                i2++;
            }
        }
        parselonglambda0.IconCompatParcelizer("Removed %d null islands", Integer.valueOf(i2));
        parselonglambda0.IconCompatParcelizer("There are %d unique locations after null island removal", Integer.valueOf(getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.serializer(arrayList2)));
        ArrayList arrayList3 = new ArrayList(arrayList2);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Location location3 = (Location) it3.next();
            if (!location3.hasAccuracy() || location3.getAccuracy() < 0.0f || location3.getAccuracy() > 100.0f) {
                it3.remove();
                i++;
            }
        }
        parselonglambda0.IconCompatParcelizer("Removed %d inaccurate locations", Integer.valueOf(i));
        parselonglambda0.IconCompatParcelizer("There are %d unique locations after inaccurate location removal", Integer.valueOf(getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.serializer(arrayList3)));
        int size = arrayList3.size();
        this.IconCompatParcelizer.getClass();
        List<Location> list = _set_isDismissed_lambda0.read(arrayList3);
        parselonglambda0.IconCompatParcelizer("Removed %d speed-based outliers", Integer.valueOf(size - list.size()));
        parselonglambda0.IconCompatParcelizer("There are %d unique locations after speed-based outlier removal", Integer.valueOf(getDEFAULT_PUSH_DELIVERY_MIN_FLUSHandroid_sdk_base_releaseannotations.serializer(list)));
        return list;
    }
}
