package com.google.android.gms.internal.mlkit_vision_common;

import android.os.Bundle;
import androidx.compose.runtime.GapComposer$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.foodora.courier.base.presentation.dialog.BlockingMessageDialogFragment;
import o.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zziz {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static BlockingMessageDialogFragment RemoteActionCompatParcelizer(String str, String str2, getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START getstyleable_vector_drawable_path_trim_path_start) {
        int i = 2 % 2;
        BlockingMessageDialogFragment blockingMessageDialogFragment = new BlockingMessageDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(PushNotificationParserObj.TITLE_KEY, str);
        bundle.putString("message", str2);
        bundle.putString("positiveButtonLabel", getstyleable_vector_drawable_path_trim_path_start.serializer);
        bundle.putString("neutralButtonLabel", null);
        bundle.putString("negativeButtonLabel", null);
        bundle.putBoolean("isCancelable", false);
        blockingMessageDialogFragment.setArguments(bundle);
        blockingMessageDialogFragment.getOnBackPressedDispatcher = new GapComposer$$ExternalSyntheticLambda3(10, getstyleable_vector_drawable_path_trim_path_start);
        blockingMessageDialogFragment.setRetainInstance(true);
        int i2 = write + 113;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 18 / 0;
        }
        return blockingMessageDialogFragment;
    }
}
