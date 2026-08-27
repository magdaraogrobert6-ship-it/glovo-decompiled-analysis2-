package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public class getFeaturesExpirationTimefwf_client_release {
    public static volatile getFeaturesExpirationTimefwf_client_release write;

    public void IconCompatParcelizer(byte[] bArr) {
    }

    public byte[] IconCompatParcelizer(int i) {
        return new byte[i];
    }

    static {
        getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release = new getFeaturesExpirationTimefwf_client_release();
        String property = System.getProperty("org.tukaani.xz.ArrayCache");
        if (property == null) {
            property = "Dummy";
        }
        if (property.equals("Basic")) {
            write = getSelfHostedUrlfwf_client_release.write;
        } else {
            if (!property.equals("Dummy")) {
                throw new Error(ff$$ExternalSyntheticOutline0.m("Unsupported value '", property, "' in the system property org.tukaani.xz.ArrayCache. Supported values: Dummy, Basic"));
            }
            write = getfeaturesexpirationtimefwf_client_release;
        }
    }
}
