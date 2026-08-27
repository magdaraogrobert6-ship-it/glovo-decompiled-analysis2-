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
public final class ShortNewsCard extends Card {
    private final String altImageText;
    private final CardType cardType;
    private final String description;
    private final String domain;
    private final String imageUrl;
    private final String title;
    private final String url;

    public final String getAltImageText() {
        return this.altImageText;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        String str = this.description;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String url = getUrl();
        String str4 = this.domain;
        String string = super.toString();
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("\n        ShortNewsCard{description='", str, "'\n        imageUrl='", str2, "'\n        title='");
        c8$$ExternalSyntheticOutline0.m(sbM, str3, "'\n        url='", url, "'\n        domain='");
        sbM.append(str4);
        sbM.append("\n        ");
        sbM.append(string);
        sbM.append("}\n\n        ");
        return isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sbM.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject, i9 i9Var, ICardStorageProvider<?> iCardStorageProvider, m9 m9Var) throws JSONException {
        super(jSONObject, i9Var, iCardStorageProvider, m9Var);
        jSONObject.getClass();
        String string = jSONObject.getString(CardKey.SHORT_NEWS_DESCRIPTION.getKey());
        string.getClass();
        this.description = string;
        String string2 = jSONObject.getString(CardKey.SHORT_NEWS_IMAGE.getKey());
        string2.getClass();
        this.imageUrl = string2;
        this.altImageText = JsonUtils.getOptionalString(jSONObject, CardKey.SHORT_NEWS_ALT_IMAGE.getKey());
        this.title = JsonUtils.getOptionalString(jSONObject, CardKey.SHORT_NEWS_TITLE.getKey());
        this.url = JsonUtils.getOptionalString(jSONObject, CardKey.SHORT_NEWS_URL.getKey());
        this.domain = JsonUtils.getOptionalString(jSONObject, CardKey.SHORT_NEWS_DOMAIN.getKey());
        this.cardType = CardType.SHORT_NEWS;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject, i9 i9Var) {
        this(jSONObject, i9Var, null, null, 12, null);
        jSONObject.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject, i9 i9Var, ICardStorageProvider<?> iCardStorageProvider) {
        this(jSONObject, i9Var, iCardStorageProvider, null, 8, null);
        jSONObject.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShortNewsCard(JSONObject jSONObject) {
        this(jSONObject, null, null, null, 14, null);
        jSONObject.getClass();
    }

    public /* synthetic */ ShortNewsCard(JSONObject jSONObject, i9 i9Var, ICardStorageProvider iCardStorageProvider, m9 m9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? null : i9Var, (i & 4) != 0 ? null : iCardStorageProvider, (i & 8) != 0 ? null : m9Var);
    }
}
