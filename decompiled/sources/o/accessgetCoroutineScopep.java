package o;

import java.io.InputStream;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetCoroutineScopep {
    public static final java.util.logging.Logger serializer = java.util.logging.Logger.getLogger(accessgetCoroutineScopep.class.getName());

    public static InputStream read(String str) {
        InputStream resourceAsStream = accessgetCoroutineScopep.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            serializer.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
