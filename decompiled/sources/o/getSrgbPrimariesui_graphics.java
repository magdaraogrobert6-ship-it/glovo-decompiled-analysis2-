package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes.dex */
public abstract class getSrgbPrimariesui_graphics {
    public static accessprocessDragStart read;
    public static final LinearInterpolator serializer = new LinearInterpolator();
    public static final colorResource write = colorResource.RemoteActionCompatParcelizer(com.braze.Constants.BRAZE_PUSH_TITLE_KEY, com.braze.Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "e", "o", "i", "h", RemoteMessageConst.TO, "ti");
    public static final colorResource IconCompatParcelizer = colorResource.RemoteActionCompatParcelizer("x", "y");

    /* JADX WARN: Code duplicated, block: B:98:0x0224  */
    public static Lab IconCompatParcelizer(com.airbnb.lottie.parser.moshi.JsonReader jsonReader, StrokeJoinCompanion strokeJoinCompanion, float f, connectorKeyYBCOT_4 connectorkeyybcot_4, boolean z, boolean z2) {
        Interpolator interpolatorWrite;
        Object obj;
        Interpolator interpolatorWrite2;
        Interpolator interpolatorWrite3;
        Object obj2;
        Interpolator interpolatorWrite4;
        Lab lab;
        colorResource colorresource;
        LinearInterpolator linearInterpolator;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        Object obj3;
        PointF pointF4;
        PointF pointF5;
        Object obj4;
        colorResource colorresource2 = write;
        LinearInterpolator linearInterpolator2 = serializer;
        if (!z || !z2) {
            colorResource colorresource3 = colorresource2;
            if (z) {
                jsonReader.RemoteActionCompatParcelizer();
                Object objSerializer = null;
                PointF pointF6 = null;
                boolean z3 = false;
                float fMediaMetadataCompat = 0.0f;
                PointF pointF7 = null;
                PointF pointF8 = null;
                PointF pointF9 = null;
                Object objSerializer2 = null;
                while (jsonReader.MediaBrowserCompatMediaItem()) {
                    colorResource colorresource4 = colorresource3;
                    switch (jsonReader.read(colorresource4)) {
                        case 0:
                            fMediaMetadataCompat = (float) jsonReader.MediaMetadataCompat();
                            continue;
                            colorresource3 = colorresource4;
                            break;
                        case 1:
                            objSerializer = connectorkeyybcot_4.serializer(jsonReader, f);
                            continue;
                            colorresource3 = colorresource4;
                            break;
                        case 2:
                            objSerializer2 = connectorkeyybcot_4.serializer(jsonReader, f);
                            continue;
                            colorresource3 = colorresource4;
                            break;
                        case 3:
                            pointF7 = transferHlgEotfui_graphics.read(jsonReader, 1.0f);
                            continue;
                            colorresource3 = colorresource4;
                            break;
                        case 4:
                            pointF6 = transferHlgEotfui_graphics.read(jsonReader, 1.0f);
                            continue;
                            colorresource3 = colorresource4;
                            break;
                        case 5:
                            if (jsonReader.RatingCompat() == 1) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                            }
                            colorresource3 = colorresource4;
                            break;
                        case 6:
                            pointF8 = transferHlgEotfui_graphics.read(jsonReader, f);
                            break;
                        case 7:
                            pointF9 = transferHlgEotfui_graphics.read(jsonReader, f);
                            break;
                        default:
                            jsonReader.MediaSessionCompatResultReceiverWrapper();
                            continue;
                            colorresource3 = colorresource4;
                            break;
                    }
                    colorresource3 = colorresource4;
                }
                jsonReader.write();
                if (!z3) {
                    if (pointF7 != null && pointF6 != null) {
                        interpolatorWrite = write(pointF7, pointF6);
                        obj = objSerializer2;
                    }
                    Lab lab2 = new Lab(strokeJoinCompanion, objSerializer, obj, interpolatorWrite, fMediaMetadataCompat, (Float) null);
                    lab2.MediaBrowserCompatMediaItem = pointF8;
                    lab2.MediaSessionCompatResultReceiverWrapper = pointF9;
                    return lab2;
                }
                objSerializer2 = objSerializer;
                obj = objSerializer2;
                interpolatorWrite = linearInterpolator2;
                Lab lab3 = new Lab(strokeJoinCompanion, objSerializer, obj, interpolatorWrite, fMediaMetadataCompat, (Float) null);
                lab3.MediaBrowserCompatMediaItem = pointF8;
                lab3.MediaSessionCompatResultReceiverWrapper = pointF9;
                return lab3;
            }
            return new Lab(connectorkeyybcot_4.serializer(jsonReader, f));
        }
        jsonReader.RemoteActionCompatParcelizer();
        PointF pointF10 = null;
        PointF pointF11 = null;
        PointF pointF12 = null;
        boolean z4 = false;
        PointF pointF13 = null;
        PointF pointF14 = null;
        PointF pointF15 = null;
        Object objSerializer3 = null;
        PointF pointF16 = null;
        PointF pointF17 = null;
        float fMediaMetadataCompat2 = 0.0f;
        Object objSerializer4 = null;
        while (jsonReader.MediaBrowserCompatMediaItem()) {
            int i = jsonReader.read(colorresource2);
            colorResource colorresource5 = IconCompatParcelizer;
            switch (i) {
                case 0:
                    colorresource = colorresource2;
                    linearInterpolator = linearInterpolator2;
                    pointF = pointF11;
                    pointF2 = pointF12;
                    pointF3 = pointF15;
                    obj3 = objSerializer3;
                    fMediaMetadataCompat2 = (float) jsonReader.MediaMetadataCompat();
                    pointF11 = pointF;
                    objSerializer3 = obj3;
                    pointF15 = pointF3;
                    linearInterpolator2 = linearInterpolator;
                    colorresource2 = colorresource;
                    pointF12 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF12;
                    objSerializer3 = connectorkeyybcot_4.serializer(jsonReader, f);
                    pointF12 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF12;
                    objSerializer4 = connectorkeyybcot_4.serializer(jsonReader, f);
                    pointF12 = pointF2;
                    break;
                case 3:
                    colorresource = colorresource2;
                    linearInterpolator = linearInterpolator2;
                    PointF pointF18 = pointF11;
                    pointF2 = pointF12;
                    PointF pointF19 = pointF15;
                    Object obj5 = objSerializer3;
                    if (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_OBJECT) {
                        jsonReader.RemoteActionCompatParcelizer();
                        float fMediaMetadataCompat3 = 0.0f;
                        float fMediaMetadataCompat4 = 0.0f;
                        float fMediaMetadataCompat5 = 0.0f;
                        float fMediaMetadataCompat6 = 0.0f;
                        while (jsonReader.MediaBrowserCompatMediaItem()) {
                            int i2 = jsonReader.read(colorresource5);
                            if (i2 == 0) {
                                DoubleFunction doubleFunctionPlaybackStateCompatCustomAction = jsonReader.PlaybackStateCompatCustomAction();
                                DoubleFunction doubleFunction = DoubleFunction.NUMBER;
                                if (doubleFunctionPlaybackStateCompatCustomAction == doubleFunction) {
                                    fMediaMetadataCompat5 = (float) jsonReader.MediaMetadataCompat();
                                    fMediaMetadataCompat3 = fMediaMetadataCompat5;
                                } else {
                                    jsonReader.read();
                                    fMediaMetadataCompat3 = (float) jsonReader.MediaMetadataCompat();
                                    fMediaMetadataCompat5 = jsonReader.PlaybackStateCompatCustomAction() == doubleFunction ? (float) jsonReader.MediaMetadataCompat() : fMediaMetadataCompat3;
                                    jsonReader.IconCompatParcelizer();
                                }
                            } else if (i2 != 1) {
                                jsonReader.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                DoubleFunction doubleFunctionPlaybackStateCompatCustomAction2 = jsonReader.PlaybackStateCompatCustomAction();
                                DoubleFunction doubleFunction2 = DoubleFunction.NUMBER;
                                if (doubleFunctionPlaybackStateCompatCustomAction2 == doubleFunction2) {
                                    fMediaMetadataCompat6 = (float) jsonReader.MediaMetadataCompat();
                                    fMediaMetadataCompat4 = fMediaMetadataCompat6;
                                } else {
                                    jsonReader.read();
                                    fMediaMetadataCompat4 = (float) jsonReader.MediaMetadataCompat();
                                    fMediaMetadataCompat6 = jsonReader.PlaybackStateCompatCustomAction() == doubleFunction2 ? (float) jsonReader.MediaMetadataCompat() : fMediaMetadataCompat4;
                                    jsonReader.IconCompatParcelizer();
                                }
                            }
                        }
                        PointF pointF20 = new PointF(fMediaMetadataCompat3, fMediaMetadataCompat4);
                        PointF pointF21 = new PointF(fMediaMetadataCompat5, fMediaMetadataCompat6);
                        jsonReader.write();
                        pointF15 = pointF21;
                        pointF16 = pointF20;
                    } else {
                        pointF13 = transferHlgEotfui_graphics.read(jsonReader, f);
                        pointF15 = pointF19;
                    }
                    pointF11 = pointF18;
                    objSerializer3 = obj5;
                    linearInterpolator2 = linearInterpolator;
                    colorresource2 = colorresource;
                    pointF12 = pointF2;
                    break;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    colorresource = colorresource2;
                    if (jsonReader.PlaybackStateCompatCustomAction() == DoubleFunction.BEGIN_OBJECT) {
                        jsonReader.RemoteActionCompatParcelizer();
                        float fMediaMetadataCompat7 = 0.0f;
                        float fMediaMetadataCompat8 = 0.0f;
                        float fMediaMetadataCompat9 = 0.0f;
                        float f2 = 0.0f;
                        while (jsonReader.MediaBrowserCompatMediaItem()) {
                            PointF pointF22 = pointF12;
                            int i3 = jsonReader.read(colorresource5);
                            if (i3 != 0) {
                                pointF4 = pointF11;
                                if (i3 != 1) {
                                    jsonReader.MediaSessionCompatResultReceiverWrapper();
                                    pointF11 = pointF4;
                                } else {
                                    DoubleFunction doubleFunctionPlaybackStateCompatCustomAction3 = jsonReader.PlaybackStateCompatCustomAction();
                                    DoubleFunction doubleFunction3 = DoubleFunction.NUMBER;
                                    if (doubleFunctionPlaybackStateCompatCustomAction3 == doubleFunction3) {
                                        fMediaMetadataCompat8 = (float) jsonReader.MediaMetadataCompat();
                                        f2 = fMediaMetadataCompat8;
                                        pointF5 = pointF15;
                                        obj4 = objSerializer3;
                                    } else {
                                        jsonReader.read();
                                        pointF5 = pointF15;
                                        obj4 = objSerializer3;
                                        fMediaMetadataCompat8 = (float) jsonReader.MediaMetadataCompat();
                                        float fMediaMetadataCompat10 = jsonReader.PlaybackStateCompatCustomAction() == doubleFunction3 ? (float) jsonReader.MediaMetadataCompat() : fMediaMetadataCompat8;
                                        jsonReader.IconCompatParcelizer();
                                        f2 = fMediaMetadataCompat10;
                                    }
                                }
                                pointF12 = pointF22;
                            } else {
                                pointF4 = pointF11;
                                pointF5 = pointF15;
                                obj4 = objSerializer3;
                                DoubleFunction doubleFunctionPlaybackStateCompatCustomAction4 = jsonReader.PlaybackStateCompatCustomAction();
                                DoubleFunction doubleFunction4 = DoubleFunction.NUMBER;
                                if (doubleFunctionPlaybackStateCompatCustomAction4 == doubleFunction4) {
                                    fMediaMetadataCompat7 = (float) jsonReader.MediaMetadataCompat();
                                    fMediaMetadataCompat9 = fMediaMetadataCompat7;
                                } else {
                                    jsonReader.read();
                                    fMediaMetadataCompat7 = (float) jsonReader.MediaMetadataCompat();
                                    fMediaMetadataCompat9 = jsonReader.PlaybackStateCompatCustomAction() == doubleFunction4 ? (float) jsonReader.MediaMetadataCompat() : fMediaMetadataCompat7;
                                    jsonReader.IconCompatParcelizer();
                                }
                            }
                            pointF11 = pointF4;
                            objSerializer3 = obj4;
                            pointF15 = pointF5;
                            pointF12 = pointF22;
                        }
                        pointF = pointF11;
                        pointF2 = pointF12;
                        pointF3 = pointF15;
                        obj3 = objSerializer3;
                        PointF pointF23 = new PointF(fMediaMetadataCompat7, fMediaMetadataCompat8);
                        PointF pointF24 = new PointF(fMediaMetadataCompat9, f2);
                        jsonReader.write();
                        pointF10 = pointF24;
                        pointF17 = pointF23;
                        pointF11 = pointF;
                        objSerializer3 = obj3;
                        pointF15 = pointF3;
                    } else {
                        pointF2 = pointF12;
                        pointF14 = transferHlgEotfui_graphics.read(jsonReader, f);
                    }
                    linearInterpolator2 = linearInterpolator;
                    colorresource2 = colorresource;
                    pointF12 = pointF2;
                    break;
                case 5:
                    z4 = jsonReader.RatingCompat() == 1;
                    break;
                case 6:
                    pointF11 = transferHlgEotfui_graphics.read(jsonReader, f);
                    break;
                case 7:
                    pointF12 = transferHlgEotfui_graphics.read(jsonReader, f);
                    break;
                default:
                    pointF2 = pointF12;
                    jsonReader.MediaSessionCompatResultReceiverWrapper();
                    pointF12 = pointF2;
                    break;
            }
        }
        LinearInterpolator linearInterpolator3 = linearInterpolator2;
        PointF pointF25 = pointF11;
        PointF pointF26 = pointF12;
        PointF pointF27 = pointF15;
        Object obj6 = objSerializer3;
        jsonReader.write();
        if (!z4) {
            if (pointF13 != null && pointF14 != null) {
                interpolatorWrite4 = write(pointF13, pointF14);
                obj2 = objSerializer4;
                interpolatorWrite2 = null;
                interpolatorWrite3 = null;
            } else if (pointF16 != null && pointF27 != null && pointF17 != null && pointF10 != null) {
                interpolatorWrite2 = write(pointF16, pointF17);
                interpolatorWrite3 = write(pointF27, pointF10);
                obj2 = objSerializer4;
                interpolatorWrite4 = null;
            }
            if (interpolatorWrite2 == null && interpolatorWrite3 != null) {
                lab = new Lab(strokeJoinCompanion, obj6, obj2, interpolatorWrite2, interpolatorWrite3, fMediaMetadataCompat2);
            } else {
                lab = new Lab(strokeJoinCompanion, obj6, obj2, interpolatorWrite4, fMediaMetadataCompat2, (Float) null);
            }
            lab.MediaBrowserCompatMediaItem = pointF25;
            lab.MediaSessionCompatResultReceiverWrapper = pointF26;
            return lab;
        }
        objSerializer4 = obj6;
        interpolatorWrite4 = linearInterpolator3;
        obj2 = objSerializer4;
        interpolatorWrite2 = null;
        interpolatorWrite3 = null;
        if (interpolatorWrite2 == null) {
            lab = new Lab(strokeJoinCompanion, obj6, obj2, interpolatorWrite4, fMediaMetadataCompat2, (Float) null);
        } else {
            lab = new Lab(strokeJoinCompanion, obj6, obj2, interpolatorWrite4, fMediaMetadataCompat2, (Float) null);
        }
        lab.MediaBrowserCompatMediaItem = pointF25;
        lab.MediaSessionCompatResultReceiverWrapper = pointF26;
        return lab;
    }

    public static Interpolator write(PointF pointF, PointF pointF2) {
        java.lang.ref.WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = getD50.IconCompatParcelizer(pointF.x, -1.0f, 1.0f);
        pointF.y = getD50.IconCompatParcelizer(pointF.y, -100.0f, 100.0f);
        pointF2.x = getD50.IconCompatParcelizer(pointF2.x, -1.0f, 1.0f);
        float fIconCompatParcelizer = getD50.IconCompatParcelizer(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fIconCompatParcelizer;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        android.graphics.Matrix matrix = newD50Xyzui_graphics.write;
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fIconCompatParcelizer != 0.0f) {
            i = (int) (i * 31 * fIconCompatParcelizer);
        }
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        synchronized (getSrgbPrimariesui_graphics.class) {
            if (read == null) {
                read = new accessprocessDragStart(0);
            }
            accessprocessDragStart accessprocessdragstart = read;
            accessprocessdragstart.getClass();
            weakReference = (java.lang.ref.WeakReference) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
        try {
            java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(pathInterpolator);
            synchronized (getSrgbPrimariesui_graphics.class) {
                read.RemoteActionCompatParcelizer(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }
}
