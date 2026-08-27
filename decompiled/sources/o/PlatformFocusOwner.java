package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformFocusOwner {
    protected int RemoteActionCompatParcelizer;

    public abstract int MediaSessionCompatToken();

    public final int RemoteActionCompatParcelizer(toStringAsFixed tostringasfixed) {
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistance = (isBetterCandidate_I7lrPNgminorAxisDistance) this;
        int i = isbettercandidate_i7lrpngminoraxisdistance.read;
        if (i != -1) {
            return i;
        }
        int iRemoteActionCompatParcelizer = tostringasfixed.RemoteActionCompatParcelizer(this);
        isbettercandidate_i7lrpngminoraxisdistance.read = iRemoteActionCompatParcelizer;
        return iRemoteActionCompatParcelizer;
    }

    public abstract void read(RequestChildFocusKt requestChildFocusKt);
}
