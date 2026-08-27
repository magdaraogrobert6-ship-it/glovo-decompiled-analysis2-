package o;

import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class getLocationManagerandroid_sdk_location_release {
    private final GooglePlayLocationUtils IconCompatParcelizer;
    private final getLastKnownGpsLocationIfValidlambda0 serializer;

    public final r8lambda4gSAWW0UF5Fhes0li0LYm_jwy38 read(File file, String str) {
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release();
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer(str);
        HashMap map = new HashMap();
        map.put(ConstantKt.USER_AGENT_HEADER, this.IconCompatParcelizer.write());
        String[] strArr = new String[map.size() * 2];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Headers cannot be null");
                return null;
            }
            String strTrim = ((String) entry.getKey()).trim();
            String strTrim2 = ((String) entry.getValue()).trim();
            isEphemeralEventsEnabled.serializer(strTrim);
            isEphemeralEventsEnabled.serializer(strTrim2, strTrim);
            strArr[i] = strTrim;
            strArr[i + 1] = strTrim2;
            i += 2;
        }
        u$a u_a = new u$a(0);
        Collections.addAll(u_a.IconCompatParcelizer, strArr);
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer = u_a;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer("PUT", new getSuitableLocationProvider(file));
        return this.serializer.RemoteActionCompatParcelizer(setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write());
    }

    public getLocationManagerandroid_sdk_location_release(getLastKnownGpsLocationIfValidlambda0 getlastknowngpslocationifvalidlambda0, GooglePlayLocationUtils googlePlayLocationUtils) {
        this.serializer = getlastknowngpslocationifvalidlambda0;
        this.IconCompatParcelizer = googlePlayLocationUtils;
    }
}
