package com.google.mlkit.vision.face;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.CalculateMatrixToWindowApi21;
import o.accessgetTvTeletextcp;
import o.getDefault4UtRPd4;

/* JADX INFO: loaded from: classes2.dex */
public final class Face {
    public final Rect IconCompatParcelizer;
    public final float MediaDescriptionCompat;
    public final float MediaMetadataCompat;
    public final float MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public final float read;
    public final float serializer;
    public final float write;
    public final SparseArray MediaBrowserCompatMediaItem = new SparseArray();
    public final SparseArray RatingCompat = new SparseArray();

    public static boolean RemoteActionCompatParcelizer(int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    public final String toString() {
        accessgetTvTeletextcp accessgettvteletextcp = new accessgetTvTeletextcp("Face");
        accessgettvteletextcp.write(this.IconCompatParcelizer, "boundingBox");
        accessgettvteletextcp.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "trackingId");
        accessgettvteletextcp.IconCompatParcelizer(this.serializer, "rightEyeOpenProbability");
        accessgettvteletextcp.IconCompatParcelizer(this.read, "leftEyeOpenProbability");
        accessgettvteletextcp.IconCompatParcelizer(this.write, "smileProbability");
        accessgettvteletextcp.IconCompatParcelizer(this.MediaSessionCompatQueueItem, "eulerX");
        accessgettvteletextcp.IconCompatParcelizer(this.MediaMetadataCompat, "eulerY");
        accessgettvteletextcp.IconCompatParcelizer(this.MediaDescriptionCompat, "eulerZ");
        accessgetTvTeletextcp accessgettvteletextcp2 = new accessgetTvTeletextcp("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (RemoteActionCompatParcelizer(i)) {
                accessgettvteletextcp2.write((CalculateMatrixToWindowApi21) this.MediaBrowserCompatMediaItem.get(i), c8$$ExternalSyntheticOutline0.m(i, "landmark_"));
            }
        }
        accessgettvteletextcp.write(accessgettvteletextcp2.toString(), "landmarks");
        accessgetTvTeletextcp accessgettvteletextcp3 = new accessgetTvTeletextcp("Contours");
        for (int i2 = 1; i2 <= 15; i2++) {
            accessgettvteletextcp3.write((getDefault4UtRPd4) this.RatingCompat.get(i2), c8$$ExternalSyntheticOutline0.m(i2, "Contour_"));
        }
        accessgettvteletextcp.write(accessgettvteletextcp3.toString(), "contours");
        return accessgettvteletextcp.toString();
    }

    public Face(zzf zzfVar) {
        float f = zzfVar.read;
        float f2 = zzfVar.serializer / 2.0f;
        float f3 = zzfVar.write;
        float f4 = zzfVar.MediaSessionCompatQueueItem / 2.0f;
        this.IconCompatParcelizer = new Rect((int) (f - f2), (int) (f3 - f4), (int) (f + f2), (int) (f3 + f4));
        this.RemoteActionCompatParcelizer = zzfVar.IconCompatParcelizer;
        for (zzn zznVar : zzfVar.MediaDescriptionCompat) {
            if (RemoteActionCompatParcelizer(zznVar.serializer)) {
                PointF pointF = new PointF(zznVar.read, zznVar.IconCompatParcelizer);
                SparseArray sparseArray = this.MediaBrowserCompatMediaItem;
                int i = zznVar.serializer;
                sparseArray.put(i, new CalculateMatrixToWindowApi21(i, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.PlaybackStateCompat) {
            int i2 = zzdVar.IconCompatParcelizer;
            if (i2 <= 15 && i2 > 0) {
                PointF[] pointFArr = zzdVar.RemoteActionCompatParcelizer;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j > 2147483647L ? Integer.MAX_VALUE : (int) j);
                Collections.addAll(arrayList, pointFArr);
                this.RatingCompat.put(i2, new getDefault4UtRPd4(i2, arrayList));
            }
        }
        this.MediaSessionCompatQueueItem = zzfVar.RatingCompat;
        this.MediaMetadataCompat = zzfVar.MediaMetadataCompat;
        this.MediaDescriptionCompat = zzfVar.MediaBrowserCompatMediaItem;
        this.write = zzfVar.MediaSessionCompatResultReceiverWrapper;
        this.read = zzfVar.PlaybackStateCompatCustomAction;
        this.serializer = zzfVar.ParcelableVolumeInfo;
    }

    public Face(zzow zzowVar) {
        this.IconCompatParcelizer = zzowVar.write;
        this.RemoteActionCompatParcelizer = zzowVar.read;
        for (zzpc zzpcVar : zzowVar.MediaBrowserCompatMediaItem) {
            if (RemoteActionCompatParcelizer(zzpcVar.IconCompatParcelizer)) {
                PointF pointF = zzpcVar.serializer;
                SparseArray sparseArray = this.MediaBrowserCompatMediaItem;
                int i = zzpcVar.IconCompatParcelizer;
                sparseArray.put(i, new CalculateMatrixToWindowApi21(i, pointF));
            }
        }
        for (zzos zzosVar : zzowVar.PlaybackStateCompatCustomAction) {
            int i2 = zzosVar.IconCompatParcelizer;
            if (i2 <= 15 && i2 > 0) {
                List list = zzosVar.read;
                list.getClass();
                this.RatingCompat.put(i2, new getDefault4UtRPd4(i2, new ArrayList(list)));
            }
        }
        this.MediaSessionCompatQueueItem = zzowVar.IconCompatParcelizer;
        this.MediaMetadataCompat = zzowVar.serializer;
        this.MediaDescriptionCompat = -zzowVar.RemoteActionCompatParcelizer;
        this.write = zzowVar.MediaSessionCompatQueueItem;
        this.read = zzowVar.RatingCompat;
        this.serializer = zzowVar.MediaDescriptionCompat;
    }
}
