package o;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class applyToFlingBMRW4eQ {
    public static final pullBottomk4lQ0M read = pullBottomk4lQ0M.FILL_CENTER;
    public android.util.Size IconCompatParcelizer;
    public android.graphics.Rect MediaBrowserCompatMediaItem;
    public pullBottomk4lQ0M MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public android.graphics.Matrix MediaSessionCompatQueueItem;
    public boolean RemoteActionCompatParcelizer;
    public int serializer;
    public boolean write;

    public final android.util.Size serializer() {
        return MediaStoreVideoCannotWrite.serializer(this.serializer) ? new android.util.Size(this.MediaBrowserCompatMediaItem.height(), this.MediaBrowserCompatMediaItem.width()) : new android.util.Size(this.MediaBrowserCompatMediaItem.width(), this.MediaBrowserCompatMediaItem.height());
    }

    public final RectF read(android.util.Size size, int i) {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, RemoteActionCompatParcelizer());
        android.graphics.Matrix matrixSerializer = serializer(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.IconCompatParcelizer.getWidth(), this.IconCompatParcelizer.getHeight());
        matrixSerializer.mapRect(rectF);
        return rectF;
    }

    public final android.graphics.Matrix serializer(android.util.Size size, int i) {
        android.graphics.Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, RemoteActionCompatParcelizer());
        if (MediaStoreVideoCannotWrite.IconCompatParcelizer(size, true, serializer())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            android.util.Size sizeSerializer = serializer();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeSerializer.getWidth(), sizeSerializer.getHeight());
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            pullBottomk4lQ0M pullbottomk4lq0m = this.MediaDescriptionCompat;
            switch (AbstractClickableNodeonKeyEvent1.write[pullbottomk4lq0m.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = android.graphics.Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = android.graphics.Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = android.graphics.Matrix.ScaleToFit.START;
                    break;
                default:
                    setInflatedId.serializer("PreviewTransform", "Unexpected crop rect: " + pullbottomk4lq0m);
                    scaleToFit = android.graphics.Matrix.ScaleToFit.FILL;
                    break;
            }
            if (pullbottomk4lq0m == pullBottomk4lQ0M.FIT_CENTER || pullbottomk4lq0m == pullBottomk4lQ0M.FIT_START || pullbottomk4lq0m == pullBottomk4lQ0M.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        android.graphics.Matrix matrixIconCompatParcelizer = MediaStoreVideoCannotWrite.IconCompatParcelizer(new RectF(this.MediaBrowserCompatMediaItem), rectF, this.serializer, false);
        if (this.write && this.RemoteActionCompatParcelizer) {
            boolean zSerializer = MediaStoreVideoCannotWrite.serializer(this.serializer);
            android.graphics.Rect rect = this.MediaBrowserCompatMediaItem;
            if (zSerializer) {
                matrixIconCompatParcelizer.preScale(1.0f, -1.0f, rect.centerX(), this.MediaBrowserCompatMediaItem.centerY());
                return matrixIconCompatParcelizer;
            }
            matrixIconCompatParcelizer.preScale(-1.0f, 1.0f, rect.centerX(), this.MediaBrowserCompatMediaItem.centerY());
        }
        return matrixIconCompatParcelizer;
    }

    public final android.graphics.Matrix write() {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer((String) null, RemoteActionCompatParcelizer());
        RectF rectF = new RectF(0.0f, 0.0f, this.IconCompatParcelizer.getWidth(), this.IconCompatParcelizer.getHeight());
        return MediaStoreVideoCannotWrite.IconCompatParcelizer(rectF, rectF, !this.RemoteActionCompatParcelizer ? this.serializer : -copyWithMergingEnabledui.serializer(this.MediaMetadataCompat), false);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return (this.MediaBrowserCompatMediaItem == null || this.IconCompatParcelizer == null || !(!this.RemoteActionCompatParcelizer || this.MediaMetadataCompat != -1)) ? false : true;
    }

    public final android.graphics.Matrix serializer(android.util.Size size, int i, android.graphics.Rect rect) {
        android.graphics.Matrix matrix = null;
        if (!RemoteActionCompatParcelizer()) {
            return null;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (RemoteActionCompatParcelizer()) {
            android.graphics.Matrix matrix3 = new android.graphics.Matrix(this.MediaSessionCompatQueueItem);
            matrix3.postConcat(serializer(size, i));
            matrix = matrix3;
        }
        matrix.invert(matrix2);
        android.graphics.Matrix matrix4 = new android.graphics.Matrix();
        matrix4.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), android.graphics.Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix4);
        return matrix2;
    }
}
