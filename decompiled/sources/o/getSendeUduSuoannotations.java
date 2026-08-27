package o;

import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatBottomSheetButtonContainerKt;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonContainerKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getSendeUduSuoannotations implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ getDoneeUduSuoannotations RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ int write;

    public /* synthetic */ getSendeUduSuoannotations(getDoneeUduSuoannotations getdoneeudusuoannotations, int i, int i2) {
        this.write = i2;
        this.RemoteActionCompatParcelizer = getdoneeudusuoannotations;
        this.read = i;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i3 = this.read;
        getDoneeUduSuoannotations getdoneeudusuoannotations = this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        ((Integer) obj2).intValue();
        if (i2 == 0) {
            CustomerChatFloatingButtonContainerKt.CustomerChatFloatingButtonContainer(getdoneeudusuoannotations, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
            int i4 = IconCompatParcelizer + 41;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return createfromparcel;
        }
        CustomerChatBottomSheetButtonContainerKt.CustomerChatBottomSheetButtonContainer(getdoneeudusuoannotations, getbirthdatefull, ContentType_androidKt.RemoteActionCompatParcelizer(i3 | 1));
        int i6 = serializer + 65;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 27 / 0;
        }
        return createfromparcel;
    }
}
