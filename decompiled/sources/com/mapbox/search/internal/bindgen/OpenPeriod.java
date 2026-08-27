package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class OpenPeriod implements Serializable {
    private final byte closedD;
    private final byte closedH;
    private final byte closedM;
    private final byte openD;
    private final byte openH;
    private final byte openM;

    public byte getClosedD() {
        return this.closedD;
    }

    public byte getClosedH() {
        return this.closedH;
    }

    public byte getClosedM() {
        return this.closedM;
    }

    public byte getOpenD() {
        return this.openD;
    }

    public byte getOpenH() {
        return this.openH;
    }

    public byte getOpenM() {
        return this.openM;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public OpenPeriod(byte b, byte b2, byte b3, byte b4, byte b5, byte b6) {
        this.openD = b;
        this.openH = b2;
        this.openM = b3;
        this.closedD = b4;
        this.closedH = b5;
        this.closedM = b6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[openD: ");
        MediaSessionCompatQueueItem.serializer(this.openD, sb, ", openH: ");
        MediaSessionCompatQueueItem.serializer(this.openH, sb, ", openM: ");
        MediaSessionCompatQueueItem.serializer(this.openM, sb, ", closedD: ");
        MediaSessionCompatQueueItem.serializer(this.closedD, sb, ", closedH: ");
        MediaSessionCompatQueueItem.serializer(this.closedH, sb, ", closedM: ");
        sb.append(RecordUtils.fieldToString(Byte.valueOf(this.closedM)));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        return Objects.hash(Byte.valueOf(this.openD), Byte.valueOf(this.openH), Byte.valueOf(this.openM), Byte.valueOf(this.closedD), Byte.valueOf(this.closedH), Byte.valueOf(this.closedM));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenPeriod openPeriod = (OpenPeriod) obj;
        return this.openD == openPeriod.openD && this.openH == openPeriod.openH && this.openM == openPeriod.openM && this.closedD == openPeriod.closedD && this.closedH == openPeriod.closedH && this.closedM == openPeriod.closedM;
    }
}
