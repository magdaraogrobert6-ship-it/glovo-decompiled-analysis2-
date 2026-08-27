package com.roadrunner.delivery.destination.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.FontWeight;
import o.IconCompatParcelizer;
import o.accessgetExtraBoldcp;
import o.getCieXyz;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class Analytics implements Parcelable {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final String deliveryState;
    public final List parameters;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Analytics> CREATOR = new FontWeight();
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(18))};

    public static final class Companion {
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 7;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return Analytics$$serializer.serializer;
            }
            int i3 = 78 / 0;
            return Analytics$$serializer.serializer;
        }
    }

    @Serializable
    public static final class Parameter implements Parcelable {
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 0;
        private static int serializer = 1;
        private static int write = 1;
        public final String key;
        public final String value;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<Parameter> CREATOR = new accessgetExtraBoldcp();

        public static final class Companion {
            private static int RemoteActionCompatParcelizer = 0;
            private static int serializer = 1;

            public final setGraphicModalMaxWidthDp serializer() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 81;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    Analytics$Parameter$$serializer analytics$Parameter$$serializer = Analytics$Parameter$$serializer.read;
                    throw null;
                }
                Analytics$Parameter$$serializer analytics$Parameter$$serializer2 = Analytics$Parameter$$serializer.read;
                int i3 = RemoteActionCompatParcelizer + 69;
                serializer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 40 / 0;
                }
                return analytics$Parameter$$serializer2;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 39;
            int i3 = i2 % Fields.SpotShadowColor;
            write = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 97;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        static {
            int i = read + 121;
            serializer = i % Fields.SpotShadowColor;
            int i2 = i % 2;
        }

        public /* synthetic */ Parameter(int i, String str, String str2) {
            if (3 == (i & 3)) {
                this.key = str;
                this.value = str2;
            } else {
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Analytics$Parameter$$serializer.read.getDescriptor());
                throw null;
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = write + 25;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.key);
            parcel.writeString(this.value);
            int i5 = RemoteActionCompatParcelizer + 25;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }

        public final String toString() {
            String strWrite;
            int i = 2 % 2;
            int i2 = write + 125;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Parameter(key=", this.key, ", value=", this.value, ")");
                int i3 = 38 / 0;
            } else {
                strWrite = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Parameter(key=", this.key, ", value=", this.value, ")");
            }
            int i4 = RemoteActionCompatParcelizer + 31;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return strWrite;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = write + 43;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.value.hashCode() + (this.key.hashCode() * 31);
            int i4 = RemoteActionCompatParcelizer + 35;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public Parameter(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.value = str2;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = RemoteActionCompatParcelizer + 39;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    return true;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (obj instanceof Parameter) {
                Parameter parameter = (Parameter) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.key, parameter.key}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, parameter.value}, getCieXyz.write())).booleanValue();
                }
                int i3 = write + 115;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            int i5 = RemoteActionCompatParcelizer + 41;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    static {
        Object obj = null;
        int i = IconCompatParcelizer + 79;
        read = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ Analytics(List list, int i, String str) {
        if (3 == (i & 3)) {
            this.deliveryState = str;
            this.parameters = list;
        } else {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, Analytics$$serializer.serializer.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 63;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return IconCompatParcelizer.read("Analytics(deliveryState=", this.deliveryState, ", parameters=", this.parameters, ")");
        }
        int i3 = 95 / 0;
        return IconCompatParcelizer.read("Analytics(deliveryState=", this.deliveryState, ", parameters=", this.parameters, ")");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 19;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.parameters.hashCode() + (this.deliveryState.hashCode() * 31);
        int i4 = write + 47;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public Analytics(String str, ArrayList arrayList) {
        str.getClass();
        this.deliveryState = str;
        this.parameters = arrayList;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(!(obj instanceof Analytics))) {
            Analytics analytics = (Analytics) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deliveryState, analytics.deliveryState}, getCieXyz.write())).booleanValue()) {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.parameters, analytics.parameters}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                int i2 = serializer + 17;
                write = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = write + 35;
            serializer = i4 % Fields.SpotShadowColor;
            return i4 % 2 == 0;
        }
        int i5 = serializer + 33;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator it;
        int i2 = 2 % 2;
        int i3 = write + 79;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            parcel.writeString(this.deliveryState);
            List list = this.parameters;
            parcel.writeInt(list.size());
            it = list.iterator();
            int i4 = 57 / 0;
        } else {
            parcel.getClass();
            parcel.writeString(this.deliveryState);
            List list2 = this.parameters;
            parcel.writeInt(list2.size());
            it = list2.iterator();
        }
        while (it.hasNext()) {
            ((Parameter) it.next()).writeToParcel(parcel, i);
            int i5 = serializer + 31;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
    }
}
