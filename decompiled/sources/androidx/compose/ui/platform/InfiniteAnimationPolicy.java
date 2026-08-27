package androidx.compose.ui.platform;

import androidx.room.Room;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface InfiniteAnimationPolicy extends ShortNewsContentCardViewViewHolder {
    public static final Key Key = Key.$$INSTANCE;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) Room.IconCompatParcelizer(infiniteAnimationPolicy, r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        public static <E extends ShortNewsContentCardViewViewHolder> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
            return (E) Room.write(infiniteAnimationPolicy, imageOnlyContentCardViewViewHolder);
        }

        @Deprecated
        public static ImageOnlyContentCardViewViewHolder getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        public static TextAnnouncementContentCardView minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
            return Room.IconCompatParcelizer(infiniteAnimationPolicy, imageOnlyContentCardViewViewHolder);
        }

        public static TextAnnouncementContentCardView plus(InfiniteAnimationPolicy infiniteAnimationPolicy, TextAnnouncementContentCardView textAnnouncementContentCardView) {
            return Room.read(infiniteAnimationPolicy, textAnnouncementContentCardView);
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

    @Override // o.TextAnnouncementContentCardView
    /* synthetic */ TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder);

    <R> Object onInfiniteOperation(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, ShortNewsContentCardView<? super R> shortNewsContentCardView);

    @Override // o.TextAnnouncementContentCardView
    /* synthetic */ TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView);
}
