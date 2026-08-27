package com.braze.models.inappmessage;

import bo.app.i9;
import bo.app.ya;
import java.util.ArrayList;
import java.util.List;
import o.hideCurrentlyDisplayingInAppMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageZippedAssetHtmlBase extends InAppMessageHtmlBase implements IInAppMessageZippedAssetHtml {
    public static final ya Companion = new ya();
    private static final String HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL = "zipped_assets_url";
    private String assetsZipRemoteUrl;

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public String getAssetsZipRemoteUrl() {
        return this.assetsZipRemoteUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageZippedAssetHtml
    public void setAssetsZipRemoteUrl(String str) {
        this.assetsZipRemoteUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String assetsZipRemoteUrl = getAssetsZipRemoteUrl();
        if (assetsZipRemoteUrl != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) assetsZipRemoteUrl)) {
            arrayList.add(assetsZipRemoteUrl);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageZippedAssetHtmlBase(JSONObject jSONObject, i9 i9Var) {
        super(jSONObject, i9Var);
        jSONObject.getClass();
        i9Var.getClass();
        String strOptString = jSONObject.optString(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL);
        strOptString.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) strOptString)) {
            return;
        }
        setAssetsZipRemoteUrl(strOptString);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject jSONObjectForJsonPut = super.forJsonPut();
        try {
            jSONObjectForJsonPut.putOpt(HTML_CONTENT_ZIPPED_ASSETS_REMOTE_URL, getAssetsZipRemoteUrl());
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    public InAppMessageZippedAssetHtmlBase() {
    }
}
