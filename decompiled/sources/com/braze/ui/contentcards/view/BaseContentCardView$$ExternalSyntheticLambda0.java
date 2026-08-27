package com.braze.ui.contentcards.view;

import android.view.View;
import com.braze.models.IPutIntoJson;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BaseContentCardView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ IPutIntoJson f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ BaseContentCardView$$ExternalSyntheticLambda0(Object obj, IPutIntoJson iPutIntoJson, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = iPutIntoJson;
        this.f$2 = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        IPutIntoJson iPutIntoJson = this.f$1;
        Object obj2 = this.f$0;
        if (i != 0) {
            DefaultInAppMessageViewWrapper.createButtonClickListeners$lambda$0$1$0$0((DefaultInAppMessageViewWrapper) obj2, (MessageButton) iPutIntoJson, (IInAppMessageImmersive) obj, view);
        } else {
            BaseContentCardView.bindViewHolder$lambda$0((BaseContentCardView) obj2, (Card) iPutIntoJson, (UriAction) obj, view);
        }
    }
}
