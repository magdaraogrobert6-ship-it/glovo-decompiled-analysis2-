package o;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.animation.core.TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ComposeUiFlags implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider serializer;

    public /* synthetic */ ComposeUiFlags(androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = androidTextContextMenuToolbarProvider;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = this.serializer;
        if (i == 0) {
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj;
            View view = androidTextContextMenuToolbarProvider.MediaDescriptionCompat;
            Handler handler = view.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            } else {
                Handler handler2 = view.getHandler();
                if (handler2 != null) {
                    handler2.post(new Q(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
                }
            }
            return createfromparcel;
        }
        if (i == 1) {
            ActionMode actionMode = androidTextContextMenuToolbarProvider.read;
            if (actionMode != null) {
                actionMode.invalidate();
            }
            return createfromparcel;
        }
        if (i != 2) {
            androidTextContextMenuToolbarProvider.MediaBrowserCompatMediaItem.read();
            return new TransitionKt$rememberTransition$lambda$1$0$$inlined$onDispose$1(7, androidTextContextMenuToolbarProvider);
        }
        ActionMode actionMode2 = androidTextContextMenuToolbarProvider.read;
        if (actionMode2 != null) {
            actionMode2.invalidateContentRect();
        }
        return createfromparcel;
    }
}
