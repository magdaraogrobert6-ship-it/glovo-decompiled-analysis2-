package o;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetGpucp {
    public static androidx.work.impl.WorkDatabase write(Context context, Executor executor, graphicsLayersKFY_QEdefault graphicslayerskfy_qedefault, boolean z) {
        clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer;
        context.getClass();
        executor.getClass();
        graphicslayerskfy_qedefault.getClass();
        if (z) {
            cliprectmtrddeRemoteActionCompatParcelizer = new clipRectmtrdDE(context, androidx.work.impl.WorkDatabase.class, null);
            cliprectmtrddeRemoteActionCompatParcelizer.read = true;
        } else {
            cliprectmtrddeRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(context, androidx.work.impl.WorkDatabase.class, "androidx.work.workdb");
            cliprectmtrddeRemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new getAlpha8_sVssgQ(context, 0);
        }
        cliprectmtrddeRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper = executor;
        cliprectmtrddeRemoteActionCompatParcelizer.MediaSessionCompatQueueItem.add(new GraphicsLayerScopeKt(graphicslayerskfy_qedefault));
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.read);
        cliprectmtrddeRemoteActionCompatParcelizer.write(new toPixelMapdefault(context, 2, 3));
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.MediaDescriptionCompat);
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.RatingCompat);
        cliprectmtrddeRemoteActionCompatParcelizer.write(new toPixelMapdefault(context, 5, 6));
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.MediaBrowserCompatMediaItem);
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.MediaSessionCompatToken);
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.MediaSessionCompatResultReceiverWrapper);
        cliprectmtrddeRemoteActionCompatParcelizer.write(new toPixelMapdefault(context));
        cliprectmtrddeRemoteActionCompatParcelizer.write(new toPixelMapdefault(context, 10, 11));
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.write);
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.IconCompatParcelizer);
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.MediaMetadataCompat);
        cliprectmtrddeRemoteActionCompatParcelizer.write(readPixelsdefault.MediaSessionCompatQueueItem);
        cliprectmtrddeRemoteActionCompatParcelizer.write(new toPixelMapdefault(context, 21, 22));
        cliprectmtrddeRemoteActionCompatParcelizer.ComponentActivity = false;
        cliprectmtrddeRemoteActionCompatParcelizer.IconCompatParcelizer = true;
        cliprectmtrddeRemoteActionCompatParcelizer.serializer = true;
        return (androidx.work.impl.WorkDatabase) cliprectmtrddeRemoteActionCompatParcelizer.write();
    }
}
