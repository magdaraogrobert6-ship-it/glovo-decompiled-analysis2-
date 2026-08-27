package kotlinx.datetime.serializers;

import kotlin.ranges.RangesKt;
import kotlinx.datetime.DateTimePeriod$Companion;
import kotlinx.serialization.SerializationException;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setBackButtonDismissesInAppMessageView;
import o.setClickOutsideModalViewDismissInAppMessageView;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
public final class DatePeriodIso8601Serializer implements setGraphicModalMaxWidthDp {
    public static final DatePeriodIso8601Serializer IconCompatParcelizer = new DatePeriodIso8601Serializer();
    public static final DefaultInAppMessageWebViewClientListenerCompanion serializer = RangesKt.read("DatePeriod");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return serializer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        DateTimePeriod$Companion dateTimePeriod$Companion = setBackButtonDismissesInAppMessageView.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        dateTimePeriod$Companion.getClass();
        setBackButtonDismissesInAppMessageView setbackbuttondismissesinappmessageviewWrite = DateTimePeriod$Companion.write(strResultReceiver);
        if (setbackbuttondismissesinappmessageviewWrite instanceof setClickOutsideModalViewDismissInAppMessageView) {
            return (setClickOutsideModalViewDismissInAppMessageView) setbackbuttondismissesinappmessageviewWrite;
        }
        throw new SerializationException(setbackbuttondismissesinappmessageviewWrite + " is not a date-based period");
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        setClickOutsideModalViewDismissInAppMessageView setclickoutsidemodalviewdismissinappmessageview = (setClickOutsideModalViewDismissInAppMessageView) obj;
        setclickoutsidemodalviewdismissinappmessageview.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(setclickoutsidemodalviewdismissinappmessageview.toString());
    }
}
