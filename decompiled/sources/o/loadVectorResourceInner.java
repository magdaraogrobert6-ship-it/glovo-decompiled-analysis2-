package o;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public abstract class loadVectorResourceInner {
    public static void IconCompatParcelizer(String str) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = placeAtf8xVGno.read().openFileOutput("ephData", 0);
            try {
                fileOutputStreamOpenFileOutput.write(str.getBytes(StandardCharsets.UTF_8));
                fileOutputStreamOpenFileOutput.close();
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("FileUtil", "save to file failed");
        }
    }
}
