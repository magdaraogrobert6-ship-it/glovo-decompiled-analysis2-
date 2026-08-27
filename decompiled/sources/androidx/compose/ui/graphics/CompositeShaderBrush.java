package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class CompositeShaderBrush extends ShaderBrush {
    public static final int $stable = 0;
    private final int blendMode;
    private final ShaderBrush dstBrush;
    private final ShaderBrush srcBrush;

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m806getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    public final ShaderBrush getDstBrush() {
        return this.dstBrush;
    }

    public final ShaderBrush getSrcBrush() {
        return this.srcBrush;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    /* JADX INFO: renamed from: createShader-uvyYCjk */
    public Shader mo691createShaderuvyYCjk(long j) {
        return ShaderKt.m1056CompositeShader7EN7VTw(this.dstBrush.mo691createShaderuvyYCjk(j), this.srcBrush.mo691createShaderuvyYCjk(j), this.blendMode);
    }

    public int hashCode() {
        int iHashCode = this.dstBrush.hashCode();
        return BlendMode.m632hashCodeimpl(this.blendMode) + ((this.srcBrush.hashCode() + (iHashCode * 31)) * 31);
    }

    private CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i) {
        this.dstBrush = shaderBrush;
        this.srcBrush = shaderBrush2;
        this.blendMode = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeShaderBrush)) {
            return false;
        }
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dstBrush, compositeShaderBrush.dstBrush}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.srcBrush, compositeShaderBrush.srcBrush}, getCieXyz.write())).booleanValue() && BlendMode.m631equalsimpl0(this.blendMode, compositeShaderBrush.blendMode);
    }

    public String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.dstBrush + ", srcBrush=" + this.srcBrush + ", blendMode=" + ((Object) BlendMode.m633toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shaderBrush, shaderBrush2, i);
    }
}
