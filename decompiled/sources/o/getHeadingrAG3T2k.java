package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.state.data.RiderStateRepositoryImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getHeadingrAG3T2k {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final getContentViewGroupParentLayout IconCompatParcelizer;
    public final requestPermissions RemoteActionCompatParcelizer;
    public final MutableStateFlow read = StateFlowKt.read(new getWordBreakjp8hJ3c(null, "start_up"));
    public final accessgetParagraphcp serializer;

    public getHeadingrAG3T2k(requestPermissions requestpermissions, accessgetParagraphcp accessgetparagraphcp, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RemoteActionCompatParcelizer = requestpermissions;
        this.serializer = accessgetparagraphcp;
        this.IconCompatParcelizer = getcontentviewgroupparentlayout;
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new RiderStateRepositoryImpl.AnonymousClass1(this, null, 9), 3);
    }

    public static getStrictnessusljTpc RemoteActionCompatParcelizer(HyphensCompanion hyphensCompanion) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 83;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (hyphensCompanion instanceof accessgetSimplecp) {
            return new getSimplerAG3T2kannotations(((accessgetSimplecp) hyphensCompanion).IconCompatParcelizer);
        }
        if (hyphensCompanion instanceof isSpecified3fSNIE) {
            return new LineBreakCompanion(((isSpecified3fSNIE) hyphensCompanion).serializer());
        }
        if (hyphensCompanion instanceof getStrategyfcGXIks) {
            return new getHeadingrAG3T2kannotations(((getStrategyfcGXIks) hyphensCompanion).read());
        }
        if (hyphensCompanion instanceof LineBreak) {
            return new getParagraphrAG3T2kannotations(((LineBreak) hyphensCompanion).read(), null);
        }
        if (hyphensCompanion instanceof getNonevmbZdU8) {
            return new getHeadingrAG3T2kannotations(((getNonevmbZdU8) hyphensCompanion).serializer(), true);
        }
        if (hyphensCompanion instanceof accessgetHeadingcp) {
            return new getSimplerAG3T2kannotations("Reroute only works during active navigation.");
        }
        if (hyphensCompanion instanceof HyphensKt) {
            HyphensKt hyphensKt = (HyphensKt) hyphensCompanion;
            return new getUnspecifiedrAG3T2kannotations(hyphensKt.read(), hyphensKt.write());
        }
        if (hyphensCompanion instanceof copygijOMQMdefault) {
            copygijOMQMdefault copygijomqmdefault = (copygijOMQMdefault) hyphensCompanion;
            getWordBreakjp8hJ3c getwordbreakjp8hj3c = new getWordBreakjp8hJ3c(copygijomqmdefault.IconCompatParcelizer(), copygijomqmdefault.serializer());
            int i4 = MediaMetadataCompat + 1;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return getwordbreakjp8hj3c;
            }
            throw null;
        }
        Object[] objArr = {hyphensCompanion, takeOrElseKk21toE.IconCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return new getWordBreakjp8hJ3c(null, "Clearing highlights");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return null;
    }
}
