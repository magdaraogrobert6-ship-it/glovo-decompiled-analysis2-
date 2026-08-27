package o;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww implements Comparable<r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww> {
    private final File RemoteActionCompatParcelizer;
    private final long write;

    @Override // java.lang.Comparable
    public final int compareTo(r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww r8lambda1wtxnoe4juwh2snwjj1mrn0rlww) {
        return Long.compare(this.write, r8lambda1wtxnoe4juwh2snwjj1mrn0rlww.write);
    }

    public final int hashCode() {
        long j = this.write;
        return (int) (j ^ (j >>> 32));
    }

    public r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww(File file) {
        this.RemoteActionCompatParcelizer = file;
        this.write = file.lastModified();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww.class == obj.getClass() && this.write == ((r8lambda1wTXnoE4juwH2SNwjj1mRN0rlww) obj).write;
    }
}
