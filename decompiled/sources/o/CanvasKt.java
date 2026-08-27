package o;

/* JADX INFO: loaded from: classes.dex */
public final class CanvasKt implements ShortNewsContentCardViewViewHolder, ImageOnlyContentCardViewViewHolder {
    public static final CanvasKt serializer = new CanvasKt();

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
        return serializer;
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return androidx.room.Room.IconCompatParcelizer(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public final TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return androidx.room.Room.read(this, textAnnouncementContentCardView);
    }
}
