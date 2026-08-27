package o;

import com.roadrunner.delivery.ontheway.turnbyturn.settings.data.SettingsOnboardingDataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class accessunpackByte1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public isRoot RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ SettingsOnboardingDataStore write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accessunpackByte1(SettingsOnboardingDataStore settingsOnboardingDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = settingsOnboardingDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 95;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.getOpenSettingsDialogShown(this);
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.write.getOpenSettingsDialogShown(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
