package bo.app;

import com.adjust.sdk.Constants;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class mh {
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        Charset.forName(Constants.ENCODING);
    }

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(file, "not a readable directory: ");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
