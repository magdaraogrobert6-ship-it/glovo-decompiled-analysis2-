package com.braze.ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsUpdateHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DefaultContentCardsUpdateHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler[] newArray(int i) {
            return new DefaultContentCardsUpdateHandler[i];
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

    @Override // com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler
    public List<Card> handleCardUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        contentCardsUpdatedEvent.getClass();
        return BrazeContentCardUtils.INSTANCE.defaultCardHandling(contentCardsUpdatedEvent.getAllCards());
    }
}
