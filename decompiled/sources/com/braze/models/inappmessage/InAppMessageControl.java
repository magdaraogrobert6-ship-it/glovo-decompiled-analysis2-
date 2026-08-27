package com.braze.models.inappmessage;

import bo.app.g9;
import bo.app.h2;
import bo.app.i9;
import bo.app.n1;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.Banner$$ExternalSyntheticLambda0;
import com.braze.support.BrazeLogger;
import java.util.concurrent.atomic.AtomicBoolean;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageControl extends InAppMessageBase {
    private final AtomicBoolean controlImpressionLogged;

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.CONTROL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0() {
        return "Control impression already logged for this in-app message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$1() {
        return "Trigger Id not found (this is expected for test sends). Not logging in-app message control impression.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$2() {
        return "Cannot log an in-app message control impression because the BrazeManager is null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$3() {
        return "Logging control in-app message impression event";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        if (this.controlImpressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(22), 6, (Object) null);
            return false;
        }
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(25), 6, (Object) null);
            return false;
        }
        if (getBrazeManager() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(23), 6, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(24), 6, (Object) null);
        String triggerId2 = getTriggerId();
        g9 g9VarK = triggerId2 != null ? n1.g.k(triggerId2, getMessageExtras()) : null;
        if (g9VarK != null) {
            i9 brazeManager = getBrazeManager();
            if (brazeManager != null) {
                ((h2) brazeManager).a(g9VarK);
            }
            this.controlImpressionLogged.set(true);
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageControl(JSONObject jSONObject, i9 i9Var) {
        super(jSONObject, i9Var, false, false, 12, null);
        jSONObject.getClass();
        i9Var.getClass();
        this.controlImpressionLogged = new AtomicBoolean(false);
    }
}
