package com.braze.ui.contentcards.listeners;

import android.content.Context;
import com.braze.models.cards.Card;
import com.braze.ui.actions.IAction;

/* JADX INFO: loaded from: classes.dex */
public interface IContentCardsActionListener {
    default boolean onContentCardClicked(Context context, Card card, IAction iAction) {
        context.getClass();
        card.getClass();
        return false;
    }

    default void onContentCardDismissed(Context context, Card card) {
        context.getClass();
        card.getClass();
    }
}
