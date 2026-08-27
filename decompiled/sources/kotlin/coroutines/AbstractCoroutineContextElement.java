package kotlin.coroutines;

import androidx.room.Room;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractCoroutineContextElement implements ShortNewsContentCardViewViewHolder {
    private final ImageOnlyContentCardViewViewHolder RemoteActionCompatParcelizer;

    @Override // o.TextAnnouncementContentCardView
    public <R> R fold(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return (R) Room.IconCompatParcelizer(this, r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // o.TextAnnouncementContentCardView
    public <E extends ShortNewsContentCardViewViewHolder> E get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return (E) Room.write(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.ShortNewsContentCardViewViewHolder
    public ImageOnlyContentCardViewViewHolder getKey() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.TextAnnouncementContentCardView
    public TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return Room.IconCompatParcelizer(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // o.TextAnnouncementContentCardView
    public TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return Room.read(this, textAnnouncementContentCardView);
    }

    public AbstractCoroutineContextElement(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        imageOnlyContentCardViewViewHolder.getClass();
        this.RemoteActionCompatParcelizer = imageOnlyContentCardViewViewHolder;
    }
}
