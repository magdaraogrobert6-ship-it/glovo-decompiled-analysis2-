package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.widget.BaseCardView;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewHolder$lambda$0(BaseContentCardView baseContentCardView, Card card, UriAction uriAction, View view) {
        baseContentCardView.handleCardClick(baseContentCardView.applicationContext, card, uriAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        contentCardViewHolder.getClass();
        card.getClass();
        contentCardViewHolder.setPinnedIconVisible(card.isPinned());
        int i = 0;
        contentCardViewHolder.setUnreadBarVisible(this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.isIndicatorHighlighted());
        UriAction uriActionForCard = BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        contentCardViewHolder.MediaSessionCompatQueueItem.setOnClickListener(new BaseContentCardView$$ExternalSyntheticLambda0(this, card, uriActionForCard, i));
        contentCardViewHolder.setActionHintVisible(uriActionForCard != null);
    }

    @Override // com.braze.ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        context.getClass();
        card.getClass();
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        return contentCardsActionListener != null && contentCardsActionListener.onContentCardClicked(context, card, iAction);
    }

    public final void safeSetClipToOutline(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    public final void setViewBackground(View view) {
        view.getClass();
        view.setBackground(getResources().getDrawable(R.drawable.com_braze_content_card_background, null));
        view.setForeground(getResources().getDrawable(R.drawable.com_braze_content_card_scrim, null));
    }

    public final void setOptionalCardImage(ImageView imageView, float f, String str, String str2, Card card) {
        card.getClass();
        if (imageView == null || str == null) {
            return;
        }
        setImageViewToUrl(imageView, str, f, card);
        if (str2 != null) {
            imageView.setContentDescription(str2);
        }
    }
}
