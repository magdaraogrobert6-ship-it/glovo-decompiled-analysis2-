package o;

import java.nio.charset.Charset;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageHtmlBaseView {
    public final String mediaType;
    public final String[] parameterNamesAndValues;
    public final String subtype;
    public final String type;
    public static final getInAppMessageEventMap TYPE_SUBTYPE = new getInAppMessageEventMap("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final getInAppMessageEventMap PARAMETER = new getInAppMessageEventMap(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public final String toString() {
        return this.mediaType;
    }

    public final int hashCode() {
        return this.mediaType.hashCode();
    }

    public final Charset serializer(Charset charset) {
        String str;
        String[] strArr = this.parameterNamesAndValues;
        int i = 0;
        int i2 = TuplesKt.read(0, strArr.length - 1, 2);
        if (i2 < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!setCarryoverInAppMessage.serializer(strArr[i], "charset", true)) {
                if (i == i2) {
                    str = null;
                    break;
                }
                i += 2;
            } else {
                str = strArr[i + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public InAppMessageHtmlBaseView(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InAppMessageHtmlBaseView)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((InAppMessageHtmlBaseView) obj).mediaType, this.mediaType}, getCieXyz.write())).booleanValue();
    }
}
