package com.braze.ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.InAppMessageManagerBase$$ExternalSyntheticLambda1;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.google.android.material.snackbar.Snackbar$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import o.FocusRequesterModifierKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setRectOutlinetz77jQwdefault;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageFullView extends InAppMessageImmersiveBaseView implements IInAppMessageBackEventListener {
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToCloseButton$lambda$0() {
        return "Close button layout params are null or not of the expected class. Not applying window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String applyDisplayCutoutMarginsToContentArea$lambda$0() {
        return "Content area layout params are null or not of the expected class. Not applying window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetMessageMargins$lambda$0$0$0() {
        return "Passing scrollView click event to message clickable view.";
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R.id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public View getMessageBackgroundObject() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_button_single_one);
            if (viewFindViewById2 != null) {
                arrayList.add(viewFindViewById2);
            }
        } else if (i == 2) {
            View viewFindViewById3 = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            View viewFindViewById4 = findViewById(R.id.com_braze_inappmessage_full_button_dual_one);
            View viewFindViewById5 = findViewById(R.id.com_braze_inappmessage_full_button_dual_two);
            if (viewFindViewById4 != null) {
                arrayList.add(viewFindViewById4);
            }
            if (viewFindViewById5 != null) {
                arrayList.add(viewFindViewById5);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return findViewById(R.id.com_braze_inappmessage_full);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R.id.com_braze_inappmessage_full_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R.id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.getClass();
        super.applyWindowInsets(focusRequesterModifierKt);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(focusRequesterModifierKt, messageCloseButtonView);
        }
        if (!this.isGraphic) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
            if (viewFindViewById != null) {
                applyDisplayCutoutMarginsToContentArea(focusRequesterModifierKt, viewFindViewById);
                return;
            }
            return;
        }
        View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_button_layout_single);
        if (viewFindViewById2 != null && viewFindViewById2.getVisibility() == 0) {
            applyDisplayCutoutMarginsToContentArea(focusRequesterModifierKt, viewFindViewById2);
            return;
        }
        View viewFindViewById3 = findViewById(R.id.com_braze_inappmessage_full_button_layout_dual);
        if (viewFindViewById3 == null || viewFindViewById3.getVisibility() != 0) {
            return;
        }
        applyDisplayCutoutMarginsToContentArea(focusRequesterModifierKt, viewFindViewById3);
    }

    public void createAppropriateViews(Activity activity, IInAppMessageImmersive iInAppMessageImmersive, boolean z) {
        activity.getClass();
        iInAppMessageImmersive.getClass();
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_full_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(activity, iInAppMessageImmersive, inAppMessageImageView);
        }
        this.isGraphic = z;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            findViewById(R.id.com_braze_inappmessage_full_text_layout).setOnClickListener(new Snackbar$$ExternalSyntheticLambda0(this, 1, messageClickableView));
        }
    }

    private final void applyDisplayCutoutMarginsToContentArea(FocusRequesterModifierKt focusRequesterModifierKt, View view) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(1), 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int maxSafeLeftInset = ViewUtils.getMaxSafeLeftInset(focusRequesterModifierKt);
        int i = marginLayoutParams.leftMargin;
        marginLayoutParams.setMargins(maxSafeLeftInset + i, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(focusRequesterModifierKt) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(focusRequesterModifierKt) + marginLayoutParams.bottomMargin);
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive iInAppMessageImmersive, IInAppMessageImageView iInAppMessageImageView) {
        iInAppMessageImageView.setInAppMessageImageCropType(iInAppMessageImmersive.getCropType());
        iInAppMessageImageView.setAltImageText(iInAppMessageImmersive.getAltImageText());
        if (!ViewUtils.isRunningOnTablet(activity)) {
            iInAppMessageImageView.setCornersRadiusPx(0.0f);
            return;
        }
        float fConvertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (iInAppMessageImmersive.getImageStyle() == ImageStyle.GRAPHIC) {
            iInAppMessageImageView.setCornersRadiusPx(fConvertDpToPixels);
        } else {
            iInAppMessageImageView.setCornersRadiiPx(fConvertDpToPixels, fConvertDpToPixels, 0.0f, 0.0f);
        }
    }

    private final void applyDisplayCutoutMarginsToCloseButton(FocusRequesterModifierKt focusRequesterModifierKt, View view) {
        if (view.getLayoutParams() == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(28), 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(focusRequesterModifierKt) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(focusRequesterModifierKt) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(focusRequesterModifierKt) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(focusRequesterModifierKt) + marginLayoutParams.bottomMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetMessageMargins$lambda$0$0(InAppMessageFullView inAppMessageFullView, View view, View view2) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) inAppMessageFullView, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(29), 7, (Object) null);
        view.performClick();
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        View messageBackgroundObject = getMessageBackgroundObject();
        if ((messageBackgroundObject != null ? messageBackgroundObject.getBackground() : null) instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageBackgroundObject, i);
            return;
        }
        if (this.isGraphic) {
            super.setMessageBackgroundColor(i);
            return;
        }
        View viewFindViewById = findViewById(R.id.com_braze_inappmessage_full_all_content_parent);
        viewFindViewById.getClass();
        InAppMessageViewUtils.setViewBackgroundColor(viewFindViewById, i);
        View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent);
        viewFindViewById2.getClass();
        InAppMessageViewUtils.setViewBackgroundColor(viewFindViewById2, i);
    }
}
