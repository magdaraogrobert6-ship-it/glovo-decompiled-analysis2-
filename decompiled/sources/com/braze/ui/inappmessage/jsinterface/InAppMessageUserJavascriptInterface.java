package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import com.braze.ui.UserJavascriptInterfaceBase;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageUserJavascriptInterface extends UserJavascriptInterfaceBase {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageUserJavascriptInterface(Context context) {
        super(context);
        context.getClass();
        this.context = context;
    }
}
