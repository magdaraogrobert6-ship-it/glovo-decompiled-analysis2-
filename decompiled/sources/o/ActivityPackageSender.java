package o;

import com.roadrunner.rrds.compose.component.buttons.slider.SliderButtonContainerKt$SliderCore$2$1$1$3$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ActivityPackageSender implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ float RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.animation.core.Animatable read;
    public final /* synthetic */ getContentViewGroupParentLayout serializer;
    public final /* synthetic */ float write;

    public /* synthetic */ ActivityPackageSender(getContentViewGroupParentLayout getcontentviewgroupparentlayout, androidx.compose.animation.core.Animatable animatable, float f, float f2) {
        this.serializer = getcontentviewgroupparentlayout;
        this.read = animatable;
        this.write = f;
        this.RemoteActionCompatParcelizer = f2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        float fFloatValue = ((Float) obj2).floatValue();
        ((androidx.compose.ui.input.pointer.PointerInputChange) obj).getClass();
        BuildersKt.RemoteActionCompatParcelizer(this.serializer, null, null, new SliderButtonContainerKt$SliderCore$2$1$1$3$1(this.read, fFloatValue, this.write, this.RemoteActionCompatParcelizer, null), 3);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i2 = MediaSessionCompatQueueItem + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return createfromparcel;
    }
}
