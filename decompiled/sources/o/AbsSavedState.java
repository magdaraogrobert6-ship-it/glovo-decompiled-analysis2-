package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.roadrunner.delivery.accept.domain.AcceptDeliveriesUseCaseImpl;
import com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl;
import com.roadrunner.delivery.state.StateDataStoreImpl;
import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl;
import com.roadrunner.notifications.PushWithAppStateDataStoreImpl;
import com.roadrunner.rider.state.provider.database.StatusDatabase;
import com.roadrunner.rider.state.provider.database.dao.ShiftInfoDao;
import com.roadrunner.rider.state.provider.domain.GetShiftInfoImpl;
import dagger.Lazy;
import okio.Path$Companion;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class AbsSavedState implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final mergeJsonObjects serializer;
    public final /* synthetic */ int write;

    public AbsSavedState(mergeJsonObjects mergejsonobjects, setPresentationView setpresentationview, int i) {
        this.write = i;
        setpresentationview.getClass();
        if (i == 8) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = setpresentationview;
            return;
        }
        if (i == 12) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = setpresentationview;
            return;
        }
        if (i == 14) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = setpresentationview;
            return;
        }
        switch (i) {
            case 17:
                this.serializer = mergejsonobjects;
                this.IconCompatParcelizer = setpresentationview;
                break;
            case 18:
                this.serializer = mergejsonobjects;
                this.IconCompatParcelizer = setpresentationview;
                break;
            case 19:
                this.serializer = mergejsonobjects;
                this.IconCompatParcelizer = setpresentationview;
                break;
            case 20:
                this.serializer = mergejsonobjects;
                this.IconCompatParcelizer = setpresentationview;
                break;
            default:
                this.serializer = mergejsonobjects;
                this.IconCompatParcelizer = setpresentationview;
                break;
        }
    }

    public AbsSavedState(setPresentationView setpresentationview, mergeJsonObjects mergejsonobjects) {
        this.write = 0;
        setpresentationview.getClass();
        this.IconCompatParcelizer = setpresentationview;
        this.serializer = mergejsonobjects;
    }

    public AbsSavedState(insertBasedOnParentOffset insertbasedonparentoffset, mergeJsonObjects mergejsonobjects) {
        this.write = 2;
        insertbasedonparentoffset.getClass();
        this.IconCompatParcelizer = insertbasedonparentoffset;
        this.serializer = mergejsonobjects;
    }

    public AbsSavedState(hasNestedScrollingParent hasnestedscrollingparent, mergeJsonObjects mergejsonobjects) {
        this.write = 10;
        hasnestedscrollingparent.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.serializer = mergejsonobjects;
    }

    public AbsSavedState(transactionWithResultsuspendImpl transactionwithresultsuspendimpl, mergeJsonObjects mergejsonobjects) {
        this.write = 13;
        transactionwithresultsuspendimpl.getClass();
        this.IconCompatParcelizer = transactionwithresultsuspendimpl;
        this.serializer = mergejsonobjects;
    }

    public AbsSavedState(mergeJsonObjects mergejsonobjects, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.write = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i == 6) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 9) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 11) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 22) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else if (i == 15) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else if (i != 16) {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else {
            this.serializer = mergejsonobjects;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        }
    }

    public AbsSavedState(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, mergeJsonObjects mergejsonobjects) {
        this.write = 1;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = mergejsonobjects;
    }

    public AbsSavedState(mergeJsonObjects mergejsonobjects, hasNestedScrollingParent hasnestedscrollingparent) {
        this.write = 7;
        hasnestedscrollingparent.getClass();
        this.serializer = mergejsonobjects;
        this.IconCompatParcelizer = hasnestedscrollingparent;
    }

    public AbsSavedState(AndroidUiFrameClock androidUiFrameClock, mergeJsonObjects mergejsonobjects, getContentDataType getcontentdatatype) {
        this.write = 21;
        getcontentdatatype.getClass();
        this.serializer = mergejsonobjects;
        this.IconCompatParcelizer = getcontentdatatype;
    }

    public AbsSavedState(setVerticalBias setverticalbias, mergeJsonObjects mergejsonobjects) {
        this.write = 5;
        setverticalbias.getClass();
        this.IconCompatParcelizer = setverticalbias;
        this.serializer = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.serializer;
        switch (i3) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite.getClass();
                Object objWrite2 = mergejsonobjects.write();
                objWrite2.getClass();
                return new CorruptionException((isOpenInternalroom_runtime) objWrite, (setFillViewport) objWrite2);
            case 1:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                Object objWrite4 = mergejsonobjects.write();
                objWrite4.getClass();
                return new copyO0kMr_c((transferSessionPackageI) objWrite3, (getSoftWrap) objWrite4);
            case 2:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite5.getClass();
                Object objWrite6 = mergejsonobjects.write();
                objWrite6.getClass();
                return new AcceptDeliveriesUseCaseImpl((ClickableSaverlambda1) objWrite5, (getLastDescentDiff) objWrite6);
            case 3:
                Object objWrite7 = mergejsonobjects.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new ShadowSpan((PlaceholderSpan_androidKt) objWrite7, (isOpenInternalroom_runtime) objWrite8);
            case 4:
                Object objWrite9 = mergejsonobjects.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new StateV3AnalyticsProviderImpl((accessrequireViewFactoryHolder) objWrite9, (getContentViewGroupParentLayout) objWrite10);
            case 5:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite11.getClass();
                Object objWrite12 = mergejsonobjects.write();
                objWrite12.getClass();
                return new copy8_81llAdefault((copy8_81llA) objWrite11, (performViewCreated) objWrite12);
            case 6:
                Object objWrite13 = mergejsonobjects.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new accessgetParagraphcp((requestPermissions) objWrite13, (getContentViewGroupParentLayout) objWrite14);
            case 7:
                Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer.getClass();
                ImageHeaderParserImageType imageHeaderParserImageType = new ImageHeaderParserImageType();
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                return new getAnimationObject(lazySerializer, imageHeaderParserImageType, (Application) objWrite15);
            case 8:
                Object objWrite16 = mergejsonobjects.write();
                objWrite16.getClass();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite17.getClass();
                return new StateDataStoreImpl((accesstoComposeOffset) objWrite16, (isOpenInternalroom_runtime) objWrite17);
            case 9:
                Object objWrite18 = mergejsonobjects.write();
                objWrite18.getClass();
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite19.getClass();
                return new setPaddingLeft((SharedPreferences) objWrite18, (setTransactionSuccessful) objWrite19, new getLayerId());
            case 10:
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                Object objWrite21 = mergejsonobjects.write();
                objWrite21.getClass();
                return new setMinWidth((Application) objWrite20, (setVerticalStyle) objWrite21);
            case 11:
                Object objWrite22 = mergejsonobjects.write();
                objWrite22.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite23.getClass();
                return new unregisterForContextMenu((setNextTransition) objWrite22, (setTransactionSuccessful) objWrite23);
            case 12:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer2.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new getQueryExecutor(lazySerializer2, (isOpenInternalroom_runtime) objWrite24);
            case 13:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite25.getClass();
                Object objWrite26 = mergejsonobjects.write();
                objWrite26.getClass();
                return new CanRequestLocationUpdatesImpl((GetOfflineLocationRequestStateImpl) objWrite25, (WorkManagerImpl) objWrite26);
            case 14:
                Object objWrite27 = mergejsonobjects.write();
                objWrite27.getClass();
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                return new PushWithAppStateDataStoreImpl((performCustomExitMxy_nc0) objWrite27, (isOpenInternalroom_runtime) objWrite28);
            case 15:
                Object objWrite29 = mergejsonobjects.write();
                objWrite29.getClass();
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new canTrackThirdPartySharingI((bootstrapLifecycleI) objWrite29, (setVerticalStyle) objWrite30);
            case 16:
                Object objWrite31 = mergejsonobjects.write();
                objWrite31.getClass();
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                return new OkHttpCall$1((decode) objWrite31, (transferSessionPackageI) objWrite32);
            case 17:
                Object objWrite33 = mergejsonobjects.write();
                objWrite33.getClass();
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite34.getClass();
                return new ActivityPackage((isInBackground) objWrite33, (isOpenInternalroom_runtime) objWrite34);
            case 18:
                Lazy lazySerializer3 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer3.getClass();
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite35.getClass();
                return new asBinder(lazySerializer3, (isOpenInternalroom_runtime) objWrite35);
            case 19:
                Lazy lazySerializer4 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer4.getClass();
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite36.getClass();
                return new IActivityHandler(lazySerializer4, (isOpenInternalroom_runtime) objWrite36);
            case 20:
                Lazy lazySerializer5 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer5.getClass();
                Path$Companion path$Companion = new Path$Companion();
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite37.getClass();
                return new GetShiftInfoImpl(lazySerializer5, path$Companion, (isOpenInternalroom_runtime) objWrite37);
            case 21:
                Object objWrite38 = mergejsonobjects.write();
                objWrite38.getClass();
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite39.getClass();
                ShiftInfoDao shiftInfoDaoWrite = ((StatusDatabase) objWrite38).write();
                setNativeShader.RemoteActionCompatParcelizer(shiftInfoDaoWrite, "Cannot return null from a non-@Nullable @Provides method");
                return shiftInfoDaoWrite;
            default:
                Object objWrite40 = mergejsonobjects.write();
                objWrite40.getClass();
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite41.getClass();
                requestBannersRefreshlambda121 requestbannersrefreshlambda121 = new requestBannersRefreshlambda121((requestContentCardsRefreshlambda1) objWrite40, (resetTransientState) objWrite41);
                int i4 = read + 125;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return requestbannersrefreshlambda121;
        }
    }
}
