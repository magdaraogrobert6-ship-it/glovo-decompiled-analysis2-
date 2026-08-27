package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.braze.models.cards.Card;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.ui.R;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public class TextAnnouncementContentCardView extends BaseContentCardView<TextAnnouncementCard> {

    public final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        final /* synthetic */ TextAnnouncementContentCardView this$0;
        private final TextView title;

        public final TextView getDescription() {
            return this.description;
        }

        public final TextView getTitle() {
            return this.title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(TextAnnouncementContentCardView textAnnouncementContentCardView, View view) {
            super(view, textAnnouncementContentCardView.isUnreadIndicatorEnabled());
            view.getClass();
            this.this$0 = textAnnouncementContentCardView;
            this.title = (TextView) view.findViewById(R.id.com_braze_content_cards_text_announcement_card_title);
            this.description = (TextView) view.findViewById(R.id.com_braze_content_cards_text_announcement_card_description);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnouncementContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        contentCardViewHolder.getClass();
        card.getClass();
        if (card instanceof TextAnnouncementCard) {
            super.bindViewHolder(contentCardViewHolder, card);
            ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
            TextView title = viewHolder.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((TextAnnouncementCard) card).getTitle());
            }
            TextView description = viewHolder.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((TextAnnouncementCard) card).getDescription());
            }
            TextAnnouncementCard textAnnouncementCard = (TextAnnouncementCard) card;
            String domain = textAnnouncementCard.getDomain();
            String url = (domain == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) domain)) ? textAnnouncementCard.getUrl() : textAnnouncementCard.getDomain();
            if (url != null) {
                viewHolder.setActionHintText(url);
            }
            contentCardViewHolder.MediaSessionCompatQueueItem.setContentDescription(textAnnouncementCard.getTitle() + " . " + textAnnouncementCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_text_announcement_content_card, viewGroup, false);
        viewInflate.getClass();
        setViewBackground(viewInflate);
        return new ViewHolder(this, viewInflate);
    }
}
