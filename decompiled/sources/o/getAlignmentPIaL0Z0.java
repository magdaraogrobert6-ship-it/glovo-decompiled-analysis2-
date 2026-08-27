package o;

import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.NavigationSettingsDialogManagerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAlignmentPIaL0Z0 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ NavigationSettingsDialogManagerImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAlignmentPIaL0Z0(NavigationSettingsDialogManagerImpl navigationSettingsDialogManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = navigationSettingsDialogManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 47;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return this.serializer.shouldShow(this);
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        this.serializer.shouldShow(this);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
