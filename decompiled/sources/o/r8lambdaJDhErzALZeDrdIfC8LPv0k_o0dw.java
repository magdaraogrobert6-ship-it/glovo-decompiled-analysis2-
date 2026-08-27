package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaJDhErzALZeDrdIfC8LPv0k_o0dw extends r8lambdaFUdl62ADhPGrEudDmNeD8r1en8 {
    public int read;
    public boolean serializer;
    public File[] write;

    @Override // o.r8lambdaH0T6quLH6fi2CuKlbOttZKYSBc
    public final File read() {
        boolean z = this.serializer;
        File file = this.MediaDescriptionCompat;
        if (!z) {
            this.serializer = true;
            return file;
        }
        File[] fileArr = this.write;
        if (fileArr != null && this.read >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.write = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.write;
        fileArr2.getClass();
        int i = this.read;
        this.read = i + 1;
        return fileArr2[i];
    }

    public r8lambdaJDhErzALZeDrdIfC8LPv0k_o0dw(File file) {
        super(file);
    }
}
