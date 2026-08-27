package o;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getDownimpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final boolean write(androidx.compose.foundation.pager.PagerState pagerState, float f) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        pagerState.MediaSessionCompatQueueItem().getClass();
        if (!((pagerState.isNotGestureAction$foundation() ? -f : IconCompatParcelizer(pagerState)) <= 0.0f)) {
            return false;
        }
        int i4 = serializer + 95;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }

    public static final float IconCompatParcelizer(androidx.compose.foundation.pager.PagerState pagerState) {
        int i = 2 % 2;
        if (pagerState.MediaSessionCompatQueueItem().MediaSessionCompatToken == SelectionHandleIcon.Horizontal) {
            int i2 = IconCompatParcelizer + 101;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            return Float.intBitsToFloat((int) (i2 % 2 != 0 ? pagerState.MediaDescriptionCompat() << 47 : pagerState.MediaDescriptionCompat() >> 32));
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pagerState.MediaDescriptionCompat() & 4294967295L));
        int i3 = IconCompatParcelizer + 11;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return fIntBitsToFloat;
    }

    public static androidx.constraintlayout.widget.ConstraintLayout write(Context context, int i, int i2) {
        int i3 = 2 % 2;
        Object obj = null;
        View viewInflate = LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.view_map_pin_highlight_small, (ViewGroup) null, false);
        int i4 = com.logistics.rider.glovo.R.id.bubbleView;
        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp = (accessgetReuseDeactivationViaHostcp) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.bubbleView, viewInflate);
        if (accessgetreusedeactivationviahostcp != null) {
            i4 = com.logistics.rider.glovo.R.id.imageViewBadge;
            if (((androidx.appcompat.widget.AppCompatImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewBadge, viewInflate)) != null) {
                i4 = com.logistics.rider.glovo.R.id.imageViewPin;
                androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewPin, viewInflate);
                if (appCompatImageView != null) {
                    i4 = com.logistics.rider.glovo.R.id.viewBadge;
                    FrameLayout frameLayout = (FrameLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.viewBadge, viewInflate);
                    if (frameLayout != null) {
                        int i5 = serializer + 35;
                        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) viewInflate;
                        accessgetreusedeactivationviahostcp.setColorFilter(context.getColor(i2));
                        appCompatImageView.setColorFilter(context.getColor(com.logistics.rider.glovo.R.color.neutral_00));
                        appCompatImageView.setImageResource(i);
                        frameLayout.setVisibility(8);
                        constraintLayout.getClass();
                        int i7 = serializer + 3;
                        IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            return constraintLayout;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        return null;
    }

    public static androidx.constraintlayout.widget.ConstraintLayout RemoteActionCompatParcelizer(Context context, int i, int i2, int i3) {
        int i4 = 2 % 2;
        View viewInflate = LayoutInflater.from(context).inflate(com.logistics.rider.glovo.R.layout.view_map_pin_highlight, (ViewGroup) null, false);
        int i5 = com.logistics.rider.glovo.R.id.bubbleView;
        accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp = (accessgetReuseDeactivationViaHostcp) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.bubbleView, viewInflate);
        if (accessgetreusedeactivationviahostcp != null) {
            int i6 = serializer + 37;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (((androidx.appcompat.widget.AppCompatImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewBadge, viewInflate)) != null) {
                i5 = com.logistics.rider.glovo.R.id.imageViewPin;
                androidx.appcompat.widget.AppCompatImageView appCompatImageView = (androidx.appcompat.widget.AppCompatImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.imageViewPin, viewInflate);
                if (appCompatImageView != null) {
                    i5 = com.logistics.rider.glovo.R.id.pinPoint;
                    accessgetReuseDeactivationViaHostcp accessgetreusedeactivationviahostcp2 = (accessgetReuseDeactivationViaHostcp) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.pinPoint, viewInflate);
                    if (accessgetreusedeactivationviahostcp2 != null) {
                        i5 = com.logistics.rider.glovo.R.id.pinString;
                        if (((androidx.appcompat.widget.AppCompatImageView) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.pinString, viewInflate)) != null) {
                            i5 = com.logistics.rider.glovo.R.id.viewBadge;
                            FrameLayout frameLayout = (FrameLayout) coil3.ExtrasKt.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.id.viewBadge, viewInflate);
                            if (frameLayout != null) {
                                int i7 = IconCompatParcelizer + 43;
                                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i8 = i7 % 2;
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) viewInflate;
                                accessgetreusedeactivationviahostcp.setColorFilter(context.getColor(i2));
                                accessgetreusedeactivationviahostcp2.setColorFilter(context.getColor(i3), PorterDuff.Mode.ADD);
                                appCompatImageView.setColorFilter(context.getColor(com.logistics.rider.glovo.R.color.neutral_00));
                                appCompatImageView.setImageResource(i);
                                frameLayout.setVisibility(8);
                                constraintLayout.getClass();
                                return constraintLayout;
                            }
                        }
                    }
                }
            } else {
                i5 = com.logistics.rider.glovo.R.id.imageViewBadge;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
        return null;
    }
}
