package com.ui.common.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.logistics.rider.glovo.R;
import o.div7Ah8Wj8;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onItemDismisslambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public class LoadingDialogFullScreen extends DialogFragment {
    public TextView getNavigationEventDispatcher;
    public Animation getOnBackPressedDispatcher;

    @onItemDismisslambda0
    public LoadingDialogFullScreen() {
    }

    public final void read(div7Ah8Wj8 div7ah8wj8, boolean z) {
        if (z) {
            serializer(div7ah8wj8);
        } else {
            serializer();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        view.getClass();
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.loading_text);
        viewFindViewById.getClass();
        this.getNavigationEventDispatcher = (TextView) viewFindViewById;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("loading_text_extra")) != null) {
            boolean zSerializer = hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string);
            TextView textView = this.getNavigationEventDispatcher;
            if (zSerializer) {
                if (textView == null) {
                    removeNodeAtDepth.serializer("loadingTextView");
                    throw null;
                }
                textView.setVisibility(8);
            } else {
                if (textView == null) {
                    removeNodeAtDepth.serializer("loadingTextView");
                    throw null;
                }
                textView.setText(string);
                TextView textView2 = this.getNavigationEventDispatcher;
                if (textView2 == null) {
                    removeNodeAtDepth.serializer("loadingTextView");
                    throw null;
                }
                textView2.setVisibility(0);
            }
        }
        this.getOnBackPressedDispatcher = AnimationUtils.loadAnimation(requireContext(), R.anim.anim_rotation);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageViewLoading);
        if (imageView != null) {
            imageView.startAnimation(this.getOnBackPressedDispatcher);
        }
        ((DialogFragment) this).RemoteActionCompatParcelizer = false;
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((DialogFragment) this).RemoteActionCompatParcelizer = false;
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        read(2, R.style.Theme_RoadRunner_LoadingDialog);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Animation animation = this.getOnBackPressedDispatcher;
        if (animation != null) {
            animation.cancel();
        }
        this.getOnBackPressedDispatcher = null;
        super.onDestroyView();
    }

    public final void serializer() {
        Dialog dialog = ((DialogFragment) this).read;
        if (dialog == null || !dialog.isShowing() || isRemoving()) {
            return;
        }
        read(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.view_loading_full_screen, viewGroup, false);
    }

    public final void serializer(div7Ah8Wj8 div7ah8wj8) {
        if (isAdded()) {
            return;
        }
        write(div7ah8wj8, "LoadingDialogFullScreen");
    }
}
