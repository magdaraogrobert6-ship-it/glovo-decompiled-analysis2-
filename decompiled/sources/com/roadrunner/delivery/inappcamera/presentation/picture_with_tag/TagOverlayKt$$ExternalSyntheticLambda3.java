package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.inappcamera.api.model.InAppCameraOverlay;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageKt;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import java.util.Iterator;
import o.ProgressIndicatorKt;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getPostalCode;
import o.isNestedScrollingEnabled;
import o.onMessageReceived;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TagOverlayKt$$ExternalSyntheticLambda3 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ TagOverlayKt$$ExternalSyntheticLambda3(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, int i) {
        this.read = i;
        this.IconCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        Iterator it;
        int i = 2 % 2;
        int i2 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk<InAppCameraOverlay.TagItem> r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = this.IconCompatParcelizer;
        ProgressIndicatorKt progressIndicatorKt = (ProgressIndicatorKt) obj;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (i2 == 0) {
            progressIndicatorKt.getClass();
            if ((iIntValue & 17) != 16) {
                int i3 = serializer + 59;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, z)) {
                for (InAppCameraOverlay.TagItem tagItem : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                    String str = tagItem.read;
                    Integer num = tagItem.write;
                    TagsKt.serializer(-1744438842, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), 1744438842, new Object[]{str, null, Integer.valueOf(num != null ? num.intValue() : 0), Integer.MAX_VALUE, getpostalcode, 3072, 18}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i5 = serializer + 91;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            return createfromparcel;
        }
        if (i2 == 1) {
            progressIndicatorKt.getClass();
            if ((iIntValue & 17) != 16) {
                int i7 = serializer + 97;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                z2 = true;
            } else {
                z2 = false;
            }
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
            if (getpostalcode2.write(iIntValue & 1, z2)) {
                Iterator<E> it2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it2.hasNext()) {
                    ImageKt.read((isNestedScrollingEnabled) it2.next(), getpostalcode2, 0);
                }
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        progressIndicatorKt.getClass();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i9 = RemoteActionCompatParcelizer + 55;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                int i10 = 80 / 0;
            } else {
                it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            }
            while (!(!it.hasNext())) {
                TagsKt.serializer(-1744438842, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer(), 1744438842, new Object[]{(String) it.next(), null, 0, Integer.MAX_VALUE, getpostalcode3, 3072, 22}, onMessageReceived.IconCompatParcelizer(), onMessageReceived.IconCompatParcelizer());
            }
        } else {
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
