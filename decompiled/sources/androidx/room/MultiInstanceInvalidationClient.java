package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.lifecycle.BlockRunner$cancel$1;
import coil3.util.ContextsKt;
import com.huawei.hmf.tasks.a.i$d;
import com.roadrunner.auth.data.SignInDataStore$get$$inlined$map$1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.BrushKtShaderBrush1;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.clipRectmtrdDEdefault;
import o.getContentViewGroupParentLayout;
import o.lerpSafeWko1d7g;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.toShaderBrush;

/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationClient {
    public final BrushKtShaderBrush1 IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final InvalidationTracker MediaDescriptionCompat;
    public final i$d MediaMetadataCompat;
    public final lerpSafeWko1d7g MediaSessionCompatQueueItem;
    public final AtomicBoolean PlaybackStateCompatCustomAction;
    public toShaderBrush RatingCompat;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final Context read;
    public final SharedFlowImpl serializer;
    public int write;

    public final void serializer() {
        if (this.PlaybackStateCompatCustomAction.compareAndSet(false, true)) {
            i$d i_d = this.MediaMetadataCompat;
            i_d.getClass();
            InvalidationTracker invalidationTracker = this.MediaDescriptionCompat;
            ReentrantLock reentrantLock = invalidationTracker.MediaDescriptionCompat;
            reentrantLock.lock();
            try {
                clipRectmtrdDEdefault cliprectmtrddedefault = (clipRectmtrdDEdefault) invalidationTracker.serializer.remove(i_d);
                reentrantLock.unlock();
                if (cliprectmtrddedefault != null) {
                    TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.write;
                    int[] iArr = cliprectmtrddedefault.serializer;
                    triggerBasedInvalidationTracker.getClass();
                    iArr.getClass();
                    if (triggerBasedInvalidationTracker.write.serializer(iArr)) {
                        ContextsKt.RemoteActionCompatParcelizer(new BlockRunner$cancel$1(invalidationTracker, (ShortNewsContentCardView) null, 15));
                    }
                }
                try {
                    toShaderBrush toshaderbrush = this.RatingCompat;
                    if (toshaderbrush != null) {
                        toshaderbrush.write(this.IconCompatParcelizer, this.write);
                    }
                } catch (RemoteException e) {
                    SentryLogcatAdapter.write("ROOM", "Cannot unregister multi-instance invalidation callback", e);
                }
                this.read.unbindService(this.MediaSessionCompatQueueItem);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public MultiInstanceInvalidationClient(Context context, String str, InvalidationTracker invalidationTracker) {
        context.getClass();
        str.getClass();
        this.MediaBrowserCompatMediaItem = str;
        this.MediaDescriptionCompat = invalidationTracker;
        this.read = context.getApplicationContext();
        this.RemoteActionCompatParcelizer = invalidationTracker.read.getCoroutineScope();
        this.PlaybackStateCompatCustomAction = new AtomicBoolean(true);
        this.serializer = SharedFlowKt.RemoteActionCompatParcelizer(0, 0, IInAppMessageViewWrapper.SUSPEND);
        this.MediaMetadataCompat = new i$d(this, 11, invalidationTracker.RatingCompat);
        this.IconCompatParcelizer = new BrushKtShaderBrush1(this);
        this.MediaSessionCompatQueueItem = new lerpSafeWko1d7g(this);
    }

    public final void write(Intent intent) {
        intent.getClass();
        if (this.PlaybackStateCompatCustomAction.compareAndSet(true, false)) {
            this.read.bindService(intent, this.MediaSessionCompatQueueItem, 1);
            i$d i_d = this.MediaMetadataCompat;
            i_d.getClass();
            InvalidationTracker invalidationTracker = this.MediaDescriptionCompat;
            LinkedHashMap linkedHashMap = invalidationTracker.serializer;
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.write;
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0Serializer = triggerBasedInvalidationTracker.serializer((String[]) i_d.serializer);
            String[] strArr = (String[]) onviewattachedtowindowlambda0Serializer.serializer;
            int[] iArr = (int[]) onviewattachedtowindowlambda0Serializer.write;
            clipRectmtrdDEdefault cliprectmtrddedefault = new clipRectmtrdDEdefault(i_d, iArr, strArr);
            ReentrantLock reentrantLock = invalidationTracker.MediaDescriptionCompat;
            reentrantLock.lock();
            try {
                clipRectmtrdDEdefault cliprectmtrddedefault2 = linkedHashMap.containsKey(i_d) ? (clipRectmtrdDEdefault) onMove.read(linkedHashMap, i_d) : (clipRectmtrdDEdefault) linkedHashMap.put(i_d, cliprectmtrddedefault);
                reentrantLock.unlock();
                if (cliprectmtrddedefault2 == null) {
                    triggerBasedInvalidationTracker.write.IconCompatParcelizer(iArr);
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final SignInDataStore$get$$inlined$map$1 IconCompatParcelizer(String[] strArr) {
        strArr.getClass();
        return new SignInDataStore$get$$inlined$map$1(this.serializer, strArr, 1);
    }
}
