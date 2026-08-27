package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.location.LocationRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UiMediaScopeViewingDistance implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int write;

    public /* synthetic */ UiMediaScopeViewingDistance(int i) {
        this.write = i;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01dd  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        androidx.compose.ui.text.SpanStyle spanStyle;
        String str;
        int i = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i) {
            case 0:
                androidx.compose.ui.semantics.SemanticsPropertiesKt.m2833setRolekuIjeqM((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj, androidx.compose.ui.semantics.Role.Companion.m2814getButtono7Vup1c());
                return createfromparcel;
            case 1:
                androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = (androidx.compose.foundation.text.selection.TextFieldPreparedSelection) obj;
                Integer numSerializer = textFieldPreparedSelection.serializer();
                if (numSerializer != null) {
                    return new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(0, numSerializer.intValue() - androidx.compose.ui.text.TextRange.m3071getEndimpl(textFieldPreparedSelection.MediaDescriptionCompat));
                }
                return null;
            case 2:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                SelectionHandleIcon selectionHandleIcon = ((Boolean) obj2).booleanValue() ? SelectionHandleIcon.Vertical : SelectionHandleIcon.Horizontal;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new equals(selectionHandleIcon, ((Float) obj3).floatValue());
            case 3:
                androidx.compose.ui.text.AnnotatedString.Range range = (androidx.compose.ui.text.AnnotatedString.Range) obj;
                if (range.getItem() instanceof androidx.compose.ui.text.LinkAnnotation) {
                    Object item = range.getItem();
                    item.getClass();
                    if (!getHorizontalBias.RemoteActionCompatParcelizer(((androidx.compose.ui.text.LinkAnnotation) item).getStyles())) {
                        Object item2 = range.getItem();
                        item2.getClass();
                        androidx.compose.ui.text.TextLinkStyles styles = ((androidx.compose.ui.text.LinkAnnotation) item2).getStyles();
                        if (styles == null || (spanStyle = styles.getStyle()) == null) {
                            spanStyle = new androidx.compose.ui.text.SpanStyle(0L, 0L, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65535, (DefaultConstructorMarker) null);
                        }
                        return androidx.sqlite.SQLite.write(range, new androidx.compose.ui.text.AnnotatedString.Range(spanStyle, range.getStart(), range.getEnd()));
                    }
                }
                return androidx.sqlite.SQLite.write(range);
            case 4:
                ((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj).set(androidx.compose.ui.semantics.SemanticsProperties.INSTANCE.getLinkTestMarker(), createfromparcel);
                return createfromparcel;
            case 5:
                Context context = (Context) obj;
                List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(listQueryIntentActivities.size());
                int size = listQueryIntentActivities.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = listQueryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        arrayList.add(resolveInfo);
                    } else {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                            arrayList.add(resolveInfo);
                        }
                    }
                }
                return arrayList;
            case 6:
                return createfromparcel;
            case 7:
                return createfromparcel;
            case 8:
                androidx.compose.ui.geometry.Offset offset = (androidx.compose.ui.geometry.Offset) obj;
                return (offset.m487unboximpl() & androidx.compose.ui.geometry.InlineClassHelperKt.DualUnsignedFloatMask) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? new animateToZero(Float.intBitsToFloat((int) (offset.m487unboximpl() >> 32)), Float.intBitsToFloat((int) (offset.m487unboximpl() & 4294967295L))) : androidx.compose.foundation.text.selection.SelectionMagnifierKt.IconCompatParcelizer;
            case 9:
                animateToZero animatetozero = (animateToZero) obj;
                return androidx.compose.ui.geometry.Offset.m466boximpl(androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(animatetozero.RemoteActionCompatParcelizer)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(animatetozero.serializer)))));
            case 10:
                return Boolean.TRUE;
            case 11:
                float f = androidx.compose.material3.ModalBottomSheetKt.serializer;
                return Boolean.TRUE;
            case 12:
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj, true);
                return createfromparcel;
            case 13:
                androidx.compose.ui.semantics.SemanticsPropertiesKt.dialog((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                return createfromparcel;
            case 14:
                getSpacingD9Ej5fM getspacingd9ej5fm = (getSpacingD9Ej5fM) obj;
                getspacingd9ej5fm.write = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                getspacingd9ej5fm.read(LocationRequest.PRIORITY_INDOOR, fValueOf).write = accesstrimToSafeLength.IconCompatParcelizer;
                getspacingd9ej5fm.read(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                getspacingd9ej5fm.read(1800, fValueOf2);
                getspacingd9ej5fm.read(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                getspacingd9ej5fm.read(3300, fValueOf3);
                getspacingd9ej5fm.read(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                getspacingd9ej5fm.read(4800, fValueOf4);
                getspacingd9ej5fm.read(6000, fValueOf4);
                return createfromparcel;
            case 15:
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setContainer((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj, true);
                return createfromparcel;
            case 16:
                float f2 = androidx.compose.material3.internal.AccessibilityUtilKt.write;
                return createfromparcel;
            case 17:
                androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope = (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj;
                int iM711getIntersectrtfAjoo = androidx.compose.ui.graphics.ClipOp.Companion.m711getIntersectrtfAjoo();
                androidx.compose.ui.graphics.drawscope.DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo1228clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM711getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                    return createfromparcel;
                } finally {
                    c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
                }
            case 18:
                Float f3 = (Float) obj;
                f3.getClass();
                return new getOnFill(new androidx.compose.animation.core.Animatable(f3, requiredWidth3ABfNKs.read, (Object) null, 12));
            case 19:
                return new BlockDropShadowNode((Map) obj);
            case 20:
                return androidx.compose.ui.text.MultiParagraphKt.findParagraphByIndex$lambda$2$0((androidx.compose.ui.text.ParagraphInfo) obj);
            case 21:
                return androidx.compose.ui.text.Savers_androidKt.PlatformParagraphStyleSaver$lambda$1(obj);
            case 22:
                return androidx.compose.ui.text.Savers_androidKt.emojiSupportMatchSaver$lambda$1(obj);
            case 23:
                return androidx.compose.ui.text.Savers_androidKt.LineBreakSaver$lambda$1(obj);
            case 24:
                return androidx.compose.ui.text.Savers_androidKt.TextMotionSaver$lambda$1(obj);
            case 25:
                return androidx.compose.ui.text.Savers_androidKt.TextMotionLinearitySaver$lambda$1(obj);
            case 26:
                return androidx.compose.ui.text.font.FontFamilyResolverImpl.preload$lambda$1$0((androidx.compose.ui.text.font.TypefaceResult.Immutable) obj);
            case 27:
                return androidx.compose.ui.text.font.FontFamilyResolverImpl.preload$lambda$1$1((androidx.compose.ui.text.font.TypefaceResult.Immutable) obj);
            case 28:
                return androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter.preload$lambda$3$0((androidx.compose.ui.text.font.TypefaceRequest) obj);
            default:
                return androidx.compose.ui.tooling.ComposeViewAdapter.processViewInfos$lambda$0((invalidateDrawCache) obj);
        }
    }
}
