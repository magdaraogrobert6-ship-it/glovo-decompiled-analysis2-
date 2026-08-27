package com.braze.support;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.i9;
import bo.app.l$$ExternalSyntheticLambda2;
import bo.app.sa;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import java.util.Locale;
import java.util.NoSuchElementException;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final String a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public static final InAppMessageBase a(JSONObject jSONObject, i9 i9Var) {
        MessageType messageType;
        InAppMessageBase inAppMessageFull;
        jSONObject.getClass();
        i9Var.getClass();
        try {
            int i = 0;
            if (jSONObject.optBoolean("is_control", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.D, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(1), 12, (Object) null);
                return new InAppMessageControl(jSONObject, i9Var);
            }
            try {
                String string = jSONObject.getString("type");
                string.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String upperCase = string.toUpperCase(locale);
                upperCase.getClass();
                MessageType[] messageTypeArrValues = MessageType.values();
                int length = messageTypeArrValues.length;
                while (true) {
                    if (i < length) {
                        messageType = messageTypeArrValues[i];
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{messageType.name(), upperCase}, getCieXyz.write())).booleanValue()) {
                            break;
                        }
                        i++;
                    } else {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
            } catch (Exception unused) {
                messageType = null;
            }
            if (messageType == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 17), 12, (Object) null);
                return null;
            }
            int i2 = sa.a[messageType.ordinal()];
            if (i2 == 1) {
                inAppMessageFull = new InAppMessageFull(jSONObject, i9Var);
            } else if (i2 == 2) {
                inAppMessageFull = new InAppMessageModal(jSONObject, i9Var);
            } else if (i2 == 3) {
                inAppMessageFull = new InAppMessageSlideup(jSONObject, i9Var);
            } else if (i2 == 4) {
                inAppMessageFull = new InAppMessageHtmlFull(jSONObject, i9Var);
            } else {
                if (i2 != 5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 18), 12, (Object) null);
                    return null;
                }
                inAppMessageFull = new InAppMessageHtml(jSONObject, i9Var);
            }
            return inAppMessageFull;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda2(jSONObject, 19), 8, (Object) null);
            return null;
        }
    }

    public static final String b(JSONObject jSONObject) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Unknown in-app message type. Returning null: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }

    public static final String c(JSONObject jSONObject) {
        return ff$$ExternalSyntheticOutline0.m("Failed to deserialize the in-app message: ", JsonUtils.getPrettyPrintedString(jSONObject), ". Returning null.");
    }

    public static final String b() {
        return "In-app message string was blank.";
    }

    public static final InAppMessageBase a(String str, i9 i9Var) {
        str.getClass();
        i9Var.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(0), 12, (Object) null);
            return null;
        }
        try {
            return a(new JSONObject(str), i9Var);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 0), 8, (Object) null);
            return null;
        }
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to deserialize the in-app message string: ", str);
    }

    public static final String a() {
        return "Deserializing control in-app message.";
    }

    public static final String a(JSONObject jSONObject) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("In-app message type was unknown for in-app message: ", JsonUtils.getPrettyPrintedString(jSONObject));
    }
}
