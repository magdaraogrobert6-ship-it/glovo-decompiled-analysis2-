package com.roadrunner.delivery.inappcamera.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import java.util.Iterator;
import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.component4GVVA2EU;
import o.copye1PVR60;
import o.getCieXyz;
import o.getFontStyle_LCdwA;
import o.getFontSynthesisGVVA2EU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public interface InAppCameraOverlay extends Parcelable {

    public static final class None implements InAppCameraOverlay {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer = 0;
        private static int write = 1;
        public static final None read = new None();
        public static final Parcelable.Creator<None> CREATOR = new getFontStyle_LCdwA();

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = write + 99;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 91;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return 0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = serializer + 33;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 1;
            int i3 = i2 % Fields.SpotShadowColor;
            write = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 43;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return "None";
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = write + 49;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 5;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return 904678184;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = write + 119;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeInt(1);
            int i5 = write + 97;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = write + 9;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof None)) {
                return false;
            }
            int i3 = write + 109;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return true;
        }
    }

    public static final class Structured implements InAppCameraOverlay {
        public static final Parcelable.Creator<Structured> CREATOR = new component4GVVA2EU();
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;
        private static int write = 1;
        public final InAppCameraOverlayState serializer;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = read + 5;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 45;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = IconCompatParcelizer + 29;
            write = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public Structured(InAppCameraOverlayState inAppCameraOverlayState) {
            inAppCameraOverlayState.getClass();
            this.serializer = inAppCameraOverlayState;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 95;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.serializer.hashCode();
            int i4 = RemoteActionCompatParcelizer + 21;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 32 / 0;
            }
            return iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = read + 3;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            this.serializer.writeToParcel(parcel, i);
            int i5 = read + 73;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "Structured(state=" + this.serializer + ")";
            int i2 = read + 23;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Structured) {
                Object[] objArr = {this.serializer, ((Structured) obj).serializer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = RemoteActionCompatParcelizer + 73;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = read + 31;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
    }

    public static final class TagItem implements Parcelable {
        public static final Parcelable.Creator<TagItem> CREATOR = new copye1PVR60();
        private static int IconCompatParcelizer = 0;
        private static int MediaDescriptionCompat = 1;
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;
        public final String read;
        public final Integer write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 79;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = serializer + 11;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public TagItem(String str, Integer num) {
            str.getClass();
            this.read = str;
            this.write = num;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int iHashCode2 = this.read.hashCode();
            Integer num = this.write;
            if (num == null) {
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 107;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i2 + 57;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
            }
            int i7 = (iHashCode2 * 31) + iHashCode;
            int i8 = IconCompatParcelizer + 73;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return i7;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 121;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.read);
            Integer num = this.write;
            if (num != null) {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            } else {
                int i5 = MediaDescriptionCompat + 87;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            }
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "TagItem(text=" + this.read + ", icon=" + this.write + ")";
            int i2 = MediaDescriptionCompat + 85;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 68 / 0;
            }
            return str;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TagItem)) {
                return false;
            }
            TagItem tagItem = (TagItem) obj;
            Object[] objArr = {this.read, tagItem.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.write, tagItem.write};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    int i2 = MediaDescriptionCompat + 49;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
                int i3 = MediaDescriptionCompat;
                int i4 = i3 + 3;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                int i6 = i3 + 75;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return false;
            }
            int i8 = IconCompatParcelizer + 111;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                return false;
            }
            throw null;
        }
    }

    public static final class Tags implements InAppCameraOverlay {
        public static final Parcelable.Creator<Tags> CREATOR = new getFontSynthesisGVVA2EU();
        private static int MediaDescriptionCompat = 0;
        private static int MediaMetadataCompat = 1;
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;
        public final Integer IconCompatParcelizer;
        public final String read;
        public final List write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = MediaDescriptionCompat + 85;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaMetadataCompat = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 43;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 33 / 0;
            }
            return 0;
        }

        static {
            int i = RemoteActionCompatParcelizer + 69;
            serializer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public Tags(Integer num, String str, List list) {
            this.IconCompatParcelizer = num;
            this.read = str;
            this.write = list;
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder("Tags(icon=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", title=");
            sb.append(this.read);
            sb.append(", tags=");
            String str = MediaSessionCompatQueueItem.read(sb, this.write, ")");
            int i2 = MediaDescriptionCompat + 113;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }

        public final int hashCode() {
            int iHashCode;
            int iHashCode2;
            int i = 2 % 2;
            Integer num = this.IconCompatParcelizer;
            if (num == null) {
                iHashCode = 0;
            } else {
                iHashCode = num.hashCode();
                int i2 = MediaDescriptionCompat + 113;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            String str = this.read;
            if (str == null) {
                int i4 = MediaMetadataCompat;
                int i5 = i4 + 113;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                int i7 = i4 + 13;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    int i8 = 3 % 4;
                }
                iHashCode2 = 0;
            } else {
                iHashCode2 = str.hashCode();
            }
            List list = this.write;
            return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Tags) {
                Tags tags = (Tags) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, tags.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, tags.read}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, tags.write}, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i2 = MediaMetadataCompat + 47;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                return i2 % 2 != 0;
            }
            int i3 = MediaMetadataCompat + 117;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            parcel.getClass();
            Integer num = this.IconCompatParcelizer;
            if (num == null) {
                int i3 = MediaDescriptionCompat + 81;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            parcel.writeString(this.read);
            List list = this.write;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((TagItem) it.next()).writeToParcel(parcel, i);
                int i5 = MediaMetadataCompat + 57;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
    }
}
