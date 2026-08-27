package o;

import android.location.Location;
import com.sentiance.sdk.InjectUsing;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ForcedDwellLocCalc")
public class getShouldRefreshFeatureFlags {
    private final getCooldownEnterSeconds IconCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final component4android_sdk_base_release read;
    private final getVerticalAccuracy serializer;
    private final parseLonglambda0 write;

    public final Location read(setConfigurationProvider setconfigurationprovider) {
        r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU r8lambdaibd0azdffjr6m_pevs2l1iejku;
        ArrayList arrayList = new ArrayList();
        this.RemoteActionCompatParcelizer.getClass();
        List<getCooldownEnterSeconds.read> listRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(r8lambdaIbD0AzDFFJr6M_Pevs2L1IejKU.class, Long.valueOf(System.currentTimeMillis() - 300000), null, false, false);
        if (!listRemoteActionCompatParcelizer.isEmpty()) {
            Iterator<getCooldownEnterSeconds.read> it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                r8lambdaQtf70aJ7a5O7B4Yj33reyeLsU r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer(this.read);
                if (r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer != null && (r8lambdaibd0azdffjr6m_pevs2l1iejku = r8lambdaqtf70aj7a5o7b4yj33reyelsuRemoteActionCompatParcelizer.serializer.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) != null) {
                    BrazeCompanionExternalSyntheticLambda4 brazeCompanionExternalSyntheticLambda4 = r8lambdaibd0azdffjr6m_pevs2l1iejku.RemoteActionCompatParcelizer;
                    this.serializer.getClass();
                    Location locationWrite = getVerticalAccuracy.write(brazeCompanionExternalSyntheticLambda4);
                    if (locationWrite.hasAccuracy() && locationWrite.getAccuracy() < 50.0f) {
                        arrayList.add(locationWrite);
                    }
                }
            }
        }
        Location locationSerializer = setconfigurationprovider.serializer();
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (((Location) it2.next()).distanceTo(locationSerializer) < setconfigurationprovider.RemoteActionCompatParcelizer) {
                i++;
            }
        }
        boolean z = i == arrayList.size();
        boolean z2 = i >= 3;
        Location location = (Location) (!arrayList.isEmpty() ? arrayList.get(0) : null);
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.reverse(arrayList2);
        Location location2 = (Location) (!arrayList2.isEmpty() ? arrayList2.get(0) : null);
        boolean z3 = (location == null || location2 == null || location2.getTime() - location.getTime() < 180000) ? false : true;
        if (!z || !z2 || !z3) {
            return null;
        }
        parseLonglambda0 parselonglambda0 = this.write;
        parselonglambda0.IconCompatParcelizer("There are enough accurate fixes to force a dwell", new Object[0]);
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.reverse(arrayList3);
        Location location3 = (Location) (arrayList3.isEmpty() ? null : arrayList3.get(0));
        if (location3 != null) {
            parselonglambda0.IconCompatParcelizer("Returning last location fix as dwell location", new Object[0]);
            return location3;
        }
        parselonglambda0.IconCompatParcelizer("Returning the geofence center as the dwell location", new Object[0]);
        return setconfigurationprovider.serializer();
    }

    public getShouldRefreshFeatureFlags(parseLonglambda0 parselonglambda0, getVerticalAccuracy getverticalaccuracy, component4android_sdk_base_release component4android_sdk_base_releaseVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getCooldownEnterSeconds getcooldownenterseconds) {
        this.write = parselonglambda0;
        this.serializer = getverticalaccuracy;
        this.read = component4android_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = getcooldownenterseconds;
    }
}
