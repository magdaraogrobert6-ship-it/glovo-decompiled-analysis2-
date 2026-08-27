package o;

import com.roadrunner.delivery.accept.deliverydetails.presentation.compose.DeliveryDetailsContentKt;
import com.roadrunner.delivery.accept.tags.presentation.compose.TagsContentKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getVariationSettings implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getTypeface serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ getVariationSettings(getTypeface gettypeface, int i, int i2) {
        this.write = i2;
        this.serializer = gettypeface;
        this.IconCompatParcelizer = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 17;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ((Integer) obj2).intValue();
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.write;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i4 = this.IconCompatParcelizer;
        getTypeface gettypeface = this.serializer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).intValue();
        if (i3 != 0) {
            DeliveryDetailsContentKt.write(10994189, new Object[]{gettypeface, getbirthdatefull, Integer.valueOf(ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1))}, -10994189, ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), ff.IconCompatParcelizer(), ff.IconCompatParcelizer());
            return createfromparcel2;
        }
        TagsContentKt.write(gettypeface, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(1 | i4));
        int i5 = read + 73;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel2;
    }
}
