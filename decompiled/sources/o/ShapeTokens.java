package o;

import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider$HandleAndRequestImpl;
import coil3.disk.DiskLruCache$Editor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeTokens {
    public final int IconCompatParcelizer;
    public final /* synthetic */ RadioButtonTokens RemoteActionCompatParcelizer;
    public final ArrayList write = new ArrayList();

    public final void read(int i) {
        RadioButtonTokens radioButtonTokens = this.RemoteActionCompatParcelizer;
        DiskLruCache$Editor diskLruCache$Editor = radioButtonTokens.IconCompatParcelizer;
        if (diskLruCache$Editor == null) {
            return;
        }
        this.write.add(new PrefetchHandleProvider$HandleAndRequestImpl(diskLruCache$Editor, i, radioButtonTokens.RemoteActionCompatParcelizer, null));
    }

    public ShapeTokens(RadioButtonTokens radioButtonTokens, int i) {
        this.RemoteActionCompatParcelizer = radioButtonTokens;
        this.IconCompatParcelizer = i;
    }
}
