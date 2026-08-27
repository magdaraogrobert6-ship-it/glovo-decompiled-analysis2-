package o;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class accessgetParentWidth implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ accessgetParentWidth(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            AppBarLayout appBarLayout = (AppBarLayout) obj2;
            int i2 = AppBarLayout.RemoteActionCompatParcelizer;
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((SubcomposeSlotReusePolicy) obj).MediaBrowserCompatMediaItem(fFloatValue);
            Drawable drawable = appBarLayout.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (drawable instanceof SubcomposeSlotReusePolicy) {
                ((SubcomposeSlotReusePolicy) drawable).MediaBrowserCompatMediaItem(fFloatValue);
            }
            Iterator it = appBarLayout.MediaSessionCompatResultReceiverWrapper.iterator();
            if (it.hasNext()) {
                throw ff$$ExternalSyntheticOutline0.m(it);
            }
            return;
        }
        if (i != 1) {
            ((com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener) obj2).lambda$performDismiss$0((ViewGroup.LayoutParams) obj, valueAnimator);
            return;
        }
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = (SubcomposeSlotReusePolicy) obj;
        int i3 = AppBarLayout.RemoteActionCompatParcelizer;
        int iFloatValue = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
        subcomposeSlotReusePolicy.setAlpha(iFloatValue);
        Iterator it2 = ((AppBarLayout) obj2).MediaSessionCompatResultReceiverWrapper.iterator();
        while (it2.hasNext()) {
            if (it2.next() != null) {
                int iSerializer = isAppSetIdReadingEnabled.serializer();
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
                return;
            }
            ColorStateList colorStateList = subcomposeSlotReusePolicy.getLifecycle.RemoteActionCompatParcelizer;
            if (colorStateList != null) {
                colorStateList.withAlpha(iFloatValue).getDefaultColor();
                throw null;
            }
        }
    }
}
