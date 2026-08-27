package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import o.DrawableTransformation;
import o.getNumLockEK5gGoQ;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new zzm();
    private final float[] zza;
    private final float zzb;
    private final float zzc;
    private final long zzd;
    private final byte zze;
    private final float zzf;
    private final float zzg;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Builder {
        private final float[] zza;
        private float zzb;
        private float zzc;
        private long zzd;
        private byte zze;
        private float zzf;
        private float zzg;

        public DeviceOrientation build() {
            return new DeviceOrientation(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
        }

        public Builder clearConservativeHeadingErrorDegrees() {
            this.zzg = 180.0f;
            byte b = this.zze;
            this.zzf = 0.0f;
            this.zze = (byte) (((byte) (b & (-65))) & (-33));
            return this;
        }

        public Builder setAttitude(float[] fArr) {
            DeviceOrientation.zzj(fArr);
            System.arraycopy(fArr, 0, this.zza, 0, fArr.length);
            return this;
        }

        public Builder(DeviceOrientation deviceOrientation) {
            this.zze = (byte) 0;
            DeviceOrientation.zzj(deviceOrientation.zzc());
            this.zza = Arrays.copyOf(deviceOrientation.zzc(), deviceOrientation.zzc().length);
            setHeadingDegrees(deviceOrientation.zzd());
            setHeadingErrorDegrees(deviceOrientation.zze());
            setConservativeHeadingErrorDegrees(deviceOrientation.zzi());
            setElapsedRealtimeNs(deviceOrientation.zzf());
            this.zzf = deviceOrientation.zzh();
            this.zze = deviceOrientation.zzg();
        }

        public Builder setElapsedRealtimeNs(long j) {
            getNumLockEK5gGoQ.IconCompatParcelizer("elapsedRealtimeNs should be greater than or equal to 0.", j >= 0);
            this.zzd = j;
            return this;
        }

        public Builder setConservativeHeadingErrorDegrees(float f) {
            getNumLockEK5gGoQ.IconCompatParcelizer("conservativeHeadingErrorDegrees should be between 0 and 180.", f >= 0.0f && f <= 180.0f);
            this.zzg = f;
            this.zze = (byte) (this.zze | 64);
            Parcelable.Creator<DeviceOrientation> creator = DeviceOrientation.CREATOR;
            this.zzf = f < 180.0f ? (float) (2.0d / (1.0d - Math.cos(Math.toRadians(f)))) : 0.0f;
            this.zze = (byte) (this.zze | 32);
            return this;
        }

        public Builder setHeadingDegrees(float f) {
            getNumLockEK5gGoQ.IconCompatParcelizer("headingDegrees should be greater than or equal to 0 and less than 360.", f >= 0.0f && f < 360.0f);
            this.zzb = f;
            return this;
        }

        public Builder setHeadingErrorDegrees(float f) {
            getNumLockEK5gGoQ.IconCompatParcelizer("headingErrorDegrees should be between 0 and 180.", f >= 0.0f && f <= 180.0f);
            this.zzc = f;
            return this;
        }

        public Builder(float[] fArr, float f, float f2, long j) {
            this.zze = (byte) 0;
            DeviceOrientation.zzj(fArr);
            this.zza = Arrays.copyOf(fArr, fArr.length);
            setHeadingDegrees(f);
            setHeadingErrorDegrees(f2);
            setElapsedRealtimeNs(j);
            this.zzf = 0.0f;
            this.zzg = 180.0f;
            this.zze = (byte) 0;
        }
    }

    public float getConservativeHeadingErrorDegrees() {
        return this.zzg;
    }

    public long getElapsedRealtimeNs() {
        return this.zzd;
    }

    public float getHeadingDegrees() {
        return this.zzb;
    }

    public float getHeadingErrorDegrees() {
        return this.zzc;
    }

    public boolean hasConservativeHeadingErrorDegrees() {
        return (this.zze & 64) != 0;
    }

    public final boolean zza() {
        return (this.zze & 32) != 0;
    }

    public final /* synthetic */ float[] zzc() {
        return this.zza;
    }

    public final /* synthetic */ float zzd() {
        return this.zzb;
    }

    public final /* synthetic */ float zze() {
        return this.zzc;
    }

    public final /* synthetic */ long zzf() {
        return this.zzd;
    }

    public final /* synthetic */ byte zzg() {
        return this.zze;
    }

    public final /* synthetic */ float zzh() {
        return this.zzf;
    }

    public final /* synthetic */ float zzi() {
        return this.zzg;
    }

    public float[] getAttitude() {
        return (float[]) this.zza.clone();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = SQLite.read(20293, parcel);
        float[] attitude = getAttitude();
        if (attitude != null) {
            int i3 = SQLite.read(1, parcel);
            parcel.writeFloatArray(attitude);
            SQLite.serializer(i3, parcel);
        }
        float headingDegrees = getHeadingDegrees();
        SQLite.RemoteActionCompatParcelizer(parcel, 4, 4);
        parcel.writeFloat(headingDegrees);
        float headingErrorDegrees = getHeadingErrorDegrees();
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 4);
        parcel.writeFloat(headingErrorDegrees);
        long elapsedRealtimeNs = getElapsedRealtimeNs();
        SQLite.RemoteActionCompatParcelizer(parcel, 6, 8);
        parcel.writeLong(elapsedRealtimeNs);
        byte b = this.zze;
        SQLite.RemoteActionCompatParcelizer(parcel, 7, 4);
        parcel.writeInt(b);
        float f = this.zzf;
        SQLite.RemoteActionCompatParcelizer(parcel, 8, 4);
        parcel.writeFloat(f);
        float conservativeHeadingErrorDegrees = getConservativeHeadingErrorDegrees();
        SQLite.RemoteActionCompatParcelizer(parcel, 9, 4);
        parcel.writeFloat(conservativeHeadingErrorDegrees);
        SQLite.serializer(i2, parcel);
    }

    public DeviceOrientation(float[] fArr, float f, float f2, long j, byte b, float f3, float f4) {
        zzj(fArr);
        if (f < 0.0f || f >= 360.0f) {
            DrawableTransformation.write();
            throw null;
        }
        if (f2 < 0.0f || f2 > 180.0f) {
            DrawableTransformation.write();
            throw null;
        }
        if (f4 < 0.0f || f4 > 180.0f) {
            DrawableTransformation.write();
            throw null;
        }
        if (j < 0) {
            DrawableTransformation.write();
            throw null;
        }
        this.zza = fArr;
        this.zzb = f;
        this.zzc = f2;
        this.zzf = f3;
        this.zzg = f4;
        this.zzd = j;
        this.zze = (byte) (((byte) (((byte) (b | 16)) | 4)) | 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzj(float[] fArr) {
        boolean z = false;
        getNumLockEK5gGoQ.IconCompatParcelizer("Input attitude array should be of length 4.", fArr != null && fArr.length == 4);
        if (!Float.isNaN(fArr[0]) && !Float.isNaN(fArr[1]) && !Float.isNaN(fArr[2]) && !Float.isNaN(fArr[3])) {
            z = true;
        }
        getNumLockEK5gGoQ.IconCompatParcelizer("Input attitude cannot contain NaNs.", z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        return Float.compare(this.zzb, deviceOrientation.zzb) == 0 && Float.compare(this.zzc, deviceOrientation.zzc) == 0 && (zza() == deviceOrientation.zza() && (!zza() || Float.compare(this.zzf, deviceOrientation.zzf) == 0)) && (hasConservativeHeadingErrorDegrees() == deviceOrientation.hasConservativeHeadingErrorDegrees() && (!hasConservativeHeadingErrorDegrees() || Float.compare(getConservativeHeadingErrorDegrees(), deviceOrientation.getConservativeHeadingErrorDegrees()) == 0)) && this.zzd == deviceOrientation.zzd && Arrays.equals(this.zza, deviceOrientation.zza);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.zza));
        sb.append(", headingDegrees=");
        sb.append(this.zzb);
        sb.append(", headingErrorDegrees=");
        sb.append(this.zzc);
        if (hasConservativeHeadingErrorDegrees()) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.zzg);
        }
        sb.append(", elapsedRealtimeNs=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.zzd, ']');
    }

    public int hashCode() {
        float f = this.zzb;
        float f2 = this.zzc;
        float f3 = this.zzg;
        long j = this.zzd;
        return Arrays.hashCode(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Long.valueOf(j), this.zza, Byte.valueOf(this.zze)});
    }
}
