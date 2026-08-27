package com.braze.ui.inappmessage.views;

import android.view.View;
import o.FocusRequesterModifierKt;

/* JADX INFO: loaded from: classes.dex */
public interface IInAppMessageView {
    void applyWindowInsets(FocusRequesterModifierKt focusRequesterModifierKt);

    boolean getHasAppliedWindowInsets();

    View getMessageClickableView();

    void setHasAppliedWindowInsets(boolean z);
}
