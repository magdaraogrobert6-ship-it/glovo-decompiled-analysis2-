package o;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class getSourceValueInsetshdzbrEE {
    public final Context read;

    public getSourceValueInsetshdzbrEE(Context context) {
        this.read = context;
    }

    public static long read(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                j += read(file2);
            }
        }
        return j;
    }
}
