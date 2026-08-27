package o;

import androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getUdmandroid_sdk_base_release implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ PopulateViewStructure_androidKtpopulate7 IconCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ androidx.compose.material3.SheetState serializer;
    public final /* synthetic */ getContentViewGroupParentLayout write;

    public /* synthetic */ getUdmandroid_sdk_base_release(getContentViewGroupParentLayout getcontentviewgroupparentlayout, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, androidx.compose.material3.SheetState sheetState) {
        this.read = 0;
        this.write = getcontentviewgroupparentlayout;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
        this.serializer = sheetState;
    }

    public /* synthetic */ getUdmandroid_sdk_base_release(getContentViewGroupParentLayout getcontentviewgroupparentlayout, androidx.compose.material3.SheetState sheetState, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.read = i;
        this.write = getcontentviewgroupparentlayout;
        this.serializer = sheetState;
        this.IconCompatParcelizer = populateViewStructure_androidKtpopulate7;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = this.IconCompatParcelizer;
        androidx.compose.material3.SheetState sheetState = this.serializer;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.write;
        if (i4 != 0) {
            if (i4 != 1) {
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 19), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 15));
                return createfromparcel;
            }
            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 18), 3).IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 14));
            return createfromparcel;
        }
        populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new ModalBottomSheetKt$ModalBottomSheet$5$1(sheetState, null, 17), 3);
        int i5 = MediaMetadataCompat + 51;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return createfromparcel;
    }
}
