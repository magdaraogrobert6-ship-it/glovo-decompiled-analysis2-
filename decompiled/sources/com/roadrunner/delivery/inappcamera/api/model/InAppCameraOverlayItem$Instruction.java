package com.roadrunner.delivery.inappcamera.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.util.UtilsKt;
import o.TypefaceRequestCache;
import o.getCieXyz;
import o.getResourceLoaderCacheKey;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppCameraOverlayItem$Instruction implements Parcelable {
    public static final Parcelable.Creator<InAppCameraOverlayItem$Instruction> CREATOR = new TypefaceRequestCache();
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final Config IconCompatParcelizer;
    public final int serializer;
    public final String write;

    public static final class Config implements Parcelable {
        public static final Parcelable.Creator<Config> CREATOR = new getResourceLoaderCacheKey();
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 1;
        private static int write;
        public final write serializer;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class write {
            private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES;
            private static final /* synthetic */ write[] $VALUES;
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            private static int serializer = 0;
            private static int write = 1;
            public static final write START = new write("START", 0);
            public static final write CENTER = new write("CENTER", 1);
            public static final write END = new write("END", 2);

            private write(String str, int i) {
                super(str, i);
            }

            public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
                int i = 2 % 2;
                int i2 = serializer;
                int i3 = i2 + 45;
                write = i3 % Fields.SpotShadowColor;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U r8lambdacq4v2aqod74ihhwv724n_b6w0u = $ENTRIES;
                int i4 = i2 + 45;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return r8lambdacq4v2aqod74ihhwv724n_b6w0u;
                }
                obj.hashCode();
                throw null;
            }

            static {
                write[] writeVarArr$values = $values();
                $VALUES = writeVarArr$values;
                $ENTRIES = UtilsKt.read((Enum[]) writeVarArr$values);
                int i = IconCompatParcelizer + 105;
                read = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static write valueOf(String str) {
                int i = 2 % 2;
                int i2 = serializer + 1;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                write writeVar = (write) Enum.valueOf(write.class, str);
                int i3 = serializer + 77;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 15 / 0;
                }
                return writeVar;
            }

            public static write[] values() {
                int i = 2 % 2;
                int i2 = write + 79;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return (write[]) $VALUES.clone();
                }
                int i3 = 12 / 0;
                return (write[]) $VALUES.clone();
            }

            private static final /* synthetic */ write[] $values() {
                write[] writeVarArr;
                int i = 2 % 2;
                int i2 = write + 63;
                int i3 = i2 % Fields.SpotShadowColor;
                serializer = i3;
                if (i2 % 2 != 0) {
                    write writeVar = START;
                    write writeVar2 = CENTER;
                    write writeVar3 = END;
                    writeVarArr = new write[3];
                    writeVarArr[0] = writeVar;
                    writeVarArr[1] = writeVar2;
                    writeVarArr[5] = writeVar3;
                } else {
                    writeVarArr = new write[]{START, CENTER, END};
                }
                int i4 = i3 + 79;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return writeVarArr;
                }
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 49;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 25;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = read + 3;
            write = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public Config(write writeVar) {
            this.serializer = writeVar;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 63;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            write writeVar = this.serializer;
            if (writeVar == null) {
                return 0;
            }
            int iHashCode = writeVar.hashCode();
            int i4 = RemoteActionCompatParcelizer + 95;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            if (this.serializer != ((Config) obj).serializer) {
                int i2 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = RemoteActionCompatParcelizer + 57;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "Config(trim=" + this.serializer + ")";
            int i2 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 55;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            write writeVar = this.serializer;
            if (writeVar != null) {
                parcel.writeInt(1);
                parcel.writeString(writeVar.name());
                return;
            }
            int i5 = RemoteActionCompatParcelizer + 59;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RatingCompat + 11;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 109;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    static {
        int i = read + 81;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 69 / 0;
        }
    }

    public InAppCameraOverlayItem$Instruction(int i, String str, Config config) {
        str.getClass();
        this.serializer = i;
        this.write = str;
        this.IconCompatParcelizer = config;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.serializer) * 31, 31, this.write);
        Config config = this.IconCompatParcelizer;
        int iHashCode = iM + (config == null ? 0 : config.hashCode());
        int i4 = RatingCompat + 111;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RatingCompat + 9;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("Instruction(icon=", this.serializer, ", text=", this.write, ", config=");
            sbM.append(this.IconCompatParcelizer);
            sbM.append(")");
            return sbM.toString();
        }
        StringBuilder sbM2 = d$$ExternalSyntheticOutline0.m("Instruction(icon=", this.serializer, ", text=", this.write, ", config=");
        sbM2.append(this.IconCompatParcelizer);
        sbM2.append(")");
        sbM2.toString();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        parcel.getClass();
        parcel.writeInt(this.serializer);
        parcel.writeString(this.write);
        Config config = this.IconCompatParcelizer;
        if (config != null) {
            parcel.writeInt(1);
            config.writeToParcel(parcel, i);
            return;
        }
        int i3 = MediaDescriptionCompat + 123;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.writeInt(0);
        int i5 = MediaDescriptionCompat + 55;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof InAppCameraOverlayItem$Instruction) {
            InAppCameraOverlayItem$Instruction inAppCameraOverlayItem$Instruction = (InAppCameraOverlayItem$Instruction) obj;
            if (this.serializer == inAppCameraOverlayItem$Instruction.serializer) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, inAppCameraOverlayItem$Instruction.write}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, inAppCameraOverlayItem$Instruction.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
            }
            int i2 = MediaDescriptionCompat + 39;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = MediaDescriptionCompat + 79;
        int i5 = i4 % Fields.SpotShadowColor;
        RatingCompat = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 1;
        MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
