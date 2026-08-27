package com.braze.events;

import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.models.cards.Card;
import com.braze.support.DateTimeUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes.dex */
public final class ContentCardsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<Card> contentCards;
    private final boolean isFromOfflineStorage;
    private final long timestampSeconds;
    private final String userId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }

        public final ContentCardsUpdatedEvent getEmptyUpdate() {
            return new ContentCardsUpdatedEvent(instance_delegatelambda0.write, null, DateTimeUtils.nowInSeconds(), true);
        }

        private Companion() {
        }
    }

    public final long getTimestampSeconds() {
        return this.timestampSeconds;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isFromOfflineStorage() {
        return this.isFromOfflineStorage;
    }

    public static final ContentCardsUpdatedEvent getEmptyUpdate() {
        return Companion.getEmptyUpdate();
    }

    public final List<Card> getAllCards() {
        return onContentCardDismissed.IconCompatParcelizer((Collection) this.contentCards);
    }

    public final int getCardCount() {
        return this.contentCards.size();
    }

    public final int getUnviewedCardCount() {
        List<Card> list = this.contentCards;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        for (Card card : list) {
            if (!card.getViewed() && !card.isControl() && (i = i + 1) < 0) {
                SQLite.RemoteActionCompatParcelizer();
                throw null;
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.contentCards.isEmpty();
    }

    public String toString() {
        String str = this.userId;
        long j = this.timestampSeconds;
        boolean z = this.isFromOfflineStorage;
        int cardCount = getCardCount();
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("ContentCardsUpdatedEvent{userId='", str, j, "', timestampSeconds=");
        sbM.append(", isFromOfflineStorage=");
        sbM.append(z);
        sbM.append(", card count=");
        sbM.append(cardCount);
        sbM.append("}");
        return sbM.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentCardsUpdatedEvent(List<? extends Card> list, String str, long j, boolean z) {
        list.getClass();
        this.contentCards = list;
        this.userId = str;
        this.timestampSeconds = j;
        this.isFromOfflineStorage = z;
    }

    public final boolean isTimestampOlderThan(long j) {
        return TimeUnit.SECONDS.toMillis(this.timestampSeconds + j) < DateTimeUtils.nowInMilliseconds();
    }
}
