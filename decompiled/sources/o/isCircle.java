package o;

import android.os.Bundle;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.breakrequest.RequestBreakFragment;
import kotlin.text.StringsKt__StringsKt$$ExternalSyntheticLambda1;
import kotlinx.coroutines.DefaultExecutorKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class isCircle {
    public static setAndStartAnimation serializer(long j, Runnable runnable, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        return DefaultExecutorKt.write.write(j, runnable, textAnnouncementContentCardView);
    }

    public static final void serializer(androidx.fragment.app.Fragment fragment, String str, Bundle bundle) {
        fragment.getParentFragmentManager().write(bundle, str);
    }

    public static final void write(RequestBreakFragment requestBreakFragment, StringsKt__StringsKt$$ExternalSyntheticLambda1 stringsKt__StringsKt$$ExternalSyntheticLambda1) {
        requestBreakFragment.getParentFragmentManager().read("select-break-duration-dialog-result-key", requestBreakFragment, new StreamSharing$$ExternalSyntheticLambda0(19, stringsKt__StringsKt$$ExternalSyntheticLambda1));
    }
}
