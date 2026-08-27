package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public interface TextToolbar {
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3);

    default void showMenu(Rect rect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4) {
        showMenu(rect, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(TextToolbar textToolbar, Rect rect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4) {
            TextToolbar.super.showMenu(rect, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4);
        }
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, int i, Object obj) {
        if (obj == null) {
            textToolbar.showMenu(rect, (i & 2) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (i & 4) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (i & 8) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (i & 16) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (i & 32) == 0 ? r8lambdardpfsr94j4iebcwx_kpqzpm8k4 : null);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: showMenu");
        }
    }

    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, int i, Object obj) {
        if (obj == null) {
            textToolbar.showMenu(rect, (i & 2) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (i & 4) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (i & 8) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (i & 16) != 0 ? null : r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: showMenu");
        }
    }
}
