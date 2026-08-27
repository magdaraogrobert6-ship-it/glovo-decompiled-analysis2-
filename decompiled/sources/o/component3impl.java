package o;

/* JADX INFO: loaded from: classes.dex */
public final class component3impl implements ShortNewsContentCardViewViewHolder {
    public final ImageOnlyContentCardViewViewHolder IconCompatParcelizer;
    public final androidx.room.coroutines.PooledConnectionImpl RemoteActionCompatParcelizer;

    @Override // o.TextAnnouncementContentCardView
    public final Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, this);
    }

    @Override // o.TextAnnouncementContentCardView
    public final ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return androidx.room.Room.write(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.ShortNewsContentCardViewViewHolder
    public final ImageOnlyContentCardViewViewHolder getKey() {
        return this.IconCompatParcelizer;
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return androidx.room.Room.IconCompatParcelizer(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return androidx.room.Room.read(this, textAnnouncementContentCardView);
    }

    public component3impl(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder, androidx.room.coroutines.PooledConnectionImpl pooledConnectionImpl) {
        pooledConnectionImpl.getClass();
        this.IconCompatParcelizer = imageOnlyContentCardViewViewHolder;
        this.RemoteActionCompatParcelizer = pooledConnectionImpl;
    }
}
