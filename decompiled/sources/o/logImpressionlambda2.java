package o;

import android.os.Process;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class logImpressionlambda2 extends getViewedannotations<setConfiguredCustomEndpointandroid_sdk_base_release> {
    public static int serializer;
    public static int write;
    final /* synthetic */ getOpenUriInWebViewannotations IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logImpressionlambda2(getOpenUriInWebViewannotations getopenuriinwebviewannotations, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(getopenuriinwebviewannotations, readandroid_sdk_base_releaseVar);
        this.IconCompatParcelizer = getopenuriinwebviewannotations;
    }

    @Override // o.getViewedannotations
    public final List<getImageStyle> serializer(getLongitudeannotations<setConfiguredCustomEndpointandroid_sdk_base_release> getlongitudeannotations) {
        return this.IconCompatParcelizer.PlaybackStateCompat.RemoteActionCompatParcelizer(getlongitudeannotations);
    }

    public static int read() {
        int i = serializer;
        int i2 = i % 8062350;
        serializer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        write = startUptimeMillis;
        return startUptimeMillis;
    }
}
