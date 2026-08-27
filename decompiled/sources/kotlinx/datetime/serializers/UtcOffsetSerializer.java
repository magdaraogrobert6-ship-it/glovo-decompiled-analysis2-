package kotlinx.datetime.serializers;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import kotlin.ranges.RangesKt;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.UtcOffset$Companion;
import o.BrazeInAppMessageParams;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class UtcOffsetSerializer implements setGraphicModalMaxWidthDp {
    public static final UtcOffsetSerializer read = new UtcOffsetSerializer();
    public static final DefaultInAppMessageWebViewClientListenerCompanion IconCompatParcelizer = RangesKt.read("UtcOffset");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        UtcOffset$Companion utcOffset$Companion = BrazeInAppMessageParams.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        utcOffset$Companion.getClass();
        strResultReceiver.getClass();
        try {
            return new BrazeInAppMessageParams(ZoneOffset.of(strResultReceiver));
        } catch (DateTimeException e) {
            throw new DateTimeFormatException(e);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        BrazeInAppMessageParams brazeInAppMessageParams = (BrazeInAppMessageParams) obj;
        brazeInAppMessageParams.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(brazeInAppMessageParams.toString());
    }
}
