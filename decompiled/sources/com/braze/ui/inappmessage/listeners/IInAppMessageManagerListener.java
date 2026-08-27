package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.inappmessage.InAppMessageOperation;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageManagerListener {
    default void afterInAppMessageViewClosed(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
    }

    default boolean onInAppMessageClicked(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        return false;
    }

    default void onInAppMessageDismissed(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
    }

    default void afterInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        view.getClass();
        iInAppMessage.getClass();
    }

    default InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        return InAppMessageOperation.DISPLAY_NOW;
    }

    default void beforeInAppMessageViewClosed(View view, IInAppMessage iInAppMessage) {
        view.getClass();
        iInAppMessage.getClass();
    }

    default void beforeInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
        view.getClass();
        iInAppMessage.getClass();
    }

    default boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton) {
        iInAppMessage.getClass();
        messageButton.getClass();
        return false;
    }
}
