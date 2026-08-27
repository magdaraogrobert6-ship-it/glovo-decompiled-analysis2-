package o;

import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class logEcommerceEventlambda1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ OneClickStartWorkingViewModel IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public logEcommerceEventlambda1(OneClickStartWorkingViewModel oneClickStartWorkingViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = oneClickStartWorkingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 31;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$observeComponentsIfEquipmentIsSelected = OneClickStartWorkingViewModel.access$observeComponentsIfEquipmentIsSelected(this.IconCompatParcelizer, this);
        int i4 = serializer + 105;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 83 / 0;
        }
        return objAccess$observeComponentsIfEquipmentIsSelected;
    }
}
