package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.braze.models.cards.Card;
import com.braze.models.cards.ImageOnlyCard;
import com.braze.ui.R;

/* JADX INFO: loaded from: classes.dex */
public class ImageOnlyContentCardView extends BaseContentCardView<ImageOnlyCard> {

    public final class ViewHolder extends ContentCardViewHolder {
        private final ImageView imageView;
        final /* synthetic */ ImageOnlyContentCardView this$0;

        public final ImageView getImageView() {
            return this.imageView;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ImageOnlyContentCardView imageOnlyContentCardView, View view) {
            super(view, imageOnlyContentCardView.isUnreadIndicatorEnabled());
            view.getClass();
            this.this$0 = imageOnlyContentCardView;
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_image_only_card_image);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOnlyContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        contentCardViewHolder.getClass();
        card.getClass();
        if (card instanceof ImageOnlyCard) {
            super.bindViewHolder(contentCardViewHolder, card);
            ImageView imageView = ((ViewHolder) contentCardViewHolder).getImageView();
            ImageOnlyCard imageOnlyCard = (ImageOnlyCard) card;
            setOptionalCardImage(imageView, imageOnlyCard.getAspectRatio(), imageOnlyCard.getImageUrl(), imageOnlyCard.getAltImageText(), card);
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_image_only_content_card, viewGroup, false);
        viewInflate.getClass();
        setViewBackground(viewInflate);
        return new ViewHolder(this, viewInflate);
    }
}
