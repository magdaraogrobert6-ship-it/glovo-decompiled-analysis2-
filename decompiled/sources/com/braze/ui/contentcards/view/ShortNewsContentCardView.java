package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.braze.models.cards.Card;
import com.braze.models.cards.ShortNewsCard;
import com.braze.ui.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public class ShortNewsContentCardView extends BaseContentCardView<ShortNewsCard> {
    private static final float ASPECT_RATIO = 1.0f;
    public static final Companion Companion = new Companion(null);

    public final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        private final ImageView imageView;
        final /* synthetic */ ShortNewsContentCardView this$0;
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
        public ViewHolder(ShortNewsContentCardView shortNewsContentCardView, View view) {
            super(view, shortNewsContentCardView.isUnreadIndicatorEnabled());
            view.getClass();
            this.this$0 = shortNewsContentCardView;
            this.title = (TextView) view.findViewById(R.id.com_braze_content_cards_short_news_card_title);
            this.description = (TextView) view.findViewById(R.id.com_braze_content_cards_short_news_card_description);
            this.imageView = (ImageView) view.findViewById(R.id.com_braze_content_cards_short_news_card_image);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortNewsContentCardView(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        contentCardViewHolder.getClass();
        card.getClass();
        if (card instanceof ShortNewsCard) {
            super.bindViewHolder(contentCardViewHolder, card);
            ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
            TextView title = viewHolder.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((ShortNewsCard) card).getTitle());
            }
            TextView description = viewHolder.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((ShortNewsCard) card).getDescription());
            }
            ShortNewsCard shortNewsCard = (ShortNewsCard) card;
            String domain = shortNewsCard.getDomain();
            String url = (domain == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) domain)) ? shortNewsCard.getUrl() : shortNewsCard.getDomain();
            if (url != null) {
                viewHolder.setActionHintText(url);
            }
            setOptionalCardImage(viewHolder.getImageView(), 1.0f, shortNewsCard.getImageUrl(), shortNewsCard.getAltImageText(), card);
            safeSetClipToOutline(viewHolder.getImageView());
            contentCardViewHolder.MediaSessionCompatQueueItem.setContentDescription(shortNewsCard.getTitle() + " . " + shortNewsCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.com_braze_short_news_content_card, viewGroup, false);
        viewInflate.getClass();
        setViewBackground(viewInflate);
        return new ViewHolder(this, viewInflate);
    }
}
