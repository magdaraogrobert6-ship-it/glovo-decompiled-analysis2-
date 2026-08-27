package o;

import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageLoaderBuilderExternalSyntheticLambda1 implements addPathUv8p0NA {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final OrderDetails RemoteActionCompatParcelizer;

    public final OrderDetails write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 75;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        OrderDetails orderDetails = this.RemoteActionCompatParcelizer;
        int i5 = i2 + 109;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return orderDetails;
    }

    public ImageLoaderBuilderExternalSyntheticLambda1(OrderDetails orderDetails) {
        this.RemoteActionCompatParcelizer = orderDetails;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 59;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer.hashCode();
        }
        this.RemoteActionCompatParcelizer.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "OrderDetailsFragmentArgs(orderDetails=" + this.RemoteActionCompatParcelizer + ")";
        int i2 = serializer + 45;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 35;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else if (!(obj instanceof ImageLoaderBuilderExternalSyntheticLambda1) || (!this.RemoteActionCompatParcelizer.equals(((ImageLoaderBuilderExternalSyntheticLambda1) obj).RemoteActionCompatParcelizer))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (java.io.Serializable.class.isAssignableFrom(com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (java.io.Serializable.class.isAssignableFrom(com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        com.braze.IBraze$$ExternalSyntheticBUOutline0.m(com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        r5 = o.ImageLoaderBuilderExternalSyntheticLambda1.serializer + 23;
        o.ImageLoaderBuilderExternalSyntheticLambda1.IconCompatParcelizer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if ((r5 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        r5 = 37 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o.ImageLoaderBuilderExternalSyntheticLambda1 fromBundle(android.os.Bundle r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r5.getClass()
            java.lang.Class<o.ImageLoaderBuilderExternalSyntheticLambda1> r1 = o.ImageLoaderBuilderExternalSyntheticLambda1.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r5.setClassLoader(r1)
            java.lang.String r1 = "orderDetails"
            boolean r2 = r5.containsKey(r1)
            r3 = 0
            if (r2 == 0) goto L8d
            int r2 = o.ImageLoaderBuilderExternalSyntheticLambda1.serializer
            int r2 = r2 + 63
            int r4 = r2 % 128
            o.ImageLoaderBuilderExternalSyntheticLambda1.IconCompatParcelizer = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L85
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            java.lang.Class<com.roadrunner.order.history.presentation.orderdetails.OrderDetails> r4 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 != 0) goto L71
            int r2 = o.ImageLoaderBuilderExternalSyntheticLambda1.serializer
            int r2 = r2 + 97
            int r4 = r2 % 128
            o.ImageLoaderBuilderExternalSyntheticLambda1.IconCompatParcelizer = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L47
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            java.lang.Class<com.roadrunner.order.history.presentation.orderdetails.OrderDetails> r4 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class
            boolean r2 = r2.isAssignableFrom(r4)
            r4 = 16
            int r4 = r4 / 0
            if (r2 == 0) goto L52
            goto L71
        L47:
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            java.lang.Class<com.roadrunner.order.history.presentation.orderdetails.OrderDetails> r4 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 == 0) goto L52
            goto L71
        L52:
            java.lang.Class<com.roadrunner.order.history.presentation.orderdetails.OrderDetails> r5 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = " must implement Parcelable or Serializable or must be an Enum."
            java.lang.String r5 = r5.concat(r1)
            com.braze.IBraze$$ExternalSyntheticBUOutline0.m(r5)
            int r5 = o.ImageLoaderBuilderExternalSyntheticLambda1.serializer
            int r5 = r5 + 23
            int r1 = r5 % 128
            o.ImageLoaderBuilderExternalSyntheticLambda1.IconCompatParcelizer = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L70
            r5 = 37
            int r5 = r5 / 0
        L70:
            return r3
        L71:
            java.lang.Object r5 = r5.get(r1)
            com.roadrunner.order.history.presentation.orderdetails.OrderDetails r5 = (com.roadrunner.order.history.presentation.orderdetails.OrderDetails) r5
            if (r5 == 0) goto L7f
            o.ImageLoaderBuilderExternalSyntheticLambda1 r0 = new o.ImageLoaderBuilderExternalSyntheticLambda1
            r0.<init>(r5)
            return r0
        L7f:
            java.lang.String r5 = "Argument \"orderDetails\" is marked as non-null but was passed a null value."
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r5)
            return r3
        L85:
            java.lang.Class<android.os.Parcelable> r5 = android.os.Parcelable.class
            java.lang.Class<com.roadrunner.order.history.presentation.orderdetails.OrderDetails> r0 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.class
            r5.isAssignableFrom(r0)
            throw r3
        L8d:
            java.lang.String r5 = "Required argument \"orderDetails\" is missing and does not have an android:defaultValue"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ImageLoaderBuilderExternalSyntheticLambda1.fromBundle(android.os.Bundle):o.ImageLoaderBuilderExternalSyntheticLambda1");
    }
}
