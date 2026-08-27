package o;

import androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnnotatedStringResolveInlineContentKtInlineChildren121 {
    public static final DragAndDropTargetModifierNode serializer = new DragAndDropTargetModifierNode(new r8lambdam6kPPA3z8dHTentc0gq2uQ_Iyco() { // from class: o.BasicTextCL7eQgs
        @Override // o.r8lambdam6kPPA3z8dHTentc0gq2uQ_Iyco
        public final Object RemoteActionCompatParcelizer(Object obj, Object obj2, Boolean bool, Object obj3, Object obj4, Object obj5, getPostalCode getpostalcode, Integer num) {
            int i;
            androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj;
            String str = (String) obj2;
            boolean zBooleanValue = bool.booleanValue();
            BasicTextFieldKt basicTextFieldKt = (BasicTextFieldKt) obj3;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj4;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                i = (getpostalcode.read(modifier) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= getpostalcode.read(str) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i |= getpostalcode.write(zBooleanValue) ? androidx.compose.ui.graphics.Fields.RotationX : androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            if ((iIntValue & 3072) == 0) {
                i |= getpostalcode.read(basicTextFieldKt) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
            }
            if ((iIntValue & 24576) == 0) {
                i |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
            }
            if ((iIntValue & 196608) == 0) {
                i |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? androidx.compose.ui.graphics.Fields.RenderEffect : 65536;
            }
            if (getpostalcode.write(i & 1, (599187 & i) != 599186)) {
                androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuItem(str, zBooleanValue, basicTextFieldKt, modifier, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createFromParcel.INSTANCE;
        }
    }, false, -1571120048);
    public static final DragAndDropTargetModifierNode RemoteActionCompatParcelizer = new DragAndDropTargetModifierNode(new ComposeViewAdapter$$ExternalSyntheticLambda2(1), false, -1455401925);
}
