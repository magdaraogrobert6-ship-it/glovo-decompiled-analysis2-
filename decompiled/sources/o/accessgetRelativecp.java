package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.io.BufferedOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetRelativecp {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Map serializer;

    public accessgetRelativecp() {
        Map mapSingletonMap = Collections.singletonMap("X-Content-Type-Options", "nosniff");
        mapSingletonMap.getClass();
        this.serializer = mapSingletonMap;
    }

    public accessgetRelativecp(generateOetflambda0 generateoetflambda0) {
        this.serializer = Collections.unmodifiableMap(new HashMap(generateoetflambda0.serializer));
    }

    public void serializer(BufferedOutputStream bufferedOutputStream, int i, String str, String str2, long j, String str3, boolean z, String str4, String str5) {
        String str6;
        int i2 = 2 % 2;
        str2.getClass();
        StringBuilder sb = new StringBuilder("HTTP/1.1 ");
        sb.append(i);
        sb.append(' ');
        sb.append(str);
        af$$ExternalSyntheticOutline0.m(sb, "\r\nContent-Type: ", str2, "\r\nContent-Length: ");
        sb.append(j);
        sb.append("\r\nConnection: ");
        Object obj = null;
        if (z) {
            int i3 = write + 67;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str6 = "keep-alive";
        } else {
            str6 = "close";
        }
        c8$$ExternalSyntheticOutline0.m(sb, str6, "\r\nCache-Control: ", str4, "\r\n");
        for (Map.Entry entry : this.serializer.entrySet()) {
            c8$$ExternalSyntheticOutline0.m(sb, (String) entry.getKey(), ": ", (String) entry.getValue(), "\r\n");
        }
        if (str3 != null) {
            af$$ExternalSyntheticOutline0.m(sb, "ETag: \"", str3, "\"\r\n");
        }
        if (str5 != null) {
            int i4 = write + 7;
            IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                af$$ExternalSyntheticOutline0.m(sb, "Allow: ", str5, "\r\n");
                obj.hashCode();
                throw null;
            }
            af$$ExternalSyntheticOutline0.m(sb, "Allow: ", str5, "\r\n");
        }
        sb.append("\r\n");
        byte[] bytes = sb.toString().getBytes(ensureSubscribedToInAppMessageEvents.IconCompatParcelizer);
        bytes.getClass();
        bufferedOutputStream.write(bytes);
    }
}
