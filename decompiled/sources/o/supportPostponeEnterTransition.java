package o;

import androidx.cardview.widget.CardView$1;
import com.foodora.courier.legacy.ui.main.MainPresenter;
import com.foodora.courier.main.presentation.MainActivity;
import com.roadrunner.appupdate.PlayStoreBasedAppUpdate;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import com.roadrunner.customerchat.selfservice.domain.ChatUrlProviderImpl;
import com.roadrunner.customerchat.selfservice.domain.analytics.WebChatEventsTrackerImpl;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class supportPostponeEnterTransition implements getColorIntegerOrNulllambda0 {
    private static int MediaSessionCompatToken = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaMetadataCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatQueueItem;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ MediaSessionCompatResultReceiverWrapper;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ PlaybackStateCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RatingCompat;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final Object serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public supportPostponeEnterTransition(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, getBrushSizeVsRJwc0ui_text getbrushsizevsrjwc0ui_text, postAnimationRunner postanimationrunner, getBrushSizeVsRJwc0ui_text getbrushsizevsrjwc0ui_text2, getBrushSizeVsRJwc0ui_text getbrushsizevsrjwc0ui_text3, lineEndToVisibleEnd lineendtovisibleend, publishErrorlambda1 publisherrorlambda1, SemanticsPropertiesFillableData1 semanticsPropertiesFillableData1, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me, readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery) {
        this.IconCompatParcelizer = 0;
        dataModule_ProvideSchedulerFactory.getClass();
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        getbrushsizevsrjwc0ui_text.getClass();
        postanimationrunner.getClass();
        getbrushsizevsrjwc0ui_text2.getClass();
        getbrushsizevsrjwc0ui_text3.getClass();
        lineendtovisibleend.getClass();
        publisherrorlambda1.getClass();
        semanticsPropertiesFillableData1.getClass();
        r8lambdazvx83uidsl68vmn7rpqxcy0me.getClass();
        this.serializer = dataModule_ProvideSchedulerFactory;
        this.read = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.MediaBrowserCompatMediaItem = getbrushsizevsrjwc0ui_text;
        this.MediaMetadataCompat = postanimationrunner;
        this.write = getbrushsizevsrjwc0ui_text2;
        this.RatingCompat = getbrushsizevsrjwc0ui_text3;
        this.MediaSessionCompatQueueItem = lineendtovisibleend;
        this.MediaSessionCompatResultReceiverWrapper = publisherrorlambda1;
        this.RemoteActionCompatParcelizer = semanticsPropertiesFillableData1;
        this.PlaybackStateCompat = r8lambdazvx83uidsl68vmn7rpqxcy0me;
        this.MediaDescriptionCompat = readinstallreferrerhuaweiappgallery;
    }

    public /* synthetic */ supportPostponeEnterTransition(Object obj, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, mergeJsonObjects mergejsonobjects, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, mergeJsonObjects mergejsonobjects5, mergeJsonObjects mergejsonobjects6, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, mergeJsonObjects mergejsonobjects7, mergeJsonObjects mergejsonobjects8, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.read = getcolorintegerornulllambda0;
        this.MediaBrowserCompatMediaItem = mergejsonobjects;
        this.MediaMetadataCompat = mergejsonobjects2;
        this.write = mergejsonobjects3;
        this.RatingCompat = mergejsonobjects4;
        this.MediaSessionCompatQueueItem = mergejsonobjects5;
        this.MediaSessionCompatResultReceiverWrapper = mergejsonobjects6;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda1;
        this.PlaybackStateCompat = mergejsonobjects7;
        this.MediaDescriptionCompat = mergejsonobjects8;
    }

    public supportPostponeEnterTransition(CardView$1 cardView$1, mergeJsonObjects mergejsonobjects, indexForKey indexforkey, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, mergeJsonObjects mergejsonobjects2, mergeJsonObjects mergejsonobjects3, mergeJsonObjects mergejsonobjects4, invokeqtAw6s invokeqtaw6s, invokeqtAw6s invokeqtaw6s2, mergeJsonObjects mergejsonobjects5) {
        this.IconCompatParcelizer = 2;
        this.serializer = mergejsonobjects;
        this.read = indexforkey;
        this.MediaBrowserCompatMediaItem = dataModule_ProvideSchedulerFactory;
        this.MediaMetadataCompat = transactionwithresultsuspendimpl;
        this.write = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.RatingCompat = mergejsonobjects2;
        this.MediaSessionCompatQueueItem = mergejsonobjects3;
        this.MediaSessionCompatResultReceiverWrapper = mergejsonobjects4;
        this.RemoteActionCompatParcelizer = invokeqtaw6s;
        this.PlaybackStateCompat = invokeqtaw6s2;
        this.MediaDescriptionCompat = mergejsonobjects5;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompatCustomAction + 1;
        MediaSessionCompatToken = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.MediaDescriptionCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.PlaybackStateCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.MediaSessionCompatResultReceiverWrapper;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq4 = this.MediaSessionCompatQueueItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq5 = this.RatingCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq6 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq7 = this.MediaMetadataCompat;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq8 = this.MediaBrowserCompatMediaItem;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq9 = this.read;
        Object obj = this.serializer;
        if (i4 == 0) {
            Object objWrite = ((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) obj).write();
            objWrite.getClass();
            clearUpdated clearupdated = (clearUpdated) objWrite;
            isMainThread ismainthread = (isMainThread) de.RemoteActionCompatParcelizer.write();
            Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq9.write();
            objWrite2.getClass();
            TextStyleKtWhenMappings textStyleKtWhenMappings = (TextStyleKtWhenMappings) objWrite2;
            Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq8.write();
            objWrite3.getClass();
            setDelegateForTestingui_text setdelegatefortestingui_text = (setDelegateForTestingui_text) objWrite3;
            getPreviouseUduSuoannotations getpreviouseudusuoannotations = (getPreviouseUduSuoannotations) getNoneeUduSuoannotations.write.write();
            io.sentry.util.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = (io.sentry.util.MediaBrowserCompatMediaItem) getActivity.read.write();
            accessisMainThread accessismainthread = (accessisMainThread) r8lambdaomEcPLn_Wg2DayhHJE1n6seBo.write.write();
            PackageHandler1 packageHandler1 = (PackageHandler1) sendFirstI.serializer.write();
            n4 n4Var = (n4) n5.read.write();
            accessgetMinimumcp accessgetminimumcp = (accessgetMinimumcp) getTightlzQqcRY.serializer.write();
            ResolvedTextDirection resolvedTextDirection = (ResolvedTextDirection) TextAlign.RemoteActionCompatParcelizer.write();
            getStarte0LSkKk getstarte0lskkk = (getStarte0LSkKk) getEnde0LSkKk.IconCompatParcelizer.write();
            getContentOrLtrs_7Xco getcontentorltrs_7xco = (getContentOrLtrs_7Xco) isSpecifiedHejc4pk.read.write();
            Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq7.write();
            objWrite4.getClass();
            setExitTransition setexittransition = (setExitTransition) objWrite4;
            LineHeightStyleCompanion lineHeightStyleCompanion = (LineHeightStyleCompanion) getTopPIaL0Z0.IconCompatParcelizer.write();
            getContainsAll getcontainsall = (getContainsAll) TextMeasurerCompanion.serializer.write();
            Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq6.write();
            objWrite5.getClass();
            AndroidParagraphIntrinsics androidParagraphIntrinsics = (AndroidParagraphIntrinsics) objWrite5;
            Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq5.write();
            objWrite6.getClass();
            AndroidParagraphIntrinsicsExternalSyntheticLambda0 androidParagraphIntrinsicsExternalSyntheticLambda0 = (AndroidParagraphIntrinsicsExternalSyntheticLambda0) objWrite6;
            Path$Companion path$Companion = (Path$Companion) ed.RemoteActionCompatParcelizer.write();
            buildThirdPartySharingPackage buildthirdpartysharingpackage = (buildThirdPartySharingPackage) PackageBuilderActivityStateCopy.read.write();
            Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq4.write();
            objWrite7.getClass();
            TextLayout textLayout = (TextLayout) objWrite7;
            WorkConstraintsTrackertrackinlinedcombine13 workConstraintsTrackertrackinlinedcombine13 = (WorkConstraintsTrackertrackinlinedcombine13) awaitWithin.read.write();
            Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
            objWrite8.getClass();
            reenqueueInAppMessagelambda0 reenqueueinappmessagelambda0 = (reenqueueInAppMessagelambda0) objWrite8;
            Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
            objWrite9.getClass();
            getPositionInWindowF1C5BW0 getpositioninwindowf1c5bw0 = (getPositionInWindowF1C5BW0) objWrite9;
            Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
            objWrite10.getClass();
            supportFinishAfterTransition supportfinishaftertransition = new supportFinishAfterTransition(clearupdated, ismainthread, textStyleKtWhenMappings, setdelegatefortestingui_text, getpreviouseudusuoannotations, mediaBrowserCompatMediaItem, accessismainthread, packageHandler1, n4Var, accessgetminimumcp, resolvedTextDirection, getstarte0lskkk, getcontentorltrs_7xco, setexittransition, lineHeightStyleCompanion, getcontainsall, androidParagraphIntrinsics, androidParagraphIntrinsicsExternalSyntheticLambda0, path$Companion, buildthirdpartysharingpackage, textLayout, workConstraintsTrackertrackinlinedcombine13, reenqueueinappmessagelambda0, getpositioninwindowf1c5bw0, (BackoffStrategy) objWrite10, (getDeviceUiMode) getFireAdvertisingIdBypassConditions.IconCompatParcelizer.write(), (ImageHeaderParserImageType) getPasswordPjHm6EE.RemoteActionCompatParcelizer.write(), (toExtractedText) ((readInstallReferrerHuaweiAppGallery) mergejsonobjects).write());
            int i5 = MediaSessionCompatToken + 21;
            PlaybackStateCompatCustomAction = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return supportfinishaftertransition;
        }
        if (i4 == 1) {
            r8lambdaLZjsjPSXWRendXZH98LKrH6PSs r8lambdalzjsjpsxwrendxzh98lkrh6pss = (r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write();
            getGestureThresholdActivate5zf0vsI getgesturethresholdactivate5zf0vsi = (getGestureThresholdActivate5zf0vsI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write();
            getInitialState getinitialstate = (getInitialState) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write();
            setVerticalAlign setverticalalign = (setVerticalAlign) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write();
            CustomerChatCommunicatorImpl customerChatCommunicatorImpl = (CustomerChatCommunicatorImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write();
            setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default = new setRoundRectOutlineTNW_H78default(8);
            RouterLogger routerLogger = (RouterLogger) ((onMeasureChild) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write();
            Path$Companion path$Companion2 = new Path$Companion();
            ActivityState activityState = (ActivityState) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
            isMainThread ismainthread2 = (isMainThread) readThirdPartySharingResultI.write.write();
            accesscreatePlatformTextStyleInternal accesscreateplatformtextstyleinternal = (accesscreatePlatformTextStyleInternal) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
            getAnimationClocksui_tooling getanimationclocksui_tooling = (getAnimationClocksui_tooling) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
            transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects.write();
            r8lambdalzjsjpsxwrendxzh98lkrh6pss.getClass();
            getgesturethresholdactivate5zf0vsi.getClass();
            getinitialstate.getClass();
            setverticalalign.getClass();
            customerChatCommunicatorImpl.getClass();
            activityState.getClass();
            accesscreateplatformtextstyleinternal.getClass();
            getanimationclocksui_tooling.getClass();
            transfersessionpackagei.getClass();
            return new getType4ZHQPSE((MainActivity) ((CardView$1) obj).RemoteActionCompatParcelizer, r8lambdalzjsjpsxwrendxzh98lkrh6pss, getgesturethresholdactivate5zf0vsi, setverticalalign, getinitialstate, customerChatCommunicatorImpl, setroundrectoutlinetnw_h78default, routerLogger, path$Companion2, activityState, ismainthread2, accesscreateplatformtextstyleinternal, getanimationclocksui_tooling, transfersessionpackagei);
        }
        if (i4 != 2) {
            if (i4 != 3) {
                return new TextMotionLinearity((transferSessionPackageI) ((mergeJsonObjects) obj).write(), (getClipgIe3tQ8annotations) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (getClipgIe3tQ8) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (getLinearity4e0Vf04ui_text) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (TextMotionCompanion) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (accessgetEllipsiscp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (getStartEllipsisgIe3tQ8annotations) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (accessgetVisiblecp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (ObservePuDoDeliveriesResponseImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (getSubpixelTextPositioningui_text) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (isOpenInternalroom_runtime) mergejsonobjects.write());
            }
            ChatUrlProviderImpl chatUrlProviderImpl = new ChatUrlProviderImpl((r8lambda0dL3NwAAnESqa66IBFAXKvH5HU) ((mergeJsonObjects) obj).write(), (HelpCenterRemoteDataSourceImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write(), (accessisMainThread) EmojiSupportMatchCompanion.IconCompatParcelizer.write(), (addBulletr9BaKPg) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write(), (getLineHeightStyle) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write(), (WebChatEventsTrackerImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write(), (TextUnitType) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write(), (AnnotatedStringExhaustiveAnnotation) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write(), (requireIndexInRange) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write(), (transactionsuspendImpl) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write(), (accessgetOldDependencyp) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write(), (ExecuteHelpCenterApiRequest) ((fastMergej5T8yCg) mergejsonobjects).write());
            int i7 = MediaSessionCompatToken + 45;
            PlaybackStateCompatCustomAction = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return chatUrlProviderImpl;
            }
            throw null;
        }
        MainActivity mainActivity = (MainActivity) ((mergeJsonObjects) obj).write();
        DefaultForegroundSoundManager defaultForegroundSoundManager = (DefaultForegroundSoundManager) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq9).write();
        getKeyboardTap5zf0vsI getkeyboardtap5zf0vsi = (getKeyboardTap5zf0vsI) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq8).write();
        setOnRemoteTriggerListener setonremotetriggerlistener = (setOnRemoteTriggerListener) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq7).write();
        CardView$1 cardView$1 = (CardView$1) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) r8lambdaktwlyipskq3tfa9ey3gatonixfq6).write();
        DialogMessageRequestProxy dialogMessageRequestProxy = (DialogMessageRequestProxy) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq5).write();
        s2 s2Var = (s2) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq4).write();
        getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq3).write();
        PlayStoreBasedAppUpdate playStoreBasedAppUpdate = (PlayStoreBasedAppUpdate) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq2).write();
        getMinWidth getminwidth = (getMinWidth) ((mergeJsonObjects) r8lambdaktwlyipskq3tfa9ey3gatonixfq).write();
        transferSessionPackageI transfersessionpackagei2 = (transferSessionPackageI) mergejsonobjects.write();
        mainActivity.getClass();
        defaultForegroundSoundManager.getClass();
        getkeyboardtap5zf0vsi.getClass();
        setonremotetriggerlistener.getClass();
        dialogMessageRequestProxy.getClass();
        s2Var.getClass();
        getpivotoffsetf1c5bw0.getClass();
        playStoreBasedAppUpdate.getClass();
        getminwidth.getClass();
        transfersessionpackagei2.getClass();
        return new MainPresenter(mainActivity, setonremotetriggerlistener, cardView$1, dialogMessageRequestProxy, s2Var, playStoreBasedAppUpdate, getminwidth, defaultForegroundSoundManager, getkeyboardtap5zf0vsi);
    }
}
