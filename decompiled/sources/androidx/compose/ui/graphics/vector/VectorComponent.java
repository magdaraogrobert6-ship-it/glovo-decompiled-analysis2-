package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSize;
import bo.app.c8$$ExternalSyntheticOutline0;
import o.PopulateViewStructure_androidKtpopulate7;
import o.createFromParcel;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    private final DrawCache cacheDrawScope;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM drawVectorBlock;
    private final PopulateViewStructure_androidKtpopulate7 intrinsicColorFilter$delegate;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final PopulateViewStructure_androidKtpopulate7 viewportSize$delegate;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VNode) obj);
                return createFromParcel.INSTANCE;
            }

            {
                super(1);
            }

            public final void invoke(VNode vNode) {
                VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m1474invoke() {
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public /* bridge */ /* synthetic */ Object invoke() {
                m1474invoke();
                return createFromParcel.INSTANCE;
            }
        };
        this.intrinsicColorFilter$delegate = CompositionKt.RemoteActionCompatParcelizer(null);
        Size.Companion companion = Size.Companion;
        this.viewportSize$delegate = CompositionKt.RemoteActionCompatParcelizer(Size.m534boximpl(companion.m555getZeroNHjbRc()));
        this.previousDrawSize = companion.m554getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            public final void invoke(DrawScope drawScope) {
                GroupComponent root = this.this$0.getRoot();
                VectorComponent vectorComponent = this.this$0;
                float f = vectorComponent.rootScaleX;
                float f2 = vectorComponent.rootScaleY;
                long jM493getZeroF1C5BW0 = Offset.Companion.m493getZeroF1C5BW0();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo1232scale0AR0LA0(f, f2, jM493getZeroF1C5BW0);
                    root.draw(drawScope);
                } finally {
                    c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
                }
            }

            {
                super(1);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return createFromParcel.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getInvalidateCallback$ui() {
        return this.invalidateCallback;
    }

    public final String getName() {
        return this.name;
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    public final void setInvalidateCallback$ui(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.invalidateCallback = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void draw(DrawScope drawScope, float f, ColorFilter colorFilter) {
        int iM955getAlpha8_sVssgQ = (this.root.isTintable() && this.root.m1456getTintColor0d7_KjU() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui()) && VectorKt.tintableWithAlphaMask(colorFilter)) ? ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ() : ImageBitmapConfig.Companion.m956getArgb8888_sVssgQ();
        if (this.isDirty || !Size.m542equalsimpl0(this.previousDrawSize, drawScope.mo1304getSizeNHjbRc()) || !ImageBitmapConfig.m951equalsimpl0(iM955getAlpha8_sVssgQ, m1471getCacheBitmapConfig_sVssgQ$ui())) {
            this.tintFilter = ImageBitmapConfig.m951equalsimpl0(iM955getAlpha8_sVssgQ, ImageBitmapConfig.Companion.m955getAlpha8_sVssgQ()) ? ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, VectorKt.m1480toOpaque8_81llA(this.root.m1456getTintColor0d7_KjU()), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (m1472getViewportSizeNHjbRc$ui() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) / Float.intBitsToFloat((int) (m1472getViewportSizeNHjbRc$ui() & 4294967295L));
            this.cacheDrawScope.m1454drawCachedImageFqjB98A(iM955getAlpha8_sVssgQ, IntSize.m3839constructorimpl((4294967295L & ((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)))))) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32))))) << 32)), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo1304getSizeNHjbRc();
        }
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui() != null ? getIntrinsicColorFilter$ui() : this.tintFilter;
        }
        this.cacheDrawScope.drawInto(drawScope, f, colorFilter);
    }

    /* JADX INFO: renamed from: getCacheBitmapConfig-_sVssgQ$ui, reason: not valid java name */
    public final int m1471getCacheBitmapConfig_sVssgQ$ui() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo586getConfig_sVssgQ() : ImageBitmapConfig.Companion.m956getArgb8888_sVssgQ();
    }

    public final ColorFilter getIntrinsicColorFilter$ui() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui, reason: not valid java name */
    public final long m1472getViewportSizeNHjbRc$ui() {
        return ((Size) this.viewportSize$delegate.getValue()).m551unboximpl();
    }

    public final void setIntrinsicColorFilter$ui(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui, reason: not valid java name */
    public final void m1473setViewportSizeuvyYCjk$ui(long j) {
        this.viewportSize$delegate.setValue(Size.m534boximpl(j));
    }

    public String toString() {
        return "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m1472getViewportSizeNHjbRc$ui() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m1472getViewportSizeNHjbRc$ui() & 4294967295L)) + "\n";
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
