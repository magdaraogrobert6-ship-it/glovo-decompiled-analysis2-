package o;

/* JADX INFO: loaded from: classes2.dex */
public final class getHelpEK5gGoQ extends getFunctionEK5gGoQ {
    public final boolean MediaBrowserCompatMediaItem;
    public final String MediaMetadataCompat;
    public final getFunctionEK5gGoQ MediaSessionCompatQueueItem;
    public static final getHelpEK5gGoQ IconCompatParcelizer = new getHelpEK5gGoQ("BREAK");
    public static final getHelpEK5gGoQ RemoteActionCompatParcelizer = new getHelpEK5gGoQ("CONTINUE");
    public static final getHelpEK5gGoQ serializer = new getHelpEK5gGoQ("NULL");
    public static final getHelpEK5gGoQ read = new getHelpEK5gGoQ("UNDEFINED");

    @Override // o.getFunctionEK5gGoQ
    public final /* synthetic */ Object read() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.getFunctionEK5gGoQ
    public final String toString() {
        return this.MediaMetadataCompat;
    }

    public getHelpEK5gGoQ(getFunctionEK5gGoQ getfunctionek5ggoq) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getfunctionek5ggoq);
        this.MediaMetadataCompat = "RETURN";
        this.MediaBrowserCompatMediaItem = true;
        this.MediaSessionCompatQueueItem = getfunctionek5ggoq;
    }

    public getHelpEK5gGoQ(String str) {
        this.MediaMetadataCompat = str;
        this.MediaBrowserCompatMediaItem = false;
        this.MediaSessionCompatQueueItem = null;
    }
}
