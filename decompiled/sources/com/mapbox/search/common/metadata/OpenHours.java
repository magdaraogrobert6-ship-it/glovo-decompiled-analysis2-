package com.mapbox.search.common.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OpenHours implements Parcelable {

    public static final class AlwaysOpen extends OpenHours {
        public static final AlwaysOpen INSTANCE = new AlwaysOpen();
        public static final Parcelable.Creator<AlwaysOpen> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AlwaysOpen[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return AlwaysOpen.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class PermanentlyClosed extends OpenHours {
        public static final PermanentlyClosed INSTANCE = new PermanentlyClosed();
        public static final Parcelable.Creator<PermanentlyClosed> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PermanentlyClosed[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return PermanentlyClosed.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Scheduled extends OpenHours {
        public static final Parcelable.Creator<Scheduled> CREATOR = new Creator();
        public final String note;
        public final ArrayList periods;
        public final List weekdayText;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Scheduled[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(OpenPeriod.CREATOR.createFromParcel(parcel));
                }
                return new Scheduled(arrayList, parcel.createStringArrayList(), parcel.readString());
            }
        }

        public final int hashCode() {
            return Objects.hash(this.periods, this.weekdayText, this.note);
        }

        public Scheduled(ArrayList arrayList, List list, String str) {
            this.periods = arrayList;
            this.weekdayText = list;
            this.note = str;
            if (arrayList.isEmpty()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("List of time periods should not be empty!");
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            ArrayList arrayList = this.periods;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OpenPeriod) it.next()).writeToParcel(parcel, i);
            }
            parcel.writeStringList(this.weekdayText);
            parcel.writeString(this.note);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Scheduled(periods=");
            sb.append(this.periods);
            sb.append(", weekdayText=");
            sb.append(this.weekdayText);
            sb.append(", note=");
            return ff$$ExternalSyntheticOutline0.m(sb, this.note, ')');
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Scheduled.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            Scheduled scheduled = (Scheduled) obj;
            if (!this.periods.equals(scheduled.periods)) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.weekdayText, scheduled.weekdayText}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.note, scheduled.note}, getCieXyz.write())).booleanValue();
        }
    }

    public static final class TemporaryClosed extends OpenHours {
        public static final TemporaryClosed INSTANCE = new TemporaryClosed();
        public static final Parcelable.Creator<TemporaryClosed> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TemporaryClosed[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return TemporaryClosed.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
