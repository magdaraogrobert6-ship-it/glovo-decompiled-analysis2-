package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetRecreateDisplayListcp {
    public final String IconCompatParcelizer;
    public final int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public accessgetRecreateDisplayListcp(int i, String str, String str2, String str3, String str4, String str5) {
        this.MediaSessionCompatQueueItem = 0;
        this.serializer = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.read = str5;
        this.MediaMetadataCompat = i;
        if (str != null) {
            this.MediaSessionCompatQueueItem = str.length() / 2;
        }
    }
}
