package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.activity.EdgeToEdge$$ExternalSyntheticLambda0;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.Orientation;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.ui.R;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.inappmessage.views.InAppMessageImageView;
import com.braze.ui.support.ViewUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageFullViewFactory implements IInAppMessageViewFactory {
    private static final int BUTTONS_PRESENT_SCROLLVIEW_EXCESS_HEIGHT_VALUE_IN_DP = 64;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    public InAppMessageFullView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        activity.getClass();
        iInAppMessage.getClass();
        Context applicationContext = activity.getApplicationContext();
        InAppMessageFull inAppMessageFull = (InAppMessageFull) iInAppMessage;
        boolean z = inAppMessageFull.getImageStyle() == ImageStyle.GRAPHIC;
        InAppMessageFullView appropriateFullView = getAppropriateFullView(activity, z);
        appropriateFullView.createAppropriateViews(activity, inAppMessageFull, z);
        String appropriateImageUrl = InAppMessageBaseView.Companion.getAppropriateImageUrl(inAppMessageFull);
        if (appropriateImageUrl != null && appropriateImageUrl.length() != 0) {
            Braze.Companion companion = Braze.Companion;
            applicationContext.getClass();
            IBrazeImageLoader imageLoader = companion.getInstance(applicationContext).getImageLoader();
            ImageView messageImageView = appropriateFullView.getMessageImageView();
            if (messageImageView != null) {
                imageLoader.renderUrlIntoInAppMessageView(applicationContext, iInAppMessage, appropriateImageUrl, messageImageView, BrazeViewBounds.NO_BOUNDS);
            }
        }
        View frameView = appropriateFullView.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener(null);
        }
        appropriateFullView.setMessageBackgroundColor(inAppMessageFull.getBackgroundColor());
        Integer frameColor = inAppMessageFull.getFrameColor();
        if (frameColor != null) {
            appropriateFullView.setFrameColor(frameColor.intValue());
        }
        appropriateFullView.setMessageButtons(inAppMessageFull.getMessageButtons());
        appropriateFullView.setMessageCloseButtonColor(inAppMessageFull.getCloseButtonColor());
        if (!z) {
            String message = inAppMessageFull.getMessage();
            if (message != null) {
                appropriateFullView.setMessage(message);
            }
            appropriateFullView.setMessageTextColor(inAppMessageFull.getMessageTextColor());
            String header = inAppMessageFull.getHeader();
            if (header != null) {
                appropriateFullView.setMessageHeaderText(header);
            }
            appropriateFullView.setMessageHeaderTextColor(inAppMessageFull.getHeaderTextColor());
            appropriateFullView.setMessageHeaderTextAlignment(inAppMessageFull.getHeaderTextAlign());
            appropriateFullView.setMessageTextAlign(inAppMessageFull.getMessageTextAlign());
            appropriateFullView.resetMessageMargins(inAppMessageFull.getImageDownloadSuccessful());
            ImageView messageImageView2 = appropriateFullView.getMessageImageView();
            messageImageView2.getClass();
            ((InAppMessageImageView) messageImageView2).setToHalfParentHeight(true);
        }
        appropriateFullView.setLargerCloseButtonClickArea(appropriateFullView.getMessageCloseButtonView());
        resetLayoutParamsIfAppropriate(activity, inAppMessageFull, appropriateFullView);
        appropriateFullView.setupDirectionalNavigation(inAppMessageFull.getMessageButtons().size());
        View viewFindViewById = appropriateFullView.findViewById(R.id.com_braze_inappmessage_full_scrollview);
        if (viewFindViewById != null) {
            viewFindViewById.post(new EdgeToEdge$$ExternalSyntheticLambda0(appropriateFullView.findViewById(R.id.com_braze_inappmessage_full_all_content_parent), appropriateFullView, inAppMessageFull, applicationContext, viewFindViewById));
        }
        return appropriateFullView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageView$lambda$4(View view, InAppMessageFullView inAppMessageFullView, InAppMessageFull inAppMessageFull, Context context, View view2) {
        int height = view.getHeight() / 2;
        ViewGroup.LayoutParams layoutParams = inAppMessageFullView.findViewById(R.id.com_braze_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iConvertDpToPixels = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        if (!inAppMessageFull.getMessageButtons().isEmpty()) {
            context.getClass();
            iConvertDpToPixels += (int) ViewUtils.convertDpToPixels(context, 64.0d);
        }
        ViewUtils.setHeightOnViewLayoutParams(view2, Math.min(view2.getHeight(), height - iConvertDpToPixels));
        view2.requestLayout();
        ImageView messageImageView = inAppMessageFullView.getMessageImageView();
        if (messageImageView != null) {
            messageImageView.requestLayout();
        }
    }

    @SuppressLint
    public final InAppMessageFullView getAppropriateFullView(Activity activity, boolean z) {
        activity.getClass();
        if (z) {
            View viewInflate = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_full_graphic, (ViewGroup) null);
            viewInflate.getClass();
            return (InAppMessageFullView) viewInflate;
        }
        View viewInflate2 = activity.getLayoutInflater().inflate(R.layout.com_braze_inappmessage_full, (ViewGroup) null);
        viewInflate2.getClass();
        return (InAppMessageFullView) viewInflate2;
    }

    private final boolean resetLayoutParamsIfAppropriate(Activity activity, IInAppMessage iInAppMessage, InAppMessageFullView inAppMessageFullView) {
        if (!ViewUtils.isRunningOnTablet(activity) || iInAppMessage.getOrientation() == Orientation.ANY) {
            return false;
        }
        int longEdge = inAppMessageFullView.getLongEdge();
        int shortEdge = inAppMessageFullView.getShortEdge();
        if (longEdge <= 0 || shortEdge <= 0) {
            return false;
        }
        RelativeLayout.LayoutParams layoutParams = iInAppMessage.getOrientation() == Orientation.LANDSCAPE ? new RelativeLayout.LayoutParams(longEdge, shortEdge) : new RelativeLayout.LayoutParams(shortEdge, longEdge);
        layoutParams.addRule(13, -1);
        View messageBackgroundObject = inAppMessageFullView.getMessageBackgroundObject();
        if (messageBackgroundObject == null) {
            return true;
        }
        messageBackgroundObject.setLayoutParams(layoutParams);
        return true;
    }
}
