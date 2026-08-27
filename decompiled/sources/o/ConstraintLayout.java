package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.diagnostics.presentation.view.DiagnosticsUiStateMapper;
import com.roadrunner.login.logging.OtpLogger;
import com.ui.common.base.BaseRxViewModelKt;
import io.socket.emitter.Emitter;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ConstraintLayout implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ getReferencedIds IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ ConstraintLayout(getReferencedIds getreferencedids, int i) {
        this.read = i;
        this.IconCompatParcelizer = getreferencedids;
    }

    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x011f  */
    /* JADX WARN: Code duplicated, block: B:34:0x012c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c9 A[PHI: r2 r7
  0x01c9: PHI (r2v16 o.addID) = (r2v11 o.addID), (r2v17 o.addID) binds: [B:50:0x01c6, B:47:0x01bf] A[DONT_GENERATE, DONT_INLINE]
  0x01c9: PHI (r7v23 o.addID) = (r7v21 o.addID), (r7v24 o.addID) binds: [B:50:0x01c6, B:47:0x01bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x01da  */
    /* JADX WARN: Code duplicated, block: B:58:0x01de  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ee  */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String str;
        getMaxHeight getmaxheightSerializer;
        getMaxHeight getmaxheightSerializer2;
        Object objRemoteActionCompatParcelizer;
        getMaxHeight getmaxheightSerializer3;
        Object objRemoteActionCompatParcelizer2;
        boolean z;
        int i;
        addID addid;
        addID addid2;
        int i2;
        setReferencedIds setreferencedids;
        Emitter getsharedvalues;
        Emitter checklayoutparams;
        int i3 = 2;
        int i4 = 2 % 2;
        int i5 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getReferencedIds getreferencedids = this.IconCompatParcelizer;
        boolean z2 = true;
        Object obj2 = null;
        if (i5 == 0) {
            BrazeLogger brazeLogger = getreferencedids.IconCompatParcelizer;
            OtpLogger otpLogger = getreferencedids.MediaSessionCompatQueueItem;
            getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
            getoptimizationlevel.getClass();
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            boolean z3 = getoptimizationlevel instanceof getSceneString;
            if (!z3) {
                str = "not granted";
            } else {
                int i6 = serializer + 111;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                str = "granted";
            }
            forest.IconCompatParcelizer("Completed checking permissions ".concat(str), new Object[0]);
            Object objRemoteActionCompatParcelizer3 = getoptimizationlevel.RemoteActionCompatParcelizer();
            if (objRemoteActionCompatParcelizer3 != null) {
                boolean zBooleanValue = ((Boolean) objRemoteActionCompatParcelizer3).booleanValue();
                otpLogger.IconCompatParcelizer(zBooleanValue);
                if (zBooleanValue) {
                    forest.IconCompatParcelizer("Start checking device token", new Object[0]);
                    BaseRxViewModelKt.read(getreferencedids, getreferencedids.MediaBrowserCompatMediaItem.serializer(createfromparcel), new ConstraintLayout(getreferencedids, i3));
                } else {
                    otpLogger.read(false);
                }
            }
            if (getoptimizationlevel.read() != null) {
                int i7 = serializer + 35;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                otpLogger.IconCompatParcelizer(false);
                otpLogger.read(false);
            }
            getMaxHeight getmaxheight = (getMaxHeight) brazeLogger.write();
            DiagnosticsUiStateMapper diagnosticsUiStateMapper = getreferencedids.MediaDescriptionCompat;
            setTransactionSuccessful settransactionsuccessful = diagnosticsUiStateMapper.IconCompatParcelizer;
            if (z3) {
                getmaxheightSerializer = diagnosticsUiStateMapper.serializer(getMaxHeight.read(getmaxheight, null, null, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getSceneString) getoptimizationlevel).RemoteActionCompatParcelizer(), Boolean.TRUE}, getCieXyz.write())).booleanValue() ? new getSharedValues(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_app_permission_item)) : new setReferencedIds(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_app_permission_failed), diagnosticsUiStateMapper.getPermissionExplanationText(), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_change_settings_button_title)), null, null, 27));
            } else if (getoptimizationlevel instanceof onViewAdded) {
                getmaxheightSerializer = diagnosticsUiStateMapper.serializer(getMaxHeight.read(getmaxheight, null, null, new setReferenceTags(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_app_permission_item)), null, null, 27));
            } else {
                if (!(getoptimizationlevel instanceof getMaxWidth)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                getmaxheightSerializer = diagnosticsUiStateMapper.serializer(getMaxHeight.read(getmaxheight, null, null, new setReferencedIds(settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_app_permission_failed), diagnosticsUiStateMapper.getPermissionExplanationText(), settransactionsuccessful.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_change_settings_button_title)), null, null, 27));
            }
            brazeLogger.getClass();
            brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(getmaxheightSerializer);
            return createfromparcel;
        }
        if (i5 == 1) {
            getOptimizationLevel getoptimizationlevel2 = (getOptimizationLevel) obj;
            getoptimizationlevel2.getClass();
            BrazeLogger brazeLogger2 = getreferencedids.IconCompatParcelizer;
            OtpLogger otpLogger2 = getreferencedids.MediaSessionCompatQueueItem;
            getMaxHeight getmaxheight2 = (getMaxHeight) brazeLogger2.write();
            BrazeLogger brazeLogger3 = getreferencedids.IconCompatParcelizer;
            DiagnosticsUiStateMapper diagnosticsUiStateMapper2 = getreferencedids.MediaDescriptionCompat;
            setTransactionSuccessful settransactionsuccessful2 = diagnosticsUiStateMapper2.IconCompatParcelizer;
            if (getoptimizationlevel2 instanceof getSceneString) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("map token success", new Object[0]);
                getmaxheightSerializer2 = diagnosticsUiStateMapper2.serializer(getMaxHeight.read(getmaxheight2, null, null, null, new getSharedValues(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item)), new setReferenceTags(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item)), 7));
            } else if (getoptimizationlevel2 instanceof onViewAdded) {
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("map token loading", new Object[0]);
                getmaxheightSerializer2 = diagnosticsUiStateMapper2.serializer(getMaxHeight.read(getmaxheight2, null, null, null, new setReferenceTags(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item)), null, 23));
            } else {
                if (!(getoptimizationlevel2 instanceof getMaxWidth)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                getmaxheightSerializer2 = diagnosticsUiStateMapper2.serializer(getMaxHeight.read(getmaxheight2, null, null, null, new setReferencedIds(settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item), diagnosticsUiStateMapper2.getDeviceTokenExplanationText(null, ((getMaxWidth) getoptimizationlevel2).serializer), settransactionsuccessful2.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_try_again_button)), null, 23));
            }
            brazeLogger3.getClass();
            brazeLogger3.IconCompatParcelizer.RemoteActionCompatParcelizer(getmaxheightSerializer2);
            Object objRemoteActionCompatParcelizer4 = getoptimizationlevel2.RemoteActionCompatParcelizer();
            if (objRemoteActionCompatParcelizer4 != null) {
                otpLogger2.RemoteActionCompatParcelizer(true);
                getreferencedids.IconCompatParcelizer();
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Completed fixing permissions fixed", new Object[0]);
            }
            Throwable th = getoptimizationlevel2.read();
            if (th == null) {
                return createfromparcel;
            }
            int i9 = serializer + 89;
            write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Completed fixing permissions error", new Object[0]);
            otpLogger2.RemoteActionCompatParcelizer(false);
            otpLogger2.read(false);
            return createfromparcel;
        }
        if (i5 != 2) {
            OtpLogger otpLogger3 = getreferencedids.MediaSessionCompatQueueItem;
            otpLogger3.IconCompatParcelizer.logEvent("test_notif_failure", null);
            otpLogger3.read(false);
            Timber.RemoteActionCompatParcelizer.write(new Throwable("Test push timeout"));
            getreferencedids.RemoteActionCompatParcelizer();
            EnumColumnAdapter.serializer(getreferencedids.serializer, "push_diagnosis_failed", executeAsList.INFRA, "Test push timeout");
            BrazeLogger brazeLogger4 = getreferencedids.IconCompatParcelizer;
            getMaxHeight getmaxheight3 = (getMaxHeight) brazeLogger4.write();
            DiagnosticsUiStateMapper diagnosticsUiStateMapper3 = getreferencedids.MediaDescriptionCompat;
            diagnosticsUiStateMapper3.getClass();
            brazeLogger4.IconCompatParcelizer.RemoteActionCompatParcelizer(diagnosticsUiStateMapper3.serializer(getMaxHeight.read(getmaxheight3, null, null, null, null, new setReferencedIds(diagnosticsUiStateMapper3.IconCompatParcelizer.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item), diagnosticsUiStateMapper3.getTestNotificationExplanationText(null), null), 15)));
            return createfromparcel;
        }
        BrazeLogger brazeLogger5 = getreferencedids.IconCompatParcelizer;
        OtpLogger otpLogger4 = getreferencedids.MediaSessionCompatQueueItem;
        getOptimizationLevel getoptimizationlevel3 = (getOptimizationLevel) obj;
        getoptimizationlevel3.getClass();
        Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
        boolean z4 = getoptimizationlevel3 instanceof getSceneString;
        if (z4) {
            int i11 = write + 117;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                objRemoteActionCompatParcelizer = getoptimizationlevel3.RemoteActionCompatParcelizer();
                int i12 = 91 / 0;
            } else {
                objRemoteActionCompatParcelizer = getoptimizationlevel3.RemoteActionCompatParcelizer();
            }
        } else {
            objRemoteActionCompatParcelizer = "failed";
        }
        forest2.IconCompatParcelizer(m1$$ExternalSyntheticOutline0.m(objRemoteActionCompatParcelizer, "Completed checking device token "), new Object[0]);
        getMaxHeight getmaxheight4 = (getMaxHeight) brazeLogger5.write();
        DiagnosticsUiStateMapper diagnosticsUiStateMapper4 = getreferencedids.MediaDescriptionCompat;
        setTransactionSuccessful settransactionsuccessful3 = diagnosticsUiStateMapper4.IconCompatParcelizer;
        if (!z4) {
            if (getoptimizationlevel3 instanceof onViewAdded) {
                getmaxheightSerializer3 = diagnosticsUiStateMapper4.serializer(getMaxHeight.read(getmaxheight4, null, null, null, new setReferenceTags(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item)), null, 23));
            } else {
                if (!(getoptimizationlevel3 instanceof getMaxWidth)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    int i13 = write + 59;
                    serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return null;
                }
                getmaxheightSerializer3 = diagnosticsUiStateMapper4.serializer(getMaxHeight.read(getmaxheight4, null, null, null, new setReferencedIds(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item), diagnosticsUiStateMapper4.getDeviceTokenExplanationText(null, ((getMaxWidth) getoptimizationlevel3).serializer), settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_try_again_button)), null, 23));
            }
            brazeLogger5.getClass();
            brazeLogger5.IconCompatParcelizer.RemoteActionCompatParcelizer(getmaxheightSerializer3);
            objRemoteActionCompatParcelizer2 = getoptimizationlevel3.RemoteActionCompatParcelizer();
            if (objRemoteActionCompatParcelizer2 != null) {
                i = write + 109;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    addid = (addID) objRemoteActionCompatParcelizer2;
                    addid2 = addID.VALID;
                    int i15 = 39 / 0;
                    if (addid != addid2) {
                        z2 = false;
                    }
                } else {
                    addid = (addID) objRemoteActionCompatParcelizer2;
                    addid2 = addID.VALID;
                    if (addid != addid2) {
                        z2 = false;
                    }
                }
                otpLogger4.RemoteActionCompatParcelizer(z2);
                if (addid == addid2) {
                    i2 = serializer + 77;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        getreferencedids.IconCompatParcelizer();
                        throw null;
                    }
                    getreferencedids.IconCompatParcelizer();
                    z = false;
                } else {
                    z = false;
                    otpLogger4.read(false);
                }
            } else {
                z = false;
            }
            if (getoptimizationlevel3.read() == null) {
                return createfromparcel;
            }
            otpLogger4.RemoteActionCompatParcelizer(z);
            otpLogger4.read(z);
            return createfromparcel;
        }
        getSceneString getscenestring = (getSceneString) getoptimizationlevel3;
        addID addid3 = (addID) getscenestring.RemoteActionCompatParcelizer();
        if (addid3 != null) {
            int i16 = write + 23;
            serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i17 = i16 % 2;
            int i18 = generateDefaultLayoutParams.IconCompatParcelizer[addid3.ordinal()];
            if (i18 == 1) {
                getsharedvalues = new getSharedValues(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item));
            } else {
                if (i18 != 2 && i18 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    int i19 = write + 59;
                    serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i110 = i19 % 2;
                    return null;
                }
                setreferencedids = new setReferencedIds(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item), diagnosticsUiStateMapper4.getDeviceTokenExplanationText(addid3, null), settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_try_again_button));
            }
            if (getscenestring.RemoteActionCompatParcelizer() == addID.VALID) {
                checklayoutparams = new setReferenceTags(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item));
            } else {
                checklayoutparams = new checkLayoutParams(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item));
            }
            getmaxheightSerializer3 = diagnosticsUiStateMapper4.serializer(getMaxHeight.read(getmaxheight4, null, null, null, getsharedvalues, checklayoutparams, 7));
            brazeLogger5.getClass();
            brazeLogger5.IconCompatParcelizer.RemoteActionCompatParcelizer(getmaxheightSerializer3);
            objRemoteActionCompatParcelizer2 = getoptimizationlevel3.RemoteActionCompatParcelizer();
            if (objRemoteActionCompatParcelizer2 != null) {
                i = write + 109;
                serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    addid = (addID) objRemoteActionCompatParcelizer2;
                    addid2 = addID.VALID;
                    int i111 = 39 / 0;
                    if (addid != addid2) {
                        z2 = false;
                    }
                } else {
                    addid = (addID) objRemoteActionCompatParcelizer2;
                    addid2 = addID.VALID;
                    if (addid != addid2) {
                        z2 = false;
                    }
                }
                otpLogger4.RemoteActionCompatParcelizer(z2);
                if (addid == addid2) {
                    i2 = serializer + 77;
                    write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        getreferencedids.IconCompatParcelizer();
                        throw null;
                    }
                    getreferencedids.IconCompatParcelizer();
                    z = false;
                } else {
                    z = false;
                    otpLogger4.read(false);
                }
            } else {
                z = false;
            }
            if (getoptimizationlevel3.read() == null) {
                return createfromparcel;
            }
            otpLogger4.RemoteActionCompatParcelizer(z);
            otpLogger4.read(z);
            return createfromparcel;
        }
        setreferencedids = new setReferencedIds(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_item), diagnosticsUiStateMapper4.getDeviceTokenExplanationText(null, null), settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.settings_notifications_diagnostics_device_confirmation_try_again_button));
        getsharedvalues = setreferencedids;
        if (getscenestring.RemoteActionCompatParcelizer() == addID.VALID) {
            checklayoutparams = new setReferenceTags(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item));
        } else {
            checklayoutparams = new checkLayoutParams(settransactionsuccessful3.IconCompatParcelizer(com.logistics.rider.glovo.R.string.notifications_diagnostics_test_notification_item));
        }
        getmaxheightSerializer3 = diagnosticsUiStateMapper4.serializer(getMaxHeight.read(getmaxheight4, null, null, null, getsharedvalues, checklayoutparams, 7));
        brazeLogger5.getClass();
        brazeLogger5.IconCompatParcelizer.RemoteActionCompatParcelizer(getmaxheightSerializer3);
        objRemoteActionCompatParcelizer2 = getoptimizationlevel3.RemoteActionCompatParcelizer();
        if (objRemoteActionCompatParcelizer2 != null) {
            i = write + 109;
            serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i % 2 == 0) {
                addid = (addID) objRemoteActionCompatParcelizer2;
                addid2 = addID.VALID;
                int i112 = 39 / 0;
                if (addid != addid2) {
                    z2 = false;
                }
            } else {
                addid = (addID) objRemoteActionCompatParcelizer2;
                addid2 = addID.VALID;
                if (addid != addid2) {
                    z2 = false;
                }
            }
            otpLogger4.RemoteActionCompatParcelizer(z2);
            if (addid == addid2) {
                i2 = serializer + 77;
                write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    getreferencedids.IconCompatParcelizer();
                    throw null;
                }
                getreferencedids.IconCompatParcelizer();
                z = false;
            } else {
                z = false;
                otpLogger4.read(false);
            }
        } else {
            z = false;
        }
        if (getoptimizationlevel3.read() == null) {
            return createfromparcel;
        }
        otpLogger4.RemoteActionCompatParcelizer(z);
        otpLogger4.read(z);
        return createfromparcel;
    }
}
