package o;

import android.app.Application;
import com.roadrunner.rider.state.provider.database.StatusDatabase;
import com.roadrunner.rider.state.provider.database.dao.WorkOpportunityDao;
import com.roadrunner.rider.state.shift.GetCourierShiftInfoImpl;
import com.roadrunner.user.properties.data.UserPropertiesRepository;
import io.socket.parser.IOParser$Decoder;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class BrazeExternalSyntheticLambda102 implements getColorIntegerOrNulllambda0 {
    private static int read = 0;
    private static int write = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ serializer;

    public BrazeExternalSyntheticLambda102(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i != 5) {
            this.IconCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else {
            this.IconCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
            this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        }
    }

    public BrazeExternalSyntheticLambda102(r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, transactionWithResultsuspendImpl transactionwithresultsuspendimpl) {
        this.RemoteActionCompatParcelizer = 7;
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        transactionwithresultsuspendimpl.getClass();
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        this.serializer = transactionwithresultsuspendimpl;
    }

    public BrazeExternalSyntheticLambda102(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.RemoteActionCompatParcelizer = 8;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = dataModule_ProvideSchedulerFactory;
    }

    public BrazeExternalSyntheticLambda102(r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.RemoteActionCompatParcelizer = 6;
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.IconCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
        this.serializer = convertstringjsonarraytolistlambda0;
    }

    public BrazeExternalSyntheticLambda102(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview) {
        this.RemoteActionCompatParcelizer = 9;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = setpresentationview;
    }

    public BrazeExternalSyntheticLambda102(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.RemoteActionCompatParcelizer = 0;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public BrazeExternalSyntheticLambda102(AndroidUiFrameClock androidUiFrameClock, hasNestedScrollingParent hasnestedscrollingparent, getContentDataType getcontentdatatype) {
        this.RemoteActionCompatParcelizer = 1;
        hasnestedscrollingparent.getClass();
        getcontentdatatype.getClass();
        this.IconCompatParcelizer = hasnestedscrollingparent;
        this.serializer = getcontentdatatype;
    }

    public BrazeExternalSyntheticLambda102(AndroidUiFrameClock androidUiFrameClock, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, getContentDataType getcontentdatatype, int i) {
        this.RemoteActionCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        getcontentdatatype.getClass();
        if (i != 3) {
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.serializer = getcontentdatatype;
        } else {
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.serializer = getcontentdatatype;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = read + 105;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.IconCompatParcelizer;
        switch (i4) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                subscribeToNoMatchingTriggerForEvent subscribetonomatchingtriggerforevent = new subscribeToNoMatchingTriggerForEvent((decode) objWrite, (transferSessionPackageI) objWrite2);
                int i5 = write + 7;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return subscribetonomatchingtriggerforevent;
            case 1:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer((Application) objWrite3, StatusDatabase.class, "rr_status.db");
                cliprectmtrddeRemoteActionCompatParcelizer.read();
                return (StatusDatabase) cliprectmtrddeRemoteActionCompatParcelizer.write();
            case 2:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                Logger loggerSerializer = ((StatusDatabase) objWrite5).serializer();
                setNativeShader.RemoteActionCompatParcelizer(loggerSerializer, "Cannot return null from a non-@Nullable @Provides method");
                return loggerSerializer;
            case 3:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                WorkOpportunityDao workOpportunityDao = ((StatusDatabase) objWrite7).read();
                setNativeShader.RemoteActionCompatParcelizer(workOpportunityDao, "Cannot return null from a non-@Nullable @Provides method");
                return workOpportunityDao;
            case 4:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new getAdRevenueParameters((transferSessionPackageI) objWrite10, (verifyAndTrackPlayStorePurchaseI) objWrite9);
            case 5:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite11.getClass();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new readFileContent((transferSessionPackageI) objWrite12, (verifyAndTrackPlayStorePurchaseI) objWrite11);
            case 6:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new getSamsungCloudDevGoogleAdId((GetCourierShiftInfoImpl) objWrite13, (subscribeToBannersUpdateslambda2) objWrite14);
            case 7:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new IOParser$Decoder((r8lambda0tFkXN0c4UQsJxVxyejUo1BomY) objWrite15, (checkSdkClickResponse) objWrite16);
            case 8:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new subscribeToChangeUserEventslambda2((UserPropertiesRepository) objWrite17, (getAllSemanticsNodesToMap) objWrite18);
            default:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite19.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new r8lambda52ctlEduwkfz3l8UwwWKdau6wdM((transferSessionPackageI) objWrite19, (Clock) objWrite20);
        }
    }
}
