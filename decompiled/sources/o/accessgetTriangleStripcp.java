package o;

import android.graphics.PointF;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetTriangleStripcp implements transformQ8lPUPs, encodeColorList {
    public final boolean IconCompatParcelizer;
    public final getTransformui_graphics MediaMetadataCompat;
    public final getTransformui_graphics MediaSessionCompatResultReceiverWrapper;
    public final getTransformui_graphics ParcelableVolumeInfo;
    public final getTransformui_graphics PlaybackStateCompat;
    public final getColors PlaybackStateCompatCustomAction;
    public final accessgetMirrorcp RatingCompat;
    public final getTransformui_graphics RemoteActionCompatParcelizer;
    public final mul3x3Float3_0 ResultReceiver;
    public final getTransformui_graphics read;
    public boolean serializer;
    public final boolean write;
    public final android.graphics.Path MediaSessionCompatToken = new android.graphics.Path();
    public final android.graphics.Path MediaDescriptionCompat = new android.graphics.Path();
    public final android.graphics.PathMeasure MediaSessionCompatQueueItem = new android.graphics.PathMeasure();
    public final float[] MediaBrowserCompatMediaItem = new float[2];
    public final u$a ComponentActivity = new u$a(2);

    @Override // o.encodeColorList
    public final void serializer() {
        this.serializer = false;
        this.RatingCompat.invalidateSelf();
    }

    @Override // o.getPackedValueannotations
    public final void RemoteActionCompatParcelizer(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            getPackedValueannotations getpackedvalueannotations = (getPackedValueannotations) arrayList.get(i);
            if (getpackedvalueannotations instanceof encodePointList) {
                encodePointList encodepointlist = (encodePointList) getpackedvalueannotations;
                if (encodepointlist.RatingCompat == Bt2020Pqlambda0.SIMULTANEOUSLY) {
                    this.ComponentActivity.IconCompatParcelizer.add(encodepointlist);
                    encodepointlist.serializer(this);
                }
            }
            i++;
        }
    }

    @Override // o.transformQ8lPUPs
    public final android.graphics.Path write() {
        float f;
        double d;
        float fCos;
        float fSin;
        float f2;
        accessgetTriangleStripcp accessgettrianglestripcp;
        double d2;
        float f3;
        accessgetTriangleStripcp accessgettrianglestripcp2 = this;
        boolean z = accessgettrianglestripcp2.serializer;
        android.graphics.Path path = accessgettrianglestripcp2.MediaSessionCompatToken;
        if (z) {
            return path;
        }
        path.reset();
        if (accessgettrianglestripcp2.IconCompatParcelizer) {
            accessgettrianglestripcp2.serializer = true;
            return path;
        }
        int i = getTriangleStripc2xauaI.IconCompatParcelizer[accessgettrianglestripcp2.ResultReceiver.ordinal()];
        getColors getcolors = accessgettrianglestripcp2.PlaybackStateCompatCustomAction;
        getTransformui_graphics gettransformui_graphics = accessgettrianglestripcp2.MediaMetadataCompat;
        getTransformui_graphics gettransformui_graphics2 = accessgettrianglestripcp2.ParcelableVolumeInfo;
        getTransformui_graphics gettransformui_graphics3 = accessgettrianglestripcp2.PlaybackStateCompat;
        getTransformui_graphics gettransformui_graphics4 = accessgettrianglestripcp2.MediaSessionCompatResultReceiverWrapper;
        if (i == 1) {
            boolean z2 = false;
            float fFloatValue = ((Float) gettransformui_graphics4.IconCompatParcelizer()).floatValue();
            double radians = Math.toRadians((gettransformui_graphics3 != null ? ((Float) gettransformui_graphics3.IconCompatParcelizer()).floatValue() : 0.0d) - 90.0d);
            double d3 = fFloatValue;
            float f4 = (float) (6.283185307179586d / d3);
            if (accessgettrianglestripcp2.write) {
                f4 *= -1.0f;
            }
            float f5 = f4;
            float f6 = f5 / 2.0f;
            float f7 = fFloatValue - ((int) fFloatValue);
            if (f7 != 0.0f) {
                radians += (double) ((1.0f - f7) * f6);
            }
            float fFloatValue2 = ((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue();
            float fFloatValue3 = ((Float) accessgettrianglestripcp2.RemoteActionCompatParcelizer.IconCompatParcelizer()).floatValue();
            getTransformui_graphics gettransformui_graphics5 = accessgettrianglestripcp2.read;
            float fFloatValue4 = gettransformui_graphics5 != null ? ((Float) gettransformui_graphics5.IconCompatParcelizer()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = gettransformui_graphics2 != null ? ((Float) gettransformui_graphics2.IconCompatParcelizer()).floatValue() / 100.0f : 0.0f;
            if (f7 != 0.0f) {
                float fM = c8$$ExternalSyntheticOutline0.m(fFloatValue2, fFloatValue3, f7, fFloatValue3);
                double d4 = fM;
                fCos = (float) (Math.cos(radians) * d4);
                fSin = (float) (d4 * Math.sin(radians));
                path.moveTo(fCos, fSin);
                d = radians + ((double) ((f5 * f7) / 2.0f));
                f2 = fM;
                f = f6;
            } else {
                double d5 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d5);
                float fSin2 = (float) (Math.sin(radians) * d5);
                path.moveTo(fCos2, fSin2);
                f = f6;
                d = radians + ((double) f);
                fCos = fCos2;
                fSin = fSin2;
                f2 = 0.0f;
            }
            double dCeil = Math.ceil(d3) * 2.0d;
            double d6 = d;
            int i2 = 0;
            while (true) {
                double d7 = i2;
                if (d7 >= dCeil) {
                    break;
                }
                float f8 = z2 ? fFloatValue2 : fFloatValue3;
                float f9 = (f2 == 0.0f || d7 != dCeil - 2.0d) ? f : (f5 * f7) / 2.0f;
                double d8 = (f2 == 0.0f || d7 != dCeil - 1.0d) ? f8 : f2;
                float f10 = f;
                float f11 = f2;
                float fCos3 = (float) (Math.cos(d6) * d8);
                float fSin3 = (float) (d8 * Math.sin(d6));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                } else {
                    float f12 = fSin;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f13 = fCos;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f14 = z2 ? fFloatValue4 : fFloatValue5;
                    float f15 = z2 ? fFloatValue5 : fFloatValue4;
                    float f16 = (z2 ? fFloatValue3 : fFloatValue2) * f14 * 0.47829f;
                    float f17 = fCos4 * f16;
                    float f18 = f16 * fSin4;
                    float f19 = (z2 ? fFloatValue2 : fFloatValue3) * f15 * 0.47829f;
                    float f20 = fCos5 * f19;
                    float f21 = f19 * fSin5;
                    if (f7 != 0.0f) {
                        if (i2 == 0) {
                            f17 *= f7;
                            f18 *= f7;
                        } else if (d7 == dCeil - 1.0d) {
                            f20 *= f7;
                            f21 *= f7;
                        }
                    }
                    path.cubicTo(f13 - f17, f12 - f18, f20 + fCos3, fSin3 + f21, fCos3, fSin3);
                }
                d6 += (double) f9;
                z2 = !z2;
                i2++;
                fFloatValue3 = fFloatValue3;
                fCos = fCos3;
                fSin = fSin3;
                fFloatValue2 = fFloatValue2;
                f5 = f5;
                f = f10;
                f2 = f11;
            }
            PointF pointF = (PointF) getcolors.IconCompatParcelizer();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (i == 2) {
            int iFloor = (int) Math.floor(((Float) gettransformui_graphics4.IconCompatParcelizer()).floatValue());
            double radians2 = Math.toRadians((gettransformui_graphics3 != null ? ((Float) gettransformui_graphics3.IconCompatParcelizer()).floatValue() : 0.0d) - 90.0d);
            double d9 = iFloor;
            float fFloatValue6 = ((Float) gettransformui_graphics2.IconCompatParcelizer()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) gettransformui_graphics.IconCompatParcelizer()).floatValue();
            double d10 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d10);
            float fSin6 = (float) (Math.sin(radians2) * d10);
            path.moveTo(fCos6, fSin6);
            double d11 = (float) (6.283185307179586d / d9);
            double dCeil2 = Math.ceil(d9);
            double d12 = radians2 + d11;
            int i3 = 0;
            while (true) {
                double d13 = i3;
                if (d13 >= dCeil2) {
                    break;
                }
                double d14 = d11;
                float fCos7 = (float) (Math.cos(d12) * d10);
                int i4 = i3;
                float fSin7 = (float) (Math.sin(d12) * d10);
                if (fFloatValue6 != 0.0f) {
                    d2 = d10;
                    double dAtan4 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    path = path;
                    float f22 = fCos6;
                    float f23 = fSin6;
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f24 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f25 = fCos8 * f24;
                    float f26 = fSin8 * f24;
                    float fCos9 = ((float) Math.cos(dAtan5)) * f24;
                    float fSin9 = f24 * ((float) Math.sin(dAtan5));
                    if (d13 == dCeil2 - 1.0d) {
                        accessgettrianglestripcp = this;
                        android.graphics.Path path2 = accessgettrianglestripcp.MediaDescriptionCompat;
                        path2.reset();
                        path2.moveTo(f22, f23);
                        float f27 = f22 - f25;
                        float f28 = f23 - f26;
                        float f29 = fCos7 + fCos9;
                        float f30 = fSin7 + fSin9;
                        path2.cubicTo(f27, f28, f29, f30, fCos7, fSin7);
                        android.graphics.PathMeasure pathMeasure = accessgettrianglestripcp.MediaSessionCompatQueueItem;
                        pathMeasure.setPath(path2, false);
                        float length = pathMeasure.getLength();
                        float[] fArr = accessgettrianglestripcp.MediaBrowserCompatMediaItem;
                        f3 = fFloatValue6;
                        pathMeasure.getPosTan(length * 0.9999f, fArr, null);
                        path.cubicTo(f27, f28, f29, f30, fArr[0], fArr[1]);
                    } else {
                        accessgettrianglestripcp = this;
                        f3 = fFloatValue6;
                        path.cubicTo(f22 - f25, f23 - f26, fCos7 + fCos9, fSin7 + fSin9, fCos7, fSin7);
                    }
                } else {
                    accessgettrianglestripcp = this;
                    d2 = d10;
                    f3 = fFloatValue6;
                    if (d13 != dCeil2 - 1.0d) {
                        path.lineTo(fCos7, fSin7);
                    }
                    fSin6 = fSin7;
                    accessgettrianglestripcp2 = accessgettrianglestripcp;
                    i3 = i4 + 1;
                    fCos6 = fCos7;
                    d10 = d2;
                    d11 = d14;
                    fFloatValue6 = f3;
                }
                d12 += d14;
                fSin6 = fSin7;
                accessgettrianglestripcp2 = accessgettrianglestripcp;
                i3 = i4 + 1;
                fCos6 = fCos7;
                d10 = d2;
                d11 = d14;
                fFloatValue6 = f3;
            }
            PointF pointF2 = (PointF) getcolors.IconCompatParcelizer();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.ComponentActivity.serializer(path);
        this.serializer = true;
        return path;
    }

    public accessgetTriangleStripcp(accessgetMirrorcp accessgetmirrorcp, ExtendedSrgblambda0 extendedSrgblambda0, mul3x3Float3_1 mul3x3float3_1) {
        this.RatingCompat = accessgetmirrorcp;
        mul3x3Float3_0 mul3x3float3_0 = mul3x3float3_1.MediaMetadataCompat;
        this.ResultReceiver = mul3x3float3_0;
        this.IconCompatParcelizer = mul3x3float3_1.read;
        this.write = mul3x3float3_1.write;
        getTransformui_graphics gettransformui_graphicsWrite = mul3x3float3_1.MediaDescriptionCompat.write();
        this.MediaSessionCompatResultReceiverWrapper = gettransformui_graphicsWrite;
        getColors getcolorsWrite = mul3x3float3_1.MediaBrowserCompatMediaItem.write();
        this.PlaybackStateCompatCustomAction = getcolorsWrite;
        getTransformui_graphics gettransformui_graphicsWrite2 = mul3x3float3_1.MediaSessionCompatQueueItem.write();
        this.PlaybackStateCompat = gettransformui_graphicsWrite2;
        getTransformui_graphics gettransformui_graphicsWrite3 = mul3x3float3_1.RemoteActionCompatParcelizer.write();
        this.MediaMetadataCompat = gettransformui_graphicsWrite3;
        getTransformui_graphics gettransformui_graphicsWrite4 = mul3x3float3_1.RatingCompat.write();
        this.ParcelableVolumeInfo = gettransformui_graphicsWrite4;
        mul3x3Float3_0 mul3x3float3_2 = mul3x3Float3_0.STAR;
        if (mul3x3float3_0 == mul3x3float3_2) {
            this.RemoteActionCompatParcelizer = mul3x3float3_1.serializer.write();
            this.read = mul3x3float3_1.IconCompatParcelizer.write();
        } else {
            this.RemoteActionCompatParcelizer = null;
            this.read = null;
        }
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite);
        extendedSrgblambda0.RemoteActionCompatParcelizer(getcolorsWrite);
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite2);
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite3);
        extendedSrgblambda0.RemoteActionCompatParcelizer(gettransformui_graphicsWrite4);
        if (mul3x3float3_0 == mul3x3float3_2) {
            extendedSrgblambda0.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            extendedSrgblambda0.RemoteActionCompatParcelizer(this.read);
        }
        gettransformui_graphicsWrite.write(this);
        getcolorsWrite.write(this);
        gettransformui_graphicsWrite2.write(this);
        gettransformui_graphicsWrite3.write(this);
        gettransformui_graphicsWrite4.write(this);
        if (mul3x3float3_0 == mul3x3float3_2) {
            this.RemoteActionCompatParcelizer.write(this);
            this.read.write(this);
        }
    }
}
