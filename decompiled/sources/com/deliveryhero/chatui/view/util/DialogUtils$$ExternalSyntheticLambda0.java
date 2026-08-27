package com.deliveryhero.chatui.view.util;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.compose.ui.graphics.Fields;
import com.foodora.courier.base.presentation.dialog.MessageDialogFragment;
import com.mapbox.maps.extension.style.layers.LayerUtils$getLayer$source$2;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import o.displayInAppMessagelambda10;
import o.getSTYLEABLE_VECTOR_DRAWABLE_TINT;
import o.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DialogUtils$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ DialogUtils$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Object getstyleable_vector_drawable_tint_mode;
        int i2 = 2 % 2;
        int i3 = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            ((AlertDialog) obj).dismiss();
            return;
        }
        if (i3 == 1) {
            ((LayerUtils$getLayer$source$2) obj).invoke();
            int i4 = serializer + 31;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        if (i3 != 2) {
            SelfServiceCustomerChatActivity.write(-743587533, new Object[]{(SelfServiceCustomerChatActivity) obj, dialogInterface, Integer.valueOf(i)}, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read(), 743587546, displayInAppMessagelambda10.read(), displayInAppMessagelambda10.read());
            return;
        }
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = ((MessageDialogFragment) obj).getOnBackPressedDispatcher;
        if (i == -3) {
            getstyleable_vector_drawable_tint_mode = getSTYLEABLE_VECTOR_DRAWABLE_TINT.RemoteActionCompatParcelizer;
        } else if (i != -2) {
            int i6 = serializer + 59;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            getstyleable_vector_drawable_tint_mode = i != -1 ? new getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(i) : getSTYLEABLE_VECTOR_DRAWABLE_TINT.read;
        } else {
            getstyleable_vector_drawable_tint_mode = getSTYLEABLE_VECTOR_DRAWABLE_TINT.IconCompatParcelizer;
        }
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(dialogInterface, getstyleable_vector_drawable_tint_mode);
    }
}
