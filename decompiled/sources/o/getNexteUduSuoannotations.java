package o;

import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import com.roadrunner.delivery.ontheway.chatfloating.presentation.CustomerChatFloatingButtonUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getNexteUduSuoannotations implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getDoneeUduSuoannotations serializer;

    public /* synthetic */ getNexteUduSuoannotations(getDoneeUduSuoannotations getdoneeudusuoannotations, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = getdoneeudusuoannotations;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getDoneeUduSuoannotations getdoneeudusuoannotations = this.serializer;
        getStyleTiuSbCo getstyletiusbco = (getStyleTiuSbCo) obj;
        if (i4 != 0) {
            getstyletiusbco.getClass();
            LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl = (LegacyCustomerChatCommunicatorImpl) ((CustomerChatFloatingButtonUiModel) getdoneeudusuoannotations).IconCompatParcelizer.write.write();
            legacyCustomerChatCommunicatorImpl.RemoteActionCompatParcelizer.invoke(createfromparcel);
            legacyCustomerChatCommunicatorImpl.write.invoke(createfromparcel);
            return new TypefaceResultImmutable(2);
        }
        getstyletiusbco.getClass();
        LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl2 = (LegacyCustomerChatCommunicatorImpl) ((CustomerChatFloatingButtonUiModel) getdoneeudusuoannotations).IconCompatParcelizer.write.write();
        legacyCustomerChatCommunicatorImpl2.RemoteActionCompatParcelizer.invoke(createfromparcel);
        legacyCustomerChatCommunicatorImpl2.write.invoke(createfromparcel);
        TypefaceResultImmutable typefaceResultImmutable = new TypefaceResultImmutable(3);
        int i5 = read + 41;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return typefaceResultImmutable;
    }
}
