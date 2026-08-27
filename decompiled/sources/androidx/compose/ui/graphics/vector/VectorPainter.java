package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidContentCaptureManager;
import o.PopulateViewStructure_androidKtpopulate7;
import o.createFromParcel;
import o.getCreditCardExpirationDate;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final PopulateViewStructure_androidKtpopulate7 autoMirror$delegate;
    private getCreditCardExpirationDate composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private final PopulateViewStructure_androidKtpopulate7 drawInvalidation$delegate;
    private final PopulateViewStructure_androidKtpopulate7 size$delegate;
    private final VectorComponent vector;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.currentAlpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }

    public final getCreditCardExpirationDate getComposition$ui() {
        return this.composition;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo1424getIntrinsicSizeNHjbRc() {
        return m1482getSizeNHjbRc$ui();
    }

    public final VectorComponent getVector$ui() {
        return this.vector;
    }

    public final void setComposition$ui(getCreditCardExpirationDate getcreditcardexpirationdate) {
        this.composition = getcreditcardexpirationdate;
    }

    private final createFromParcel getDrawInvalidation() {
        this.drawInvalidation$delegate.getValue();
        return createFromParcel.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidation(createFromParcel createfromparcel) {
        this.drawInvalidation$delegate.setValue(createfromparcel);
    }

    public final boolean getAutoMirror$ui() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: getBitmapConfig-_sVssgQ$ui, reason: not valid java name */
    public final int m1481getBitmapConfig_sVssgQ$ui() {
        return this.vector.m1471getCacheBitmapConfig_sVssgQ$ui();
    }

    public final ColorFilter getIntrinsicColorFilter$ui() {
        return this.vector.getIntrinsicColorFilter$ui();
    }

    public final String getName$ui() {
        return this.vector.getName();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc$ui, reason: not valid java name */
    public final long m1482getSizeNHjbRc$ui() {
        return ((Size) this.size$delegate.getValue()).m551unboximpl();
    }

    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui, reason: not valid java name */
    public final long m1483getViewportSizeNHjbRc$ui() {
        return this.vector.m1472getViewportSizeNHjbRc$ui();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter intrinsicColorFilter$ui = this.currentColorFilter;
        if (intrinsicColorFilter$ui == null) {
            intrinsicColorFilter$ui = vectorComponent.getIntrinsicColorFilter$ui();
        }
        if (getAutoMirror$ui() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long jMo1303getCenterF1C5BW0 = drawScope.mo1303getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo1232scale0AR0LA0(-1.0f, 1.0f, jMo1303getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui);
                c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
            } catch (Throwable th) {
                c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
                throw th;
            }
        } else {
            vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui);
        }
        getDrawInvalidation();
    }

    public final void setIntrinsicColorFilter$ui(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui(colorFilter);
    }

    public final void setName$ui(String str) {
        this.vector.setName(str);
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk$ui, reason: not valid java name */
    public final void m1484setSizeuvyYCjk$ui(long j) {
        this.size$delegate.setValue(Size.m534boximpl(j));
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui, reason: not valid java name */
    public final void m1485setViewportSizeuvyYCjk$ui(long j) {
        this.vector.m1473setViewportSizeuvyYCjk$ui(j);
    }

    public VectorPainter(GroupComponent groupComponent) {
        this.size$delegate = CompositionKt.RemoteActionCompatParcelizer(Size.m534boximpl(Size.Companion.m555getZeroNHjbRc()));
        this.autoMirror$delegate = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1486invoke() {
                this.this$0.setDrawInvalidation(createFromParcel.INSTANCE);
            }

            {
                super(0);
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1486invoke();
                return createFromParcel.INSTANCE;
            }
        });
        this.vector = vectorComponent;
        this.drawInvalidation$delegate = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
        this.currentAlpha = 1.0f;
    }

    public final void setAutoMirror$ui(boolean z) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VectorPainter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new GroupComponent() : groupComponent);
    }
}
