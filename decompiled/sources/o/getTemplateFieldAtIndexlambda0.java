package o;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
final class getTemplateFieldAtIndexlambda0 implements FilenameFilter {
    final /* synthetic */ parseObjectAsIntegerlambda1 read;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.contains(this.read.write);
    }

    public getTemplateFieldAtIndexlambda0(parseObjectAsIntegerlambda1 parseobjectasintegerlambda1) {
        this.read = parseobjectasintegerlambda1;
    }
}
