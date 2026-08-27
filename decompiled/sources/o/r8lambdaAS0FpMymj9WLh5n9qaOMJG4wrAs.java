package o;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaAS0FpMymj9WLh5n9qaOMJG4wrAs implements DataStoreProviderCompanion, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final parseLonglambda0 IconCompatParcelizer;
    private deleteDataStoreFiles MediaBrowserCompatMediaItem;
    private final ArrayList MediaDescriptionCompat = new ArrayList();
    private boolean MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RatingCompat;
    private final r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw RemoteActionCompatParcelizer;
    private final com.sentiance.sdk.util.c read;
    private final readandroid_sdk_base_release serializer;
    private final DataStoreProvideri write;

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public final boolean write() {
        return this.MediaMetadataCompat;
    }

    private void RemoteActionCompatParcelizer(String str) {
        deleteDataStoreFiles deletedatastorefiles;
        synchronized (this.MediaDescriptionCompat) {
            Iterator it = this.MediaDescriptionCompat.iterator();
            while (it.hasNext()) {
                if (((r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer) it.next()).IconCompatParcelizer().equals(str)) {
                    it.remove();
                    break;
                }
            }
            if (this.MediaDescriptionCompat.isEmpty()) {
                com.sentiance.sdk.util.c cVar = this.read;
                this.RatingCompat.getClass();
                cVar.read(System.currentTimeMillis(), "last_refresh_time");
                deletedatastorefiles = this.MediaBrowserCompatMediaItem;
            } else {
                deletedatastorefiles = null;
            }
        }
        if (deletedatastorefiles != null) {
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(false);
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        List listMediaSessionCompatToken = this.write.MediaSessionCompatToken();
        long jIconCompatParcelizer = this.read.IconCompatParcelizer("last_refresh_time", 0L);
        this.RatingCompat.getClass();
        boolean z = jIconCompatParcelizer + 604800000 > System.currentTimeMillis();
        this.MediaMetadataCompat = z || listMediaSessionCompatToken.isEmpty();
        if (z) {
            this.IconCompatParcelizer.IconCompatParcelizer("Too soon to refresh the tiles.", new Object[0]);
            return false;
        }
        synchronized (this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat.clear();
            Iterator it = listMediaSessionCompatToken.iterator();
            while (it.hasNext()) {
                r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer serializerVar = new r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer(((DataStoreProviderq) it.next()).RemoteActionCompatParcelizer, "", this, this.serializer);
                this.MediaDescriptionCompat.add(serializerVar);
                this.RemoteActionCompatParcelizer.serializer(serializerVar);
            }
        }
        return true;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.read.read();
    }

    public final boolean serializer() {
        ArrayList arrayList;
        synchronized (this.MediaDescriptionCompat) {
            arrayList = new ArrayList(this.MediaDescriptionCompat);
        }
        Collections.reverse(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.RemoteActionCompatParcelizer.read((r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw.serializer) it.next());
        }
        synchronized (this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat.clear();
        }
        return false;
    }

    public r8lambdaAS0FpMymj9WLh5n9qaOMJG4wrAs(parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, r8lambdaUdD4Yj05V3iuQbJEwTce3Mt1rIw r8lambdaudd4yj05v3iuqbjewtce3mt1riw, DataStoreProvideri dataStoreProvideri, com.sentiance.sdk.util.c cVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = cVar;
        this.IconCompatParcelizer = parselonglambda0;
        this.serializer = readandroid_sdk_base_releaseVar;
        this.RemoteActionCompatParcelizer = r8lambdaudd4yj05v3iuqbjewtce3mt1riw;
        this.write = dataStoreProvideri;
        this.RatingCompat = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    @Override // o.DataStoreProviderCompanion
    public final void serializer(String str, String str2) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer("Tile %s not refreshed", str);
        RemoteActionCompatParcelizer(str);
    }

    @Override // o.DataStoreProviderCompanion
    public final void write(String str, String str2) {
        this.IconCompatParcelizer.IconCompatParcelizer("Tile %s refreshed successfully", str);
        RemoteActionCompatParcelizer(str);
    }

    public final void serializer(deleteDataStoreFiles deletedatastorefiles) {
        this.MediaBrowserCompatMediaItem = deletedatastorefiles;
    }
}
