package o;

import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import java.util.List;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AnimationSearchTransitionSearch {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final getMaxDurationPerIterationMillis IconCompatParcelizer;
    public final divYEO4UFw RemoteActionCompatParcelizer;
    public final setInitialStateToCurrentAnimationValue read;
    public final r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI serializer;
    public final BrazeExternalSyntheticLambda206 write;

    public AnimationSearchTransitionSearch(BrazeExternalSyntheticLambda206 brazeExternalSyntheticLambda206, getMaxDurationPerIterationMillis getmaxdurationperiterationmillis, r8lambdaCDGnLpXSlCStkEf_lDjAOZ3VoI r8lambdacdgnlpxslcstkef_ldjaoz3voi, divYEO4UFw divyeo4ufw, setInitialStateToCurrentAnimationValue setinitialstatetocurrentanimationvalue) {
        brazeExternalSyntheticLambda206.getClass();
        getmaxdurationperiterationmillis.getClass();
        r8lambdacdgnlpxslcstkef_ldjaoz3voi.getClass();
        divyeo4ufw.getClass();
        setinitialstatetocurrentanimationvalue.getClass();
        this.write = brazeExternalSyntheticLambda206;
        this.IconCompatParcelizer = getmaxdurationperiterationmillis;
        this.serializer = r8lambdacdgnlpxslcstkef_ldjaoz3voi;
        this.RemoteActionCompatParcelizer = divyeo4ufw;
        this.read = setinitialstatetocurrentanimationvalue;
    }

    public final onViewAttachedToWindowlambda0 serializer(matchFontRetOiIg matchfontretoiig) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = ((FirebaseRemoteConfigImpl) this.IconCompatParcelizer.serializer).IconCompatParcelizer;
        if (firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
            int i4 = MediaDescriptionCompat + 51;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 53;
            MediaDescriptionCompat = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else if (firebaseRemoteConfigProvider.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_TAKE_PHOTO_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Take photo is disabled for task id ", matchfontretoiig.RemoteActionCompatParcelizer()), new Object[0]);
            int i9 = MediaBrowserCompatMediaItem + 89;
            MediaDescriptionCompat = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            Object obj = null;
            if (i9 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        return new onViewAttachedToWindowlambda0(this.RemoteActionCompatParcelizer.serializer(matchfontretoiig), matchfontretoiig.RemoteActionCompatParcelizer());
    }

    public final onViewAttachedToWindowlambda0 read(resolveDPcqOEQ resolvedpcqoeq) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        ComposeAnimationState composeAnimationStateSerializer = null;
        if (i2 % 2 == 0) {
            ((FirebaseRemoteConfigImpl) this.serializer.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED.getFirebaseFlagName());
            throw null;
        }
        if (((FirebaseRemoteConfigImpl) this.serializer.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
            int i3 = MediaDescriptionCompat + 121;
            MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("CustomerUnavailableTaskMapper: ivrTask: IVR call feature is disabled on Remote Config. Flag Name: customer_unavailable_ivr_call_killswitch", Timber.RemoteActionCompatParcelizer);
                return null;
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("CustomerUnavailableTaskMapper: ivrTask: IVR call feature is disabled on Remote Config. Flag Name: customer_unavailable_ivr_call_killswitch", Timber.RemoteActionCompatParcelizer);
            composeAnimationStateSerializer.hashCode();
            throw null;
        }
        String strRemoteActionCompatParcelizer = resolvedpcqoeq.RemoteActionCompatParcelizer();
        String strRatingCompat = resolvedpcqoeq.RatingCompat();
        String strIconCompatParcelizer = resolvedpcqoeq.IconCompatParcelizer();
        String strSerializer = resolvedpcqoeq.serializer();
        getDismissOnBackPress getdismissonbackpress = resolvedpcqoeq.read();
        if (getdismissonbackpress != null) {
            int i4 = MediaDescriptionCompat + 87;
            MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            composeAnimationStateSerializer = this.read.serializer(getdismissonbackpress);
            int i6 = MediaBrowserCompatMediaItem + 35;
            MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return new onViewAttachedToWindowlambda0(new asTree(strRemoteActionCompatParcelizer, strRatingCompat, strIconCompatParcelizer, strSerializer, composeAnimationStateSerializer, resolvedpcqoeq.write()), resolvedpcqoeq.RemoteActionCompatParcelizer());
    }

    public final onViewAttachedToWindowlambda0 serializer(FontResourceLoader fontResourceLoader) {
        int i = 2 % 2;
        getNoopState getnoopstateWrite = null;
        if (((FirebaseRemoteConfigImpl) this.serializer.serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_CUSTOMER_UNAVAILABLE_IVR_CALL_KILLSWITCH_ENABLED.getFirebaseFlagName())) {
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("CustomerUnavailableTaskMapper: countdownTime: IVR call feature is disabled on Remote Config. Flag Name: customer_unavailable_ivr_call_killswitch", Timber.RemoteActionCompatParcelizer);
            return null;
        }
        String str = fontResourceLoader.read();
        String strMediaSessionCompatQueueItem = fontResourceLoader.MediaSessionCompatQueueItem();
        String strWrite = fontResourceLoader.write();
        String strSerializer = fontResourceLoader.serializer();
        String strRemoteActionCompatParcelizer = fontResourceLoader.RemoteActionCompatParcelizer();
        int iRatingCompat = fontResourceLoader.RatingCompat();
        getWindowTitle getwindowtitle = (getWindowTitle) FontResourceLoader.RemoteActionCompatParcelizer(new Object[]{fontResourceLoader}, BackspaceCommand.write(), BackspaceCommand.write(), -1781365444, BackspaceCommand.write(), 1781365445, BackspaceCommand.write());
        if (getwindowtitle != null) {
            int i2 = MediaBrowserCompatMediaItem + 65;
            MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                this.read.getClass();
                setInitialStateToCurrentAnimationValue.write(getwindowtitle);
                throw null;
            }
            this.read.getClass();
            getnoopstateWrite = setInitialStateToCurrentAnimationValue.write(getwindowtitle);
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(new boundsOfLayoutNode(str, strMediaSessionCompatQueueItem, strWrite, strSerializer, strRemoteActionCompatParcelizer, iRatingCompat, getnoopstateWrite, fontResourceLoader.IconCompatParcelizer(), (List) FontResourceLoader.RemoteActionCompatParcelizer(new Object[]{fontResourceLoader}, BackspaceCommand.write(), BackspaceCommand.write(), 736541880, BackspaceCommand.write(), -736541880, BackspaceCommand.write())), fontResourceLoader.read());
        int i3 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onviewattachedtowindowlambda0;
    }
}
