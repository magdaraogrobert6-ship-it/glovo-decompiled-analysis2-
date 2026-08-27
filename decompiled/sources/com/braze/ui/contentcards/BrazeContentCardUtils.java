package com.braze.ui.contentcards;

import android.content.Context;
import android.os.Bundle;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.braze.enums.Channel;
import com.braze.models.cards.Card;
import com.braze.models.cards.Card$$ExternalSyntheticLambda1;
import com.braze.support.BrazeLogger;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import java.util.ArrayList;
import java.util.List;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeContentCardUtils {
    public static final BrazeContentCardUtils INSTANCE = new BrazeContentCardUtils();

    private BrazeContentCardUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUriActionForCard$lambda$0() {
        return "Card URL is null, returning null for getUriActionForCard";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$1() {
        return "Calling custom card click handler";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultCardHandling$lambda$0(Card card, Card card2) {
        card.getClass();
        card2.getClass();
        if (card.isPinned() && !card2.isPinned()) {
            return -1;
        }
        if (!card.isPinned() && card2.isPinned()) {
            return 1;
        }
        if (card.getCreated() > card2.getCreated()) {
            return -1;
        }
        if (card.getCreated() < card2.getCreated()) {
            return 1;
        }
        if (card.getId().compareTo(card2.getId()) > 0) {
            return -1;
        }
        return card.getId().compareTo(card2.getId()) < 0 ? 1 : 0;
    }

    public final UriAction getUriActionForCard(Card card) {
        card.getClass();
        String url = card.getUrl();
        if (url == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(21), 6, (Object) null);
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : card.getExtras().keySet()) {
            bundle.putString(str, card.getExtras().get(str));
        }
        return BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(url, bundle, card.getOpenUriInWebView(), Channel.CONTENT_CARD);
    }

    public final void handleCardClick(Context context, Card card, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        context.getClass();
        card.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 6), 6, (Object) null);
        card.setIndicatorHighlighted(true);
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(20), 7, (Object) null);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(card)).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 9), 7, (Object) null);
                card.logClick();
                return;
            }
        }
        UriAction uriActionForCard = getUriActionForCard(card);
        if (uriActionForCard == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 8), 6, (Object) null);
            return;
        }
        card.logClick();
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 7), 6, (Object) null);
        BrazeDeeplinkHandler.Companion.getInstance().gotoUri(context, uriActionForCard);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$0(Card card) {
        return "Handling card click for card: " + card;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$2(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Card action is non-null. Attempting to perform action on card: ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$3(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Card action is null. Not performing any click action on card: ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$4(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Card click was handled by custom listener on card: ", card.getId());
    }

    public final List<Card> defaultCardHandling(List<? extends Card> list) {
        list.getClass();
        wg$$ExternalSyntheticLambda0 wg__externalsyntheticlambda0 = new wg$$ExternalSyntheticLambda0(6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return onContentCardDismissed.serializer(arrayList, wg__externalsyntheticlambda0);
    }
}
