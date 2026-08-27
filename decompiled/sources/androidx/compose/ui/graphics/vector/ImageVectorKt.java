package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class ImageVectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return (T) af$$ExternalSyntheticOutline0.m(1, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m1463pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        PathBuilder pathBuilder = new PathBuilder();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(pathBuilder);
        return builder.m1462addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : i3, (14336 & 4) != 0 ? "" : str, (14336 & 8) != 0 ? null : brush, (14336 & 16) != 0 ? 1.0f : f, (14336 & 32) == 0 ? brush2 : null, (14336 & 64) != 0 ? 1.0f : f2, (14336 & Fields.SpotShadowColor) != 0 ? 0.0f : f3, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : i, (14336 & Fields.RotationY) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i2, (14336 & Fields.RotationZ) != 0 ? 4.0f : f4, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & Fields.TransformOrigin) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
    }

    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends PathNode> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        builder.addGroup(str, f, f2, f3, f4, f5, f6, f7, list);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        builder.addGroup((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2, (i & 8) != 0 ? 0.0f : f3, (i & 16) != 0 ? 1.0f : f4, (i & 32) == 0 ? f5 : 1.0f, (i & 64) != 0 ? 0.0f : f6, (i & Fields.SpotShadowColor) != 0 ? 0.0f : f7, (i & Fields.RotationX) != 0 ? VectorKt.getEmptyPath() : list);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1464pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i4, Object obj) {
        String str2 = (i4 & 1) != 0 ? "" : str;
        Brush brush3 = (i4 & 2) != 0 ? null : brush;
        float f5 = (i4 & 4) != 0 ? 1.0f : f;
        Brush brush4 = (i4 & 8) != 0 ? null : brush2;
        float f6 = (i4 & 16) != 0 ? 1.0f : f2;
        float f7 = (i4 & 32) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i4 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i;
        int defaultStrokeLineJoin = (i4 & Fields.SpotShadowColor) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i2;
        float f8 = (i4 & Fields.RotationX) != 0 ? 4.0f : f4;
        int defaultFillType = (i4 & Fields.RotationY) != 0 ? VectorKt.getDefaultFillType() : i3;
        PathBuilder pathBuilder = new PathBuilder();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(pathBuilder);
        return builder.m1462addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : str2, (14336 & 8) != 0 ? null : brush3, (14336 & 16) != 0 ? 1.0f : f5, (14336 & 32) == 0 ? brush4 : null, (14336 & 64) != 0 ? 1.0f : f6, (14336 & Fields.SpotShadowColor) != 0 ? 0.0f : f7, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : defaultStrokeLineCap, (14336 & Fields.RotationY) != 0 ? VectorKt.getDefaultStrokeLineJoin() : defaultStrokeLineJoin, (14336 & Fields.RotationZ) != 0 ? 4.0f : f8, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & Fields.TransformOrigin) == 0 ? 0.0f : 1.0f, (14336 & 8192) == 0 ? 0.0f : 0.0f);
    }
}
