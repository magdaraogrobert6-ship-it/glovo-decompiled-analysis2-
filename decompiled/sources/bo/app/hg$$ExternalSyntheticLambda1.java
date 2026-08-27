package bo.app;

import com.braze.Braze;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import java.io.File;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ File f$0;

    public /* synthetic */ hg$$ExternalSyntheticLambda1(File file, int i) {
        this.$r8$classId = i;
        this.f$0 = file;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        File file = this.f$0;
        switch (i) {
            case 0:
                return hg.b(file);
            case 1:
                return hg.c(file);
            case 2:
                return t4.a(file);
            case 3:
                return Braze.Companion.clearSharedPreferencesData$lambda$1$0(file);
            case 4:
                return BrazeFileUtils.deleteFileOrDirectory$lambda$0(file);
            case 5:
                return BrazeFileUtils.deleteDataStoreFile$lambda$0(file);
            case 6:
                return BrazeFileUtils.deleteDataStoreFile$lambda$1(file);
            case 7:
                return BrazeFileUtils.deleteDataStoreFile$lambda$2(file);
            case 8:
                return BrazeFileUtils.deleteSharedPreferencesFile$lambda$0(file);
            case 9:
                return BrazeFileUtils.deleteSharedPreferencesFile$lambda$1(file);
            default:
                return BrazeImageUtils.getLocalBitmap$lambda$2(file);
        }
    }
}
