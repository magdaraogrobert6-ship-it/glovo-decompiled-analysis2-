package o;

import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class move {
    public final List IconCompatParcelizer;
    public final /* synthetic */ PrefetchHandleProvider$HandleAndRequestImpl MediaMetadataCompat;
    public boolean RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public final List[] write;

    public move(PrefetchHandleProvider$HandleAndRequestImpl prefetchHandleProvider$HandleAndRequestImpl, List list) {
        this.MediaMetadataCompat = prefetchHandleProvider$HandleAndRequestImpl;
        this.IconCompatParcelizer = list;
        this.write = new List[list.size()];
        if (list.isEmpty()) {
            TriStateCheckbox.read("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
