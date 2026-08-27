package o;

import android.net.Uri;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class drawPointsGsft0Ws implements drawImage9jGpkUE {
    public static final Set IconCompatParcelizer = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", RemoteMessageConst.Notification.CONTENT, "android.resource")));
    public final drawRectnJ9OG0 read;

    @Override // o.drawImage9jGpkUE
    public final boolean write(Object obj) {
        return IconCompatParcelizer.contains(((Uri) obj).getScheme());
    }

    public drawPointsGsft0Ws(drawRectnJ9OG0 drawrectnj9og0) {
        this.read = drawrectnj9og0;
    }

    @Override // o.drawImage9jGpkUE
    public final drawLine1RTmtNc RemoteActionCompatParcelizer(Object obj, int i, int i2, getEotfFuncui_graphics geteotffuncui_graphics) {
        getPrimaries rgbExternalSyntheticLambda1;
        Uri uri = (Uri) obj;
        translatedefault translatedefaultVar = new translatedefault(uri);
        drawRectnJ9OG0 drawrectnj9og0 = this.read;
        int i3 = drawrectnj9og0.serializer;
        if (i3 != 0) {
            rgbExternalSyntheticLambda1 = i3 != 1 ? new getPrimariesui_graphics(drawrectnj9og0.RemoteActionCompatParcelizer, uri, drawrectnj9og0.read, 0) : new getPrimariesui_graphics(drawrectnj9og0.RemoteActionCompatParcelizer, uri, drawrectnj9og0.read, 1);
        } else {
            rgbExternalSyntheticLambda1 = new RgbExternalSyntheticLambda1(drawrectnj9og0.RemoteActionCompatParcelizer, uri, drawrectnj9og0.read);
        }
        return new drawLine1RTmtNc(translatedefaultVar, rgbExternalSyntheticLambda1);
    }
}
