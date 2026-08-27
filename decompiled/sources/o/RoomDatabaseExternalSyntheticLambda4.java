package o;

import com.roadrunner.delivery.state.TrackingEvent$$serializer;
import com.roadrunner.home.nest.api.data.TierType;
import com.roadrunner.home.nest.api.data.Type;
import java.lang.annotation.Annotation;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import kotlinx.serialization.internal.EnumSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RoomDatabaseExternalSyntheticLambda4 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ RoomDatabaseExternalSyntheticLambda4(int i) {
        this.serializer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        String str = null;
        boolean z = false;
        switch (this.serializer) {
            case 0:
                return new DateTimeFormatterBuilder().append(DateTimeFormatter.ISO_LOCAL_DATE).appendLiteral('T').append(DateTimeFormatter.ISO_LOCAL_TIME).optionalStart().appendOffset("+HHMM", "+0000").optionalEnd().optionalStart().appendOffsetId().optionalEnd().toFormatter(java.util.Locale.ROOT);
            case 1:
                return new BrazeLogger(new getPopDirection(str, 7, z));
            case 2:
                return new setWasCloseMessageCalled(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, 0);
            case 3:
                return new EnumSerializer("com.roadrunner.home.nest.api.data.DividerComponent", onActivityStarted.INSTANCE, new Annotation[0]);
            case 4:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 5:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 6:
                return new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
            case 7:
                return new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
            case 8:
                return new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
            case 9:
                return new setWasCloseMessageCalled(getZipCrc.read, 0);
            case 10:
                return new setWasCloseMessageCalled(WithLifecycleStateKtsuspendWithStateAtLeastUnchecked2observer1.write, 0);
            case 11:
                return new setWasCloseMessageCalled(BuildConfig.RemoteActionCompatParcelizer, 0);
            case 12:
                return new EnumSerializer("com.roadrunner.home.nest.api.data.RiderOfflineComponent", getDexClassloader.INSTANCE, new Annotation[0]);
            case 13:
                setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(makeDexElements.IconCompatParcelizer, 0);
                int i2 = RemoteActionCompatParcelizer + 17;
                IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return setwasclosemessagecalled;
            case 14:
                return new setWasCloseMessageCalled(closeQuietly.RemoteActionCompatParcelizer, 0);
            case 15:
                beforeOpened beforeopened = new beforeOpened(beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, packFloats.read);
                int i4 = IconCompatParcelizer + 91;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return beforeopened;
                }
                str.hashCode();
                throw null;
            case 16:
                return TierType.$r8$lambda$dG6hF9qiF45IVs1KKRAtIx6dErY();
            case 17:
                return new setWasCloseMessageCalled(extract.write, 0);
            case 18:
                return new setWasCloseMessageCalled(TrackingEvent$$serializer.write, 0);
            case 19:
                return Type.$r8$lambda$gyRHiRkcTIiLns7ZzS_UuDrCU24();
            case 20:
                return new EnumSerializer("com.roadrunner.home.nest.api.data.WorkSettingsComponent", invokeSuspendcomroadrunnerinappnotificationsdataInAppNotificationsRepositoryfetchAndSaveInAppMessage21.INSTANCE, new Annotation[0]);
            case 21:
                setWasCloseMessageCalled setwasclosemessagecalled2 = new setWasCloseMessageCalled(onDismissed.write, 0);
                int i5 = RemoteActionCompatParcelizer + 55;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return setwasclosemessagecalled2;
            case 22:
                return new DefaultInAppMessageHtmlFullViewFactory("com.roadrunner.inappnotifications.data.ButtonAction", displayInAppMessagelambda1.serializer(releaseHorizontalGlow.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(releaseGlows.class), displayInAppMessagelambda1.serializer(setEdgeEffectFactory.class), displayInAppMessagelambda1.serializer(setScrollingTouchSlop.class)}, new setGraphicModalMaxWidthDp[]{new EnumSerializer("close_screen", releaseGlows.INSTANCE, new Annotation[]{new setRecycledViewPool("type")}), setOnFlingListener.IconCompatParcelizer, new EnumSerializer("share_content", setScrollingTouchSlop.INSTANCE, new Annotation[]{new setRecycledViewPool("type")})}, new Annotation[]{new setRecycledViewPool("type")});
            case 23:
                return releaseHorizontalGlow.Companion.serializer();
            case 24:
                return new EnumSerializer("close_screen", releaseGlows.INSTANCE, new Annotation[]{new setRecycledViewPool("type")});
            case 25:
                return new setWasCloseMessageCalled(setPreserveFocusAfterLayout.read, 0);
            case 26:
                return new setWasCloseMessageCalled(setLayoutManager.Companion.serializer(), 0);
            case 27:
                return new setWasCloseMessageCalled(setRecyclerListener.Companion.serializer(), 0);
            case 28:
                return new EnumSerializer("share_content", setScrollingTouchSlop.INSTANCE, new Annotation[]{new setRecycledViewPool("type")});
            default:
                SurfaceRequestRequestCancelledException surfaceRequestRequestCancelledException = new SurfaceRequestRequestCancelledException(CameraRepository.serializer(new getCameraProvider(1).serializer));
                getImageFormatdefault.read(surfaceRequestRequestCancelledException);
                return new getWrapper(surfaceRequestRequestCancelledException);
        }
    }
}
