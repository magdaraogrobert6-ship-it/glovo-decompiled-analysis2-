package o;

import android.app.Application;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.transition.Transition$1;
import com.google.android.gms.internal.mlkit_vision_barcode.zzgz;
import com.huawei.hms.aaid.HmsInstanceId;
import com.roadrunner.map.integration.search.AndroidGeocoderWrapperImpl;
import com.roadrunner.networking.errormapper.NetworkErrorMapperImpl;
import com.roadrunner.push.core.data.PushServiceRepository;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.uber.h3core.H3Core;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class backgroundTimerFiredI implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public backgroundTimerFiredI(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.read = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i == 2) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 9) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 29) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 13) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 14) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 17) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 18) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        switch (i) {
            case 20:
                this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 21:
                this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 22:
                this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            default:
                this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
        }
    }

    public backgroundTimerFiredI(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime) {
        this.read = 16;
        setusetemptrackingtableroom_runtime.getClass();
        this.serializer = setusetemptrackingtableroom_runtime;
    }

    public backgroundTimerFiredI(q0 q0Var) {
        this.read = 24;
        q0Var.getClass();
        this.serializer = q0Var;
    }

    public backgroundTimerFiredI(r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.read = 27;
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.serializer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    public backgroundTimerFiredI(backgroundTimerFiredI backgroundtimerfiredi) {
        this.read = 6;
        backgroundtimerfiredi.getClass();
        this.serializer = backgroundtimerfiredi;
    }

    public backgroundTimerFiredI(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.read = 12;
        convertstringjsonarraytolistlambda0.getClass();
        this.serializer = convertstringjsonarraytolistlambda0;
    }

    public backgroundTimerFiredI(setStateDescription setstatedescription) {
        this.read = 7;
        setstatedescription.getClass();
        this.serializer = setstatedescription;
    }

    public backgroundTimerFiredI(hasNestedScrollingParent hasnestedscrollingparent, int i) {
        this.read = i;
        hasnestedscrollingparent.getClass();
        if (i == 5) {
            this.serializer = hasnestedscrollingparent;
            return;
        }
        if (i == 15) {
            this.serializer = hasnestedscrollingparent;
            return;
        }
        if (i == 19) {
            this.serializer = hasnestedscrollingparent;
        } else if (i != 28) {
            this.serializer = hasnestedscrollingparent;
        } else {
            this.serializer = hasnestedscrollingparent;
        }
    }

    public backgroundTimerFiredI(accessisMainThread accessismainthread, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.read = 23;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.serializer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public backgroundTimerFiredI(AndroidUiFrameClock androidUiFrameClock, hasNestedScrollingParent hasnestedscrollingparent) {
        this.read = 25;
        hasnestedscrollingparent.getClass();
        this.serializer = hasnestedscrollingparent;
    }

    public backgroundTimerFiredI(AndroidUiFrameClock androidUiFrameClock, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.read = 26;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.serializer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public backgroundTimerFiredI(getContentDataType getcontentdatatype, int i) {
        this.read = i;
        getcontentdatatype.getClass();
        if (i == 8) {
            this.serializer = getcontentdatatype;
        } else if (i != 11) {
            this.serializer = getcontentdatatype;
        } else {
            this.serializer = getcontentdatatype;
        }
    }

    public backgroundTimerFiredI(setPresentationView setpresentationview) {
        this.read = 10;
        setpresentationview.getClass();
        this.serializer = setpresentationview;
    }

    public backgroundTimerFiredI(r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.read = 3;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.serializer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        int i4 = 29;
        Object obj = null;
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (i3) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                return new access800((decode) objWrite);
            case 1:
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new AndroidGeocoderWrapperImpl((Application) objWrite2, (Transition$1) drawForPersistenceui_graphics.read.write());
            case 2:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new unpackInt2((transferSessionPackageI) objWrite3, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            case 3:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return zzgz.write((getIdentifiersValidationsEnabled) objWrite4);
            case 4:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                H3Core h3CoreSerializer = fetchCustomExitaToIllAui.serializer((accessgetOldDependencyp) objWrite5);
                int i5 = write + 63;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return h3CoreSerializer;
                }
                throw null;
            case 5:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new oc((Application) objWrite6);
            case 6:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                return new oa((oc) objWrite7);
            case 7:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new setHtmlPageFinishedListener(i, (RectManager) objWrite8);
            case 8:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new qa();
            case 9:
                r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
                return DelayKt.serializer(new RoomDatabase$$ExternalSyntheticLambda2(i4, r8lambdaktwlyipskq3tfa9ey3gatonixfq));
            case 10:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                defaultIoScheduler.getClass();
                qd qdVar = new qd(defaultIoScheduler);
                applyDisplayCutoutMarginsToCloseButtonlambda0 applydisplaycutoutmarginstoclosebuttonlambda0 = new applyDisplayCutoutMarginsToCloseButtonlambda0();
                applydisplaycutoutmarginstoclosebuttonlambda0.executorServiceOrNull = qdVar;
                return applydisplaycutoutmarginstoclosebuttonlambda0;
            case 11:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new r3((accessgetOldDependencyp) objWrite11);
            case 12:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new r0((subscribeToBannersUpdateslambda2) objWrite12);
            case 13:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                return new qg((publishError) objWrite13);
            case 14:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                r8 r8Var = new r8((setTransactionSuccessful) objWrite14);
                int i6 = IconCompatParcelizer + 29;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return r8Var;
            case 15:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                return new rd((Application) objWrite15, 0);
            case 16:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new ra((qa) objWrite16);
            case 17:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new NetworkErrorMapperImpl((setTransactionSuccessful) objWrite17);
            case 18:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new shouldSkipDump((setTransactionSuccessful) objWrite18);
            case 19:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                androidx.core.app.NotificationManagerCompat notificationManagerCompatFrom = androidx.core.app.NotificationManagerCompat.from(((Application) objWrite19).getApplicationContext());
                notificationManagerCompatFrom.getClass();
                return notificationManagerCompatFrom;
            case 20:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new BrazeExternalSyntheticLambda206((transferSessionPackageI) objWrite20, 5);
            case 21:
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                s1 s1Var = new s1((transferSessionPackageI) objWrite21);
                int i8 = IconCompatParcelizer + 83;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    return s1Var;
                }
                obj.hashCode();
                throw null;
            case 22:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new unpackInt2((transferSessionPackageI) objWrite22, b, objArr3 == true ? 1 : 0);
            case 23:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) objWrite23;
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite24 = getidentifiersvalidationsenabled.write().write(r8lambdax7886zsaIYvPM4CylL7YklZd7ig.class);
                objWrite24.getClass();
                return (r8lambdax7886zsaIYvPM4CylL7YklZd7ig) objWrite24;
            case 24:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                return new r8lambdazY6FrfYmpvd_923yIbo0dPcgKo((EnumColumnAdapter) objWrite25);
            case 25:
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance((Application) objWrite26);
                hmsInstanceId.getClass();
                return hmsInstanceId;
            case 26:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = (getIdentifiersValidationsEnabled) objWrite27;
                getidentifiersvalidationsenabled2.write("http://localhost/");
                Object objWrite28 = getidentifiersvalidationsenabled2.write().write(r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k.class);
                objWrite28.getClass();
                return (r8lambdaxxf_OxJQyqvagkBotvkQpFWGJ2k) objWrite28;
            case 27:
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                return new GetAppStateImpl(8, (PushServiceRepository) objWrite29);
            case 28:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new gotOptOutResponseI((Application) objWrite30);
            default:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                return new lambdasendReftagReferrer17((transferSessionPackageI) objWrite31);
        }
    }
}
