package com.braze.ui.inappmessage.listeners;

import android.os.Bundle;
import com.braze.models.inappmessage.IInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public interface IHtmlInAppMessageActionListener {
    default void onCloseClicked(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        iInAppMessage.getClass();
        str.getClass();
        bundle.getClass();
    }

    default boolean onCustomEventFired(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        iInAppMessage.getClass();
        str.getClass();
        bundle.getClass();
        return false;
    }

    default boolean onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        iInAppMessage.getClass();
        str.getClass();
        bundle.getClass();
        return false;
    }
}
