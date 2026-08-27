package com.roadrunner.startworking.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import o.changeUserlambda11;
import o.changeUserlambda15;
import o.clearEndpointProvider;
import o.closeSessionlambda0;
import o.closeSessionlambda1;
import o.closeSessionlambda2;
import o.getCieXyz;
import o.onServiceConnected;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StartWorkingNavAction implements Parcelable {

    public static final class BecomeAvailable extends StartWorkingNavAction {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;
        private static int write = 1;
        public static final BecomeAvailable read = new BecomeAvailable();
        public static final Parcelable.Creator<BecomeAvailable> CREATOR = new changeUserlambda11();

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 63;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = RemoteActionCompatParcelizer + 31;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = write + 13;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                parcel.getClass();
                i2 = 0;
            } else {
                parcel.getClass();
                i2 = 1;
            }
            parcel.writeInt(i2);
            int i5 = IconCompatParcelizer + 57;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }

    public static final class StartExistingShift extends StartWorkingNavAction {
        public static final Parcelable.Creator<StartExistingShift> CREATOR = new changeUserlambda15();
        private static int IconCompatParcelizer = 1;
        private static int MediaBrowserCompatMediaItem = 1;
        private static int serializer;
        private static int write;
        public final String RemoteActionCompatParcelizer;
        public final String read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = serializer + 117;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 77;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = write + 21;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public StartExistingShift(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.RemoteActionCompatParcelizer = str;
            this.read = str2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = MediaBrowserCompatMediaItem + 75;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                parcel.getClass();
                parcel.writeString(this.RemoteActionCompatParcelizer);
                parcel.writeString(this.read);
            } else {
                parcel.getClass();
                parcel.writeString(this.RemoteActionCompatParcelizer);
                parcel.writeString(this.read);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = serializer + 3;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                String strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StartExistingShift(shiftDuration=", this.RemoteActionCompatParcelizer, ", area=", this.read, ")");
                int i3 = serializer + 37;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 34 / 0;
                }
                return strWrite;
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("StartExistingShift(shiftDuration=", this.RemoteActionCompatParcelizer, ", area=", this.read, ")");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = serializer + 125;
            MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
            int i4 = serializer + 47;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = serializer + 101;
                MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return true;
                }
                throw null;
            }
            if (!(obj instanceof StartExistingShift)) {
                return false;
            }
            StartExistingShift startExistingShift = (StartExistingShift) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, startExistingShift.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, startExistingShift.read}, getCieXyz.write())).booleanValue())) {
                    return true;
                }
                int i3 = serializer + 99;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                return i3 % 2 == 0;
            }
            int i4 = serializer + 31;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
    }

    public static final class StartExistingShiftInsideStartingArea extends StartWorkingNavAction {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 1;
        private static int write;
        public static final StartExistingShiftInsideStartingArea serializer = new StartExistingShiftInsideStartingArea();
        public static final Parcelable.Creator<StartExistingShiftInsideStartingArea> CREATOR = new closeSessionlambda2();

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 113;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 41;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        static {
            int i = IconCompatParcelizer + 63;
            read = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i2 = 75 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = write + 41;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeInt(1);
            int i5 = RemoteActionCompatParcelizer + 103;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 91 / 0;
            }
        }
    }

    public static final class StartInstantShift extends StartWorkingNavAction {
        public static final Parcelable.Creator<StartInstantShift> CREATOR = new closeSessionlambda1();
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int serializer = 1;
        private static int write;
        public final int read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 3;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 55;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = serializer + 77;
            write = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public StartInstantShift(int i) {
            this.read = i;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                iHashCode = Integer.hashCode(this.read);
                int i3 = 32 / 0;
            } else {
                iHashCode = Integer.hashCode(this.read);
            }
            int i4 = RemoteActionCompatParcelizer + 71;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 73;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeInt(this.read);
            int i5 = RemoteActionCompatParcelizer + 45;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 89;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                String strM = d$$ExternalSyntheticOutline0.m(this.read, "StartInstantShift(shiftId=", ")");
                int i3 = RemoteActionCompatParcelizer + 87;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return strM;
            }
            d$$ExternalSyntheticOutline0.m(this.read, "StartInstantShift(shiftId=", ")");
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 35;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            if (i2 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof StartInstantShift) {
                return this.read == ((StartInstantShift) obj).read;
            }
            int i4 = i3 + 109;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            return i4 % 2 != 0;
        }
    }

    public static final class StartOnDemand extends StartWorkingNavAction {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;
        private static int write;
        public static final StartOnDemand serializer = new StartOnDemand();
        public static final Parcelable.Creator<StartOnDemand> CREATOR = new closeSessionlambda0();

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 73;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 73;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = read + 125;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = RemoteActionCompatParcelizer + 69;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                parcel.getClass();
                i2 = 0;
            } else {
                parcel.getClass();
                i2 = 1;
            }
            parcel.writeInt(i2);
        }
    }

    public static final class StartWorkNow extends StartWorkingNavAction {
        public static final Parcelable.Creator<StartWorkNow> CREATOR = new clearEndpointProvider();
        private static int IconCompatParcelizer = 0;
        private static int RatingCompat = 1;
        private static int read = 1;
        private static int serializer;
        public final onServiceConnected RemoteActionCompatParcelizer;
        public final String write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 93;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return 0;
        }

        static {
            int i = read + 67;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 71 / 0;
            }
        }

        public StartWorkNow(String str, onServiceConnected onserviceconnected) {
            str.getClass();
            onserviceconnected.getClass();
            this.write = str;
            this.RemoteActionCompatParcelizer = onserviceconnected;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 119;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.RemoteActionCompatParcelizer.hashCode() + (this.write.hashCode() * 31);
            int i4 = IconCompatParcelizer + 103;
            RatingCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = IconCompatParcelizer + 15;
            RatingCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                parcel.getClass();
                parcel.writeString(this.write);
                parcel.writeString(this.RemoteActionCompatParcelizer.name());
            } else {
                parcel.getClass();
                parcel.writeString(this.write);
                parcel.writeString(this.RemoteActionCompatParcelizer.name());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (!(obj instanceof StartWorkNow)) {
                    return false;
                }
                StartWorkNow startWorkNow = (StartWorkNow) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, startWorkNow.write}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.RemoteActionCompatParcelizer == startWorkNow.RemoteActionCompatParcelizer) {
                    return true;
                }
                int i2 = RatingCompat + 59;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RatingCompat;
            int i5 = i4 + 119;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 101;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            String str = "StartWorkNow(opportunityId=" + this.write + ", type=" + this.RemoteActionCompatParcelizer + ")";
            int i2 = RatingCompat + 27;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }
    }
}
