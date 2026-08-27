package com.braze.ui.contentcards.managers;

import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.ui.contentcards.listeners.DefaultContentCardsActionListener;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes.dex */
public class BrazeContentCardsManager {
    public static final Companion Companion = new Companion(null);
    private static final onViewDetachedFromWindowlambda1 instance$delegate = new isAdapterPositionOnScreen(new i$$ExternalSyntheticLambda0(27));
    private IContentCardsActionListener contentCardsActionListener = new DefaultContentCardsActionListener();

    public final IContentCardsActionListener getContentCardsActionListener() {
        return this.contentCardsActionListener;
    }

    public static final BrazeContentCardsManager getInstance() {
        return Companion.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BrazeContentCardsManager instance_delegate$lambda$0() {
        return new BrazeContentCardsManager();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        private Companion() {
        }

        public final BrazeContentCardsManager getInstance() {
            return (BrazeContentCardsManager) BrazeContentCardsManager.instance$delegate.MediaSessionCompatResultReceiverWrapper();
        }
    }

    public final void setContentCardsActionListener(IContentCardsActionListener iContentCardsActionListener) {
        if (iContentCardsActionListener == null) {
            iContentCardsActionListener = new DefaultContentCardsActionListener();
        }
        this.contentCardsActionListener = iContentCardsActionListener;
    }
}
