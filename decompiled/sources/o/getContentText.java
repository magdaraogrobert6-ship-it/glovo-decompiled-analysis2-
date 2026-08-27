package o;

import com.sentiance.sdk.InjectUsing;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "JVMExceptionHandler")
public class getContentText {
    private static final ThreadLocal<Boolean> RemoteActionCompatParcelizer = new ThreadLocal<>();
    private final getVerticalAccuracy IconCompatParcelizer;
    private Thread.UncaughtExceptionHandler MediaDescriptionCompat;
    private boolean MediaSessionCompatQueueItem;
    private final getCooldownEnterSeconds read;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI serializer;
    private final parseLonglambda0 write;
    private final CopyOnWriteArrayList<r8lambdaVml774X4gjiH7QFyyZqBCMSepGQ> MediaMetadataCompat = new CopyOnWriteArrayList<>();
    private final getCampaignId MediaBrowserCompatMediaItem = new getCampaignId(this);

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            if (!this.MediaSessionCompatQueueItem) {
                this.MediaSessionCompatQueueItem = true;
                this.MediaDescriptionCompat = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(this.MediaBrowserCompatMediaItem);
            }
        }
    }

    public final void serializer() {
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem) {
                this.MediaSessionCompatQueueItem = false;
                if (Thread.getDefaultUncaughtExceptionHandler() == this.MediaBrowserCompatMediaItem) {
                    Thread.setDefaultUncaughtExceptionHandler(this.MediaDescriptionCompat);
                }
            }
        }
    }

    public final void serializer(r8lambdaVml774X4gjiH7QFyyZqBCMSepGQ r8lambdavml774x4gjih7qfyyzqbcmsepgq) {
        CopyOnWriteArrayList<r8lambdaVml774X4gjiH7QFyyZqBCMSepGQ> copyOnWriteArrayList = this.MediaMetadataCompat;
        if (copyOnWriteArrayList.contains(r8lambdavml774x4gjih7qfyyzqbcmsepgq)) {
            return;
        }
        copyOnWriteArrayList.add(r8lambdavml774x4gjih7qfyyzqbcmsepgq);
    }

    public getContentText(parseLonglambda0 parselonglambda0, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, getVerticalAccuracy getverticalaccuracy) {
        this.write = parselonglambda0;
        this.IconCompatParcelizer = getverticalaccuracy;
        this.read = getcooldownenterseconds;
        this.serializer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public final void write(r8lambdaVml774X4gjiH7QFyyZqBCMSepGQ r8lambdavml774x4gjih7qfyyzqbcmsepgq) {
        this.MediaMetadataCompat.remove(r8lambdavml774x4gjih7qfyyzqbcmsepgq);
    }
}
