package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.R;
import com.braze.ui.contentcards.adapters.ContentCardAdapter$$ExternalSyntheticLambda0;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageButtonViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.google.android.material.internal.ViewUtils$$ExternalSyntheticLambda0;
import java.util.List;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setRectOutlinetz77jQwdefault;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageImmersiveBaseView extends InAppMessageBaseView implements IInAppMessageImmersiveView {
    public InAppMessageImmersiveBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i);

    public abstract TextView getMessageHeaderTextView();

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public abstract TextView getMessageTextView();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLargerCloseButtonClickArea$lambda$0() {
        return "Cannot increase click area for view if view and/or parent are null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setLargerCloseButtonClickArea$lambda$1(View view, InAppMessageImmersiveBaseView inAppMessageImmersiveBaseView, ViewParent viewParent) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = inAppMessageImmersiveBaseView.getContext().getResources().getDimensionPixelSize(R.dimen.com_braze_inappmessage_close_button_click_area_height);
        int iWidth = (dimensionPixelSize - rect.width()) / 2;
        int iHeight = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= iHeight;
        rect.bottom += iHeight;
        rect.left -= iWidth;
        rect.right += iWidth;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setupDirectionalNavigation$lambda$0() {
        return "closeButtonId is null. Cannot continue setting up navigation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setupDirectionalNavigation$lambda$1(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Cannot setup directional navigation. Got unsupported number of buttons: ");
    }

    public void setLargerCloseButtonClickArea(View view) {
        if (view == null || view.getParent() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(13), 6, (Object) null);
            return;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            ((View) parent).post(new WorkerKt$$ExternalSyntheticLambda2(view, this, parent, 23));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        if (!InAppMessageViewUtils.isApiBelowBaklava() || isInTouchMode() || keyEvent.getKeyCode() != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (!InAppMessageViewUtils.isApiBelowBaklava() || i != 4 || !BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return super.onKeyDown(i, keyEvent);
        }
        InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
        return true;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        TextView messageTextView = getMessageTextView();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) String.valueOf(messageTextView != null ? messageTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) String.valueOf(messageHeaderTextView != null ? messageHeaderTextView.getText() : null))) {
            ViewUtils.removeViewFromParent(getMessageHeaderTextView());
        }
        InAppMessageViewUtils.resetMessageMarginsIfNecessary(getMessageTextView(), getMessageHeaderTextView());
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessage(String str) {
        str.getClass();
        super.setMessage(str);
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setContentDescription(str);
        }
    }

    public void setMessageButtons(List<? extends MessageButton> list) {
        list.getClass();
        InAppMessageButtonViewUtils.setButtons(getMessageButtonViews(list.size()), list);
    }

    public void setMessageHeaderText(String str) {
        str.getClass();
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            messageHeaderTextView.setText(str);
        }
        TextView messageHeaderTextView2 = getMessageHeaderTextView();
        if (messageHeaderTextView2 != null) {
            messageHeaderTextView2.setContentDescription(str);
        }
    }

    public void setMessageHeaderTextAlignment(TextAlign textAlign) {
        textAlign.getClass();
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextAlignment(messageHeaderTextView, textAlign);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public void setupDirectionalNavigation(int i) {
        View view;
        List<View> messageButtonViews = getMessageButtonViews(i);
        View messageCloseButtonView = getMessageCloseButtonView();
        Integer numValueOf = messageCloseButtonView != null ? Integer.valueOf(messageCloseButtonView.getId()) : null;
        if (numValueOf == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(12), 6, (Object) null);
            return;
        }
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                view = messageButtonViews.get(0);
                int id = view.getId();
                view.setNextFocusLeftId(numValueOf.intValue());
                view.setNextFocusRightId(numValueOf.intValue());
                view.setNextFocusUpId(numValueOf.intValue());
                view.setNextFocusDownId(numValueOf.intValue());
                messageCloseButtonView.setNextFocusUpId(id);
                messageCloseButtonView.setNextFocusDownId(id);
                messageCloseButtonView.setNextFocusRightId(id);
                messageCloseButtonView.setNextFocusLeftId(id);
                numValueOf = Integer.valueOf(id);
            } else if (i != 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ContentCardAdapter$$ExternalSyntheticLambda0(i, 5), 6, (Object) null);
            } else {
                view = messageButtonViews.get(1);
                View view2 = messageButtonViews.get(0);
                int id2 = view.getId();
                int id3 = view2.getId();
                view.setNextFocusLeftId(id3);
                view.setNextFocusRightId(id3);
                view.setNextFocusUpId(numValueOf.intValue());
                view.setNextFocusDownId(numValueOf.intValue());
                view2.setNextFocusLeftId(id2);
                view2.setNextFocusRightId(id2);
                view2.setNextFocusUpId(numValueOf.intValue());
                view2.setNextFocusDownId(numValueOf.intValue());
                messageCloseButtonView.setNextFocusUpId(id2);
                messageCloseButtonView.setNextFocusDownId(id2);
                messageCloseButtonView.setNextFocusRightId(id2);
                messageCloseButtonView.setNextFocusLeftId(id3);
                numValueOf = Integer.valueOf(id2);
            }
            messageCloseButtonView = view;
        } else {
            messageCloseButtonView.setNextFocusUpId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusDownId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusRightId(numValueOf.intValue());
            messageCloseButtonView.setNextFocusLeftId(numValueOf.intValue());
        }
        setNextFocusUpId(numValueOf.intValue());
        setNextFocusDownId(numValueOf.intValue());
        setNextFocusRightId(numValueOf.intValue());
        setNextFocusLeftId(numValueOf.intValue());
        if (messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.post(new ViewUtils$$ExternalSyntheticLambda0(i2, messageCloseButtonView));
        }
    }

    public void setMessageCloseButtonColor(int i) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(messageCloseButtonView, i);
        }
    }

    public void setMessageHeaderTextColor(int i) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            InAppMessageViewUtils.setTextViewColor(messageHeaderTextView, i);
        }
    }

    public void setFrameColor(int i) {
        View frameView = getFrameView();
        if (frameView != null) {
            InAppMessageViewUtils.setFrameColor(frameView, Integer.valueOf(i));
        }
    }
}
