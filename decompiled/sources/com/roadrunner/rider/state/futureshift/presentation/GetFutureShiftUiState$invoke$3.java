package com.roadrunner.rider.state.futureshift.presentation;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AdjustEvent;
import o.AdjustInstance101;
import o.AdjustInstance11;
import o.AdjustInstance12;
import o.AdjustInstance13;
import o.AdjustInstance2;
import o.AdjustInstance6;
import o.AdjustInstance7;
import o.AdjustInstance8;
import o.AdjustInstance91;
import o.AdjustInstanceExternalSyntheticLambda2;
import o.AdjustInstancePreLaunchActions;
import o.AdjustLinkResolution;
import o.ShortNewsContentCardView;
import o.accesssetAreOutboundNetworkRequestsOfflinecp;
import o.accesssetDelayedInitializationProvidercp;
import o.checkRevenue;
import o.createFromParcel;
import o.doInBackground;
import o.getCieXyz;
import o.getDeduplicationId;
import o.getReferrer;
import o.isTrackingEnabled;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.removeNodeAtDepth;
import o.sa;
import o.sb;
import o.sc;
import o.sd;
import o.setLastHorizontalStyle;
import o.setTransactionSuccessful;
import o.t1;
import o.t2;
import o.t3;
import o.v9;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class GetFutureShiftUiState$invoke$3 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public /* synthetic */ boolean IconCompatParcelizer;
    public /* synthetic */ sa RemoteActionCompatParcelizer;
    public /* synthetic */ AdjustInstance7 read;
    public /* synthetic */ sc serializer;
    public final /* synthetic */ GetFutureShiftUiState write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFutureShiftUiState$invoke$3(GetFutureShiftUiState getFutureShiftUiState, ShortNewsContentCardView shortNewsContentCardView) {
        super(5, shortNewsContentCardView);
        this.write = getFutureShiftUiState;
    }

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        GetFutureShiftUiState$invoke$3 getFutureShiftUiState$invoke$3 = new GetFutureShiftUiState$invoke$3(this.write, (ShortNewsContentCardView) obj5);
        getFutureShiftUiState$invoke$3.read = (AdjustInstance7) obj;
        getFutureShiftUiState$invoke$3.RemoteActionCompatParcelizer = (sa) obj2;
        getFutureShiftUiState$invoke$3.IconCompatParcelizer = zBooleanValue;
        getFutureShiftUiState$invoke$3.serializer = (sc) obj4;
        Object objInvokeSuspend = getFutureShiftUiState$invoke$3.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = MediaDescriptionCompat + 73;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj6 = null;
        obj6.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0285 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02da  */
    /* JADX WARN: Code duplicated, block: B:119:0x0309  */
    /* JADX WARN: Code duplicated, block: B:122:0x0335  */
    /* JADX WARN: Code duplicated, block: B:125:0x0347  */
    /* JADX WARN: Code duplicated, block: B:128:0x035d  */
    /* JADX WARN: Code duplicated, block: B:132:0x03a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d5 A[PHI: r1 r2
  0x03d5: PHI (r1v9 o.AdjustInstance91) = (r1v8 o.AdjustInstance91), (r1v16 o.AdjustInstance91) binds: [B:141:0x03d3, B:138:0x03c4] A[DONT_GENERATE, DONT_INLINE]
  0x03d5: PHI (r2v17 boolean) = (r2v16 boolean), (r2v21 boolean) binds: [B:141:0x03d3, B:138:0x03c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x03d9 A[PHI: r1 r2
  0x03d9: PHI (r1v14 o.AdjustInstance91) = (r1v8 o.AdjustInstance91), (r1v16 o.AdjustInstance91) binds: [B:141:0x03d3, B:138:0x03c4] A[DONT_GENERATE, DONT_INLINE]
  0x03d9: PHI (r2v19 boolean) = (r2v16 boolean), (r2v21 boolean) binds: [B:141:0x03d3, B:138:0x03c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:149:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0402  */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0202  */
    /* JADX WARN: Code duplicated, block: B:71:0x0204  */
    /* JADX WARN: Code duplicated, block: B:74:0x0209  */
    /* JADX WARN: Code duplicated, block: B:77:0x0216  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:81:0x0250  */
    /* JADX WARN: Code duplicated, block: B:82:0x0253  */
    /* JADX WARN: Code duplicated, block: B:85:0x025b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0266  */
    /* JADX WARN: Code duplicated, block: B:89:0x0268  */
    /* JADX WARN: Code duplicated, block: B:92:0x026d  */
    /* JADX WARN: Code duplicated, block: B:93:0x026f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0274  */
    /* JADX WARN: Code duplicated, block: B:98:0x0280  */
    /* JADX WARN: Instruction removed from duplicated block: B:128:0x035d, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        sc scVar;
        AdjustInstanceExternalSyntheticLambda2 adjustInstanceExternalSyntheticLambda2;
        Object doinbackground;
        int i;
        AdjustInstance12 adjustInstance12;
        boolean z;
        AdjustInstance12 adjustInstance13;
        Long l;
        Calendar calendar;
        String str;
        boolean z2;
        AdjustInstance13 adjustInstance13RemoteActionCompatParcelizer;
        int i2;
        AdjustInstance91 adjustInstance91;
        boolean z3;
        int i3;
        boolean z4;
        AdjustInstancePreLaunchActions adjustInstancePreLaunchActions;
        boolean z5;
        boolean z6;
        AdjustInstance101 adjustInstance101;
        AdjustInstance11 adjustInstance11;
        Integer numValueOf;
        t3 t3VarIconCompatParcelizer;
        boolean z7;
        AdjustInstance13 adjustInstance14;
        int i4;
        boolean z8;
        boolean z9;
        int i5;
        int i6;
        String str2;
        boolean z10;
        Object next;
        getReferrer getreferrer;
        Object next2;
        t1 t1Var;
        int i7 = 2 % 2;
        AdjustInstance7 adjustInstance7 = this.read;
        sa saVar = this.RemoteActionCompatParcelizer;
        boolean z11 = this.IconCompatParcelizer;
        sc scVar2 = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        checkRevenue checkrevenue = adjustInstance7.write;
        accesssetAreOutboundNetworkRequestsOfflinecp accesssetareoutboundnetworkrequestsofflinecp = adjustInstance7.RemoteActionCompatParcelizer;
        AdjustEvent adjustEvent = checkrevenue.read;
        AdjustInstanceExternalSyntheticLambda2 adjustInstanceExternalSyntheticLambda3 = AdjustInstanceExternalSyntheticLambda2.RemoteActionCompatParcelizer;
        if (adjustEvent != null && checkrevenue.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer != isTrackingEnabled.SUSPENDED) {
            GetFutureShiftUiState getFutureShiftUiState = this.write;
            AdjustInstancePreLaunchActions adjustInstancePreLaunchActions2 = getFutureShiftUiState.read;
            List list = checkrevenue.RatingCompat;
            AdjustLinkResolution adjustLinkResolution = adjustInstancePreLaunchActions2.MediaSessionCompatQueueItem;
            v9 v9Var = adjustInstancePreLaunchActions2.IconCompatParcelizer;
            setTransactionSuccessful settransactionsuccessful = adjustInstancePreLaunchActions2.RemoteActionCompatParcelizer;
            setLastHorizontalStyle setlasthorizontalstyle = adjustInstancePreLaunchActions2.serializer;
            Long l2 = adjustEvent.PlaybackStateCompatCustomAction;
            Long l3 = adjustEvent.ParcelableVolumeInfo;
            getDeduplicationId getdeduplicationid = adjustEvent.MediaSessionCompatQueueItem;
            accesssetareoutboundnetworkrequestsofflinecp.getClass();
            saVar.getClass();
            boolean zEquals = accesssetareoutboundnetworkrequestsofflinecp.equals(accesssetDelayedInitializationProvidercp.IconCompatParcelizer);
            adjustInstanceExternalSyntheticLambda2 = adjustInstanceExternalSyntheticLambda3;
            Calendar calendar2 = adjustEvent.MediaSessionCompatResultReceiverWrapper;
            scVar = scVar2;
            Calendar calendar3 = adjustEvent.MediaDescriptionCompat;
            String str3 = adjustEvent.serializer;
            boolean z12 = adjustInstancePreLaunchActions2.MediaMetadataCompat;
            if (z12) {
                Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("initial shiftStatus: " + getdeduplicationid + ", proximity: " + accesssetareoutboundnetworkrequestsofflinecp + ", is no opportunities: " + saVar.equals(sd.RemoteActionCompatParcelizer) + ", shifts size: " + (list != null ? Integer.valueOf(list.size()) : null) + "isOutside: " + zEquals));
            } else {
                z11 = z11;
                adjustEvent = adjustEvent;
            }
            int i8 = AdjustInstance8.serializer[getdeduplicationid.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.status_shift_starting_in);
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.getClass();
                    adjustInstance12 = new AdjustInstance12(af$$ExternalSyntheticOutline0.m(strIconCompatParcelizer, " ", adjustLinkResolution.write(calendar4, calendar2)), setlasthorizontalstyle.IconCompatParcelizer().setSupportBackgroundTintList());
                } else if (saVar instanceof sb) {
                    Iterator it = ((sb) saVar).write.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((t2) next).IconCompatParcelizer);
                    t2 t2Var = (t2) next;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((getReferrer) next2).PlaybackStateCompatCustomAction, (t2Var == null || (t1Var = t2Var.serializer) == null) ? null : Long.valueOf(t1Var.IconCompatParcelizer)}, getCieXyz.write())).booleanValue());
                        getreferrer = (getReferrer) next2;
                    } else {
                        getreferrer = null;
                    }
                    if (getreferrer != null) {
                        int i9 = MediaDescriptionCompat + 73;
                        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 != 0) {
                            Long l4 = getreferrer.ParcelableVolumeInfo;
                            Calendar calendar5 = getreferrer.MediaMetadataCompat;
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        Long l5 = getreferrer.ParcelableVolumeInfo;
                        Calendar calendar6 = getreferrer.MediaMetadataCompat;
                        if (calendar6 == null) {
                            calendar6 = Calendar.getInstance();
                            calendar6.getClass();
                        }
                        Calendar calendar7 = getreferrer.IconCompatParcelizer;
                        if (calendar7 == null) {
                            calendar7 = Calendar.getInstance();
                            calendar7.getClass();
                        }
                        str2 = getreferrer.read;
                        if (str2 == null) {
                            str2 = "";
                        }
                        l = l5;
                        calendar3 = calendar7;
                        z10 = true;
                        calendar2 = calendar6;
                        str = str2;
                        z2 = z10;
                        adjustInstance13 = new AdjustInstance12(settransactionsuccessful.IconCompatParcelizer(R.string.status_date_today), setlasthorizontalstyle.IconCompatParcelizer().setPresenter());
                        calendar = calendar3;
                        z = false;
                        if (z12) {
                            int i10 = MediaDescriptionCompat + 69;
                            MediaMetadataCompat = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                            if (getdeduplicationid == getDeduplicationId.LATE) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                                i6 = MediaMetadataCompat + 33;
                                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                                if (i6 % 2 == 0) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                            } else {
                                z9 = false;
                            }
                            z4 = z12;
                            StringBuilder sb = new StringBuilder("is LATE and showStartShiftButton: ");
                            sb.append(z8);
                            sb.append(" ");
                            sb.append(z);
                            sb.append("is UPCOMING and showStartShiftButton: ");
                            af$$ExternalSyntheticOutline0.m(sb, z9, " ", z, "is else and showStartShiftButton: ");
                            sb.append(z);
                            forest.write(new RavlNonFatalLoggingException(sb.toString()));
                            i5 = MediaDescriptionCompat + 77;
                            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 != 0) {
                                int i12 = 3 % 3;
                            }
                        } else {
                            z4 = z12;
                        }
                        if (v9Var.serializer()) {
                            adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
                        } else {
                            adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
                            if (adjustInstancePreLaunchActions.read.read()) {
                                z5 = false;
                            }
                            if (l != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (getdeduplicationid != getDeduplicationId.LATE) {
                                i4 = MediaMetadataCompat + 41;
                                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 != 0) {
                                    getDeduplicationId getdeduplicationid2 = getDeduplicationId.UPCOMING;
                                    throw null;
                                }
                                if (getdeduplicationid == getDeduplicationId.UPCOMING && z5 && z6 && !z2) {
                                    adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                                } else {
                                    adjustInstance101 = null;
                                }
                            } else {
                                adjustInstance101 = null;
                            }
                            Long l6 = adjustEvent.RatingCompat;
                            if (adjustEvent.MediaMetadataCompat) {
                                adjustInstance11 = AdjustInstance11.GO_AND_START;
                            } else {
                                adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
                            }
                            AdjustInstance11 adjustInstance15 = adjustInstance11;
                            if (l != null) {
                                numValueOf = Integer.valueOf((int) l.longValue());
                            } else {
                                numValueOf = null;
                            }
                            String strM = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
                            if (v9Var.serializer()) {
                                int i13 = MediaMetadataCompat + 37;
                                MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                                t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                            } else {
                                t3VarIconCompatParcelizer = null;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue() || !v9Var.serializer()) {
                                z7 = false;
                            } else {
                                int i15 = MediaDescriptionCompat + 55;
                                MediaMetadataCompat = i15 % Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                                z7 = true;
                            }
                            adjustInstance14 = new AdjustInstance13(l6, adjustInstance15, numValueOf, strM, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
                            if (z4) {
                                Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
                            }
                            adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
                        }
                        z5 = true;
                        if (l != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (getdeduplicationid != getDeduplicationId.LATE) {
                            i4 = MediaMetadataCompat + 41;
                            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                getDeduplicationId getdeduplicationid3 = getDeduplicationId.UPCOMING;
                                throw null;
                            }
                            if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                                adjustInstance101 = null;
                            } else {
                                adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                            }
                        } else {
                            adjustInstance101 = null;
                        }
                        Long l7 = adjustEvent.RatingCompat;
                        if (adjustEvent.MediaMetadataCompat) {
                            adjustInstance11 = AdjustInstance11.GO_AND_START;
                        } else {
                            adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
                        }
                        AdjustInstance11 adjustInstance16 = adjustInstance11;
                        if (l != null) {
                            numValueOf = Integer.valueOf((int) l.longValue());
                        } else {
                            numValueOf = null;
                        }
                        String strM2 = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
                        if (v9Var.serializer()) {
                            int i17 = MediaMetadataCompat + 37;
                            MediaDescriptionCompat = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                        } else {
                            t3VarIconCompatParcelizer = null;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        adjustInstance14 = new AdjustInstance13(l7, adjustInstance16, numValueOf, strM2, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
                        if (z4) {
                            Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
                        }
                        adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
                    } else if (t2Var != null) {
                        adjustInstance13RemoteActionCompatParcelizer = null;
                    } else {
                        l = l3;
                        str2 = str3;
                        z10 = false;
                        str = str2;
                        z2 = z10;
                        adjustInstance13 = new AdjustInstance12(settransactionsuccessful.IconCompatParcelizer(R.string.status_date_today), setlasthorizontalstyle.IconCompatParcelizer().setPresenter());
                        calendar = calendar3;
                        z = false;
                        if (z12) {
                            int i19 = MediaDescriptionCompat + 69;
                            MediaMetadataCompat = i19 % Fields.SpotShadowColor;
                            int i110 = i19 % 2;
                            Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
                            if (getdeduplicationid == getDeduplicationId.LATE) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                                i6 = MediaMetadataCompat + 33;
                                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                                if (i6 % 2 == 0) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                            } else {
                                z9 = false;
                            }
                            z4 = z12;
                            StringBuilder sb2 = new StringBuilder("is LATE and showStartShiftButton: ");
                            sb2.append(z8);
                            sb2.append(" ");
                            sb2.append(z);
                            sb2.append("is UPCOMING and showStartShiftButton: ");
                            af$$ExternalSyntheticOutline0.m(sb2, z9, " ", z, "is else and showStartShiftButton: ");
                            sb2.append(z);
                            forest2.write(new RavlNonFatalLoggingException(sb2.toString()));
                            i5 = MediaDescriptionCompat + 77;
                            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                            if (i5 % 2 != 0) {
                                int i111 = 3 % 3;
                            }
                        } else {
                            z4 = z12;
                        }
                        if (v9Var.serializer()) {
                            adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
                            if (adjustInstancePreLaunchActions.read.read()) {
                                z5 = false;
                            }
                            if (l != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (getdeduplicationid != getDeduplicationId.LATE) {
                                i4 = MediaMetadataCompat + 41;
                                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                                if (i4 % 2 != 0) {
                                    getDeduplicationId getdeduplicationid4 = getDeduplicationId.UPCOMING;
                                    throw null;
                                }
                                if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                                    adjustInstance101 = null;
                                } else {
                                    adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                                }
                            } else {
                                adjustInstance101 = null;
                            }
                            Long l8 = adjustEvent.RatingCompat;
                            if (adjustEvent.MediaMetadataCompat) {
                                adjustInstance11 = AdjustInstance11.GO_AND_START;
                            } else {
                                adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
                            }
                            AdjustInstance11 adjustInstance17 = adjustInstance11;
                            if (l != null) {
                                numValueOf = Integer.valueOf((int) l.longValue());
                            } else {
                                numValueOf = null;
                            }
                            String strM3 = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
                            if (v9Var.serializer()) {
                                int i112 = MediaMetadataCompat + 37;
                                MediaDescriptionCompat = i112 % Fields.SpotShadowColor;
                                int i113 = i112 % 2;
                                t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                            } else {
                                t3VarIconCompatParcelizer = null;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            adjustInstance14 = new AdjustInstance13(l8, adjustInstance17, numValueOf, strM3, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
                            if (z4) {
                                Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
                            }
                            adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
                        } else {
                            adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
                        }
                        z5 = true;
                        if (l != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (getdeduplicationid != getDeduplicationId.LATE) {
                            i4 = MediaMetadataCompat + 41;
                            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                getDeduplicationId getdeduplicationid5 = getDeduplicationId.UPCOMING;
                                throw null;
                            }
                            if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                                adjustInstance101 = null;
                            } else {
                                adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                            }
                        } else {
                            adjustInstance101 = null;
                        }
                        Long l9 = adjustEvent.RatingCompat;
                        if (adjustEvent.MediaMetadataCompat) {
                            adjustInstance11 = AdjustInstance11.GO_AND_START;
                        } else {
                            adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
                        }
                        AdjustInstance11 adjustInstance18 = adjustInstance11;
                        if (l != null) {
                            numValueOf = Integer.valueOf((int) l.longValue());
                        } else {
                            numValueOf = null;
                        }
                        String strM4 = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
                        if (v9Var.serializer()) {
                            int i114 = MediaMetadataCompat + 37;
                            MediaDescriptionCompat = i114 % Fields.SpotShadowColor;
                            int i115 = i114 % 2;
                            t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                        } else {
                            t3VarIconCompatParcelizer = null;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        adjustInstance14 = new AdjustInstance13(l9, adjustInstance18, numValueOf, strM4, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
                        if (z4) {
                            Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
                        }
                        adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
                    }
                } else {
                    l = l3;
                    str2 = str3;
                    z10 = false;
                    str = str2;
                    z2 = z10;
                    adjustInstance13 = new AdjustInstance12(settransactionsuccessful.IconCompatParcelizer(R.string.status_date_today), setlasthorizontalstyle.IconCompatParcelizer().setPresenter());
                    calendar = calendar3;
                    z = false;
                    if (z12) {
                        int i116 = MediaDescriptionCompat + 69;
                        MediaMetadataCompat = i116 % Fields.SpotShadowColor;
                        int i117 = i116 % 2;
                        Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
                        if (getdeduplicationid == getDeduplicationId.LATE) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                            i6 = MediaMetadataCompat + 33;
                            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                            if (i6 % 2 == 0) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                        } else {
                            z9 = false;
                        }
                        z4 = z12;
                        StringBuilder sb3 = new StringBuilder("is LATE and showStartShiftButton: ");
                        sb3.append(z8);
                        sb3.append(" ");
                        sb3.append(z);
                        sb3.append("is UPCOMING and showStartShiftButton: ");
                        af$$ExternalSyntheticOutline0.m(sb3, z9, " ", z, "is else and showStartShiftButton: ");
                        sb3.append(z);
                        forest3.write(new RavlNonFatalLoggingException(sb3.toString()));
                        i5 = MediaDescriptionCompat + 77;
                        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                        if (i5 % 2 != 0) {
                            int i118 = 3 % 3;
                        }
                    } else {
                        z4 = z12;
                    }
                    if (v9Var.serializer()) {
                        adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
                        if (adjustInstancePreLaunchActions.read.read()) {
                            z5 = false;
                        }
                        if (l != null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (getdeduplicationid != getDeduplicationId.LATE) {
                            i4 = MediaMetadataCompat + 41;
                            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                            if (i4 % 2 != 0) {
                                getDeduplicationId getdeduplicationid6 = getDeduplicationId.UPCOMING;
                                throw null;
                            }
                            if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                                adjustInstance101 = null;
                            } else {
                                adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                            }
                        } else {
                            adjustInstance101 = null;
                        }
                        Long l10 = adjustEvent.RatingCompat;
                        if (adjustEvent.MediaMetadataCompat) {
                            adjustInstance11 = AdjustInstance11.GO_AND_START;
                        } else {
                            adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
                        }
                        AdjustInstance11 adjustInstance19 = adjustInstance11;
                        if (l != null) {
                            numValueOf = Integer.valueOf((int) l.longValue());
                        } else {
                            numValueOf = null;
                        }
                        String strM5 = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
                        if (v9Var.serializer()) {
                            int i119 = MediaMetadataCompat + 37;
                            MediaDescriptionCompat = i119 % Fields.SpotShadowColor;
                            int i1110 = i119 % 2;
                            t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                        } else {
                            t3VarIconCompatParcelizer = null;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        adjustInstance14 = new AdjustInstance13(l10, adjustInstance19, numValueOf, strM5, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
                        if (z4) {
                            Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
                        }
                        adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
                    } else {
                        adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
                    }
                    z5 = true;
                    if (l != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (getdeduplicationid != getDeduplicationId.LATE) {
                        i4 = MediaMetadataCompat + 41;
                        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                        if (i4 % 2 != 0) {
                            getDeduplicationId getdeduplicationid7 = getDeduplicationId.UPCOMING;
                            throw null;
                        }
                        if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                            adjustInstance101 = null;
                        } else {
                            adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                        }
                    } else {
                        adjustInstance101 = null;
                    }
                    Long l11 = adjustEvent.RatingCompat;
                    if (adjustEvent.MediaMetadataCompat) {
                        adjustInstance11 = AdjustInstance11.GO_AND_START;
                    } else {
                        adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
                    }
                    AdjustInstance11 adjustInstance110 = adjustInstance11;
                    if (l != null) {
                        numValueOf = Integer.valueOf((int) l.longValue());
                    } else {
                        numValueOf = null;
                    }
                    String strM6 = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
                    if (v9Var.serializer()) {
                        int i1111 = MediaMetadataCompat + 37;
                        MediaDescriptionCompat = i1111 % Fields.SpotShadowColor;
                        int i1112 = i1111 % 2;
                        t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                    } else {
                        t3VarIconCompatParcelizer = null;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    adjustInstance14 = new AdjustInstance13(l11, adjustInstance110, numValueOf, strM6, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
                    if (z4) {
                        Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
                    }
                    adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
                }
                if (adjustInstance13RemoteActionCompatParcelizer != null) {
                    if (!z11) {
                        adjustInstance13RemoteActionCompatParcelizer = AdjustInstance13.RemoteActionCompatParcelizer(adjustInstance13RemoteActionCompatParcelizer);
                    }
                    i2 = MediaDescriptionCompat + 75;
                    MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        adjustInstance91 = getFutureShiftUiState.RemoteActionCompatParcelizer;
                        z3 = checkrevenue.IconCompatParcelizer;
                        int i20 = 15 / 0;
                        if (adjustInstance13RemoteActionCompatParcelizer.read()) {
                            i3 = R.string.status_next_shift_in_area;
                        } else {
                            i3 = R.string.status_next_shift;
                        }
                    } else {
                        adjustInstance91 = getFutureShiftUiState.RemoteActionCompatParcelizer;
                        z3 = checkrevenue.IconCompatParcelizer;
                        if (adjustInstance13RemoteActionCompatParcelizer.read()) {
                            i3 = R.string.status_next_shift_in_area;
                        } else {
                            i3 = R.string.status_next_shift;
                        }
                    }
                    doinbackground = new doInBackground(new AdjustInstance2(adjustInstance91.IconCompatParcelizer.IconCompatParcelizer(i3), z3), adjustInstance13RemoteActionCompatParcelizer);
                }
                if (scVar == null) {
                    i = -1;
                } else {
                    i = AdjustInstance6.RemoteActionCompatParcelizer[scVar.ordinal()];
                }
                if (i != -1 || i == 1) {
                    return doinbackground;
                }
                if (i == 2) {
                    return adjustInstanceExternalSyntheticLambda2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            adjustInstance12 = new AdjustInstance12(settransactionsuccessful.IconCompatParcelizer(R.string.status_shift_you_are_late), setlasthorizontalstyle.IconCompatParcelizer().setUiOptions());
            AdjustInstance12 adjustInstance111 = adjustInstance12;
            z = !zEquals;
            adjustInstance13 = adjustInstance111;
            l = l2;
            calendar = calendar3;
            str = str3;
            z2 = false;
            if (z12) {
                int i1113 = MediaDescriptionCompat + 69;
                MediaMetadataCompat = i1113 % Fields.SpotShadowColor;
                int i1114 = i1113 % 2;
                Timber.Forest forest4 = Timber.RemoteActionCompatParcelizer;
                if (getdeduplicationid == getDeduplicationId.LATE) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                    i6 = MediaMetadataCompat + 33;
                    MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                } else {
                    z9 = false;
                }
                z4 = z12;
                StringBuilder sb4 = new StringBuilder("is LATE and showStartShiftButton: ");
                sb4.append(z8);
                sb4.append(" ");
                sb4.append(z);
                sb4.append("is UPCOMING and showStartShiftButton: ");
                af$$ExternalSyntheticOutline0.m(sb4, z9, " ", z, "is else and showStartShiftButton: ");
                sb4.append(z);
                forest4.write(new RavlNonFatalLoggingException(sb4.toString()));
                i5 = MediaDescriptionCompat + 77;
                MediaMetadataCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i1115 = 3 % 3;
                }
            } else {
                z4 = z12;
            }
            if (v9Var.serializer()) {
                adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
                if (adjustInstancePreLaunchActions.read.read()) {
                    z5 = false;
                }
                if (l != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (getdeduplicationid != getDeduplicationId.LATE) {
                    i4 = MediaMetadataCompat + 41;
                    MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        getDeduplicationId getdeduplicationid8 = getDeduplicationId.UPCOMING;
                        throw null;
                    }
                    if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                        adjustInstance101 = null;
                    } else {
                        adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                    }
                } else {
                    adjustInstance101 = null;
                }
                Long l12 = adjustEvent.RatingCompat;
                if (adjustEvent.MediaMetadataCompat) {
                    adjustInstance11 = AdjustInstance11.GO_AND_START;
                } else {
                    adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
                }
                AdjustInstance11 adjustInstance112 = adjustInstance11;
                if (l != null) {
                    numValueOf = Integer.valueOf((int) l.longValue());
                } else {
                    numValueOf = null;
                }
                String strM7 = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
                if (v9Var.serializer()) {
                    int i1116 = MediaMetadataCompat + 37;
                    MediaDescriptionCompat = i1116 % Fields.SpotShadowColor;
                    int i1117 = i1116 % 2;
                    t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
                } else {
                    t3VarIconCompatParcelizer = null;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                    z7 = false;
                } else {
                    z7 = false;
                }
                adjustInstance14 = new AdjustInstance13(l12, adjustInstance112, numValueOf, strM7, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
                if (z4) {
                    Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
                }
                adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
                if (adjustInstance13RemoteActionCompatParcelizer != null) {
                    if (!z11) {
                        adjustInstance13RemoteActionCompatParcelizer = AdjustInstance13.RemoteActionCompatParcelizer(adjustInstance13RemoteActionCompatParcelizer);
                    }
                    i2 = MediaDescriptionCompat + 75;
                    MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        adjustInstance91 = getFutureShiftUiState.RemoteActionCompatParcelizer;
                        z3 = checkrevenue.IconCompatParcelizer;
                        int i21 = 15 / 0;
                        if (adjustInstance13RemoteActionCompatParcelizer.read()) {
                            i3 = R.string.status_next_shift_in_area;
                        } else {
                            i3 = R.string.status_next_shift;
                        }
                    } else {
                        adjustInstance91 = getFutureShiftUiState.RemoteActionCompatParcelizer;
                        z3 = checkrevenue.IconCompatParcelizer;
                        if (adjustInstance13RemoteActionCompatParcelizer.read()) {
                            i3 = R.string.status_next_shift_in_area;
                        } else {
                            i3 = R.string.status_next_shift;
                        }
                    }
                    doinbackground = new doInBackground(new AdjustInstance2(adjustInstance91.IconCompatParcelizer.IconCompatParcelizer(i3), z3), adjustInstance13RemoteActionCompatParcelizer);
                }
                if (scVar == null) {
                    i = -1;
                } else {
                    i = AdjustInstance6.RemoteActionCompatParcelizer[scVar.ordinal()];
                }
                if (i != -1) {
                }
                return doinbackground;
            }
            adjustInstancePreLaunchActions = adjustInstancePreLaunchActions2;
            z5 = true;
            if (l != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (getdeduplicationid != getDeduplicationId.LATE) {
                i4 = MediaMetadataCompat + 41;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    getDeduplicationId getdeduplicationid9 = getDeduplicationId.UPCOMING;
                    throw null;
                }
                if (getdeduplicationid == getDeduplicationId.UPCOMING) {
                    adjustInstance101 = null;
                } else {
                    adjustInstance101 = new AdjustInstance101(settransactionsuccessful.IconCompatParcelizer(R.string.status_show_on_map_button), (int) l.longValue());
                }
            } else {
                adjustInstance101 = null;
            }
            Long l13 = adjustEvent.RatingCompat;
            if (adjustEvent.MediaMetadataCompat) {
                adjustInstance11 = AdjustInstance11.GO_AND_START;
            } else {
                adjustInstance11 = AdjustInstance11.EXISTING_SHIFT;
            }
            AdjustInstance11 adjustInstance113 = adjustInstance11;
            if (l != null) {
                numValueOf = Integer.valueOf((int) l.longValue());
            } else {
                numValueOf = null;
            }
            String strM8 = m1$$ExternalSyntheticOutline0.m(AdjustLinkResolution.read(calendar2, calendar), " (", adjustLinkResolution.write(calendar2, calendar), ")");
            if (v9Var.serializer()) {
                int i1118 = MediaMetadataCompat + 37;
                MediaDescriptionCompat = i1118 % Fields.SpotShadowColor;
                int i1119 = i1118 % 2;
                t3VarIconCompatParcelizer = adjustInstancePreLaunchActions.write.IconCompatParcelizer(adjustEvent.read, adjustEvent.write, Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().addOnPictureInPictureUiStateChangedListener()), Color.m712boximpl(setlasthorizontalstyle.IconCompatParcelizer().IconCompatParcelizer()));
            } else {
                t3VarIconCompatParcelizer = null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustEvent.RemoteActionCompatParcelizer, Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                z7 = false;
            } else {
                z7 = false;
            }
            adjustInstance14 = new AdjustInstance13(l13, adjustInstance113, numValueOf, strM8, str, adjustInstance13, z, adjustInstance101, z2, t3VarIconCompatParcelizer, Boolean.valueOf(z7));
            if (z4) {
                Timber.RemoteActionCompatParcelizer.write(new RavlNonFatalLoggingException("final FutureShiftViewEntity: " + adjustInstance14 + "isShownOnMapButtonEnabled: " + z5 + ", isZoneIdAvailable: " + z6 + ", zoneId: " + l + ", markerSelected: " + z2 + " showOnMapButton: " + adjustInstance101));
            }
            adjustInstance13RemoteActionCompatParcelizer = adjustInstance14;
            if (adjustInstance13RemoteActionCompatParcelizer != null) {
                if (!z11) {
                    adjustInstance13RemoteActionCompatParcelizer = AdjustInstance13.RemoteActionCompatParcelizer(adjustInstance13RemoteActionCompatParcelizer);
                }
                i2 = MediaDescriptionCompat + 75;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    adjustInstance91 = getFutureShiftUiState.RemoteActionCompatParcelizer;
                    z3 = checkrevenue.IconCompatParcelizer;
                    int i22 = 15 / 0;
                    if (adjustInstance13RemoteActionCompatParcelizer.read()) {
                        i3 = R.string.status_next_shift_in_area;
                    } else {
                        i3 = R.string.status_next_shift;
                    }
                } else {
                    adjustInstance91 = getFutureShiftUiState.RemoteActionCompatParcelizer;
                    z3 = checkrevenue.IconCompatParcelizer;
                    if (adjustInstance13RemoteActionCompatParcelizer.read()) {
                        i3 = R.string.status_next_shift_in_area;
                    } else {
                        i3 = R.string.status_next_shift;
                    }
                }
                doinbackground = new doInBackground(new AdjustInstance2(adjustInstance91.IconCompatParcelizer.IconCompatParcelizer(i3), z3), adjustInstance13RemoteActionCompatParcelizer);
            }
            if (scVar == null) {
                i = -1;
            } else {
                i = AdjustInstance6.RemoteActionCompatParcelizer[scVar.ordinal()];
            }
            if (i != -1) {
            }
            return doinbackground;
        }
        scVar = scVar2;
        adjustInstanceExternalSyntheticLambda2 = adjustInstanceExternalSyntheticLambda3;
        doinbackground = adjustInstanceExternalSyntheticLambda2;
        if (scVar == null) {
            i = -1;
        } else {
            i = AdjustInstance6.RemoteActionCompatParcelizer[scVar.ordinal()];
        }
        if (i != -1) {
        }
        return doinbackground;
    }
}
