package o;

import android.os.Bundle;
import com.roadrunner.startworking.equipment.EquipmentBottomSheet;
import com.roadrunner.startworking.equipment.navigation.EquipmentBottomSheetParams;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MotionEventAdapterIndirectPointerEventData {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static EquipmentBottomSheet read(String str, EquipmentBottomSheetParams equipmentBottomSheetParams) {
        int i = 2 % 2;
        equipmentBottomSheetParams.getClass();
        EquipmentBottomSheet equipmentBottomSheet = new EquipmentBottomSheet();
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0("equipment_bottom_sheet_request_key", str), new onViewAttachedToWindowlambda0("equipment_bottom_sheet_params_key", equipmentBottomSheetParams)};
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        equipmentBottomSheet.setArguments((Bundle) setNativeShader.read(-1771348314, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{onviewattachedtowindowlambda0Arr}, iSerializer, isAppSetIdReadingEnabled.serializer(), 1771348320));
        int i2 = IconCompatParcelizer + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return equipmentBottomSheet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r13 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        if (r13 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r6 = o.MotionEventAdapterIndirectPointerEventData.RemoteActionCompatParcelizer + 115;
        o.MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
        r6 = r1.write;
        r7 = ((o.TextFieldImplKtCommonDecorationBox3decoratedSuffix1) r6[0]).serializer;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r8 >= r13) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r9 = o.MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer + 41;
        o.MotionEventAdapterIndirectPointerEventData.RemoteActionCompatParcelizer = r9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r9 = r9 % 2;
        r9 = ((o.TextFieldImplKtCommonDecorationBox3decoratedSuffix1) r6[r8]).serializer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r9 >= r7) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r7 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        o.TriStateCheckbox.read("negative minIndex");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        r13 = r1.read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r13 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        r0 = r1.write;
        r1 = ((o.TextFieldImplKtCommonDecorationBox3decoratedSuffix1) r0[0]).read;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (r4 >= r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        r5 = ((o.TextFieldImplKtCommonDecorationBox3decoratedSuffix1) r0[r4]).read;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (r5 <= r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        r1 = new o.ensureSubscribedToInAppMessageEventslambda7(r7, java.lang.Math.min(r1, r11.serializer() - 1), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        o.DrawableTransformation.write("MutableVector is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ac, code lost:
    
        o.DrawableTransformation.write("MutableVector is empty.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List IconCompatParcelizer(o.onRelease r11, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList r12, o.CommonDecorationBox r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MotionEventAdapterIndirectPointerEventData.IconCompatParcelizer(o.onRelease, androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList, o.CommonDecorationBox):java.util.List");
    }
}
