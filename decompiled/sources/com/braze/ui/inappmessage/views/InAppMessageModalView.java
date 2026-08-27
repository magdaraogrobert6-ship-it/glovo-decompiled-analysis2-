package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setRectOutlinetz77jQwdefault;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {
    private InAppMessageModal inAppMessage;
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final InAppMessageModal getInAppMessage() {
        return this.inAppMessage;
    }

    public final InAppMessageImageView getInAppMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    public final void setInAppMessage(InAppMessageModal inAppMessageModal) {
        this.inAppMessage = inAppMessageModal;
    }

    public final void setInAppMessageImageView(InAppMessageImageView inAppMessageImageView) {
        this.inAppMessageImageView = inAppMessageImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetMessageMargins$lambda$0$0() {
        return "Passing scrollView click event to message clickable view.";
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R.id.com_braze_inappmessage_modal_frame);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View viewFindViewById = findViewById(R.id.com_braze_inappmessage_modal_button_layout_single);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = findViewById(R.id.com_braze_inappmessage_modal_button_single_one);
            if (viewFindViewById2 != null) {
                arrayList.add(viewFindViewById2);
            }
        } else if (i == 2) {
            View viewFindViewById3 = findViewById(R.id.com_braze_inappmessage_modal_button_layout_dual);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(0);
            }
            View viewFindViewById4 = findViewById(R.id.com_braze_inappmessage_modal_button_dual_one);
            View viewFindViewById5 = findViewById(R.id.com_braze_inappmessage_modal_button_dual_two);
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
        return findViewById(R.id.com_braze_inappmessage_modal);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R.id.com_braze_inappmessage_modal_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R.id.com_braze_inappmessage_modal_message);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int i) {
        View viewFindViewById = findViewById(R.id.com_braze_inappmessage_modal);
        viewFindViewById.getClass();
        InAppMessageViewUtils.setViewBackgroundColorFilter(viewFindViewById, i);
    }

    public void applyInAppMessageParameters(Context context, InAppMessageModal inAppMessageModal) {
        context.getClass();
        inAppMessageModal.getClass();
        this.inAppMessage = inAppMessageModal;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R.id.com_braze_inappmessage_modal_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(context, inAppMessageModal, inAppMessageImageView);
        }
        resizeGraphicFrameIfAppropriate(context, inAppMessageModal);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Context context = getContext();
        context.getClass();
        resizeGraphicFrameIfAppropriate(context, this.inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.com_braze_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        View viewFindViewById = findViewById(R.id.com_braze_inappmessage_modal_text_layout);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ThrottledButton$$ExternalSyntheticLambda0(3, this));
        }
    }

    public void setInAppMessageImageViewAttributes(Context context, IInAppMessageImmersive iInAppMessageImmersive, IInAppMessageImageView iInAppMessageImageView) {
        context.getClass();
        iInAppMessageImmersive.getClass();
        iInAppMessageImageView.getClass();
        float fConvertDpToPixels = (float) ViewUtils.convertDpToPixels(context, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (iInAppMessageImmersive.getImageStyle() == ImageStyle.GRAPHIC) {
            iInAppMessageImageView.setCornersRadiusPx(fConvertDpToPixels);
        } else {
            iInAppMessageImageView.setCornersRadiiPx(fConvertDpToPixels, fConvertDpToPixels, 0.0f, 0.0f);
        }
        iInAppMessageImageView.setInAppMessageImageCropType(iInAppMessageImmersive.getCropType());
        iInAppMessageImageView.setAltImageText(iInAppMessageImmersive.getAltImageText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resizeGraphicFrameIfAppropriate$lambda$0(InAppMessageModalView inAppMessageModalView, int i, int i2, int i3, double d) {
        double dMin = Math.min(inAppMessageModalView.getMeasuredWidth() - i, i2);
        double dMin2 = Math.min(inAppMessageModalView.getMeasuredHeight() - i, i3);
        double d2 = dMin / dMin2;
        View viewFindViewById = inAppMessageModalView.findViewById(R.id.com_braze_inappmessage_modal_graphic_bound);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.getClass();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (d >= d2) {
                layoutParams2.width = (int) dMin;
                layoutParams2.height = (int) (dMin / d);
            } else {
                layoutParams2.width = (int) (d * dMin2);
                layoutParams2.height = (int) dMin2;
            }
            viewFindViewById.setLayoutParams(layoutParams2);
        }
    }

    public void resizeGraphicFrameIfAppropriate(Context context, InAppMessageModal inAppMessageModal) {
        Bitmap bitmap;
        context.getClass();
        if (inAppMessageModal == null || (bitmap = inAppMessageModal.getBitmap()) == null || inAppMessageModal.getImageStyle() != ImageStyle.GRAPHIC) {
            return;
        }
        final double width = ((double) bitmap.getWidth()) / ((double) bitmap.getHeight());
        Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_margin);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_max_width);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.com_braze_inappmessage_modal_max_height);
        post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                InAppMessageModalView.resizeGraphicFrameIfAppropriate$lambda$0(this.f$0, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, width);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetMessageMargins$lambda$0(InAppMessageModalView inAppMessageModalView, View view) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) inAppMessageModalView, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(14), 7, (Object) null);
        View messageClickableView = inAppMessageModalView.getMessageClickableView();
        if (messageClickableView != null) {
            messageClickableView.performClick();
        }
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public Drawable getMessageBackgroundObject() {
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            return messageClickableView.getBackground();
        }
        return null;
    }
}
