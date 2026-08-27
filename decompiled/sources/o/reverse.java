package o;

import android.content.Context;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public abstract class reverse {
    public static final void RemoteActionCompatParcelizer(String str, String str2, androidx.compose.ui.Modifier modifier, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, androidx.compose.ui.graphics.ColorFilter colorFilter, getBirthDateFull getbirthdatefull, int i) {
        androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
        androidx.compose.ui.layout.ContentScale fit = androidx.compose.ui.layout.ContentScale.Companion.getFit();
        int iM1307getDefaultFilterQualityfv9h1I = androidx.compose.ui.graphics.drawscope.DrawScope.Companion.m1307getDefaultFilterQualityfv9h1I();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        int i2 = i << 3;
        int i3 = (i2 & 1879048192) | (i & 126) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2);
        int i4 = i3 >> 3;
        updatePathdefault updatepathdefault = new updatePathdefault(str, (or) getpostalcode.write((getNewPassword) PathFillTypeCompanion.read), arcToRad.serializer((Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())));
        int i5 = coil3.compose.internal.UtilsKt.write;
        coil3.compose.SubcomposeAsyncImageKt.m3982SubcomposeAsyncImagegl8XCv8(updatepathdefault, str2, modifier, coil3.compose.AsyncImagePainter.RemoteActionCompatParcelizer, null, center, fit, colorFilter, iM1307getDefaultFilterQualityfv9h1I, new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(0, dragAndDropTargetModifierNode), true, -1106738291), getpostalcode, (i3 & 112) | (i4 & 896) | (i4 & 7168), 0);
    }
}
