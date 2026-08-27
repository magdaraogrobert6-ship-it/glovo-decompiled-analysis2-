package o;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambda_m4s0FIhwe07JEl0zgGGZ2HhHI extends r8lambdaaOjYqRSbYrUCR7tPNPLFxtpJgc0 {
    final /* synthetic */ r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs serializer;

    @Override // o.r8lambdaaOjYqRSbYrUCR7tPNPLFxtpJgc0
    public final void IconCompatParcelizer(getLongitudeannotations<invokeSuspendlambda0> getlongitudeannotations) {
        r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs = this.serializer;
        if (r8lambda7d1kk4szdotwipf3xpnkewsbnbs.write()) {
            r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs.c(r8lambda7d1kk4szdotwipf3xpnkewsbnbs);
        }
    }

    @Override // o.r8lambdaaOjYqRSbYrUCR7tPNPLFxtpJgc0
    public final void read(getLongitudeannotations<invokeSuspendlambda0> getlongitudeannotations) {
        r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs = this.serializer;
        if (r8lambda7d1kk4szdotwipf3xpnkewsbnbs.write()) {
            return;
        }
        r8lambda7d1kk4szdotwipf3xpnkewsbnbs.RemoteActionCompatParcelizer();
        r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs.RemoteActionCompatParcelizer(r8lambda7d1kk4szdotwipf3xpnkewsbnbs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambda_m4s0FIhwe07JEl0zgGGZ2HhHI(r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1) {
        super(readandroid_sdk_base_releaseVar, "StepCountTracker", populatenotificationbuilderlambda1);
        this.serializer = r8lambda7d1kk4szdotwipf3xpnkewsbnbs;
    }
}
