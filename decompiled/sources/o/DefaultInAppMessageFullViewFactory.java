package o;

import kotlin.ranges.RangesKt;
import kotlinx.datetime.TimeZone$Companion;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageFullViewFactory implements setGraphicModalMaxWidthDp {
    public static final DefaultInAppMessageFullViewFactory serializer = new DefaultInAppMessageFullViewFactory();
    public static final DefaultInAppMessageWebViewClientListenerCompanion IconCompatParcelizer = RangesKt.read("TimeZone");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return IconCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        TimeZone$Companion timeZone$Companion = getGraphicModalMaxHeightDp.Companion;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        timeZone$Companion.getClass();
        return TimeZone$Companion.serializer(strResultReceiver);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        getGraphicModalMaxHeightDp getgraphicmodalmaxheightdp = (getGraphicModalMaxHeightDp) obj;
        getgraphicmodalmaxheightdp.getClass();
        String id = getgraphicmodalmaxheightdp.zoneId.getId();
        id.getClass();
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(id);
    }
}
