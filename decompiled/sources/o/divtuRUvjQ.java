package o;

/* JADX INFO: loaded from: classes.dex */
public final class divtuRUvjQ {
    public int IconCompatParcelizer;
    public int RatingCompat = 1;
    public final plusMKHz9U RemoteActionCompatParcelizer;
    public int read;
    public plusMKHz9U serializer;
    public plusMKHz9U write;

    public final void write() {
        this.RatingCompat = 1;
        this.write = this.RemoteActionCompatParcelizer;
        this.read = 0;
    }

    public final boolean IconCompatParcelizer() {
        OffsetCompanion offsetCompanion = this.write.write.read();
        int iRemoteActionCompatParcelizer = offsetCompanion.RemoteActionCompatParcelizer(6);
        return !(iRemoteActionCompatParcelizer == 0 || offsetCompanion.write.get(iRemoteActionCompatParcelizer + offsetCompanion.read) == 0) || this.IconCompatParcelizer == 65039;
    }

    public divtuRUvjQ(plusMKHz9U plusmkhz9u) {
        this.RemoteActionCompatParcelizer = plusmkhz9u;
        this.write = plusmkhz9u;
    }
}
