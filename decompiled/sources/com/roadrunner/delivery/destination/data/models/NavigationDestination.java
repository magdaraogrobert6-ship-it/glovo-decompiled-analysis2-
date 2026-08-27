package com.roadrunner.delivery.destination.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.getCieXyz;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class NavigationDestination implements Parcelable {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private static int write;
    public final String body;
    public final DestinationLocation destinationLocation;
    public final String title;
    public final NavigationType type;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NavigationDestination> CREATOR = new SearchResult.Creator(10);
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(28)), null};

    public static final class Companion {
        private static int IconCompatParcelizer = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            NavigationDestination$$serializer navigationDestination$$serializer;
            int i = 2 % 2;
            int i2 = serializer + 87;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                navigationDestination$$serializer = NavigationDestination$$serializer.IconCompatParcelizer;
                int i3 = 11 / 0;
            } else {
                navigationDestination$$serializer = NavigationDestination$$serializer.IconCompatParcelizer;
            }
            int i4 = serializer + 37;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return navigationDestination$$serializer;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 87;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 101;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = RemoteActionCompatParcelizer + 109;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    public /* synthetic */ NavigationDestination(int i, String str, String str2, NavigationType navigationType, DestinationLocation destinationLocation) {
        int i2;
        if (8 != (i & 8)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 8, NavigationDestination$$serializer.IconCompatParcelizer.getDescriptor());
            throw null;
        }
        if ((i & 1) != 0) {
            this.title = str;
            int i3 = write + 17;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
            }
            if ((i & 2) == 0) {
                this.body = "";
            } else {
                this.body = str2;
            }
            if ((i & 4) == 0) {
                this.type = navigationType;
                i2 = IconCompatParcelizer + 3;
                write = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                }
                this.destinationLocation = destinationLocation;
                int i4 = write + 49;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            int i6 = IconCompatParcelizer + 37;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            this.type = NavigationType.Unknown;
            int i8 = 2 % 2;
            this.destinationLocation = destinationLocation;
            int i9 = write + 49;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        this.title = "";
        int i11 = 2 % 2;
        if ((i & 2) == 0) {
            this.body = "";
        } else {
            this.body = str2;
        }
        if ((i & 4) == 0) {
            this.type = navigationType;
            i2 = IconCompatParcelizer + 3;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            this.destinationLocation = destinationLocation;
            int i12 = write + 49;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        int i14 = IconCompatParcelizer + 37;
        write = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        this.type = NavigationType.Unknown;
        int i16 = 2 % 2;
        this.destinationLocation = destinationLocation;
        int i17 = write + 49;
        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = write + 1;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.type.name());
        this.destinationLocation.writeToParcel(parcel, i);
        int i5 = IconCompatParcelizer + 5;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body);
        int iHashCode = this.destinationLocation.hashCode() + ((this.type.hashCode() + iM) * 31);
        int i4 = write + 107;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("NavigationDestination(title=", this.title, ", body=", this.body, ", type=");
        sbM.append(this.type);
        sbM.append(", destinationLocation=");
        sbM.append(this.destinationLocation);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = write + 123;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 121;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationDestination)) {
            return false;
        }
        NavigationDestination navigationDestination = (NavigationDestination) obj;
        Object[] objArr = {this.title, navigationDestination.title};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            Object[] objArr2 = {this.body, navigationDestination.body};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || this.type != navigationDestination.type) {
                return false;
            }
            Object[] objArr3 = {this.destinationLocation, navigationDestination.destinationLocation};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i4 = write + 5;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = write + 47;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public NavigationDestination(String str, String str2, NavigationType navigationType, DestinationLocation destinationLocation) {
        str.getClass();
        str2.getClass();
        navigationType.getClass();
        destinationLocation.getClass();
        this.title = str;
        this.body = str2;
        this.type = navigationType;
        this.destinationLocation = destinationLocation;
    }
}
