package androidx.compose.ui.graphics;

import android.graphics.Shader;
import o.getCardAtIndex;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public interface Paint {
    float getAlpha();

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    int mo591getBlendMode0nO6VwU();

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    long mo592getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I */
    int mo593getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* JADX INFO: renamed from: getStrokeCap-KaPHkGw */
    int mo594getStrokeCapKaPHkGw();

    /* JADX INFO: renamed from: getStrokeJoin-LxFBmk8 */
    int mo595getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* JADX INFO: renamed from: getStyle-TiuSbCo */
    int mo596getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f);

    void setAntiAlias(boolean z);

    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    void mo597setBlendModes9anfk8(int i);

    /* JADX INFO: renamed from: setColor-8_81llA */
    void mo598setColor8_81llA(long j);

    void setColorFilter(ColorFilter colorFilter);

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo */
    void mo599setFilterQualityvDHp3xo(int i);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* JADX INFO: renamed from: setStrokeCap-BeK7IIE */
    void mo600setStrokeCapBeK7IIE(int i);

    /* JADX INFO: renamed from: setStrokeJoin-Ww9F2mQ */
    void mo601setStrokeJoinWw9F2mQ(int i);

    void setStrokeMiterLimit(float f);

    void setStrokeWidth(float f);

    /* JADX INFO: renamed from: setStyle-k9PVt8s */
    void mo602setStylek9PVt8s(int i);

    @onItemDismisslambda0
    default android.graphics.Paint asFrameworkPaint() {
        throw new getCardAtIndex(0);
    }
}
