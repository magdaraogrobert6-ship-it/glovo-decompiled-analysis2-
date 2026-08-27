package com.google.mlkit.vision.barcode.common;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.huawei.hmf.tasks.a.i$d;

/* JADX INFO: loaded from: classes2.dex */
public final class Barcode {
    public final i$d.a serializer;

    public Barcode(i$d.a aVar) {
        this.serializer = aVar;
        int i = 0;
        int iMax = Integer.MIN_VALUE;
        if (aVar.RemoteActionCompatParcelizer != 4) {
            zzu zzuVar = (zzu) aVar.read;
            if (zzuVar.read != null) {
                int iMin = Integer.MAX_VALUE;
                int iMin2 = Integer.MAX_VALUE;
                int iMax2 = Integer.MIN_VALUE;
                while (true) {
                    Point[] pointArr = zzuVar.read;
                    if (i >= pointArr.length) {
                        break;
                    }
                    Point point = pointArr[i];
                    iMin = Math.min(iMin, point.x);
                    iMax = Math.max(iMax, point.x);
                    iMin2 = Math.min(iMin2, point.y);
                    iMax2 = Math.max(iMax2, point.y);
                    i++;
                }
                new Rect(iMin, iMin2, iMax, iMax2);
            }
        } else {
            Point[] pointArr2 = ((zzyb) aVar.read).write;
            if (pointArr2 != null) {
                int iMin3 = Integer.MAX_VALUE;
                int iMin4 = Integer.MAX_VALUE;
                int iMax3 = Integer.MIN_VALUE;
                while (i < pointArr2.length) {
                    Point point2 = pointArr2[i];
                    iMin3 = Math.min(iMin3, point2.x);
                    iMax = Math.max(iMax, point2.x);
                    iMin4 = Math.min(iMin4, point2.y);
                    iMax3 = Math.max(iMax3, point2.y);
                    i++;
                }
                new Rect(iMin3, iMin4, iMax, iMax3);
            }
        }
        if (aVar.RemoteActionCompatParcelizer != 4) {
            Point[] pointArr3 = ((zzu) aVar.read).read;
        } else {
            Point[] pointArr4 = ((zzyb) aVar.read).write;
        }
    }
}
