package o;

import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Rcolor implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ androidx.compose.material3.SheetState IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ getContentViewGroupParentLayout write;

    public /* synthetic */ Rcolor(androidx.compose.material3.SheetState sheetState, getContentViewGroupParentLayout getcontentviewgroupparentlayout, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = sheetState;
        this.write = getcontentviewgroupparentlayout;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.RemoteActionCompatParcelizer;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.write;
        androidx.compose.material3.SheetState sheetState = this.IconCompatParcelizer;
        if (i == 0) {
            int i2 = Rid.RemoteActionCompatParcelizer[sheetState.IconCompatParcelizer().ordinal()];
            if (i2 == 1) {
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 1), 3);
            } else if (i2 != 2) {
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 3), 3);
            } else {
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 2), 3);
            }
            return createFromParcel.INSTANCE;
        }
        if (i == 1) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 4), 3);
        } else if (i == 2) {
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 5), 3);
        } else {
            if (i != 3) {
                if (((Boolean) ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) sheetState.IconCompatParcelizer.serializer).invoke(getAutofillTree.PartiallyExpanded)).booleanValue()) {
                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 13), 3);
                }
                return Boolean.TRUE;
            }
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 6), 3);
        }
        return Boolean.TRUE;
    }

    public /* synthetic */ Rcolor(getContentViewGroupParentLayout getcontentviewgroupparentlayout, androidx.compose.material3.SheetState sheetState, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = sheetState;
    }
}
