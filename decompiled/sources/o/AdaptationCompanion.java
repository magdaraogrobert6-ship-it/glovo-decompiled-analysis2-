package o;

import android.graphics.PointF;
import com.sentiance.okhttp3.u$a;

/* JADX INFO: loaded from: classes.dex */
public final class AdaptationCompanion {
    public final getTransformui_graphics ComponentActivity;
    public final getTransformui_graphics MediaBrowserCompatMediaItem;
    public final getTransformui_graphics MediaDescriptionCompat;
    public final getTransformui_graphics MediaSessionCompatResultReceiverWrapper;
    public final getTransformui_graphics MediaSessionCompatToken;
    public final getColors ParcelableVolumeInfo;
    public final getTransformui_graphics PlaybackStateCompatCustomAction;
    public final android.graphics.Matrix ResultReceiver;
    public final getTransformui_graphics r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final accessgetCiecat02cp r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getTransformui_graphics r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final android.graphics.Matrix r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final float[] r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final getTransformui_graphics r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public final android.graphics.Matrix r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final boolean read;
    public final getTextureCoordinates write;
    public final android.graphics.Matrix MediaSessionCompatQueueItem = new android.graphics.Matrix();
    public float RemoteActionCompatParcelizer = Float.NaN;
    public float MediaMetadataCompat = Float.NaN;
    public float RatingCompat = Float.NaN;
    public float serializer = 1.0f;
    public float IconCompatParcelizer = 1.0f;
    public boolean PlaybackStateCompat = true;

