package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.braze.enums.CardType;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.BaseContentCardView;
import com.braze.ui.contentcards.view.CaptionedImageContentCardView;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import com.braze.ui.contentcards.view.DefaultContentCardView;
import com.braze.ui.contentcards.view.ImageOnlyContentCardView;
import com.braze.ui.contentcards.view.ShortNewsContentCardView;
import com.braze.ui.contentcards.view.TextAnnouncementContentCardView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class DefaultContentCardsViewBindingHandler implements IContentCardsViewBindingHandler {
    private final Map<CardType, BaseContentCardView<?>> contentCardViewCache = new LinkedHashMap();
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultContentCardsViewBindingHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsViewBindingHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DefaultContentCardsViewBindingHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler[] newArray(int i) {
            return new DefaultContentCardsViewBindingHandler[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final BaseContentCardView<?> getContentCardsViewFromCache(Context context, CardType cardType) {
        BaseContentCardView<?> imageOnlyContentCardView;
        context.getClass();
        cardType.getClass();
        if (!this.contentCardViewCache.containsKey(cardType) || this.contentCardViewCache.get(cardType) == null) {
            int i = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
            if (i == 1) {
                imageOnlyContentCardView = new ImageOnlyContentCardView(context);
            } else if (i == 2) {
                imageOnlyContentCardView = new CaptionedImageContentCardView(context);
            } else if (i != 3) {
                imageOnlyContentCardView = i != 4 ? new DefaultContentCardView(context) : new TextAnnouncementContentCardView(context);
            } else {
                imageOnlyContentCardView = new ShortNewsContentCardView(context);
            }
            this.contentCardViewCache.put(cardType, imageOnlyContentCardView);
        }
        BaseContentCardView<?> baseContentCardView = this.contentCardViewCache.get(cardType);
        return baseContentCardView == null ? new DefaultContentCardView(context) : baseContentCardView;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public int getItemViewType(Context context, List<? extends Card> list, int i) {
        context.getClass();
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return -1;
        }
        return list.get(i).getCardType().getValue();
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public void onBindViewHolder(Context context, List<? extends Card> list, ContentCardViewHolder contentCardViewHolder, int i) {
        context.getClass();
        list.getClass();
        contentCardViewHolder.getClass();
        if (i < 0 || i >= list.size()) {
            return;
        }
        Card card = list.get(i);
        getContentCardsViewFromCache(context, card.getCardType()).bindViewHolder(contentCardViewHolder, card);
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public ContentCardViewHolder onCreateViewHolder(Context context, List<? extends Card> list, ViewGroup viewGroup, int i) {
        context.getClass();
        list.getClass();
        viewGroup.getClass();
        return getContentCardsViewFromCache(context, CardType.Companion.fromValue(i)).createViewHolder(viewGroup);
    }
}
