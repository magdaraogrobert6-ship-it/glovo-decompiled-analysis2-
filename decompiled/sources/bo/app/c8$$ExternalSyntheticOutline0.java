package bo.app;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.fragment.app.Fragment;
import coil3.ExtrasKt;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.geojson.Point;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import java.util.List;
import kotlin.KotlinNothingValueException;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetYbuCTN8;
import o.RequestChildFocusKt;
import o.createInAppMessageEventSubscriber;
import o.getDoubleOrNull;
import o.getPostalCode;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c8$$ExternalSyntheticOutline0 {
    public static float m(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static StringBuilder m(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static int m(int i, int i2, int i3, int i4) {
        return RequestChildFocusKt.write(i) + i2 + i3 + i4;
    }

    public static int m(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static MutableInteractionSourceImpl m(getPostalCode getpostalcode) {
        MutableInteractionSourceImpl mutableInteractionSourceImpl = new MutableInteractionSourceImpl();
        getpostalcode.write(mutableInteractionSourceImpl);
        return mutableInteractionSourceImpl;
    }

    public static Expression m(Expression.ExpressionBuilder expressionBuilder, Expression expression, SymbolLayer symbolLayer) {
        expressionBuilder.addArgument(expression);
        Expression expressionBuild = expressionBuilder.build();
        symbolLayer.getClass();
        return expressionBuild;
    }

    public static ClassCastException m(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String m(int i, String str) {
        return str + i;
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String m(Class cls, String str) {
        return str + cls;
    }

    public static String m(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(String str, List list) {
        return str + list;
    }

    public static String m(StringBuilder sb, String str, Boolean bool) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder m(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static KotlinNothingValueException m(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static createInAppMessageEventSubscriber m3979m(Object obj) {
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return new createInAppMessageEventSubscriber();
    }

    public static void m(float f, float f2, float f3, float f4, float f5) {
        Dp.m3673constructorimpl(f);
        Dp.m3673constructorimpl(f2);
        Dp.m3673constructorimpl(f3);
        Dp.m3673constructorimpl(f4);
        Dp.m3673constructorimpl(f5);
    }

    public static void m(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void m(int i, getPostalCode getpostalcode, int i2, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        getpostalcode.write(Integer.valueOf(i));
        getpostalcode.write(Integer.valueOf(i2), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static void m(DrawContext drawContext, long j) {
        drawContext.getCanvas().restore();
        drawContext.mo1226setSizeuvyYCjk(j);
    }

    public static void m(ComposeUiNode.Companion companion, getPostalCode getpostalcode, ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8, getPostalCode getpostalcode2, DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1) {
        AndroidContentCaptureManagerCompanion.write(getpostalcode, modalBottomSheetYbuCTN8, companion.getSetMeasurePolicy());
        AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1, companion.getSetResolvedCompositionLocals());
    }

    public static void m(Point point, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(point));
        sb.append(str);
    }

    public static void m(getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2, getDoubleOrNull getdoubleornull3, getDoubleOrNull getdoubleornull4, getDoubleOrNull getdoubleornull5) {
        getdoubleornull.getClass();
        getdoubleornull2.getClass();
        getdoubleornull3.getClass();
        getdoubleornull4.getClass();
        getdoubleornull5.getClass();
    }

    public static void m(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