    public final android.graphics.Matrix serializer(float f) {
        getColors getcolors = this.ParcelableVolumeInfo;
        PointF pointF = getcolors == null ? null : (PointF) getcolors.IconCompatParcelizer();
        accessgetCiecat02cp accessgetciecat02cp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        LabCompanion labCompanion = accessgetciecat02cp == null ? null : (LabCompanion) accessgetciecat02cp.IconCompatParcelizer();
        getTextureCoordinates gettexturecoordinates = this.write;
        PointF pointF2 = gettexturecoordinates != null ? (PointF) gettexturecoordinates.IconCompatParcelizer() : null;
        android.graphics.Matrix matrix = this.MediaSessionCompatQueueItem;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        getTransformui_graphics gettransformui_graphics = this.MediaSessionCompatResultReceiverWrapper;
        float fWrite = gettransformui_graphics != null ? gettransformui_graphics.write() * f : 0.0f;
        getTransformui_graphics gettransformui_graphics2 = this.PlaybackStateCompatCustomAction;
        float fWrite2 = gettransformui_graphics2 != null ? gettransformui_graphics2.write() * f : 0.0f;
        getTransformui_graphics gettransformui_graphics3 = this.ComponentActivity;
        float fWrite3 = gettransformui_graphics3 != null ? gettransformui_graphics3.write() * f : 0.0f;
        if (fWrite == 0.0f && fWrite2 == 0.0f && fWrite3 == 0.0f) {
            getTransformui_graphics gettransformui_graphics4 = this.MediaSessionCompatToken;
            if (gettransformui_graphics4 != null) {
                matrix.preRotate(((Float) gettransformui_graphics4.IconCompatParcelizer()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fWrite != 0.0f ? (float) Math.cos(Math.toRadians(fWrite)) : 1.0f;
            float fCos2 = fWrite2 != 0.0f ? (float) Math.cos(Math.toRadians(fWrite2)) : 1.0f;
            if (fWrite3 != 0.0f) {
                matrix.preRotate(fWrite3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fWrite2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fWrite != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (labCompanion != null) {
            double d = f;
            matrix.preScale((float) Math.pow(labCompanion.read, d), (float) Math.pow(labCompanion.serializer, d));
        }
        return matrix;
    }

    public final android.graphics.Matrix IconCompatParcelizer() {
        PointF pointF;
        LabCompanion labCompanion;
        PointF pointF2;
        android.graphics.Matrix matrix = this.MediaSessionCompatQueueItem;
        matrix.reset();
        accessgetCiecat02cp accessgetciecat02cp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        getTextureCoordinates gettexturecoordinates = this.write;
        getColors getcolors = this.ParcelableVolumeInfo;
        getTransformui_graphics gettransformui_graphics = this.ComponentActivity;
        getTransformui_graphics gettransformui_graphics2 = this.PlaybackStateCompatCustomAction;
        getTransformui_graphics gettransformui_graphics3 = this.MediaSessionCompatResultReceiverWrapper;
        if ((gettransformui_graphics3 == null || gettransformui_graphics3.write() == 0.0f) && ((gettransformui_graphics2 == null || gettransformui_graphics2.write() == 0.0f) && (gettransformui_graphics == null || gettransformui_graphics.write() == 0.0f))) {
            if (getcolors != null && (pointF2 = (PointF) getcolors.IconCompatParcelizer()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.read) {
                getTransformui_graphics gettransformui_graphics4 = this.MediaSessionCompatToken;
                if (gettransformui_graphics4 != null) {
                    float fWrite = gettransformui_graphics4.write();
                    if (fWrite != 0.0f) {
                        matrix.preRotate(fWrite);
                    }
                }
            } else if (getcolors != null) {
                float f2 = getcolors.MediaBrowserCompatMediaItem;
                PointF pointF3 = (PointF) getcolors.IconCompatParcelizer();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                getcolors.read(1.0E-4f + f2);
                PointF pointF4 = (PointF) getcolors.IconCompatParcelizer();
                getcolors.read(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            getTransformui_graphics gettransformui_graphics5 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (gettransformui_graphics5 != null) {
                getTransformui_graphics gettransformui_graphics6 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                float fCos = gettransformui_graphics6 == null ? 0.0f : (float) Math.cos(Math.toRadians((-gettransformui_graphics6.write()) + 90.0f));
                float fSin = gettransformui_graphics6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-gettransformui_graphics6.write()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(gettransformui_graphics5.write()));
                write();
                float[] fArr = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                android.graphics.Matrix matrix2 = this.ResultReceiver;
                matrix2.setValues(fArr);
                write();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                android.graphics.Matrix matrix3 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                matrix3.setValues(fArr);
                write();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                android.graphics.Matrix matrix4 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            if (accessgetciecat02cp != null && (labCompanion = (LabCompanion) accessgetciecat02cp.IconCompatParcelizer()) != null) {
                float f6 = labCompanion.read;
                if (f6 != 1.0f || labCompanion.serializer != 1.0f) {
                    matrix.preScale(f6, labCompanion.serializer);
                }
            }
            if (gettexturecoordinates != null && (pointF = (PointF) gettexturecoordinates.IconCompatParcelizer()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            float fWrite2 = gettransformui_graphics3 != null ? gettransformui_graphics3.write() : 0.0f;
            float fWrite3 = gettransformui_graphics2 != null ? gettransformui_graphics2.write() : 0.0f;
            float fWrite4 = gettransformui_graphics != null ? gettransformui_graphics.write() : 0.0f;
            if (this.PlaybackStateCompat || fWrite2 != this.RemoteActionCompatParcelizer || fWrite3 != this.MediaMetadataCompat || fWrite4 != this.RatingCompat) {
                this.RemoteActionCompatParcelizer = fWrite2;
                this.MediaMetadataCompat = fWrite3;
                this.RatingCompat = fWrite4;
                if (fWrite2 != 0.0f) {
                    this.serializer = (float) Math.cos(Math.toRadians(fWrite2));
                } else {
                    this.serializer = 1.0f;
                }
                if (fWrite3 != 0.0f) {
                    this.IconCompatParcelizer = (float) Math.cos(Math.toRadians(fWrite3));
                } else {
                    this.IconCompatParcelizer = 1.0f;
                }
                this.PlaybackStateCompat = false;
            }
            PointF pointF5 = gettexturecoordinates == null ? null : (PointF) gettexturecoordinates.IconCompatParcelizer();
            PointF pointF6 = getcolors == null ? null : (PointF) getcolors.IconCompatParcelizer();
            LabCompanion labCompanion2 = accessgetciecat02cp != null ? (LabCompanion) accessgetciecat02cp.IconCompatParcelizer() : null;
            float f8 = labCompanion2 != null ? labCompanion2.read : 1.0f;
            float f9 = labCompanion2 != null ? labCompanion2.serializer : 1.0f;
            float f10 = this.serializer;
            float f11 = this.IconCompatParcelizer;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fWrite4 != 0.0f) {
                matrix.preRotate(fWrite4);
            }
            if (fWrite3 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fWrite2 != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final void read(ExtendedSrgblambda0 extendedSrgblambda0) {
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.write);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.MediaSessionCompatToken);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.PlaybackStateCompatCustomAction);
        extendedSrgblambda0.RemoteActionCompatParcelizer(this.ComponentActivity);
    }

    public final void RemoteActionCompatParcelizer(encodeColorList encodecolorlist) {
        getTransformui_graphics gettransformui_graphics = this.MediaBrowserCompatMediaItem;
        if (gettransformui_graphics != null) {
            gettransformui_graphics.write(encodecolorlist);
        }
        getTransformui_graphics gettransformui_graphics2 = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (gettransformui_graphics2 != null) {
            gettransformui_graphics2.write(encodecolorlist);
        }
        getTransformui_graphics gettransformui_graphics3 = this.MediaDescriptionCompat;
        if (gettransformui_graphics3 != null) {
            gettransformui_graphics3.write(encodecolorlist);
        }
        getTextureCoordinates gettexturecoordinates = this.write;
        if (gettexturecoordinates != null) {
            gettexturecoordinates.write(encodecolorlist);
        }
        getColors getcolors = this.ParcelableVolumeInfo;
        if (getcolors != null) {
            getcolors.write(encodecolorlist);
        }
        accessgetCiecat02cp accessgetciecat02cp = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (accessgetciecat02cp != null) {
            accessgetciecat02cp.write(encodecolorlist);
        }
        getTransformui_graphics gettransformui_graphics4 = this.MediaSessionCompatToken;
        if (gettransformui_graphics4 != null) {
            gettransformui_graphics4.write(encodecolorlist);
        }
        getTransformui_graphics gettransformui_graphics5 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (gettransformui_graphics5 != null) {
            gettransformui_graphics5.write(encodecolorlist);
        }
        getTransformui_graphics gettransformui_graphics6 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (gettransformui_graphics6 != null) {
            gettransformui_graphics6.write(encodecolorlist);
        }
        getTransformui_graphics gettransformui_graphics7 = this.MediaSessionCompatResultReceiverWrapper;
        if (gettransformui_graphics7 != null) {
            gettransformui_graphics7.write(encodecolorlist);
            gettransformui_graphics7.write(new ExtendedSrgblambda1(1, this));
        }
        getTransformui_graphics gettransformui_graphics8 = this.PlaybackStateCompatCustomAction;
        if (gettransformui_graphics8 != null) {
            gettransformui_graphics8.write(encodecolorlist);
            gettransformui_graphics8.write(new ExtendedSrgblambda1(2, this));
        }
        getTransformui_graphics gettransformui_graphics9 = this.ComponentActivity;
        if (gettransformui_graphics9 != null) {
            gettransformui_graphics9.write(encodecolorlist);
            gettransformui_graphics9.write(new ExtendedSrgblambda1(3, this));
        }
    }

    public AdaptationCompanion(ColorSpaceKt colorSpaceKt) {
        u$a u_a = colorSpaceKt.serializer;
        this.write = (getTextureCoordinates) (u_a == null ? null : u_a.write());
        absRcpResponse absrcpresponse = colorSpaceKt.read;
        this.ParcelableVolumeInfo = absrcpresponse == null ? null : absrcpresponse.write();
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics = colorSpaceKt.MediaMetadataCompat;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = (accessgetCiecat02cp) (xyzatocolorjlnilsgui_graphics == null ? null : xyzatocolorjlnilsgui_graphics.write());
        toXyz toxyz = colorSpaceKt.RatingCompat;
        this.MediaSessionCompatToken = toxyz == null ? null : toxyz.write();
        toXyz toxyz2 = colorSpaceKt.ParcelableVolumeInfo;
        getTransformui_graphics gettransformui_graphicsWrite = toxyz2 == null ? null : toxyz2.write();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = gettransformui_graphicsWrite;
        this.read = colorSpaceKt.IconCompatParcelizer;
        toXyz toxyz3 = colorSpaceKt.MediaDescriptionCompat;
        this.MediaSessionCompatResultReceiverWrapper = toxyz3 == null ? null : toxyz3.write();
        toXyz toxyz4 = colorSpaceKt.MediaSessionCompatQueueItem;
        this.PlaybackStateCompatCustomAction = toxyz4 == null ? null : toxyz4.write();
        toXyz toxyz5 = colorSpaceKt.MediaBrowserCompatMediaItem;
        this.ComponentActivity = toxyz5 == null ? null : toxyz5.write();
        if (gettransformui_graphicsWrite != null) {
            this.ResultReceiver = new android.graphics.Matrix();
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new android.graphics.Matrix();
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new android.graphics.Matrix();
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new float[9];
        } else {
            this.ResultReceiver = null;
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
        }
        toXyz toxyz6 = colorSpaceKt.MediaSessionCompatToken;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = toxyz6 == null ? null : toxyz6.write();
        xyzaToColorJlNiLsgui_graphics xyzatocolorjlnilsgui_graphics2 = colorSpaceKt.RemoteActionCompatParcelizer;
        if (xyzatocolorjlnilsgui_graphics2 != null) {
            this.MediaBrowserCompatMediaItem = (getTransformui_graphics) xyzatocolorjlnilsgui_graphics2.write();
        }
        toXyz toxyz7 = colorSpaceKt.PlaybackStateCompat;
        if (toxyz7 != null) {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = toxyz7.write();
        } else {
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = null;
        }
        toXyz toxyz8 = colorSpaceKt.write;
        if (toxyz8 != null) {
            this.MediaDescriptionCompat = toxyz8.write();
        } else {
            this.MediaDescriptionCompat = null;
        }
    }

    public final void write() {
        for (int i = 0; i < 9; i++) {
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg[i] = 0.0f;
        }
    }
}
