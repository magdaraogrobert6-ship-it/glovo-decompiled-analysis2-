package com.braze.ui.inappmessage.listeners;

import android.view.View;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageViewLifecycleListener {
    void afterClosed(IInAppMessage iInAppMessage);

    void afterOpened(View view, IInAppMessage iInAppMessage);

    void beforeClosed(View view, IInAppMessage iInAppMessage);

    void beforeOpened(View view, IInAppMessage iInAppMessage);

    void onButtonClicked(MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive);

    void onClicked(View view, IInAppMessage iInAppMessage);

    void onDismissed(View view, IInAppMessage iInAppMessage);
}
