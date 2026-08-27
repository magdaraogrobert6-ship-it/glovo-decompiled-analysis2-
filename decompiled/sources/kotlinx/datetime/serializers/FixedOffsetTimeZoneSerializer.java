package kotlinx.datetime.serializers;

import kotlin.ranges.RangesKt;
import kotlinx.datetime.TimeZone$Companion;
import kotlinx.serialization.SerializationException;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DefaultInAppMessageWebViewClientListenerCompanion;
import o.InAppMessageManagerBaseExternalSyntheticLambda2;
import o.getGraphicModalMaxHeightDp;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
public final class FixedOffsetTimeZoneSerializer implements setGraphicModalMaxWidthDp {
    public static final FixedOffsetTimeZoneSerializer IconCompatParcelizer = new FixedOffsetTimeZoneSerializer();
    public static final DefaultInAppMessageWebViewClientListenerCompanion read = RangesKt.read("FixedOffsetTimeZone");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) throws Exception {
        TimeZone$Companion timeZone$Companion = getGraphicModalMaxHeightDp.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        timeZone$Companion.getClass();
        getGraphicModalMaxHeightDp getgraphicmodalmaxheightdpSerializer = TimeZone$Companion.serializer(strResultReceiver);
        if (getgraphicmodalmaxheightdpSerializer instanceof InAppMessageManagerBaseExternalSyntheticLambda2) {
            return (InAppMessageManagerBaseExternalSyntheticLambda2) getgraphicmodalmaxheightdpSerializer;
        }
        throw new SerializationException("Timezone identifier '" + getgraphicmodalmaxheightdpSerializer + "' does not correspond to a fixed-offset timezone");
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        InAppMessageManagerBaseExternalSyntheticLambda2 inAppMessageManagerBaseExternalSyntheticLambda2 = (InAppMessageManagerBaseExternalSyntheticLambda2) obj;
        inAppMessageManagerBaseExternalSyntheticLambda2.getClass();
        String id = inAppMessageManagerBaseExternalSyntheticLambda2.zoneId.getId();
        id.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(id);
    }
}
