package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.pinvalidation.logger.PinValidationEventLoggerImpl;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.delivery.stacked.delivery.list.domain.ObserveStackedDeliveryList;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.rider.safety.report.domain.MapSafetyReportResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class getScrollRange implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public getScrollRange(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i == 3) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 4) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 7) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 8) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 10) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 25) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 26) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 28) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 29) {
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        switch (i) {
            case 13:
                this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 14:
                this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 15:
                this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            default:
                switch (i) {
                    case 21:
                        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 22:
                        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 23:
                        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    default:
                        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                }
                break;
        }
    }

    public getScrollRange(SingleProcessDataStore singleProcessDataStore) {
        this.RemoteActionCompatParcelizer = 9;
        singleProcessDataStore.getClass();
        this.serializer = singleProcessDataStore;
    }

    public getScrollRange(hasNestedScrollingParent hasnestedscrollingparent, int i) {
        this.RemoteActionCompatParcelizer = i;
        hasnestedscrollingparent.getClass();
        switch (i) {
            case 16:
                this.serializer = hasnestedscrollingparent;
                break;
            case 17:
                this.serializer = hasnestedscrollingparent;
                break;
            case 18:
                this.serializer = hasnestedscrollingparent;
                break;
            default:
                this.serializer = hasnestedscrollingparent;
                break;
        }
    }

    public getScrollRange(q0 q0Var) {
        this.RemoteActionCompatParcelizer = 6;
        q0Var.getClass();
        this.serializer = q0Var;
    }

    public getScrollRange(r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.RemoteActionCompatParcelizer = 11;
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.serializer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    public getScrollRange(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.RemoteActionCompatParcelizer = 20;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.serializer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public getScrollRange(setPresentationView setpresentationview, int i) {
        this.RemoteActionCompatParcelizer = i;
        setpresentationview.getClass();
        if (i != 5) {
            this.serializer = setpresentationview;
        } else {
            this.serializer = setpresentationview;
        }
    }

    public getScrollRange(r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, byte b) {
        this.RemoteActionCompatParcelizer = 12;
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.serializer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    public getScrollRange(sendAccessibilityEvent sendaccessibilityevent, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.RemoteActionCompatParcelizer = 24;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.serializer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public getScrollRange(r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.RemoteActionCompatParcelizer = 19;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.serializer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public getScrollRange(getActionViewIntentlambda0 getactionviewintentlambda0, hasNestedScrollingParent hasnestedscrollingparent) {
        this.RemoteActionCompatParcelizer = 27;
        hasnestedscrollingparent.getClass();
        this.serializer = hasnestedscrollingparent;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        int i3 = 5;
        byte b = 0;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                return new getTopFadingEdgeStrength((decode) objWrite);
            case 1:
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new logWarningui_tooling((Application) objWrite2);
            case 2:
                com.huawei.wisesecurity.ucs_credential.g0 g0Var = (com.huawei.wisesecurity.ucs_credential.g0) CompositionDataRecordImpl.serializer.write();
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                MapSafetyReportResponse mapSafetyReportResponse = new MapSafetyReportResponse(g0Var, (isOpenInternalroom_runtime) objWrite3);
                int i4 = write + 23;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return mapSafetyReportResponse;
            case 3:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new filterTree((decode) objWrite4);
            case 4:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                return new BrazeExternalSyntheticLambda206((transferSessionPackageI) objWrite5, false, (byte) 0);
            case 5:
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new isUnspecifiedjoFl9I((isOpenInternalroom_runtime) objWrite6);
            case 6:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite7.getClass();
                return new setUdmandroid_sdk_base_release((EnumColumnAdapter) objWrite7, 1);
            case 7:
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new PinValidationEventLoggerImpl((decode) objWrite8);
            case 8:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new checkArithmeticvU0ePk((transferSessionPackageI) objWrite9);
            case 9:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new SendTestPushUseCase((CachedDeliveryRepository) objWrite10);
            case 10:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                return new accessgetMiddleEllipsiscp((accessrequireViewFactoryHolder) objWrite11, 2);
            case 11:
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new getMToDpValues((ObserveStackedDeliveryList) objWrite12);
            case 12:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite13.getClass();
                return new setFirstHorizontalBias((setFirstVerticalBias) objWrite13, new getActionViewIntentlambda0());
            case 13:
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new setHorizontalStyle((transferSessionPackageI) objWrite14);
            case 14:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                return new setLastVerticalBias((transferSessionPackageI) objWrite15);
            case 15:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                removeSingleSubscriptionlambda101 removesinglesubscriptionlambda101 = new removeSingleSubscriptionlambda101((decode) objWrite16, b);
                int i6 = write + 47;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 47 / 0;
                }
                return removesinglesubscriptionlambda101;
            case 16:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                SharedPreferences sharedPreferences = ((Application) objWrite17).getSharedPreferences("DESIGN_SYSTEM_MODE_PREF_NAME", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 17:
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new setPaddingRight();
            case 18:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new setVerticalGap();
            case 19:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) objWrite20;
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite21 = getidentifiersvalidationsenabled.write().write(setOptimizationLevel.class);
                objWrite21.getClass();
                MediaSessionCompatQueueItem.serializer(objWrite21);
                throw null;
            case 20:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new SaveHeatmapUrlImpl(i3, (GetUserDataUseCaseImpl) objWrite22);
            case 21:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new shouldSkipDump((setTransactionSuccessful) objWrite23);
            case 22:
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new CoreComponentFactory((decode) objWrite24);
            case 23:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                return new buildGdprPackage((setLastHorizontalStyle) objWrite25);
            case 24:
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = (getIdentifiersValidationsEnabled) objWrite26;
                getidentifiersvalidationsenabled2.write("http://localhost/");
                Object objWrite27 = getidentifiersvalidationsenabled2.write().write(deleteUnlistedNotificationChannels.class);
                objWrite27.getClass();
                return (deleteUnlistedNotificationChannels) objWrite27;
            case 25:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                return new shouldSkipDump((setTransactionSuccessful) objWrite28);
            case 26:
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                return new SendTestPushUseCase((CorruptionException) objWrite29);
            case 27:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                setFillViewport setfillviewport = new setFillViewport((performCustomExitMxy_nc0) readData.serializer.getValue((Application) objWrite30, readData.write[0]));
                int i8 = IconCompatParcelizer + 33;
                write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 33 / 0;
                }
                return setfillviewport;
            case 28:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                return new BrazeExternalSyntheticLambda28((setTransactionSuccessful) objWrite31, 5);
            default:
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                return new performViewCreated((transferSessionPackageI) objWrite32);
        }
    }
}
