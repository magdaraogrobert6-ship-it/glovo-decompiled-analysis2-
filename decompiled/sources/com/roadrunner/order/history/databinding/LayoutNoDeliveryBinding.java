package com.roadrunner.order.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import o.accessgetPositiveInfinitycp;
import o.accessupdateSelectedPaymentOption;
import o.getImmutablePendingIntentFlags;

/* JADX INFO: loaded from: classes3.dex */
public final class LayoutNoDeliveryBinding implements accessgetPositiveInfinitycp {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final ViewGroup IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final View serializer;

    public /* synthetic */ LayoutNoDeliveryBinding(int i, View view, ViewGroup viewGroup) {
        this.read = i;
        this.IconCompatParcelizer = viewGroup;
        this.serializer = view;
    }

    @Override // o.accessgetPositiveInfinitycp
    public final View getRoot() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 97;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.read;
        ViewGroup viewGroup = this.IconCompatParcelizer;
        if (i4 == 0) {
            return (ConstraintLayout) viewGroup;
        }
        if (i4 == 1) {
            return (LinearLayout) viewGroup;
        }
        if (i4 != 2) {
            return (accessupdateSelectedPaymentOption) viewGroup;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        int i5 = i2 + 75;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public ConstraintLayout IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.IconCompatParcelizer;
        if (i3 != 0) {
            return constraintLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LayoutNoDeliveryBinding read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 91;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_history_dialog, viewGroup, false);
        int i5 = R.id.historyNavHostFragmentContainer;
        if (((FragmentContainerView) ExtrasKt.RemoteActionCompatParcelizer(R.id.historyNavHostFragmentContainer, viewInflate)) != null) {
            i5 = R.id.historyToolbar;
            getImmutablePendingIntentFlags getimmutablependingintentflags = (getImmutablePendingIntentFlags) ExtrasKt.RemoteActionCompatParcelizer(R.id.historyToolbar, viewInflate);
            if (getimmutablependingintentflags != null) {
                LayoutNoDeliveryBinding layoutNoDeliveryBinding = new LayoutNoDeliveryBinding(i, getimmutablependingintentflags, (ConstraintLayout) viewInflate);
                int i6 = write + 85;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return layoutNoDeliveryBinding;
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i5)));
        return null;
    }
}
