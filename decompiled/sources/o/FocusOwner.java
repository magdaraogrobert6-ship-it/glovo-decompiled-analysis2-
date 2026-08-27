package o;

import android.graphics.ComposeShader;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class FocusOwner {
    public static /* synthetic */ RenderNode bA_() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ RenderNode bC_() {
        return new RenderNode("Compose");
    }

    public static /* synthetic */ ComposeShader bz_(Shader shader, Shader shader2, android.graphics.BlendMode blendMode) {
        return new ComposeShader(shader, shader2, blendMode);
    }

    public static /* synthetic */ android.graphics.Typeface.CustomFallbackBuilder bB_(android.graphics.fonts.FontFamily fontFamily) {
        return new android.graphics.Typeface.CustomFallbackBuilder(fontFamily);
    }
}
