package o;

/* JADX INFO: loaded from: classes4.dex */
public final class ApiExceptionSessionExpiredForbidden {
    public final /* synthetic */ int IconCompatParcelizer;
    public final long read;
    public final long write;

    public ApiExceptionSessionExpiredForbidden(long j, long j2, int i) {
        this.IconCompatParcelizer = 0;
        this.read = j;
        this.write = j2;
    }

    public String toString() {
        int i = this.IconCompatParcelizer;
        long j = this.write;
        long j2 = this.read;
        if (i == 1) {
            return j2 + "/" + j;
        }
        if (i != 3) {
            return super.toString();
        }
        return "BindPair binding input " + j2 + " to output " + j;
    }

    public /* synthetic */ ApiExceptionSessionExpiredForbidden(long j, long j2, int i, byte b) {
        this.IconCompatParcelizer = i;
        this.read = j;
        this.write = j2;
    }
}
