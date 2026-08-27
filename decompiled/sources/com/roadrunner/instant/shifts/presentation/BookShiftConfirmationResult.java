package com.roadrunner.instant.shifts.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.saveOldPosition;
import o.setScrapContainer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BookShiftConfirmationResult implements Parcelable {

    public static final class ShiftBookedSuccessfully extends BookShiftConfirmationResult {
        public static final Parcelable.Creator<ShiftBookedSuccessfully> CREATOR = new saveOldPosition();
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;
        private static int write = 1;
        public final String serializer;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 3;
            int i3 = i2 % Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = read + 93;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public final String write() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 115;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.serializer;
            int i5 = i2 + 101;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i6 = 11 / 0;
            }
            return str;
        }

        public ShiftBookedSuccessfully(String str) {
            str.getClass();
            this.serializer = str;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = write + 17;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.serializer.hashCode();
            int i4 = write + 7;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = write + 11;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.serializer);
            int i5 = write + 25;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 125;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return ff$$ExternalSyntheticOutline0.m("ShiftBookedSuccessfully(successMessage=", this.serializer, ")");
            }
            int i3 = 3 / 0;
            return ff$$ExternalSyntheticOutline0.m("ShiftBookedSuccessfully(successMessage=", this.serializer, ")");
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IconCompatParcelizer + 41;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof ShiftBookedSuccessfully)) {
                return false;
            }
            Object[] objArr = {this.serializer, ((ShiftBookedSuccessfully) obj).serializer};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i4 = write + 45;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 19 / 0;
                }
                return true;
            }
            int i6 = IconCompatParcelizer + 3;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
    }

    public static final class ShiftBookingFailed extends BookShiftConfirmationResult {
        public static final Parcelable.Creator<ShiftBookingFailed> CREATOR = new setScrapContainer();
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 1;
        private static int write;
        public final String read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = write + 125;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 49;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        static {
            int i = serializer + 23;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public final String IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = write + 35;
            int i3 = i2 % Fields.SpotShadowColor;
            IconCompatParcelizer = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.read;
            int i4 = i3 + 107;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return str;
        }

        public ShiftBookingFailed(String str) {
            str.getClass();
            this.read = str;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 37;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.read.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.read.hashCode();
            int i3 = write + 55;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 0 / 0;
            }
            return iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = write + 9;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.read);
            int i5 = write + 45;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = write + 39;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String strM = ff$$ExternalSyntheticOutline0.m("ShiftBookingFailed(errorMessage=", this.read, ")");
            int i4 = IconCompatParcelizer + 41;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return strM;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 71;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (this != obj) {
                if (!(obj instanceof ShiftBookingFailed)) {
                    return false;
                }
                Object[] objArr = {this.read, ((ShiftBookingFailed) obj).read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
                int i5 = write + 99;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return false;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            int i6 = i2 + 41;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
    }
}
