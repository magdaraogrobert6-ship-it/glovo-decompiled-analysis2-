package com.braze.ui.inappmessage.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.window.BackEvent;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.IInAppMessageWithImage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.UriUtils$$ExternalSyntheticLambda0;
import com.braze.ui.support.ViewUtils;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.FocusRequesterModifierKt;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageBaseView extends RelativeLayout implements IInAppMessageView, IInAppMessageBackEventListener {
    public static final Companion Companion = new Companion(null);
    private static final float PREDICTIVE_BACK_MAX_SCALE_FACTOR = 0.85f;
    private static final int TRANSLATE_X_FACTOR = 2;
    private static final int TRANSLATE_Y_FACTOR = 8;
    private boolean hasAppliedWindowInsets;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String getAppropriateImageUrl$lambda$0(String str) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Local bitmap file does not exist. Using remote url instead. Local path: ", str);
        }

        public final String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
            iInAppMessageWithImage.getClass();
            String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
            if (localImageUrl != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) localImageUrl)) {
                if (new File(localImageUrl).exists()) {
                    return localImageUrl;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriUtils$$ExternalSyntheticLambda0(localImageUrl, 1), 6, (Object) null);
            }
            return iInAppMessageWithImage.getRemoteImageUrl();
        }

        private Companion() {
        }
    }

    public InAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public abstract Object getMessageBackgroundObject();

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public static final String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
        return Companion.getAppropriateImageUrl(iInAppMessageWithImage);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageBackEventListener
    public void onBackCancelled() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f), ObjectAnimator.ofFloat(this, "translationX", 0.0f));
        animatorSet.start();
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageBackEventListener
    public void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            float width = getWidth();
            float height = getHeight();
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", PREDICTIVE_BACK_MAX_SCALE_FACTOR), ObjectAnimator.ofFloat(this, "scaleY", PREDICTIVE_BACK_MAX_SCALE_FACTOR), ObjectAnimator.ofFloat(this, "translationX", (width - (width * PREDICTIVE_BACK_MAX_SCALE_FACTOR)) / 2.0f), ObjectAnimator.ofFloat(this, "translationY", (height - (PREDICTIVE_BACK_MAX_SCALE_FACTOR * height)) / 8.0f));
            animatorSet.start();
        }
    }

    public void setMessage(String str) {
        str.getClass();
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setText(str);
        }
    }

    public void setMessageIcon(String str, int i, int i2) {
        str.getClass();
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            context.getClass();
            InAppMessageViewUtils.setIcon(context, str, i, i2, messageIconView);
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        bitmap.getClass();
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            InAppMessageViewUtils.setImage(bitmap, messageImageView);
        }
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        textAlign.getClass();
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageTextView, textAlign);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(FocusRequesterModifierKt focusRequesterModifierKt) {
        focusRequesterModifierKt.getClass();
        setHasAppliedWindowInsets(true);
    }

    public void setMessageBackgroundColor(int i) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        messageBackgroundObject.getClass();
        InAppMessageViewUtils.setViewBackgroundColor((View) messageBackgroundObject, i);
    }

    public void setMessageTextColor(int i) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageTextView, i);
        }
    }

    public void resetMessageMargins(boolean z) {
        CharSequence text;
        String string;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (z) {
                ViewUtils.removeViewFromParent(getMessageIconView());
            } else {
                ViewUtils.removeViewFromParent(messageImageView);
            }
        }
        TextView messageIconView = getMessageIconView();
        if (messageIconView == null || (text = messageIconView.getText()) == null || (string = text.toString()) == null || !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) string)) {
            return;
        }
        ViewUtils.removeViewFromParent(getMessageIconView());
    }
}
