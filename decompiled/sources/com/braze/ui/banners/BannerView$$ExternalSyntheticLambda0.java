package com.braze.ui.banners;

import com.braze.events.BannerDismissedEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.ui.contentcards.ContentCardsFragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BannerView$$ExternalSyntheticLambda0 implements IEventSubscriber {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BannerView$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        if (i == 0) {
            BannerView.dismissSubscriber$lambda$0((BannerView) obj2, (BannerDismissedEvent) obj);
        } else if (i != 1) {
            ContentCardsFragment.onResume$lambda$2((ContentCardsFragment) obj2, (SdkDataWipeEvent) obj);
        } else {
            ContentCardsFragment.onResume$lambda$0((ContentCardsFragment) obj2, (ContentCardsUpdatedEvent) obj);
        }
    }
}
