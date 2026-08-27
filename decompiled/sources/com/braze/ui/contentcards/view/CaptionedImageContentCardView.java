package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.ui.R;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public class CaptionedImageContentCardView extends BaseContentCardView<CaptionedImageCard> {

    public final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        private final ImageView imageView;
        final /* synthetic */ CaptionedImageContentCardView this$0;
        private final TextView title;

        public final TextView getDescription() {
            return this.description;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final TextView getTitle() {
            return this.title;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(CaptionedImageContentCardView captionedImageContentCardView, View view) {
            super(view, captionedImageContentCardView.isUnreadIndicatorEnabled());
            view.getClass();
            this.this$0 = captionedImageContentCardView;
            this.title = (TextView) view.findViewById(R.id.com_braze_content_cards_captioned_image_title);
            this.description = (TextView) view.findViewById(R.id.com_braze_content_cards_captioned_image_description);
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_captioned_image_card_image);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionedImageContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        contentCardViewHolder.getClass();
        card.getClass();
        if (card instanceof CaptionedImageCard) {
            super.bindViewHolder(contentCardViewHolder, card);
            ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
            TextView title = viewHolder.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((CaptionedImageCard) card).getTitle());
            }
            TextView description = viewHolder.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((CaptionedImageCard) card).getDescription());
            }
            CaptionedImageCard captionedImageCard = (CaptionedImageCard) card;
            String domain = captionedImageCard.getDomain();
            String url = (domain == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) domain)) ? captionedImageCard.getUrl() : captionedImageCard.getDomain();
            if (url != null) {
                viewHolder.setActionHintText(url);
            }
            setOptionalCardImage(viewHolder.getImageView(), captionedImageCard.getAspectRatio(), captionedImageCard.getImageUrl(), captionedImageCard.getAltImageText(), card);
            contentCardViewHolder.MediaSessionCompatQueueItem.setContentDescription(captionedImageCard.getTitle() + " .  " + captionedImageCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_captioned_image_content_card, viewGroup, false);
        viewInflate.getClass();
        setViewBackground(viewInflate);
        return new ViewHolder(this, viewInflate);
    }
}
