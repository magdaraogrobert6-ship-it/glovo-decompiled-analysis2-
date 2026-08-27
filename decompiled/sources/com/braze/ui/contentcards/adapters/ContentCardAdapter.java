package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil$Callback;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import com.braze.models.cards.Card;
import com.braze.models.cards.Card$$ExternalSyntheticLambda1;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.EnterExitTransitionKtshrinkVertically2;
import o.ScreenFlashView2;
import o.brazelogdefault;
import o.getCieXyz;
import o.getClear0nO6VwU;
import o.getPlus0nO6VwU;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public class ContentCardAdapter extends RecyclerView.Adapter implements ItemTouchHelperAdapter {
    private final List<Card> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    public static final class CardListDiffCallback extends DiffUtil$Callback {
        private final List<Card> newCards;
        private final List<Card> oldCards;

        @Override // androidx.recyclerview.widget.DiffUtil$Callback
        public boolean areContentsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil$Callback
        public boolean areItemsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        private final boolean doItemsShareIds(int i, int i2) {
            Object[] objArr = {this.oldCards.get(i).getId(), this.newCards.get(i2).getId()};
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
        }

        @Override // androidx.recyclerview.widget.DiffUtil$Callback
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil$Callback
        public int getOldListSize() {
            return this.oldCards.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends Card> list, List<? extends Card> list2) {
            list.getClass();
            list2.getClass();
            this.oldCards = list;
            this.newCards = list2;
        }
    }

    public final void replaceCards(List<? extends Card> list) {
        synchronized (this) {
            list.getClass();
            EnterExitTransitionKtshrinkVertically2 enterExitTransitionKtshrinkVertically2Serializer = getClear0nO6VwU.serializer(new CardListDiffCallback(this.cardData, list));
            this.cardData.clear();
            this.cardData.addAll(list);
            enterExitTransitionKtshrinkVertically2Serializer.read(new getPlus0nO6VwU(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCardAtIndex$lambda$0(int i, ContentCardAdapter contentCardAdapter) {
        return af$$ExternalSyntheticOutline0.m(i, "Cannot return card at index: ", contentCardAdapter.cardData.size(), " in cards list of size: ");
    }

    private final boolean isInvalidIndex(int i) {
        return i < 0 || i >= this.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$0() {
        return "Card list is empty. Not marking on-screen cards as read.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onItemDismiss$lambda$0(int i, ContentCardAdapter contentCardAdapter) {
        return af$$ExternalSyntheticOutline0.m(i, "Cannot dismiss card at index: ", contentCardAdapter.cardData.size(), " in cards list of size: ");
    }

    public final List<String> getImpressedCardIds() {
        return onContentCardDismissed.PlaybackStateCompat(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, i);
    }

    public final boolean isAdapterPositionOnScreen(int i) {
        int iMediaMetadataCompat = this.layoutManager.MediaMetadataCompat();
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        View view = linearLayoutManager.read(0, linearLayoutManager.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), true, false);
        int iMin = Math.min(iMediaMetadataCompat, view == null ? -1 : RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view));
        int iMediaDescriptionCompat = this.layoutManager.MediaDescriptionCompat();
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        View view2 = linearLayoutManager2.read(linearLayoutManager2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1, -1, true, false);
        return iMin <= i && i <= Math.max(iMediaDescriptionCompat, view2 != null ? RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2) : -1);
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int i) {
        if (this.cardData.isEmpty() || isInvalidIndex(i)) {
            return false;
        }
        return this.cardData.get(i).isDismissibleByUser();
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(26), 7, (Object) null);
            return;
        }
        int iMediaMetadataCompat = this.layoutManager.MediaMetadataCompat();
        int iMediaDescriptionCompat = this.layoutManager.MediaDescriptionCompat();
        if (iMediaMetadataCompat < 0 || iMediaDescriptionCompat < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda1(iMediaMetadataCompat, iMediaDescriptionCompat, 4), 7, (Object) null);
            return;
        }
        if (iMediaMetadataCompat <= iMediaDescriptionCompat) {
            int i = iMediaMetadataCompat;
            while (true) {
                Card cardAtIndex = getCardAtIndex(i);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i == iMediaDescriptionCompat) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.handler.post(new ScreenFlashView2(iMediaDescriptionCompat, iMediaMetadataCompat, this));
    }

    public ContentCardAdapter(Context context, LinearLayoutManager linearLayoutManager, List<Card> list, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        context.getClass();
        linearLayoutManager.getClass();
        list.getClass();
        iContentCardsViewBindingHandler.getClass();
        this.context = context;
        this.layoutManager = linearLayoutManager;
        this.cardData = list;
        this.contentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markOnScreenCardsAsRead$lambda$2(int i, int i2, ContentCardAdapter contentCardAdapter) {
        contentCardAdapter.notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    public final void logImpression(Card card) {
        if (card == null) {
            return;
        }
        if (!this.impressedCardIdsInternal.contains(card.getId())) {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 10), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 11), 6, (Object) null);
        }
        if (card.getViewed()) {
            return;
        }
        card.setViewed(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContentCardViewHolder contentCardViewHolder, int i) {
        contentCardViewHolder.getClass();
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, contentCardViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(ContentCardViewHolder contentCardViewHolder) {
        contentCardViewHolder.getClass();
        super.onViewAttachedToWindow((RecyclerView.ViewHolder) contentCardViewHolder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = contentCardViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ContentCardAdapter$$ExternalSyntheticLambda0(bindingAdapterPosition, 0), 6, (Object) null);
        } else {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(ContentCardViewHolder contentCardViewHolder) {
        contentCardViewHolder.getClass();
        super.onViewDetachedFromWindow((RecyclerView.ViewHolder) contentCardViewHolder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = contentCardViewHolder.getBindingAdapterPosition();
        int i = 1;
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ContentCardAdapter$$ExternalSyntheticLambda0(bindingAdapterPosition, i), 6, (Object) null);
            return;
        }
        Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
        if (cardAtIndex == null || cardAtIndex.isIndicatorHighlighted()) {
            return;
        }
        cardAtIndex.setIndicatorHighlighted(true);
        this.handler.post(new brazelogdefault(this, bindingAdapterPosition, 7));
    }

    public final void setImpressedCardIds(List<String> list) {
        list.getClass();
        this.impressedCardIdsInternal = onContentCardDismissed.ParcelableVolumeInfo(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$1(int i, int i2) {
        return af$$ExternalSyntheticOutline0.m(i, "Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ", i2, " . Last visible: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewAttachedToWindow$lambda$0(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "The card at position ", " isn't on screen or does not have a valid adapter position. Not logging impression.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewDetachedFromWindow$lambda$0(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "The card at position ", " isn't on screen or does not have a valid adapter position. Not marking as read.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Logged impression for card ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$1(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Already counted impression for card ", card.getId());
    }

    public final Card getCardAtIndex(int i) {
        if (!isInvalidIndex(i)) {
            return this.cardData.get(i);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ContentCardAdapter$$ExternalSyntheticLambda6(i, 1, this), 7, (Object) null);
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        String id;
        Card cardAtIndex = getCardAtIndex(i);
        if (cardAtIndex == null || (id = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id.hashCode();
    }

    public final boolean isControlCardAtPosition(int i) {
        Card cardAtIndex = getCardAtIndex(i);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(int i) {
        if (isInvalidIndex(i)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ContentCardAdapter$$ExternalSyntheticLambda6(i, 0, this), 7, (Object) null);
            return;
        }
        Card cardRemove = this.cardData.remove(i);
        cardRemove.setDismissed(true);
        notifyItemRemoved(i);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, cardRemove);
        }
    }
}
