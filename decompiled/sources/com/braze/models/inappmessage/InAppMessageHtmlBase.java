package com.braze.models.inappmessage;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.g9;
import bo.app.h2;
import bo.app.i9;
import bo.app.ig$$ExternalSyntheticLambda1;
import bo.app.n1;
import bo.app.na;
import bo.app.qg;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import com.braze.support.b$$ExternalSyntheticLambda1;
import java.util.Map;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageHtmlBase extends InAppMessageBase implements IInAppMessageHtml {
    private String buttonIdClicked;
    private String localAssetsDirectoryUrl;
    private boolean wasButtonClickLogged;

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public String getLocalAssetsDirectoryUrl() {
        return this.localAssetsDirectoryUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public void setLocalAssetsDirectoryUrl(String str) {
        this.localAssetsDirectoryUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$0(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Button Id was null or blank for this html in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Button click already logged for this html in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$3() {
        return "Cannot log an html in-app message button click because the BrazeManager is null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlBase(JSONObject jSONObject, i9 i9Var) {
        super(jSONObject, i9Var, false, false, 12, null);
        jSONObject.getClass();
        i9Var.getClass();
        setOpenUriInWebView(jSONObject.optBoolean(InAppMessageBase.OPEN_URI_IN_WEBVIEW, true));
    }

    @Override // com.braze.models.inappmessage.IInAppMessageHtml
    public boolean logButtonClick(String str) {
        str.getClass();
        String triggerId = getTriggerId();
        i9 brazeManager = getBrazeManager();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b$$ExternalSyntheticLambda1(str, 7), 7, (Object) null);
            return false;
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(26), 6, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged && getMessageType() != MessageType.HTML) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(27), 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(28), 6, (Object) null);
            return false;
        }
        g9 g9VarI = n1.g.i(triggerId, str);
        if (g9VarI != null) {
            ((h2) brazeManager).a(g9VarI);
        }
        this.buttonIdClicked = str;
        this.wasButtonClickLogged = true;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ig$$ExternalSyntheticLambda1(str, triggerId, 24), 7, (Object) null);
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        i9 brazeManager;
        super.onAfterClosed();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) triggerId) || (str = this.buttonIdClicked) == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || (brazeManager = getBrazeManager()) == null) {
            return;
        }
        ((h2) brazeManager).d.b(new qg(new na(getTriggerId(), this.buttonIdClicked)), qg.class);
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        setLocalAssetsDirectoryUrl(((String[]) map.values().toArray(new String[0]))[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$5(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Logged button click for button id: ", str, " and trigger id: ", str2);
    }

    public InAppMessageHtmlBase() {
        setOpenUriInWebView(true);
    }
}
