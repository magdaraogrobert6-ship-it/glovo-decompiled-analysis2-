package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.MotionDurationScale;
import o.ImageOnlyContentCardViewViewHolder;
import o.ShortNewsContentCardViewViewHolder;
import o.TextAnnouncementContentCardView;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class DisableAnimationMotionDurationScale implements MotionDurationScale {
    public static final DisableAnimationMotionDurationScale INSTANCE = new DisableAnimationMotionDurationScale();

    private DisableAnimationMotionDurationScale() {
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ <R> R fold(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ <E extends ShortNewsContentCardViewViewHolder> E get(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return (E) MotionDurationScale.DefaultImpls.get(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public float getScaleFactor() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ TextAnnouncementContentCardView minusKey(ImageOnlyContentCardViewViewHolder imageOnlyContentCardViewViewHolder) {
        return MotionDurationScale.DefaultImpls.minusKey(this, imageOnlyContentCardViewViewHolder);
    }

    @Override // androidx.compose.ui.MotionDurationScale, o.TextAnnouncementContentCardView
    public /* bridge */ TextAnnouncementContentCardView plus(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return MotionDurationScale.DefaultImpls.plus(this, textAnnouncementContentCardView);
    }
}
