package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonStartcp extends accessgetCopycp {
    public Integer read;

    public final accessgetButtonStartcp write(Integer num) {
        this.read = num;
        return this;
    }

    public final accessgetButtonR1cp RemoteActionCompatParcelizer() {
        return new accessgetButtonR1cp(this.read);
    }
}
