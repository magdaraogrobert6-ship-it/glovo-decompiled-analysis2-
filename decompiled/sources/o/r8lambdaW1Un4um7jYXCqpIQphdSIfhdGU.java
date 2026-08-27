package o;

import kotlin.ranges.RangesKt;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaW1Un4um7jYXCqpIQphdSIfhdGU implements setGraphicModalMaxWidthDp {
    public static final r8lambdaW1Un4um7jYXCqpIQphdSIfhdGU write = new r8lambdaW1Un4um7jYXCqpIQphdSIfhdGU();
    public static final DefaultInAppMessageWebViewClientListenerCompanion read = RangesKt.read("kotlinx.serialization.json.JsonLiteral");

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return read;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U r8lambdayxkvph92afxpw6k5kds4_5qza1u = (r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U) obj;
        r8lambdayxkvph92afxpw6k5kds4_5qza1u.getClass();
        String str = r8lambdayxkvph92afxpw6k5kds4_5qza1u.read;
        ModuleDSLKt.read(defaultInAppMessageViewWrapperFactory);
        if (r8lambdayxkvph92afxpw6k5kds4_5qza1u.serializer) {
            defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(str);
            return;
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = r8lambdayxkvph92afxpw6k5kds4_5qza1u.IconCompatParcelizer;
        if (r8lambda92m0p9sit5uf70mvjf4rwmruda != null) {
            defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda).IconCompatParcelizer(str);
            return;
        }
        Long lParcelableVolumeInfo = setCarryoverInAppMessage.ParcelableVolumeInfo(str);
        if (lParcelableVolumeInfo != null) {
            defaultInAppMessageViewWrapperFactory.serializer(lParcelableVolumeInfo.longValue());
            return;
        }
        describeContents describecontents = resetAfterInAppMessageClose.read(str);
        if (describecontents != null) {
            defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(handleHorizontalActionUp.read).serializer(describecontents.write);
            return;
        }
        Double dMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(str);
        if (dMediaMetadataCompat != null) {
            defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(dMediaMetadataCompat.doubleValue());
            return;
        }
        Boolean boolWrite = hideCurrentlyDisplayingInAppMessage.write(str);
        if (boolWrite != null) {
            defaultInAppMessageViewWrapperFactory.RemoteActionCompatParcelizer(boolWrite.booleanValue());
        } else {
            defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(str);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection = ModuleDSLKt.RemoteActionCompatParcelizer(defaultInAppMessageModalViewFactoryCompanion).read();
        if (swipeDismissTouchListenerVerticalDismissDirection instanceof r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U) {
            return (r8lambdaYXKvph92AFXPW6K5kDS4_5qza1U) swipeDismissTouchListenerVerticalDismissDirection;
        }
        throw coil3.util.IntPair.IconCompatParcelizer(swipeDismissTouchListenerVerticalDismissDirection.toString(), -1, "Unexpected JSON element, expected JsonLiteral, had " + displayInAppMessagelambda1.serializer(swipeDismissTouchListenerVerticalDismissDirection.getClass()));
    }
}
