package o;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RoundedCornerShapeKt implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RatingCompat = 1;
    private static int read;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ RoundedCornerShapeKt(hashCode hashcode, androidx.compose.ui.layout.Placeable placeable, int i) {
        this.serializer = 1;
        this.write = hashcode;
        this.IconCompatParcelizer = placeable;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ RoundedCornerShapeKt(int i, int i2, Object obj, Object obj2) {
        this.serializer = i2;
        this.write = obj;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 85;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = null;
        if (i3 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            textLayoutResult.hashCode();
            throw null;
        }
        int i4 = this.serializer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        int i5 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.write;
        if (i4 == 0) {
            androidx.compose.foundation.ScrollNode scrollNode = (androidx.compose.foundation.ScrollNode) obj3;
            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) obj2;
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
            int iSerializer = scrollNode.write.serializer();
            int i6 = 0;
            if (iSerializer < 0) {
                iSerializer = 0;
            }
            if (iSerializer <= i5) {
                i5 = iSerializer;
            }
            int i7 = -i5;
            boolean z = scrollNode.IconCompatParcelizer;
            if (z) {
                int i8 = RatingCompat;
                int i9 = i8 + 13;
                read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = i8 + 11;
                read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i = 0;
            } else {
                i = i7;
            }
            if (!z) {
                i7 = 0;
            }
            placementScope.withMotionFrameOfReferencePlacement(new bringIntoView(i, i7, i6, placeable));
            return createfromparcel2;
        }
        if (i4 == 1) {
            hashCode hashcode = (hashCode) obj3;
            androidx.compose.ui.layout.Placeable placeable2 = (androidx.compose.ui.layout.Placeable) obj2;
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
            int i13 = hashcode.write;
            equals equalsVar = hashcode.read;
            androidx.compose.ui.text.input.TransformedText transformedText = hashcode.RemoteActionCompatParcelizer;
            androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy = (androidx.compose.foundation.text.TextLayoutResultProxy) hashcode.IconCompatParcelizer.invoke();
            androidx.compose.ui.text.TextLayoutResult textLayoutResult2 = textLayoutResultProxy != null ? textLayoutResultProxy.RemoteActionCompatParcelizer : null;
            int i14 = RatingCompat + 1;
            read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i15 = i14 % 2;
            equalsVar.serializer(SelectionHandleIcon.Vertical, AlignmentVertical.read(placementScope2, i13, transformedText, textLayoutResult2, false, placeable2.getWidth()), i5, placeable2.getHeight());
            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope2, placeable2, 0, Math.round(-equalsVar.serializer()), 0.0f, 4, null);
            return createfromparcel2;
        }
        RectListDebugger rectListDebugger = (RectListDebugger) obj3;
        androidx.compose.ui.text.AnnotatedString.Builder builder = (androidx.compose.ui.text.AnnotatedString.Builder) obj;
        builder.getClass();
        builder.append(rectListDebugger.IconCompatParcelizer.IconCompatParcelizer(i5));
        int length = builder.getLength();
        com.huawei.wisesecurity.ucs_credential.p0 p0Var = rectListDebugger.serializer;
        long j = ((getEverythingButLastChildOffset) ((distanceScore) obj2)).read;
        p0Var.getClass();
        builder.append(" ".concat(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60)}, 1)) + ":" + String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(j % 60)}, 1))));
        builder.addStyle(new androidx.compose.ui.text.SpanStyle(0L, 0L, androidx.compose.ui.text.font.FontWeight.Companion.getBold(), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65531, (DefaultConstructorMarker) null), length, builder.getLength());
        return createfromparcel2;
    }
}
