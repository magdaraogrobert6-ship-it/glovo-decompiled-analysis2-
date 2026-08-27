package o;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class getBigTitleText implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.getName().endsWith(".dmp");
    }
}
