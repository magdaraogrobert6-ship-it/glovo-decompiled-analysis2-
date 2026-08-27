package o;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1 implements ShortNewsContentCardViewViewHolder, ImageOnlyContentCardViewViewHolder {
    public static final DefaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1 read = new DefaultInAppMessageViewWrapperopendismissInAppMessageCallbackFallback1();

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
        return this;
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
