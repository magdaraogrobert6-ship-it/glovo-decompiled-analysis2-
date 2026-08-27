package o;

import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class copy2BkPm_w extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ AutoAcceptPreferencesDataStoreImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public copy2BkPm_w(AutoAcceptPreferencesDataStoreImpl autoAcceptPreferencesDataStoreImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = autoAcceptPreferencesDataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object endShiftOpted;
        int i = 2 % 2;
        int i2 = write + 3;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            endShiftOpted = this.serializer.getEndShiftOpted(this);
            int i3 = 65 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            endShiftOpted = this.serializer.getEndShiftOpted(this);
        }
        int i4 = write + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return endShiftOpted;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
