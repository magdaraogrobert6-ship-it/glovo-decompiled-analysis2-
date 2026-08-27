package o;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class getActionButtons implements Comparator<File> {
    @Override // java.util.Comparator
    public final int compare(File file, File file2) {
        long jLastModified = file.lastModified() - file2.lastModified();
        if (jLastModified < 0) {
            return -1;
        }
        return jLastModified > 0 ? 1 : 0;
    }
}
