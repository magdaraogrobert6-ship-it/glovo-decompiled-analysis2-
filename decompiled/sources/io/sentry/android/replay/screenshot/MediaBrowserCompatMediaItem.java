package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import java.util.WeakHashMap;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem extends Canvas {
    public Canvas IconCompatParcelizer;
    public final WeakHashMap RemoteActionCompatParcelizer;
    public final Rect read;
    public final Canvas serializer;
    public final Bitmap write;
    public final Paint MediaDescriptionCompat = new Paint();
    public final Paint RatingCompat = new Paint();
    public final Rect MediaBrowserCompatMediaItem = new Rect();

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        renderNode.getClass();
    }

    @Override // android.graphics.Canvas
    public final boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        path.getClass();
        return serializer().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        rectF.getClass();
        return serializer().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        path.getClass();
        op.getClass();
        return serializer().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        rectF.getClass();
        op.getClass();
        return serializer().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        rectF.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawArc(rectF, f, f2, z, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        bitmap.getClass();
        matrix.getClass();
        int iIconCompatParcelizer = IconCompatParcelizer(bitmap, paint, null);
        Paint paint2 = this.MediaDescriptionCompat;
        paint2.setColor(iIconCompatParcelizer);
        paint2.setColorFilter(null);
        int iSave = serializer().save();
        serializer().setMatrix(matrix);
        serializer().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
        serializer().restoreToCount(iSave);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        bitmap.getClass();
        fArr.getClass();
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawCircle(f, f2, f3, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        mode.getClass();
        serializer().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        rectF.getClass();
        fArr.getClass();
        rectF2.getClass();
        fArr2.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        iArr.getClass();
        fArr.getClass();
        font.getClass();
        paint.getClass();
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawLine(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        fArr.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawLines(fArr, i, i2, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        mesh.getClass();
        paint.getClass();
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        rectF.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawOval(rectF, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawPaint(paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        ninePatch.getClass();
        rect.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawPatch(ninePatch, rect, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        path.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawPath(path, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawPoint(f, f2, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        fArr.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawPoints(fArr, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        str.getClass();
        fArr.getClass();
        paint.getClass();
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        rectF.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawRect(rectF, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        rectF.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawRoundRect(rectF, f, f2, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        charSequence.getClass();
        paint.getClass();
        paint.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.MediaBrowserCompatMediaItem);
        serializer(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        str.getClass();
        path.getClass();
        paint.getClass();
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        charSequence.getClass();
        paint.getClass();
        paint.getTextBounds(charSequence.toString(), i, i2, this.MediaBrowserCompatMediaItem);
        serializer(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        vertexMode.getClass();
        fArr.getClass();
        paint.getClass();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        rect.getClass();
        return serializer().getClipBounds(rect);
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        matrix.getClass();
        serializer().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        rectF.getClass();
        edgeType.getClass();
        return serializer().quickReject(rectF, edgeType);
    }

    public static BitmapShader IconCompatParcelizer(Paint paint) {
        if (paint != null) {
            Shader shader = paint.getShader();
            if (shader instanceof BitmapShader) {
                paint.setShader(null);
                return (BitmapShader) shader;
            }
        }
        return null;
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        serializer().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        serializer().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        serializer().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        picture.getClass();
        Paint paint = this.MediaDescriptionCompat;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        serializer().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        serializer().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        serializer().enableZ();
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return serializer().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return serializer().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return serializer().getHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return serializer().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return serializer().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return serializer().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return serializer().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return serializer().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        serializer().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        serializer().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        serializer().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return serializer().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        int iSaveLayer = serializer().saveLayer(rectF, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderIconCompatParcelizer);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        return serializer().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        serializer().scale(f, f2);
    }

    public final void serializer(float f, float f2, Paint paint) {
        ColorFilter colorFilter = paint.getColorFilter();
        Paint paint2 = this.RatingCompat;
        paint2.setColorFilter(colorFilter);
        int color = paint.getColor();
        paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.MediaBrowserCompatMediaItem;
        drawRoundRect(rect.left + f, rect.top + f2, rect.right + f, rect.bottom + f2, 10.0f, 10.0f, paint2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        serializer().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        serializer().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        serializer().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        serializer().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        serializer().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        serializer().translate(f, f2);
    }

    public MediaBrowserCompatMediaItem() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        this.write = bitmapCreateBitmap;
        this.serializer = new Canvas(bitmapCreateBitmap);
        this.read = new Rect(0, 0, 1, 1);
        this.RemoteActionCompatParcelizer = new WeakHashMap();
    }

    public final Canvas serializer() {
        Canvas canvas = this.IconCompatParcelizer;
        if (canvas != null) {
            return canvas;
        }
        removeNodeAtDepth.serializer("delegate");
        throw null;
    }

    public final int IconCompatParcelizer(Bitmap bitmap, Paint paint, Rect rect) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        WeakHashMap weakHashMap = this.RemoteActionCompatParcelizer;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) weakHashMap.get(bitmap);
        if (onviewattachedtowindowlambda0 != null && ((Number) onviewattachedtowindowlambda0.serializer).intValue() == bitmap.getGenerationId()) {
            return ((Number) onviewattachedtowindowlambda0.write).intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        Bitmap bitmap2 = this.write;
        Rect rect2 = this.read;
        Canvas canvas = this.serializer;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
            canvas.drawBitmap(bitmap.asShared(), rect, rect2, paint);
            if (bitmapShaderIconCompatParcelizer != null && paint != null) {
                paint.setShader(bitmapShaderIconCompatParcelizer);
            }
            pixel = bitmap2.getPixel(0, 0);
        } else if (bitmap.getConfig() != config2) {
            BitmapShader bitmapShaderIconCompatParcelizer2 = IconCompatParcelizer(paint);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (bitmapShaderIconCompatParcelizer2 != null && paint != null) {
                paint.setShader(bitmapShaderIconCompatParcelizer2);
            }
            pixel = bitmap2.getPixel(0, 0);
        }
        weakHashMap.put(bitmap, new onViewAttachedToWindowlambda0(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        return serializer().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        cArr.getClass();
        fArr.getClass();
        paint.getClass();
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        cArr.getClass();
        path.getClass();
        paint.getClass();
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return serializer().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        serializer().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return serializer().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        rect.getClass();
        return serializer().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        serializer().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        return serializer().clipOutRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        blendMode.getClass();
        serializer().drawColor(i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        return serializer().clipOutRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        blendMode.getClass();
        serializer().drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        path.getClass();
        return serializer().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        rect.getClass();
        op.getClass();
        return serializer().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        rectF.getClass();
        return serializer().quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        rectF.getClass();
        return serializer().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        path.getClass();
        edgeType.getClass();
        return serializer().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        rect.getClass();
        return serializer().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        path.getClass();
        return serializer().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        op.getClass();
        return serializer().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        edgeType.getClass();
        return serializer().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return serializer().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        cArr.getClass();
        paint.getClass();
        paint.getTextBounds(cArr, 0, i + i2, this.MediaBrowserCompatMediaItem);
        serializer(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        return serializer().quickReject(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        int iSaveLayer = serializer().saveLayer(rectF, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderIconCompatParcelizer);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return serializer().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawArc(f, f2, f3, f4, f5, f6, z, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        fArr.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawLines(fArr, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawOval(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawPoints(fArr, i, i2, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        rect.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawRect(rect, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        measuredText.getClass();
        paint.getClass();
        paint.getTextBounds(measuredText.toString(), i, i2, this.MediaBrowserCompatMediaItem);
        serializer(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        int iSaveLayer = serializer().saveLayer(f, f2, f3, f4, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderIconCompatParcelizer);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        ninePatch.getClass();
        rectF.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawPatch(ninePatch, rectF, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawRect(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        str.getClass();
        paint.getClass();
        paint.getTextBounds(str, 0, str.length(), this.MediaBrowserCompatMediaItem);
        serializer(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        int iSaveLayer = serializer().saveLayer(f, f2, f3, f4, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderIconCompatParcelizer);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        str.getClass();
        paint.getClass();
        paint.getTextBounds(str, i, i2, this.MediaBrowserCompatMediaItem);
        serializer(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        cArr.getClass();
        paint.getClass();
        paint.getTextBounds(cArr, i, i2, this.MediaBrowserCompatMediaItem);
        serializer(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        rectF.getClass();
        rectF2.getClass();
        paint.getClass();
        BitmapShader bitmapShaderIconCompatParcelizer = IconCompatParcelizer(paint);
        serializer().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
        paint.setShader(bitmapShaderIconCompatParcelizer);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        picture.getClass();
        rectF.getClass();
        Paint paint = this.MediaDescriptionCompat;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        serializer().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        picture.getClass();
        rect.getClass();
        Paint paint = this.MediaDescriptionCompat;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        serializer().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        iArr.getClass();
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        bitmap.getClass();
        int iIconCompatParcelizer = IconCompatParcelizer(bitmap, paint, null);
        Paint paint2 = this.MediaDescriptionCompat;
        paint2.setColor(iIconCompatParcelizer);
        paint2.setColorFilter(null);
        serializer().drawRect(f, f2, f + bitmap.getWidth(), f2 + bitmap.getHeight(), paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        bitmap.getClass();
        rectF.getClass();
        int iIconCompatParcelizer = IconCompatParcelizer(bitmap, paint, rect);
        Paint paint2 = this.MediaDescriptionCompat;
        paint2.setColor(iIconCompatParcelizer);
        paint2.setColorFilter(null);
        serializer().drawRect(rectF, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        bitmap.getClass();
        rect2.getClass();
        int iIconCompatParcelizer = IconCompatParcelizer(bitmap, paint, rect);
        Paint paint2 = this.MediaDescriptionCompat;
        paint2.setColor(iIconCompatParcelizer);
        paint2.setColorFilter(null);
        serializer().drawRect(rect2, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        iArr.getClass();
    }
}
