package com.sentiance.sdk.tile.store;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.util.BoundingBox;
import java.util.Arrays;
import o.DataStoreProvidern;

/* JADX INFO: loaded from: classes3.dex */
public class k {
    private double IconCompatParcelizer;
    private byte[] MediaDescriptionCompat;
    private BoundingBox RatingCompat;
    private double RemoteActionCompatParcelizer;
    private final long read;
    private long serializer;
    private long write;

    public final int hashCode() {
        long j = this.serializer;
        return (int) (j ^ (j >>> 32));
    }

    public final DataStoreProvidern IconCompatParcelizer() {
        c cVar;
        long j = this.serializer;
        double d = this.IconCompatParcelizer;
        double d2 = this.RemoteActionCompatParcelizer;
        long j2 = this.write;
        byte[] bArr = this.MediaDescriptionCompat;
        if (bArr == null) {
            cVar = null;
        } else {
            Parcelable.Creator<c> creator = c.CREATOR;
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            c cVarCreateFromParcel = creator.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            cVar = cVarCreateFromParcel;
        }
        return new DataStoreProvidern(j, d, d2, j2, cVar);
    }

    public final ContentValues read() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("venue_id", Long.valueOf(this.serializer));
        contentValues.put("latitude", Double.valueOf(this.IconCompatParcelizer));
        contentValues.put("longitude", Double.valueOf(this.RemoteActionCompatParcelizer));
        contentValues.put("tile_id", Long.valueOf(this.write));
        contentValues.put("vertices", this.MediaDescriptionCompat);
        contentValues.put("vertices_min_lat", Double.valueOf(this.RatingCompat.read()));
        contentValues.put("vertices_min_lon", Double.valueOf(this.RatingCompat.MediaDescriptionCompat()));
        contentValues.put("vertices_max_lat", Double.valueOf(this.RatingCompat.RemoteActionCompatParcelizer()));
        contentValues.put("vertices_max_lon", Double.valueOf(this.RatingCompat.IconCompatParcelizer()));
        return contentValues;
    }

    public final String toString() {
        return "VenueEntry{id=" + this.read + ", venueId=" + this.serializer + ", latitude=" + this.IconCompatParcelizer + ", longitude=" + this.RemoteActionCompatParcelizer + ", tileId=" + this.write + ", vertices=" + Arrays.toString(this.MediaDescriptionCompat) + ", verticesBoundingBox=" + this.RatingCompat + '}';
    }

    public static k IconCompatParcelizer(Cursor cursor) throws IllegalArgumentException {
        return new k(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getLong(cursor.getColumnIndexOrThrow("venue_id")), cursor.getDouble(cursor.getColumnIndexOrThrow("latitude")), cursor.getDouble(cursor.getColumnIndexOrThrow("longitude")), cursor.getLong(cursor.getColumnIndexOrThrow("tile_id")), cursor.getBlob(cursor.getColumnIndexOrThrow("vertices")), new BoundingBox(cursor.getDouble(cursor.getColumnIndexOrThrow("vertices_min_lat")), cursor.getDouble(cursor.getColumnIndexOrThrow("vertices_max_lat")), cursor.getDouble(cursor.getColumnIndexOrThrow("vertices_min_lon")), cursor.getDouble(cursor.getColumnIndexOrThrow("vertices_max_lon"))));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(long j, double d, double d2, long j2, c cVar) {
        byte[] bArr;
        if (cVar == null) {
            bArr = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            cVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bArr = bArrMarshall;
        }
        this(j, d, d2, j2, bArr, cVar != null ? cVar.IconCompatParcelizer() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.serializer == ((k) obj).serializer;
    }

    public k(long j, double d, double d2, long j2, byte[] bArr, BoundingBox boundingBox) {
        this.serializer = j;
        this.IconCompatParcelizer = d;
        this.RemoteActionCompatParcelizer = d2;
        this.write = j2;
        this.MediaDescriptionCompat = bArr;
        this.RatingCompat = boundingBox == null ? new BoundingBox(d, d, d2, d2) : boundingBox;
    }

    public k(long j, long j2, double d, double d2, long j3, byte[] bArr, BoundingBox boundingBox) {
        this(j2, d, d2, j3, bArr, boundingBox);
        this.read = j;
    }

    public final void read(long j, double d, double d2, long j2, c cVar) {
        byte[] bArr;
        BoundingBox boundingBoxIconCompatParcelizer;
        this.serializer = j;
        this.IconCompatParcelizer = d;
        this.RemoteActionCompatParcelizer = d2;
        this.write = j2;
        if (cVar == null) {
            bArr = null;
        } else {
            Parcel parcelObtain = Parcel.obtain();
            cVar.writeToParcel(parcelObtain, 0);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            bArr = bArrMarshall;
        }
        this.MediaDescriptionCompat = bArr;
        if (cVar == null) {
            boundingBoxIconCompatParcelizer = new BoundingBox(d, d, d2, d2);
        } else {
            boundingBoxIconCompatParcelizer = cVar.IconCompatParcelizer();
        }
        this.RatingCompat = boundingBoxIconCompatParcelizer;
    }
}
