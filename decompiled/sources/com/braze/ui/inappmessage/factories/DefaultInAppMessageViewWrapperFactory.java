package com.braze.ui.inappmessage.factories;

import android.view.View;
import android.view.animation.Animation;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageViewWrapperFactory implements IInAppMessageViewWrapperFactory {
    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2) {
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
        return new DefaultInAppMessageViewWrapper(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, null, null, 384, null);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory
    public IInAppMessageViewWrapper createInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<? extends View> list, View view3) {
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
        return new DefaultInAppMessageViewWrapper(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, list, view3);
    }
}
