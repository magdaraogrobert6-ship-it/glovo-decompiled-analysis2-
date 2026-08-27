package com.braze.models.cards;

import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.i9;
import bo.app.m9;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ControlCard extends Card {
    private final CardType cardType;

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlCard(JSONObject jSONObject, i9 i9Var, ICardStorageProvider<?> iCardStorageProvider, m9 m9Var) {
        super(jSONObject, i9Var, iCardStorageProvider, m9Var);
        jSONObject.getClass();
        this.cardType = CardType.CONTROL;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return ff$$ExternalSyntheticOutline0.m("ControlCard{", super.toString(), "}");
    }
}
