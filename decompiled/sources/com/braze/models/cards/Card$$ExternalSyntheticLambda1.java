package com.braze.models.cards;

import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.widget.BaseCardView;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Card$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Card f$0;

    public /* synthetic */ Card$$ExternalSyntheticLambda1(Card card, int i) {
        this.$r8$classId = i;
        this.f$0 = card;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Card card = this.f$0;
        switch (i) {
            case 0:
                return Card.logClick$lambda$1(card);
            case 1:
                return Card.logClick$lambda$2(card);
            case 2:
                return Card.logClick$lambda$3(card);
            case 3:
                return Card.logImpression$lambda$0(card);
            case 4:
                return Card.logImpression$lambda$2(card);
            case 5:
                return Card.logImpression$lambda$4(card);
            case 6:
                return BrazeContentCardUtils.handleCardClick$lambda$0(card);
            case 7:
                return BrazeContentCardUtils.handleCardClick$lambda$2(card);
            case 8:
                return BrazeContentCardUtils.handleCardClick$lambda$3(card);
            case 9:
                return BrazeContentCardUtils.handleCardClick$lambda$4(card);
            case 10:
                return ContentCardAdapter.logImpression$lambda$0(card);
            case 11:
                return ContentCardAdapter.logImpression$lambda$1(card);
            case 12:
                return BaseCardView.handleCardClick$lambda$0(card);
            case 13:
                return BaseCardView.handleCardClick$lambda$1(card);
            case 14:
                return BaseCardView.handleCardClick$lambda$2(card);
            case 15:
                return BaseCardView.handleCardClick$lambda$3(card);
            default:
                return BaseCardView.handleCardClick$lambda$4(card);
        }
    }
}
