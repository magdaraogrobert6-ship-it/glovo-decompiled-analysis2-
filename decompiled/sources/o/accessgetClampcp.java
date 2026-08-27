package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class accessgetClampcp implements getClamp3opZhB0 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ accessgetMirrorcp RemoteActionCompatParcelizer;

    public /* synthetic */ accessgetClampcp(accessgetMirrorcp accessgetmirrorcp, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = accessgetmirrorcp;
    }

    @Override // o.getClamp3opZhB0
    public final void RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        accessgetMirrorcp accessgetmirrorcp = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            accessgetmirrorcp.read();
        } else {
            accessgetmirrorcp.RatingCompat();
        }
    }
}
