package com.braze.models.inappmessage;

import bo.app.i9;
import bo.app.oa;
import com.braze.enums.inappmessage.MessageType;
import com.braze.support.JsonUtils;
import java.util.List;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.instance_delegatelambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageHtml extends InAppMessageHtmlBase {
    private static final String ASSET_URLS_KEY = "asset_urls";
    public static final oa Companion = new oa();
    public static final String IS_PUSH_PRIMER_KEY = "is_push_primer";
    public static final String MESSAGE_FIELDS_KEY = "message_fields";
    private List<String> assetUrls;
    private JSONObject messageFields;
    private Map<String, String> remotePathToLocalAssetMap;

    public final List<String> getAssetUrls() {
        return this.assetUrls;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getLocalPrefetchedAssetPaths() {
        return this.remotePathToLocalAssetMap;
    }

    public final JSONObject getMessageFields() {
        return this.messageFields;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.HTML;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return this.assetUrls;
    }

    public final void setMessageFields(JSONObject jSONObject) {
        this.messageFields = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageHtml(JSONObject jSONObject, i9 i9Var) {
        this(jSONObject, i9Var, jSONObject.optJSONObject(MESSAGE_FIELDS_KEY), JsonUtils.convertStringJsonArrayToList(jSONObject.optJSONArray(ASSET_URLS_KEY)));
        jSONObject.getClass();
        i9Var.getClass();
    }

    public final void setAssetUrls(List<String> list) {
        list.getClass();
        this.assetUrls = list;
    }

    @Override // com.braze.models.inappmessage.InAppMessageHtmlBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        map.getClass();
        this.remotePathToLocalAssetMap = map;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
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

    public final boolean isPushPrimer() {
        JSONObject jSONObject = this.messageFields;
        return jSONObject != null && jSONObject.optBoolean(IS_PUSH_PRIMER_KEY, false);
    }

    public InAppMessageHtml() {
        this.remotePathToLocalAssetMap = SimpleItemTouchHelperCallback.serializer;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this.assetUrls = instance_delegatelambda0Var;
        this.messageFields = new JSONObject();
        this.assetUrls = instance_delegatelambda0Var;
    }

    private InAppMessageHtml(JSONObject jSONObject, i9 i9Var, JSONObject jSONObject2, List<String> list) {
        super(jSONObject, i9Var);
        this.remotePathToLocalAssetMap = SimpleItemTouchHelperCallback.serializer;
        this.messageFields = jSONObject2;
        this.assetUrls = list;
    }
}
