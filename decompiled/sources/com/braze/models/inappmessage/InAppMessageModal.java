package com.braze.models.inappmessage;

import bo.app.i9;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.MessageType;
import java.util.Locale;
import java.util.NoSuchElementException;
import o.getCieXyz;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageModal extends InAppMessageImmersiveBase {
    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.MODAL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageModal(JSONObject jSONObject, i9 i9Var) {
        super(jSONObject, i9Var);
        jSONObject.getClass();
        i9Var.getClass();
        CropType cropType = getImageStyle() == ImageStyle.GRAPHIC ? CropType.CENTER_CROP : CropType.FIT_CENTER;
        try {
            String string = jSONObject.getString(InAppMessageBase.CROP_TYPE);
            string.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = string.toUpperCase(locale);
            upperCase.getClass();
            for (CropType cropType2 : CropType.values()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cropType2.name(), upperCase}, getCieXyz.write())).booleanValue()) {
                    cropType = cropType2;
                    setCropType(cropType);
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }

    @Override // com.braze.models.inappmessage.InAppMessageImmersiveBase, com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
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

    public InAppMessageModal() {
    }
}
