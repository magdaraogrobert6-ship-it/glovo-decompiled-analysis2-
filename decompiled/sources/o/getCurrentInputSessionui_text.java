package o;

import android.net.Uri;
import java.io.File;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$asRequestBody$1;

/* JADX INFO: loaded from: classes3.dex */
public final class getCurrentInputSessionui_text {
    private static int read = 0;
    private static int write = 1;

    public static r8lambdaCTegLFIY2N5eeYL50pY32CICZRI read(String str) {
        int i = 2 % 2;
        int i2 = write + 19;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            str.getClass();
            Uri.parse(str).getPath();
            obj.hashCode();
            throw null;
        }
        str.getClass();
        String path = Uri.parse(str).getPath();
        if (path != null) {
            str = path;
        }
        File file = new File(str);
        if (!file.exists()) {
            DrawableTransformation.serializer((Object) "Image file does not exist for path: ".concat(str));
            int i3 = write + 33;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return null;
        }
        r8lambdaz90zXC5cr3Ctjy9kweMhZodg3LE r8lambdaz90zxc5cr3ctjy9kwemhzodg3le = RequestBody.Companion;
        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = androidx.sqlite.SQLite.write("image/*");
        r8lambdaz90zxc5cr3ctjy9kwemhzodg3le.getClass();
        r8lambdaCTegLFIY2N5eeYL50pY32CICZRI r8lambdacteglfiy2n5eeyl50py32ciczriRemoteActionCompatParcelizer = RoundRectgG7oq9Y.RemoteActionCompatParcelizer("file", file.getName(), new RequestBody$Companion$asRequestBody$1(inAppMessageHtmlBaseViewWrite, file));
        int i5 = read + 107;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return r8lambdacteglfiy2n5eeyl50py32ciczriRemoteActionCompatParcelizer;
    }
}
