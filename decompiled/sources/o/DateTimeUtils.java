package o;

/* JADX INFO: loaded from: classes4.dex */
public final class DateTimeUtils extends toBitsimpl {
    public boolean RemoteActionCompatParcelizer;
    public final brazeLogTag read;
    public int serializer;

    public DateTimeUtils(brazeLogTag brazelogtag) {
        this.read = brazelogtag;
    }

    @Override // o.toBitsimpl
    public final void RemoteActionCompatParcelizer(int i) {
        if (this.RemoteActionCompatParcelizer) {
            this.read.invoke(Integer.valueOf(i));
            this.RemoteActionCompatParcelizer = false;
        }
    }

    @Override // o.toBitsimpl
    public final void serializer(int i) {
        if (this.serializer == 1 && i == 2) {
            this.RemoteActionCompatParcelizer = true;
        } else if (i == 0) {
            this.RemoteActionCompatParcelizer = false;
        }
        this.serializer = i;
    }
}
