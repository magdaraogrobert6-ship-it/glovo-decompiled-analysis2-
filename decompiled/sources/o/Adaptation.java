package o;

import android.graphics.PointF;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Adaptation extends getColors {
    public ArrayList MediaDescriptionCompat;
    public final android.graphics.Path MediaMetadataCompat;
    public final r8lambda9WZGo8jxmhcanMko0p70vdir2pY MediaSessionCompatQueueItem;

    @Override // o.getColors
    public final boolean read() {
        ArrayList arrayList = this.MediaDescriptionCompat;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public Adaptation(List list) {
        super(list);
        this.MediaSessionCompatQueueItem = new r8lambda9WZGo8jxmhcanMko0p70vdir2pY();
        this.MediaMetadataCompat = new android.graphics.Path();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x025a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0313  */
    /* JADX WARN: Code duplicated, block: B:42:0x0155  */
    @Override // o.getColors
    public final Object RemoteActionCompatParcelizer(Lab lab, float f) {
        int i;
        PointF pointF;
        boolean z;
        r8lambda9WZGo8jxmhcanMko0p70vdir2pY r8lambda9wzgo8jxmhcanmko0p70vdir2py;
        int i2;
        boolean z2;
        PointF pointF2;
        Adaptation adaptation = this;
        r8lambda9WZGo8jxmhcanMko0p70vdir2pY r8lambda9wzgo8jxmhcanmko0p70vdir2py2 = (r8lambda9WZGo8jxmhcanMko0p70vdir2pY) lab.MediaSessionCompatToken;
        r8lambda9WZGo8jxmhcanMko0p70vdir2pY r8lambda9wzgo8jxmhcanmko0p70vdir2py3 = (r8lambda9WZGo8jxmhcanMko0p70vdir2pY) lab.RatingCompat;
        if (r8lambda9wzgo8jxmhcanmko0p70vdir2py3 == null) {
            r8lambda9wzgo8jxmhcanmko0p70vdir2py3 = r8lambda9wzgo8jxmhcanmko0p70vdir2py2;
        }
        r8lambda9WZGo8jxmhcanMko0p70vdir2pY r8lambda9wzgo8jxmhcanmko0p70vdir2py4 = adaptation.MediaSessionCompatQueueItem;
        ArrayList arrayList = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.serializer;
        if (r8lambda9wzgo8jxmhcanmko0p70vdir2py4.RemoteActionCompatParcelizer == null) {
            r8lambda9wzgo8jxmhcanmko0p70vdir2py4.RemoteActionCompatParcelizer = new PointF();
        }
        boolean z3 = r8lambda9wzgo8jxmhcanmko0p70vdir2py2.IconCompatParcelizer;
        ArrayList arrayList2 = r8lambda9wzgo8jxmhcanmko0p70vdir2py2.serializer;
        r8lambda9wzgo8jxmhcanmko0p70vdir2py4.IconCompatParcelizer = z3 || r8lambda9wzgo8jxmhcanmko0p70vdir2py3.IconCompatParcelizer;
        int size = arrayList2.size();
        ArrayList arrayList3 = r8lambda9wzgo8jxmhcanmko0p70vdir2py3.serializer;
        if (size != arrayList3.size()) {
            getD50Xyzui_graphics.IconCompatParcelizer("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new getMaxValue());
            }
        } else if (arrayList.size() > iMin) {
            int size3 = arrayList.size();
            while (true) {
                size3--;
                if (size3 < iMin) {
                    break;
                }
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF3 = r8lambda9wzgo8jxmhcanmko0p70vdir2py2.RemoteActionCompatParcelizer;
        PointF pointF4 = r8lambda9wzgo8jxmhcanmko0p70vdir2py3.RemoteActionCompatParcelizer;
        r8lambda9wzgo8jxmhcanmko0p70vdir2py4.IconCompatParcelizer(getD50.serializer(pointF3.x, pointF4.x, f), getD50.serializer(pointF3.y, pointF4.y, f));
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            getMaxValue getmaxvalue = (getMaxValue) arrayList2.get(size4);
            getMaxValue getmaxvalue2 = (getMaxValue) arrayList3.get(size4);
            PointF pointF5 = getmaxvalue.write;
            PointF pointF6 = getmaxvalue.RemoteActionCompatParcelizer;
            PointF pointF7 = getmaxvalue.read;
            PointF pointF8 = getmaxvalue2.write;
            PointF pointF9 = getmaxvalue2.RemoteActionCompatParcelizer;
            PointF pointF10 = getmaxvalue2.read;
            ((getMaxValue) arrayList.get(size4)).write.set(getD50.serializer(pointF5.x, pointF8.x, f), getD50.serializer(pointF5.y, pointF8.y, f));
            ((getMaxValue) arrayList.get(size4)).RemoteActionCompatParcelizer.set(getD50.serializer(pointF6.x, pointF9.x, f), getD50.serializer(pointF6.y, pointF9.y, f));
            ((getMaxValue) arrayList.get(size4)).read.set(getD50.serializer(pointF7.x, pointF10.x, f), getD50.serializer(pointF7.y, pointF10.y, f));
        }
        ArrayList arrayList4 = adaptation.MediaDescriptionCompat;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.serializer;
                if (size5 < 0) {
                    break;
                }
                accessgetTrianglescp accessgettrianglescp = (accessgetTrianglescp) adaptation.MediaDescriptionCompat.get(size5);
                accessgettrianglescp.getClass();
                if (arrayList5.size() > 2) {
                    float fFloatValue = ((Float) accessgettrianglescp.write.IconCompatParcelizer()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z4 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.IconCompatParcelizer;
                        int size6 = arrayList5.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            getMaxValue getmaxvalue3 = (getMaxValue) arrayList5.get(size6);
                            getMaxValue getmaxvalue4 = (getMaxValue) arrayList5.get(accessgetTrianglescp.serializer(size6 - 1, arrayList5.size()));
                            if (size6 == 0 && !z4) {
                                pointF2 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.RemoteActionCompatParcelizer;
                            } else {
                                pointF2 = getmaxvalue4.read;
                            }
                            i3 = (((size6 != 0 || z4) ? getmaxvalue4.RemoteActionCompatParcelizer : pointF2).equals(pointF2) && getmaxvalue3.write.equals(pointF2) && !(!r8lambda9wzgo8jxmhcanmko0p70vdir2py4.IconCompatParcelizer && (size6 == 0 || size6 == arrayList5.size() - 1))) ? i3 + 2 : i3 + 1;
                            size6--;
                        }
                        r8lambda9WZGo8jxmhcanMko0p70vdir2pY r8lambda9wzgo8jxmhcanmko0p70vdir2py5 = accessgettrianglescp.RemoteActionCompatParcelizer;
                        if (r8lambda9wzgo8jxmhcanmko0p70vdir2py5 == null || r8lambda9wzgo8jxmhcanmko0p70vdir2py5.serializer.size() != i3) {
                            ArrayList arrayList6 = new ArrayList(i3);
                            for (int i4 = 0; i4 < i3; i4++) {
                                arrayList6.add(new getMaxValue());
                            }
                            i = 0;
                            accessgettrianglescp.RemoteActionCompatParcelizer = new r8lambda9WZGo8jxmhcanMko0p70vdir2pY(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i = 0;
                        }
                        r8lambda9WZGo8jxmhcanMko0p70vdir2pY r8lambda9wzgo8jxmhcanmko0p70vdir2py6 = accessgettrianglescp.RemoteActionCompatParcelizer;
                        r8lambda9wzgo8jxmhcanmko0p70vdir2py6.IconCompatParcelizer = z4;
                        PointF pointF11 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.RemoteActionCompatParcelizer;
                        r8lambda9wzgo8jxmhcanmko0p70vdir2py6.IconCompatParcelizer(pointF11.x, pointF11.y);
                        ArrayList arrayList7 = r8lambda9wzgo8jxmhcanmko0p70vdir2py6.serializer;
                        boolean z5 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.IconCompatParcelizer;
                        int i5 = i;
                        int i6 = i5;
                        while (i5 < arrayList5.size()) {
                            getMaxValue getmaxvalue5 = (getMaxValue) arrayList5.get(i5);
                            getMaxValue getmaxvalue6 = (getMaxValue) arrayList5.get(accessgetTrianglescp.serializer(i5 - 1, arrayList5.size()));
                            getMaxValue getmaxvalue7 = (getMaxValue) arrayList5.get(accessgetTrianglescp.serializer(i5 - 2, arrayList5.size()));
                            if (i5 == 0 && !z5) {
                                pointF = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.RemoteActionCompatParcelizer;
                            } else {
                                pointF = getmaxvalue6.read;
                            }
                            PointF pointF12 = (i5 != 0 || z5) ? getmaxvalue6.RemoteActionCompatParcelizer : pointF;
                            PointF pointF13 = getmaxvalue5.write;
                            PointF pointF14 = getmaxvalue7.read;
                            boolean z6 = z5;
                            PointF pointF15 = getmaxvalue5.read;
                            if (!r8lambda9wzgo8jxmhcanmko0p70vdir2py4.IconCompatParcelizer) {
                                if (i5 != 0) {
                                    z2 = true;
                                    if (i5 == arrayList5.size() - 1) {
                                    }
                                    if (!pointF12.equals(pointF) && pointF13.equals(pointF) && !z) {
                                        float f2 = pointF.x;
                                        float f3 = pointF14.x;
                                        float f4 = pointF.y;
                                        float f5 = pointF14.y;
                                        float f6 = pointF15.x;
                                        float f7 = pointF15.y;
                                        r8lambda9WZGo8jxmhcanMko0p70vdir2pY r8lambda9wzgo8jxmhcanmko0p70vdir2py7 = r8lambda9wzgo8jxmhcanmko0p70vdir2py6;
                                        i2 = i5;
                                        int i7 = i6;
                                        float fHypot = (float) Math.hypot(f2 - f3, f4 - f5);
                                        float fHypot2 = (float) Math.hypot(f6 - f2, f7 - f4);
                                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                                        float f8 = pointF.x;
                                        float fM = c8$$ExternalSyntheticOutline0.m(pointF14.x, f8, fMin, f8);
                                        float f9 = pointF.y;
                                        float fM2 = c8$$ExternalSyntheticOutline0.m(pointF14.y, f9, fMin, f9);
                                        float fM3 = c8$$ExternalSyntheticOutline0.m(pointF15.x, f8, fMin2, f8);
                                        float fM4 = c8$$ExternalSyntheticOutline0.m(pointF15.y, f9, fMin2, f9);
                                        getMaxValue getmaxvalue8 = (getMaxValue) arrayList7.get(accessgetTrianglescp.serializer(i7 - 1, arrayList7.size()));
                                        getMaxValue getmaxvalue9 = (getMaxValue) arrayList7.get(i7);
                                        getmaxvalue8.RemoteActionCompatParcelizer.set(fM, fM2);
                                        getmaxvalue8.read.set(fM, fM2);
                                        r8lambda9wzgo8jxmhcanmko0p70vdir2py = r8lambda9wzgo8jxmhcanmko0p70vdir2py7;
                                        if (i2 == 0) {
                                            r8lambda9wzgo8jxmhcanmko0p70vdir2py.IconCompatParcelizer(fM, fM2);
                                        }
                                        getmaxvalue9.write.set(fM - ((fM - f8) * 0.5519f), fM2 - ((fM2 - f9) * 0.5519f));
                                        getMaxValue getmaxvalue10 = (getMaxValue) arrayList7.get(i7 + 1);
                                        getmaxvalue9.RemoteActionCompatParcelizer.set(fM3 - ((fM3 - f8) * 0.5519f), fM4 - ((fM4 - f9) * 0.5519f));
                                        getmaxvalue9.read.set(fM3, fM4);
                                        getmaxvalue10.write.set(fM3, fM4);
                                        i6 = i7 + 2;
                                    } else {
                                        r8lambda9wzgo8jxmhcanmko0p70vdir2py = r8lambda9wzgo8jxmhcanmko0p70vdir2py6;
                                        i2 = i5;
                                        int i8 = i6;
                                        getMaxValue getmaxvalue11 = (getMaxValue) arrayList7.get(accessgetTrianglescp.serializer(i8 - 1, arrayList7.size()));
                                        getMaxValue getmaxvalue12 = (getMaxValue) arrayList7.get(i8);
                                        PointF pointF16 = getmaxvalue6.RemoteActionCompatParcelizer;
                                        getmaxvalue11.RemoteActionCompatParcelizer.set(pointF16.x, pointF16.y);
                                        PointF pointF17 = getmaxvalue6.read;
                                        getmaxvalue11.read.set(pointF17.x, pointF17.y);
                                        PointF pointF18 = getmaxvalue5.write;
                                        getmaxvalue12.write.set(pointF18.x, pointF18.y);
                                        i6 = i8 + 1;
                                    }
                                    i5 = i2 + 1;
                                    r8lambda9wzgo8jxmhcanmko0p70vdir2py6 = r8lambda9wzgo8jxmhcanmko0p70vdir2py;
                                    arrayList5 = arrayList5;
                                    r8lambda9wzgo8jxmhcanmko0p70vdir2py4 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4;
                                    z5 = z6;
                                } else {
                                    z2 = true;
                                }
                                z = z2;
                                if (!pointF12.equals(pointF)) {
                                    r8lambda9wzgo8jxmhcanmko0p70vdir2py = r8lambda9wzgo8jxmhcanmko0p70vdir2py6;
                                    i2 = i5;
                                    int i9 = i6;
                                    getMaxValue getmaxvalue13 = (getMaxValue) arrayList7.get(accessgetTrianglescp.serializer(i9 - 1, arrayList7.size()));
                                    getMaxValue getmaxvalue14 = (getMaxValue) arrayList7.get(i9);
                                    PointF pointF19 = getmaxvalue6.RemoteActionCompatParcelizer;
                                    getmaxvalue13.RemoteActionCompatParcelizer.set(pointF19.x, pointF19.y);
                                    PointF pointF110 = getmaxvalue6.read;
                                    getmaxvalue13.read.set(pointF110.x, pointF110.y);
                                    PointF pointF111 = getmaxvalue5.write;
                                    getmaxvalue14.write.set(pointF111.x, pointF111.y);
                                    i6 = i9 + 1;
                                } else {
                                    r8lambda9wzgo8jxmhcanmko0p70vdir2py = r8lambda9wzgo8jxmhcanmko0p70vdir2py6;
                                    i2 = i5;
                                    int i10 = i6;
                                    getMaxValue getmaxvalue15 = (getMaxValue) arrayList7.get(accessgetTrianglescp.serializer(i10 - 1, arrayList7.size()));
                                    getMaxValue getmaxvalue16 = (getMaxValue) arrayList7.get(i10);
                                    PointF pointF112 = getmaxvalue6.RemoteActionCompatParcelizer;
                                    getmaxvalue15.RemoteActionCompatParcelizer.set(pointF112.x, pointF112.y);
                                    PointF pointF113 = getmaxvalue6.read;
                                    getmaxvalue15.read.set(pointF113.x, pointF113.y);
                                    PointF pointF114 = getmaxvalue5.write;
                                    getmaxvalue16.write.set(pointF114.x, pointF114.y);
                                    i6 = i10 + 1;
                                }
                                i5 = i2 + 1;
                                r8lambda9wzgo8jxmhcanmko0p70vdir2py6 = r8lambda9wzgo8jxmhcanmko0p70vdir2py;
                                arrayList5 = arrayList5;
                                r8lambda9wzgo8jxmhcanmko0p70vdir2py4 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4;
                                z5 = z6;
                            }
                            z = false;
                            if (!pointF12.equals(pointF)) {
                                r8lambda9wzgo8jxmhcanmko0p70vdir2py = r8lambda9wzgo8jxmhcanmko0p70vdir2py6;
                                i2 = i5;
                                int i11 = i6;
                                getMaxValue getmaxvalue17 = (getMaxValue) arrayList7.get(accessgetTrianglescp.serializer(i11 - 1, arrayList7.size()));
                                getMaxValue getmaxvalue18 = (getMaxValue) arrayList7.get(i11);
                                PointF pointF115 = getmaxvalue6.RemoteActionCompatParcelizer;
                                getmaxvalue17.RemoteActionCompatParcelizer.set(pointF115.x, pointF115.y);
                                PointF pointF116 = getmaxvalue6.read;
                                getmaxvalue17.read.set(pointF116.x, pointF116.y);
                                PointF pointF117 = getmaxvalue5.write;
                                getmaxvalue18.write.set(pointF117.x, pointF117.y);
                                i6 = i11 + 1;
                            } else {
                                r8lambda9wzgo8jxmhcanmko0p70vdir2py = r8lambda9wzgo8jxmhcanmko0p70vdir2py6;
                                i2 = i5;
                                int i12 = i6;
                                getMaxValue getmaxvalue19 = (getMaxValue) arrayList7.get(accessgetTrianglescp.serializer(i12 - 1, arrayList7.size()));
                                getMaxValue getmaxvalue110 = (getMaxValue) arrayList7.get(i12);
                                PointF pointF118 = getmaxvalue6.RemoteActionCompatParcelizer;
                                getmaxvalue19.RemoteActionCompatParcelizer.set(pointF118.x, pointF118.y);
                                PointF pointF119 = getmaxvalue6.read;
                                getmaxvalue19.read.set(pointF119.x, pointF119.y);
                                PointF pointF1110 = getmaxvalue5.write;
                                getmaxvalue110.write.set(pointF1110.x, pointF1110.y);
                                i6 = i12 + 1;
                            }
                            i5 = i2 + 1;
                            r8lambda9wzgo8jxmhcanmko0p70vdir2py6 = r8lambda9wzgo8jxmhcanmko0p70vdir2py;
                            arrayList5 = arrayList5;
                            r8lambda9wzgo8jxmhcanmko0p70vdir2py4 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4;
                            z5 = z6;
                        }
                        r8lambda9wzgo8jxmhcanmko0p70vdir2py4 = r8lambda9wzgo8jxmhcanmko0p70vdir2py6;
                    }
                }
                size5--;
                adaptation = this;
            }
        }
        android.graphics.Path path = this.MediaMetadataCompat;
        path.reset();
        PointF pointF20 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.RemoteActionCompatParcelizer;
        ArrayList arrayList8 = r8lambda9wzgo8jxmhcanmko0p70vdir2py4.serializer;
        path.moveTo(pointF20.x, pointF20.y);
        PointF pointF21 = getD50.write;
        pointF21.set(pointF20.x, pointF20.y);
        for (int i13 = 0; i13 < arrayList8.size(); i13++) {
            getMaxValue getmaxvalue20 = (getMaxValue) arrayList8.get(i13);
            PointF pointF22 = getmaxvalue20.write;
            PointF pointF23 = getmaxvalue20.RemoteActionCompatParcelizer;
            PointF pointF24 = getmaxvalue20.read;
            if (pointF22.equals(pointF21) && pointF23.equals(pointF24)) {
                path.lineTo(pointF24.x, pointF24.y);
            } else {
                path.cubicTo(pointF22.x, pointF22.y, pointF23.x, pointF23.y, pointF24.x, pointF24.y);
            }
            pointF21.set(pointF24.x, pointF24.y);
        }
        if (r8lambda9wzgo8jxmhcanmko0p70vdir2py4.IconCompatParcelizer) {
            path.close();
        }
        return path;
    }
}
