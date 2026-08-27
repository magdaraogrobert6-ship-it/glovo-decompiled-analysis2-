package com.roadrunner.delivery.destination.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import com.roadrunner.delivery.errorhandler.StateV3Response$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.LoadedFontFamily;
import o.NamedFontLoader;
import o.PlatformFontLoader;
import o.PlatformFontVariationSettings_androidKt;
import o.getAppropriateFullView;
import o.getCieXyz;
import o.getMediumannotations;
import o.instance_delegatelambda0;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;
import o.toAndroidArray;
import o.toAndroidStringlambda0;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
@getAppropriateFullView(serializer = "map")
public final class ScrollableComponent$Map extends getMediumannotations implements Parcelable {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int serializer;
    public final List components;
    public final DestinationLocation destinationLocation;
    public final boolean enablePinConnections;
    public final String expandMapCaption;
    public final List pins;
    public final boolean riderLocationEnabled;
    public final String style;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ScrollableComponent$Map> CREATOR = new SearchResult.Creator(11);

    public static final class Companion {
        private static int read = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 35;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ScrollableComponent$Map$$serializer scrollableComponent$Map$$serializer = ScrollableComponent$Map$$serializer.serializer;
            int i4 = read + 33;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return scrollableComponent$Map$$serializer;
            }
            throw null;
        }
    }

    @Serializable
    public static abstract class MapComponent implements Parcelable {
        private static int read = 1;
        private static int serializer;
        public static final Companion Companion = new Companion();
        public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(16));

        @Serializable
        @getAppropriateFullView(serializer = "navigation")
        public static final class Navigation extends MapComponent implements Parcelable {
            private static int IconCompatParcelizer = 1;
            private static int read = 0;
            private static int serializer = 1;
            private static int write;
            public final String actionTitle;
            public final List destinations;
            public final String title;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<Navigation> CREATOR = new PlatformFontVariationSettings_androidKt();
            public static final onViewDetachedFromWindowlambda1[] $childSerializers = {LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(17)), null, null};

            public static final class Companion {
                private static int read = 1;
                private static int write;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = write + 109;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        ScrollableComponent$Map$MapComponent$Navigation$$serializer scrollableComponent$Map$MapComponent$Navigation$$serializer = ScrollableComponent$Map$MapComponent$Navigation$$serializer.RemoteActionCompatParcelizer;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ScrollableComponent$Map$MapComponent$Navigation$$serializer scrollableComponent$Map$MapComponent$Navigation$$serializer2 = ScrollableComponent$Map$MapComponent$Navigation$$serializer.RemoteActionCompatParcelizer;
                    int i3 = read + 119;
                    write = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return scrollableComponent$Map$MapComponent$Navigation$$serializer2;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = serializer;
                int i3 = i2 + 107;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i2 + 45;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return 0;
                }
                throw null;
            }

            static {
                Object obj = null;
                int i = IconCompatParcelizer + 101;
                read = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public /* synthetic */ Navigation(int i, String str, String str2, List list) {
                Object obj = null;
                if (1 == (i & 1)) {
                    this.destinations = list;
                    if ((i & 2) == 0) {
                        this.title = "";
                    } else {
                        this.title = str;
                    }
                    if ((i & 4) != 0) {
                        this.actionTitle = str2;
                        int i2 = serializer + 89;
                        write = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return;
                    }
                    int i4 = serializer + 17;
                    write = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        this.actionTitle = "";
                        obj.hashCode();
                        throw null;
                    }
                    this.actionTitle = "";
                    return;
                }
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ScrollableComponent$Map$MapComponent$Navigation$$serializer.RemoteActionCompatParcelizer.getDescriptor());
                throw null;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = serializer + 91;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iHashCode = this.actionTitle.hashCode() + af$$ExternalSyntheticOutline0.m(this.destinations.hashCode() * 31, 31, this.title);
                int i4 = serializer + 81;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final String toString() {
                int i = 2 % 2;
                StringBuilder sb = new StringBuilder("Navigation(destinations=");
                sb.append(this.destinations);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", actionTitle=");
                String strM = ff$$ExternalSyntheticOutline0.m(sb, this.actionTitle, ")");
                int i2 = serializer + 39;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return strM;
            }

            public Navigation(String str, String str2, ArrayList arrayList) {
                str.getClass();
                str2.getClass();
                this.destinations = arrayList;
                this.title = str;
                this.actionTitle = str2;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                parcel.getClass();
                List list = this.destinations;
                parcel.writeInt(list.size());
                Iterator it = list.iterator();
                while (!(!it.hasNext())) {
                    int i3 = write + 33;
                    serializer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    ((NavigationDestination) it.next()).writeToParcel(parcel, i);
                }
                parcel.writeString(this.title);
                parcel.writeString(this.actionTitle);
                int i5 = serializer + 3;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }

            public final boolean equals(Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Navigation)) {
                    return false;
                }
                Navigation navigation = (Navigation) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destinations, navigation.destinations}, getCieXyz.write())).booleanValue()) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, navigation.title}, getCieXyz.write())).booleanValue()) {
                        int i2 = write + 117;
                        serializer = i2 % Fields.SpotShadowColor;
                        return i2 % 2 == 0;
                    }
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.actionTitle, navigation.actionTitle}, getCieXyz.write())).booleanValue();
                }
                int i3 = serializer + 31;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
        }

        @Serializable
        public static final class Unknown extends MapComponent {
            private static int RemoteActionCompatParcelizer = 1;
            private static int read = 0;
            private static int serializer = 1;
            private static int write;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<Unknown> CREATOR = new Creator();

            public static final class Companion {
                private static int IconCompatParcelizer = 0;
                private static int serializer = 1;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = IconCompatParcelizer + 109;
                    serializer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        ScrollableComponent$Map$MapComponent$Unknown$$serializer scrollableComponent$Map$MapComponent$Unknown$$serializer = ScrollableComponent$Map$MapComponent$Unknown$$serializer.serializer;
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ScrollableComponent$Map$MapComponent$Unknown$$serializer scrollableComponent$Map$MapComponent$Unknown$$serializer2 = ScrollableComponent$Map$MapComponent$Unknown$$serializer.serializer;
                    int i3 = serializer + 33;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    return scrollableComponent$Map$MapComponent$Unknown$$serializer2;
                }
            }

            public final class Creator implements Parcelable.Creator {
                private static int read = 0;
                private static int write = 1;

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = read;
                    int i4 = i3 + 13;
                    write = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    Unknown[] unknownArr = new Unknown[i];
                    int i6 = i3 + 55;
                    write = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return unknownArr;
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    parcel.getClass();
                    parcel.readInt();
                    Unknown unknown = new Unknown();
                    int i2 = read + 71;
                    write = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return unknown;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer;
                int i3 = i2 + 87;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i2 + 17;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 63 / 0;
                }
                return 0;
            }

            static {
                int i = serializer + 79;
                write = i % Fields.SpotShadowColor;
                int i2 = i % 2;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2;
                int i3 = 2 % 2;
                int i4 = read + 83;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    parcel.getClass();
                    i2 = 0;
                } else {
                    parcel.getClass();
                    i2 = 1;
                }
                parcel.writeInt(i2);
            }
        }

        static {
            int i = read + 13;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static final class Companion {
            private static int IconCompatParcelizer = 0;
            private static int serializer = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 73;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    throw null;
                }
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) MapComponent.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
                int i3 = IconCompatParcelizer + 77;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return setgraphicmodalmaxwidthdp;
            }
        }
    }

    @Serializable
    public static abstract class PinComponent implements Parcelable {
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;
        public static final Companion Companion = new Companion();
        public static final onViewDetachedFromWindowlambda1 $cachedSerializer$delegate = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3Response$$ExternalSyntheticLambda0(18));

        @Serializable
        @getAppropriateFullView(serializer = "customer")
        public static final class CustomerPin extends PinComponent implements Parcelable {
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 0;
            private static int serializer = 1;
            public final Location address;
            public final boolean highlighted;
            public final int order;
            public final String style;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<CustomerPin> CREATOR = new NamedFontLoader();

            public static final class Companion {
                private static int IconCompatParcelizer = 1;
                private static int read;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = read + 83;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        ScrollableComponent$Map$PinComponent$CustomerPin$$serializer scrollableComponent$Map$PinComponent$CustomerPin$$serializer = ScrollableComponent$Map$PinComponent$CustomerPin$$serializer.read;
                        throw null;
                    }
                    ScrollableComponent$Map$PinComponent$CustomerPin$$serializer scrollableComponent$Map$PinComponent$CustomerPin$$serializer2 = ScrollableComponent$Map$PinComponent$CustomerPin$$serializer.read;
                    int i3 = IconCompatParcelizer + 75;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        return scrollableComponent$Map$PinComponent$CustomerPin$$serializer2;
                    }
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 85;
                int i3 = i2 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 51;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return 0;
            }

            static {
                int i = read + 21;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0028  */
            /* JADX WARN: Code duplicated, block: B:14:0x003d  */
            /* JADX WARN: Code duplicated, block: B:17:0x0043  */
            /* JADX WARN: Code duplicated, block: B:19:0x0051  */
            public /* synthetic */ CustomerPin(int i, Location location, boolean z, int i2, String str) {
                if (1 != (i & 1)) {
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ScrollableComponent$Map$PinComponent$CustomerPin$$serializer.read.getDescriptor());
                    throw null;
                }
                this.address = location;
                if ((i & 2) == 0) {
                    this.highlighted = false;
                    int i3 = RemoteActionCompatParcelizer + 113;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        int i4 = 4 / 4;
                    }
                    if ((i & 4) == 0) {
                        int i5 = RemoteActionCompatParcelizer + 7;
                        int i6 = i5 % Fields.SpotShadowColor;
                        IconCompatParcelizer = i6;
                        int i7 = i5 % 2;
                        this.order = 0;
                        int i8 = i6 + 91;
                        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        int i10 = 2 % 2;
                    } else {
                        this.order = i2;
                    }
                    if ((i & 8) == 0) {
                        this.style = str;
                        return;
                    }
                    int i11 = RemoteActionCompatParcelizer + 79;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    this.style = "";
                }
                this.highlighted = z;
                int i13 = 2 % 2;
                if ((i & 4) == 0) {
                    int i14 = RemoteActionCompatParcelizer + 7;
                    int i15 = i14 % Fields.SpotShadowColor;
                    IconCompatParcelizer = i15;
                    int i16 = i14 % 2;
                    this.order = 0;
                    int i17 = i15 + 91;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    int i19 = 2 % 2;
                } else {
                    this.order = i2;
                }
                if ((i & 8) == 0) {
                    this.style = str;
                    return;
                }
                int i110 = RemoteActionCompatParcelizer + 79;
                IconCompatParcelizer = i110 % Fields.SpotShadowColor;
                int i111 = i110 % 2;
                this.style = "";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = RemoteActionCompatParcelizer + 53;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                parcel.getClass();
                this.address.writeToParcel(parcel, i);
                parcel.writeInt(this.highlighted ? 1 : 0);
                parcel.writeInt(this.order);
                parcel.writeString(this.style);
                int i5 = RemoteActionCompatParcelizer + 123;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 39;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
                int i4 = IconCompatParcelizer + 11;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public final boolean equals(Object obj) {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 37;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (this == obj) {
                    int i5 = i2 + 7;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return true;
                }
                if (obj instanceof CustomerPin) {
                    CustomerPin customerPin = (CustomerPin) obj;
                    if ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, customerPin.address}, getCieXyz.write())).booleanValue()) || this.highlighted != customerPin.highlighted) {
                        return false;
                    }
                    if (this.order == customerPin.order) {
                        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, customerPin.style}, getCieXyz.write())).booleanValue();
                    }
                    int i7 = IconCompatParcelizer + 17;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
                int i9 = i2 + 41;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                return i9 % 2 != 0;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "CustomerPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
                int i2 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public CustomerPin(Location location, boolean z, int i, String str) {
                location.getClass();
                str.getClass();
                this.address = location;
                this.highlighted = z;
                this.order = i;
                this.style = str;
            }
        }

        @Serializable
        @getAppropriateFullView(serializer = "entrance")
        public static final class EntrancePin extends PinComponent implements Parcelable {
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            private static int serializer = 1;
            private static int write;
            public final Location address;
            public final boolean highlighted;
            public final int order;
            public final String style;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<EntrancePin> CREATOR = new PlatformFontLoader();

            public static final class Companion {
                private static int read = 0;
                private static int serializer = 1;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = serializer + 13;
                    read = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        return ScrollableComponent$Map$PinComponent$EntrancePin$$serializer.RemoteActionCompatParcelizer;
                    }
                    ScrollableComponent$Map$PinComponent$EntrancePin$$serializer scrollableComponent$Map$PinComponent$EntrancePin$$serializer = ScrollableComponent$Map$PinComponent$EntrancePin$$serializer.RemoteActionCompatParcelizer;
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 75;
                int i3 = i2 % Fields.SpotShadowColor;
                read = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 119;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return 0;
            }

            static {
                int i = serializer + 37;
                write = i % Fields.SpotShadowColor;
                int i2 = i % 2;
            }

            public /* synthetic */ EntrancePin(int i, Location location, boolean z, int i2, String str) {
                if (1 != (i & 1)) {
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ScrollableComponent$Map$PinComponent$EntrancePin$$serializer.RemoteActionCompatParcelizer.getDescriptor());
                    throw null;
                }
                this.address = location;
                if ((i & 2) == 0) {
                    this.highlighted = false;
                } else {
                    this.highlighted = z;
                    int i3 = IconCompatParcelizer + 39;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i4 = 2 % 2;
                    }
                }
                if ((i & 4) == 0) {
                    this.order = 0;
                } else {
                    this.order = i2;
                    int i5 = 2 % 2;
                }
                if ((i & 8) == 0) {
                    int i6 = IconCompatParcelizer + 103;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    this.style = "";
                    return;
                }
                this.style = str;
                int i8 = IconCompatParcelizer + 13;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = IconCompatParcelizer + 75;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    parcel.getClass();
                    this.address.writeToParcel(parcel, i);
                    parcel.writeInt(this.highlighted ? 1 : 0);
                    parcel.writeInt(this.order);
                    parcel.writeString(this.style);
                    return;
                }
                parcel.getClass();
                this.address.writeToParcel(parcel, i);
                parcel.writeInt(this.highlighted ? 1 : 0);
                parcel.writeInt(this.order);
                parcel.writeString(this.style);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = read + 103;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
                int i4 = IconCompatParcelizer + 71;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return iHashCode;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final boolean equals(Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    int i2 = read + 125;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    return i2 % 2 == 0;
                }
                if (!(obj instanceof EntrancePin)) {
                    int i3 = read + 89;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    return i3 % 2 != 0;
                }
                EntrancePin entrancePin = (EntrancePin) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, entrancePin.address}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (this.highlighted != entrancePin.highlighted) {
                    int i4 = IconCompatParcelizer + 1;
                    read = i4 % Fields.SpotShadowColor;
                    return i4 % 2 == 0;
                }
                if (this.order != entrancePin.order) {
                    return false;
                }
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, entrancePin.style}, getCieXyz.write())).booleanValue()) {
                    int i5 = IconCompatParcelizer + 23;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return false;
                }
                int i7 = read + 91;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "EntrancePin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
                int i2 = IconCompatParcelizer + 113;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public EntrancePin(Location location, boolean z, int i, String str) {
                location.getClass();
                str.getClass();
                this.address = location;
                this.highlighted = z;
                this.order = i;
                this.style = str;
            }
        }

        @Serializable
        @getAppropriateFullView(serializer = "parking")
        public static final class ParkingPin extends PinComponent implements Parcelable {
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 0;
            private static int serializer = 1;
            private static int write = 1;
            public final Location address;
            public final boolean highlighted;
            public final int order;
            public final String style;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<ParkingPin> CREATOR = new LoadedFontFamily();

            public static final class Companion {
                private static int IconCompatParcelizer = 0;
                private static int serializer = 1;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = IconCompatParcelizer + 103;
                    serializer = i2 % Fields.SpotShadowColor;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        ScrollableComponent$Map$PinComponent$ParkingPin$$serializer scrollableComponent$Map$PinComponent$ParkingPin$$serializer = ScrollableComponent$Map$PinComponent$ParkingPin$$serializer.read;
                        throw null;
                    }
                    ScrollableComponent$Map$PinComponent$ParkingPin$$serializer scrollableComponent$Map$PinComponent$ParkingPin$$serializer2 = ScrollableComponent$Map$PinComponent$ParkingPin$$serializer.read;
                    int i3 = serializer + 95;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 == 0) {
                        return scrollableComponent$Map$PinComponent$ParkingPin$$serializer2;
                    }
                    obj.hashCode();
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = read + 11;
                serializer = i2 % Fields.SpotShadowColor;
                return i2 % 2 == 0 ? 1 : 0;
            }

            static {
                int i = write + 11;
                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0030  */
            /* JADX WARN: Code duplicated, block: B:15:0x003e  */
            /* JADX WARN: Code duplicated, block: B:17:0x004b  */
            /* JADX WARN: Code duplicated, block: B:20:0x0051  */
            /* JADX WARN: Code duplicated, block: B:22:0x005f  */
            public /* synthetic */ ParkingPin(int i, Location location, boolean z, int i2, String str) {
                int i3;
                if (1 != (i & 1)) {
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ScrollableComponent$Map$PinComponent$ParkingPin$$serializer.read.getDescriptor());
                    throw null;
                }
                this.address = location;
                if ((i & 2) != 0) {
                    this.highlighted = z;
                    int i4 = serializer + 91;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                    }
                    if ((i & 4) == 0) {
                        this.order = i2;
                        i3 = serializer + 65;
                        read = i3 % Fields.SpotShadowColor;
                        if (i3 % 2 != 0) {
                            int i5 = 5 % 5;
                        }
                        if ((i & 8) == 0) {
                            this.style = str;
                            return;
                        }
                        int i6 = serializer + 39;
                        read = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        this.style = "";
                    }
                    int i8 = read + 113;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    this.order = 0;
                    int i10 = 2 % 2;
                    if ((i & 8) == 0) {
                        this.style = str;
                        return;
                    }
                    int i11 = serializer + 39;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    this.style = "";
                }
                this.highlighted = false;
                int i13 = read + 55;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                int i15 = 2 % 2;
                if ((i & 4) == 0) {
                    this.order = i2;
                    i3 = serializer + 65;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i16 = 5 % 5;
                    }
                    if ((i & 8) == 0) {
                        this.style = str;
                        return;
                    }
                    int i17 = serializer + 39;
                    read = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    this.style = "";
                }
                int i19 = read + 113;
                serializer = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                this.order = 0;
                int i110 = 2 % 2;
                if ((i & 8) == 0) {
                    this.style = str;
                    return;
                }
                int i111 = serializer + 39;
                read = i111 % Fields.SpotShadowColor;
                int i112 = i111 % 2;
                this.style = "";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = read + 13;
                serializer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                parcel.getClass();
                this.address.writeToParcel(parcel, i);
                parcel.writeInt(this.highlighted ? 1 : 0);
                parcel.writeInt(this.order);
                parcel.writeString(this.style);
                int i5 = serializer + 69;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = read + 5;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
                int i4 = serializer + 3;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 28 / 0;
                }
                return iHashCode;
            }

            public final boolean equals(Object obj) {
                int i = 2 % 2;
                int i2 = serializer + 23;
                int i3 = i2 % Fields.SpotShadowColor;
                read = i3;
                int i4 = i2 % 2;
                if (this == obj) {
                    int i5 = i3 + 121;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return true;
                }
                if (!(obj instanceof ParkingPin)) {
                    return false;
                }
                ParkingPin parkingPin = (ParkingPin) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, parkingPin.address}, getCieXyz.write())).booleanValue()) {
                    if (this.highlighted != parkingPin.highlighted || this.order != parkingPin.order) {
                        return false;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, parkingPin.style}, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                    int i7 = serializer + 113;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return false;
                }
                int i9 = serializer + 121;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return false;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "ParkingPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
                int i2 = read + 9;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    int i3 = 25 / 0;
                }
                return str;
            }

            public ParkingPin(Location location, boolean z, int i, String str) {
                location.getClass();
                str.getClass();
                this.address = location;
                this.highlighted = z;
                this.order = i;
                this.style = str;
            }
        }

        @Serializable
        public static final class Unknown extends PinComponent implements Parcelable {
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 0;
            private static int serializer = 1;
            private static int write = 1;
            public final Location address;
            public final boolean highlighted;
            public final int order;
            public final String style;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<Unknown> CREATOR = new toAndroidStringlambda0();

            public static final class Companion {
                private static int serializer = 0;
                private static int write = 1;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = serializer + 119;
                    write = i2 % Fields.SpotShadowColor;
                    Object obj = null;
                    if (i2 % 2 == 0) {
                        ScrollableComponent$Map$PinComponent$Unknown$$serializer scrollableComponent$Map$PinComponent$Unknown$$serializer = ScrollableComponent$Map$PinComponent$Unknown$$serializer.IconCompatParcelizer;
                        obj.hashCode();
                        throw null;
                    }
                    ScrollableComponent$Map$PinComponent$Unknown$$serializer scrollableComponent$Map$PinComponent$Unknown$$serializer2 = ScrollableComponent$Map$PinComponent$Unknown$$serializer.IconCompatParcelizer;
                    int i3 = serializer + 33;
                    write = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        return scrollableComponent$Map$PinComponent$Unknown$$serializer2;
                    }
                    obj.hashCode();
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = read + 105;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return 0;
            }

            static {
                int i = RemoteActionCompatParcelizer + 43;
                serializer = i % Fields.SpotShadowColor;
                int i2 = i % 2;
            }

            public /* synthetic */ Unknown(int i, Location location, boolean z, int i2, String str) {
                if ((i & 1) == 0) {
                    location = new Location(0.0d, 0.0d);
                    int i3 = write + 113;
                    read = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        int i4 = 5 % 4;
                    } else {
                        int i5 = 2 % 2;
                    }
                }
                this.address = location;
                if ((i & 2) == 0) {
                    int i6 = write + 93;
                    read = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    this.highlighted = false;
                } else {
                    this.highlighted = z;
                }
                if ((i & 4) == 0) {
                    int i8 = read + 3;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    this.order = 0;
                } else {
                    this.order = i2;
                    int i10 = 2 % 2;
                }
                if ((i & 8) == 0) {
                    this.style = "";
                } else {
                    this.style = str;
                }
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = read + 1;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    parcel.getClass();
                    this.address.writeToParcel(parcel, i);
                    parcel.writeInt(this.highlighted ? 1 : 0);
                    parcel.writeInt(this.order);
                    parcel.writeString(this.style);
                    return;
                }
                parcel.getClass();
                this.address.writeToParcel(parcel, i);
                parcel.writeInt(this.highlighted ? 1 : 0);
                parcel.writeInt(this.order);
                parcel.writeString(this.style);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public Unknown(Location location, boolean z, int i, String str) {
                location.getClass();
                str.getClass();
                this.address = location;
                this.highlighted = z;
                this.order = i;
                this.style = str;
            }
        }

        @Serializable
        @getAppropriateFullView(serializer = "vendor")
        public static final class VendorPin extends PinComponent implements Parcelable {
            private static int IconCompatParcelizer = 1;
            private static int RemoteActionCompatParcelizer = 0;
            private static int read = 1;
            private static int write;
            public final Location address;
            public final boolean highlighted;
            public final int order;
            public final String style;
            public static final Companion Companion = new Companion();
            public static final Parcelable.Creator<VendorPin> CREATOR = new toAndroidArray();

            public static final class Companion {
                private static int IconCompatParcelizer = 0;
                private static int serializer = 1;

                public final setGraphicModalMaxWidthDp serializer() {
                    int i = 2 % 2;
                    int i2 = serializer + 119;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    ScrollableComponent$Map$PinComponent$VendorPin$$serializer scrollableComponent$Map$PinComponent$VendorPin$$serializer = ScrollableComponent$Map$PinComponent$VendorPin$$serializer.IconCompatParcelizer;
                    int i4 = serializer + 37;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 == 0) {
                        return scrollableComponent$Map$PinComponent$VendorPin$$serializer;
                    }
                    throw null;
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 39;
                int i3 = i2 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 93;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 42 / 0;
                }
                return 0;
            }

            static {
                int i = write + 97;
                read = i % Fields.SpotShadowColor;
                int i2 = i % 2;
            }

            public /* synthetic */ VendorPin(int i, Location location, boolean z, int i2, String str) {
                if (1 != (i & 1)) {
                    DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, ScrollableComponent$Map$PinComponent$VendorPin$$serializer.IconCompatParcelizer.getDescriptor());
                    throw null;
                }
                this.address = location;
                if ((i & 2) == 0) {
                    this.highlighted = false;
                } else {
                    this.highlighted = z;
                    int i3 = RemoteActionCompatParcelizer + 45;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    int i5 = 2 % 2;
                }
                if ((i & 4) == 0) {
                    this.order = 0;
                } else {
                    this.order = i2;
                }
                if ((i & 8) == 0) {
                    int i6 = IconCompatParcelizer + 31;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    this.style = "";
                    return;
                }
                this.style = str;
                int i8 = IconCompatParcelizer + 107;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = RemoteActionCompatParcelizer + 111;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                parcel.getClass();
                this.address.writeToParcel(parcel, i);
                parcel.writeInt(this.highlighted ? 1 : 0);
                parcel.writeInt(this.order);
                parcel.writeString(this.style);
                int i5 = RemoteActionCompatParcelizer + 95;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 57;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int iHashCode = this.style.hashCode() + af$$ExternalSyntheticOutline0.m(this.order, d$$ExternalSyntheticOutline0.m(this.address.hashCode() * 31, 31, this.highlighted), 31);
                int i4 = IconCompatParcelizer + 115;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public final boolean equals(Object obj) {
                int i = 2 % 2;
                if (this != obj) {
                    if (!(obj instanceof VendorPin)) {
                        return false;
                    }
                    VendorPin vendorPin = (VendorPin) obj;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, vendorPin.address}, getCieXyz.write())).booleanValue()) {
                        if (this.highlighted != vendorPin.highlighted) {
                            return false;
                        }
                        if (this.order == vendorPin.order) {
                            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, vendorPin.style}, getCieXyz.write())).booleanValue())) {
                                return true;
                            }
                            int i2 = RemoteActionCompatParcelizer + 101;
                            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                            return i2 % 2 == 0;
                        }
                        int i3 = IconCompatParcelizer + 33;
                        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                        return i3 % 2 != 0;
                    }
                    int i4 = IconCompatParcelizer + 55;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    return i4 % 2 != 0;
                }
                int i5 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return true;
            }

            public final String toString() {
                int i = 2 % 2;
                String str = "VendorPin(address=" + this.address + ", highlighted=" + this.highlighted + ", order=" + this.order + ", style=" + this.style + ")";
                int i2 = RemoteActionCompatParcelizer + 39;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            public VendorPin(Location location, boolean z, int i, String str) {
                location.getClass();
                str.getClass();
                this.address = location;
                this.highlighted = z;
                this.order = i;
                this.style = str;
            }
        }

        static {
            int i = RemoteActionCompatParcelizer + 125;
            write = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public static final class Companion {
            private static int IconCompatParcelizer = 0;
            private static int write = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = write + 47;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) PinComponent.$cachedSerializer$delegate.MediaSessionCompatResultReceiverWrapper();
                int i3 = IconCompatParcelizer + 97;
                write = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return setgraphicmodalmaxwidthdp;
                }
                throw null;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 5;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 107;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return 0;
    }

    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        Object obj = null;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3Response$$ExternalSyntheticLambda0(14)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new StateV3Response$$ExternalSyntheticLambda0(15)), null, null, null};
        int i = serializer + 81;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ScrollableComponent$Map(int i, boolean z, List list, DestinationLocation destinationLocation, List list2, String str, String str2, boolean z2) {
        if (13 != (i & 13)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 13, ScrollableComponent$Map$$serializer.serializer.getDescriptor());
            throw null;
        }
        this.riderLocationEnabled = z;
        if ((i & 2) == 0) {
            this.components = instance_delegatelambda0.write;
            int i2 = 2 % 2;
        } else {
            this.components = list;
        }
        this.destinationLocation = destinationLocation;
        this.pins = list2;
        if ((i & 16) == 0) {
            int i3 = read + 83;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                this.style = "mapbox://styles/mapbox/streets-v11";
                throw null;
            }
            this.style = "mapbox://styles/mapbox/streets-v11";
        } else {
            this.style = str;
        }
        if ((i & 32) == 0) {
            int i4 = IconCompatParcelizer + 67;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            this.expandMapCaption = null;
        } else {
            this.expandMapCaption = str2;
        }
        int i6 = 2 % 2;
        if ((i & 64) != 0) {
            this.enablePinConnections = z2;
            return;
        }
        int i7 = IconCompatParcelizer + 125;
        read = i7 % Fields.SpotShadowColor;
        this.enablePinConnections = i7 % 2 != 0;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m(this.pins, (this.destinationLocation.hashCode() + c8$$ExternalSyntheticOutline0.m(this.components, Boolean.hashCode(this.riderLocationEnabled) * 31, 31)) * 31, 31), 31, this.style);
        String str = this.expandMapCaption;
        if (str == null) {
            int i4 = read + 37;
            int i5 = i4 % Fields.SpotShadowColor;
            IconCompatParcelizer = i5;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
            int i6 = i5 + 33;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode = str.hashCode();
        }
        return Boolean.hashCode(this.enablePinConnections) + ((iM + iHashCode) * 31);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("Map(riderLocationEnabled=");
        sb.append(this.riderLocationEnabled);
        sb.append(", components=");
        sb.append(this.components);
        sb.append(", destinationLocation=");
        sb.append(this.destinationLocation);
        sb.append(", pins=");
        sb.append(this.pins);
        sb.append(", style=");
        c8$$ExternalSyntheticOutline0.m(sb, this.style, ", expandMapCaption=", this.expandMapCaption, ", enablePinConnections=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.enablePinConnections, ")");
        int i2 = read + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public ScrollableComponent$Map(boolean z, ArrayList arrayList, DestinationLocation destinationLocation, ArrayList arrayList2, String str, String str2, boolean z2) {
        destinationLocation.getClass();
        str.getClass();
        this.riderLocationEnabled = z;
        this.components = arrayList;
        this.destinationLocation = destinationLocation;
        this.pins = arrayList2;
        this.style = str;
        this.expandMapCaption = str2;
        this.enablePinConnections = z2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableComponent$Map)) {
            int i2 = read + 57;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        ScrollableComponent$Map scrollableComponent$Map = (ScrollableComponent$Map) obj;
        if (this.riderLocationEnabled != scrollableComponent$Map.riderLocationEnabled) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.components, scrollableComponent$Map.components}, getCieXyz.write())).booleanValue()) {
            int i4 = read + 89;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.destinationLocation, scrollableComponent$Map.destinationLocation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.pins, scrollableComponent$Map.pins}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.style, scrollableComponent$Map.style}, getCieXyz.write())).booleanValue()) {
            int i5 = IconCompatParcelizer + 81;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.expandMapCaption, scrollableComponent$Map.expandMapCaption}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.enablePinConnections == scrollableComponent$Map.enablePinConnections) {
            return true;
        }
        int i7 = read + 9;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = read + 35;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeInt(this.riderLocationEnabled ? 1 : 0);
        List list = this.components;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        int i5 = IconCompatParcelizer + 95;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        this.destinationLocation.writeToParcel(parcel, i);
        List list2 = this.pins;
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            int i7 = read + 19;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                parcel.writeParcelable((Parcelable) it2.next(), i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            parcel.writeParcelable((Parcelable) it2.next(), i);
        }
        parcel.writeString(this.style);
        parcel.writeString(this.expandMapCaption);
        parcel.writeInt(this.enablePinConnections ? 1 : 0);
    }
}
