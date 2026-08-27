package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetButtonXcp extends accessgetDcp {
    public accessgetButtonR1cp RemoteActionCompatParcelizer;

    public final accessgetButtonXcp read(accessgetButtonR1cp accessgetbuttonr1cp) {
        this.RemoteActionCompatParcelizer = accessgetbuttonr1cp;
        return this;
    }

    public final accessgetButtonSelectcp read() {
        return new accessgetButtonSelectcp(this.RemoteActionCompatParcelizer);
    }
}
