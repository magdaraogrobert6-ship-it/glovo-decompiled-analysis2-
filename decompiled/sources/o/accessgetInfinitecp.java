package o;

import android.os.Build;
import coil3.ImageLoader$Builder;
import com.google.android.gms.dynamite.zzj;
import io.reactivex.internal.operators.maybe.MaybeObserveOn;
import java.util.ArrayList;
import java.util.Set;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetInfinitecp extends DefaultContentCardsUpdateHandlerCompanionCREATOR1 {
    public final /* synthetic */ translatek4lQ0M RemoteActionCompatParcelizer;

    @Override // o.DefaultContentCardsUpdateHandlerCompanionCREATOR1
    public final void RemoteActionCompatParcelizer(ImageLoader$Builder imageLoader$Builder) {
        Set<int[]> setRemoteActionCompatParcelizer;
        translatek4lQ0M translatek4lq0m = this.RemoteActionCompatParcelizer;
        translatek4lq0m.write = imageLoader$Builder;
        ImageLoader$Builder imageLoader$Builder2 = (ImageLoader$Builder) translatek4lq0m.write;
        MutableRectKt mutableRectKt = (MutableRectKt) translatek4lq0m.IconCompatParcelizer;
        zzj zzjVar = mutableRectKt.PlaybackStateCompat;
        MutableRect3MmeM6k mutableRect3MmeM6k = mutableRectKt.IconCompatParcelizer;
        if (Build.VERSION.SDK_INT >= 34) {
            setRemoteActionCompatParcelizer = Offset.RemoteActionCompatParcelizer();
        } else {
            int iWrite = MaybeObserveOn.write();
            int iWrite2 = MaybeObserveOn.write();
            int iWrite3 = MaybeObserveOn.write();
            setRemoteActionCompatParcelizer = (Set) ModuleDSLKt.serializer(MaybeObserveOn.write(), 96616552, iWrite2, -96616550, iWrite, new Object[0], iWrite3);
        }
        translatek4lq0m.read = new androidx.emoji2.text.EmojiProcessor(imageLoader$Builder2, zzjVar, mutableRect3MmeM6k, setRemoteActionCompatParcelizer);
        MutableRectKt mutableRectKt2 = (MutableRectKt) translatek4lq0m.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        mutableRectKt2.MediaSessionCompatQueueItem.writeLock().lock();
        try {
            mutableRectKt2.MediaDescriptionCompat = 1;
            arrayList.addAll(mutableRectKt2.read);
            mutableRectKt2.read.clear();
            mutableRectKt2.MediaSessionCompatQueueItem.writeLock().unlock();
            mutableRectKt2.MediaBrowserCompatMediaItem.post(new accessgetUnspecifiedcp(arrayList, mutableRectKt2.MediaDescriptionCompat, (Throwable) null));
        } catch (Throwable th) {
            mutableRectKt2.MediaSessionCompatQueueItem.writeLock().unlock();
            throw th;
        }
    }

    @Override // o.DefaultContentCardsUpdateHandlerCompanionCREATOR1
    public final void write(Throwable th) {
        ((MutableRectKt) this.RemoteActionCompatParcelizer.IconCompatParcelizer).read(th);
    }

    public accessgetInfinitecp(translatek4lQ0M translatek4lq0m) {
        this.RemoteActionCompatParcelizer = translatek4lq0m;
    }
}
