package com.deliveryhero.perseus.data.local.db.entity;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.af$$ExternalSyntheticOutline1;
import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class EcommerceItem {
    private final List<CustomField> customFields;
    private final String itemId;
    private final String itemName;
    private final Integer itemPosition;
    private final float quantity;
    private final String shopId;
    private final float unitPrice;

    public final String component1() {
        return this.itemId;
    }

    public final Integer component2() {
        return this.itemPosition;
    }

    public final String component3() {
        return this.itemName;
    }

    public final float component4() {
        return this.unitPrice;
    }

    public final float component5() {
        return this.quantity;
    }

    public final String component6() {
        return this.shopId;
    }

    public final List<CustomField> component7() {
        return this.customFields;
    }

    public final List<CustomField> getCustomFields() {
        return this.customFields;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final Integer getItemPosition() {
        return this.itemPosition;
    }

    public final float getQuantity() {
        return this.quantity;
    }

    public final String getShopId() {
        return this.shopId;
    }

    public final float getUnitPrice() {
        return this.unitPrice;
    }

    public int hashCode() {
        int iHashCode = this.itemId.hashCode();
        Integer num = this.itemPosition;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline1.m(this.quantity, af$$ExternalSyntheticOutline1.m(this.unitPrice, af$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31, 31, this.itemName), 31), 31), 31, this.shopId);
        List<CustomField> list = this.customFields;
        return iM + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.itemId;
        Integer num = this.itemPosition;
        String str2 = this.itemName;
        float f = this.unitPrice;
        float f2 = this.quantity;
        String str3 = this.shopId;
        List<CustomField> list = this.customFields;
        StringBuilder sb = new StringBuilder("EcommerceItem(itemId=");
        sb.append(str);
        sb.append(", itemPosition=");
        sb.append(num);
        sb.append(", itemName=");
        sb.append(str2);
        sb.append(", unitPrice=");
        sb.append(f);
        sb.append(", quantity=");
        sb.append(f2);
        sb.append(", shopId=");
        sb.append(str3);
        sb.append(", customFields=");
        return MediaSessionCompatQueueItem.read(sb, list, ")");
    }

    public EcommerceItem(String str, Integer num, String str2, float f, float f2, String str3, List<CustomField> list) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.itemId = str;
        this.itemPosition = num;
        this.itemName = str2;
        this.unitPrice = f;
        this.quantity = f2;
        this.shopId = str3;
        this.customFields = list;
    }

    public final EcommerceItem copy(String str, Integer num, String str2, float f, float f2, String str3, List<CustomField> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new EcommerceItem(str, num, str2, f, f2, str3, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcommerceItem copy$default(EcommerceItem ecommerceItem, String str, Integer num, String str2, float f, float f2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecommerceItem.itemId;
        }
        if ((i & 2) != 0) {
            num = ecommerceItem.itemPosition;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = ecommerceItem.itemName;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            f = ecommerceItem.unitPrice;
        }
        float f3 = f;
        if ((i & 16) != 0) {
            f2 = ecommerceItem.quantity;
        }
        float f4 = f2;
        if ((i & 32) != 0) {
            str3 = ecommerceItem.shopId;
        }
        String str5 = str3;
        if ((i & 64) != 0) {
            list = ecommerceItem.customFields;
        }
        return ecommerceItem.copy(str, num2, str4, f3, f4, str5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcommerceItem)) {
            return false;
        }
        EcommerceItem ecommerceItem = (EcommerceItem) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.itemId, ecommerceItem.itemId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.itemPosition, ecommerceItem.itemPosition}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.itemName, ecommerceItem.itemName}, getCieXyz.write())).booleanValue() || Float.compare(this.unitPrice, ecommerceItem.unitPrice) != 0 || Float.compare(this.quantity, ecommerceItem.quantity) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shopId, ecommerceItem.shopId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customFields, ecommerceItem.customFields}, getCieXyz.write())).booleanValue();
    }
}
