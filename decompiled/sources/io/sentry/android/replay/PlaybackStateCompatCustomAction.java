package io.sentry.android.replay;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompatCustomAction extends Lambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ createInAppMessageEventSubscriber RemoteActionCompatParcelizer;
    public final /* synthetic */ Bitmap write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackStateCompatCustomAction(Bitmap bitmap, createInAppMessageEventSubscriber createinappmessageeventsubscriber) {
        super(2);
        this.write = bitmap;
        this.RemoteActionCompatParcelizer = createinappmessageeventsubscriber;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = (MediaBrowserCompatMediaItem) obj;
        long jLongValue = ((Number) obj2).longValue();
        mediaBrowserCompatMediaItem.getClass();
        Bitmap bitmap = this.write;
        String str = (String) this.RemoteActionCompatParcelizer.IconCompatParcelizer;
        bitmap.getClass();
        if (mediaBrowserCompatMediaItem.IconCompatParcelizer() != null && !bitmap.isRecycled()) {
            File fileIconCompatParcelizer = mediaBrowserCompatMediaItem.IconCompatParcelizer();
            if (fileIconCompatParcelizer != null) {
                fileIconCompatParcelizer.mkdirs();
            }
            File file = new File(mediaBrowserCompatMediaItem.IconCompatParcelizer(), jLongValue + ".jpg");
            file.createNewFile();
            synchronized (bitmap) {
                if (!bitmap.isRecycled()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, mediaBrowserCompatMediaItem.RatingCompat.getSessionReplay().MediaSessionCompatResultReceiverWrapper.screenshotQuality, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        mediaBrowserCompatMediaItem.serializer(file, jLongValue, str);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{fileOutputStream, th}, sourceInformationContextOfdefault.read());
                            throw th2;
                        }
                    }
                }
            }
        }
        return createFromParcel.INSTANCE;
    }
}
