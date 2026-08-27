package com.deliveryhero.perseus.data.local.db.entity;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class EcommerceComponent {
    private final List<CustomField> customFields;
    private final String id;
    private final Integer index;
    private final String name;
    private final String type;

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.id;
    }

    public final Integer component3() {
        return this.index;
    }

    public final String component4() {
        return this.name;
    }

    public final List<CustomField> component5() {
        return this.customFields;
    }

    public final List<CustomField> getCustomFields() {
        return this.customFields;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        String str = this.id;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.index;
        int iM = af$$ExternalSyntheticOutline0.m(((((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.name);
        List<CustomField> list = this.customFields;
        return iM + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.id;
        Integer num = this.index;
        String str3 = this.name;
        List<CustomField> list = this.customFields;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("EcommerceComponent(type=", str, ", id=", str2, ", index=");
        sbM.append(num);
        sbM.append(", name=");
        sbM.append(str3);
        sbM.append(", customFields=");
        return MediaSessionCompatQueueItem.read(sbM, list, ")");
    }

    public EcommerceComponent(String str, String str2, Integer num, String str3, List<CustomField> list) {
        str.getClass();
        str3.getClass();
        this.type = str;
        this.id = str2;
        this.index = num;
        this.name = str3;
        this.customFields = list;
    }

    public final EcommerceComponent copy(String str, String str2, Integer num, String str3, List<CustomField> list) {
        str.getClass();
        str3.getClass();
        return new EcommerceComponent(str, str2, num, str3, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcommerceComponent copy$default(EcommerceComponent ecommerceComponent, String str, String str2, Integer num, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecommerceComponent.type;
        }
        if ((i & 2) != 0) {
            str2 = ecommerceComponent.id;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            num = ecommerceComponent.index;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = ecommerceComponent.name;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            list = ecommerceComponent.customFields;
        }
        return ecommerceComponent.copy(str, str4, num2, str5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcommerceComponent)) {
            return false;
        }
        EcommerceComponent ecommerceComponent = (EcommerceComponent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, ecommerceComponent.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, ecommerceComponent.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.index, ecommerceComponent.index}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, ecommerceComponent.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customFields, ecommerceComponent.customFields}, getCieXyz.write())).booleanValue();
    }
}
