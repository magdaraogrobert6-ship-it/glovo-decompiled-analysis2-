package o;

import android.os.Looper;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.logic.zp;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class getPrompt extends androidx.lifecycle.ViewModel {
    public AndroidGraphicsContext2 IconCompatParcelizer;
    public AndroidGraphicsContext2 MediaBrowserCompatMediaItem;
    public i$d MediaDescriptionCompat;
    public Executor MediaMetadataCompat;
    public getPopupContext MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public AndroidGraphicsContext2 ParcelableVolumeInfo;
    public AndroidGraphicsContext2 PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public convertToIndirectPointerEventk92h6UUui RatingCompat;
    public colorResource RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public AndroidGraphicsContext2 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public AndroidGraphicsContext2 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public String r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public getButtonSelectEK5gGoQ r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public zp r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public AndroidGraphicsContext2 read;
    public AndroidGraphicsContext2 serializer;
    public int write = 0;
    public boolean ComponentActivity = true;

    public static void IconCompatParcelizer(AndroidGraphicsContext2 androidGraphicsContext2, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            androidGraphicsContext2.RemoteActionCompatParcelizer(obj);
        } else {
            androidGraphicsContext2.serializer(obj);
        }
    }

    public final int write() {
        zp zpVar = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (zpVar == null) {
            return 0;
        }
        getPopupContext getpopupcontext = this.MediaSessionCompatQueueItem;
        int i = zpVar.write;
        if (i != 0) {
            return i;
        }
        return getpopupcontext != null ? 15 : 255;
    }

    public final void read(hasOverlappingRendering hasoverlappingrendering) {
        if (this.read == null) {
            this.read = new AndroidGraphicsContext2();
        }
        IconCompatParcelizer(this.read, hasoverlappingrendering);
    }

    public final void write(boolean z) {
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new AndroidGraphicsContext2();
        }
        IconCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, Boolean.valueOf(z));
    }
}
