package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdamrRUyRDhX_6xLfo9jIAfF753450 {
    public r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaMkSjJB1nMG37oUW_yupQha4 MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public int RatingCompat;
    public final ArrayList RemoteActionCompatParcelizer;
    public final long[] read;
    public final String serializer;
    public final ArrayList write;

    public final r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0 RemoteActionCompatParcelizer() {
        TimeZone timeZone = setWebViewContent.RemoteActionCompatParcelizer;
        if (!this.MediaSessionCompatQueueItem) {
            return null;
        }
        r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4 = this.MediaDescriptionCompat;
        if (!r8lambdamksjjb1nmg37ouw_yupqha4.civilizedFileSystem && (this.IconCompatParcelizer != null || this.MediaMetadataCompat)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.read.clone();
        for (int i = 0; i < 2; i++) {
            try {
                ItemSingleChoiceBinding itemSingleChoiceBindingMediaSessionCompatToken = r8lambdamksjjb1nmg37ouw_yupqha4.fileSystem.MediaSessionCompatToken((RecyclableBufferedInputStream) this.write.get(i));
                if (!r8lambdamksjjb1nmg37ouw_yupqha4.civilizedFileSystem) {
                    this.RatingCompat++;
                    itemSingleChoiceBindingMediaSessionCompatToken = new r8lambda4XlFVJBS8Q1qgQYlLpTNMsA1YjE(itemSingleChoiceBindingMediaSessionCompatToken, r8lambdamksjjb1nmg37ouw_yupqha4, this);
                }
                arrayList.add(itemSingleChoiceBindingMediaSessionCompatToken);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InAppMessageHtmlBaseViewCompanion.IconCompatParcelizer((ItemSingleChoiceBinding) it.next());
                }
                try {
                    r8lambdamksjjb1nmg37ouw_yupqha4.IconCompatParcelizer(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }
        return new r8lambda0yxD5DkGhVMG1YCzKpa6a1a1ps0(this.MediaDescriptionCompat, this.serializer, this.MediaBrowserCompatMediaItem, arrayList, jArr);
    }

    public r8lambdamrRUyRDhX_6xLfo9jIAfF753450(r8lambdaMkSjJB1nMG37oUW_yupQha4 r8lambdamksjjb1nmg37ouw_yupqha4, String str) {
        str.getClass();
        this.MediaDescriptionCompat = r8lambdamksjjb1nmg37ouw_yupqha4;
        this.serializer = str;
        r8lambdamksjjb1nmg37ouw_yupqha4.getClass();
        this.read = new long[2];
        this.write = new ArrayList();
        this.RemoteActionCompatParcelizer = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.write.add(this.MediaDescriptionCompat.directory.write(sb.toString()));
            sb.append(".tmp");
            this.RemoteActionCompatParcelizer.add(this.MediaDescriptionCompat.directory.write(sb.toString()));
            sb.setLength(length);
        }
    }
}
