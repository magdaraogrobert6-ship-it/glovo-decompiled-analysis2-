package o;

import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetMaxValuecp {
    public static final android.graphics.Matrix RemoteActionCompatParcelizer = new android.graphics.Matrix();
    public float IconCompatParcelizer;
    public android.graphics.PathMeasure MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final android.graphics.Path MediaMetadataCompat;
    public final android.graphics.Path MediaSessionCompatQueueItem;
    public final ImageKt MediaSessionCompatResultReceiverWrapper;
    public android.graphics.Paint MediaSessionCompatToken;
    public String ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public final accessgetMinValuecp PlaybackStateCompatCustomAction;
    public Boolean RatingCompat;
    public float r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public float read;
    public android.graphics.Paint serializer;
    public final android.graphics.Matrix write;

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.MediaDescriptionCompat;
    }

    public void setRootAlpha(int i) {
        this.MediaDescriptionCompat = i;
    }

    public final void write(accessgetMinValuecp accessgetminvaluecp, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i, int i2) {
        int i3;
        float f;
        android.graphics.Matrix matrix2 = accessgetminvaluecp.MediaBrowserCompatMediaItem;
        ArrayList arrayList = accessgetminvaluecp.write;
        matrix2.set(matrix);
        android.graphics.Matrix matrix3 = accessgetminvaluecp.MediaBrowserCompatMediaItem;
        matrix3.preConcat(accessgetminvaluecp.RemoteActionCompatParcelizer);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            accessgetNegativeInfinitycp accessgetnegativeinfinitycp = (accessgetNegativeInfinitycp) arrayList.get(i4);
            if (accessgetnegativeinfinitycp instanceof accessgetMinValuecp) {
                write((accessgetMinValuecp) accessgetnegativeinfinitycp, matrix3, canvas, i, i2);
            } else {
                if (accessgetnegativeinfinitycp instanceof accessgetNaNcp) {
                    accessgetNaNcp accessgetnancp = (accessgetNaNcp) accessgetnegativeinfinitycp;
                    float f2 = i / this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    float f3 = i2 / this.PlaybackStateCompat;
                    float fMin = Math.min(f2, f3);
                    android.graphics.Matrix matrix4 = this.write;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    i3 = i4;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = fArr[0];
                    float f5 = fArr[1];
                    float f6 = fArr[2];
                    float f7 = fArr[3];
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs((f4 * f7) - (f5 * f6)) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        android.graphics.Path path = this.MediaMetadataCompat;
                        path.reset();
                        FocusOrderModifierDefaultImpls[] focusOrderModifierDefaultImplsArr = accessgetnancp.PlaybackStateCompat;
                        if (focusOrderModifierDefaultImplsArr != null) {
                            FocusOrderModifierDefaultImpls.IconCompatParcelizer(focusOrderModifierDefaultImplsArr, path);
                        }
                        android.graphics.Path path2 = this.MediaSessionCompatQueueItem;
                        path2.reset();
                        if (accessgetnancp instanceof accessgetEpsiloncp) {
                            path2.setFillType(accessgetnancp.MediaSessionCompatResultReceiverWrapper == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            absoluteValueslo4al4 absolutevalueslo4al4 = (absoluteValueslo4al4) accessgetnancp;
                            float f8 = absolutevalueslo4al4.ParcelableVolumeInfo;
                            if (f8 != 0.0f || absolutevalueslo4al4.MediaSessionCompatQueueItem != 1.0f) {
                                float f9 = absolutevalueslo4al4.RatingCompat;
                                float f10 = absolutevalueslo4al4.MediaSessionCompatQueueItem;
                                if (this.MediaBrowserCompatMediaItem == null) {
                                    this.MediaBrowserCompatMediaItem = new android.graphics.PathMeasure();
                                }
                                this.MediaBrowserCompatMediaItem.setPath(path, false);
                                float length = this.MediaBrowserCompatMediaItem.getLength();
                                float f11 = ((f8 + f9) % 1.0f) * length;
                                float f12 = ((f10 + f9) % 1.0f) * length;
                                path.reset();
                                android.graphics.PathMeasure pathMeasure = this.MediaBrowserCompatMediaItem;
                                if (f11 > f12) {
                                    pathMeasure.getSegment(f11, length, path, true);
                                    this.MediaBrowserCompatMediaItem.getSegment(0.0f, f12, path, true);
                                    f = 0.0f;
                                } else {
                                    f = 0.0f;
                                    pathMeasure.getSegment(f11, f12, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            getPrevious getprevious = absolutevalueslo4al4.write;
                            if (getprevious.read != null || getprevious.write != 0) {
                                if (this.serializer == null) {
                                    android.graphics.Paint paint = new android.graphics.Paint(1);
                                    this.serializer = paint;
                                    paint.setStyle(android.graphics.Paint.Style.FILL);
                                }
                                android.graphics.Paint paint2 = this.serializer;
                                Shader shader = getprevious.read;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(absolutevalueslo4al4.read * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i5 = getprevious.write;
                                    float f13 = absolutevalueslo4al4.read;
                                    PorterDuff.Mode mode = getNonefv9h1I.IconCompatParcelizer;
                                    paint2.setColor((i5 & 16777215) | (((int) (android.graphics.Color.alpha(i5) * f13)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(absolutevalueslo4al4.MediaSessionCompatResultReceiverWrapper == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            getPrevious getprevious2 = absolutevalueslo4al4.RemoteActionCompatParcelizer;
                            if (getprevious2.read != null || getprevious2.write != 0) {
                                if (this.MediaSessionCompatToken == null) {
                                    android.graphics.Paint paint3 = new android.graphics.Paint(1);
                                    this.MediaSessionCompatToken = paint3;
                                    paint3.setStyle(android.graphics.Paint.Style.STROKE);
                                }
                                android.graphics.Paint paint4 = this.MediaSessionCompatToken;
                                android.graphics.Paint.Join join = absolutevalueslo4al4.MediaBrowserCompatMediaItem;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                android.graphics.Paint.Cap cap = absolutevalueslo4al4.serializer;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(absolutevalueslo4al4.MediaDescriptionCompat);
                                Shader shader2 = getprevious2.read;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(absolutevalueslo4al4.IconCompatParcelizer * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i6 = getprevious2.write;
                                    float f14 = absolutevalueslo4al4.IconCompatParcelizer;
                                    PorterDuff.Mode mode2 = getNonefv9h1I.IconCompatParcelizer;
                                    paint4.setColor((i6 & 16777215) | (((int) (android.graphics.Color.alpha(i6) * f14)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(absolutevalueslo4al4.MediaMetadataCompat * fAbs * fMin);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i4 = i3 + 1;
                c = 0;
            }
            i3 = i4;
            i4 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public accessgetMaxValuecp(accessgetMaxValuecp accessgetmaxvaluecp) {
        this.write = new android.graphics.Matrix();
        this.read = 0.0f;
        this.IconCompatParcelizer = 0.0f;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0.0f;
        this.PlaybackStateCompat = 0.0f;
        this.MediaDescriptionCompat = 255;
        this.ParcelableVolumeInfo = null;
        this.RatingCompat = null;
        ImageKt imageKt = new ImageKt(0);
        this.MediaSessionCompatResultReceiverWrapper = imageKt;
        this.PlaybackStateCompatCustomAction = new accessgetMinValuecp(accessgetmaxvaluecp.PlaybackStateCompatCustomAction, imageKt);
        this.MediaMetadataCompat = new android.graphics.Path(accessgetmaxvaluecp.MediaMetadataCompat);
        this.MediaSessionCompatQueueItem = new android.graphics.Path(accessgetmaxvaluecp.MediaSessionCompatQueueItem);
        this.read = accessgetmaxvaluecp.read;
        this.IconCompatParcelizer = accessgetmaxvaluecp.IconCompatParcelizer;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = accessgetmaxvaluecp.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        this.PlaybackStateCompat = accessgetmaxvaluecp.PlaybackStateCompat;
        this.MediaDescriptionCompat = accessgetmaxvaluecp.MediaDescriptionCompat;
        this.ParcelableVolumeInfo = accessgetmaxvaluecp.ParcelableVolumeInfo;
        String str = accessgetmaxvaluecp.ParcelableVolumeInfo;
        if (str != null) {
            imageKt.put(str, this);
        }
        this.RatingCompat = accessgetmaxvaluecp.RatingCompat;
    }

    public accessgetMaxValuecp() {
        this.write = new android.graphics.Matrix();
        this.read = 0.0f;
        this.IconCompatParcelizer = 0.0f;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 0.0f;
        this.PlaybackStateCompat = 0.0f;
        this.MediaDescriptionCompat = 255;
        this.ParcelableVolumeInfo = null;
        this.RatingCompat = null;
        this.MediaSessionCompatResultReceiverWrapper = new ImageKt(0);
        this.PlaybackStateCompatCustomAction = new accessgetMinValuecp();
        this.MediaMetadataCompat = new android.graphics.Path();
        this.MediaSessionCompatQueueItem = new android.graphics.Path();
    }
}
