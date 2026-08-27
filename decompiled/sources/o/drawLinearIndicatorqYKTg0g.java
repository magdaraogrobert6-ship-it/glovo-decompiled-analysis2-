package o;

import android.os.Build;
import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import androidx.core.view.WindowInsetsCompat$Impl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class drawLinearIndicatorqYKTg0g extends WindowInsetsAnimationCompat$Callback implements Runnable, FocusPropertiesImpl, View.OnAttachStateChangeListener {
    public final TooltipKt IconCompatParcelizer;
    public boolean read;
    public FocusRequesterModifierKt serializer;
    public boolean write;

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onEnd(component14 component14Var) {
        this.read = false;
        this.write = false;
        FocusRequesterModifierKt focusRequesterModifierKt = this.serializer;
        if (component14Var.IconCompatParcelizer.IconCompatParcelizer() > 0 && focusRequesterModifierKt != null) {
            WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
            TooltipKt tooltipKt = this.IconCompatParcelizer;
            tooltipKt.RatingCompat.RemoteActionCompatParcelizer(PlainTooltipgv3ox5I.IconCompatParcelizer(windowInsetsCompat$Impl.getInsets(8)));
            tooltipKt.MediaMetadataCompat.RemoteActionCompatParcelizer(PlainTooltipgv3ox5I.IconCompatParcelizer(windowInsetsCompat$Impl.getInsets(8)));
            TooltipKt.write(tooltipKt, focusRequesterModifierKt);
        }
        this.serializer = null;
        super.onEnd(component14Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onPrepare(component14 component14Var) {
        this.read = true;
        this.write = true;
        super.onPrepare(component14Var);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final component15 onStart(component14 component14Var, component15 component15Var) {
        this.read = false;
        return component15Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // o.FocusPropertiesImpl
    public final FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        this.serializer = focusRequesterModifierKt;
        TooltipKt tooltipKt = this.IconCompatParcelizer;
        emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseObserveShouldShowImageinvokeinlinedmap12 emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseobserveshouldshowimageinvokeinlinedmap12 = tooltipKt.MediaMetadataCompat;
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        emitcomroadrunnerdeliveryonthewayentrancepicturenavigationusecaseobserveshouldshowimageinvokeinlinedmap12.RemoteActionCompatParcelizer(PlainTooltipgv3ox5I.IconCompatParcelizer(windowInsetsCompat$Impl.getInsets(8)));
        if (this.read) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.write) {
            tooltipKt.RatingCompat.RemoteActionCompatParcelizer(PlainTooltipgv3ox5I.IconCompatParcelizer(windowInsetsCompat$Impl.getInsets(8)));
            TooltipKt.write(tooltipKt, focusRequesterModifierKt);
        }
        return tooltipKt.IconCompatParcelizer ? FocusRequesterModifierKt.read : focusRequesterModifierKt;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final FocusRequesterModifierKt onProgress(FocusRequesterModifierKt focusRequesterModifierKt, List list) {
        TooltipKt tooltipKt = this.IconCompatParcelizer;
        TooltipKt.write(tooltipKt, focusRequesterModifierKt);
        return tooltipKt.IconCompatParcelizer ? FocusRequesterModifierKt.read : focusRequesterModifierKt;
    }

    public drawLinearIndicatorqYKTg0g(TooltipKt tooltipKt) {
        super(!tooltipKt.IconCompatParcelizer ? 1 : 0);
        this.IconCompatParcelizer = tooltipKt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.read) {
            this.read = false;
            this.write = false;
            FocusRequesterModifierKt focusRequesterModifierKt = this.serializer;
            if (focusRequesterModifierKt != null) {
                TooltipKt tooltipKt = this.IconCompatParcelizer;
                tooltipKt.RatingCompat.RemoteActionCompatParcelizer(PlainTooltipgv3ox5I.IconCompatParcelizer(focusRequesterModifierKt.IconCompatParcelizer.getInsets(8)));
                TooltipKt.write(tooltipKt, focusRequesterModifierKt);
                this.serializer = null;
            }
        }
    }
}
