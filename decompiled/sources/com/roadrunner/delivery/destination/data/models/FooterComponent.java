package com.roadrunner.delivery.destination.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.accessgetW500cp;
import o.accessgetW600cp;
import o.accessgetW800cp;
import o.getAppropriateFullView;
import o.getCieXyz;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class FooterComponent implements Parcelable {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public static final Companion Companion = new Companion();
    public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(26));

    @Serializable
    @getAppropriateFullView(serializer = "arrival")
    public static final class Arrival extends FooterComponent implements Parcelable {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 0;
        private static int write = 1;
        public final ArrivalDetails arrivalDetails;
        public final String text;
        public final String title;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Arrival> CREATOR = new accessgetW500cp();

        @Serializable
        public static final class ArrivalDetails implements Parcelable {
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 1;
            private static int serializer;
            public final Data data;
            public final String url;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<ArrivalDetails> CREATOR = new accessgetW600cp();

            public static final class Companion {
                private static int IconCompatParcelizer = 0;
                private static int write = 1;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = IconCompatParcelizer + 115;
                    write = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    FooterComponent$Arrival$ArrivalDetails$$serializer footerComponent$Arrival$ArrivalDetails$$serializer = FooterComponent$Arrival$ArrivalDetails$$serializer.RemoteActionCompatParcelizer;
                    int i4 = write + 73;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return footerComponent$Arrival$ArrivalDetails$$serializer;
                    }
                    throw null;
                }
            }

            @Serializable
            public static final class Data implements Parcelable {
                private static int IconCompatParcelizer = 0;
                private static int RemoteActionCompatParcelizer = 1;
                private static int read = 0;
                private static int write = 1;
                public final String action;
                public final List deliveryIds;
                public final String stackId;
                public static final Companion Companion = new Companion();
                public static final Parcelable.Creator<Data> CREATOR = new accessgetW800cp();
                public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(27)), null};

                public static final class Companion {
                    private static int IconCompatParcelizer = 0;
                    private static int RemoteActionCompatParcelizer = 1;

                    public final setGraphicModalMaxWidthDp serializer() {
                        int i = 2 % 2;
                        int i2 = RemoteActionCompatParcelizer + 9;
                        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            FooterComponent$Arrival$ArrivalDetails$Data$$serializer footerComponent$Arrival$ArrivalDetails$Data$$serializer = FooterComponent$Arrival$ArrivalDetails$Data$$serializer.read;
                            throw null;
                        }
                        FooterComponent$Arrival$ArrivalDetails$Data$$serializer footerComponent$Arrival$ArrivalDetails$Data$$serializer2 = FooterComponent$Arrival$ArrivalDetails$Data$$serializer.read;
                        int i3 = RemoteActionCompatParcelizer + 49;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            int i4 = 74 / 0;
                        }
                        return footerComponent$Arrival$ArrivalDetails$Data$$serializer2;
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = IconCompatParcelizer + 9;
                    write = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return 0;
                }

                static {
                    int i = RemoteActionCompatParcelizer + 45;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 != 0) {
                        int i2 = 35 / 0;
                    }
                }

                public /* synthetic */ Data(int i, String str, String str2, List list) {
                    Object obj = null;
                    if (3 == (i & 3)) {
                        this.action = str;
                        this.deliveryIds = list;
                        if ((i & 4) == 0) {
                            this.stackId = null;
                            int i2 = IconCompatParcelizer + 95;
                            write = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                return;
                            }
                            obj.hashCode();
                            throw null;
                        }
                        this.stackId = str2;
                        int i3 = IconCompatParcelizer + 45;
                        write = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 == 0) {
                            throw null;
                        }
                        return;
                    }
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FooterComponent$Arrival$ArrivalDetails$Data$$serializer.read.getDescriptor());
                    throw null;
                }

                public final String toString() {
                    int i = 2 % 2;
                    int i2 = write + 39;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        String strM = ff$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Data(action=", this.action, ", deliveryIds=", this.deliveryIds, ", stackId="), this.stackId, ")");
                        int i3 = write + 27;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                        return strM;
                    }
                    ff$$ExternalSyntheticOutline0.m(r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer("Data(action=", this.action, ", deliveryIds=", this.deliveryIds, ", stackId="), this.stackId, ")");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final int hashCode() {
                    int iHashCode;
                    int i = 2 % 2;
                    int iM = c8$$ExternalSyntheticOutline0.m(this.deliveryIds, this.action.hashCode() * 31, 31);
                    String str = this.stackId;
                    if (str == null) {
                        int i2 = IconCompatParcelizer + 9;
                        write = i2 % Fields.SpotShadowColor;
                        iHashCode = i2 % 2 == 0 ? 1 : 0;
                    } else {
                        iHashCode = str.hashCode();
                        int i3 = write + 29;
                        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                        int i4 = i3 % 2;
                    }
                    int i5 = iM + iHashCode;
                    int i6 = write + 37;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        int i7 = 76 / 0;
                    }
                    return i5;
                }

                public Data(String str, String str2, ArrayList arrayList) {
                    str.getClass();
                    this.action = str;
                    this.deliveryIds = arrayList;
                    this.stackId = str2;
                }

                public final boolean equals(Object obj) {
                    int i = 2 % 2;
                    int i2 = IconCompatParcelizer + 53;
                    int i3 = i2 % Fields.SpotShadowColor;
                    write = i3;
                    Object obj2 = null;
                    if (i2 % 2 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Data)) {
                        int i4 = i3 + 77;
                        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                        return i4 % 2 != 0;
                    }
                    Data data = (Data) obj;
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.action, data.action}, getCieXyz.write())).booleanValue()) {
                        int i5 = write + 121;
                        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 == 0) {
                            return false;
                        }
                        throw null;
                    }
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryIds, data.deliveryIds}, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.stackId, data.stackId}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i6 = write + 121;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return false;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    int i2 = 2 % 2;
                    int i3 = write + 77;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        parcel.getClass();
                        parcel.writeString(this.action);
                        List list = this.deliveryIds;
                        parcel.writeInt(list.size());
                        list.iterator();
                        throw null;
                    }
                    parcel.getClass();
                    parcel.writeString(this.action);
                    List list2 = this.deliveryIds;
                    parcel.writeInt(list2.size());
                    Iterator it = list2.iterator();
                    int i4 = IconCompatParcelizer + 13;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    while (it.hasNext()) {
                        parcel.writeLong(((Number) it.next()).longValue());
                    }
                    parcel.writeString(this.stackId);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = read + 3;
                int i3 = i2 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 35;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return 0;
            }

            static {
                int i = IconCompatParcelizer + 87;
                serializer = i % Fields.SpotShadowColor;
                int i2 = i % 2;
            }

            public /* synthetic */ ArrivalDetails(int i, String str, Data data) {
                if (3 == (i & 3)) {
                    this.url = str;
                    this.data = data;
                } else {
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, FooterComponent$Arrival$ArrivalDetails$$serializer.RemoteActionCompatParcelizer.getDescriptor());
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = RemoteActionCompatParcelizer + 1;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    parcel.getClass();
                    parcel.writeString(this.url);
                    this.data.writeToParcel(parcel, i);
                    int i4 = 25 / 0;
                } else {
                    parcel.getClass();
                    parcel.writeString(this.url);
                    this.data.writeToParcel(parcel, i);
                }
                int i5 = read + 45;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 39;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iHashCode = this.data.hashCode() + (this.url.hashCode() * 31);
                int i4 = read + 27;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public ArrivalDetails(String str, Data data) {
                str.getClass();
                data.getClass();
                this.url = str;
                this.data = data;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "ArrivalDetails(url=" + this.url + ", data=" + this.data + ")";
                int i2 = read + 89;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return str;
            }

            public final boolean equals(Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = read + 33;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return true;
                }
                if (!(obj instanceof ArrivalDetails)) {
                    return false;
                }
                ArrivalDetails arrivalDetails = (ArrivalDetails) obj;
                Object[] objArr = {this.url, arrivalDetails.url};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {this.data, arrivalDetails.data};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i4 = RemoteActionCompatParcelizer + 95;
                    read = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    return false;
                }
                int i6 = read;
                int i7 = i6 + 93;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                int i9 = i6 + 101;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    return false;
                }
                throw null;
            }
        }

        public static final class Companion {
            private static int serializer = 1;
            private static int write;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = write + 61;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return FooterComponent$Arrival$$serializer.write;
                }
                int i3 = 23 / 0;
                return FooterComponent$Arrival$$serializer.write;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 33;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2 == 0 ? 1 : 0;
            int i5 = i2 + 85;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return i4;
            }
            throw null;
        }

        static {
            int i = write + 3;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i2 = 34 / 0;
            }
        }

        public /* synthetic */ Arrival(int i, String str, String str2, ArrivalDetails arrivalDetails) {
            if (7 == (i & 7)) {
                this.title = str;
                this.text = str2;
                this.arrivalDetails = arrivalDetails;
                return;
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, FooterComponent$Arrival$$serializer.write.getDescriptor());
            throw null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = read + 115;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            this.arrivalDetails.writeToParcel(parcel, i);
            int i5 = read + 89;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = read + 115;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.arrivalDetails.hashCode() + af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.text);
            int i4 = RemoteActionCompatParcelizer + 35;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public Arrival(String str, String str2, ArrivalDetails arrivalDetails) {
            str.getClass();
            str2.getClass();
            arrivalDetails.getClass();
            this.title = str;
            this.text = str2;
            this.arrivalDetails = arrivalDetails;
        }

        public final String toString() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 107;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("Arrival(title=", this.title, ", text=", this.text, ", arrivalDetails=");
            sbM.append(this.arrivalDetails);
            sbM.append(")");
            String string = sbM.toString();
            int i4 = read + 93;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return string;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Arrival) {
                Arrival arrival = (Arrival) obj;
                Object[] objArr = {this.title, arrival.title};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    Object[] objArr2 = {this.text, arrival.text};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                        return false;
                    }
                    Object[] objArr3 = {this.arrivalDetails, arrival.arrivalDetails};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        int i2 = read + 113;
                        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    int i4 = RemoteActionCompatParcelizer + 85;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
                int i5 = RemoteActionCompatParcelizer + 57;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = RemoteActionCompatParcelizer + 45;
            int i8 = i7 % Fields.SpotShadowColor;
            read = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 15;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            return false;
        }
    }

    @Serializable
    public static final class Unknown extends FooterComponent {
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 0;
        private static int serializer = 1;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

        public static final class Companion {
            private static int RemoteActionCompatParcelizer = 0;
            private static int serializer = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = serializer + 91;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                FooterComponent$Unknown$$serializer footerComponent$Unknown$$serializer = FooterComponent$Unknown$$serializer.IconCompatParcelizer;
                int i4 = RemoteActionCompatParcelizer + 123;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return footerComponent$Unknown$$serializer;
            }
        }

        public final class Creator implements Parcelable.Creator {
            private static int RemoteActionCompatParcelizer = 1;
            private static int write;

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = write;
                int i4 = i3 + 77;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                Unknown[] unknownArr = new Unknown[i];
                int i6 = i3 + 65;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return unknownArr;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                parcel.getClass();
                parcel.readInt();
                Unknown unknown = new Unknown();
                int i2 = write + 35;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return unknown;
                }
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 55;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 113;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = IconCompatParcelizer + 1;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = read + 31;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    static {
        int i = read + 41;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 107;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) FooterComponent.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
            int i4 = IconCompatParcelizer + 69;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return setgraphicmodalmaxwidthdp;
        }
    }
}
