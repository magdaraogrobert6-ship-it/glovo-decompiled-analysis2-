package com.braze.models.inappmessage;

import bo.app.i9;
import com.braze.enums.inappmessage.MessageType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageHtmlFull extends InAppMessageZippedAssetHtmlBase {
    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.HTML_FULL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtmlFull(JSONObject jSONObject, i9 i9Var) {
        super(jSONObject, i9Var);
        jSONObject.getClass();
        i9Var.getClass();
    }

    @Override // com.braze.models.inappmessage.InAppMessageZippedAssetHtmlBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.put("type", getMessageType().name());
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    public InAppMessageHtmlFull() {
    }
}
