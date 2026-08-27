package o;

import android.view.View;
import androidx.core.view.ViewKt$allViews$1;

/* JADX INFO: loaded from: classes.dex */
public abstract class restoreFocusedChild {
    public static int serializer(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper2) {
        defaultInAppMessageViewWrapper2.getClass();
        return BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(DefaultInAppMessageViewWrapper.RemoteActionCompatParcelizer(defaultInAppMessageViewWrapper.RemoteActionCompatParcelizer, defaultInAppMessageViewWrapper2.RemoteActionCompatParcelizer), 0L);
    }

    public static final verifyOrientationStatuslambda2 RemoteActionCompatParcelizer(View view) {
        return new verifyOrientationStatuslambda2(2, new ViewKt$allViews$1(view, null, 0));
    }

    public static final resumeWebviewIfNecessarylambda0 read(View view) {
        return resetAfterInAppMessageCloselambda2.write(view.getParent(), FocusRequesterCompanion.RemoteActionCompatParcelizer);
    }
}
