package com.braze.ui.widget;

import android.content.Context;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.cards.Card;
import com.braze.models.cards.Card$$ExternalSyntheticLambda1;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    public final Context applicationContext;
    protected T card;
    private final String classLogTag;
    public BrazeConfigurationProvider configurationProvider;

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    public abstract boolean isClickHandled(Context context, Card card, IAction iAction);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UriAction getUriActionForCard(Card card) {
            card.getClass();
            return BrazeContentCardUtils.INSTANCE.getUriActionForCard(card);
        }

        private Companion() {
        }
    }

    public static final UriAction getUriActionForCard(Card card) {
        return Companion.getUriActionForCard(card);
    }

    public final boolean isUnreadIndicatorEnabled() {
        return this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.applicationContext = applicationContext;
        this.classLogTag = BrazeLogger.getBrazeLogTag(getClass());
        this.configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
    }

    public final void handleCardClick(Context context, Card card, IAction iAction) {
        context.getClass();
        card.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 12), 6, (Object) null);
        card.setIndicatorHighlighted(true);
        if (isClickHandled(context, card, iAction)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 16), 7, (Object) null);
            card.logClick();
        } else {
            if (iAction == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 15), 6, (Object) null);
                return;
            }
            card.logClick();
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 13), 6, (Object) null);
            if (iAction instanceof UriAction) {
                BrazeDeeplinkHandler.Companion.getInstance().gotoUri(context, (UriAction) iAction);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Card$$ExternalSyntheticLambda1(card, 14), 7, (Object) null);
                iAction.execute(context);
            }
        }
    }

    public final void setImageViewToUrl(final ImageView imageView, String str, final float f, Card card) {
        imageView.getClass();
        str.getClass();
        card.getClass();
        if (str.equals(imageView.getTag(R.string.com_braze_image_resize_tag_key))) {
            return;
        }
        if (f != 0.0f) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.braze.ui.widget.BaseCardView.setImageViewToUrl.1
                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        imageView.getViewTreeObserver().removeOnPreDrawListener(this);
                        int width = imageView.getWidth();
                        imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (width / f)));
                        return true;
                    }
                });
            }
        }
        imageView.setImageResource(android.R.color.transparent);
        Braze.Companion companion = Braze.Companion;
        Context context = getContext();
        context.getClass();
        IBrazeImageLoader imageLoader = companion.getInstance(context).getImageLoader();
        Context context2 = getContext();
        context2.getClass();
        imageLoader.renderUrlIntoCardView(context2, card, str, imageView, BrazeViewBounds.BASE_CARD_VIEW);
        imageView.setTag(R.string.com_braze_image_resize_tag_key, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$0(Card card) {
        return "Handling card click for card: " + card;
    }

    public final void setOptionalTextView(TextView textView, String str) {
        textView.getClass();
        if (str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            textView.setText("");
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$1(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Card action is non-null. Attempting to perform action on card: ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$2(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Executing non uri action for click on card: ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$3(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Card action is null. Not performing any click action on card: ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleCardClick$lambda$4(Card card) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Card click was handled by custom listener on card: ", card.getId());
    }
}
