package o;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class r8lambdaG4tr7zFDrCfVDbKe3Qxfp5j1yo4 implements Runnable {
    final /* synthetic */ r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY write;

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.write) {
            for (r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c r8lambdatlpfyipshywk_bssf3n2g7hro2c : (Set) this.write.RatingCompat.read()) {
                if (this.write.IconCompatParcelizer(r8lambdatlpfyipshywk_bssf3n2g7hro2c.read())) {
                    arrayList.add(new r8lambdaTLpfYipSHyWk_bsSf3N2g7hRo2c(r8lambdatlpfyipshywk_bssf3n2g7hro2c));
                }
            }
        }
        this.write.RemoteActionCompatParcelizer.IconCompatParcelizer("Overdue snoozed OTGs found: [" + r8lambda5tLpxyx6nsiTnLY5GKIpCwhnz8M.RemoteActionCompatParcelizer(arrayList, ", ") + "]", new Object[0]);
        if (!arrayList.isEmpty()) {
            ((populateNotificationBuilderlambda1) this.write.MediaDescriptionCompat).read(arrayList);
        }
        this.write.IconCompatParcelizer(false);
    }

    public r8lambdaG4tr7zFDrCfVDbKe3Qxfp5j1yo4(r8lambdaHet8Jz7IcZoyFo4UnUY9jKvDVY r8lambdahet8jz7iczoyfo4unuy9jkvdvy) {
        this.write = r8lambdahet8jz7iczoyfo4unuy9jkvdvy;
    }
}
