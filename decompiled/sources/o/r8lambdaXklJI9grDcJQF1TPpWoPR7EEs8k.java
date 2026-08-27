package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class r8lambdaXklJI9grDcJQF1TPpWoPR7EEs8k {
    public static final Charset IconCompatParcelizer = Charset.forName("US-ASCII");

    static {
        Charset.forName(com.adjust.sdk.Constants.ENCODING);
    }

    public static void IconCompatParcelizer(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(file, "not a readable directory: ");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                IconCompatParcelizer(file2);
            }
            if (!file2.delete()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(file2, "failed to delete file: ");
                return;
            }
        }
    }
}
