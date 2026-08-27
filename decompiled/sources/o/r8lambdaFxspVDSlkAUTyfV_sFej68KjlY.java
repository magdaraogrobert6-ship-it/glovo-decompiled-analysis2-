package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaFxspVDSlkAUTyfV_sFej68KjlY extends r8lambdaFUdl62ADhPGrEudDmNeD8r1en8 {
    public boolean IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public File[] serializer;
    public boolean write;

    @Override // o.r8lambdaH0T6quLH6fi2CuKlbOttZKYSBc
    public final File read() {
        boolean z = this.write;
        File file = this.MediaDescriptionCompat;
        if (!z && this.serializer == null) {
            File[] fileArrListFiles = file.listFiles();
            this.serializer = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.write = true;
            }
        }
        File[] fileArr = this.serializer;
        if (fileArr == null || this.RemoteActionCompatParcelizer >= fileArr.length) {
            if (this.IconCompatParcelizer) {
                return null;
            }
            this.IconCompatParcelizer = true;
            return file;
        }
        fileArr.getClass();
        int i = this.RemoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = i + 1;
        return fileArr[i];
    }

    public r8lambdaFxspVDSlkAUTyfV_sFej68KjlY(File file) {
        super(file);
    }
}
