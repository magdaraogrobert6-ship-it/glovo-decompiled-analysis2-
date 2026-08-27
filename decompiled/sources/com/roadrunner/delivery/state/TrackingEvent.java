package com.roadrunner.delivery.state;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.android.gms.common.zza;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class TrackingEvent implements Parcelable {
    private static int IconCompatParcelizer = 1;
    private static int read = 1;
    private static int serializer;
    private static int write;
    public final String name;
    public final Map parameters;
    public final String trigger;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<TrackingEvent> CREATOR = new zza(22);
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new TrackingEvent$$ExternalSyntheticLambda0(0))};

    public static final class Companion {
        private static int read = 1;
        private static int serializer;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 7;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return TrackingEvent$$serializer.write;
            }
            int i3 = 70 / 0;
            return TrackingEvent$$serializer.write;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = read + 107;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    static {
        Object obj = null;
        int i = write + 77;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ TrackingEvent(String str, int i, Map map, String str2) {
        if (3 == (i & 3)) {
            this.trigger = str;
            this.name = str2;
            if ((i & 4) == 0) {
                this.parameters = null;
                int i2 = read + 15;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            this.parameters = map;
            int i3 = serializer + 111;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3, TrackingEvent$$serializer.write.getDescriptor());
        throw null;
    }

    public static TrackingEvent IconCompatParcelizer(TrackingEvent trackingEvent, String str, Map map, int i) {
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 81;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 43;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                str = trackingEvent.trigger;
            } else {
                String str2 = trackingEvent.trigger;
                throw null;
            }
        }
        String str3 = trackingEvent.name;
        str.getClass();
        str3.getClass();
        return new TrackingEvent(str, str3, map);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            String strRemoteActionCompatParcelizer = SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m("TrackingEvent(trigger=", this.trigger, ", name=", this.name, ", parameters="), this.parameters, ")");
            int i3 = serializer + 81;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return strRemoteActionCompatParcelizer;
        }
        SweepGradientShader9KIMszodefault.RemoteActionCompatParcelizer(c8$$ExternalSyntheticOutline0.m("TrackingEvent(trigger=", this.trigger, ", name=", this.name, ", parameters="), this.parameters, ")");
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.trigger.hashCode() * 31, 31, this.name);
        Map map = this.parameters;
        if (map == null) {
            int i2 = read + 93;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = map.hashCode();
        }
        int i4 = iM + iHashCode;
        int i5 = read + 89;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return i4;
    }

    public TrackingEvent(String str, String str2, Map map) {
        str.getClass();
        str2.getClass();
        this.trigger = str;
        this.name = str2;
        this.parameters = map;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = read + 125;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (obj instanceof TrackingEvent) {
            TrackingEvent trackingEvent = (TrackingEvent) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trigger, trackingEvent.trigger}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, trackingEvent.name}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.parameters, trackingEvent.parameters}, getCieXyz.write())).booleanValue() ^ true);
        }
        int i4 = read + 17;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        parcel.getClass();
        parcel.writeString(this.trigger);
        parcel.writeString(this.name);
        Map map = this.parameters;
        if (map == null) {
            int i3 = serializer + 47;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        int i5 = read + 97;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }
}
