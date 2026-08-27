package o;

import io.sentry.util.UrlUtils;
import java.io.File;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class assertNotInLayoutOrScroll implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ addItemDecoration RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ assertNotInLayoutOrScroll(addItemDecoration additemdecoration, int i) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = additemdecoration;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = this.serializer;
        addItemDecoration additemdecoration = this.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            File file = LazyKt__LazyJVMKt.read(additemdecoration.IconCompatParcelizer, "rider_home_state");
            int i3 = IconCompatParcelizer + 91;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return file;
        }
        and andVar = new and(getOnBackInvokedCallback.RemoteActionCompatParcelizer, 4);
        ((inCompatibilityMode) additemdecoration.RemoteActionCompatParcelizer).getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        pickChildForBackwardSearch pickchildforbackwardsearchWrite = androidx.datastore.preferences.core.PreferencesSerializer.write(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(andVar)), new assertNotInLayoutOrScroll(additemdecoration, 1), 3);
        int i5 = IconCompatParcelizer + 95;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return pickchildforbackwardsearchWrite;
    }
}
