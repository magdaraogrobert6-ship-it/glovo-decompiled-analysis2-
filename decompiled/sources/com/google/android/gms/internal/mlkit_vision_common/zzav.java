package com.google.android.gms.internal.mlkit_vision_common;

import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.foodora.courier.base.presentation.dialog.NonBlockingMessageDialogFragment;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzav {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static NonBlockingMessageDialogFragment write(String str, String str2, getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start, getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start2, getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start3) {
        String str3;
        int i = 2 % 2;
        NonBlockingMessageDialogFragment nonBlockingMessageDialogFragment = new NonBlockingMessageDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(PushNotificationParserObj.TITLE_KEY, str);
        bundle.putString("message", str2);
        String str4 = null;
        if (getstyleable_vector_drawable_path_trim_path_start != null) {
            int i2 = serializer + 91;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                str3 = getstyleable_vector_drawable_path_trim_path_start.serializer;
                int i3 = 66 / 0;
            } else {
                str3 = getstyleable_vector_drawable_path_trim_path_start.serializer;
            }
        } else {
            str3 = null;
        }
        bundle.putString("positiveButtonLabel", str3);
        bundle.putString("neutralButtonLabel", getstyleable_vector_drawable_path_trim_path_start2 != null ? getstyleable_vector_drawable_path_trim_path_start2.serializer : null);
        if (getstyleable_vector_drawable_path_trim_path_start3 != null) {
            int i4 = serializer + 23;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            str4 = getstyleable_vector_drawable_path_trim_path_start3.serializer;
        }
        bundle.putString("negativeButtonLabel", str4);
        nonBlockingMessageDialogFragment.setArguments(bundle);
        nonBlockingMessageDialogFragment.getOnBackPressedDispatcher = new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(getstyleable_vector_drawable_path_trim_path_start, getstyleable_vector_drawable_path_trim_path_start2, getstyleable_vector_drawable_path_trim_path_start3, 3);
        nonBlockingMessageDialogFragment.setRetainInstance(true);
        return nonBlockingMessageDialogFragment;
    }
}
