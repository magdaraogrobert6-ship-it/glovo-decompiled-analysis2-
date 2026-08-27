package com.roadrunner.rider.state.breakrequest;

import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.ui.common.widget.chooseoption.ChooseOptionFragment;
import com.ui.common.widget.chooseoption.entity.ChooseOptionFragmentArguments;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectBreakDurationFragment extends ChooseOptionFragment {
    private static int getNavigationEventDispatcher = 0;
    private static int getOnBackPressedDispatcher = 1;

    @Override // com.ui.common.widget.chooseoption.ChooseOptionFragment
    public final GetAppStateImpl serializer() {
        int i = 2 % 2;
        GetAppStateImpl getAppStateImpl = new GetAppStateImpl(21, this);
        int i2 = getOnBackPressedDispatcher + 37;
        getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return getAppStateImpl;
    }

    @Override // com.ui.common.widget.chooseoption.ChooseOptionFragment
    public final ChooseOptionFragmentArguments MediaMetadataCompat() {
        ChooseOptionFragmentArguments chooseOptionFragmentArguments;
        int i = 2 % 2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            chooseOptionFragmentArguments = (ChooseOptionFragmentArguments) arguments.getParcelable("args-options");
        } else {
            int i2 = getOnBackPressedDispatcher + 37;
            getNavigationEventDispatcher = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            chooseOptionFragmentArguments = null;
        }
        if (chooseOptionFragmentArguments == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Required value was null.");
            return null;
        }
        int i4 = getNavigationEventDispatcher + 57;
        getOnBackPressedDispatcher = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return chooseOptionFragmentArguments;
    }
}
