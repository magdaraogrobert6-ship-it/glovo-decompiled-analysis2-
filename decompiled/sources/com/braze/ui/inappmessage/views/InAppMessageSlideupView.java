package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import o.FocusRequesterModifierKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setRectOutlinetz77jQwdefault;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageSlideupView extends InAppMessageBaseView {
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyWindowInsets$lambda$0() {
        return "Close button view is null or not of the expected class. Not applying window insets.";
    }

    private final View getMessageChevronView() {
        return findViewById(R.id.com_braze_inappmessage_slideup_chevron);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R.id.com_braze_inappmessage_slideup_container);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_slideup_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_slideup_message);
    }

    public final void applyInAppMessageParameters(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_slideup_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            inAppMessageImageView.setInAppMessageImageCropType(iInAppMessage.getCropType());
        }
        InAppMessageImageView inAppMessageImageView2 = this.inAppMessageImageView;
        if (inAppMessageImageView2 != null) {
            inAppMessageImageView2.setAltImageText(iInAppMessage.getAltImageText());
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.getClass();
        super.applyWindowInsets(focusRequesterModifierKt);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(15), 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(focusRequesterModifierKt) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(focusRequesterModifierKt) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(focusRequesterModifierKt) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(focusRequesterModifierKt) + marginLayoutParams.bottomMargin);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        CharSequence text;
        super.resetMessageMargins(z);
        TextView messageIconView = getMessageIconView();
        boolean z2 = (messageIconView == null || (text = messageIconView.getText()) == null || text.length() == 0) ? false : true;
        if (z || z2) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.com_braze_inappmessage_slideup_image_layout);
        if (relativeLayout != null) {
            ViewUtils.removeViewFromParent(relativeLayout);
        }
        TextView textView = (TextView) findViewById(R.id.com_braze_inappmessage_slideup_message);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) (textView != null ? textView.getLayoutParams() : null);
        if (layoutParams != null) {
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
        }
        textView.setLayoutParams(layoutParams);
    }

    public final void setMessageChevron(int i, ClickAction clickAction) {
        clickAction.getClass();
        if (clickAction == ClickAction.NONE) {
            View messageChevronView = getMessageChevronView();
            if (messageChevronView != null) {
                messageChevronView.setVisibility(8);
                return;
            }
            return;
        }
        View messageChevronView2 = getMessageChevronView();
        if (messageChevronView2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageChevronView2, i);
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if (!((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable)) {
            super.setMessageBackgroundColor(i);
            return;
        }
        View messageBackgroundObject2 = getMessageBackgroundObject();
        if (messageBackgroundObject2 != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject2, i);
        }
    }
}
