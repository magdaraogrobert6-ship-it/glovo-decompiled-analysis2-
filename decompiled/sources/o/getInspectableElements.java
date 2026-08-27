package o;

import com.google.firebase.crashlytics.internal.common.IdManager;

/* JADX INFO: loaded from: classes2.dex */
public final class getInspectableElements {
    public final String IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final String MediaDescriptionCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final IdManager RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    public getInspectableElements(String str, String str2, String str3, String str4, IdManager idManager, String str5, String str6, String str7, int i) {
        this.read = str;
        this.write = str2;
        this.RatingCompat = str3;
        this.MediaDescriptionCompat = str4;
        this.RemoteActionCompatParcelizer = idManager;
        this.MediaSessionCompatQueueItem = str5;
        this.serializer = str6;
        this.IconCompatParcelizer = str7;
        this.MediaBrowserCompatMediaItem = i;
    }
}
