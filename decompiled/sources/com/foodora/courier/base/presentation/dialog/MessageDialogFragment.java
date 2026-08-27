package com.foodora.courier.base.presentation.dialog;

import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.DialogFragment;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.deliveryhero.chatui.view.util.DialogUtils$$ExternalSyntheticLambda0;
import o.onRetainCustomNonConfigurationInstance;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeOnContextAvailableListener;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MessageDialogFragment extends DialogFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int getSavedStateRegistry = 1;
    public r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 getOnBackPressedDispatcher = new ScrollState$$ExternalSyntheticLambda3(24);

    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1 r4
  0x0035: PHI (r1v6 android.app.Dialog) = (r1v5 android.app.Dialog), (r1v10 android.app.Dialog) binds: [B:8:0x0033, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r4v3 boolean) = (r4v2 boolean), (r4v12 boolean) binds: [B:8:0x0033, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        Dialog dialog;
        int i = 2 % 2;
        int i2 = getSavedStateRegistry + 41;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            z = requireArguments().getBoolean("isCancelable", false);
            ((DialogFragment) this).RemoteActionCompatParcelizer = z;
            dialog = ((DialogFragment) this).read;
            if (dialog != null) {
                dialog.setCancelable(z);
                int i3 = getNavigationEventDispatcher + 45;
                getSavedStateRegistry = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            super.onCreate(bundle);
            z = requireArguments().getBoolean("isCancelable", true);
            ((DialogFragment) this).RemoteActionCompatParcelizer = z;
            dialog = ((DialogFragment) this).read;
            if (dialog != null) {
                dialog.setCancelable(z);
                int i5 = getNavigationEventDispatcher + 45;
                getSavedStateRegistry = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        int i7 = getNavigationEventDispatcher + 121;
        getSavedStateRegistry = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog write(Bundle bundle) {
        int i = 2;
        int i2 = 2 % 2;
        Bundle bundleRequireArguments = requireArguments();
        DeltaDecoder deltaDecoder = new DeltaDecoder(requireContext());
        String string = bundleRequireArguments.getString(PushNotificationParserObj.TITLE_KEY);
        onRetainCustomNonConfigurationInstance onretaincustomnonconfigurationinstance = (onRetainCustomNonConfigurationInstance) deltaDecoder.serializer;
        onretaincustomnonconfigurationinstance.ResultReceiver = string;
        onretaincustomnonconfigurationinstance.RatingCompat = bundleRequireArguments.getString("message");
        String string2 = bundleRequireArguments.getString("positiveButtonLabel");
        if (string2 != null) {
            deltaDecoder.IconCompatParcelizer(string2, new DialogUtils$$ExternalSyntheticLambda0(i, this));
            int i3 = getNavigationEventDispatcher + 91;
            getSavedStateRegistry = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        String string3 = bundleRequireArguments.getString("neutralButtonLabel");
        if (string3 != null) {
            DialogUtils$$ExternalSyntheticLambda0 dialogUtils$$ExternalSyntheticLambda0 = new DialogUtils$$ExternalSyntheticLambda0(i, this);
            onretaincustomnonconfigurationinstance.PlaybackStateCompat = string3;
            onretaincustomnonconfigurationinstance.MediaSessionCompatToken = dialogUtils$$ExternalSyntheticLambda0;
        }
        String string4 = bundleRequireArguments.getString("negativeButtonLabel");
        if (string4 != null) {
            deltaDecoder.write(string4, new DialogUtils$$ExternalSyntheticLambda0(i, this));
            int i5 = getSavedStateRegistry + 103;
            getNavigationEventDispatcher = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        removeOnContextAvailableListener removeoncontextavailablelistenerSerializer = deltaDecoder.serializer();
        removeoncontextavailablelistenerSerializer.setCanceledOnTouchOutside(bundleRequireArguments.getBoolean("isCancelable", true));
        return removeoncontextavailablelistenerSerializer;
    }
}
