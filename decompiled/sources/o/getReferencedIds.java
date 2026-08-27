package o;

import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.diagnostics.domain.CheckDeviceTokenUseCase;
import com.roadrunner.diagnostics.domain.FixTokenUseCase;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.diagnostics.presentation.view.DiagnosticsUiStateMapper;
import com.roadrunner.login.logging.OtpLogger;
import com.ui.common.base.BaseRxViewModel;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class getReferencedIds extends BaseRxViewModel {
    private static int ComponentActivity = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final BrazeLogger IconCompatParcelizer;
    public final CheckDeviceTokenUseCase MediaBrowserCompatMediaItem;
    public final DiagnosticsUiStateMapper MediaDescriptionCompat;
    public final SharedResourcePool MediaMetadataCompat;
    public final OtpLogger MediaSessionCompatQueueItem;
    public final getButtonXEK5gGoQ MediaSessionCompatResultReceiverWrapper;
    public final SendTestPushUseCase MediaSessionCompatToken;
    public final AndroidGraphicsContext2 ParcelableVolumeInfo;
    public final getAllSemanticsNodesToMap PlaybackStateCompat;
    public final setTransactionSuccessful PlaybackStateCompatCustomAction;
    public final FixTokenUseCase RatingCompat;
    public final ConstraintHelper RemoteActionCompatParcelizer;
    public final com.huawei.agconnect.config.impl.m read;
    public final EnumColumnAdapter serializer;
    public final makeNativePaint write;

    public final void RemoteActionCompatParcelizer() {
        makeNativePaint makenativepaint = this.write;
        getButtonXEK5gGoQ getbuttonxek5ggoq = this.MediaSessionCompatResultReceiverWrapper;
        synchronized (makenativepaint.MediaDescriptionCompat) {
            ArrayList arrayList = (ArrayList) makenativepaint.MediaDescriptionCompat.remove(getbuttonxek5ggoq);
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                setNativeAlpha setnativealpha = (setNativeAlpha) arrayList.get(size);
                setnativealpha.write = true;
                for (int i = 0; i < setnativealpha.read.countActions(); i++) {
                    String action = setnativealpha.read.getAction(i);
                    ArrayList arrayList2 = (ArrayList) makenativepaint.write.get(action);
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            setNativeAlpha setnativealpha2 = (setNativeAlpha) arrayList2.get(size2);
                            if (setnativealpha2.IconCompatParcelizer == getbuttonxek5ggoq) {
                                setnativealpha2.write = true;
                                arrayList2.remove(size2);
                            }
                        }
                        if (arrayList2.size() <= 0) {
                            makenativepaint.write.remove(action);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getReferencedIds(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, ConstraintHelper constraintHelper, CheckDeviceTokenUseCase checkDeviceTokenUseCase, FixTokenUseCase fixTokenUseCase, SendTestPushUseCase sendTestPushUseCase, DiagnosticsUiStateMapper diagnosticsUiStateMapper, makeNativePaint makenativepaint, setTransactionSuccessful settransactionsuccessful, com.huawei.agconnect.config.impl.m mVar, OtpLogger otpLogger, getAllSemanticsNodesToMap getallsemanticsnodestomap, EnumColumnAdapter enumColumnAdapter, SharedResourcePool sharedResourcePool) {
        super(getpivotoffsetf1c5bw0);
        getpivotoffsetf1c5bw0.getClass();
        constraintHelper.getClass();
        checkDeviceTokenUseCase.getClass();
        fixTokenUseCase.getClass();
        sendTestPushUseCase.getClass();
        diagnosticsUiStateMapper.getClass();
        makenativepaint.getClass();
        settransactionsuccessful.getClass();
        mVar.getClass();
        otpLogger.getClass();
        getallsemanticsnodestomap.getClass();
        enumColumnAdapter.getClass();
        sharedResourcePool.getClass();
        this.RemoteActionCompatParcelizer = constraintHelper;
        this.MediaBrowserCompatMediaItem = checkDeviceTokenUseCase;
        this.RatingCompat = fixTokenUseCase;
        this.MediaSessionCompatToken = sendTestPushUseCase;
        this.MediaDescriptionCompat = diagnosticsUiStateMapper;
        this.write = makenativepaint;
        this.PlaybackStateCompatCustomAction = settransactionsuccessful;
        this.read = mVar;
        this.MediaSessionCompatQueueItem = otpLogger;
        this.PlaybackStateCompat = getallsemanticsnodestomap;
        this.serializer = enumColumnAdapter;
        this.MediaMetadataCompat = sharedResourcePool;
        setTransactionSuccessful settransactionsuccessful2 = diagnosticsUiStateMapper.IconCompatParcelizer;
        BrazeLogger brazeLogger = new BrazeLogger(new getMaxHeight(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_title), null, new setReferenceTags(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_app_permission_item)), new checkLayoutParams(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item)), new checkLayoutParams(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item))));
        this.IconCompatParcelizer = brazeLogger;
        this.ParcelableVolumeInfo = brazeLogger.RemoteActionCompatParcelizer;
        this.MediaSessionCompatResultReceiverWrapper = new getButtonXEK5gGoQ(5, this);
    }

    @Override // com.ui.common.base.BaseRxViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        int i = 2 % 2;
        int i2 = ComponentActivity + 3;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer();
            super.onCleared();
            int i3 = 54 / 0;
        } else {
            RemoteActionCompatParcelizer();
            super.onCleared();
        }
        int i4 = ComponentActivity + 33;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Start sending test push", new Object[0]);
        BrazeLogger brazeLogger = this.IconCompatParcelizer;
        getMaxHeight getmaxheight = (getMaxHeight) brazeLogger.write();
        brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(getMaxHeight.read(getmaxheight, null, null, null, null, new setReferenceTags(this.PlaybackStateCompatCustomAction.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item)), 15));
        r8lambdaN89jNSW0cXSKUcRoByrTjwCSWzE.serializer(this, new AuthRepository$logoutUser$2(this, getmaxheight, null, 14));
        int i2 = ComponentActivity + 125;
        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
    }
}
