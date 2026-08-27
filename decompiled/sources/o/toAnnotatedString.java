package o;

import com.mapbox.common.HttpHeaders;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class toAnnotatedString {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final HashMap RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    public final Map IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        HashMap map = this.RemoteActionCompatParcelizer;
        int i5 = i3 + 99;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return map;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 51;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.IconCompatParcelizer;
        int i4 = i3 + 105;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final String RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 97;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = this.serializer;
        int i5 = i2 + 101;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public toAnnotatedString(String str, String str2, String str3, HashMap map) {
        str.getClass();
        str3.getClass();
        this.serializer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.RemoteActionCompatParcelizer = map;
    }

    public final boolean RatingCompat() {
        String str;
        boolean z;
        int i = 2 % 2;
        int i2 = write + 13;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            str = this.read;
            z = false;
        } else {
            str = this.read;
            z = true;
        }
        boolean zSerializer = setCarryoverInAppMessage.serializer(str, "HTTP/1.1", z);
        int i3 = write + 83;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zSerializer;
    }

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String str = (String) this.RemoteActionCompatParcelizer.get("connection");
        if (str == null) {
            return false;
        }
        int i4 = MediaDescriptionCompat + 47;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "close", true)) {
            return false;
        }
        int i6 = MediaDescriptionCompat + 9;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return true;
    }

    public final boolean MediaMetadataCompat() {
        int i = 2 % 2;
        HashMap map = this.RemoteActionCompatParcelizer;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{map.get("sec-fetch-dest"), "document"}, getCieXyz.write())).booleanValue()) {
            int i2 = MediaDescriptionCompat + 67;
            write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = (String) map.get(HttpHeaders.ACCEPT);
            if (str == null || !hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) "text/html", true)) {
                int i3 = write + 109;
                MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
        }
        return true;
    }

    public final boolean read() {
        Long lParcelableVolumeInfo;
        int i = 2 % 2;
        int i2 = write + 97;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        HashMap map = this.RemoteActionCompatParcelizer;
        if (map.get("transfer-encoding") != null) {
            return true;
        }
        int i4 = write + 67;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            String str = (String) map.get("content-length");
            return ((str == null || (lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(str)) == null) ? 0L : lParcelableVolumeInfo.longValue()) > 0;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0093  */
    /* JADX WARN: Code duplicated, block: B:22:0x009e  */
    public final String write() {
        List<String> listRemoteActionCompatParcelizer;
        int i;
        String string;
        int i2 = 2 % 2;
        String str = (String) this.RemoteActionCompatParcelizer.get("cookie");
        if (str != null) {
            int i3 = write + 65;
            MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                char[] cArr = new char[0];
                cArr[1] = ';';
                listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str, cArr);
            } else {
                listRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(str, new char[]{';'});
            }
            for (String str2 : listRemoteActionCompatParcelizer) {
                int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str2, '=', 0, false, 6);
                if (iWrite <= 0) {
                    i = MediaDescriptionCompat + 73;
                    write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i4 = 3 / 3;
                    }
                    string = null;
                } else {
                    String string2 = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2.substring(0, iWrite)).toString();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{string2, "auth"}, getCieXyz.write())).booleanValue()) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str2.substring(iWrite + 1)).toString();
                    } else {
                        i = MediaDescriptionCompat + 73;
                        write = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i % 2 != 0) {
                            int i5 = 3 / 3;
                        }
                        string = null;
                    }
                }
                if (string != null) {
                    int i6 = write + 85;
                    MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        return string;
                    }
                    throw null;
                }
            }
        }
        return null;
    }
}
