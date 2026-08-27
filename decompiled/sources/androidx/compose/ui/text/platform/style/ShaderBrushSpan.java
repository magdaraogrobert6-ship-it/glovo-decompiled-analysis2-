package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import o.PopulateViewStructure_androidKtpopulate7;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final PopulateViewStructure_androidKtpopulate7 size$delegate = CompositionKt.RemoteActionCompatParcelizer(Size.m534boximpl(Size.Companion.m554getUnspecifiedNHjbRc()));
    private final onViewAttachedToWindow shaderState = CompositionKt.serializer(new CoroutineLiveData$$ExternalSyntheticLambda0(24, this));

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m3371getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m551unboximpl();
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk, reason: not valid java name */
    public final void m3372setSizeuvyYCjk(long j) {
        this.size$delegate.setValue(Size.m534boximpl(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader((Shader) this.shaderState.getValue());
    }

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f) {
        this.shaderBrush = shaderBrush;
        this.alpha = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shader shaderState$lambda$0(ShaderBrushSpan shaderBrushSpan) {
        if (shaderBrushSpan.m3371getSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m548isEmptyimpl(shaderBrushSpan.m3371getSizeNHjbRc())) {
            return null;
        }
        return shaderBrushSpan.shaderBrush.mo691createShaderuvyYCjk(shaderBrushSpan.m3371getSizeNHjbRc());
    }
}
