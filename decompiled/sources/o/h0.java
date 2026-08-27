package o;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements ValueAnimator.AnimatorUpdateListener {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ View IconCompatParcelizer;
    public final /* synthetic */ gh read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ h0(gh ghVar, int i, View view, int i2) {
        this.write = i2;
        this.read = ghVar;
        this.serializer = i;
        this.IconCompatParcelizer = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 59;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        View view = this.IconCompatParcelizer;
        int i5 = this.serializer;
        gh ghVar = this.read;
        if (i4 == 0) {
            valueAnimator.getClass();
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            float fFloatValue = ((Float) animatedValue).floatValue();
            ghVar.MediaSessionCompatToken = ghVar.PlaybackStateCompatCustomAction + ((int) (i5 * fFloatValue));
            float f = 1.0f - fFloatValue;
            ghVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (int) (ghVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg * f);
            int i6 = ghVar.read;
            ghVar.PlaybackStateCompat = i6 + ((int) ((ghVar.MediaDescriptionCompat - i6) * fFloatValue));
            ghVar.ParcelableVolumeInfo = (ghVar.IconCompatParcelizer * f) + (ghVar.RatingCompat * fFloatValue);
            view.setTranslationX((ghVar.serializer * fFloatValue) + (ghVar.RemoteActionCompatParcelizer * f));
            view.setTranslationY(ghVar.MediaMetadataCompat * f);
            view.invalidateOutline();
            View view2 = ghVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (view2 != null) {
                view2.setAlpha(fFloatValue);
                return;
            }
            return;
        }
        valueAnimator.getClass();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        animatedValue2.getClass();
        float fFloatValue2 = ((Float) animatedValue2).floatValue();
        ghVar.MediaSessionCompatToken = ghVar.PlaybackStateCompatCustomAction + ((int) (i5 * fFloatValue2));
        float f2 = 1.0f - fFloatValue2;
        ghVar.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (int) (ghVar.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg * f2);
        int i7 = ghVar.read;
        ghVar.PlaybackStateCompat = i7 + ((int) ((ghVar.MediaDescriptionCompat - i7) * fFloatValue2));
        ghVar.ParcelableVolumeInfo = (ghVar.IconCompatParcelizer * f2) + (ghVar.RatingCompat * fFloatValue2);
        view.setTranslationX((ghVar.serializer * fFloatValue2) + (ghVar.RemoteActionCompatParcelizer * f2));
        view.setTranslationY(ghVar.MediaMetadataCompat * f2);
        view.invalidateOutline();
        View view3 = ghVar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (view3 != null) {
            view3.setAlpha(fFloatValue2);
            int i8 = MediaSessionCompatQueueItem + 17;
            RemoteActionCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
    }
}
