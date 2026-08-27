package o;

import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: classes.dex */
public final class updateSemanticsCopy implements getContentViewGroupParentLayout, updateBuffersOnDisappeared {
    public static final getBirthDateDay RemoteActionCompatParcelizer = new getBirthDateDay();
    public volatile TextAnnouncementContentCardView IconCompatParcelizer;
    public final updateSemanticsCopy serializer = this;
    public final TextAnnouncementContentCardView write;

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
        write();
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        write();
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
    }

    public final void write() {
        synchronized (this.serializer) {
            TextAnnouncementContentCardView textAnnouncementContentCardView = this.IconCompatParcelizer;
            if (textAnnouncementContentCardView == null) {
                this.IconCompatParcelizer = RemoteActionCompatParcelizer;
            } else {
                JobKt.serializer(textAnnouncementContentCardView, new androidx.compose.runtime.ForgottenCoroutineScopeException());
            }
        }
    }

    public updateSemanticsCopy(TextAnnouncementContentCardView textAnnouncementContentCardView) {
        this.write = textAnnouncementContentCardView;
    }

    @Override // o.getContentViewGroupParentLayout
    public final TextAnnouncementContentCardView getCoroutineContext() {
        TextAnnouncementContentCardView textAnnouncementContentCardViewPlus;
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.IconCompatParcelizer;
        if (textAnnouncementContentCardView == null || textAnnouncementContentCardView == RemoteActionCompatParcelizer) {
            getRectangleGoahg getrectanglegoahg = (getRectangleGoahg) this.write.get(getRectangleGoahg.write);
            TextAnnouncementContentCardView vectorPainterKtrememberVectorPainter211 = getrectanglegoahg != null ? new VectorPainterKtrememberVectorPainter211(getrectanglegoahg, this) : r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
            synchronized (this.serializer) {
                TextAnnouncementContentCardView textAnnouncementContentCardView2 = this.IconCompatParcelizer;
                if (textAnnouncementContentCardView2 == null) {
                    TextAnnouncementContentCardView textAnnouncementContentCardView3 = this.write;
                    textAnnouncementContentCardViewPlus = textAnnouncementContentCardView3.plus(new onAnimationEndlambda0((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView3.get(onAnimationEndlambda1.RemoteActionCompatParcelizer))).plus(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write).plus(vectorPainterKtrememberVectorPainter211);
                } else if (textAnnouncementContentCardView2 == RemoteActionCompatParcelizer) {
                    TextAnnouncementContentCardView textAnnouncementContentCardView4 = this.write;
                    onAnimationEndlambda0 onanimationendlambda0 = new onAnimationEndlambda0((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) textAnnouncementContentCardView4.get(onAnimationEndlambda1.RemoteActionCompatParcelizer));
                    onanimationendlambda0.MediaDescriptionCompat(new androidx.compose.runtime.ForgottenCoroutineScopeException());
                    textAnnouncementContentCardViewPlus = textAnnouncementContentCardView4.plus(onanimationendlambda0).plus(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write).plus(vectorPainterKtrememberVectorPainter211);
                } else {
                    textAnnouncementContentCardViewPlus = textAnnouncementContentCardView2;
                }
                this.IconCompatParcelizer = textAnnouncementContentCardViewPlus;
            }
            textAnnouncementContentCardView = textAnnouncementContentCardViewPlus;
        }
        textAnnouncementContentCardView.getClass();
        return textAnnouncementContentCardView;
    }
}
