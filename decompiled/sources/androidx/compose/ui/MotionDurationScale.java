package androidx.compose.ui;

import androidx.room.Room;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface MotionDurationScale extends ShortNewsContentCardViewViewHolder {
    public static final Key Key = Key.$$INSTANCE;

    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) Room.IconCompatParcelizer(motionDurationScale, r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        public static <E extends ShortNewsContentCardViewViewHolder> E get(MotionDurationScale motionDurationScale, ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
            return (E) Room.write(motionDurationScale, imageOnlyContentCardViewViewHolder);
        }

        public static TextAnnouncementContentCardView minusKey(MotionDurationScale motionDurationScale, ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
            return Room.IconCompatParcelizer(motionDurationScale, imageOnlyContentCardViewViewHolder);
        }

        public static TextAnnouncementContentCardView plus(MotionDurationScale motionDurationScale, TextAnnouncementContentCardView textAnnouncementContentCardView) {
            return Room.read(motionDurationScale, textAnnouncementContentCardView);
        }
    }

    public static final class Key implements ImageOnlyContentCardViewViewHolder {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // o.TextAnnouncementContentCardView
    /* synthetic */ Object fold(Object obj, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);

    @Override // o.TextAnnouncementContentCardView
    /* synthetic */ ShortNewsContentCardViewViewHolder get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder);

    @Override // o.ShortNewsContentCardViewViewHolder
    default ImageOnlyContentCardViewViewHolder getKey() {
        return Key;
    }

    float getScaleFactor();

    @Override // o.TextAnnouncementContentCardView
    /* synthetic */ TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder);

    @Override // o.TextAnnouncementContentCardView
    /* synthetic */ TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView);
}
