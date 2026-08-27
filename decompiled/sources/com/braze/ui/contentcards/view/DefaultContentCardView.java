package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.braze.models.cards.Card;
import com.braze.ui.R;

/* JADX INFO: loaded from: classes.dex */
public class DefaultContentCardView extends BaseContentCardView<Card> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        contentCardViewHolder.getClass();
        card.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_default_content_card, viewGroup, false);
        viewInflate.getClass();
        return new ContentCardViewHolder(viewInflate, false);
    }
}
