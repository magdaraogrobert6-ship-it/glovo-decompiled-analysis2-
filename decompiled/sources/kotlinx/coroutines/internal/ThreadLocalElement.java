package kotlinx.coroutines.internal;

import androidx.room.Room;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class ThreadLocalElement<T> implements ShortNewsContentCardViewViewHolder {
    public final Object read;
    public final ThreadLocal serializer;
    public final ThreadLocalKey write;

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, this);
    }

    @Override // o.ShortNewsContentCardViewViewHolder
    public final ImageOnlyContentCardViewViewHolder getKey() {
        return this.write;
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return Room.read(this, textAnnouncementContentCardView);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        if (this.write.equals(imageOnlyContentCardViewViewHolder)) {
            return this;
        }
        return null;
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return this.write.equals(imageOnlyContentCardViewViewHolder) ? r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object write() {
        ThreadLocal threadLocal = this.serializer;
        Object obj = threadLocal.get();
        threadLocal.set(this.read);
        return obj;
    }

    public final void write(Object obj) {
        this.serializer.set(obj);
    }

    public ThreadLocalElement(Object obj, ThreadLocal threadLocal) {
        this.read = obj;
        this.serializer = threadLocal;
        this.write = new ThreadLocalKey(threadLocal);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.read + ", threadLocal = " + this.serializer + ')';
    }
}
