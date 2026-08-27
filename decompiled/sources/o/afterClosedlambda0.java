package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class afterClosedlambda0 implements setGraphicModalMaxWidthDp {
    public static final afterClosedlambda0 write = new afterClosedlambda0();
    public static final DefaultInAppMessageWebViewClientListenerCompanion RemoteActionCompatParcelizer = new DefaultInAppMessageWebViewClientListenerCompanion("kotlin.time.Duration", DefaultInAppMessageModalViewFactory.RatingCompat);

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return RemoteActionCompatParcelizer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        String strResultReceiver = defaultInAppMessageModalViewFactoryCompanion.ResultReceiver();
        strResultReceiver.getClass();
        try {
            long jRemoteActionCompatParcelizer = coil3.UriKt.RemoteActionCompatParcelizer(strResultReceiver);
            if (BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(jRemoteActionCompatParcelizer, BrazeInAppMessageManagerExternalSyntheticLambda2.read)) {
                throw new IllegalStateException("invariant failed");
            }
            return new BrazeInAppMessageManagerExternalSyntheticLambda2(jRemoteActionCompatParcelizer);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ff$$ExternalSyntheticOutline0.m("Invalid ISO duration string format: '", strResultReceiver, "'."), e);
        }
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        long j = ((BrazeInAppMessageManagerExternalSyntheticLambda2) obj).IconCompatParcelizer;
        unregisterInAppMessageManager unregisterinappmessagemanager = BrazeInAppMessageManagerExternalSyntheticLambda2.write;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jMediaSessionCompatQueueItem = j < 0 ? BrazeInAppMessageManagerExternalSyntheticLambda2.MediaSessionCompatQueueItem(j) : j;
        long jRemoteActionCompatParcelizer = BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.HOURS);
        boolean z = false;
        int iRemoteActionCompatParcelizer = BrazeInAppMessageManagerExternalSyntheticLambda2.read(jMediaSessionCompatQueueItem) ? 0 : (int) (BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.MINUTES) % 60);
        int iRemoteActionCompatParcelizer2 = BrazeInAppMessageManagerExternalSyntheticLambda2.read(jMediaSessionCompatQueueItem) ? 0 : (int) (BrazeInAppMessageManagerExternalSyntheticLambda2.RemoteActionCompatParcelizer(jMediaSessionCompatQueueItem, setUnregisteredInAppMessage.SECONDS) % 60);
        int iSerializer = BrazeInAppMessageManagerExternalSyntheticLambda2.serializer(jMediaSessionCompatQueueItem);
        if (BrazeInAppMessageManagerExternalSyntheticLambda2.read(j)) {
            jRemoteActionCompatParcelizer = 9999999999999L;
        }
        boolean z2 = jRemoteActionCompatParcelizer != 0;
        boolean z3 = (iRemoteActionCompatParcelizer2 == 0 && iSerializer == 0) ? false : true;
        if (iRemoteActionCompatParcelizer != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jRemoteActionCompatParcelizer);
            sb.append('H');
        }
        if (z) {
            sb.append(iRemoteActionCompatParcelizer);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            BrazeInAppMessageManagerExternalSyntheticLambda2.IconCompatParcelizer(sb, iRemoteActionCompatParcelizer2, iSerializer, 9, "S", true);
        }
        defaultInAppMessageViewWrapperFactory.IconCompatParcelizer(sb.toString());
    }
}
