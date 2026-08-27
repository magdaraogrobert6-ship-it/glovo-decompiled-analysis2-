package com.braze.models.cards;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.i9;
import bo.app.m9;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isCurrentlyDisplayingInAppMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ImageOnlyCard extends Card {
    private final String altImageText;
    private final float aspectRatio;
    private final CardType cardType;
    private final String imageUrl;
    private final String url;

    public final String getAltImageText() {
        return this.altImageText;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        String str = this.imageUrl;
        String url = getUrl();
        float f = this.aspectRatio;
        String string = super.toString();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("\n        ImageOnlyCard{imageUrl='", str, "'\n        url='", url, "'\n        aspectRatio=");
        sbM.append(f);
        sbM.append("\n        ");
        sbM.append(string);
        sbM.append("}\n        \n        ");
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jSONObject, i9 i9Var, ICardStorageProvider<?> iCardStorageProvider, m9 m9Var) throws JSONException {
        super(jSONObject, i9Var, iCardStorageProvider, m9Var);
        jSONObject.getClass();
        String string = jSONObject.getString(CardKey.IMAGE_ONLY_IMAGE.getKey());
        string.getClass();
        this.imageUrl = string;
        this.altImageText = JsonUtils.getOptionalString(jSONObject, CardKey.IMAGE_ONLY_ALT_IMAGE.getKey());
        this.url = JsonUtils.getOptionalString(jSONObject, CardKey.IMAGE_ONLY_URL.getKey());
        this.aspectRatio = (float) jSONObject.optDouble(CardKey.IMAGE_ONLY_ASPECT_RATIO.getKey(), 0.0d);
        this.cardType = CardType.IMAGE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jSONObject, i9 i9Var) {
        this(jSONObject, i9Var, null, null, 12, null);
        jSONObject.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jSONObject, i9 i9Var, ICardStorageProvider<?> iCardStorageProvider) {
        this(jSONObject, i9Var, iCardStorageProvider, null, 8, null);
        jSONObject.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageOnlyCard(JSONObject jSONObject) {
        this(jSONObject, null, null, null, 14, null);
        jSONObject.getClass();
    }

    public /* synthetic */ ImageOnlyCard(JSONObject jSONObject, i9 i9Var, ICardStorageProvider iCardStorageProvider, m9 m9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? null : i9Var, (i & 4) != 0 ? null : iCardStorageProvider, (i & 8) != 0 ? null : m9Var);
    }
}
