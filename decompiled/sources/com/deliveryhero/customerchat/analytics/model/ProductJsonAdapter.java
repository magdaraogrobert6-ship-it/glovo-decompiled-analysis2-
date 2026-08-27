package com.deliveryhero.customerchat.analytics.model;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import o.IconCompatParcelizer;
import o.ItemTouchHelperAdapter;
import o.getDisplayHeightAndWidthPixels;
import o.getLocalBitmap;
import o.getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations;
import o.getRemoteBitmaplambda4;

/* JADX INFO: loaded from: classes4.dex */
public final class ProductJsonAdapter extends JsonAdapter {
    private volatile Constructor<Product> constructorRef;
    private final JsonAdapter nullableStringAdapter;
    private final getLocalBitmap options;
    private final JsonAdapter stringAdapter;

    public ProductJsonAdapter(getRUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENTannotations getruntime_memory_image_loader_usage_quotientannotations) {
        getruntime_memory_image_loader_usage_quotientannotations.getClass();
        this.options = getLocalBitmap.RemoteActionCompatParcelizer("name", "version");
        ItemTouchHelperAdapter itemTouchHelperAdapter = ItemTouchHelperAdapter.serializer;
        this.stringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "name");
        this.nullableStringAdapter = getruntime_memory_image_loader_usage_quotientannotations.read(String.class, itemTouchHelperAdapter, "version");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Product fromJson(getDisplayHeightAndWidthPixels getdisplayheightandwidthpixels) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        getdisplayheightandwidthpixels.getClass();
        getdisplayheightandwidthpixels.read();
        String str = null;
        String str2 = null;
        int i = -1;
        while (getdisplayheightandwidthpixels.MediaBrowserCompatMediaItem()) {
            int iSerializer = getdisplayheightandwidthpixels.serializer(this.options);
            if (iSerializer == -1) {
                getdisplayheightandwidthpixels.PlaybackStateCompatCustomAction();
                getdisplayheightandwidthpixels.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            } else if (iSerializer == 0) {
                str = (String) this.stringAdapter.fromJson(getdisplayheightandwidthpixels);
                if (str == null) {
                    throw getRemoteBitmaplambda4.IconCompatParcelizer("name", "name", getdisplayheightandwidthpixels);
                }
                i = -2;
            } else if (iSerializer == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(getdisplayheightandwidthpixels);
            }
        }
        getdisplayheightandwidthpixels.IconCompatParcelizer();
        if (i == -2) {
            str.getClass();
            return new Product(str, str2);
        }
        Constructor<Product> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = Product.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, getRemoteBitmaplambda4.IconCompatParcelizer);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        Product productNewInstance = declaredConstructor.newInstance(str, str2, Integer.valueOf(i), null);
        productNewInstance.getClass();
        return productNewInstance;
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(29, "GeneratedJsonAdapter(Product)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter, Product product) {
        jsonWriter.getClass();
        if (product == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.IconCompatParcelizer();
        jsonWriter.IconCompatParcelizer("name");
        this.stringAdapter.toJson(jsonWriter, product.getName());
        jsonWriter.IconCompatParcelizer("version");
        this.nullableStringAdapter.toJson(jsonWriter, product.getVersion());
        jsonWriter.serializer();
    }
}
