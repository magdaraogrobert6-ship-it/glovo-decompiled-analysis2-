package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable$2;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gh {
    private static int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 1;
    private static int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final androidx.constraintlayout.widget.ConstraintLayout ComponentActivity;
    public float IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public float ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public float RatingCompat;
    public float RemoteActionCompatParcelizer;
    public final ArrayList ResultReceiver;
    public final g1 r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final View r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int read;
    public float serializer;
    public final View write;

    public final boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3;
        int i4 = i2 % 2;
        boolean z = this.MediaSessionCompatResultReceiverWrapper;
        int i5 = i3 + 125;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return z;
    }

    public final int serializer() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 57;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final View write() {
        int i = 2 % 2;
        int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i3 = i2 + 107;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.ComponentActivity;
        int i5 = i2 + 77;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public gh(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, g1 g1Var) {
        g1Var.getClass();
        this.ComponentActivity = constraintLayout;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = g1Var;
        this.write = constraintLayout.findViewById(com.logistics.rider.glovo.R.id.expandedContainer);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = constraintLayout.findViewById(com.logistics.rider.glovo.R.id.textContainer);
        this.MediaSessionCompatResultReceiverWrapper = true;
        this.ResultReceiver = new ArrayList();
        constraintLayout.addOnLayoutChangeListener(new h2ExternalSyntheticLambda12(0, this));
    }

    public final void RemoteActionCompatParcelizer(float f) {
        int i = 2 % 2;
        this.serializer = f;
        if (this.MediaSessionCompatResultReceiverWrapper && this.MediaSessionCompatQueueItem) {
            int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 23;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            View view = this.write;
            if (view != null) {
                view.setTranslationX(f);
                int i4 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 107;
                r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
        }
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        ArrayList arrayList = this.ResultReceiver;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 105;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                ((ValueAnimator) it.next()).cancel();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((ValueAnimator) it.next()).cancel();
            int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 55;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        arrayList.clear();
        int i5 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 103;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
    }

    public final void write(View view) {
        int i = 2 % 2;
        int i2 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 21;
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.MediaSessionCompatToken = this.MediaBrowserCompatMediaItem;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
        this.PlaybackStateCompat = this.MediaDescriptionCompat;
        this.ParcelableVolumeInfo = this.RatingCompat;
        view.setTranslationX(this.serializer);
        view.setTranslationY(0.0f);
        view.invalidateOutline();
        View view2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        int i4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 37;
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public final void read(View view) {
        int i = 2 % 2;
        int i2 = this.PlaybackStateCompatCustomAction;
        if (i2 < 1) {
            int i3 = r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + 113;
            r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            i2 = 1;
        }
        this.MediaSessionCompatToken = i2;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        this.PlaybackStateCompat = this.read;
        this.ParcelableVolumeInfo = this.IconCompatParcelizer;
        view.setTranslationX(this.RemoteActionCompatParcelizer);
        view.setTranslationY(this.MediaMetadataCompat);
        view.invalidateOutline();
        View view2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (view2 != null) {
            int i5 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 53;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            view2.setAlpha(i5 % 2 == 0 ? 1.0f : 0.0f);
        }
    }

    public final int MediaMetadataCompat() {
        int marginStart;
        int marginEnd;
        int i = 2 % 2;
        View view = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int width = 0;
        if (marginLayoutParams != null) {
            marginStart = marginLayoutParams.getMarginStart();
            int i2 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 27;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            marginStart = 0;
        }
        if (marginLayoutParams != null) {
            int i4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 25;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                marginEnd = marginLayoutParams.getMarginEnd();
                int i5 = 68 / 0;
            } else {
                marginEnd = marginLayoutParams.getMarginEnd();
            }
        } else {
            marginEnd = 0;
        }
        if (view != null) {
            int i6 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 61;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            width = view.getWidth();
        }
        return width + marginStart + marginEnd;
    }

    public final void read() {
        int i = 2;
        int i2 = 2 % 2;
        if (!this.MediaSessionCompatResultReceiverWrapper) {
            int i3 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 41;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = false;
        IconCompatParcelizer();
        View view = this.write;
        if (view == null) {
            return;
        }
        if (!this.MediaSessionCompatQueueItem) {
            read(view);
            return;
        }
        this.MediaSessionCompatToken = this.MediaBrowserCompatMediaItem;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0;
        this.PlaybackStateCompat = this.MediaDescriptionCompat;
        this.ParcelableVolumeInfo = this.RatingCompat;
        view.setTranslationX(this.serializer);
        view.setTranslationY(0.0f);
        view.invalidateOutline();
        View view2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (view2 != null) {
            int i5 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + 25;
            r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            view2.setAlpha(1.0f);
        }
        int iMediaMetadataCompat = MediaMetadataCompat();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new h0(this, iMediaMetadataCompat, view, 1));
        valueAnimatorOfFloat.addListener(new CircularProgressDrawable$2(new cancelPendingWebViewPause(), i, new h2ExternalSyntheticLambda18(this, view, 1)));
        this.ResultReceiver.add(valueAnimatorOfFloat);
        valueAnimatorOfFloat.start();
    }
}
