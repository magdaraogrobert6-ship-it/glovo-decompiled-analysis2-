package o;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaclfS62tZC2OFo9lifeMcE91mC8 implements Runnable {
    public final /* synthetic */ r8lambday78CcsNUxER22a2WVqifR2BmBdo IconCompatParcelizer;
    public final /* synthetic */ Status read;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaclfS62tZC2OFo9lifeMcE91mC8(r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo, Status status, int i) {
        this.write = i;
        this.IconCompatParcelizer = r8lambday78ccsnuxer22a2wvqifr2bmbdo;
        this.read = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.write != 0) {
            Iterator it = new ArrayList(this.IconCompatParcelizer.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss).iterator();
            while (it.hasNext()) {
                ((accesssetCustomHandlercp) it.next()).serializer(this.read);
            }
            return;
        }
        setResourcePackageNamelambda0 setresourcepackagenamelambda0 = this.IconCompatParcelizer.ComponentActivity.IconCompatParcelizer;
        setResourcePackageNamelambda0 setresourcepackagenamelambda1 = setResourcePackageNamelambda0.SHUTDOWN;
        if (setresourcepackagenamelambda0 == setresourcepackagenamelambda1) {
            return;
        }
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = this.IconCompatParcelizer;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = this.read;
        getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda2 = r8lambday78ccsnuxer22a2wvqifr2bmbdo.IconCompatParcelizer;
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo2 = this.IconCompatParcelizer;
        getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda3 = r8lambday78ccsnuxer22a2wvqifr2bmbdo2.ParcelableVolumeInfo;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo2.IconCompatParcelizer = null;
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo3 = this.IconCompatParcelizer;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo3.ParcelableVolumeInfo = null;
        r8lambday78CcsNUxER22a2WVqifR2BmBdo.IconCompatParcelizer(r8lambday78ccsnuxer22a2wvqifr2bmbdo3, setresourcepackagenamelambda1);
        this.IconCompatParcelizer.write.RemoteActionCompatParcelizer();
        if (this.IconCompatParcelizer.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.isEmpty()) {
            r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo4 = this.IconCompatParcelizer;
            r8lambday78ccsnuxer22a2wvqifr2bmbdo4.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.execute(new copyZipEntryToOutputStream(r8lambday78ccsnuxer22a2wvqifr2bmbdo4, 0));
        }
        r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo5 = this.IconCompatParcelizer;
        r8lambday78ccsnuxer22a2wvqifr2bmbdo5.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
        FormBody.Builder builder = r8lambday78ccsnuxer22a2wvqifr2bmbdo5.PlaybackStateCompatCustomAction;
        if (builder != null) {
            builder.RatingCompat();
            r8lambday78ccsnuxer22a2wvqifr2bmbdo5.PlaybackStateCompatCustomAction = null;
            r8lambday78ccsnuxer22a2wvqifr2bmbdo5.PlaybackStateCompat = null;
        }
        FormBody.Builder builder2 = this.IconCompatParcelizer.ResultReceiver;
        if (builder2 != null) {
            builder2.RatingCompat();
            this.IconCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer(this.read);
            r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo6 = this.IconCompatParcelizer;
            r8lambday78ccsnuxer22a2wvqifr2bmbdo6.ResultReceiver = null;
            r8lambday78ccsnuxer22a2wvqifr2bmbdo6.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        }
        if (getlocalhtmlurlfromremoteurllambda2 != null) {
            getlocalhtmlurlfromremoteurllambda2.RemoteActionCompatParcelizer(this.read);
        }
        if (getlocalhtmlurlfromremoteurllambda3 != null) {
            getlocalhtmlurlfromremoteurllambda3.RemoteActionCompatParcelizer(this.read);
        }
    }
}
