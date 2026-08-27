package o;

import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessunpackByte2 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public isRoot RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ SettingsOnboardingDataStore write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessunpackByte2(SettingsOnboardingDataStore settingsOnboardingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = settingsOnboardingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 101;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object tooltipShown = this.write.getTooltipShown(this);
        int i4 = serializer + 113;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return tooltipShown;
    }
}
