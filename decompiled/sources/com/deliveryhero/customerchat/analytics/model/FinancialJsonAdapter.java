package com.deliveryhero.customerchat.analytics.model;

import androidx.room.Room;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.util.Map;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class FinancialJsonAdapter extends JsonAdapter {
    private final JsonAdapter intAdapter;
    private final JsonAdapter nullableMapOfStringNullableStringAdapter;
    private final JsonAdapter nullableMapOfStringStringAdapter;
    private final JsonAdapter nullableStringAdapter;
    private final getLocalBitmap options;
    private final JsonAdapter stringAdapter;

    public FinancialJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.options = getLocalBitmap.RemoteActionCompatParcelizer("id", "paymentMedium", "currencyCode", "refundValue", "compensationValue", "details");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.stringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "id");
        this.nullableMapOfStringNullableStringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Room.IconCompatParcelizer(Map.class, String.class, String.class), itemTouchHelperAdapter, "paymentMedium");
        this.nullableStringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "currencyCode");
        this.intAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Integer.TYPE, itemTouchHelperAdapter, "refundValue");
        this.nullableMapOfStringStringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(Room.IconCompatParcelizer(Map.class, String.class, String.class), itemTouchHelperAdapter, "details");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Financial fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Map map = null;
        String str2 = null;
        Map map2 = null;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            switch (getdisplayheightandwidthpixels.serializer(this.options)) {
                case -1:
                    getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                    getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                    if (str == null) {
                        throw getRemoteBitmaplambda4.IconCompatParcelizer("id", "id", getdisplayheightandwidthpixels);
                    }
                    break;
                    break;
                case 1:
                    map = (Map) this.nullableMapOfStringNullableStringAdapter.fromJson(getdisplayheightandwidthpixels);
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(getdisplayheightandwidthpixels);
                    break;
                case 3:
                    num = (Integer) this.intAdapter.fromJson(getdisplayheightandwidthpixels);
                    if (num == null) {
                        throw getRemoteBitmaplambda4.IconCompatParcelizer("refundValue", "refundValue", getdisplayheightandwidthpixels);
                    }
                    break;
                    break;
                case 4:
                    num2 = (Integer) this.intAdapter.fromJson(getdisplayheightandwidthpixels);
                    if (num2 == null) {
                        throw getRemoteBitmaplambda4.IconCompatParcelizer("compensationValue", "compensationValue", getdisplayheightandwidthpixels);
                    }
                    break;
                    break;
                case 5:
                    map2 = (Map) this.nullableMapOfStringStringAdapter.fromJson(getdisplayheightandwidthpixels);
                    break;
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (str == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("id", "id", getdisplayheightandwidthpixels);
        }
        if (num == null) {
            throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("refundValue", "refundValue", getdisplayheightandwidthpixels);
        }
        int iIntValue = num.intValue();
        if (num2 != null) {
            return new Financial(str, map, str2, iIntValue, num2.intValue(), map2);
        }
        throw getRemoteBitmaplambda4.RemoteActionCompatParcelizer("compensationValue", "compensationValue", getdisplayheightandwidthpixels);
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(31, "GeneratedJsonAdapter(Financial)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, Financial financial) {
        jsonWriter.getClass();
        if (financial == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("id");
        this.stringAdapter.toJson(jsonWriter, financial.getId());
        jsonWriter.IconCompatParcelizer("paymentMedium");
        this.nullableMapOfStringNullableStringAdapter.toJson(jsonWriter, financial.getPaymentMedium());
        jsonWriter.IconCompatParcelizer("currencyCode");
        this.nullableStringAdapter.toJson(jsonWriter, financial.getCurrencyCode());
        jsonWriter.IconCompatParcelizer("refundValue");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(financial.getRefundValue()));
        jsonWriter.IconCompatParcelizer("compensationValue");
        this.intAdapter.toJson(jsonWriter, Integer.valueOf(financial.getCompensationValue()));
        jsonWriter.IconCompatParcelizer("details");
        this.nullableMapOfStringStringAdapter.toJson(jsonWriter, financial.getDetails());
        jsonWriter.serializer();
    }
}
