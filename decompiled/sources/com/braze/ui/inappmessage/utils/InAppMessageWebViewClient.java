package com.braze.ui.inappmessage.utils;

import android.content.Context;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageWebViewClient extends BrazeWebViewClient {
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, String str) {
        super(context, BrazeWebViewClient.Type.IN_APP_MESSAGE, iInAppMessage, iInAppMessageWebViewClientListener, null, str);
        context.getClass();
        iInAppMessage.getClass();
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    public /* synthetic */ InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iInAppMessage, iInAppMessageWebViewClientListener, (i & 8) != 0 ? null : str);
    }
}
