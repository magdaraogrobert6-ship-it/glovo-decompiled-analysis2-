package o;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.service.chooser.ChooserResult;
import com.roadrunner.inappnotifications.analytics.InAppNotificationsLogger$logInAppMessageButtonClicked$1;
import com.sentiance.core.model.events.N$b;
import kotlinx.coroutines.BuildersKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class onGenericMotionEvent extends BroadcastReceiver {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final N$b serializer;

    public onGenericMotionEvent(N$b n$b) {
        this.serializer = n$b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName selectedComponent;
        int i = 2 % 2;
        context.getClass();
        intent.getClass();
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        intent.toString();
        forest.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (Build.VERSION.SDK_INT >= 35) {
            ChooserResult chooserResult = (ChooserResult) FocusManager.serializer(intent, "android.intent.extra.CHOOSER_RESULT", ChooserResult.class);
            if (chooserResult != null) {
                int i2 = write + 17;
                RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                selectedComponent = chooserResult.getSelectedComponent();
            } else {
                int i4 = RemoteActionCompatParcelizer + 77;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                selectedComponent = null;
            }
        } else {
            selectedComponent = (ComponentName) FocusManager.serializer(intent, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
            int i6 = RemoteActionCompatParcelizer + 101;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        if (selectedComponent != null) {
            selectedComponent.getPackageName();
            String packageName = selectedComponent.getPackageName();
            packageName.getClass();
            N$b n$b = this.serializer;
            n$b.getClass();
            BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) n$b.serializer, null, null, new InAppNotificationsLogger$logInAppMessageButtonClicked$1(n$b, packageName, shortNewsContentCardView, 1), 3);
        }
    }
}
