package o;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.android.gms.net.zza;
import com.huawei.hmf.tasks.a.i$d;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ClipScrollableContainerKt implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ CombinedClickableNodehandleDownEvent2 IconCompatParcelizer;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2 = this.IconCompatParcelizer;
        combinedClickableNodehandleDownEvent2.MediaSessionCompatResultReceiverWrapper = null;
        onDrawBehind ondrawbehind = combinedClickableNodehandleDownEvent2.MediaSessionCompatQueueItem;
        if (ondrawbehind == null) {
            setInflatedId.IconCompatParcelizer(3, "TextureViewImpl");
            return true;
        }
        i$d i_d = new i$d(this, 8, surfaceTexture);
        ondrawbehind.RemoteActionCompatParcelizer(new zza(ondrawbehind, 1, i_d), combinedClickableNodehandleDownEvent2.ParcelableVolumeInfo.getContext().getMainExecutor());
        combinedClickableNodehandleDownEvent2.write = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.IconCompatParcelizer.MediaBrowserCompatMediaItem.getAndSet(null);
        if (ondrawwithcontent != null) {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
        }
    }

    public ClipScrollableContainerKt(CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2) {
        this.IconCompatParcelizer = combinedClickableNodehandleDownEvent2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        setInflatedId.IconCompatParcelizer(3, "TextureViewImpl");
        CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2 = this.IconCompatParcelizer;
        combinedClickableNodehandleDownEvent2.MediaSessionCompatResultReceiverWrapper = surfaceTexture;
        if (combinedClickableNodehandleDownEvent2.MediaSessionCompatQueueItem != null) {
            combinedClickableNodehandleDownEvent2.MediaDescriptionCompat.getClass();
            Objects.toString(combinedClickableNodehandleDownEvent2.MediaDescriptionCompat);
            setInflatedId.IconCompatParcelizer(3, "TextureViewImpl");
            combinedClickableNodehandleDownEvent2.MediaDescriptionCompat.write.write();
            return;
        }
        combinedClickableNodehandleDownEvent2.MediaDescriptionCompat();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        setInflatedId.IconCompatParcelizer(3, "TextureViewImpl");
    }
}
