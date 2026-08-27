package com.braze.ui.inappmessage.factories;

import android.R;
import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.ui.inappmessage.IInAppMessageAnimationFactory;
import com.braze.ui.support.AnimationUtils;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageAnimationFactory implements IInAppMessageAnimationFactory {
    private final long shortAnimationDurationMs = Resources.getSystem().getInteger(R.integer.config_shortAnimTime);

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    public Animation getClosingAnimation(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        if (!(iInAppMessage instanceof InAppMessageSlideup)) {
            return AnimationUtils.setAnimationParams(new AlphaAnimation(1.0f, 0.0f), this.shortAnimationDurationMs, false);
        }
        SlideFrom slideFrom = ((InAppMessageSlideup) iInAppMessage).getSlideFrom();
        SlideFrom slideFrom2 = SlideFrom.TOP;
        long j = this.shortAnimationDurationMs;
        return slideFrom == slideFrom2 ? AnimationUtils.createVerticalAnimation(0.0f, -1.0f, j, false) : AnimationUtils.createVerticalAnimation(0.0f, 1.0f, j, false);
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageAnimationFactory
    public Animation getOpeningAnimation(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        if (!(iInAppMessage instanceof InAppMessageSlideup)) {
            return AnimationUtils.setAnimationParams(new AlphaAnimation(0.0f, 1.0f), this.shortAnimationDurationMs, true);
        }
        SlideFrom slideFrom = ((InAppMessageSlideup) iInAppMessage).getSlideFrom();
        SlideFrom slideFrom2 = SlideFrom.TOP;
        long j = this.shortAnimationDurationMs;
        return slideFrom == slideFrom2 ? AnimationUtils.createVerticalAnimation(-1.0f, 0.0f, j, false) : AnimationUtils.createVerticalAnimation(1.0f, 0.0f, j, false);
    }
}
