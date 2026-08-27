package o;

import com.sentiance.okhttp3.u$a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class setSessionTimeout {
    public final Map IconCompatParcelizer;
    public volatile setTriggerActionMinimumTimeIntervalSecondsandroid_sdk_base_release MediaBrowserCompatMediaItem;
    public final setShouldOptInWhenPushAuthorizedandroid_sdk_base_release RemoteActionCompatParcelizer;
    public final isEphemeralEventsEnabled read;
    public final String serializer;
    public final isHtmlInAppMessageApplyWindowInsetsEnabled write;

    public final setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release serializer() {
        setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release = new setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release(0);
        Map linkedHashMap = Collections.EMPTY_MAP;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.IconCompatParcelizer = linkedHashMap;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer = this.write;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.read = this.serializer;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write = this.RemoteActionCompatParcelizer;
        Map map = this.IconCompatParcelizer;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.IconCompatParcelizer = linkedHashMap;
        setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer = this.read.read();
        return setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release;
    }

    public setSessionTimeout(setShouldPersistWebViewWhenBackgroundingAppandroid_sdk_base_release setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release) {
        this.write = setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.RemoteActionCompatParcelizer;
        this.serializer = setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.read;
        u$a u_a = setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.serializer;
        u_a.getClass();
        this.read = new isEphemeralEventsEnabled(u_a);
        this.RemoteActionCompatParcelizer = setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.write;
        Map map = setshouldpersistwebviewwhenbackgroundingappandroid_sdk_base_release.IconCompatParcelizer;
        byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.serializer);
        sb.append(", url=");
        sb.append(this.write);
        sb.append(", tags=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.IconCompatParcelizer, '}');
    }
}
