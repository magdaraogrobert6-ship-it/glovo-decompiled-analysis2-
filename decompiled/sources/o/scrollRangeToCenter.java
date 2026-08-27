package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class scrollRangeToCenter {
    public static void serializer(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                scrollTo.read("IOUtil", "closeSecure IOException");
            }
        }
    }
}
