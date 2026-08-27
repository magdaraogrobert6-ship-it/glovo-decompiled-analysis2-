package o;

import kotlin.ranges.RangesKt;
import kotlinx.datetime.DateTimePeriod$Companion;

/* JADX INFO: loaded from: classes5.dex */
public final class setGraphicModalMaxHeightDp implements setGraphicModalMaxWidthDp {
    public static final setGraphicModalMaxHeightDp read = new setGraphicModalMaxHeightDp();
    public static final DefaultInAppMessageWebViewClientListenerCompanion write = RangesKt.read("DateTimePeriod");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        DateTimePeriod$Companion dateTimePeriod$Companion = setBackButtonDismissesInAppMessageView.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        dateTimePeriod$Companion.getClass();
        return DateTimePeriod$Companion.write(strResultReceiver);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setBackButtonDismissesInAppMessageView setbackbuttondismissesinappmessageview = (setBackButtonDismissesInAppMessageView) obj;
        setbackbuttondismissesinappmessageview.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(setbackbuttondismissesinappmessageview.toString());
    }
}
