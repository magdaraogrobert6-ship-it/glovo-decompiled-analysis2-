package com.braze.models.inappmessage;

import android.graphics.Bitmap;
import bo.app.i9;
import bo.app.xa;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.hideCurrentlyDisplayingInAppMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class InAppMessageWithImageBase extends InAppMessageBase implements IInAppMessageWithImage {
    public static final xa Companion = new xa();
    private static final String REMOTE_IMAGE_URL = "image_url";
    private Bitmap bitmap;
    private boolean imageDownloadSuccessful;
    private String localImageUrl;
    private String remoteImageUrl;

    public static /* synthetic */ void getImageDownloadSuccessful$annotations() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public boolean getImageDownloadSuccessful() {
        return this.imageDownloadSuccessful;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getImageUrl() {
        return getRemoteImageUrl();
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getLocalImageUrl() {
        return this.localImageUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public String getRemoteImageUrl() {
        return this.remoteImageUrl;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setImageDownloadSuccessful(boolean z) {
        this.imageDownloadSuccessful = z;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setLocalImageUrl(String str) {
        this.localImageUrl = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageWithImage
    public void setRemoteImageUrl(String str) {
        this.remoteImageUrl = str;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        ArrayList arrayList = new ArrayList();
        String remoteImageUrl = getRemoteImageUrl();
        if (remoteImageUrl != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) remoteImageUrl)) {
            arrayList.add(remoteImageUrl);
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageWithImageBase(JSONObject jSONObject, i9 i9Var) {
        super(jSONObject, i9Var, false, false, 12, null);
        jSONObject.getClass();
        i9Var.getClass();
        setRemoteImageUrl(jSONObject.optString(REMOTE_IMAGE_URL));
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        setLocalImageUrl(((String[]) map.values().toArray(new String[0]))[0]);
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
            jSONObjectForJsonPut.putOpt(REMOTE_IMAGE_URL, getRemoteImageUrl());
        } catch (JSONException unused) {
        }
        return jSONObjectForJsonPut;
    }

    public InAppMessageWithImageBase() {
    }
}
