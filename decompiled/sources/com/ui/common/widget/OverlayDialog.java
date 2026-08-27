package com.ui.common.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.logistics.rider.glovo.R;

/* JADX INFO: loaded from: classes4.dex */
public class OverlayDialog extends DialogFragment {
    public Integer getOnBackPressedDispatcher;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        Integer num = this.getOnBackPressedDispatcher;
        if (num != null) {
            bundle.putInt(RemoteMessageConst.Notification.CONTENT, num.intValue());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        read(1, R.style.Widget_RoadRunner_Message_Overlay_Dialog_Background);
        if (bundle == null || !bundle.containsKey(RemoteMessageConst.Notification.CONTENT)) {
            return;
        }
        this.getOnBackPressedDispatcher = Integer.valueOf(bundle.getInt(RemoteMessageConst.Notification.CONTENT));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.layout_message_overlay_dialog, viewGroup, false);
        viewInflate.getClass();
        if (this.getOnBackPressedDispatcher != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.layout_dialog_content_container);
            Context context = getContext();
            Integer num = this.getOnBackPressedDispatcher;
            num.getClass();
            View viewInflate2 = View.inflate(context, num.intValue(), null);
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            if (viewGroup2 != null) {
                viewGroup2.addView(viewInflate2);
            }
        }
        return viewInflate;
    }
}
