package com.mapbox.search.result;

import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ResultAccuracy implements Parcelable {

    public static final class Approximate extends ResultAccuracy {
        public static final Approximate INSTANCE = new Approximate();
        public static final Parcelable.Creator<Approximate> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Approximate[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Approximate.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Interpolated extends ResultAccuracy {
        public static final Interpolated INSTANCE = new Interpolated();
        public static final Parcelable.Creator<Interpolated> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Interpolated[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Interpolated.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Intersection extends ResultAccuracy {
        public static final Intersection INSTANCE = new Intersection();
        public static final Parcelable.Creator<Intersection> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intersection[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Intersection.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Parcel extends ResultAccuracy {
        public static final Parcel INSTANCE = new Parcel();
        public static final Parcelable.Creator<Parcel> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Parcel[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Parcel.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Point extends ResultAccuracy {
        public static final Point INSTANCE = new Point();
        public static final Parcelable.Creator<Point> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Point[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Point.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Proximate extends ResultAccuracy {
        public static final Proximate INSTANCE = new Proximate();
        public static final Parcelable.Creator<Proximate> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Proximate[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Proximate.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Rooftop extends ResultAccuracy {
        public static final Rooftop INSTANCE = new Rooftop();
        public static final Parcelable.Creator<Rooftop> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rooftop[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Rooftop.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Street extends ResultAccuracy {
        public static final Street INSTANCE = new Street();
        public static final Parcelable.Creator<Street> CREATOR = new Creator();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Street[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(android.os.Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Street.INSTANCE;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
